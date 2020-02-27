package com.shopee.product.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ShopeeItemsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ShopeeItemsExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andRecordIdIsNull() {
            addCriterion("record_id is null");
            return (Criteria) this;
        }

        public Criteria andRecordIdIsNotNull() {
            addCriterion("record_id is not null");
            return (Criteria) this;
        }

        public Criteria andRecordIdEqualTo(Long value) {
            addCriterion("record_id =", value, "recordId");
            return (Criteria) this;
        }

        public Criteria andRecordIdNotEqualTo(Long value) {
            addCriterion("record_id <>", value, "recordId");
            return (Criteria) this;
        }

        public Criteria andRecordIdGreaterThan(Long value) {
            addCriterion("record_id >", value, "recordId");
            return (Criteria) this;
        }

        public Criteria andRecordIdGreaterThanOrEqualTo(Long value) {
            addCriterion("record_id >=", value, "recordId");
            return (Criteria) this;
        }

        public Criteria andRecordIdLessThan(Long value) {
            addCriterion("record_id <", value, "recordId");
            return (Criteria) this;
        }

        public Criteria andRecordIdLessThanOrEqualTo(Long value) {
            addCriterion("record_id <=", value, "recordId");
            return (Criteria) this;
        }

        public Criteria andRecordIdIn(List<Long> values) {
            addCriterion("record_id in", values, "recordId");
            return (Criteria) this;
        }

        public Criteria andRecordIdNotIn(List<Long> values) {
            addCriterion("record_id not in", values, "recordId");
            return (Criteria) this;
        }

        public Criteria andRecordIdBetween(Long value1, Long value2) {
            addCriterion("record_id between", value1, value2, "recordId");
            return (Criteria) this;
        }

        public Criteria andRecordIdNotBetween(Long value1, Long value2) {
            addCriterion("record_id not between", value1, value2, "recordId");
            return (Criteria) this;
        }

        public Criteria andItemIdIsNull() {
            addCriterion("item_id is null");
            return (Criteria) this;
        }

        public Criteria andItemIdIsNotNull() {
            addCriterion("item_id is not null");
            return (Criteria) this;
        }

        public Criteria andItemIdEqualTo(Long value) {
            addCriterion("item_id =", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdNotEqualTo(Long value) {
            addCriterion("item_id <>", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdGreaterThan(Long value) {
            addCriterion("item_id >", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdGreaterThanOrEqualTo(Long value) {
            addCriterion("item_id >=", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdLessThan(Long value) {
            addCriterion("item_id <", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdLessThanOrEqualTo(Long value) {
            addCriterion("item_id <=", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdIn(List<Long> values) {
            addCriterion("item_id in", values, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdNotIn(List<Long> values) {
            addCriterion("item_id not in", values, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdBetween(Long value1, Long value2) {
            addCriterion("item_id between", value1, value2, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdNotBetween(Long value1, Long value2) {
            addCriterion("item_id not between", value1, value2, "itemId");
            return (Criteria) this;
        }

        public Criteria andCatIdIsNull() {
            addCriterion("cat_id is null");
            return (Criteria) this;
        }

        public Criteria andCatIdIsNotNull() {
            addCriterion("cat_id is not null");
            return (Criteria) this;
        }

        public Criteria andCatIdEqualTo(Long value) {
            addCriterion("cat_id =", value, "catId");
            return (Criteria) this;
        }

        public Criteria andCatIdNotEqualTo(Long value) {
            addCriterion("cat_id <>", value, "catId");
            return (Criteria) this;
        }

        public Criteria andCatIdGreaterThan(Long value) {
            addCriterion("cat_id >", value, "catId");
            return (Criteria) this;
        }

        public Criteria andCatIdGreaterThanOrEqualTo(Long value) {
            addCriterion("cat_id >=", value, "catId");
            return (Criteria) this;
        }

        public Criteria andCatIdLessThan(Long value) {
            addCriterion("cat_id <", value, "catId");
            return (Criteria) this;
        }

        public Criteria andCatIdLessThanOrEqualTo(Long value) {
            addCriterion("cat_id <=", value, "catId");
            return (Criteria) this;
        }

        public Criteria andCatIdIn(List<Long> values) {
            addCriterion("cat_id in", values, "catId");
            return (Criteria) this;
        }

        public Criteria andCatIdNotIn(List<Long> values) {
            addCriterion("cat_id not in", values, "catId");
            return (Criteria) this;
        }

        public Criteria andCatIdBetween(Long value1, Long value2) {
            addCriterion("cat_id between", value1, value2, "catId");
            return (Criteria) this;
        }

        public Criteria andCatIdNotBetween(Long value1, Long value2) {
            addCriterion("cat_id not between", value1, value2, "catId");
            return (Criteria) this;
        }

        public Criteria andShopIdIsNull() {
            addCriterion("shop_id is null");
            return (Criteria) this;
        }

        public Criteria andShopIdIsNotNull() {
            addCriterion("shop_id is not null");
            return (Criteria) this;
        }

        public Criteria andShopIdEqualTo(Long value) {
            addCriterion("shop_id =", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdNotEqualTo(Long value) {
            addCriterion("shop_id <>", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdGreaterThan(Long value) {
            addCriterion("shop_id >", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdGreaterThanOrEqualTo(Long value) {
            addCriterion("shop_id >=", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdLessThan(Long value) {
            addCriterion("shop_id <", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdLessThanOrEqualTo(Long value) {
            addCriterion("shop_id <=", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdIn(List<Long> values) {
            addCriterion("shop_id in", values, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdNotIn(List<Long> values) {
            addCriterion("shop_id not in", values, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdBetween(Long value1, Long value2) {
            addCriterion("shop_id between", value1, value2, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdNotBetween(Long value1, Long value2) {
            addCriterion("shop_id not between", value1, value2, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopLocationIsNull() {
            addCriterion("shop_location is null");
            return (Criteria) this;
        }

        public Criteria andShopLocationIsNotNull() {
            addCriterion("shop_location is not null");
            return (Criteria) this;
        }

        public Criteria andShopLocationEqualTo(String value) {
            addCriterion("shop_location =", value, "shopLocation");
            return (Criteria) this;
        }

        public Criteria andShopLocationNotEqualTo(String value) {
            addCriterion("shop_location <>", value, "shopLocation");
            return (Criteria) this;
        }

        public Criteria andShopLocationGreaterThan(String value) {
            addCriterion("shop_location >", value, "shopLocation");
            return (Criteria) this;
        }

        public Criteria andShopLocationGreaterThanOrEqualTo(String value) {
            addCriterion("shop_location >=", value, "shopLocation");
            return (Criteria) this;
        }

        public Criteria andShopLocationLessThan(String value) {
            addCriterion("shop_location <", value, "shopLocation");
            return (Criteria) this;
        }

        public Criteria andShopLocationLessThanOrEqualTo(String value) {
            addCriterion("shop_location <=", value, "shopLocation");
            return (Criteria) this;
        }

        public Criteria andShopLocationLike(String value) {
            addCriterion("shop_location like", value, "shopLocation");
            return (Criteria) this;
        }

        public Criteria andShopLocationNotLike(String value) {
            addCriterion("shop_location not like", value, "shopLocation");
            return (Criteria) this;
        }

        public Criteria andShopLocationIn(List<String> values) {
            addCriterion("shop_location in", values, "shopLocation");
            return (Criteria) this;
        }

        public Criteria andShopLocationNotIn(List<String> values) {
            addCriterion("shop_location not in", values, "shopLocation");
            return (Criteria) this;
        }

        public Criteria andShopLocationBetween(String value1, String value2) {
            addCriterion("shop_location between", value1, value2, "shopLocation");
            return (Criteria) this;
        }

        public Criteria andShopLocationNotBetween(String value1, String value2) {
            addCriterion("shop_location not between", value1, value2, "shopLocation");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andImageIsNull() {
            addCriterion("image is null");
            return (Criteria) this;
        }

        public Criteria andImageIsNotNull() {
            addCriterion("image is not null");
            return (Criteria) this;
        }

        public Criteria andImageEqualTo(String value) {
            addCriterion("image =", value, "image");
            return (Criteria) this;
        }

        public Criteria andImageNotEqualTo(String value) {
            addCriterion("image <>", value, "image");
            return (Criteria) this;
        }

        public Criteria andImageGreaterThan(String value) {
            addCriterion("image >", value, "image");
            return (Criteria) this;
        }

        public Criteria andImageGreaterThanOrEqualTo(String value) {
            addCriterion("image >=", value, "image");
            return (Criteria) this;
        }

        public Criteria andImageLessThan(String value) {
            addCriterion("image <", value, "image");
            return (Criteria) this;
        }

        public Criteria andImageLessThanOrEqualTo(String value) {
            addCriterion("image <=", value, "image");
            return (Criteria) this;
        }

        public Criteria andImageLike(String value) {
            addCriterion("image like", value, "image");
            return (Criteria) this;
        }

        public Criteria andImageNotLike(String value) {
            addCriterion("image not like", value, "image");
            return (Criteria) this;
        }

        public Criteria andImageIn(List<String> values) {
            addCriterion("image in", values, "image");
            return (Criteria) this;
        }

        public Criteria andImageNotIn(List<String> values) {
            addCriterion("image not in", values, "image");
            return (Criteria) this;
        }

        public Criteria andImageBetween(String value1, String value2) {
            addCriterion("image between", value1, value2, "image");
            return (Criteria) this;
        }

        public Criteria andImageNotBetween(String value1, String value2) {
            addCriterion("image not between", value1, value2, "image");
            return (Criteria) this;
        }

        public Criteria andImageUrlIsNull() {
            addCriterion("image_url is null");
            return (Criteria) this;
        }

        public Criteria andImageUrlIsNotNull() {
            addCriterion("image_url is not null");
            return (Criteria) this;
        }

        public Criteria andImageUrlEqualTo(String value) {
            addCriterion("image_url =", value, "imageUrl");
            return (Criteria) this;
        }

        public Criteria andImageUrlNotEqualTo(String value) {
            addCriterion("image_url <>", value, "imageUrl");
            return (Criteria) this;
        }

        public Criteria andImageUrlGreaterThan(String value) {
            addCriterion("image_url >", value, "imageUrl");
            return (Criteria) this;
        }

        public Criteria andImageUrlGreaterThanOrEqualTo(String value) {
            addCriterion("image_url >=", value, "imageUrl");
            return (Criteria) this;
        }

        public Criteria andImageUrlLessThan(String value) {
            addCriterion("image_url <", value, "imageUrl");
            return (Criteria) this;
        }

        public Criteria andImageUrlLessThanOrEqualTo(String value) {
            addCriterion("image_url <=", value, "imageUrl");
            return (Criteria) this;
        }

        public Criteria andImageUrlLike(String value) {
            addCriterion("image_url like", value, "imageUrl");
            return (Criteria) this;
        }

        public Criteria andImageUrlNotLike(String value) {
            addCriterion("image_url not like", value, "imageUrl");
            return (Criteria) this;
        }

        public Criteria andImageUrlIn(List<String> values) {
            addCriterion("image_url in", values, "imageUrl");
            return (Criteria) this;
        }

        public Criteria andImageUrlNotIn(List<String> values) {
            addCriterion("image_url not in", values, "imageUrl");
            return (Criteria) this;
        }

        public Criteria andImageUrlBetween(String value1, String value2) {
            addCriterion("image_url between", value1, value2, "imageUrl");
            return (Criteria) this;
        }

        public Criteria andImageUrlNotBetween(String value1, String value2) {
            addCriterion("image_url not between", value1, value2, "imageUrl");
            return (Criteria) this;
        }

        public Criteria andPriceMinIsNull() {
            addCriterion("price_min is null");
            return (Criteria) this;
        }

        public Criteria andPriceMinIsNotNull() {
            addCriterion("price_min is not null");
            return (Criteria) this;
        }

        public Criteria andPriceMinEqualTo(BigDecimal value) {
            addCriterion("price_min =", value, "priceMin");
            return (Criteria) this;
        }

        public Criteria andPriceMinNotEqualTo(BigDecimal value) {
            addCriterion("price_min <>", value, "priceMin");
            return (Criteria) this;
        }

        public Criteria andPriceMinGreaterThan(BigDecimal value) {
            addCriterion("price_min >", value, "priceMin");
            return (Criteria) this;
        }

        public Criteria andPriceMinGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("price_min >=", value, "priceMin");
            return (Criteria) this;
        }

        public Criteria andPriceMinLessThan(BigDecimal value) {
            addCriterion("price_min <", value, "priceMin");
            return (Criteria) this;
        }

        public Criteria andPriceMinLessThanOrEqualTo(BigDecimal value) {
            addCriterion("price_min <=", value, "priceMin");
            return (Criteria) this;
        }

        public Criteria andPriceMinIn(List<BigDecimal> values) {
            addCriterion("price_min in", values, "priceMin");
            return (Criteria) this;
        }

        public Criteria andPriceMinNotIn(List<BigDecimal> values) {
            addCriterion("price_min not in", values, "priceMin");
            return (Criteria) this;
        }

        public Criteria andPriceMinBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("price_min between", value1, value2, "priceMin");
            return (Criteria) this;
        }

        public Criteria andPriceMinNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("price_min not between", value1, value2, "priceMin");
            return (Criteria) this;
        }

        public Criteria andPriceMaxIsNull() {
            addCriterion("price_max is null");
            return (Criteria) this;
        }

        public Criteria andPriceMaxIsNotNull() {
            addCriterion("price_max is not null");
            return (Criteria) this;
        }

        public Criteria andPriceMaxEqualTo(BigDecimal value) {
            addCriterion("price_max =", value, "priceMax");
            return (Criteria) this;
        }

        public Criteria andPriceMaxNotEqualTo(BigDecimal value) {
            addCriterion("price_max <>", value, "priceMax");
            return (Criteria) this;
        }

        public Criteria andPriceMaxGreaterThan(BigDecimal value) {
            addCriterion("price_max >", value, "priceMax");
            return (Criteria) this;
        }

        public Criteria andPriceMaxGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("price_max >=", value, "priceMax");
            return (Criteria) this;
        }

        public Criteria andPriceMaxLessThan(BigDecimal value) {
            addCriterion("price_max <", value, "priceMax");
            return (Criteria) this;
        }

        public Criteria andPriceMaxLessThanOrEqualTo(BigDecimal value) {
            addCriterion("price_max <=", value, "priceMax");
            return (Criteria) this;
        }

        public Criteria andPriceMaxIn(List<BigDecimal> values) {
            addCriterion("price_max in", values, "priceMax");
            return (Criteria) this;
        }

        public Criteria andPriceMaxNotIn(List<BigDecimal> values) {
            addCriterion("price_max not in", values, "priceMax");
            return (Criteria) this;
        }

        public Criteria andPriceMaxBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("price_max between", value1, value2, "priceMax");
            return (Criteria) this;
        }

        public Criteria andPriceMaxNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("price_max not between", value1, value2, "priceMax");
            return (Criteria) this;
        }

        public Criteria andPriceIsNull() {
            addCriterion("price is null");
            return (Criteria) this;
        }

        public Criteria andPriceIsNotNull() {
            addCriterion("price is not null");
            return (Criteria) this;
        }

        public Criteria andPriceEqualTo(BigDecimal value) {
            addCriterion("price =", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotEqualTo(BigDecimal value) {
            addCriterion("price <>", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThan(BigDecimal value) {
            addCriterion("price >", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("price >=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThan(BigDecimal value) {
            addCriterion("price <", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("price <=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceIn(List<BigDecimal> values) {
            addCriterion("price in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotIn(List<BigDecimal> values) {
            addCriterion("price not in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("price between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("price not between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andPriceBeforeDiscountIsNull() {
            addCriterion("price_before_discount is null");
            return (Criteria) this;
        }

        public Criteria andPriceBeforeDiscountIsNotNull() {
            addCriterion("price_before_discount is not null");
            return (Criteria) this;
        }

        public Criteria andPriceBeforeDiscountEqualTo(BigDecimal value) {
            addCriterion("price_before_discount =", value, "priceBeforeDiscount");
            return (Criteria) this;
        }

        public Criteria andPriceBeforeDiscountNotEqualTo(BigDecimal value) {
            addCriterion("price_before_discount <>", value, "priceBeforeDiscount");
            return (Criteria) this;
        }

        public Criteria andPriceBeforeDiscountGreaterThan(BigDecimal value) {
            addCriterion("price_before_discount >", value, "priceBeforeDiscount");
            return (Criteria) this;
        }

        public Criteria andPriceBeforeDiscountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("price_before_discount >=", value, "priceBeforeDiscount");
            return (Criteria) this;
        }

        public Criteria andPriceBeforeDiscountLessThan(BigDecimal value) {
            addCriterion("price_before_discount <", value, "priceBeforeDiscount");
            return (Criteria) this;
        }

        public Criteria andPriceBeforeDiscountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("price_before_discount <=", value, "priceBeforeDiscount");
            return (Criteria) this;
        }

        public Criteria andPriceBeforeDiscountIn(List<BigDecimal> values) {
            addCriterion("price_before_discount in", values, "priceBeforeDiscount");
            return (Criteria) this;
        }

        public Criteria andPriceBeforeDiscountNotIn(List<BigDecimal> values) {
            addCriterion("price_before_discount not in", values, "priceBeforeDiscount");
            return (Criteria) this;
        }

        public Criteria andPriceBeforeDiscountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("price_before_discount between", value1, value2, "priceBeforeDiscount");
            return (Criteria) this;
        }

        public Criteria andPriceBeforeDiscountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("price_before_discount not between", value1, value2, "priceBeforeDiscount");
            return (Criteria) this;
        }

        public Criteria andPriceMinBeforeDiscountIsNull() {
            addCriterion("price_min_before_discount is null");
            return (Criteria) this;
        }

        public Criteria andPriceMinBeforeDiscountIsNotNull() {
            addCriterion("price_min_before_discount is not null");
            return (Criteria) this;
        }

        public Criteria andPriceMinBeforeDiscountEqualTo(BigDecimal value) {
            addCriterion("price_min_before_discount =", value, "priceMinBeforeDiscount");
            return (Criteria) this;
        }

        public Criteria andPriceMinBeforeDiscountNotEqualTo(BigDecimal value) {
            addCriterion("price_min_before_discount <>", value, "priceMinBeforeDiscount");
            return (Criteria) this;
        }

        public Criteria andPriceMinBeforeDiscountGreaterThan(BigDecimal value) {
            addCriterion("price_min_before_discount >", value, "priceMinBeforeDiscount");
            return (Criteria) this;
        }

        public Criteria andPriceMinBeforeDiscountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("price_min_before_discount >=", value, "priceMinBeforeDiscount");
            return (Criteria) this;
        }

        public Criteria andPriceMinBeforeDiscountLessThan(BigDecimal value) {
            addCriterion("price_min_before_discount <", value, "priceMinBeforeDiscount");
            return (Criteria) this;
        }

        public Criteria andPriceMinBeforeDiscountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("price_min_before_discount <=", value, "priceMinBeforeDiscount");
            return (Criteria) this;
        }

        public Criteria andPriceMinBeforeDiscountIn(List<BigDecimal> values) {
            addCriterion("price_min_before_discount in", values, "priceMinBeforeDiscount");
            return (Criteria) this;
        }

        public Criteria andPriceMinBeforeDiscountNotIn(List<BigDecimal> values) {
            addCriterion("price_min_before_discount not in", values, "priceMinBeforeDiscount");
            return (Criteria) this;
        }

        public Criteria andPriceMinBeforeDiscountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("price_min_before_discount between", value1, value2, "priceMinBeforeDiscount");
            return (Criteria) this;
        }

        public Criteria andPriceMinBeforeDiscountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("price_min_before_discount not between", value1, value2, "priceMinBeforeDiscount");
            return (Criteria) this;
        }

        public Criteria andPriceMaxBeforeDiscountIsNull() {
            addCriterion("price_max_before_discount is null");
            return (Criteria) this;
        }

        public Criteria andPriceMaxBeforeDiscountIsNotNull() {
            addCriterion("price_max_before_discount is not null");
            return (Criteria) this;
        }

        public Criteria andPriceMaxBeforeDiscountEqualTo(BigDecimal value) {
            addCriterion("price_max_before_discount =", value, "priceMaxBeforeDiscount");
            return (Criteria) this;
        }

        public Criteria andPriceMaxBeforeDiscountNotEqualTo(BigDecimal value) {
            addCriterion("price_max_before_discount <>", value, "priceMaxBeforeDiscount");
            return (Criteria) this;
        }

        public Criteria andPriceMaxBeforeDiscountGreaterThan(BigDecimal value) {
            addCriterion("price_max_before_discount >", value, "priceMaxBeforeDiscount");
            return (Criteria) this;
        }

        public Criteria andPriceMaxBeforeDiscountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("price_max_before_discount >=", value, "priceMaxBeforeDiscount");
            return (Criteria) this;
        }

        public Criteria andPriceMaxBeforeDiscountLessThan(BigDecimal value) {
            addCriterion("price_max_before_discount <", value, "priceMaxBeforeDiscount");
            return (Criteria) this;
        }

        public Criteria andPriceMaxBeforeDiscountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("price_max_before_discount <=", value, "priceMaxBeforeDiscount");
            return (Criteria) this;
        }

        public Criteria andPriceMaxBeforeDiscountIn(List<BigDecimal> values) {
            addCriterion("price_max_before_discount in", values, "priceMaxBeforeDiscount");
            return (Criteria) this;
        }

        public Criteria andPriceMaxBeforeDiscountNotIn(List<BigDecimal> values) {
            addCriterion("price_max_before_discount not in", values, "priceMaxBeforeDiscount");
            return (Criteria) this;
        }

        public Criteria andPriceMaxBeforeDiscountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("price_max_before_discount between", value1, value2, "priceMaxBeforeDiscount");
            return (Criteria) this;
        }

        public Criteria andPriceMaxBeforeDiscountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("price_max_before_discount not between", value1, value2, "priceMaxBeforeDiscount");
            return (Criteria) this;
        }

        public Criteria andWholesaleTierListIsNull() {
            addCriterion("wholesale_tier_list is null");
            return (Criteria) this;
        }

        public Criteria andWholesaleTierListIsNotNull() {
            addCriterion("wholesale_tier_list is not null");
            return (Criteria) this;
        }

        public Criteria andWholesaleTierListEqualTo(String value) {
            addCriterion("wholesale_tier_list =", value, "wholesaleTierList");
            return (Criteria) this;
        }

        public Criteria andWholesaleTierListNotEqualTo(String value) {
            addCriterion("wholesale_tier_list <>", value, "wholesaleTierList");
            return (Criteria) this;
        }

        public Criteria andWholesaleTierListGreaterThan(String value) {
            addCriterion("wholesale_tier_list >", value, "wholesaleTierList");
            return (Criteria) this;
        }

        public Criteria andWholesaleTierListGreaterThanOrEqualTo(String value) {
            addCriterion("wholesale_tier_list >=", value, "wholesaleTierList");
            return (Criteria) this;
        }

        public Criteria andWholesaleTierListLessThan(String value) {
            addCriterion("wholesale_tier_list <", value, "wholesaleTierList");
            return (Criteria) this;
        }

        public Criteria andWholesaleTierListLessThanOrEqualTo(String value) {
            addCriterion("wholesale_tier_list <=", value, "wholesaleTierList");
            return (Criteria) this;
        }

        public Criteria andWholesaleTierListLike(String value) {
            addCriterion("wholesale_tier_list like", value, "wholesaleTierList");
            return (Criteria) this;
        }

        public Criteria andWholesaleTierListNotLike(String value) {
            addCriterion("wholesale_tier_list not like", value, "wholesaleTierList");
            return (Criteria) this;
        }

        public Criteria andWholesaleTierListIn(List<String> values) {
            addCriterion("wholesale_tier_list in", values, "wholesaleTierList");
            return (Criteria) this;
        }

        public Criteria andWholesaleTierListNotIn(List<String> values) {
            addCriterion("wholesale_tier_list not in", values, "wholesaleTierList");
            return (Criteria) this;
        }

        public Criteria andWholesaleTierListBetween(String value1, String value2) {
            addCriterion("wholesale_tier_list between", value1, value2, "wholesaleTierList");
            return (Criteria) this;
        }

        public Criteria andWholesaleTierListNotBetween(String value1, String value2) {
            addCriterion("wholesale_tier_list not between", value1, value2, "wholesaleTierList");
            return (Criteria) this;
        }

        public Criteria andDiscountIsNull() {
            addCriterion("discount is null");
            return (Criteria) this;
        }

        public Criteria andDiscountIsNotNull() {
            addCriterion("discount is not null");
            return (Criteria) this;
        }

        public Criteria andDiscountEqualTo(Integer value) {
            addCriterion("discount =", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountNotEqualTo(Integer value) {
            addCriterion("discount <>", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountGreaterThan(Integer value) {
            addCriterion("discount >", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountGreaterThanOrEqualTo(Integer value) {
            addCriterion("discount >=", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountLessThan(Integer value) {
            addCriterion("discount <", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountLessThanOrEqualTo(Integer value) {
            addCriterion("discount <=", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountIn(List<Integer> values) {
            addCriterion("discount in", values, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountNotIn(List<Integer> values) {
            addCriterion("discount not in", values, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountBetween(Integer value1, Integer value2) {
            addCriterion("discount between", value1, value2, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountNotBetween(Integer value1, Integer value2) {
            addCriterion("discount not between", value1, value2, "discount");
            return (Criteria) this;
        }

        public Criteria andLikedCountIsNull() {
            addCriterion("liked_count is null");
            return (Criteria) this;
        }

        public Criteria andLikedCountIsNotNull() {
            addCriterion("liked_count is not null");
            return (Criteria) this;
        }

        public Criteria andLikedCountEqualTo(Integer value) {
            addCriterion("liked_count =", value, "likedCount");
            return (Criteria) this;
        }

        public Criteria andLikedCountNotEqualTo(Integer value) {
            addCriterion("liked_count <>", value, "likedCount");
            return (Criteria) this;
        }

        public Criteria andLikedCountGreaterThan(Integer value) {
            addCriterion("liked_count >", value, "likedCount");
            return (Criteria) this;
        }

        public Criteria andLikedCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("liked_count >=", value, "likedCount");
            return (Criteria) this;
        }

        public Criteria andLikedCountLessThan(Integer value) {
            addCriterion("liked_count <", value, "likedCount");
            return (Criteria) this;
        }

        public Criteria andLikedCountLessThanOrEqualTo(Integer value) {
            addCriterion("liked_count <=", value, "likedCount");
            return (Criteria) this;
        }

        public Criteria andLikedCountIn(List<Integer> values) {
            addCriterion("liked_count in", values, "likedCount");
            return (Criteria) this;
        }

        public Criteria andLikedCountNotIn(List<Integer> values) {
            addCriterion("liked_count not in", values, "likedCount");
            return (Criteria) this;
        }

        public Criteria andLikedCountBetween(Integer value1, Integer value2) {
            addCriterion("liked_count between", value1, value2, "likedCount");
            return (Criteria) this;
        }

        public Criteria andLikedCountNotBetween(Integer value1, Integer value2) {
            addCriterion("liked_count not between", value1, value2, "likedCount");
            return (Criteria) this;
        }

        public Criteria andSoldIsNull() {
            addCriterion("sold is null");
            return (Criteria) this;
        }

        public Criteria andSoldIsNotNull() {
            addCriterion("sold is not null");
            return (Criteria) this;
        }

        public Criteria andSoldEqualTo(Integer value) {
            addCriterion("sold =", value, "sold");
            return (Criteria) this;
        }

        public Criteria andSoldNotEqualTo(Integer value) {
            addCriterion("sold <>", value, "sold");
            return (Criteria) this;
        }

        public Criteria andSoldGreaterThan(Integer value) {
            addCriterion("sold >", value, "sold");
            return (Criteria) this;
        }

        public Criteria andSoldGreaterThanOrEqualTo(Integer value) {
            addCriterion("sold >=", value, "sold");
            return (Criteria) this;
        }

        public Criteria andSoldLessThan(Integer value) {
            addCriterion("sold <", value, "sold");
            return (Criteria) this;
        }

        public Criteria andSoldLessThanOrEqualTo(Integer value) {
            addCriterion("sold <=", value, "sold");
            return (Criteria) this;
        }

        public Criteria andSoldIn(List<Integer> values) {
            addCriterion("sold in", values, "sold");
            return (Criteria) this;
        }

        public Criteria andSoldNotIn(List<Integer> values) {
            addCriterion("sold not in", values, "sold");
            return (Criteria) this;
        }

        public Criteria andSoldBetween(Integer value1, Integer value2) {
            addCriterion("sold between", value1, value2, "sold");
            return (Criteria) this;
        }

        public Criteria andSoldNotBetween(Integer value1, Integer value2) {
            addCriterion("sold not between", value1, value2, "sold");
            return (Criteria) this;
        }

        public Criteria andHistoricalSoldIsNull() {
            addCriterion("historical_sold is null");
            return (Criteria) this;
        }

        public Criteria andHistoricalSoldIsNotNull() {
            addCriterion("historical_sold is not null");
            return (Criteria) this;
        }

        public Criteria andHistoricalSoldEqualTo(Integer value) {
            addCriterion("historical_sold =", value, "historicalSold");
            return (Criteria) this;
        }

        public Criteria andHistoricalSoldNotEqualTo(Integer value) {
            addCriterion("historical_sold <>", value, "historicalSold");
            return (Criteria) this;
        }

        public Criteria andHistoricalSoldGreaterThan(Integer value) {
            addCriterion("historical_sold >", value, "historicalSold");
            return (Criteria) this;
        }

        public Criteria andHistoricalSoldGreaterThanOrEqualTo(Integer value) {
            addCriterion("historical_sold >=", value, "historicalSold");
            return (Criteria) this;
        }

        public Criteria andHistoricalSoldLessThan(Integer value) {
            addCriterion("historical_sold <", value, "historicalSold");
            return (Criteria) this;
        }

        public Criteria andHistoricalSoldLessThanOrEqualTo(Integer value) {
            addCriterion("historical_sold <=", value, "historicalSold");
            return (Criteria) this;
        }

        public Criteria andHistoricalSoldIn(List<Integer> values) {
            addCriterion("historical_sold in", values, "historicalSold");
            return (Criteria) this;
        }

        public Criteria andHistoricalSoldNotIn(List<Integer> values) {
            addCriterion("historical_sold not in", values, "historicalSold");
            return (Criteria) this;
        }

        public Criteria andHistoricalSoldBetween(Integer value1, Integer value2) {
            addCriterion("historical_sold between", value1, value2, "historicalSold");
            return (Criteria) this;
        }

        public Criteria andHistoricalSoldNotBetween(Integer value1, Integer value2) {
            addCriterion("historical_sold not between", value1, value2, "historicalSold");
            return (Criteria) this;
        }

        public Criteria andStockIsNull() {
            addCriterion("stock is null");
            return (Criteria) this;
        }

        public Criteria andStockIsNotNull() {
            addCriterion("stock is not null");
            return (Criteria) this;
        }

        public Criteria andStockEqualTo(Integer value) {
            addCriterion("stock =", value, "stock");
            return (Criteria) this;
        }

        public Criteria andStockNotEqualTo(Integer value) {
            addCriterion("stock <>", value, "stock");
            return (Criteria) this;
        }

        public Criteria andStockGreaterThan(Integer value) {
            addCriterion("stock >", value, "stock");
            return (Criteria) this;
        }

        public Criteria andStockGreaterThanOrEqualTo(Integer value) {
            addCriterion("stock >=", value, "stock");
            return (Criteria) this;
        }

        public Criteria andStockLessThan(Integer value) {
            addCriterion("stock <", value, "stock");
            return (Criteria) this;
        }

        public Criteria andStockLessThanOrEqualTo(Integer value) {
            addCriterion("stock <=", value, "stock");
            return (Criteria) this;
        }

        public Criteria andStockIn(List<Integer> values) {
            addCriterion("stock in", values, "stock");
            return (Criteria) this;
        }

        public Criteria andStockNotIn(List<Integer> values) {
            addCriterion("stock not in", values, "stock");
            return (Criteria) this;
        }

        public Criteria andStockBetween(Integer value1, Integer value2) {
            addCriterion("stock between", value1, value2, "stock");
            return (Criteria) this;
        }

        public Criteria andStockNotBetween(Integer value1, Integer value2) {
            addCriterion("stock not between", value1, value2, "stock");
            return (Criteria) this;
        }

        public Criteria andBrandIsNull() {
            addCriterion("brand is null");
            return (Criteria) this;
        }

        public Criteria andBrandIsNotNull() {
            addCriterion("brand is not null");
            return (Criteria) this;
        }

        public Criteria andBrandEqualTo(String value) {
            addCriterion("brand =", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandNotEqualTo(String value) {
            addCriterion("brand <>", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandGreaterThan(String value) {
            addCriterion("brand >", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandGreaterThanOrEqualTo(String value) {
            addCriterion("brand >=", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandLessThan(String value) {
            addCriterion("brand <", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandLessThanOrEqualTo(String value) {
            addCriterion("brand <=", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandLike(String value) {
            addCriterion("brand like", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandNotLike(String value) {
            addCriterion("brand not like", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandIn(List<String> values) {
            addCriterion("brand in", values, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandNotIn(List<String> values) {
            addCriterion("brand not in", values, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandBetween(String value1, String value2) {
            addCriterion("brand between", value1, value2, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandNotBetween(String value1, String value2) {
            addCriterion("brand not between", value1, value2, "brand");
            return (Criteria) this;
        }

        public Criteria andItemRatingStarIsNull() {
            addCriterion("item_rating_star is null");
            return (Criteria) this;
        }

        public Criteria andItemRatingStarIsNotNull() {
            addCriterion("item_rating_star is not null");
            return (Criteria) this;
        }

        public Criteria andItemRatingStarEqualTo(Double value) {
            addCriterion("item_rating_star =", value, "itemRatingStar");
            return (Criteria) this;
        }

        public Criteria andItemRatingStarNotEqualTo(Double value) {
            addCriterion("item_rating_star <>", value, "itemRatingStar");
            return (Criteria) this;
        }

        public Criteria andItemRatingStarGreaterThan(Double value) {
            addCriterion("item_rating_star >", value, "itemRatingStar");
            return (Criteria) this;
        }

        public Criteria andItemRatingStarGreaterThanOrEqualTo(Double value) {
            addCriterion("item_rating_star >=", value, "itemRatingStar");
            return (Criteria) this;
        }

        public Criteria andItemRatingStarLessThan(Double value) {
            addCriterion("item_rating_star <", value, "itemRatingStar");
            return (Criteria) this;
        }

        public Criteria andItemRatingStarLessThanOrEqualTo(Double value) {
            addCriterion("item_rating_star <=", value, "itemRatingStar");
            return (Criteria) this;
        }

        public Criteria andItemRatingStarIn(List<Double> values) {
            addCriterion("item_rating_star in", values, "itemRatingStar");
            return (Criteria) this;
        }

        public Criteria andItemRatingStarNotIn(List<Double> values) {
            addCriterion("item_rating_star not in", values, "itemRatingStar");
            return (Criteria) this;
        }

        public Criteria andItemRatingStarBetween(Double value1, Double value2) {
            addCriterion("item_rating_star between", value1, value2, "itemRatingStar");
            return (Criteria) this;
        }

        public Criteria andItemRatingStarNotBetween(Double value1, Double value2) {
            addCriterion("item_rating_star not between", value1, value2, "itemRatingStar");
            return (Criteria) this;
        }

        public Criteria andCurrencyIsNull() {
            addCriterion("currency is null");
            return (Criteria) this;
        }

        public Criteria andCurrencyIsNotNull() {
            addCriterion("currency is not null");
            return (Criteria) this;
        }

        public Criteria andCurrencyEqualTo(String value) {
            addCriterion("currency =", value, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyNotEqualTo(String value) {
            addCriterion("currency <>", value, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyGreaterThan(String value) {
            addCriterion("currency >", value, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyGreaterThanOrEqualTo(String value) {
            addCriterion("currency >=", value, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyLessThan(String value) {
            addCriterion("currency <", value, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyLessThanOrEqualTo(String value) {
            addCriterion("currency <=", value, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyLike(String value) {
            addCriterion("currency like", value, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyNotLike(String value) {
            addCriterion("currency not like", value, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyIn(List<String> values) {
            addCriterion("currency in", values, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyNotIn(List<String> values) {
            addCriterion("currency not in", values, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyBetween(String value1, String value2) {
            addCriterion("currency between", value1, value2, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyNotBetween(String value1, String value2) {
            addCriterion("currency not between", value1, value2, "currency");
            return (Criteria) this;
        }

        public Criteria andItemDetailUrlIsNull() {
            addCriterion("item_detail_url is null");
            return (Criteria) this;
        }

        public Criteria andItemDetailUrlIsNotNull() {
            addCriterion("item_detail_url is not null");
            return (Criteria) this;
        }

        public Criteria andItemDetailUrlEqualTo(String value) {
            addCriterion("item_detail_url =", value, "itemDetailUrl");
            return (Criteria) this;
        }

        public Criteria andItemDetailUrlNotEqualTo(String value) {
            addCriterion("item_detail_url <>", value, "itemDetailUrl");
            return (Criteria) this;
        }

        public Criteria andItemDetailUrlGreaterThan(String value) {
            addCriterion("item_detail_url >", value, "itemDetailUrl");
            return (Criteria) this;
        }

        public Criteria andItemDetailUrlGreaterThanOrEqualTo(String value) {
            addCriterion("item_detail_url >=", value, "itemDetailUrl");
            return (Criteria) this;
        }

        public Criteria andItemDetailUrlLessThan(String value) {
            addCriterion("item_detail_url <", value, "itemDetailUrl");
            return (Criteria) this;
        }

        public Criteria andItemDetailUrlLessThanOrEqualTo(String value) {
            addCriterion("item_detail_url <=", value, "itemDetailUrl");
            return (Criteria) this;
        }

        public Criteria andItemDetailUrlLike(String value) {
            addCriterion("item_detail_url like", value, "itemDetailUrl");
            return (Criteria) this;
        }

        public Criteria andItemDetailUrlNotLike(String value) {
            addCriterion("item_detail_url not like", value, "itemDetailUrl");
            return (Criteria) this;
        }

        public Criteria andItemDetailUrlIn(List<String> values) {
            addCriterion("item_detail_url in", values, "itemDetailUrl");
            return (Criteria) this;
        }

        public Criteria andItemDetailUrlNotIn(List<String> values) {
            addCriterion("item_detail_url not in", values, "itemDetailUrl");
            return (Criteria) this;
        }

        public Criteria andItemDetailUrlBetween(String value1, String value2) {
            addCriterion("item_detail_url between", value1, value2, "itemDetailUrl");
            return (Criteria) this;
        }

        public Criteria andItemDetailUrlNotBetween(String value1, String value2) {
            addCriterion("item_detail_url not between", value1, value2, "itemDetailUrl");
            return (Criteria) this;
        }

        public Criteria andVersionIsNull() {
            addCriterion("version is null");
            return (Criteria) this;
        }

        public Criteria andVersionIsNotNull() {
            addCriterion("version is not null");
            return (Criteria) this;
        }

        public Criteria andVersionEqualTo(Integer value) {
            addCriterion("version =", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotEqualTo(Integer value) {
            addCriterion("version <>", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionGreaterThan(Integer value) {
            addCriterion("version >", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionGreaterThanOrEqualTo(Integer value) {
            addCriterion("version >=", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionLessThan(Integer value) {
            addCriterion("version <", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionLessThanOrEqualTo(Integer value) {
            addCriterion("version <=", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionIn(List<Integer> values) {
            addCriterion("version in", values, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotIn(List<Integer> values) {
            addCriterion("version not in", values, "version");
            return (Criteria) this;
        }

        public Criteria andVersionBetween(Integer value1, Integer value2) {
            addCriterion("version between", value1, value2, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotBetween(Integer value1, Integer value2) {
            addCriterion("version not between", value1, value2, "version");
            return (Criteria) this;
        }

        public Criteria andUploadTimeIsNull() {
            addCriterion("upload_time is null");
            return (Criteria) this;
        }

        public Criteria andUploadTimeIsNotNull() {
            addCriterion("upload_time is not null");
            return (Criteria) this;
        }

        public Criteria andUploadTimeEqualTo(Date value) {
            addCriterion("upload_time =", value, "uploadTime");
            return (Criteria) this;
        }

        public Criteria andUploadTimeNotEqualTo(Date value) {
            addCriterion("upload_time <>", value, "uploadTime");
            return (Criteria) this;
        }

        public Criteria andUploadTimeGreaterThan(Date value) {
            addCriterion("upload_time >", value, "uploadTime");
            return (Criteria) this;
        }

        public Criteria andUploadTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("upload_time >=", value, "uploadTime");
            return (Criteria) this;
        }

        public Criteria andUploadTimeLessThan(Date value) {
            addCriterion("upload_time <", value, "uploadTime");
            return (Criteria) this;
        }

        public Criteria andUploadTimeLessThanOrEqualTo(Date value) {
            addCriterion("upload_time <=", value, "uploadTime");
            return (Criteria) this;
        }

        public Criteria andUploadTimeIn(List<Date> values) {
            addCriterion("upload_time in", values, "uploadTime");
            return (Criteria) this;
        }

        public Criteria andUploadTimeNotIn(List<Date> values) {
            addCriterion("upload_time not in", values, "uploadTime");
            return (Criteria) this;
        }

        public Criteria andUploadTimeBetween(Date value1, Date value2) {
            addCriterion("upload_time between", value1, value2, "uploadTime");
            return (Criteria) this;
        }

        public Criteria andUploadTimeNotBetween(Date value1, Date value2) {
            addCriterion("upload_time not between", value1, value2, "uploadTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}