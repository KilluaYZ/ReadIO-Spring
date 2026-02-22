package com.pool.readio.mbg.model;

import java.util.ArrayList;
import java.util.List;

public class PgStatSslExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PgStatSslExample() {
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

        public Criteria andSslIsNull() {
            addCriterion("ssl is null");
            return (Criteria) this;
        }

        public Criteria andSslIsNotNull() {
            addCriterion("ssl is not null");
            return (Criteria) this;
        }

        public Criteria andSslEqualTo(Boolean value) {
            addCriterion("ssl =", value, "ssl");
            return (Criteria) this;
        }

        public Criteria andSslNotEqualTo(Boolean value) {
            addCriterion("ssl <>", value, "ssl");
            return (Criteria) this;
        }

        public Criteria andSslGreaterThan(Boolean value) {
            addCriterion("ssl >", value, "ssl");
            return (Criteria) this;
        }

        public Criteria andSslGreaterThanOrEqualTo(Boolean value) {
            addCriterion("ssl >=", value, "ssl");
            return (Criteria) this;
        }

        public Criteria andSslLessThan(Boolean value) {
            addCriterion("ssl <", value, "ssl");
            return (Criteria) this;
        }

        public Criteria andSslLessThanOrEqualTo(Boolean value) {
            addCriterion("ssl <=", value, "ssl");
            return (Criteria) this;
        }

        public Criteria andSslIn(List<Boolean> values) {
            addCriterion("ssl in", values, "ssl");
            return (Criteria) this;
        }

        public Criteria andSslNotIn(List<Boolean> values) {
            addCriterion("ssl not in", values, "ssl");
            return (Criteria) this;
        }

        public Criteria andSslBetween(Boolean value1, Boolean value2) {
            addCriterion("ssl between", value1, value2, "ssl");
            return (Criteria) this;
        }

        public Criteria andSslNotBetween(Boolean value1, Boolean value2) {
            addCriterion("ssl not between", value1, value2, "ssl");
            return (Criteria) this;
        }

        public Criteria andVersionIsNull() {
            addCriterion("version is null");
            return (Criteria) this;
        }

        public Criteria andVersionIsNotNull() {
            addCriterion("version is not null");
            return (Criteria) this;
        }

