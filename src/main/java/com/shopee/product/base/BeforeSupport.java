package com.shopee.product.base;

/**
 * Created by PaperCut on 2018/1/26.
 */
public interface BeforeSupport<T> {
    boolean beforeInsert(T entity);
    boolean beforeUpdate(T entity);
}
