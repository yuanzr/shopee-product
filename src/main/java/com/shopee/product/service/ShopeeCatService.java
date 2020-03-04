package com.shopee.product.service;

import com.shopee.product.model.ShopeeCat;
import com.shopee.product.model.ShopeeCatStat;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ShopeeCatService {

    void  insertList (List<ShopeeCat> list );

    void  insertList ();


    /**
     * 分页列表查询
     * @param entity       查询条件
     * @param pageNum      页码
     * @param pageSize     记录
     * @return
     */
    List<ShopeeCat> list(ShopeeCat entity,Integer pageNum, Integer pageSize);

    /**
     * 根据条件查询列表数据
     * @param catId
     * @return
     */
    List<ShopeeCat>  selectParentCategoryId(Long catId);

    /**
     * 获取父类下的所有子类目
     * @param parentId  父类ID
     * @param regionNo  国家好
     * @return
     */
    List<ShopeeCat> getAllChildInParent(Long parentId, Integer regionNo);
}
