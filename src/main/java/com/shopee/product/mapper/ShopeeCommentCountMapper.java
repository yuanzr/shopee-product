package com.shopee.product.mapper;

import com.shopee.product.model.ShopeeCommentCount;
import com.shopee.product.model.ShopeeCommentCountExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ShopeeCommentCountMapper {
    int countByExample(ShopeeCommentCountExample example);

    int deleteByExample(ShopeeCommentCountExample example);

    int insert(ShopeeCommentCount record);

    int insertSelective(ShopeeCommentCount record);

    List<ShopeeCommentCount> selectByExample(ShopeeCommentCountExample example);

    int updateByExampleSelective(@Param("record") ShopeeCommentCount record, @Param("example") ShopeeCommentCountExample example);

    int updateByExample(@Param("record") ShopeeCommentCount record, @Param("example") ShopeeCommentCountExample example);
}