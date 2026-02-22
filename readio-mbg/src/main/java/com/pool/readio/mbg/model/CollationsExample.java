package com.pool.readio.mbg.model;

import java.util.ArrayList;
import java.util.List;

public class CollationsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CollationsExample() {
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

        public Criteria andCollationCatalogIsNull() {
            addCriterion("collation_catalog is null");
            return (Criteria) this;
        }

        public Criteria andCollationCatalogIsNotNull() {
            addCriterion("collation_catalog is not null");
            return (Criteria) this;
        }

        public Criteria andCollationCatalogEqualTo(Object value) {
            addCriterion("collation_catalog =", value, "collationCatalog");
            return (Criteria) this;
        }

        public Criteria andCollationCatalogNotEqualTo(Object value) {
            addCriterion("collation_catalog <>", value, "collationCatalog");
            return (Criteria) this;
        }

        public Criteria andCollationCatalogGreaterThan(Object value) {
            addCriterion("collation_catalog >", value, "collationCatalog");
            return (Criteria) this;
        }

        public Criteria andCollationCatalogGreaterThanOrEqualTo(Object value) {
            addCriterion("collation_catalog >=", value, "collationCatalog");
            return (Criteria) this;
        }

        public Criteria andCollationCatalogLessThan(Object value) {
            addCriterion("collation_catalog <", value, "collationCatalog");
            return (Criteria) this;
        }

        public Criteria andCollationCatalogLessThanOrEqualTo(Object value) {
            addCriterion("collation_catalog <=", value, "collationCatalog");
            return (Criteria) this;
        }

        public Criteria andCollationCatalogIn(List<Object> values) {
            addCriterion("collation_catalog in", values, "collationCatalog");
            return (Criteria) this;
        }

        public Criteria andCollationCatalogNotIn(List<Object> values) {
            addCriterion("collation_catalog not in", values, "collationCatalog");
            return (Criteria) this;
        }

        public Criteria andCollationCatalogBetween(Object value1, Object value2) {
            addCriterion("collation_catalog between", value1, value2, "collationCatalog");
            return (Criteria) this;
        }

        public Criteria andCollationCatalogNotBetween(Object value1, Object value2) {
            addCriterion("collation_catalog not between", value1, value2, "collationCatalog");
            return (Criteria) this;
        }

        public Criteria andCollationSchemaIsNull() {
            addCriterion("collation_schema is null");
            return (Criteria) this;
        }

        public Criteria andCollationSchemaIsNotNull() {
            addCriterion("collation_schema is not null");
            return (Criteria) this;
        }

        public Criteria andCollationSchemaEqualTo(Object value) {
            addCriterion("collation_schema =", value, "collationSchema");
            return (Criteria) this;
        }

        public Criteria andCollationSchemaNotEqualTo(Object value) {
            addCriterion("collation_schema <>", value, "collationSchema");
            return (Criteria) this;
        }

        public Criteria andCollationSchemaGreaterThan(Object value) {
            addCriterion("collation_schema >", value, "collationSchema");
            return (Criteria) this;
        }

        public Criteria andCollationSchemaGreaterThanOrEqualTo(Object value) {
            addCriterion("collation_schema >=", value, "collationSchema");
            return (Criteria) this;
        }

        public Criteria andCollationSchemaLessThan(Object value) {
            addCriterion("collation_schema <", value, "collationSchema");
            return (Criteria) this;
        }

        public Criteria andCollationSchemaLessThanOrEqualTo(Object value) {
            addCriterion("collation_schema <=", value, "collationSchema");
            return (Criteria) this;
        }

        public Criteria andCollationSchemaIn(List<Object> values) {
            addCriterion("collation_schema in", values, "collationSchema");
            return (Criteria) this;
        }

        public Criteria andCollationSchemaNotIn(List<Object> values) {
            addCriterion("collation_schema not in", values, "collationSchema");
            return (Criteria) this;
        }

        public Criteria andCollationSchemaBetween(Object value1, Object value2) {
            addCriterion("collation_schema between", value1, value2, "collationSchema");
            return (Criteria) this;
        }

