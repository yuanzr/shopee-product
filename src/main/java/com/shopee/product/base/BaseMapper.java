package com.shopee.product.base;

import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by PaperCut on 2018/1/26.
 */
public interface BaseMapper<T, E> {
    T get(Object id);
    int insert(T entity);
    int insertSelective(T entity);
    int updateByPrimaryKey(T entity);
    int updateByPrimaryKeySelective(T entity);
    int deleteByPrimaryKey(Object id);
    int deleteByExample(E example);

    T selectByPrimaryKey(Object id);
    //    List<T> selectAll();
    List<T> selectByExample(E example);
    //    int count();
    int countByExample(E example);
    int updateByExampleSelective(@Param("record") T record, @Param("example") E example);
    int updateByExample(@Param("record") T record, @Param("example") E example);
}
