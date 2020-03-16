package com.shopee.product.mapper;

import com.shopee.product.model.ShopeeCat;
import com.shopee.product.model.ShopeeCatExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ShopeeCatMapper {

    int countByExample(ShopeeCatExample example);

    int deleteByExample(ShopeeCatExample example);

    int deleteByPrimaryKey(Long recordId);

    int insert(ShopeeCat record);

    int insertSelective(ShopeeCat record);

    List<ShopeeCat> selectByExample(ShopeeCatExample example);

    ShopeeCat selectByPrimaryKey(Long recordId);

    int updateByExampleSelective(@Param("record") ShopeeCat record, @Param("example") ShopeeCatExample example);

    int updateByExample(@Param("record") ShopeeCat record, @Param("example") ShopeeCatExample example);

    int updateByPrimaryKeySelective(ShopeeCat record);

    int updateByPrimaryKey(ShopeeCat record);
}