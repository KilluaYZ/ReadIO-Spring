package com.pool.readio.readiombg.model;

import java.util.ArrayList;
import java.util.List;

public class PgStatGssapiExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PgStatGssapiExample() {
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

        public Criteria andPidIsNull() {
            addCriterion("pid is null");
            return (Criteria) this;
        }

        public Criteria andPidIsNotNull() {
            addCriterion("pid is not null");
            return (Criteria) this;
        }

        public Criteria andPidEqualTo(Integer value) {
            addCriterion("pid =", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidNotEqualTo(Integer value) {
            addCriterion("pid <>", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidGreaterThan(Integer value) {
            addCriterion("pid >", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidGreaterThanOrEqualTo(Integer value) {
            addCriterion("pid >=", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidLessThan(Integer value) {
            addCriterion("pid <", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidLessThanOrEqualTo(Integer value) {
            addCriterion("pid <=", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidIn(List<Integer> values) {
            addCriterion("pid in", values, "pid");
            return (Criteria) this;
        }

        public Criteria andPidNotIn(List<Integer> values) {
            addCriterion("pid not in", values, "pid");
            return (Criteria) this;
        }

        public Criteria andPidBetween(Integer value1, Integer value2) {
            addCriterion("pid between", value1, value2, "pid");
            return (Criteria) this;
        }

        public Criteria andPidNotBetween(Integer value1, Integer value2) {
            addCriterion("pid not between", value1, value2, "pid");
            return (Criteria) this;
        }

        public Criteria andGssAuthenticatedIsNull() {
            addCriterion("gss_authenticated is null");
            return (Criteria) this;
        }

        public Criteria andGssAuthenticatedIsNotNull() {
            addCriterion("gss_authenticated is not null");
            return (Criteria) this;
        }

        public Criteria andGssAuthenticatedEqualTo(Boolean value) {
            addCriterion("gss_authenticated =", value, "gssAuthenticated");
            return (Criteria) this;
        }

        public Criteria andGssAuthenticatedNotEqualTo(Boolean value) {
            addCriterion("gss_authenticated <>", value, "gssAuthenticated");
            return (Criteria) this;
        }

        public Criteria andGssAuthenticatedGreaterThan(Boolean value) {
            addCriterion("gss_authenticated >", value, "gssAuthenticated");
            return (Criteria) this;
        }

        public Criteria andGssAuthenticatedGreaterThanOrEqualTo(Boolean value) {
            addCriterion("gss_authenticated >=", value, "gssAuthenticated");
            return (Criteria) this;
        }

        public Criteria andGssAuthenticatedLessThan(Boolean value) {
            addCriterion("gss_authenticated <", value, "gssAuthenticated");
            return (Criteria) this;
        }

        public Criteria andGssAuthenticatedLessThanOrEqualTo(Boolean value) {
            addCriterion("gss_authenticated <=", value, "gssAuthenticated");
            return (Criteria) this;
        }

        public Criteria andGssAuthenticatedIn(List<Boolean> values) {
            addCriterion("gss_authenticated in", values, "gssAuthenticated");
            return (Criteria) this;
        }

        public Criteria andGssAuthenticatedNotIn(List<Boolean> values) {
            addCriterion("gss_authenticated not in", values, "gssAuthenticated");
            return (Criteria) this;
        }

        public Criteria andGssAuthenticatedBetween(Boolean value1, Boolean value2) {
            addCriterion("gss_authenticated between", value1, value2, "gssAuthenticated");
            return (Criteria) this;
        }

        public Criteria andGssAuthenticatedNotBetween(Boolean value1, Boolean value2) {
            addCriterion("gss_authenticated not between", value1, value2, "gssAuthenticated");
            return (Criteria) this;
        }

        public Criteria andPrincipalIsNull() {
            addCriterion("principal is null");
            return (Criteria) this;
        }

        public Criteria andPrincipalIsNotNull() {
            addCriterion("principal is not null");
            return (Criteria) this;
        }

        public Criteria andPrincipalEqualTo(String value) {
            addCriterion("principal =", value, "principal");
            return (Criteria) this;
        }

        public Criteria andPrincipalNotEqualTo(String value) {
            addCriterion("principal <>", value, "principal");
            return (Criteria) this;
        }

        public Criteria andPrincipalGreaterThan(String value) {
            addCriterion("principal >", value, "principal");
            return (Criteria) this;
        }

        public Criteria andPrincipalGreaterThanOrEqualTo(String value) {
            addCriterion("principal >=", value, "principal");
            return (Criteria) this;
        }

        public Criteria andPrincipalLessThan(String value) {
            addCriterion("principal <", value, "principal");
            return (Criteria) this;
        }

        public Criteria andPrincipalLessThanOrEqualTo(String value) {
            addCriterion("principal <=", value, "principal");
            return (Criteria) this;
        }

        public Criteria andPrincipalLike(String value) {
            addCriterion("principal like", value, "principal");
            return (Criteria) this;
        }

        public Criteria andPrincipalNotLike(String value) {
            addCriterion("principal not like", value, "principal");
            return (Criteria) this;
        }

        public Criteria andPrincipalIn(List<String> values) {
            addCriterion("principal in", values, "principal");
            return (Criteria) this;
        }

        public Criteria andPrincipalNotIn(List<String> values) {
            addCriterion("principal not in", values, "principal");
            return (Criteria) this;
        }

        public Criteria andPrincipalBetween(String value1, String value2) {
            addCriterion("principal between", value1, value2, "principal");
            return (Criteria) this;
        }

        public Criteria andPrincipalNotBetween(String value1, String value2) {
            addCriterion("principal not between", value1, value2, "principal");
            return (Criteria) this;
        }

        public Criteria andEncryptedIsNull() {
            addCriterion("encrypted is null");
            return (Criteria) this;
        }

        public Criteria andEncryptedIsNotNull() {
            addCriterion("encrypted is not null");
            return (Criteria) this;
        }

        public Criteria andEncryptedEqualTo(Boolean value) {
            addCriterion("encrypted =", value, "encrypted");
            return (Criteria) this;
        }

        public Criteria andEncryptedNotEqualTo(Boolean value) {
            addCriterion("encrypted <>", value, "encrypted");
            return (Criteria) this;
        }

        public Criteria andEncryptedGreaterThan(Boolean value) {
            addCriterion("encrypted >", value, "encrypted");
            return (Criteria) this;
        }

        public Criteria andEncryptedGreaterThanOrEqualTo(Boolean value) {
            addCriterion("encrypted >=", value, "encrypted");
            return (Criteria) this;
        }

        public Criteria andEncryptedLessThan(Boolean value) {
            addCriterion("encrypted <", value, "encrypted");
            return (Criteria) this;
        }

        public Criteria andEncryptedLessThanOrEqualTo(Boolean value) {
            addCriterion("encrypted <=", value, "encrypted");
            return (Criteria) this;
        }

        public Criteria andEncryptedIn(List<Boolean> values) {
            addCriterion("encrypted in", values, "encrypted");
            return (Criteria) this;
        }

        public Criteria andEncryptedNotIn(List<Boolean> values) {
            addCriterion("encrypted not in", values, "encrypted");
            return (Criteria) this;
        }

        public Criteria andEncryptedBetween(Boolean value1, Boolean value2) {
            addCriterion("encrypted between", value1, value2, "encrypted");
            return (Criteria) this;
        }

        public Criteria andEncryptedNotBetween(Boolean value1, Boolean value2) {
            addCriterion("encrypted not between", value1, value2, "encrypted");
            return (Criteria) this;
        }

        public Criteria andCredentialsDelegatedIsNull() {
            addCriterion("credentials_delegated is null");
            return (Criteria) this;
        }

        public Criteria andCredentialsDelegatedIsNotNull() {
            addCriterion("credentials_delegated is not null");
            return (Criteria) this;
        }

        public Criteria andCredentialsDelegatedEqualTo(Boolean value) {
            addCriterion("credentials_delegated =", value, "credentialsDelegated");
            return (Criteria) this;
        }

        public Criteria andCredentialsDelegatedNotEqualTo(Boolean value) {
            addCriterion("credentials_delegated <>", value, "credentialsDelegated");
            return (Criteria) this;
        }

        public Criteria andCredentialsDelegatedGreaterThan(Boolean value) {
            addCriterion("credentials_delegated >", value, "credentialsDelegated");
            return (Criteria) this;
        }

        public Criteria andCredentialsDelegatedGreaterThanOrEqualTo(Boolean value) {
            addCriterion("credentials_delegated >=", value, "credentialsDelegated");
            return (Criteria) this;
        }

        public Criteria andCredentialsDelegatedLessThan(Boolean value) {
            addCriterion("credentials_delegated <", value, "credentialsDelegated");
            return (Criteria) this;
        }

        public Criteria andCredentialsDelegatedLessThanOrEqualTo(Boolean value) {
            addCriterion("credentials_delegated <=", value, "credentialsDelegated");
            return (Criteria) this;
        }

        public Criteria andCredentialsDelegatedIn(List<Boolean> values) {
            addCriterion("credentials_delegated in", values, "credentialsDelegated");
            return (Criteria) this;
        }

        public Criteria andCredentialsDelegatedNotIn(List<Boolean> values) {
            addCriterion("credentials_delegated not in", values, "credentialsDelegated");
            return (Criteria) this;
        }

        public Criteria andCredentialsDelegatedBetween(Boolean value1, Boolean value2) {
            addCriterion("credentials_delegated between", value1, value2, "credentialsDelegated");
            return (Criteria) this;
        }

        public Criteria andCredentialsDelegatedNotBetween(Boolean value1, Boolean value2) {
            addCriterion("credentials_delegated not between", value1, value2, "credentialsDelegated");
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