        public Criteria andVersionEqualTo(String value) {
            addCriterion("version =", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotEqualTo(String value) {
            addCriterion("version <>", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionGreaterThan(String value) {
            addCriterion("version >", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionGreaterThanOrEqualTo(String value) {
            addCriterion("version >=", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionLessThan(String value) {
            addCriterion("version <", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionLessThanOrEqualTo(String value) {
            addCriterion("version <=", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionLike(String value) {
            addCriterion("version like", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotLike(String value) {
            addCriterion("version not like", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionIn(List<String> values) {
            addCriterion("version in", values, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotIn(List<String> values) {
            addCriterion("version not in", values, "version");
            return (Criteria) this;
        }

        public Criteria andVersionBetween(String value1, String value2) {
            addCriterion("version between", value1, value2, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotBetween(String value1, String value2) {
            addCriterion("version not between", value1, value2, "version");
            return (Criteria) this;
        }

        public Criteria andCipherIsNull() {
            addCriterion("cipher is null");
            return (Criteria) this;
        }

        public Criteria andCipherIsNotNull() {
            addCriterion("cipher is not null");
            return (Criteria) this;
        }

        public Criteria andCipherEqualTo(String value) {
            addCriterion("cipher =", value, "cipher");
            return (Criteria) this;
        }

        public Criteria andCipherNotEqualTo(String value) {
            addCriterion("cipher <>", value, "cipher");
            return (Criteria) this;
        }

        public Criteria andCipherGreaterThan(String value) {
            addCriterion("cipher >", value, "cipher");
            return (Criteria) this;
        }

        public Criteria andCipherGreaterThanOrEqualTo(String value) {
            addCriterion("cipher >=", value, "cipher");
            return (Criteria) this;
        }

        public Criteria andCipherLessThan(String value) {
            addCriterion("cipher <", value, "cipher");
            return (Criteria) this;
        }

        public Criteria andCipherLessThanOrEqualTo(String value) {
            addCriterion("cipher <=", value, "cipher");
            return (Criteria) this;
        }

        public Criteria andCipherLike(String value) {
            addCriterion("cipher like", value, "cipher");
            return (Criteria) this;
        }

        public Criteria andCipherNotLike(String value) {
            addCriterion("cipher not like", value, "cipher");
            return (Criteria) this;
        }

        public Criteria andCipherIn(List<String> values) {
            addCriterion("cipher in", values, "cipher");
            return (Criteria) this;
        }

        public Criteria andCipherNotIn(List<String> values) {
            addCriterion("cipher not in", values, "cipher");
            return (Criteria) this;
        }

        public Criteria andCipherBetween(String value1, String value2) {
            addCriterion("cipher between", value1, value2, "cipher");
            return (Criteria) this;
        }

        public Criteria andCipherNotBetween(String value1, String value2) {
            addCriterion("cipher not between", value1, value2, "cipher");
            return (Criteria) this;
        }

        public Criteria andBitsIsNull() {
            addCriterion("bits is null");
            return (Criteria) this;
        }

        public Criteria andBitsIsNotNull() {
            addCriterion("bits is not null");
            return (Criteria) this;
        }

        public Criteria andBitsEqualTo(Integer value) {
            addCriterion("bits =", value, "bits");
            return (Criteria) this;
        }

        public Criteria andBitsNotEqualTo(Integer value) {
            addCriterion("bits <>", value, "bits");
            return (Criteria) this;
        }

        public Criteria andBitsGreaterThan(Integer value) {
            addCriterion("bits >", value, "bits");
            return (Criteria) this;
        }

        public Criteria andBitsGreaterThanOrEqualTo(Integer value) {
            addCriterion("bits >=", value, "bits");
            return (Criteria) this;
        }

        public Criteria andBitsLessThan(Integer value) {
            addCriterion("bits <", value, "bits");
            return (Criteria) this;
        }

        public Criteria andBitsLessThanOrEqualTo(Integer value) {
            addCriterion("bits <=", value, "bits");
            return (Criteria) this;
        }

        public Criteria andBitsIn(List<Integer> values) {
            addCriterion("bits in", values, "bits");
            return (Criteria) this;
        }

        public Criteria andBitsNotIn(List<Integer> values) {
            addCriterion("bits not in", values, "bits");
            return (Criteria) this;
        }

        public Criteria andBitsBetween(Integer value1, Integer value2) {
            addCriterion("bits between", value1, value2, "bits");
            return (Criteria) this;
        }

        public Criteria andBitsNotBetween(Integer value1, Integer value2) {
            addCriterion("bits not between", value1, value2, "bits");
            return (Criteria) this;
        }

        public Criteria andClientDnIsNull() {
            addCriterion("client_dn is null");
            return (Criteria) this;
        }

        public Criteria andClientDnIsNotNull() {
            addCriterion("client_dn is not null");
            return (Criteria) this;
        }

        public Criteria andClientDnEqualTo(String value) {
            addCriterion("client_dn =", value, "clientDn");
            return (Criteria) this;
        }

        public Criteria andClientDnNotEqualTo(String value) {
            addCriterion("client_dn <>", value, "clientDn");
            return (Criteria) this;
        }

        public Criteria andClientDnGreaterThan(String value) {
            addCriterion("client_dn >", value, "clientDn");
            return (Criteria) this;
        }

        public Criteria andClientDnGreaterThanOrEqualTo(String value) {
            addCriterion("client_dn >=", value, "clientDn");
            return (Criteria) this;
        }

        public Criteria andClientDnLessThan(String value) {
            addCriterion("client_dn <", value, "clientDn");
            return (Criteria) this;
        }

        public Criteria andClientDnLessThanOrEqualTo(String value) {
            addCriterion("client_dn <=", value, "clientDn");
            return (Criteria) this;
        }

        public Criteria andClientDnLike(String value) {
            addCriterion("client_dn like", value, "clientDn");
            return (Criteria) this;
        }

        public Criteria andClientDnNotLike(String value) {
            addCriterion("client_dn not like", value, "clientDn");
            return (Criteria) this;
        }

        public Criteria andClientDnIn(List<String> values) {
            addCriterion("client_dn in", values, "clientDn");
            return (Criteria) this;
        }

        public Criteria andClientDnNotIn(List<String> values) {
            addCriterion("client_dn not in", values, "clientDn");
            return (Criteria) this;
        }

        public Criteria andClientDnBetween(String value1, String value2) {
            addCriterion("client_dn between", value1, value2, "clientDn");
            return (Criteria) this;
        }

        public Criteria andClientDnNotBetween(String value1, String value2) {
            addCriterion("client_dn not between", value1, value2, "clientDn");
            return (Criteria) this;
        }

        public Criteria andClientSerialIsNull() {
            addCriterion("client_serial is null");
            return (Criteria) this;
        }

        public Criteria andClientSerialIsNotNull() {
            addCriterion("client_serial is not null");
            return (Criteria) this;
        }

        public Criteria andClientSerialEqualTo(Short value) {
            addCriterion("client_serial =", value, "clientSerial");
            return (Criteria) this;
        }

        public Criteria andClientSerialNotEqualTo(Short value) {
            addCriterion("client_serial <>", value, "clientSerial");
            return (Criteria) this;
        }

        public Criteria andClientSerialGreaterThan(Short value) {
            addCriterion("client_serial >", value, "clientSerial");
            return (Criteria) this;
        }

        public Criteria andClientSerialGreaterThanOrEqualTo(Short value) {
            addCriterion("client_serial >=", value, "clientSerial");
            return (Criteria) this;
        }

        public Criteria andClientSerialLessThan(Short value) {
            addCriterion("client_serial <", value, "clientSerial");
            return (Criteria) this;
        }

        public Criteria andClientSerialLessThanOrEqualTo(Short value) {
            addCriterion("client_serial <=", value, "clientSerial");
            return (Criteria) this;
        }

        public Criteria andClientSerialIn(List<Short> values) {
            addCriterion("client_serial in", values, "clientSerial");
            return (Criteria) this;
        }

        public Criteria andClientSerialNotIn(List<Short> values) {
            addCriterion("client_serial not in", values, "clientSerial");
            return (Criteria) this;
        }

        public Criteria andClientSerialBetween(Short value1, Short value2) {
            addCriterion("client_serial between", value1, value2, "clientSerial");
            return (Criteria) this;
        }

        public Criteria andClientSerialNotBetween(Short value1, Short value2) {
            addCriterion("client_serial not between", value1, value2, "clientSerial");
            return (Criteria) this;
        }

        public Criteria andIssuerDnIsNull() {
            addCriterion("issuer_dn is null");
            return (Criteria) this;
        }

        public Criteria andIssuerDnIsNotNull() {
            addCriterion("issuer_dn is not null");
            return (Criteria) this;
        }

        public Criteria andIssuerDnEqualTo(String value) {
            addCriterion("issuer_dn =", value, "issuerDn");
            return (Criteria) this;
        }

        public Criteria andIssuerDnNotEqualTo(String value) {
            addCriterion("issuer_dn <>", value, "issuerDn");
            return (Criteria) this;
        }

        public Criteria andIssuerDnGreaterThan(String value) {
            addCriterion("issuer_dn >", value, "issuerDn");
            return (Criteria) this;
        }

        public Criteria andIssuerDnGreaterThanOrEqualTo(String value) {
            addCriterion("issuer_dn >=", value, "issuerDn");
            return (Criteria) this;
        }

        public Criteria andIssuerDnLessThan(String value) {
            addCriterion("issuer_dn <", value, "issuerDn");
            return (Criteria) this;
        }

        public Criteria andIssuerDnLessThanOrEqualTo(String value) {
            addCriterion("issuer_dn <=", value, "issuerDn");
            return (Criteria) this;
        }

        public Criteria andIssuerDnLike(String value) {
            addCriterion("issuer_dn like", value, "issuerDn");
            return (Criteria) this;
        }

        public Criteria andIssuerDnNotLike(String value) {
            addCriterion("issuer_dn not like", value, "issuerDn");
            return (Criteria) this;
        }

        public Criteria andIssuerDnIn(List<String> values) {
            addCriterion("issuer_dn in", values, "issuerDn");
            return (Criteria) this;
        }

        public Criteria andIssuerDnNotIn(List<String> values) {
            addCriterion("issuer_dn not in", values, "issuerDn");
            return (Criteria) this;
        }

        public Criteria andIssuerDnBetween(String value1, String value2) {
            addCriterion("issuer_dn between", value1, value2, "issuerDn");
            return (Criteria) this;
        }

        public Criteria andIssuerDnNotBetween(String value1, String value2) {
            addCriterion("issuer_dn not between", value1, value2, "issuerDn");
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