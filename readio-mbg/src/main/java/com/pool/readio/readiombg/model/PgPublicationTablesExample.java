package com.pool.readio.readiombg.model;

import java.util.ArrayList;
import java.util.List;

public class PgPublicationTablesExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PgPublicationTablesExample() {
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

        public Criteria andPubnameIsNull() {
            addCriterion("pubname is null");
            return (Criteria) this;
        }

        public Criteria andPubnameIsNotNull() {
            addCriterion("pubname is not null");
            return (Criteria) this;
        }

        public Criteria andPubnameEqualTo(String value) {
            addCriterion("pubname =", value, "pubname");
            return (Criteria) this;
        }

        public Criteria andPubnameNotEqualTo(String value) {
            addCriterion("pubname <>", value, "pubname");
            return (Criteria) this;
        }

        public Criteria andPubnameGreaterThan(String value) {
            addCriterion("pubname >", value, "pubname");
            return (Criteria) this;
        }

        public Criteria andPubnameGreaterThanOrEqualTo(String value) {
            addCriterion("pubname >=", value, "pubname");
            return (Criteria) this;
        }

        public Criteria andPubnameLessThan(String value) {
            addCriterion("pubname <", value, "pubname");
            return (Criteria) this;
        }

        public Criteria andPubnameLessThanOrEqualTo(String value) {
            addCriterion("pubname <=", value, "pubname");
            return (Criteria) this;
        }

        public Criteria andPubnameLike(String value) {
            addCriterion("pubname like", value, "pubname");
            return (Criteria) this;
        }

        public Criteria andPubnameNotLike(String value) {
            addCriterion("pubname not like", value, "pubname");
            return (Criteria) this;
        }

        public Criteria andPubnameIn(List<String> values) {
            addCriterion("pubname in", values, "pubname");
            return (Criteria) this;
        }

        public Criteria andPubnameNotIn(List<String> values) {
            addCriterion("pubname not in", values, "pubname");
            return (Criteria) this;
        }

        public Criteria andPubnameBetween(String value1, String value2) {
            addCriterion("pubname between", value1, value2, "pubname");
            return (Criteria) this;
        }

        public Criteria andPubnameNotBetween(String value1, String value2) {
            addCriterion("pubname not between", value1, value2, "pubname");
            return (Criteria) this;
        }

        public Criteria andSchemanameIsNull() {
            addCriterion("schemaname is null");
            return (Criteria) this;
        }

        public Criteria andSchemanameIsNotNull() {
            addCriterion("schemaname is not null");
            return (Criteria) this;
        }

        public Criteria andSchemanameEqualTo(String value) {
            addCriterion("schemaname =", value, "schemaname");
            return (Criteria) this;
        }

        public Criteria andSchemanameNotEqualTo(String value) {
            addCriterion("schemaname <>", value, "schemaname");
            return (Criteria) this;
        }

        public Criteria andSchemanameGreaterThan(String value) {
            addCriterion("schemaname >", value, "schemaname");
            return (Criteria) this;
        }

        public Criteria andSchemanameGreaterThanOrEqualTo(String value) {
            addCriterion("schemaname >=", value, "schemaname");
            return (Criteria) this;
        }

        public Criteria andSchemanameLessThan(String value) {
            addCriterion("schemaname <", value, "schemaname");
            return (Criteria) this;
        }

        public Criteria andSchemanameLessThanOrEqualTo(String value) {
            addCriterion("schemaname <=", value, "schemaname");
            return (Criteria) this;
        }

        public Criteria andSchemanameLike(String value) {
            addCriterion("schemaname like", value, "schemaname");
            return (Criteria) this;
        }

        public Criteria andSchemanameNotLike(String value) {
            addCriterion("schemaname not like", value, "schemaname");
            return (Criteria) this;
        }

        public Criteria andSchemanameIn(List<String> values) {
            addCriterion("schemaname in", values, "schemaname");
            return (Criteria) this;
        }

        public Criteria andSchemanameNotIn(List<String> values) {
            addCriterion("schemaname not in", values, "schemaname");
            return (Criteria) this;
        }

        public Criteria andSchemanameBetween(String value1, String value2) {
            addCriterion("schemaname between", value1, value2, "schemaname");
            return (Criteria) this;
        }

        public Criteria andSchemanameNotBetween(String value1, String value2) {
            addCriterion("schemaname not between", value1, value2, "schemaname");
            return (Criteria) this;
        }

        public Criteria andTablenameIsNull() {
            addCriterion("tablename is null");
            return (Criteria) this;
        }

        public Criteria andTablenameIsNotNull() {
            addCriterion("tablename is not null");
            return (Criteria) this;
        }

        public Criteria andTablenameEqualTo(String value) {
            addCriterion("tablename =", value, "tablename");
            return (Criteria) this;
        }

        public Criteria andTablenameNotEqualTo(String value) {
            addCriterion("tablename <>", value, "tablename");
            return (Criteria) this;
        }

        public Criteria andTablenameGreaterThan(String value) {
            addCriterion("tablename >", value, "tablename");
            return (Criteria) this;
        }

        public Criteria andTablenameGreaterThanOrEqualTo(String value) {
            addCriterion("tablename >=", value, "tablename");
            return (Criteria) this;
        }

