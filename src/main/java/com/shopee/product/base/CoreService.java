package com.shopee.product.base;

import java.util.List;

/**
 * Created by PaperCut on 2018/1/25.
 */
public interface CoreService<T, E> {
    int save(T entity);

    int save(T entity, boolean isEdit);

    int save(T entity, boolean isEdit, boolean isSelective);

    int delete(Object id);

    int delete(Object[] ids);

    T get(Object id);


    int countByExample(E example);
    int updateByExample(T record, E example);
    List<T> findByExample(E example);

    Object getId(T entity);
}
