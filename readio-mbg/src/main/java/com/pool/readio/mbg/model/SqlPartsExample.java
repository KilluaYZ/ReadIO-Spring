package com.pool.readio.mbg.model;

import java.util.ArrayList;
import java.util.List;

public class SqlPartsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SqlPartsExample() {
        oredCriteria = new ArrayList<>();
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
            criteria = new ArrayList<>();
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

        public Criteria andFeatureIdIsNull() {
            addCriterion("feature_id is null");
            return (Criteria) this;
        }

        public Criteria andFeatureIdIsNotNull() {
            addCriterion("feature_id is not null");
            return (Criteria) this;
        }

        public Criteria andFeatureIdEqualTo(Object value) {
            addCriterion("feature_id =", value, "featureId");
            return (Criteria) this;
        }

        public Criteria andFeatureIdNotEqualTo(Object value) {
            addCriterion("feature_id <>", value, "featureId");
            return (Criteria) this;
        }

        public Criteria andFeatureIdGreaterThan(Object value) {
            addCriterion("feature_id >", value, "featureId");
            return (Criteria) this;
        }

        public Criteria andFeatureIdGreaterThanOrEqualTo(Object value) {
            addCriterion("feature_id >=", value, "featureId");
            return (Criteria) this;
        }

        public Criteria andFeatureIdLessThan(Object value) {
            addCriterion("feature_id <", value, "featureId");
            return (Criteria) this;
        }

        public Criteria andFeatureIdLessThanOrEqualTo(Object value) {
            addCriterion("feature_id <=", value, "featureId");
            return (Criteria) this;
        }

        public Criteria andFeatureIdIn(List<Object> values) {
            addCriterion("feature_id in", values, "featureId");
            return (Criteria) this;
        }

        public Criteria andFeatureIdNotIn(List<Object> values) {
            addCriterion("feature_id not in", values, "featureId");
            return (Criteria) this;
        }

        public Criteria andFeatureIdBetween(Object value1, Object value2) {
            addCriterion("feature_id between", value1, value2, "featureId");
            return (Criteria) this;
        }

        public Criteria andFeatureIdNotBetween(Object value1, Object value2) {
            addCriterion("feature_id not between", value1, value2, "featureId");
            return (Criteria) this;
        }

        public Criteria andFeatureNameIsNull() {
            addCriterion("feature_name is null");
            return (Criteria) this;
        }

        public Criteria andFeatureNameIsNotNull() {
            addCriterion("feature_name is not null");
            return (Criteria) this;
        }

        public Criteria andFeatureNameEqualTo(Object value) {
            addCriterion("feature_name =", value, "featureName");
            return (Criteria) this;
        }

        public Criteria andFeatureNameNotEqualTo(Object value) {
            addCriterion("feature_name <>", value, "featureName");
            return (Criteria) this;
        }

        public Criteria andFeatureNameGreaterThan(Object value) {
            addCriterion("feature_name >", value, "featureName");
            return (Criteria) this;
        }

        public Criteria andFeatureNameGreaterThanOrEqualTo(Object value) {
            addCriterion("feature_name >=", value, "featureName");
            return (Criteria) this;
        }

        public Criteria andFeatureNameLessThan(Object value) {
            addCriterion("feature_name <", value, "featureName");
            return (Criteria) this;
        }

        public Criteria andFeatureNameLessThanOrEqualTo(Object value) {
            addCriterion("feature_name <=", value, "featureName");
            return (Criteria) this;
        }

        public Criteria andFeatureNameIn(List<Object> values) {
            addCriterion("feature_name in", values, "featureName");
            return (Criteria) this;
        }

        public Criteria andFeatureNameNotIn(List<Object> values) {
            addCriterion("feature_name not in", values, "featureName");
            return (Criteria) this;
        }

        public Criteria andFeatureNameBetween(Object value1, Object value2) {
            addCriterion("feature_name between", value1, value2, "featureName");
            return (Criteria) this;
        }

        public Criteria andFeatureNameNotBetween(Object value1, Object value2) {
            addCriterion("feature_name not between", value1, value2, "featureName");
            return (Criteria) this;
        }

        public Criteria andIsSupportedIsNull() {
            addCriterion("is_supported is null");
            return (Criteria) this;
        }

        public Criteria andIsSupportedIsNotNull() {
            addCriterion("is_supported is not null");
            return (Criteria) this;
        }

        public Criteria andIsSupportedEqualTo(Object value) {
            addCriterion("is_supported =", value, "isSupported");
            return (Criteria) this;
        }

