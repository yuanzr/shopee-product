package com.shopee.product.service;

import com.shopee.product.model.ShopeeItems;

import java.util.List;

public interface ShopeeItemsService {

    void  insertList ();


    /**
     * 分页列表查询
     * @param entity       查询条件
     * @param pageNum      页码
     * @param pageSize     记录
     * @return
     */
    List<ShopeeItems> list(ShopeeItems entity, Integer pageNum, Integer pageSize);




    void updateItemCat();


}
