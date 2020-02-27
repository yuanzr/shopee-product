package com.shopee.product.base;

/**
 * Created by PaperCut on 2018/1/26.
 */
public interface AfterSupport<T> {
    void afterInsert(T entity);
    void afterUpdate(T entity);
}
