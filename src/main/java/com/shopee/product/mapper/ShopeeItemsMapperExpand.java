package com.shopee.product.mapper;

import com.shopee.product.model.ShopeeItems;

import java.util.List;

public interface ShopeeItemsMapperExpand {
    /**
     * 批量插入商品信息
     * @param list
     */
    void  insertList (List<ShopeeItems> list );
}
