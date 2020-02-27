package com.shopee.product.model;

import java.math.BigDecimal;
import java.util.Date;

public class ShopeeItems {
    private Long recordId;

    private Long itemId;

    private Long catId;

    private Long shopId;

    private String shopLocation;

    private String name;

    private String image;

    private String imageUrl;

    private BigDecimal priceMin;

    private BigDecimal priceMax;

    private BigDecimal price;

    private BigDecimal priceBeforeDiscount;

    private BigDecimal priceMinBeforeDiscount;

    private BigDecimal priceMaxBeforeDiscount;

    private String wholesaleTierList;

    private Integer discount;

    private Integer likedCount;

    private Integer sold;

    private Integer historicalSold;

    private Integer stock;

    private String brand;

    private Double itemRatingStar;

    private String currency;

    private String itemDetailUrl;

    private Integer version;

    private Date uploadTime;

    private Date createTime;

    private Date updateTime;

    public Long getRecordId() {
        return recordId;
    }

    public void setRecordId(Long recordId) {
        this.recordId = recordId;
    }

    public Long getItemId() {
        return itemId;
    }

    public void setItemId(Long itemId) {
        this.itemId = itemId;
    }

    public Long getCatId() {
        return catId;
    }

    public void setCatId(Long catId) {
        this.catId = catId;
    }

    public Long getShopId() {
        return shopId;
    }

    public void setShopId(Long shopId) {
        this.shopId = shopId;
    }

    public String getShopLocation() {
        return shopLocation;
    }

    public void setShopLocation(String shopLocation) {
        this.shopLocation = shopLocation == null ? null : shopLocation.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image == null ? null : image.trim();
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl == null ? null : imageUrl.trim();
    }

    public BigDecimal getPriceMin() {
        return priceMin;
    }

    public void setPriceMin(BigDecimal priceMin) {
        this.priceMin = priceMin;
    }

    public BigDecimal getPriceMax() {
        return priceMax;
    }

    public void setPriceMax(BigDecimal priceMax) {
        this.priceMax = priceMax;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public BigDecimal getPriceBeforeDiscount() {
        return priceBeforeDiscount;
    }

    public void setPriceBeforeDiscount(BigDecimal priceBeforeDiscount) {
        this.priceBeforeDiscount = priceBeforeDiscount;
    }

    public BigDecimal getPriceMinBeforeDiscount() {
        return priceMinBeforeDiscount;
    }

    public void setPriceMinBeforeDiscount(BigDecimal priceMinBeforeDiscount) {
        this.priceMinBeforeDiscount = priceMinBeforeDiscount;
    }

    public BigDecimal getPriceMaxBeforeDiscount() {
        return priceMaxBeforeDiscount;
    }

    public void setPriceMaxBeforeDiscount(BigDecimal priceMaxBeforeDiscount) {
        this.priceMaxBeforeDiscount = priceMaxBeforeDiscount;
    }

    public String getWholesaleTierList() {
        return wholesaleTierList;
    }

    public void setWholesaleTierList(String wholesaleTierList) {
        this.wholesaleTierList = wholesaleTierList == null ? null : wholesaleTierList.trim();
    }

    public Integer getDiscount() {
        return discount;
    }

    public void setDiscount(Integer discount) {
        this.discount = discount;
    }

    public Integer getLikedCount() {
        return likedCount;
    }

    public void setLikedCount(Integer likedCount) {
        this.likedCount = likedCount;
    }

    public Integer getSold() {
        return sold;
    }

    public void setSold(Integer sold) {
        this.sold = sold;
    }

    public Integer getHistoricalSold() {
        return historicalSold;
    }

    public void setHistoricalSold(Integer historicalSold) {
        this.historicalSold = historicalSold;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand == null ? null : brand.trim();
    }

    public Double getItemRatingStar() {
        return itemRatingStar;
    }

    public void setItemRatingStar(Double itemRatingStar) {
        this.itemRatingStar = itemRatingStar;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency == null ? null : currency.trim();
    }

    public String getItemDetailUrl() {
        return itemDetailUrl;
    }

    public void setItemDetailUrl(String itemDetailUrl) {
        this.itemDetailUrl = itemDetailUrl == null ? null : itemDetailUrl.trim();
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public Date getUploadTime() {
        return uploadTime;
    }

    public void setUploadTime(Date uploadTime) {
        this.uploadTime = uploadTime;
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
}