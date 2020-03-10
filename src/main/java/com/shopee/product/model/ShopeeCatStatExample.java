package com.shopee.product.model;

import java.util.ArrayList;
import java.util.List;

public class ShopeeCatStatExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ShopeeCatStatExample() {
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

        public Criteria andParentCategoryIdIsNull() {
            addCriterion("parent_category_id is null");
            return (Criteria) this;
        }

        public Criteria andParentCategoryIdIsNotNull() {
            addCriterion("parent_category_id is not null");
            return (Criteria) this;
        }

        public Criteria andParentCategoryIdEqualTo(Long value) {
            addCriterion("parent_category_id =", value, "parentCategoryId");
            return (Criteria) this;
        }

        public Criteria andParentCategoryIdNotEqualTo(Long value) {
            addCriterion("parent_category_id <>", value, "parentCategoryId");
            return (Criteria) this;
        }

        public Criteria andParentCategoryIdGreaterThan(Long value) {
            addCriterion("parent_category_id >", value, "parentCategoryId");
            return (Criteria) this;
        }

        public Criteria andParentCategoryIdGreaterThanOrEqualTo(Long value) {
            addCriterion("parent_category_id >=", value, "parentCategoryId");
            return (Criteria) this;
        }

        public Criteria andParentCategoryIdLessThan(Long value) {
            addCriterion("parent_category_id <", value, "parentCategoryId");
            return (Criteria) this;
        }

        public Criteria andParentCategoryIdLessThanOrEqualTo(Long value) {
            addCriterion("parent_category_id <=", value, "parentCategoryId");
            return (Criteria) this;
        }

        public Criteria andParentCategoryIdIn(List<Long> values) {
            addCriterion("parent_category_id in", values, "parentCategoryId");
            return (Criteria) this;
        }

        public Criteria andParentCategoryIdNotIn(List<Long> values) {
            addCriterion("parent_category_id not in", values, "parentCategoryId");
            return (Criteria) this;
        }

        public Criteria andParentCategoryIdBetween(Long value1, Long value2) {
            addCriterion("parent_category_id between", value1, value2, "parentCategoryId");
            return (Criteria) this;
        }

        public Criteria andParentCategoryIdNotBetween(Long value1, Long value2) {
            addCriterion("parent_category_id not between", value1, value2, "parentCategoryId");
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

        public Criteria andTotalProCountIsNull() {
            addCriterion("total_pro_count is null");
            return (Criteria) this;
        }

        public Criteria andTotalProCountIsNotNull() {
            addCriterion("total_pro_count is not null");
            return (Criteria) this;
        }

        public Criteria andTotalProCountEqualTo(Integer value) {
            addCriterion("total_pro_count =", value, "totalProCount");
            return (Criteria) this;
        }

        public Criteria andTotalProCountNotEqualTo(Integer value) {
            addCriterion("total_pro_count <>", value, "totalProCount");
            return (Criteria) this;
        }

        public Criteria andTotalProCountGreaterThan(Integer value) {
            addCriterion("total_pro_count >", value, "totalProCount");
            return (Criteria) this;
        }

        public Criteria andTotalProCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("total_pro_count >=", value, "totalProCount");
            return (Criteria) this;
        }

        public Criteria andTotalProCountLessThan(Integer value) {
            addCriterion("total_pro_count <", value, "totalProCount");
            return (Criteria) this;
        }

        public Criteria andTotalProCountLessThanOrEqualTo(Integer value) {
            addCriterion("total_pro_count <=", value, "totalProCount");
            return (Criteria) this;
        }

        public Criteria andTotalProCountIn(List<Integer> values) {
            addCriterion("total_pro_count in", values, "totalProCount");
            return (Criteria) this;
        }

        public Criteria andTotalProCountNotIn(List<Integer> values) {
            addCriterion("total_pro_count not in", values, "totalProCount");
            return (Criteria) this;
        }

        public Criteria andTotalProCountBetween(Integer value1, Integer value2) {
            addCriterion("total_pro_count between", value1, value2, "totalProCount");
            return (Criteria) this;
        }

        public Criteria andTotalProCountNotBetween(Integer value1, Integer value2) {
            addCriterion("total_pro_count not between", value1, value2, "totalProCount");
            return (Criteria) this;
        }

        public Criteria andTotalSoldSumIsNull() {
            addCriterion("total_sold_sum is null");
            return (Criteria) this;
        }

        public Criteria andTotalSoldSumIsNotNull() {
            addCriterion("total_sold_sum is not null");
            return (Criteria) this;
        }

