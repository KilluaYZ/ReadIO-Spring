package com.pool.readio.mbg.model;

import java.util.ArrayList;
import java.util.List;

public class PgTransformExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PgTransformExample() {
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

        public Criteria andOidIsNull() {
            addCriterion("oid is null");
            return (Criteria) this;
        }

        public Criteria andOidIsNotNull() {
            addCriterion("oid is not null");
            return (Criteria) this;
        }

        public Criteria andOidEqualTo(Long value) {
            addCriterion("oid =", value, "oid");
            return (Criteria) this;
        }

        public Criteria andOidNotEqualTo(Long value) {
            addCriterion("oid <>", value, "oid");
            return (Criteria) this;
        }

        public Criteria andOidGreaterThan(Long value) {
            addCriterion("oid >", value, "oid");
            return (Criteria) this;
        }

        public Criteria andOidGreaterThanOrEqualTo(Long value) {
            addCriterion("oid >=", value, "oid");
            return (Criteria) this;
        }

        public Criteria andOidLessThan(Long value) {
            addCriterion("oid <", value, "oid");
            return (Criteria) this;
        }

        public Criteria andOidLessThanOrEqualTo(Long value) {
            addCriterion("oid <=", value, "oid");
            return (Criteria) this;
        }

        public Criteria andOidIn(List<Long> values) {
            addCriterion("oid in", values, "oid");
            return (Criteria) this;
        }

        public Criteria andOidNotIn(List<Long> values) {
            addCriterion("oid not in", values, "oid");
            return (Criteria) this;
        }

        public Criteria andOidBetween(Long value1, Long value2) {
            addCriterion("oid between", value1, value2, "oid");
            return (Criteria) this;
        }

        public Criteria andOidNotBetween(Long value1, Long value2) {
            addCriterion("oid not between", value1, value2, "oid");
            return (Criteria) this;
        }

        public Criteria andTrftypeIsNull() {
            addCriterion("trftype is null");
            return (Criteria) this;
        }

        public Criteria andTrftypeIsNotNull() {
            addCriterion("trftype is not null");
            return (Criteria) this;
        }

        public Criteria andTrftypeEqualTo(Long value) {
            addCriterion("trftype =", value, "trftype");
            return (Criteria) this;
        }

        public Criteria andTrftypeNotEqualTo(Long value) {
            addCriterion("trftype <>", value, "trftype");
            return (Criteria) this;
        }

        public Criteria andTrftypeGreaterThan(Long value) {
            addCriterion("trftype >", value, "trftype");
            return (Criteria) this;
        }

        public Criteria andTrftypeGreaterThanOrEqualTo(Long value) {
            addCriterion("trftype >=", value, "trftype");
            return (Criteria) this;
        }

        public Criteria andTrftypeLessThan(Long value) {
            addCriterion("trftype <", value, "trftype");
            return (Criteria) this;
        }

        public Criteria andTrftypeLessThanOrEqualTo(Long value) {
            addCriterion("trftype <=", value, "trftype");
            return (Criteria) this;
        }

        public Criteria andTrftypeIn(List<Long> values) {
            addCriterion("trftype in", values, "trftype");
            return (Criteria) this;
        }

        public Criteria andTrftypeNotIn(List<Long> values) {
            addCriterion("trftype not in", values, "trftype");
            return (Criteria) this;
        }

        public Criteria andTrftypeBetween(Long value1, Long value2) {
            addCriterion("trftype between", value1, value2, "trftype");
            return (Criteria) this;
        }

        public Criteria andTrftypeNotBetween(Long value1, Long value2) {
            addCriterion("trftype not between", value1, value2, "trftype");
            return (Criteria) this;
        }

        public Criteria andTrflangIsNull() {
            addCriterion("trflang is null");
            return (Criteria) this;
        }

        public Criteria andTrflangIsNotNull() {
            addCriterion("trflang is not null");
            return (Criteria) this;
        }

        public Criteria andTrflangEqualTo(Long value) {
            addCriterion("trflang =", value, "trflang");
            return (Criteria) this;
        }

        public Criteria andTrflangNotEqualTo(Long value) {
            addCriterion("trflang <>", value, "trflang");
            return (Criteria) this;
        }

        public Criteria andTrflangGreaterThan(Long value) {
            addCriterion("trflang >", value, "trflang");
            return (Criteria) this;
        }

        public Criteria andTrflangGreaterThanOrEqualTo(Long value) {
            addCriterion("trflang >=", value, "trflang");
            return (Criteria) this;
        }

        public Criteria andTrflangLessThan(Long value) {
            addCriterion("trflang <", value, "trflang");
            return (Criteria) this;
        }

