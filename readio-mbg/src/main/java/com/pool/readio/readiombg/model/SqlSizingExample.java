package com.pool.readio.readiombg.model;

import java.util.ArrayList;
import java.util.List;

public class SqlSizingExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SqlSizingExample() {
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

        public Criteria andSizingIdIsNull() {
            addCriterion("sizing_id is null");
            return (Criteria) this;
        }

        public Criteria andSizingIdIsNotNull() {
            addCriterion("sizing_id is not null");
            return (Criteria) this;
        }

        public Criteria andSizingIdEqualTo(Object value) {
            addCriterion("sizing_id =", value, "sizingId");
            return (Criteria) this;
        }

        public Criteria andSizingIdNotEqualTo(Object value) {
            addCriterion("sizing_id <>", value, "sizingId");
            return (Criteria) this;
        }

        public Criteria andSizingIdGreaterThan(Object value) {
            addCriterion("sizing_id >", value, "sizingId");
            return (Criteria) this;
        }

        public Criteria andSizingIdGreaterThanOrEqualTo(Object value) {
            addCriterion("sizing_id >=", value, "sizingId");
            return (Criteria) this;
        }

        public Criteria andSizingIdLessThan(Object value) {
            addCriterion("sizing_id <", value, "sizingId");
            return (Criteria) this;
        }

        public Criteria andSizingIdLessThanOrEqualTo(Object value) {
            addCriterion("sizing_id <=", value, "sizingId");
            return (Criteria) this;
        }

        public Criteria andSizingIdIn(List<Object> values) {
            addCriterion("sizing_id in", values, "sizingId");
            return (Criteria) this;
        }

        public Criteria andSizingIdNotIn(List<Object> values) {
            addCriterion("sizing_id not in", values, "sizingId");
            return (Criteria) this;
        }

        public Criteria andSizingIdBetween(Object value1, Object value2) {
            addCriterion("sizing_id between", value1, value2, "sizingId");
            return (Criteria) this;
        }

        public Criteria andSizingIdNotBetween(Object value1, Object value2) {
            addCriterion("sizing_id not between", value1, value2, "sizingId");
            return (Criteria) this;
        }

        public Criteria andSizingNameIsNull() {
            addCriterion("sizing_name is null");
            return (Criteria) this;
        }

        public Criteria andSizingNameIsNotNull() {
            addCriterion("sizing_name is not null");
            return (Criteria) this;
        }

        public Criteria andSizingNameEqualTo(Object value) {
            addCriterion("sizing_name =", value, "sizingName");
            return (Criteria) this;
        }

        public Criteria andSizingNameNotEqualTo(Object value) {
            addCriterion("sizing_name <>", value, "sizingName");
            return (Criteria) this;
        }

        public Criteria andSizingNameGreaterThan(Object value) {
            addCriterion("sizing_name >", value, "sizingName");
            return (Criteria) this;
        }

        public Criteria andSizingNameGreaterThanOrEqualTo(Object value) {
            addCriterion("sizing_name >=", value, "sizingName");
            return (Criteria) this;
        }

        public Criteria andSizingNameLessThan(Object value) {
            addCriterion("sizing_name <", value, "sizingName");
            return (Criteria) this;
        }

        public Criteria andSizingNameLessThanOrEqualTo(Object value) {
            addCriterion("sizing_name <=", value, "sizingName");
            return (Criteria) this;
        }

        public Criteria andSizingNameIn(List<Object> values) {
            addCriterion("sizing_name in", values, "sizingName");
            return (Criteria) this;
        }

        public Criteria andSizingNameNotIn(List<Object> values) {
            addCriterion("sizing_name not in", values, "sizingName");
            return (Criteria) this;
        }

        public Criteria andSizingNameBetween(Object value1, Object value2) {
            addCriterion("sizing_name between", value1, value2, "sizingName");
            return (Criteria) this;
        }

        public Criteria andSizingNameNotBetween(Object value1, Object value2) {
            addCriterion("sizing_name not between", value1, value2, "sizingName");
            return (Criteria) this;
        }

        public Criteria andSupportedValueIsNull() {
            addCriterion("supported_value is null");
            return (Criteria) this;
        }

        public Criteria andSupportedValueIsNotNull() {
            addCriterion("supported_value is not null");
            return (Criteria) this;
        }

        public Criteria andSupportedValueEqualTo(Object value) {
            addCriterion("supported_value =", value, "supportedValue");
            return (Criteria) this;
        }

        public Criteria andSupportedValueNotEqualTo(Object value) {
            addCriterion("supported_value <>", value, "supportedValue");
            return (Criteria) this;
        }

        public Criteria andSupportedValueGreaterThan(Object value) {
            addCriterion("supported_value >", value, "supportedValue");
            return (Criteria) this;
        }

        public Criteria andSupportedValueGreaterThanOrEqualTo(Object value) {
            addCriterion("supported_value >=", value, "supportedValue");
            return (Criteria) this;
        }

        public Criteria andSupportedValueLessThan(Object value) {
            addCriterion("supported_value <", value, "supportedValue");
            return (Criteria) this;
        }

        public Criteria andSupportedValueLessThanOrEqualTo(Object value) {
            addCriterion("supported_value <=", value, "supportedValue");
            return (Criteria) this;
        }

        public Criteria andSupportedValueIn(List<Object> values) {
            addCriterion("supported_value in", values, "supportedValue");
            return (Criteria) this;
        }

        public Criteria andSupportedValueNotIn(List<Object> values) {
            addCriterion("supported_value not in", values, "supportedValue");
            return (Criteria) this;
        }

        public Criteria andSupportedValueBetween(Object value1, Object value2) {
            addCriterion("supported_value between", value1, value2, "supportedValue");
            return (Criteria) this;
        }

        public Criteria andSupportedValueNotBetween(Object value1, Object value2) {
            addCriterion("supported_value not between", value1, value2, "supportedValue");
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