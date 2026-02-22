package com.pool.readio.readiombg.model;

import java.util.ArrayList;
import java.util.List;

public class PgSubscriptionRelExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PgSubscriptionRelExample() {
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

        public Criteria andSrrelidIsNull() {
            addCriterion("srrelid is null");
            return (Criteria) this;
        }

        public Criteria andSrrelidIsNotNull() {
            addCriterion("srrelid is not null");
            return (Criteria) this;
        }

        public Criteria andSrrelidEqualTo(Long value) {
            addCriterion("srrelid =", value, "srrelid");
            return (Criteria) this;
        }

        public Criteria andSrrelidNotEqualTo(Long value) {
            addCriterion("srrelid <>", value, "srrelid");
            return (Criteria) this;
        }

        public Criteria andSrrelidGreaterThan(Long value) {
            addCriterion("srrelid >", value, "srrelid");
            return (Criteria) this;
        }

        public Criteria andSrrelidGreaterThanOrEqualTo(Long value) {
            addCriterion("srrelid >=", value, "srrelid");
            return (Criteria) this;
        }

        public Criteria andSrrelidLessThan(Long value) {
            addCriterion("srrelid <", value, "srrelid");
            return (Criteria) this;
        }

        public Criteria andSrrelidLessThanOrEqualTo(Long value) {
            addCriterion("srrelid <=", value, "srrelid");
            return (Criteria) this;
        }

        public Criteria andSrrelidIn(List<Long> values) {
            addCriterion("srrelid in", values, "srrelid");
            return (Criteria) this;
        }

        public Criteria andSrrelidNotIn(List<Long> values) {
            addCriterion("srrelid not in", values, "srrelid");
            return (Criteria) this;
        }

        public Criteria andSrrelidBetween(Long value1, Long value2) {
            addCriterion("srrelid between", value1, value2, "srrelid");
            return (Criteria) this;
        }

        public Criteria andSrrelidNotBetween(Long value1, Long value2) {
            addCriterion("srrelid not between", value1, value2, "srrelid");
            return (Criteria) this;
        }

        public Criteria andSrsubidIsNull() {
            addCriterion("srsubid is null");
            return (Criteria) this;
        }

        public Criteria andSrsubidIsNotNull() {
            addCriterion("srsubid is not null");
            return (Criteria) this;
        }

        public Criteria andSrsubidEqualTo(Long value) {
            addCriterion("srsubid =", value, "srsubid");
            return (Criteria) this;
        }

        public Criteria andSrsubidNotEqualTo(Long value) {
            addCriterion("srsubid <>", value, "srsubid");
            return (Criteria) this;
        }

        public Criteria andSrsubidGreaterThan(Long value) {
            addCriterion("srsubid >", value, "srsubid");
            return (Criteria) this;
        }

        public Criteria andSrsubidGreaterThanOrEqualTo(Long value) {
            addCriterion("srsubid >=", value, "srsubid");
            return (Criteria) this;
        }

        public Criteria andSrsubidLessThan(Long value) {
            addCriterion("srsubid <", value, "srsubid");
            return (Criteria) this;
        }

        public Criteria andSrsubidLessThanOrEqualTo(Long value) {
            addCriterion("srsubid <=", value, "srsubid");
            return (Criteria) this;
        }

        public Criteria andSrsubidIn(List<Long> values) {
            addCriterion("srsubid in", values, "srsubid");
            return (Criteria) this;
        }

        public Criteria andSrsubidNotIn(List<Long> values) {
            addCriterion("srsubid not in", values, "srsubid");
            return (Criteria) this;
        }

        public Criteria andSrsubidBetween(Long value1, Long value2) {
            addCriterion("srsubid between", value1, value2, "srsubid");
            return (Criteria) this;
        }

        public Criteria andSrsubidNotBetween(Long value1, Long value2) {
            addCriterion("srsubid not between", value1, value2, "srsubid");
            return (Criteria) this;
        }

        public Criteria andSrsubstateIsNull() {
            addCriterion("srsubstate is null");
            return (Criteria) this;
        }

