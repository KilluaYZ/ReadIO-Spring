package com.pool.readio.mbg.model;

import java.util.ArrayList;
import java.util.List;

public class PgEventTriggerExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PgEventTriggerExample() {
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

        public Criteria andEvtnameIsNull() {
            addCriterion("evtname is null");
            return (Criteria) this;
        }

        public Criteria andEvtnameIsNotNull() {
            addCriterion("evtname is not null");
            return (Criteria) this;
        }

        public Criteria andEvtnameEqualTo(String value) {
            addCriterion("evtname =", value, "evtname");
            return (Criteria) this;
        }

        public Criteria andEvtnameNotEqualTo(String value) {
            addCriterion("evtname <>", value, "evtname");
            return (Criteria) this;
        }

        public Criteria andEvtnameGreaterThan(String value) {
            addCriterion("evtname >", value, "evtname");
            return (Criteria) this;
        }

        public Criteria andEvtnameGreaterThanOrEqualTo(String value) {
            addCriterion("evtname >=", value, "evtname");
            return (Criteria) this;
        }

        public Criteria andEvtnameLessThan(String value) {
            addCriterion("evtname <", value, "evtname");
            return (Criteria) this;
        }

        public Criteria andEvtnameLessThanOrEqualTo(String value) {
            addCriterion("evtname <=", value, "evtname");
            return (Criteria) this;
        }

        public Criteria andEvtnameLike(String value) {
            addCriterion("evtname like", value, "evtname");
            return (Criteria) this;
        }

        public Criteria andEvtnameNotLike(String value) {
            addCriterion("evtname not like", value, "evtname");
            return (Criteria) this;
        }

        public Criteria andEvtnameIn(List<String> values) {
            addCriterion("evtname in", values, "evtname");
            return (Criteria) this;
        }

        public Criteria andEvtnameNotIn(List<String> values) {
            addCriterion("evtname not in", values, "evtname");
            return (Criteria) this;
        }

        public Criteria andEvtnameBetween(String value1, String value2) {
            addCriterion("evtname between", value1, value2, "evtname");
            return (Criteria) this;
        }

        public Criteria andEvtnameNotBetween(String value1, String value2) {
            addCriterion("evtname not between", value1, value2, "evtname");
            return (Criteria) this;
        }

        public Criteria andEvteventIsNull() {
            addCriterion("evtevent is null");
            return (Criteria) this;
        }

        public Criteria andEvteventIsNotNull() {
            addCriterion("evtevent is not null");
            return (Criteria) this;
        }

        public Criteria andEvteventEqualTo(String value) {
            addCriterion("evtevent =", value, "evtevent");
            return (Criteria) this;
        }

        public Criteria andEvteventNotEqualTo(String value) {
            addCriterion("evtevent <>", value, "evtevent");
            return (Criteria) this;
        }

        public Criteria andEvteventGreaterThan(String value) {
            addCriterion("evtevent >", value, "evtevent");
            return (Criteria) this;
        }

        public Criteria andEvteventGreaterThanOrEqualTo(String value) {
            addCriterion("evtevent >=", value, "evtevent");
            return (Criteria) this;
        }

        public Criteria andEvteventLessThan(String value) {
            addCriterion("evtevent <", value, "evtevent");
            return (Criteria) this;
        }

        public Criteria andEvteventLessThanOrEqualTo(String value) {
            addCriterion("evtevent <=", value, "evtevent");
            return (Criteria) this;
        }

        public Criteria andEvteventLike(String value) {
            addCriterion("evtevent like", value, "evtevent");
            return (Criteria) this;
        }

        public Criteria andEvteventNotLike(String value) {
            addCriterion("evtevent not like", value, "evtevent");
            return (Criteria) this;
        }

        public Criteria andEvteventIn(List<String> values) {
            addCriterion("evtevent in", values, "evtevent");
            return (Criteria) this;
        }

        public Criteria andEvteventNotIn(List<String> values) {
            addCriterion("evtevent not in", values, "evtevent");
            return (Criteria) this;
        }

