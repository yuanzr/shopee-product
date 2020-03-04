package com.shopee.product.service;

public interface ShopeeCatStatService {

    void genCatStatData(Long catId);

    void importJsonData(Long parentId,Integer regionNo);
}
