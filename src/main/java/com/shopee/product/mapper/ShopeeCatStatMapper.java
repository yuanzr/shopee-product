package com.shopee.product.mapper;

import com.shopee.product.model.ShopeeCatStat;
import com.shopee.product.model.ShopeeCatStatExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ShopeeCatStatMapper {
    int countByExample(ShopeeCatStatExample example);

    int deleteByExample(ShopeeCatStatExample example);

    int deleteByPrimaryKey(Long recordId);

    int insert(ShopeeCatStat record);

    int insertSelective(ShopeeCatStat record);

    List<ShopeeCatStat> selectByExample(ShopeeCatStatExample example);

    ShopeeCatStat selectByPrimaryKey(Long recordId);

    int updateByExampleSelective(@Param("record") ShopeeCatStat record, @Param("example") ShopeeCatStatExample example);

    int updateByExample(@Param("record") ShopeeCatStat record, @Param("example") ShopeeCatStatExample example);

    int updateByPrimaryKeySelective(ShopeeCatStat record);

    int updateByPrimaryKey(ShopeeCatStat record);
}