        public Criteria andIsSupportedNotEqualTo(Object value) {
            addCriterion("is_supported <>", value, "isSupported");
            return (Criteria) this;
        }

        public Criteria andIsSupportedGreaterThan(Object value) {
            addCriterion("is_supported >", value, "isSupported");
            return (Criteria) this;
        }

        public Criteria andIsSupportedGreaterThanOrEqualTo(Object value) {
            addCriterion("is_supported >=", value, "isSupported");
            return (Criteria) this;
        }

        public Criteria andIsSupportedLessThan(Object value) {
            addCriterion("is_supported <", value, "isSupported");
            return (Criteria) this;
        }

        public Criteria andIsSupportedLessThanOrEqualTo(Object value) {
            addCriterion("is_supported <=", value, "isSupported");
            return (Criteria) this;
        }

        public Criteria andIsSupportedIn(List<Object> values) {
            addCriterion("is_supported in", values, "isSupported");
            return (Criteria) this;
        }

        public Criteria andIsSupportedNotIn(List<Object> values) {
            addCriterion("is_supported not in", values, "isSupported");
            return (Criteria) this;
        }

        public Criteria andIsSupportedBetween(Object value1, Object value2) {
            addCriterion("is_supported between", value1, value2, "isSupported");
            return (Criteria) this;
        }

        public Criteria andIsSupportedNotBetween(Object value1, Object value2) {
            addCriterion("is_supported not between", value1, value2, "isSupported");
            return (Criteria) this;
        }

        public Criteria andIsVerifiedByIsNull() {
            addCriterion("is_verified_by is null");
            return (Criteria) this;
        }

        public Criteria andIsVerifiedByIsNotNull() {
            addCriterion("is_verified_by is not null");
            return (Criteria) this;
        }

        public Criteria andIsVerifiedByEqualTo(Object value) {
            addCriterion("is_verified_by =", value, "isVerifiedBy");
            return (Criteria) this;
        }

        public Criteria andIsVerifiedByNotEqualTo(Object value) {
            addCriterion("is_verified_by <>", value, "isVerifiedBy");
            return (Criteria) this;
        }

        public Criteria andIsVerifiedByGreaterThan(Object value) {
            addCriterion("is_verified_by >", value, "isVerifiedBy");
            return (Criteria) this;
        }

        public Criteria andIsVerifiedByGreaterThanOrEqualTo(Object value) {
            addCriterion("is_verified_by >=", value, "isVerifiedBy");
            return (Criteria) this;
        }

        public Criteria andIsVerifiedByLessThan(Object value) {
            addCriterion("is_verified_by <", value, "isVerifiedBy");
            return (Criteria) this;
        }

        public Criteria andIsVerifiedByLessThanOrEqualTo(Object value) {
            addCriterion("is_verified_by <=", value, "isVerifiedBy");
            return (Criteria) this;
        }

        public Criteria andIsVerifiedByIn(List<Object> values) {
            addCriterion("is_verified_by in", values, "isVerifiedBy");
            return (Criteria) this;
        }

        public Criteria andIsVerifiedByNotIn(List<Object> values) {
            addCriterion("is_verified_by not in", values, "isVerifiedBy");
            return (Criteria) this;
        }

        public Criteria andIsVerifiedByBetween(Object value1, Object value2) {
            addCriterion("is_verified_by between", value1, value2, "isVerifiedBy");
            return (Criteria) this;
        }

        public Criteria andIsVerifiedByNotBetween(Object value1, Object value2) {
            addCriterion("is_verified_by not between", value1, value2, "isVerifiedBy");
            return (Criteria) this;
        }

        public Criteria andCommentsIsNull() {
            addCriterion("comments is null");
            return (Criteria) this;
        }

        public Criteria andCommentsIsNotNull() {
            addCriterion("comments is not null");
            return (Criteria) this;
        }

        public Criteria andCommentsEqualTo(Object value) {
            addCriterion("comments =", value, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsNotEqualTo(Object value) {
            addCriterion("comments <>", value, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsGreaterThan(Object value) {
            addCriterion("comments >", value, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsGreaterThanOrEqualTo(Object value) {
            addCriterion("comments >=", value, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsLessThan(Object value) {
            addCriterion("comments <", value, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsLessThanOrEqualTo(Object value) {
            addCriterion("comments <=", value, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsIn(List<Object> values) {
            addCriterion("comments in", values, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsNotIn(List<Object> values) {
            addCriterion("comments not in", values, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsBetween(Object value1, Object value2) {
            addCriterion("comments between", value1, value2, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsNotBetween(Object value1, Object value2) {
            addCriterion("comments not between", value1, value2, "comments");
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