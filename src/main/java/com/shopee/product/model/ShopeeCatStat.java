package com.shopee.product.model;

import java.util.List;

public class ShopeeCatStat {
    private Long recordId;

    private Long parentCategoryId;

    private Long catId;

    private Integer totalProCount;

    /**
     * 首页平均销量,暂时取三级类目的前10页
     *  = 销量总和/产品数量
     */
    private Integer totalSoldSum;
    /**
     * 竞争比重 = 首页平均销量 / 此分类产品总数
     * catCompeteWeight = totalSoldSum/totalProCount
     *
     */
    private Double catCompeteWeight;

    private Integer regionNo;

    private Long version;

    private List<ShopeeCatStat> subList;


    public Long getRecordId() {
        return recordId;
    }

    public void setRecordId(Long recordId) {
        this.recordId = recordId;
    }

    public Long getParentCategoryId() {
        return parentCategoryId;
    }

    public void setParentCategoryId(Long parentCategoryId) {
        this.parentCategoryId = parentCategoryId;
    }

    public Long getCatId() {
        return catId;
    }

    public void setCatId(Long catId) {
        this.catId = catId;
    }

    public Integer getTotalProCount() {
        return totalProCount;
    }

    public void setTotalProCount(Integer totalProCount) {
        this.totalProCount = totalProCount;
    }

    public Integer getTotalSoldSum() {
        return totalSoldSum;
    }

    public void setTotalSoldSum(Integer totalSoldSum) {
        this.totalSoldSum = totalSoldSum;
    }

    public Double getCatCompeteWeight() {
        return catCompeteWeight;
    }

    public void setCatCompeteWeight(Double catCompeteWeight) {
        this.catCompeteWeight = catCompeteWeight;
    }

    public Integer getRegionNo() {
        return regionNo;
    }

    public void setRegionNo(Integer regionNo) {
        this.regionNo = regionNo;
    }

    public Long getVersion() {
        return version;
    }

    public void setVersion(Long version) {
        this.version = version;
    }

    public List<ShopeeCatStat> getSubList() {
        return subList;
    }

    public void setSubList(List<ShopeeCatStat> subList) {
        this.subList = subList;
    }
}