package com.pool.readio.readiombg.model;

import java.util.ArrayList;
import java.util.List;

public class PgParameterAclExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PgParameterAclExample() {
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

        public Criteria andParnameIsNull() {
            addCriterion("parname is null");
            return (Criteria) this;
        }

        public Criteria andParnameIsNotNull() {
            addCriterion("parname is not null");
            return (Criteria) this;
        }

        public Criteria andParnameEqualTo(String value) {
            addCriterion("parname =", value, "parname");
            return (Criteria) this;
        }

        public Criteria andParnameNotEqualTo(String value) {
            addCriterion("parname <>", value, "parname");
            return (Criteria) this;
        }

        public Criteria andParnameGreaterThan(String value) {
            addCriterion("parname >", value, "parname");
            return (Criteria) this;
        }

        public Criteria andParnameGreaterThanOrEqualTo(String value) {
            addCriterion("parname >=", value, "parname");
            return (Criteria) this;
        }

        public Criteria andParnameLessThan(String value) {
            addCriterion("parname <", value, "parname");
            return (Criteria) this;
        }

        public Criteria andParnameLessThanOrEqualTo(String value) {
            addCriterion("parname <=", value, "parname");
            return (Criteria) this;
        }

        public Criteria andParnameLike(String value) {
            addCriterion("parname like", value, "parname");
            return (Criteria) this;
        }

        public Criteria andParnameNotLike(String value) {
            addCriterion("parname not like", value, "parname");
            return (Criteria) this;
        }

        public Criteria andParnameIn(List<String> values) {
            addCriterion("parname in", values, "parname");
            return (Criteria) this;
        }

        public Criteria andParnameNotIn(List<String> values) {
            addCriterion("parname not in", values, "parname");
            return (Criteria) this;
        }

        public Criteria andParnameBetween(String value1, String value2) {
            addCriterion("parname between", value1, value2, "parname");
            return (Criteria) this;
        }

        public Criteria andParnameNotBetween(String value1, String value2) {
            addCriterion("parname not between", value1, value2, "parname");
            return (Criteria) this;
        }

        public Criteria andParaclIsNull() {
            addCriterion("paracl is null");
            return (Criteria) this;
        }

        public Criteria andParaclIsNotNull() {
            addCriterion("paracl is not null");
            return (Criteria) this;
        }

        public Criteria andParaclEqualTo(Object value) {
            addCriterion("paracl =", value, "paracl");
            return (Criteria) this;
        }

        public Criteria andParaclNotEqualTo(Object value) {
            addCriterion("paracl <>", value, "paracl");
            return (Criteria) this;
        }

        public Criteria andParaclGreaterThan(Object value) {
            addCriterion("paracl >", value, "paracl");
            return (Criteria) this;
        }

        public Criteria andParaclGreaterThanOrEqualTo(Object value) {
            addCriterion("paracl >=", value, "paracl");
            return (Criteria) this;
        }

        public Criteria andParaclLessThan(Object value) {
            addCriterion("paracl <", value, "paracl");
            return (Criteria) this;
        }

        public Criteria andParaclLessThanOrEqualTo(Object value) {
            addCriterion("paracl <=", value, "paracl");
            return (Criteria) this;
        }

        public Criteria andParaclIn(List<Object> values) {
            addCriterion("paracl in", values, "paracl");
            return (Criteria) this;
        }

        public Criteria andParaclNotIn(List<Object> values) {
            addCriterion("paracl not in", values, "paracl");
            return (Criteria) this;
        }

        public Criteria andParaclBetween(Object value1, Object value2) {
            addCriterion("paracl between", value1, value2, "paracl");
            return (Criteria) this;
        }

        public Criteria andParaclNotBetween(Object value1, Object value2) {
            addCriterion("paracl not between", value1, value2, "paracl");
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