        public Criteria andTablenameLessThan(String value) {
            addCriterion("tablename <", value, "tablename");
            return (Criteria) this;
        }

        public Criteria andTablenameLessThanOrEqualTo(String value) {
            addCriterion("tablename <=", value, "tablename");
            return (Criteria) this;
        }

        public Criteria andTablenameLike(String value) {
            addCriterion("tablename like", value, "tablename");
            return (Criteria) this;
        }

        public Criteria andTablenameNotLike(String value) {
            addCriterion("tablename not like", value, "tablename");
            return (Criteria) this;
        }

        public Criteria andTablenameIn(List<String> values) {
            addCriterion("tablename in", values, "tablename");
            return (Criteria) this;
        }

        public Criteria andTablenameNotIn(List<String> values) {
            addCriterion("tablename not in", values, "tablename");
            return (Criteria) this;
        }

        public Criteria andTablenameBetween(String value1, String value2) {
            addCriterion("tablename between", value1, value2, "tablename");
            return (Criteria) this;
        }

        public Criteria andTablenameNotBetween(String value1, String value2) {
            addCriterion("tablename not between", value1, value2, "tablename");
            return (Criteria) this;
        }

        public Criteria andAttnamesIsNull() {
            addCriterion("attnames is null");
            return (Criteria) this;
        }

        public Criteria andAttnamesIsNotNull() {
            addCriterion("attnames is not null");
            return (Criteria) this;
        }

        public Criteria andAttnamesEqualTo(Object value) {
            addCriterion("attnames =", value, "attnames");
            return (Criteria) this;
        }

        public Criteria andAttnamesNotEqualTo(Object value) {
            addCriterion("attnames <>", value, "attnames");
            return (Criteria) this;
        }

        public Criteria andAttnamesGreaterThan(Object value) {
            addCriterion("attnames >", value, "attnames");
            return (Criteria) this;
        }

        public Criteria andAttnamesGreaterThanOrEqualTo(Object value) {
            addCriterion("attnames >=", value, "attnames");
            return (Criteria) this;
        }

        public Criteria andAttnamesLessThan(Object value) {
            addCriterion("attnames <", value, "attnames");
            return (Criteria) this;
        }

        public Criteria andAttnamesLessThanOrEqualTo(Object value) {
            addCriterion("attnames <=", value, "attnames");
            return (Criteria) this;
        }

        public Criteria andAttnamesIn(List<Object> values) {
            addCriterion("attnames in", values, "attnames");
            return (Criteria) this;
        }

        public Criteria andAttnamesNotIn(List<Object> values) {
            addCriterion("attnames not in", values, "attnames");
            return (Criteria) this;
        }

        public Criteria andAttnamesBetween(Object value1, Object value2) {
            addCriterion("attnames between", value1, value2, "attnames");
            return (Criteria) this;
        }

        public Criteria andAttnamesNotBetween(Object value1, Object value2) {
            addCriterion("attnames not between", value1, value2, "attnames");
            return (Criteria) this;
        }

        public Criteria andRowfilterIsNull() {
            addCriterion("rowfilter is null");
            return (Criteria) this;
        }

        public Criteria andRowfilterIsNotNull() {
            addCriterion("rowfilter is not null");
            return (Criteria) this;
        }

        public Criteria andRowfilterEqualTo(String value) {
            addCriterion("rowfilter =", value, "rowfilter");
            return (Criteria) this;
        }

        public Criteria andRowfilterNotEqualTo(String value) {
            addCriterion("rowfilter <>", value, "rowfilter");
            return (Criteria) this;
        }

        public Criteria andRowfilterGreaterThan(String value) {
            addCriterion("rowfilter >", value, "rowfilter");
            return (Criteria) this;
        }

        public Criteria andRowfilterGreaterThanOrEqualTo(String value) {
            addCriterion("rowfilter >=", value, "rowfilter");
            return (Criteria) this;
        }

        public Criteria andRowfilterLessThan(String value) {
            addCriterion("rowfilter <", value, "rowfilter");
            return (Criteria) this;
        }

        public Criteria andRowfilterLessThanOrEqualTo(String value) {
            addCriterion("rowfilter <=", value, "rowfilter");
            return (Criteria) this;
        }

        public Criteria andRowfilterLike(String value) {
            addCriterion("rowfilter like", value, "rowfilter");
            return (Criteria) this;
        }

        public Criteria andRowfilterNotLike(String value) {
            addCriterion("rowfilter not like", value, "rowfilter");
            return (Criteria) this;
        }

        public Criteria andRowfilterIn(List<String> values) {
            addCriterion("rowfilter in", values, "rowfilter");
            return (Criteria) this;
        }

        public Criteria andRowfilterNotIn(List<String> values) {
            addCriterion("rowfilter not in", values, "rowfilter");
            return (Criteria) this;
        }

        public Criteria andRowfilterBetween(String value1, String value2) {
            addCriterion("rowfilter between", value1, value2, "rowfilter");
            return (Criteria) this;
        }

        public Criteria andRowfilterNotBetween(String value1, String value2) {
            addCriterion("rowfilter not between", value1, value2, "rowfilter");
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