        public Criteria andSrsubstateIsNotNull() {
            addCriterion("srsubstate is not null");
            return (Criteria) this;
        }

        public Criteria andSrsubstateEqualTo(String value) {
            addCriterion("srsubstate =", value, "srsubstate");
            return (Criteria) this;
        }

        public Criteria andSrsubstateNotEqualTo(String value) {
            addCriterion("srsubstate <>", value, "srsubstate");
            return (Criteria) this;
        }

        public Criteria andSrsubstateGreaterThan(String value) {
            addCriterion("srsubstate >", value, "srsubstate");
            return (Criteria) this;
        }

        public Criteria andSrsubstateGreaterThanOrEqualTo(String value) {
            addCriterion("srsubstate >=", value, "srsubstate");
            return (Criteria) this;
        }

        public Criteria andSrsubstateLessThan(String value) {
            addCriterion("srsubstate <", value, "srsubstate");
            return (Criteria) this;
        }

        public Criteria andSrsubstateLessThanOrEqualTo(String value) {
            addCriterion("srsubstate <=", value, "srsubstate");
            return (Criteria) this;
        }

        public Criteria andSrsubstateLike(String value) {
            addCriterion("srsubstate like", value, "srsubstate");
            return (Criteria) this;
        }

        public Criteria andSrsubstateNotLike(String value) {
            addCriterion("srsubstate not like", value, "srsubstate");
            return (Criteria) this;
        }

        public Criteria andSrsubstateIn(List<String> values) {
            addCriterion("srsubstate in", values, "srsubstate");
            return (Criteria) this;
        }

        public Criteria andSrsubstateNotIn(List<String> values) {
            addCriterion("srsubstate not in", values, "srsubstate");
            return (Criteria) this;
        }

        public Criteria andSrsubstateBetween(String value1, String value2) {
            addCriterion("srsubstate between", value1, value2, "srsubstate");
            return (Criteria) this;
        }

        public Criteria andSrsubstateNotBetween(String value1, String value2) {
            addCriterion("srsubstate not between", value1, value2, "srsubstate");
            return (Criteria) this;
        }

        public Criteria andSrsublsnIsNull() {
            addCriterion("srsublsn is null");
            return (Criteria) this;
        }

        public Criteria andSrsublsnIsNotNull() {
            addCriterion("srsublsn is not null");
            return (Criteria) this;
        }

        public Criteria andSrsublsnEqualTo(Object value) {
            addCriterion("srsublsn =", value, "srsublsn");
            return (Criteria) this;
        }

        public Criteria andSrsublsnNotEqualTo(Object value) {
            addCriterion("srsublsn <>", value, "srsublsn");
            return (Criteria) this;
        }

        public Criteria andSrsublsnGreaterThan(Object value) {
            addCriterion("srsublsn >", value, "srsublsn");
            return (Criteria) this;
        }

        public Criteria andSrsublsnGreaterThanOrEqualTo(Object value) {
            addCriterion("srsublsn >=", value, "srsublsn");
            return (Criteria) this;
        }

        public Criteria andSrsublsnLessThan(Object value) {
            addCriterion("srsublsn <", value, "srsublsn");
            return (Criteria) this;
        }

        public Criteria andSrsublsnLessThanOrEqualTo(Object value) {
            addCriterion("srsublsn <=", value, "srsublsn");
            return (Criteria) this;
        }

        public Criteria andSrsublsnIn(List<Object> values) {
            addCriterion("srsublsn in", values, "srsublsn");
            return (Criteria) this;
        }

        public Criteria andSrsublsnNotIn(List<Object> values) {
            addCriterion("srsublsn not in", values, "srsublsn");
            return (Criteria) this;
        }

        public Criteria andSrsublsnBetween(Object value1, Object value2) {
            addCriterion("srsublsn between", value1, value2, "srsublsn");
            return (Criteria) this;
        }

        public Criteria andSrsublsnNotBetween(Object value1, Object value2) {
            addCriterion("srsublsn not between", value1, value2, "srsublsn");
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