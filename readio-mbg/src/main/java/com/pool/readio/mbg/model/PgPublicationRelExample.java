package com.pool.readio.mbg.model;

import java.util.ArrayList;
import java.util.List;

public class PgPublicationRelExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PgPublicationRelExample() {
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

        public Criteria andPrpubidIsNull() {
            addCriterion("prpubid is null");
            return (Criteria) this;
        }

        public Criteria andPrpubidIsNotNull() {
            addCriterion("prpubid is not null");
            return (Criteria) this;
        }

        public Criteria andPrpubidEqualTo(Long value) {
            addCriterion("prpubid =", value, "prpubid");
            return (Criteria) this;
        }

        public Criteria andPrpubidNotEqualTo(Long value) {
            addCriterion("prpubid <>", value, "prpubid");
            return (Criteria) this;
        }

        public Criteria andPrpubidGreaterThan(Long value) {
            addCriterion("prpubid >", value, "prpubid");
            return (Criteria) this;
        }

        public Criteria andPrpubidGreaterThanOrEqualTo(Long value) {
            addCriterion("prpubid >=", value, "prpubid");
            return (Criteria) this;
        }

        public Criteria andPrpubidLessThan(Long value) {
            addCriterion("prpubid <", value, "prpubid");
            return (Criteria) this;
        }

        public Criteria andPrpubidLessThanOrEqualTo(Long value) {
            addCriterion("prpubid <=", value, "prpubid");
            return (Criteria) this;
        }

        public Criteria andPrpubidIn(List<Long> values) {
            addCriterion("prpubid in", values, "prpubid");
            return (Criteria) this;
        }

        public Criteria andPrpubidNotIn(List<Long> values) {
            addCriterion("prpubid not in", values, "prpubid");
            return (Criteria) this;
        }

        public Criteria andPrpubidBetween(Long value1, Long value2) {
            addCriterion("prpubid between", value1, value2, "prpubid");
            return (Criteria) this;
        }

        public Criteria andPrpubidNotBetween(Long value1, Long value2) {
            addCriterion("prpubid not between", value1, value2, "prpubid");
            return (Criteria) this;
        }

        public Criteria andPrrelidIsNull() {
            addCriterion("prrelid is null");
            return (Criteria) this;
        }

        public Criteria andPrrelidIsNotNull() {
            addCriterion("prrelid is not null");
            return (Criteria) this;
        }

        public Criteria andPrrelidEqualTo(Long value) {
            addCriterion("prrelid =", value, "prrelid");
            return (Criteria) this;
        }

        public Criteria andPrrelidNotEqualTo(Long value) {
            addCriterion("prrelid <>", value, "prrelid");
            return (Criteria) this;
        }

        public Criteria andPrrelidGreaterThan(Long value) {
            addCriterion("prrelid >", value, "prrelid");
            return (Criteria) this;
        }

        public Criteria andPrrelidGreaterThanOrEqualTo(Long value) {
            addCriterion("prrelid >=", value, "prrelid");
            return (Criteria) this;
        }

        public Criteria andPrrelidLessThan(Long value) {
            addCriterion("prrelid <", value, "prrelid");
            return (Criteria) this;
        }

        public Criteria andPrrelidLessThanOrEqualTo(Long value) {
            addCriterion("prrelid <=", value, "prrelid");
            return (Criteria) this;
        }

        public Criteria andPrrelidIn(List<Long> values) {
            addCriterion("prrelid in", values, "prrelid");
            return (Criteria) this;
        }

        public Criteria andPrrelidNotIn(List<Long> values) {
            addCriterion("prrelid not in", values, "prrelid");
            return (Criteria) this;
        }

        public Criteria andPrrelidBetween(Long value1, Long value2) {
            addCriterion("prrelid between", value1, value2, "prrelid");
            return (Criteria) this;
        }

        public Criteria andPrrelidNotBetween(Long value1, Long value2) {
            addCriterion("prrelid not between", value1, value2, "prrelid");
            return (Criteria) this;
        }

        public Criteria andPrqualIsNull() {
            addCriterion("prqual is null");
            return (Criteria) this;
        }

        public Criteria andPrqualIsNotNull() {
            addCriterion("prqual is not null");
            return (Criteria) this;
        }

        public Criteria andPrqualEqualTo(Object value) {
            addCriterion("prqual =", value, "prqual");
            return (Criteria) this;
        }

        public Criteria andPrqualNotEqualTo(Object value) {
            addCriterion("prqual <>", value, "prqual");
            return (Criteria) this;
        }

        public Criteria andPrqualGreaterThan(Object value) {
            addCriterion("prqual >", value, "prqual");
            return (Criteria) this;
        }

        public Criteria andPrqualGreaterThanOrEqualTo(Object value) {
            addCriterion("prqual >=", value, "prqual");
            return (Criteria) this;
        }

        public Criteria andPrqualLessThan(Object value) {
            addCriterion("prqual <", value, "prqual");
            return (Criteria) this;
        }

        public Criteria andPrqualLessThanOrEqualTo(Object value) {
            addCriterion("prqual <=", value, "prqual");
            return (Criteria) this;
        }

        public Criteria andPrqualIn(List<Object> values) {
            addCriterion("prqual in", values, "prqual");
            return (Criteria) this;
        }

        public Criteria andPrqualNotIn(List<Object> values) {
            addCriterion("prqual not in", values, "prqual");
            return (Criteria) this;
        }

        public Criteria andPrqualBetween(Object value1, Object value2) {
            addCriterion("prqual between", value1, value2, "prqual");
            return (Criteria) this;
        }

        public Criteria andPrqualNotBetween(Object value1, Object value2) {
            addCriterion("prqual not between", value1, value2, "prqual");
            return (Criteria) this;
        }

        public Criteria andPrattrsIsNull() {
            addCriterion("prattrs is null");
            return (Criteria) this;
        }

        public Criteria andPrattrsIsNotNull() {
            addCriterion("prattrs is not null");
            return (Criteria) this;
        }

        public Criteria andPrattrsEqualTo(Object value) {
            addCriterion("prattrs =", value, "prattrs");
            return (Criteria) this;
        }

        public Criteria andPrattrsNotEqualTo(Object value) {
            addCriterion("prattrs <>", value, "prattrs");
            return (Criteria) this;
        }

        public Criteria andPrattrsGreaterThan(Object value) {
            addCriterion("prattrs >", value, "prattrs");
            return (Criteria) this;
        }

        public Criteria andPrattrsGreaterThanOrEqualTo(Object value) {
            addCriterion("prattrs >=", value, "prattrs");
            return (Criteria) this;
        }

        public Criteria andPrattrsLessThan(Object value) {
            addCriterion("prattrs <", value, "prattrs");
            return (Criteria) this;
        }

        public Criteria andPrattrsLessThanOrEqualTo(Object value) {
            addCriterion("prattrs <=", value, "prattrs");
            return (Criteria) this;
        }

        public Criteria andPrattrsIn(List<Object> values) {
            addCriterion("prattrs in", values, "prattrs");
            return (Criteria) this;
        }

        public Criteria andPrattrsNotIn(List<Object> values) {
            addCriterion("prattrs not in", values, "prattrs");
            return (Criteria) this;
        }

        public Criteria andPrattrsBetween(Object value1, Object value2) {
            addCriterion("prattrs between", value1, value2, "prattrs");
            return (Criteria) this;
        }

        public Criteria andPrattrsNotBetween(Object value1, Object value2) {
            addCriterion("prattrs not between", value1, value2, "prattrs");
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