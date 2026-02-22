package com.pool.readio.mbg.model;

import java.util.ArrayList;
import java.util.List;

public class PgReplicationOriginStatusExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PgReplicationOriginStatusExample() {
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

        public Criteria andLocalIdIsNull() {
            addCriterion("local_id is null");
            return (Criteria) this;
        }

        public Criteria andLocalIdIsNotNull() {
            addCriterion("local_id is not null");
            return (Criteria) this;
        }

        public Criteria andLocalIdEqualTo(Long value) {
            addCriterion("local_id =", value, "localId");
            return (Criteria) this;
        }

        public Criteria andLocalIdNotEqualTo(Long value) {
            addCriterion("local_id <>", value, "localId");
            return (Criteria) this;
        }

        public Criteria andLocalIdGreaterThan(Long value) {
            addCriterion("local_id >", value, "localId");
            return (Criteria) this;
        }

        public Criteria andLocalIdGreaterThanOrEqualTo(Long value) {
            addCriterion("local_id >=", value, "localId");
            return (Criteria) this;
        }

        public Criteria andLocalIdLessThan(Long value) {
            addCriterion("local_id <", value, "localId");
            return (Criteria) this;
        }

        public Criteria andLocalIdLessThanOrEqualTo(Long value) {
            addCriterion("local_id <=", value, "localId");
            return (Criteria) this;
        }

        public Criteria andLocalIdIn(List<Long> values) {
            addCriterion("local_id in", values, "localId");
            return (Criteria) this;
        }

        public Criteria andLocalIdNotIn(List<Long> values) {
            addCriterion("local_id not in", values, "localId");
            return (Criteria) this;
        }

        public Criteria andLocalIdBetween(Long value1, Long value2) {
            addCriterion("local_id between", value1, value2, "localId");
            return (Criteria) this;
        }

        public Criteria andLocalIdNotBetween(Long value1, Long value2) {
            addCriterion("local_id not between", value1, value2, "localId");
            return (Criteria) this;
        }

        public Criteria andExternalIdIsNull() {
            addCriterion("external_id is null");
            return (Criteria) this;
        }

        public Criteria andExternalIdIsNotNull() {
            addCriterion("external_id is not null");
            return (Criteria) this;
        }

        public Criteria andExternalIdEqualTo(String value) {
            addCriterion("external_id =", value, "externalId");
            return (Criteria) this;
        }

        public Criteria andExternalIdNotEqualTo(String value) {
            addCriterion("external_id <>", value, "externalId");
            return (Criteria) this;
        }

        public Criteria andExternalIdGreaterThan(String value) {
            addCriterion("external_id >", value, "externalId");
            return (Criteria) this;
        }

        public Criteria andExternalIdGreaterThanOrEqualTo(String value) {
            addCriterion("external_id >=", value, "externalId");
            return (Criteria) this;
        }

        public Criteria andExternalIdLessThan(String value) {
            addCriterion("external_id <", value, "externalId");
            return (Criteria) this;
        }

        public Criteria andExternalIdLessThanOrEqualTo(String value) {
            addCriterion("external_id <=", value, "externalId");
            return (Criteria) this;
        }

        public Criteria andExternalIdLike(String value) {
            addCriterion("external_id like", value, "externalId");
            return (Criteria) this;
        }

        public Criteria andExternalIdNotLike(String value) {
            addCriterion("external_id not like", value, "externalId");
            return (Criteria) this;
        }

        public Criteria andExternalIdIn(List<String> values) {
            addCriterion("external_id in", values, "externalId");
            return (Criteria) this;
        }

        public Criteria andExternalIdNotIn(List<String> values) {
            addCriterion("external_id not in", values, "externalId");
            return (Criteria) this;
        }

        public Criteria andExternalIdBetween(String value1, String value2) {
            addCriterion("external_id between", value1, value2, "externalId");
            return (Criteria) this;
        }

        public Criteria andExternalIdNotBetween(String value1, String value2) {
            addCriterion("external_id not between", value1, value2, "externalId");
            return (Criteria) this;
        }

