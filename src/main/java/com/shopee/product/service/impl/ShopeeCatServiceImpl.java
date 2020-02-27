package com.shopee.product.service.impl;

import com.shopee.product.mapper.ShopeeCatMapper;
import com.shopee.product.model.ShopeeCat;
import com.shopee.product.model.ShopeeCatExample;
import com.shopee.product.model.ShopeeCatExample.Criteria;
import com.shopee.product.model.ShopeeCatStat;
import com.shopee.product.param.ShopeeCatParam;
import com.shopee.product.service.JsonReadService;
import com.shopee.product.service.ShopeeCatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class ShopeeCatServiceImpl  implements ShopeeCatService {

    @Autowired
    private ShopeeCatMapper shopeeCatMapper;

    @Autowired
    private JsonReadService jsonReadService;

    @Override
    public void insertList(List<ShopeeCat> list) {
        int limitSize = 500;
        if (list.size()>limitSize){
            int insertRound = list.size() / limitSize;
            for (int i = 1; i <= insertRound+1; i++) {
                Integer size = list.size();
                Integer skip = (i - 1) * limitSize;
                if (skip >= size) {
                    continue;
                }
                if (skip + limitSize > size) {
                    List<ShopeeCat> recordList = list.subList(skip, list.size());
                    shopeeCatMapper.insertList(recordList);
                    continue;
                }
                List<ShopeeCat> recordList = list.subList(skip, skip+limitSize);
                shopeeCatMapper.insertList(recordList);
            }
        }else {
            shopeeCatMapper.insertList(list);
        }
    }

    @Override
    public void insertList() {
        insertList( getAllCat());
    }

    @Override
    public List<ShopeeCat> list(ShopeeCat entity, Integer pageNum, Integer pageSize) {
        return null;
    }



    @Override
    public List<ShopeeCat> selectParentCategoryId(Long catId) {
        ShopeeCatExample example = new ShopeeCatExample();
        Criteria criteria = example.createCriteria();
        if (catId!=null){
            criteria.andParentCategoryIdEqualTo(catId);
        }
        return shopeeCatMapper.selectByExample(example);
    }


    public List<ShopeeCat> getAllCat(){
        ShopeeCatParam param = jsonReadService.getJsonObj();
        List<ShopeeCatParam.DataBean> data = param.getData();
        String version = param.getVersion();

        List<ShopeeCat> firstCatList  = new ArrayList<>();//一级分类
        List<ShopeeCat> secondCatList = new ArrayList<>();//二级分类
        List<ShopeeCat> thirdCatList  = new ArrayList<>();//三级分类
        List<ShopeeCat> totalCatList  = new ArrayList<>();//总分类

        Date now = new Date();
        for (ShopeeCatParam.DataBean dataBean : data) {
            //一级类目
            ShopeeCatParam.DataBean.MainBean main = dataBean.getMain();
            ShopeeCat firstCat = new ShopeeCat();
            firstCat.setCatId(main.getCatid());
            firstCat.setParentCategoryId(main.getParent_category());
            firstCat.setDisplayName(main.getDisplay_name());
            firstCat.setSortWeight(main.getSort_weight());
            firstCat.setImgName(main.getImage());
            firstCat.setUpdateTime(now);
            firstCat.setCatUrl("https://shopee.co.th/"+main.getDisplay_name()+"-cat."+main.getCatid());//规则:https://shopee.co.th/一级分类名称-cat.一级分类ID
            firstCat.setImgUrl("https://cf.shopee.co.th/file/"+main.getImage()+"_tn");//规则:https://cf.shopee.co.th/file/0091cb7e7d970b10dcf233d2e4faf9b9_tn
            firstCat.setVersion(version);
            if (StringUtils.isEmpty(main.getName())){
//                String translate = HttpUtils.translate(main.getDisplay_name());
//                firstCat.setEnName(translate);
            }else {
                firstCat.setEnName(main.getName());
            }
            firstCatList.add(firstCat);

            List<ShopeeCatParam.DataBean.SubBean> subList = dataBean.getSub();
            for (ShopeeCatParam.DataBean.SubBean secondBean : subList) {
                //二级类目
                ShopeeCat secondCat = new ShopeeCat();
                secondCat.setCatId(secondBean.getCatid());
                secondCat.setParentCategoryId(secondBean.getParent_category());
                secondCat.setDisplayName(secondBean.getDisplay_name());
                secondCat.setSortWeight(secondBean.getSort_weight());
                secondCat.setImgName(secondBean.getImage());
                secondCat.setUpdateTime(now);
                secondCat.setCatUrl("https://shopee.co.th/"+secondBean.getDisplay_name()+"-cat."+main.getCatid()+"."+secondBean.getCatid());//规则:https://shopee.co.th/二级分类名称-cat.一级分类ID.二级分类ID
                secondCat.setImgUrl("https://cf.shopee.co.th/file/"+secondBean.getImage()+"_tn");//规则:https://cf.shopee.co.th/file/0091cb7e7d970b10dcf233d2e4faf9b9_tn
                secondCat.setVersion(version);
                if (StringUtils.isEmpty(main.getName())){
//                    String translate = HttpUtils.translate(secondBean.getDisplay_name());
//                    secondCat.setEnName(translate);
                }else {
                    secondCat.setEnName(secondBean.getName());
                }
                secondCatList.add(secondCat);
                List<ShopeeCatParam.DataBean.SubBean.SubSubBean> subSubList = secondBean.getSub_sub();
                for (ShopeeCatParam.DataBean.SubBean.SubSubBean thirdBean : subSubList) {
                    //三级类目
                    ShopeeCat thirdCat = new ShopeeCat();
                    thirdCat.setCatId(thirdBean.getCatid());
                    thirdCat.setParentCategoryId(secondBean.getCatid());
                    thirdCat.setDisplayName(thirdBean.getDisplay_name());
                    thirdCat.setSortWeight(0.0);
                    thirdCat.setImgName(thirdBean.getImage());
                    thirdCat.setUpdateTime(now);
                    thirdCat.setCatUrl("https://shopee.co.th/"+thirdBean.getDisplay_name()+"-cat."+main.getCatid()+"."+secondBean.getCatid()+"."+thirdBean.getCatid());//规则:https://shopee.co.th/三级级分类名称-cat.一级分类ID
                    thirdCat.setImgUrl("https://cf.shopee.co.th/file/"+thirdBean.getImage()+"_tn");//规则:https://cf.shopee.co.th/file/0091cb7e7d970b10dcf233d2e4faf9b9_tn
                    thirdCat.setVersion(version);
//                    String translate = HttpUtils.translate(thirdBean.getDisplay_name());
//                    thirdCat.setEnName(translate);
                    thirdCatList.add(thirdCat);
                }
            }
        }
        totalCatList.addAll(firstCatList);
        totalCatList.addAll(secondCatList);
        totalCatList.addAll(thirdCatList);
        return totalCatList;
    }





}
