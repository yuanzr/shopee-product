package com.shopee.product.base;

import java.util.List;

/**
 * Created by PaperCut on 2018/1/25.
 */
public abstract class AbstractCoreService<T, E> implements CoreService<T, E>, BeforeSupport<T>, AfterSupport<T>{
    @Override
    public int save(T entity) {
        return save(entity, getId(entity) != null);
    }

    @Override
    public int save(T entity, boolean isEdit) {
        return save(entity, isEdit, true);
    }

    @Override
    public int save(T entity, boolean isEdit, boolean isSelective) {
        return doSave(entity, isEdit, isSelective);
    }

    @Override
    public T get(Object id) {
        return getMapper().selectByPrimaryKey(id);
    }

    @Override
    public int delete(Object id) {
        return doDelete(id);
    }

    @Override
    public int delete(Object[] ids) {
        int count = 0;
        for(Object id : ids)
            count += delete(id);
        return count;
    }

    @Override
    public List<T> findByExample(E example) {
        return getMapper().selectByExample(example);
    }

    @Override
    public int countByExample(E example) {
        return getMapper().countByExample(example);
    }

    @Override
    public int updateByExample(T record, E example) {
        return getMapper().updateByExample(record, example);
    }

    protected int doSave(T entity, boolean isEdit, boolean isSelective)
    {
        int result = 0;
        if(isEdit) {
            result = doUpdate(entity, isSelective);
        } else {
            result = doInsert(entity, isSelective);
        }
        return result;
    }

    protected int doUpdate(T entity, boolean isSelective)
    {
        int result = 0;
        // 前置更新
        if(this.beforeUpdate(entity)) {
            if (isSelective) {
                result = getMapper().updateByPrimaryKeySelective(entity);
            } else {
                result = getMapper().updateByPrimaryKey(entity);
            }
            // 后置更新
            this.afterUpdate(entity);
        }
        return result;
    }

    protected int doInsert(T entity, boolean isSelective) {
        int result = 0;
        // 前置新增
        if(this.beforeInsert(entity)) {
            if (isSelective) {
                result = getMapper().insertSelective(entity);
            } else {
                result = getMapper().insert(entity);
            }
            // 后置新增
            this.afterInsert(entity);
        }
        return result;
    }

    @Override
    public void afterInsert(T entity) { }

    @Override
    public void afterUpdate(T entity) { }

    @Override
    public boolean beforeInsert(T entity) { return true; }

    @Override
    public boolean beforeUpdate(T entity) { return true; }

    protected int doDelete(Object id)
    {
        return getMapper().deleteByPrimaryKey(id);
    }

    protected abstract BaseMapper<T, E> getMapper();
}