        public Criteria andCollationSchemaNotBetween(Object value1, Object value2) {
            addCriterion("collation_schema not between", value1, value2, "collationSchema");
            return (Criteria) this;
        }

        public Criteria andCollationNameIsNull() {
            addCriterion("collation_name is null");
            return (Criteria) this;
        }

        public Criteria andCollationNameIsNotNull() {
            addCriterion("collation_name is not null");
            return (Criteria) this;
        }

        public Criteria andCollationNameEqualTo(Object value) {
            addCriterion("collation_name =", value, "collationName");
            return (Criteria) this;
        }

        public Criteria andCollationNameNotEqualTo(Object value) {
            addCriterion("collation_name <>", value, "collationName");
            return (Criteria) this;
        }

        public Criteria andCollationNameGreaterThan(Object value) {
            addCriterion("collation_name >", value, "collationName");
            return (Criteria) this;
        }

        public Criteria andCollationNameGreaterThanOrEqualTo(Object value) {
            addCriterion("collation_name >=", value, "collationName");
            return (Criteria) this;
        }

        public Criteria andCollationNameLessThan(Object value) {
            addCriterion("collation_name <", value, "collationName");
            return (Criteria) this;
        }

        public Criteria andCollationNameLessThanOrEqualTo(Object value) {
            addCriterion("collation_name <=", value, "collationName");
            return (Criteria) this;
        }

        public Criteria andCollationNameIn(List<Object> values) {
            addCriterion("collation_name in", values, "collationName");
            return (Criteria) this;
        }

        public Criteria andCollationNameNotIn(List<Object> values) {
            addCriterion("collation_name not in", values, "collationName");
            return (Criteria) this;
        }

        public Criteria andCollationNameBetween(Object value1, Object value2) {
            addCriterion("collation_name between", value1, value2, "collationName");
            return (Criteria) this;
        }

        public Criteria andCollationNameNotBetween(Object value1, Object value2) {
            addCriterion("collation_name not between", value1, value2, "collationName");
            return (Criteria) this;
        }

        public Criteria andPadAttributeIsNull() {
            addCriterion("pad_attribute is null");
            return (Criteria) this;
        }

        public Criteria andPadAttributeIsNotNull() {
            addCriterion("pad_attribute is not null");
            return (Criteria) this;
        }

        public Criteria andPadAttributeEqualTo(Object value) {
            addCriterion("pad_attribute =", value, "padAttribute");
            return (Criteria) this;
        }

        public Criteria andPadAttributeNotEqualTo(Object value) {
            addCriterion("pad_attribute <>", value, "padAttribute");
            return (Criteria) this;
        }

        public Criteria andPadAttributeGreaterThan(Object value) {
            addCriterion("pad_attribute >", value, "padAttribute");
            return (Criteria) this;
        }

        public Criteria andPadAttributeGreaterThanOrEqualTo(Object value) {
            addCriterion("pad_attribute >=", value, "padAttribute");
            return (Criteria) this;
        }

        public Criteria andPadAttributeLessThan(Object value) {
            addCriterion("pad_attribute <", value, "padAttribute");
            return (Criteria) this;
        }

        public Criteria andPadAttributeLessThanOrEqualTo(Object value) {
            addCriterion("pad_attribute <=", value, "padAttribute");
            return (Criteria) this;
        }

        public Criteria andPadAttributeIn(List<Object> values) {
            addCriterion("pad_attribute in", values, "padAttribute");
            return (Criteria) this;
        }

        public Criteria andPadAttributeNotIn(List<Object> values) {
            addCriterion("pad_attribute not in", values, "padAttribute");
            return (Criteria) this;
        }

        public Criteria andPadAttributeBetween(Object value1, Object value2) {
            addCriterion("pad_attribute between", value1, value2, "padAttribute");
            return (Criteria) this;
        }

        public Criteria andPadAttributeNotBetween(Object value1, Object value2) {
            addCriterion("pad_attribute not between", value1, value2, "padAttribute");
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