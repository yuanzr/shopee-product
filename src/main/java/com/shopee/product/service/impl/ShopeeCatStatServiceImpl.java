package com.shopee.product.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.shopee.product.mapper.ShopeeCatStatMapper;
import com.shopee.product.mapper.ShopeeCatStatMapperExpand;
import com.shopee.product.model.ShopeeCat;
import com.shopee.product.model.ShopeeCatStat;
import com.shopee.product.param.ShopeeItemsParam;
import com.shopee.product.param.ShopeeItemsParam.ItemsBean;
import com.shopee.product.service.JsonReadService;
import com.shopee.product.service.ShopeeCatService;
import com.shopee.product.service.ShopeeCatStatService;
import com.shopee.product.utils.HttpShopeeUtils;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

import com.sun.org.apache.bcel.internal.generic.NEW;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

/**
 * @ClassName: ShopeeCatStatServiceImpl
 * @Description: TODO
 * @Author: YuanZhenRong
 * @Version: 1.0.0
 * @CreateDate: 2020/2/27/14:34
 */
@Service
public class ShopeeCatStatServiceImpl implements ShopeeCatStatService {

    private static final Logger logger = LoggerFactory.getLogger(ShopeeCatStatServiceImpl.class);

    @Autowired
    private ShopeeCatService shopeeCatService;

    @Autowired
    private ShopeeCatStatMapper shopeeCatStatMapper;

    @Autowired
    private ShopeeCatStatMapperExpand shopeeCatStatMapperExpand;

    @Override
    public void genCatStatData(Long catId) {
        ShopeeCat shopeeCat = new ShopeeCat();
        shopeeCat.setParentCategoryId(catId);
        //1.查询出二级分类列表
        List<ShopeeCat> shopeeCatsSecond = shopeeCatService.selectParentCategoryId(catId);

        //TODO 暂时只取狗和猫类的
        shopeeCatsSecond = shopeeCatsSecond.subList(0,2);
        //2.根据二级分类列表分别查出三级分类列表
        for (ShopeeCat secondCat : shopeeCatsSecond) {
            List<ShopeeCat> shopeeCatsThrid = shopeeCatService.selectParentCategoryId(secondCat.getCatId());
            secondCat.setSubList(shopeeCatsThrid);
        }

        Date date = new Date();
        String strDateFormat = "yyyyMMddHHmmss";
        SimpleDateFormat sdf = new SimpleDateFormat(strDateFormat);
        Long version = Long.parseLong(sdf.format(date));

        //一级类目统计
        ShopeeCatStat catStatFrist = new ShopeeCatStat();
        catStatFrist.setCatId(catId);
        catStatFrist.setParentCategoryId(0L);
        catStatFrist.setVersion(version);
        //产品总数
        Long totalProCountFrist  = 0L;
        //前10页产品销量总数
        Long totalSoldSumFrist  = 0L;
        //前10页商品总数
        Long totalCountFrist = 0L;

        //二级类目统计
        ArrayList<ShopeeCatStat> catStatSecondList = new ArrayList<>();
        //二级类目
        for (ShopeeCat catSecond : shopeeCatsSecond) {
            ShopeeCatStat statSecond = new ShopeeCatStat();
            statSecond.setParentCategoryId(catId);
            statSecond.setCatId(catSecond.getCatId());
            statSecond.setVersion(version);
            //产品总数
            Long totalProCountSecond  = 0L;
            //前10页产品销量总数
            Long totalSoldSumSecond  = 0L;
            //前10页商品总数
            Long totalCountSecond = 0L;

            //二级类目对应的所有三级类目统计
            ArrayList<ShopeeCatStat> catStatThridList = new ArrayList<>();
            //三级类目
            List<ShopeeCat> subList = catSecond.getSubList();
            for (ShopeeCat catThird : subList) {
                ShopeeCatStat statThird = new ShopeeCatStat();
                statThird.setParentCategoryId(catSecond.getCatId());
                statThird.setCatId(catThird.getCatId());
                statThird.setVersion(version);

                //请求三级类目,获取前10页的商品数据列表
                List<ItemsBean> thridTotalItems = new ArrayList<>();
                for (int i = 0; i < 5; i++) {
                    try {
                        String result = HttpShopeeUtils.executeShopeeGet("", catThird.getCatId(), i);
                        ShopeeItemsParam shopeeItemParam = JSONObject.parseObject(result, ShopeeItemsParam.class);

                        //设置三级类目的商品总数
                        statThird.setTotalProCount(shopeeItemParam.getTotal_count());
                        List<ItemsBean> items = shopeeItemParam.getItems();
                        if (!CollectionUtils.isEmpty(items) && items.size() > 50) {
                            List<ItemsBean> itemsBeans = items.subList(5, 45);
                            thridTotalItems.addAll(itemsBeans);
                        } else {
                            int size1 = items.size();
                            List<ItemsBean> itemsBeans1 = items.subList(5, size1);
                            int size2 = itemsBeans1.size();
                            List<ItemsBean> itemsBeans2 = itemsBeans1.subList(0, size2 - 5);
                            thridTotalItems.addAll(itemsBeans2);
                        }
                        logger.info("=======完成三级类目ID:{}[第{}页]",catThird.getCatId(),i+1);
                        //每5S请求一次,不然会判断为刷接口恶意请求
                        Thread.sleep(10000);
                    } catch (Exception e) {
                        logger.info("请求失败:{},[第{}页]" ,catThird.getCatId(),i+1);
                        e.printStackTrace();
                    }
                }

                //统计当前三级类目的销量汇总信息
                IntSummaryStatistics collect = thridTotalItems.stream().collect(Collectors.summarizingInt(value -> value.getSold()));

                //产品总数
                totalProCountSecond += statThird.getTotalProCount();

                //前10页销量总和
                Long totalSoldSumThrid = collect.getSum();
                totalSoldSumSecond +=  totalSoldSumThrid;

                //前十页商品数量
                Long totalCountThrid   = collect.getCount();
                totalCountSecond +=  totalCountThrid;


                //计算首页平均销量:销量总和/产品总数量
                Double homeAvgSoldThird = divide(totalSoldSumThrid.doubleValue(), totalCountThrid.doubleValue());
                statThird.setTotalSoldSum(homeAvgSoldThird.intValue());

                //计算竞争比重:首页平均销量 / 此分类产品总数
                statThird.setCatCompeteWeight(divide(homeAvgSoldThird,statThird.getTotalProCount().doubleValue()));
                catStatThridList.add(statThird);
                logger.info("=======完成三级类目统计:{}",catThird.getCatId());
                statThird.setVersion(version+2);
                shopeeCatStatMapper.insert(statThird);
                statThird.setVersion(version);
            }

            //产品总数
            totalProCountFrist += totalProCountSecond;
            statSecond.setTotalProCount(totalProCountSecond.intValue());
            //首页平均销量
            totalSoldSumFrist += totalSoldSumSecond;//总销售量
            totalCountFrist   += totalCountSecond;  //总商品件数
            Double homeAvgSoldSecond = divide(totalSoldSumSecond.doubleValue(), totalCountSecond.doubleValue());
            statSecond.setTotalSoldSum(homeAvgSoldSecond.intValue());
            //竞争比重
            statSecond.setCatCompeteWeight(divide(homeAvgSoldSecond,totalProCountSecond.doubleValue()));
            statSecond.setSubList(catStatThridList);
            catStatSecondList.add(statSecond);

            logger.info("=======完成Second级类目ID:{}",statSecond.getCatId());
        }

        catStatFrist.setTotalProCount(totalProCountFrist.intValue());
        Double homeAvgSoldFrist = divide(totalSoldSumFrist.doubleValue(), totalCountFrist.doubleValue());
        catStatFrist.setTotalSoldSum(homeAvgSoldFrist.intValue());
        catStatFrist.setCatCompeteWeight(divide(homeAvgSoldFrist,totalProCountFrist.doubleValue()));
        catStatFrist.setSubList(catStatSecondList);

        ArrayList<ShopeeCatStat> catStatTotalList = new ArrayList<>();
        catStatTotalList.add(catStatFrist);
        catStatTotalList.addAll(catStatFrist.getSubList());
        for (ShopeeCatStat catStatSecond : catStatFrist.getSubList()){
            catStatTotalList.addAll(catStatSecond.getSubList());
        }
//        logger.info("=======开始插入数据",statSecond.getCatId());
//        shopeeCatStatMapperExpand.insertList(catStatTotalList);
    }