        public Criteria andTotalSoldSumEqualTo(Integer value) {
            addCriterion("total_sold_sum =", value, "totalSoldSum");
            return (Criteria) this;
        }

        public Criteria andTotalSoldSumNotEqualTo(Integer value) {
            addCriterion("total_sold_sum <>", value, "totalSoldSum");
            return (Criteria) this;
        }

        public Criteria andTotalSoldSumGreaterThan(Integer value) {
            addCriterion("total_sold_sum >", value, "totalSoldSum");
            return (Criteria) this;
        }

        public Criteria andTotalSoldSumGreaterThanOrEqualTo(Integer value) {
            addCriterion("total_sold_sum >=", value, "totalSoldSum");
            return (Criteria) this;
        }

        public Criteria andTotalSoldSumLessThan(Integer value) {
            addCriterion("total_sold_sum <", value, "totalSoldSum");
            return (Criteria) this;
        }

        public Criteria andTotalSoldSumLessThanOrEqualTo(Integer value) {
            addCriterion("total_sold_sum <=", value, "totalSoldSum");
            return (Criteria) this;
        }

        public Criteria andTotalSoldSumIn(List<Integer> values) {
            addCriterion("total_sold_sum in", values, "totalSoldSum");
            return (Criteria) this;
        }

        public Criteria andTotalSoldSumNotIn(List<Integer> values) {
            addCriterion("total_sold_sum not in", values, "totalSoldSum");
            return (Criteria) this;
        }

        public Criteria andTotalSoldSumBetween(Integer value1, Integer value2) {
            addCriterion("total_sold_sum between", value1, value2, "totalSoldSum");
            return (Criteria) this;
        }

        public Criteria andTotalSoldSumNotBetween(Integer value1, Integer value2) {
            addCriterion("total_sold_sum not between", value1, value2, "totalSoldSum");
            return (Criteria) this;
        }

        public Criteria andHomeSoldAvgIsNull() {
            addCriterion("home_sold_avg is null");
            return (Criteria) this;
        }

        public Criteria andHomeSoldAvgIsNotNull() {
            addCriterion("home_sold_avg is not null");
            return (Criteria) this;
        }

        public Criteria andHomeSoldAvgEqualTo(Integer value) {
            addCriterion("home_sold_avg =", value, "homeSoldAvg");
            return (Criteria) this;
        }

        public Criteria andHomeSoldAvgNotEqualTo(Integer value) {
            addCriterion("home_sold_avg <>", value, "homeSoldAvg");
            return (Criteria) this;
        }

        public Criteria andHomeSoldAvgGreaterThan(Integer value) {
            addCriterion("home_sold_avg >", value, "homeSoldAvg");
            return (Criteria) this;
        }

        public Criteria andHomeSoldAvgGreaterThanOrEqualTo(Integer value) {
            addCriterion("home_sold_avg >=", value, "homeSoldAvg");
            return (Criteria) this;
        }

        public Criteria andHomeSoldAvgLessThan(Integer value) {
            addCriterion("home_sold_avg <", value, "homeSoldAvg");
            return (Criteria) this;
        }

        public Criteria andHomeSoldAvgLessThanOrEqualTo(Integer value) {
            addCriterion("home_sold_avg <=", value, "homeSoldAvg");
            return (Criteria) this;
        }

        public Criteria andHomeSoldAvgIn(List<Integer> values) {
            addCriterion("home_sold_avg in", values, "homeSoldAvg");
            return (Criteria) this;
        }

        public Criteria andHomeSoldAvgNotIn(List<Integer> values) {
            addCriterion("home_sold_avg not in", values, "homeSoldAvg");
            return (Criteria) this;
        }

        public Criteria andHomeSoldAvgBetween(Integer value1, Integer value2) {
            addCriterion("home_sold_avg between", value1, value2, "homeSoldAvg");
            return (Criteria) this;
        }

        public Criteria andHomeSoldAvgNotBetween(Integer value1, Integer value2) {
            addCriterion("home_sold_avg not between", value1, value2, "homeSoldAvg");
            return (Criteria) this;
        }

        public Criteria andCatCompeteWeightIsNull() {
            addCriterion("cat_compete_weight is null");
            return (Criteria) this;
        }

        public Criteria andCatCompeteWeightIsNotNull() {
            addCriterion("cat_compete_weight is not null");
            return (Criteria) this;
        }

