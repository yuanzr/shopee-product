package com.shopee.product.model;

import java.util.Date;
import java.util.List;

public class ShopeeCat {
    private Long recordId;

    private Long catId;

    private Long parentCategoryId;

    private String displayName;

    private String enName;

    private String catUrl;

    private Double sortWeight;

    private String imgName;

    private String imgUrl;

    private String version;

    private Date createTime;

    private Date updateTime;

    private List<ShopeeCat> subList;

    public Long getRecordId() {
        return recordId;
    }

    public void setRecordId(Long recordId) {
        this.recordId = recordId;
    }

    public Long getCatId() {
        return catId;
    }

    public void setCatId(Long catId) {
        this.catId = catId;
    }

    public Long getParentCategoryId() {
        return parentCategoryId;
    }

    public void setParentCategoryId(Long parentCategoryId) {
        this.parentCategoryId = parentCategoryId;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName == null ? null : displayName.trim();
    }

    public String getEnName() {
        return enName;
    }

    public void setEnName(String enName) {
        this.enName = enName == null ? null : enName.trim();
    }

    public String getCatUrl() {
        return catUrl;
    }

    public void setCatUrl(String catUrl) {
        this.catUrl = catUrl == null ? null : catUrl.trim();
    }

    public Double getSortWeight() {
        return sortWeight;
    }

    public void setSortWeight(Double sortWeight) {
        this.sortWeight = sortWeight;
    }

    public String getImgName() {
        return imgName;
    }

    public void setImgName(String imgName) {
        this.imgName = imgName == null ? null : imgName.trim();
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl == null ? null : imgUrl.trim();
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version == null ? null : version.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public List<ShopeeCat> getSubList() {
        return subList;
    }

    public void setSubList(List<ShopeeCat> subList) {
        this.subList = subList;
    }
}