    @Override
    public void importJsonData(Long parentId,Integer regionNo){

        String strDateFormat = "yyyyMMdd";
        SimpleDateFormat sdf = new SimpleDateFormat(strDateFormat);
        Date date    = new Date();
        Long version = Long.parseLong(sdf.format(date));

        List<ShopeeCat>  allChildCatList = shopeeCatService.getAllChildInParent(parentId,regionNo);
        List<ShopeeCatStat> catStatList = new ArrayList<>();

        for (int i = 0; i < allChildCatList.size(); i++) {
            ShopeeCat cat = allChildCatList.get(i);
            List<ShopeeItemsParam.ItemsBean> catTotalItems = new ArrayList<>();
            ShopeeCatStat statCat = new ShopeeCatStat();
            statCat.setParentCategoryId(parentId);
            statCat.setCatId(cat.getCatId());
            statCat.setVersion(version);
            statCat.setRegionNo(regionNo);
            String jsonText = JsonReadService.getDatafromFile("shopee-items-sales-" + (i+1));
            ShopeeItemsParam shopeeCatParam = JSONObject.parseObject(jsonText, ShopeeItemsParam.class);
            statCat.setTotalProCount(shopeeCatParam.getTotal_count());
            List<ShopeeItemsParam.ItemsBean> items = shopeeCatParam.getItems();
            List<ItemsBean> itemsBeans = items.subList(5, 45);
            catTotalItems.addAll(itemsBeans);
//            catTotalItems.addAll(items);

            //统计当前子类目的销量汇总信息
            IntSummaryStatistics collect = catTotalItems.stream().collect(Collectors.summarizingInt(value -> value.getSold()));

            //计算首页平均销量:销量总和/产品总数量
            Double homeAvgSoldThird = collect.getAverage();
            statCat.setHomeSoldAvg(homeAvgSoldThird.intValue());

            //首页总销量
            Long totalSoldSum = collect.getSum();
            statCat.setTotalSoldSum(totalSoldSum.intValue());

            //计算竞争比重:首页平均销量 / 此分类产品总数
            statCat.setCatCompeteWeight(divide(homeAvgSoldThird,statCat.getTotalProCount().doubleValue()));
            catStatList.add(statCat);
        }

        shopeeCatStatMapperExpand.insertList(catStatList);
    }


    public double divide(Double a, Double b) {
        BigDecimal bd1 = new BigDecimal(Double.toString(a));
        BigDecimal bd2 = new BigDecimal(Double.toString(b));
        return bd1.divide(bd2, 5, BigDecimal.ROUND_HALF_UP).doubleValue();
    }

    public static void main(String[] args) {
        Date date = new Date();
        String strDateFormat = "yyyyMMddHHmmss";
        SimpleDateFormat sdf = new SimpleDateFormat(strDateFormat);
        Long version = Long.parseLong(sdf.format(date));
        System.out.println(version);
    }
}
