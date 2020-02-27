package com.shopee.product.mapper;

import com.shopee.product.model.ShopeeItems;
import com.shopee.product.model.ShopeeItemsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ShopeeItemsMapper {
    int countByExample(ShopeeItemsExample example);

    int deleteByExample(ShopeeItemsExample example);

    int deleteByPrimaryKey(Long recordId);

    int insert(ShopeeItems record);

    int insertSelective(ShopeeItems record);

    List<ShopeeItems> selectByExample(ShopeeItemsExample example);

    ShopeeItems selectByPrimaryKey(Long recordId);

    int updateByExampleSelective(@Param("record") ShopeeItems record, @Param("example") ShopeeItemsExample example);

    int updateByExample(@Param("record") ShopeeItems record, @Param("example") ShopeeItemsExample example);

    int updateByPrimaryKeySelective(ShopeeItems record);

    int updateByPrimaryKey(ShopeeItems record);
}