        public Criteria andEvteventBetween(String value1, String value2) {
            addCriterion("evtevent between", value1, value2, "evtevent");
            return (Criteria) this;
        }

        public Criteria andEvteventNotBetween(String value1, String value2) {
            addCriterion("evtevent not between", value1, value2, "evtevent");
            return (Criteria) this;
        }

        public Criteria andEvtownerIsNull() {
            addCriterion("evtowner is null");
            return (Criteria) this;
        }

        public Criteria andEvtownerIsNotNull() {
            addCriterion("evtowner is not null");
            return (Criteria) this;
        }

        public Criteria andEvtownerEqualTo(Long value) {
            addCriterion("evtowner =", value, "evtowner");
            return (Criteria) this;
        }

        public Criteria andEvtownerNotEqualTo(Long value) {
            addCriterion("evtowner <>", value, "evtowner");
            return (Criteria) this;
        }

        public Criteria andEvtownerGreaterThan(Long value) {
            addCriterion("evtowner >", value, "evtowner");
            return (Criteria) this;
        }

        public Criteria andEvtownerGreaterThanOrEqualTo(Long value) {
            addCriterion("evtowner >=", value, "evtowner");
            return (Criteria) this;
        }

        public Criteria andEvtownerLessThan(Long value) {
            addCriterion("evtowner <", value, "evtowner");
            return (Criteria) this;
        }

        public Criteria andEvtownerLessThanOrEqualTo(Long value) {
            addCriterion("evtowner <=", value, "evtowner");
            return (Criteria) this;
        }

        public Criteria andEvtownerIn(List<Long> values) {
            addCriterion("evtowner in", values, "evtowner");
            return (Criteria) this;
        }

        public Criteria andEvtownerNotIn(List<Long> values) {
            addCriterion("evtowner not in", values, "evtowner");
            return (Criteria) this;
        }

        public Criteria andEvtownerBetween(Long value1, Long value2) {
            addCriterion("evtowner between", value1, value2, "evtowner");
            return (Criteria) this;
        }

        public Criteria andEvtownerNotBetween(Long value1, Long value2) {
            addCriterion("evtowner not between", value1, value2, "evtowner");
            return (Criteria) this;
        }

        public Criteria andEvtfoidIsNull() {
            addCriterion("evtfoid is null");
            return (Criteria) this;
        }

        public Criteria andEvtfoidIsNotNull() {
            addCriterion("evtfoid is not null");
            return (Criteria) this;
        }

        public Criteria andEvtfoidEqualTo(Long value) {
            addCriterion("evtfoid =", value, "evtfoid");
            return (Criteria) this;
        }

        public Criteria andEvtfoidNotEqualTo(Long value) {
            addCriterion("evtfoid <>", value, "evtfoid");
            return (Criteria) this;
        }

        public Criteria andEvtfoidGreaterThan(Long value) {
            addCriterion("evtfoid >", value, "evtfoid");
            return (Criteria) this;
        }

        public Criteria andEvtfoidGreaterThanOrEqualTo(Long value) {
            addCriterion("evtfoid >=", value, "evtfoid");
            return (Criteria) this;
        }

        public Criteria andEvtfoidLessThan(Long value) {
            addCriterion("evtfoid <", value, "evtfoid");
            return (Criteria) this;
        }

        public Criteria andEvtfoidLessThanOrEqualTo(Long value) {
            addCriterion("evtfoid <=", value, "evtfoid");
            return (Criteria) this;
        }

        public Criteria andEvtfoidIn(List<Long> values) {
            addCriterion("evtfoid in", values, "evtfoid");
            return (Criteria) this;
        }

        public Criteria andEvtfoidNotIn(List<Long> values) {
            addCriterion("evtfoid not in", values, "evtfoid");
            return (Criteria) this;
        }

        public Criteria andEvtfoidBetween(Long value1, Long value2) {
            addCriterion("evtfoid between", value1, value2, "evtfoid");
            return (Criteria) this;
        }

        public Criteria andEvtfoidNotBetween(Long value1, Long value2) {
            addCriterion("evtfoid not between", value1, value2, "evtfoid");
            return (Criteria) this;
        }

