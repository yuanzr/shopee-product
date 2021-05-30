package com.shopee.product.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.shopee.product.mapper.ShopeeCommentCountMapper;
import com.shopee.product.model.ShopeeCommentCount;
import com.shopee.product.param.ShopeeProCommentParam;
import com.shopee.product.param.ShopeeProCommentParam.DataBean.RatingsBean;
import com.shopee.product.param.ShopeeProCommentParam.DataBean.RatingsBean.ProductItemsBean;
import com.shopee.product.service.JsonReadService;
import com.shopee.product.service.ShopeeCommentCountService;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @ClassName: ShopeeCommentCountServiceImpl
 * @Description: TODO
 * @Author: YuanZhenRong
 * @Version: 1.0.0
 * @CreateDate: 2020/3/16/17:56
 */
@Service
public class ShopeeCommentCountServiceImpl implements ShopeeCommentCountService {
    @Autowired
    private JsonReadService jsonReadService;
    @Autowired
    private ShopeeCommentCountMapper mapper;

    @Override
    public void insert() {
        List<RatingsBean> listAll = new ArrayList<>();
        HashMap<String, Integer> mapCount = new HashMap<>();
        for (int i = 1; i < 26; i++) {
            String jsonText = JsonReadService.getDatafromFile("shopee-items-sales-"+i);
            ShopeeProCommentParam param = JSONObject.parseObject(jsonText, ShopeeProCommentParam.class);
            List<RatingsBean> ratings = param.getData().getRatings();
            listAll.addAll(ratings);
        }
        for (RatingsBean ratingsBean : listAll) {
            ProductItemsBean itemsBean = ratingsBean.getProduct_items().get(0);
            String model_name = itemsBean.getModel_name();
            mapCount.merge(model_name, 1, (a, b) -> a + b);
        }
        System.out.println(mapCount);

        Set<String> keys = mapCount.keySet();

        for (String key : keys) {
            ShopeeCommentCount comment = new ShopeeCommentCount();
            comment.setColor(key);
            comment.setSize("L");
            comment.setAmount(mapCount.get(key));
            comment.setItemId(9);
            mapper.insert(comment);
        }
    }
}
