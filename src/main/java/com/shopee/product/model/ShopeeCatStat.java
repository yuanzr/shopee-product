package com.shopee.product.model;

import java.util.List;

public class ShopeeCatStat {
    private Long recordId;

    private Long parentCategoryId;

    private Long catId;

    private Integer totalProCount;

    private Integer totalSoldSum;

    private Integer homeSoldAvg;

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

    public Integer getHomeSoldAvg() {
        return homeSoldAvg;
    }

    public void setHomeSoldAvg(Integer homeSoldAvg) {
        this.homeSoldAvg = homeSoldAvg;
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