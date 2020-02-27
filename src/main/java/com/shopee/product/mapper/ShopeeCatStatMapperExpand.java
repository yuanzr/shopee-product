package com.shopee.product.mapper;

import com.shopee.product.model.ShopeeCatStat;
import com.shopee.product.model.ShopeeCatStatExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ShopeeCatStatMapperExpand {
    /**
     * 批量插入商品信息
     * @param list
     */
    void  insertList (List<ShopeeCatStat> list );
}