        public Criteria andTrflangLessThanOrEqualTo(Long value) {
            addCriterion("trflang <=", value, "trflang");
            return (Criteria) this;
        }

        public Criteria andTrflangIn(List<Long> values) {
            addCriterion("trflang in", values, "trflang");
            return (Criteria) this;
        }

        public Criteria andTrflangNotIn(List<Long> values) {
            addCriterion("trflang not in", values, "trflang");
            return (Criteria) this;
        }

        public Criteria andTrflangBetween(Long value1, Long value2) {
            addCriterion("trflang between", value1, value2, "trflang");
            return (Criteria) this;
        }

        public Criteria andTrflangNotBetween(Long value1, Long value2) {
            addCriterion("trflang not between", value1, value2, "trflang");
            return (Criteria) this;
        }

        public Criteria andTrffromsqlIsNull() {
            addCriterion("trffromsql is null");
            return (Criteria) this;
        }

        public Criteria andTrffromsqlIsNotNull() {
            addCriterion("trffromsql is not null");
            return (Criteria) this;
        }

        public Criteria andTrffromsqlEqualTo(Object value) {
            addCriterion("trffromsql =", value, "trffromsql");
            return (Criteria) this;
        }

        public Criteria andTrffromsqlNotEqualTo(Object value) {
            addCriterion("trffromsql <>", value, "trffromsql");
            return (Criteria) this;
        }

        public Criteria andTrffromsqlGreaterThan(Object value) {
            addCriterion("trffromsql >", value, "trffromsql");
            return (Criteria) this;
        }

        public Criteria andTrffromsqlGreaterThanOrEqualTo(Object value) {
            addCriterion("trffromsql >=", value, "trffromsql");
            return (Criteria) this;
        }

        public Criteria andTrffromsqlLessThan(Object value) {
            addCriterion("trffromsql <", value, "trffromsql");
            return (Criteria) this;
        }

        public Criteria andTrffromsqlLessThanOrEqualTo(Object value) {
            addCriterion("trffromsql <=", value, "trffromsql");
            return (Criteria) this;
        }

        public Criteria andTrffromsqlIn(List<Object> values) {
            addCriterion("trffromsql in", values, "trffromsql");
            return (Criteria) this;
        }

        public Criteria andTrffromsqlNotIn(List<Object> values) {
            addCriterion("trffromsql not in", values, "trffromsql");
            return (Criteria) this;
        }

        public Criteria andTrffromsqlBetween(Object value1, Object value2) {
            addCriterion("trffromsql between", value1, value2, "trffromsql");
            return (Criteria) this;
        }

        public Criteria andTrffromsqlNotBetween(Object value1, Object value2) {
            addCriterion("trffromsql not between", value1, value2, "trffromsql");
            return (Criteria) this;
        }

        public Criteria andTrftosqlIsNull() {
            addCriterion("trftosql is null");
            return (Criteria) this;
        }

        public Criteria andTrftosqlIsNotNull() {
            addCriterion("trftosql is not null");
            return (Criteria) this;
        }

        public Criteria andTrftosqlEqualTo(Object value) {
            addCriterion("trftosql =", value, "trftosql");
            return (Criteria) this;
        }

        public Criteria andTrftosqlNotEqualTo(Object value) {
            addCriterion("trftosql <>", value, "trftosql");
            return (Criteria) this;
        }

        public Criteria andTrftosqlGreaterThan(Object value) {
            addCriterion("trftosql >", value, "trftosql");
            return (Criteria) this;
        }

        public Criteria andTrftosqlGreaterThanOrEqualTo(Object value) {
            addCriterion("trftosql >=", value, "trftosql");
            return (Criteria) this;
        }

        public Criteria andTrftosqlLessThan(Object value) {
            addCriterion("trftosql <", value, "trftosql");
            return (Criteria) this;
        }

        public Criteria andTrftosqlLessThanOrEqualTo(Object value) {
            addCriterion("trftosql <=", value, "trftosql");
            return (Criteria) this;
        }

        public Criteria andTrftosqlIn(List<Object> values) {
            addCriterion("trftosql in", values, "trftosql");
            return (Criteria) this;
        }

        public Criteria andTrftosqlNotIn(List<Object> values) {
            addCriterion("trftosql not in", values, "trftosql");
            return (Criteria) this;
        }

        public Criteria andTrftosqlBetween(Object value1, Object value2) {
            addCriterion("trftosql between", value1, value2, "trftosql");
            return (Criteria) this;
        }

        public Criteria andTrftosqlNotBetween(Object value1, Object value2) {
            addCriterion("trftosql not between", value1, value2, "trftosql");
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