        public Criteria andCatCompeteWeightEqualTo(Double value) {
            addCriterion("cat_compete_weight =", value, "catCompeteWeight");
            return (Criteria) this;
        }

        public Criteria andCatCompeteWeightNotEqualTo(Double value) {
            addCriterion("cat_compete_weight <>", value, "catCompeteWeight");
            return (Criteria) this;
        }

        public Criteria andCatCompeteWeightGreaterThan(Double value) {
            addCriterion("cat_compete_weight >", value, "catCompeteWeight");
            return (Criteria) this;
        }

        public Criteria andCatCompeteWeightGreaterThanOrEqualTo(Double value) {
            addCriterion("cat_compete_weight >=", value, "catCompeteWeight");
            return (Criteria) this;
        }

        public Criteria andCatCompeteWeightLessThan(Double value) {
            addCriterion("cat_compete_weight <", value, "catCompeteWeight");
            return (Criteria) this;
        }

        public Criteria andCatCompeteWeightLessThanOrEqualTo(Double value) {
            addCriterion("cat_compete_weight <=", value, "catCompeteWeight");
            return (Criteria) this;
        }

        public Criteria andCatCompeteWeightIn(List<Double> values) {
            addCriterion("cat_compete_weight in", values, "catCompeteWeight");
            return (Criteria) this;
        }

        public Criteria andCatCompeteWeightNotIn(List<Double> values) {
            addCriterion("cat_compete_weight not in", values, "catCompeteWeight");
            return (Criteria) this;
        }

        public Criteria andCatCompeteWeightBetween(Double value1, Double value2) {
            addCriterion("cat_compete_weight between", value1, value2, "catCompeteWeight");
            return (Criteria) this;
        }

        public Criteria andCatCompeteWeightNotBetween(Double value1, Double value2) {
            addCriterion("cat_compete_weight not between", value1, value2, "catCompeteWeight");
            return (Criteria) this;
        }

        public Criteria andRegionNoIsNull() {
            addCriterion("region_no is null");
            return (Criteria) this;
        }

        public Criteria andRegionNoIsNotNull() {
            addCriterion("region_no is not null");
            return (Criteria) this;
        }

        public Criteria andRegionNoEqualTo(Integer value) {
            addCriterion("region_no =", value, "regionNo");
            return (Criteria) this;
        }

        public Criteria andRegionNoNotEqualTo(Integer value) {
            addCriterion("region_no <>", value, "regionNo");
            return (Criteria) this;
        }

        public Criteria andRegionNoGreaterThan(Integer value) {
            addCriterion("region_no >", value, "regionNo");
            return (Criteria) this;
        }

        public Criteria andRegionNoGreaterThanOrEqualTo(Integer value) {
            addCriterion("region_no >=", value, "regionNo");
            return (Criteria) this;
        }

        public Criteria andRegionNoLessThan(Integer value) {
            addCriterion("region_no <", value, "regionNo");
            return (Criteria) this;
        }

        public Criteria andRegionNoLessThanOrEqualTo(Integer value) {
            addCriterion("region_no <=", value, "regionNo");
            return (Criteria) this;
        }

        public Criteria andRegionNoIn(List<Integer> values) {
            addCriterion("region_no in", values, "regionNo");
            return (Criteria) this;
        }

        public Criteria andRegionNoNotIn(List<Integer> values) {
            addCriterion("region_no not in", values, "regionNo");
            return (Criteria) this;
        }

        public Criteria andRegionNoBetween(Integer value1, Integer value2) {
            addCriterion("region_no between", value1, value2, "regionNo");
            return (Criteria) this;
        }

        public Criteria andRegionNoNotBetween(Integer value1, Integer value2) {
            addCriterion("region_no not between", value1, value2, "regionNo");
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

        public Criteria andVersionEqualTo(Long value) {
            addCriterion("version =", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotEqualTo(Long value) {
            addCriterion("version <>", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionGreaterThan(Long value) {
            addCriterion("version >", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionGreaterThanOrEqualTo(Long value) {
            addCriterion("version >=", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionLessThan(Long value) {
            addCriterion("version <", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionLessThanOrEqualTo(Long value) {
            addCriterion("version <=", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionIn(List<Long> values) {
            addCriterion("version in", values, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotIn(List<Long> values) {
            addCriterion("version not in", values, "version");
            return (Criteria) this;
        }

        public Criteria andVersionBetween(Long value1, Long value2) {
            addCriterion("version between", value1, value2, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotBetween(Long value1, Long value2) {
            addCriterion("version not between", value1, value2, "version");
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