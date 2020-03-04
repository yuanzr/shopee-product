package com.shopee.product.mapper;

import com.shopee.product.model.ShopeeCat;
import com.shopee.product.model.ShopeeCatExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ShopeeCatMapperExpand {

    /**
     * 批量插入分类
     * @param list
     */
    void  insertList(List<ShopeeCat> list);
}