        public Criteria andRemoteLsnIsNull() {
            addCriterion("remote_lsn is null");
            return (Criteria) this;
        }

        public Criteria andRemoteLsnIsNotNull() {
            addCriterion("remote_lsn is not null");
            return (Criteria) this;
        }

        public Criteria andRemoteLsnEqualTo(Object value) {
            addCriterion("remote_lsn =", value, "remoteLsn");
            return (Criteria) this;
        }

        public Criteria andRemoteLsnNotEqualTo(Object value) {
            addCriterion("remote_lsn <>", value, "remoteLsn");
            return (Criteria) this;
        }

        public Criteria andRemoteLsnGreaterThan(Object value) {
            addCriterion("remote_lsn >", value, "remoteLsn");
            return (Criteria) this;
        }

        public Criteria andRemoteLsnGreaterThanOrEqualTo(Object value) {
            addCriterion("remote_lsn >=", value, "remoteLsn");
            return (Criteria) this;
        }

        public Criteria andRemoteLsnLessThan(Object value) {
            addCriterion("remote_lsn <", value, "remoteLsn");
            return (Criteria) this;
        }

        public Criteria andRemoteLsnLessThanOrEqualTo(Object value) {
            addCriterion("remote_lsn <=", value, "remoteLsn");
            return (Criteria) this;
        }

        public Criteria andRemoteLsnIn(List<Object> values) {
            addCriterion("remote_lsn in", values, "remoteLsn");
            return (Criteria) this;
        }

        public Criteria andRemoteLsnNotIn(List<Object> values) {
            addCriterion("remote_lsn not in", values, "remoteLsn");
            return (Criteria) this;
        }

        public Criteria andRemoteLsnBetween(Object value1, Object value2) {
            addCriterion("remote_lsn between", value1, value2, "remoteLsn");
            return (Criteria) this;
        }

        public Criteria andRemoteLsnNotBetween(Object value1, Object value2) {
            addCriterion("remote_lsn not between", value1, value2, "remoteLsn");
            return (Criteria) this;
        }

        public Criteria andLocalLsnIsNull() {
            addCriterion("local_lsn is null");
            return (Criteria) this;
        }

        public Criteria andLocalLsnIsNotNull() {
            addCriterion("local_lsn is not null");
            return (Criteria) this;
        }

        public Criteria andLocalLsnEqualTo(Object value) {
            addCriterion("local_lsn =", value, "localLsn");
            return (Criteria) this;
        }

        public Criteria andLocalLsnNotEqualTo(Object value) {
            addCriterion("local_lsn <>", value, "localLsn");
            return (Criteria) this;
        }

        public Criteria andLocalLsnGreaterThan(Object value) {
            addCriterion("local_lsn >", value, "localLsn");
            return (Criteria) this;
        }

        public Criteria andLocalLsnGreaterThanOrEqualTo(Object value) {
            addCriterion("local_lsn >=", value, "localLsn");
            return (Criteria) this;
        }

        public Criteria andLocalLsnLessThan(Object value) {
            addCriterion("local_lsn <", value, "localLsn");
            return (Criteria) this;
        }

        public Criteria andLocalLsnLessThanOrEqualTo(Object value) {
            addCriterion("local_lsn <=", value, "localLsn");
            return (Criteria) this;
        }

        public Criteria andLocalLsnIn(List<Object> values) {
            addCriterion("local_lsn in", values, "localLsn");
            return (Criteria) this;
        }

        public Criteria andLocalLsnNotIn(List<Object> values) {
            addCriterion("local_lsn not in", values, "localLsn");
            return (Criteria) this;
        }

        public Criteria andLocalLsnBetween(Object value1, Object value2) {
            addCriterion("local_lsn between", value1, value2, "localLsn");
            return (Criteria) this;
        }

        public Criteria andLocalLsnNotBetween(Object value1, Object value2) {
            addCriterion("local_lsn not between", value1, value2, "localLsn");
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