        public Criteria andEvtenabledIsNull() {
            addCriterion("evtenabled is null");
            return (Criteria) this;
        }

        public Criteria andEvtenabledIsNotNull() {
            addCriterion("evtenabled is not null");
            return (Criteria) this;
        }

        public Criteria andEvtenabledEqualTo(String value) {
            addCriterion("evtenabled =", value, "evtenabled");
            return (Criteria) this;
        }

        public Criteria andEvtenabledNotEqualTo(String value) {
            addCriterion("evtenabled <>", value, "evtenabled");
            return (Criteria) this;
        }

        public Criteria andEvtenabledGreaterThan(String value) {
            addCriterion("evtenabled >", value, "evtenabled");
            return (Criteria) this;
        }

        public Criteria andEvtenabledGreaterThanOrEqualTo(String value) {
            addCriterion("evtenabled >=", value, "evtenabled");
            return (Criteria) this;
        }

        public Criteria andEvtenabledLessThan(String value) {
            addCriterion("evtenabled <", value, "evtenabled");
            return (Criteria) this;
        }

        public Criteria andEvtenabledLessThanOrEqualTo(String value) {
            addCriterion("evtenabled <=", value, "evtenabled");
            return (Criteria) this;
        }

        public Criteria andEvtenabledLike(String value) {
            addCriterion("evtenabled like", value, "evtenabled");
            return (Criteria) this;
        }

        public Criteria andEvtenabledNotLike(String value) {
            addCriterion("evtenabled not like", value, "evtenabled");
            return (Criteria) this;
        }

        public Criteria andEvtenabledIn(List<String> values) {
            addCriterion("evtenabled in", values, "evtenabled");
            return (Criteria) this;
        }

        public Criteria andEvtenabledNotIn(List<String> values) {
            addCriterion("evtenabled not in", values, "evtenabled");
            return (Criteria) this;
        }

        public Criteria andEvtenabledBetween(String value1, String value2) {
            addCriterion("evtenabled between", value1, value2, "evtenabled");
            return (Criteria) this;
        }

        public Criteria andEvtenabledNotBetween(String value1, String value2) {
            addCriterion("evtenabled not between", value1, value2, "evtenabled");
            return (Criteria) this;
        }

        public Criteria andEvttagsIsNull() {
            addCriterion("evttags is null");
            return (Criteria) this;
        }

        public Criteria andEvttagsIsNotNull() {
            addCriterion("evttags is not null");
            return (Criteria) this;
        }

        public Criteria andEvttagsEqualTo(Object value) {
            addCriterion("evttags =", value, "evttags");
            return (Criteria) this;
        }

        public Criteria andEvttagsNotEqualTo(Object value) {
            addCriterion("evttags <>", value, "evttags");
            return (Criteria) this;
        }

        public Criteria andEvttagsGreaterThan(Object value) {
            addCriterion("evttags >", value, "evttags");
            return (Criteria) this;
        }

        public Criteria andEvttagsGreaterThanOrEqualTo(Object value) {
            addCriterion("evttags >=", value, "evttags");
            return (Criteria) this;
        }

        public Criteria andEvttagsLessThan(Object value) {
            addCriterion("evttags <", value, "evttags");
            return (Criteria) this;
        }

        public Criteria andEvttagsLessThanOrEqualTo(Object value) {
            addCriterion("evttags <=", value, "evttags");
            return (Criteria) this;
        }

        public Criteria andEvttagsIn(List<Object> values) {
            addCriterion("evttags in", values, "evttags");
            return (Criteria) this;
        }

        public Criteria andEvttagsNotIn(List<Object> values) {
            addCriterion("evttags not in", values, "evttags");
            return (Criteria) this;
        }

        public Criteria andEvttagsBetween(Object value1, Object value2) {
            addCriterion("evttags between", value1, value2, "evttags");
            return (Criteria) this;
        }

        public Criteria andEvttagsNotBetween(Object value1, Object value2) {
            addCriterion("evttags not between", value1, value2, "evttags");
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