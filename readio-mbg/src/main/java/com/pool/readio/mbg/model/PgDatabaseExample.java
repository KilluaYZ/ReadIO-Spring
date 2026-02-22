package com.pool.readio.mbg.model;

import java.util.ArrayList;
import java.util.List;

public class PgDatabaseExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PgDatabaseExample() {
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

        public Criteria andDatnameIsNull() {
            addCriterion("datname is null");
            return (Criteria) this;
        }

        public Criteria andDatnameIsNotNull() {
            addCriterion("datname is not null");
            return (Criteria) this;
        }

        public Criteria andDatnameEqualTo(String value) {
            addCriterion("datname =", value, "datname");
            return (Criteria) this;
        }

        public Criteria andDatnameNotEqualTo(String value) {
            addCriterion("datname <>", value, "datname");
            return (Criteria) this;
        }

        public Criteria andDatnameGreaterThan(String value) {
            addCriterion("datname >", value, "datname");
            return (Criteria) this;
        }

        public Criteria andDatnameGreaterThanOrEqualTo(String value) {
            addCriterion("datname >=", value, "datname");
            return (Criteria) this;
        }

        public Criteria andDatnameLessThan(String value) {
            addCriterion("datname <", value, "datname");
            return (Criteria) this;
        }

        public Criteria andDatnameLessThanOrEqualTo(String value) {
            addCriterion("datname <=", value, "datname");
            return (Criteria) this;
        }

        public Criteria andDatnameLike(String value) {
            addCriterion("datname like", value, "datname");
            return (Criteria) this;
        }

        public Criteria andDatnameNotLike(String value) {
            addCriterion("datname not like", value, "datname");
            return (Criteria) this;
        }

        public Criteria andDatnameIn(List<String> values) {
            addCriterion("datname in", values, "datname");
            return (Criteria) this;
        }

        public Criteria andDatnameNotIn(List<String> values) {
            addCriterion("datname not in", values, "datname");
            return (Criteria) this;
        }

        public Criteria andDatnameBetween(String value1, String value2) {
            addCriterion("datname between", value1, value2, "datname");
            return (Criteria) this;
        }

        public Criteria andDatnameNotBetween(String value1, String value2) {
            addCriterion("datname not between", value1, value2, "datname");
            return (Criteria) this;
        }

        public Criteria andDatdbaIsNull() {
            addCriterion("datdba is null");
            return (Criteria) this;
        }

        public Criteria andDatdbaIsNotNull() {
            addCriterion("datdba is not null");
            return (Criteria) this;
        }

        public Criteria andDatdbaEqualTo(Long value) {
            addCriterion("datdba =", value, "datdba");
            return (Criteria) this;
        }

        public Criteria andDatdbaNotEqualTo(Long value) {
            addCriterion("datdba <>", value, "datdba");
            return (Criteria) this;
        }

        public Criteria andDatdbaGreaterThan(Long value) {
            addCriterion("datdba >", value, "datdba");
            return (Criteria) this;
        }

        public Criteria andDatdbaGreaterThanOrEqualTo(Long value) {
            addCriterion("datdba >=", value, "datdba");
            return (Criteria) this;
        }

        public Criteria andDatdbaLessThan(Long value) {
            addCriterion("datdba <", value, "datdba");
            return (Criteria) this;
        }

        public Criteria andDatdbaLessThanOrEqualTo(Long value) {
            addCriterion("datdba <=", value, "datdba");
            return (Criteria) this;
        }

        public Criteria andDatdbaIn(List<Long> values) {
            addCriterion("datdba in", values, "datdba");
            return (Criteria) this;
        }

        public Criteria andDatdbaNotIn(List<Long> values) {
            addCriterion("datdba not in", values, "datdba");
            return (Criteria) this;
        }

        public Criteria andDatdbaBetween(Long value1, Long value2) {
            addCriterion("datdba between", value1, value2, "datdba");
            return (Criteria) this;
        }

        public Criteria andDatdbaNotBetween(Long value1, Long value2) {
            addCriterion("datdba not between", value1, value2, "datdba");
            return (Criteria) this;
        }

        public Criteria andEncodingIsNull() {
            addCriterion("encoding is null");
            return (Criteria) this;
        }

        public Criteria andEncodingIsNotNull() {
            addCriterion("encoding is not null");
            return (Criteria) this;
        }

        public Criteria andEncodingEqualTo(Integer value) {
            addCriterion("encoding =", value, "encoding");
            return (Criteria) this;
        }

        public Criteria andEncodingNotEqualTo(Integer value) {
            addCriterion("encoding <>", value, "encoding");
            return (Criteria) this;
        }

        public Criteria andEncodingGreaterThan(Integer value) {
            addCriterion("encoding >", value, "encoding");
            return (Criteria) this;
        }

        public Criteria andEncodingGreaterThanOrEqualTo(Integer value) {
            addCriterion("encoding >=", value, "encoding");
            return (Criteria) this;
        }

        public Criteria andEncodingLessThan(Integer value) {
            addCriterion("encoding <", value, "encoding");
            return (Criteria) this;
        }

        public Criteria andEncodingLessThanOrEqualTo(Integer value) {
            addCriterion("encoding <=", value, "encoding");
            return (Criteria) this;
        }

        public Criteria andEncodingIn(List<Integer> values) {
            addCriterion("encoding in", values, "encoding");
            return (Criteria) this;
        }

        public Criteria andEncodingNotIn(List<Integer> values) {
            addCriterion("encoding not in", values, "encoding");
            return (Criteria) this;
        }

        public Criteria andEncodingBetween(Integer value1, Integer value2) {
            addCriterion("encoding between", value1, value2, "encoding");
            return (Criteria) this;
        }

        public Criteria andEncodingNotBetween(Integer value1, Integer value2) {
            addCriterion("encoding not between", value1, value2, "encoding");
            return (Criteria) this;
        }

        public Criteria andDatlocproviderIsNull() {
            addCriterion("datlocprovider is null");
            return (Criteria) this;
        }

        public Criteria andDatlocproviderIsNotNull() {
            addCriterion("datlocprovider is not null");
            return (Criteria) this;
        }

        public Criteria andDatlocproviderEqualTo(String value) {
            addCriterion("datlocprovider =", value, "datlocprovider");
            return (Criteria) this;
        }

        public Criteria andDatlocproviderNotEqualTo(String value) {
            addCriterion("datlocprovider <>", value, "datlocprovider");
            return (Criteria) this;
        }

        public Criteria andDatlocproviderGreaterThan(String value) {
            addCriterion("datlocprovider >", value, "datlocprovider");
            return (Criteria) this;
        }

        public Criteria andDatlocproviderGreaterThanOrEqualTo(String value) {
            addCriterion("datlocprovider >=", value, "datlocprovider");
            return (Criteria) this;
        }

        public Criteria andDatlocproviderLessThan(String value) {
            addCriterion("datlocprovider <", value, "datlocprovider");
            return (Criteria) this;
        }

        public Criteria andDatlocproviderLessThanOrEqualTo(String value) {
            addCriterion("datlocprovider <=", value, "datlocprovider");
            return (Criteria) this;
        }

        public Criteria andDatlocproviderLike(String value) {
            addCriterion("datlocprovider like", value, "datlocprovider");
            return (Criteria) this;
        }

        public Criteria andDatlocproviderNotLike(String value) {
            addCriterion("datlocprovider not like", value, "datlocprovider");
            return (Criteria) this;
        }

        public Criteria andDatlocproviderIn(List<String> values) {
            addCriterion("datlocprovider in", values, "datlocprovider");
            return (Criteria) this;
        }

        public Criteria andDatlocproviderNotIn(List<String> values) {
            addCriterion("datlocprovider not in", values, "datlocprovider");
            return (Criteria) this;
        }

        public Criteria andDatlocproviderBetween(String value1, String value2) {
            addCriterion("datlocprovider between", value1, value2, "datlocprovider");
            return (Criteria) this;
        }

        public Criteria andDatlocproviderNotBetween(String value1, String value2) {
            addCriterion("datlocprovider not between", value1, value2, "datlocprovider");
            return (Criteria) this;
        }

        public Criteria andDatistemplateIsNull() {
            addCriterion("datistemplate is null");
            return (Criteria) this;
        }

        public Criteria andDatistemplateIsNotNull() {
            addCriterion("datistemplate is not null");
            return (Criteria) this;
        }

        public Criteria andDatistemplateEqualTo(Boolean value) {
            addCriterion("datistemplate =", value, "datistemplate");
            return (Criteria) this;
        }

        public Criteria andDatistemplateNotEqualTo(Boolean value) {
            addCriterion("datistemplate <>", value, "datistemplate");
            return (Criteria) this;
        }

        public Criteria andDatistemplateGreaterThan(Boolean value) {
            addCriterion("datistemplate >", value, "datistemplate");
            return (Criteria) this;
        }

        public Criteria andDatistemplateGreaterThanOrEqualTo(Boolean value) {
            addCriterion("datistemplate >=", value, "datistemplate");
            return (Criteria) this;
        }

        public Criteria andDatistemplateLessThan(Boolean value) {
            addCriterion("datistemplate <", value, "datistemplate");
            return (Criteria) this;
        }

        public Criteria andDatistemplateLessThanOrEqualTo(Boolean value) {
            addCriterion("datistemplate <=", value, "datistemplate");
            return (Criteria) this;
        }

        public Criteria andDatistemplateIn(List<Boolean> values) {
            addCriterion("datistemplate in", values, "datistemplate");
            return (Criteria) this;
        }

        public Criteria andDatistemplateNotIn(List<Boolean> values) {
            addCriterion("datistemplate not in", values, "datistemplate");
            return (Criteria) this;
        }

        public Criteria andDatistemplateBetween(Boolean value1, Boolean value2) {
            addCriterion("datistemplate between", value1, value2, "datistemplate");
            return (Criteria) this;
        }

        public Criteria andDatistemplateNotBetween(Boolean value1, Boolean value2) {
            addCriterion("datistemplate not between", value1, value2, "datistemplate");
            return (Criteria) this;
        }

        public Criteria andDatallowconnIsNull() {
            addCriterion("datallowconn is null");
            return (Criteria) this;
        }

        public Criteria andDatallowconnIsNotNull() {
            addCriterion("datallowconn is not null");
            return (Criteria) this;
        }

        public Criteria andDatallowconnEqualTo(Boolean value) {
            addCriterion("datallowconn =", value, "datallowconn");
            return (Criteria) this;
        }

        public Criteria andDatallowconnNotEqualTo(Boolean value) {
            addCriterion("datallowconn <>", value, "datallowconn");
            return (Criteria) this;
        }

        public Criteria andDatallowconnGreaterThan(Boolean value) {
            addCriterion("datallowconn >", value, "datallowconn");
            return (Criteria) this;
        }

        public Criteria andDatallowconnGreaterThanOrEqualTo(Boolean value) {
            addCriterion("datallowconn >=", value, "datallowconn");
            return (Criteria) this;
        }

        public Criteria andDatallowconnLessThan(Boolean value) {
            addCriterion("datallowconn <", value, "datallowconn");
            return (Criteria) this;
        }

        public Criteria andDatallowconnLessThanOrEqualTo(Boolean value) {
            addCriterion("datallowconn <=", value, "datallowconn");
            return (Criteria) this;
        }

        public Criteria andDatallowconnIn(List<Boolean> values) {
            addCriterion("datallowconn in", values, "datallowconn");
            return (Criteria) this;
        }

        public Criteria andDatallowconnNotIn(List<Boolean> values) {
            addCriterion("datallowconn not in", values, "datallowconn");
            return (Criteria) this;
        }

        public Criteria andDatallowconnBetween(Boolean value1, Boolean value2) {
            addCriterion("datallowconn between", value1, value2, "datallowconn");
            return (Criteria) this;
        }

        public Criteria andDatallowconnNotBetween(Boolean value1, Boolean value2) {
            addCriterion("datallowconn not between", value1, value2, "datallowconn");
            return (Criteria) this;
        }

        public Criteria andDathasloginevtIsNull() {
            addCriterion("dathasloginevt is null");
            return (Criteria) this;
        }

        public Criteria andDathasloginevtIsNotNull() {
            addCriterion("dathasloginevt is not null");
            return (Criteria) this;
        }

        public Criteria andDathasloginevtEqualTo(Boolean value) {
            addCriterion("dathasloginevt =", value, "dathasloginevt");
            return (Criteria) this;
        }

        public Criteria andDathasloginevtNotEqualTo(Boolean value) {
            addCriterion("dathasloginevt <>", value, "dathasloginevt");
            return (Criteria) this;
        }

        public Criteria andDathasloginevtGreaterThan(Boolean value) {
            addCriterion("dathasloginevt >", value, "dathasloginevt");
            return (Criteria) this;
        }

        public Criteria andDathasloginevtGreaterThanOrEqualTo(Boolean value) {
            addCriterion("dathasloginevt >=", value, "dathasloginevt");
            return (Criteria) this;
        }

        public Criteria andDathasloginevtLessThan(Boolean value) {
            addCriterion("dathasloginevt <", value, "dathasloginevt");
            return (Criteria) this;
        }

        public Criteria andDathasloginevtLessThanOrEqualTo(Boolean value) {
            addCriterion("dathasloginevt <=", value, "dathasloginevt");
            return (Criteria) this;
        }

        public Criteria andDathasloginevtIn(List<Boolean> values) {
            addCriterion("dathasloginevt in", values, "dathasloginevt");
            return (Criteria) this;
        }

        public Criteria andDathasloginevtNotIn(List<Boolean> values) {
            addCriterion("dathasloginevt not in", values, "dathasloginevt");
            return (Criteria) this;
        }

        public Criteria andDathasloginevtBetween(Boolean value1, Boolean value2) {
            addCriterion("dathasloginevt between", value1, value2, "dathasloginevt");
            return (Criteria) this;
        }

        public Criteria andDathasloginevtNotBetween(Boolean value1, Boolean value2) {
            addCriterion("dathasloginevt not between", value1, value2, "dathasloginevt");
            return (Criteria) this;
        }

        public Criteria andDatconnlimitIsNull() {
            addCriterion("datconnlimit is null");
            return (Criteria) this;
        }

        public Criteria andDatconnlimitIsNotNull() {
            addCriterion("datconnlimit is not null");
            return (Criteria) this;
        }

        public Criteria andDatconnlimitEqualTo(Integer value) {
            addCriterion("datconnlimit =", value, "datconnlimit");
            return (Criteria) this;
        }

        public Criteria andDatconnlimitNotEqualTo(Integer value) {
            addCriterion("datconnlimit <>", value, "datconnlimit");
            return (Criteria) this;
        }

        public Criteria andDatconnlimitGreaterThan(Integer value) {
            addCriterion("datconnlimit >", value, "datconnlimit");
            return (Criteria) this;
        }

        public Criteria andDatconnlimitGreaterThanOrEqualTo(Integer value) {
            addCriterion("datconnlimit >=", value, "datconnlimit");
            return (Criteria) this;
        }

        public Criteria andDatconnlimitLessThan(Integer value) {
            addCriterion("datconnlimit <", value, "datconnlimit");
            return (Criteria) this;
        }

        public Criteria andDatconnlimitLessThanOrEqualTo(Integer value) {
            addCriterion("datconnlimit <=", value, "datconnlimit");
            return (Criteria) this;
        }

        public Criteria andDatconnlimitIn(List<Integer> values) {
            addCriterion("datconnlimit in", values, "datconnlimit");
            return (Criteria) this;
        }

        public Criteria andDatconnlimitNotIn(List<Integer> values) {
            addCriterion("datconnlimit not in", values, "datconnlimit");
            return (Criteria) this;
        }

        public Criteria andDatconnlimitBetween(Integer value1, Integer value2) {
            addCriterion("datconnlimit between", value1, value2, "datconnlimit");
            return (Criteria) this;
        }

        public Criteria andDatconnlimitNotBetween(Integer value1, Integer value2) {
            addCriterion("datconnlimit not between", value1, value2, "datconnlimit");
            return (Criteria) this;
        }

        public Criteria andDatfrozenxidIsNull() {
            addCriterion("datfrozenxid is null");
            return (Criteria) this;
        }

        public Criteria andDatfrozenxidIsNotNull() {
            addCriterion("datfrozenxid is not null");
            return (Criteria) this;
        }

        public Criteria andDatfrozenxidEqualTo(Object value) {
            addCriterion("datfrozenxid =", value, "datfrozenxid");
            return (Criteria) this;
        }

        public Criteria andDatfrozenxidNotEqualTo(Object value) {
            addCriterion("datfrozenxid <>", value, "datfrozenxid");
            return (Criteria) this;
        }

        public Criteria andDatfrozenxidGreaterThan(Object value) {
            addCriterion("datfrozenxid >", value, "datfrozenxid");
            return (Criteria) this;
        }

        public Criteria andDatfrozenxidGreaterThanOrEqualTo(Object value) {
            addCriterion("datfrozenxid >=", value, "datfrozenxid");
            return (Criteria) this;
        }

        public Criteria andDatfrozenxidLessThan(Object value) {
            addCriterion("datfrozenxid <", value, "datfrozenxid");
            return (Criteria) this;
        }

        public Criteria andDatfrozenxidLessThanOrEqualTo(Object value) {
            addCriterion("datfrozenxid <=", value, "datfrozenxid");
            return (Criteria) this;
        }

        public Criteria andDatfrozenxidIn(List<Object> values) {
            addCriterion("datfrozenxid in", values, "datfrozenxid");
            return (Criteria) this;
        }

        public Criteria andDatfrozenxidNotIn(List<Object> values) {
            addCriterion("datfrozenxid not in", values, "datfrozenxid");
            return (Criteria) this;
        }

        public Criteria andDatfrozenxidBetween(Object value1, Object value2) {
            addCriterion("datfrozenxid between", value1, value2, "datfrozenxid");
            return (Criteria) this;
        }

        public Criteria andDatfrozenxidNotBetween(Object value1, Object value2) {
            addCriterion("datfrozenxid not between", value1, value2, "datfrozenxid");
            return (Criteria) this;
        }

        public Criteria andDatminmxidIsNull() {
            addCriterion("datminmxid is null");
            return (Criteria) this;
        }

        public Criteria andDatminmxidIsNotNull() {
            addCriterion("datminmxid is not null");
            return (Criteria) this;
        }

        public Criteria andDatminmxidEqualTo(Object value) {
            addCriterion("datminmxid =", value, "datminmxid");
            return (Criteria) this;
        }

        public Criteria andDatminmxidNotEqualTo(Object value) {
            addCriterion("datminmxid <>", value, "datminmxid");
            return (Criteria) this;
        }

        public Criteria andDatminmxidGreaterThan(Object value) {
            addCriterion("datminmxid >", value, "datminmxid");
            return (Criteria) this;
        }

        public Criteria andDatminmxidGreaterThanOrEqualTo(Object value) {
            addCriterion("datminmxid >=", value, "datminmxid");
            return (Criteria) this;
        }

        public Criteria andDatminmxidLessThan(Object value) {
            addCriterion("datminmxid <", value, "datminmxid");
            return (Criteria) this;
        }

        public Criteria andDatminmxidLessThanOrEqualTo(Object value) {
            addCriterion("datminmxid <=", value, "datminmxid");
            return (Criteria) this;
        }

        public Criteria andDatminmxidIn(List<Object> values) {
            addCriterion("datminmxid in", values, "datminmxid");
            return (Criteria) this;
        }

        public Criteria andDatminmxidNotIn(List<Object> values) {
            addCriterion("datminmxid not in", values, "datminmxid");
            return (Criteria) this;
        }

        public Criteria andDatminmxidBetween(Object value1, Object value2) {
            addCriterion("datminmxid between", value1, value2, "datminmxid");
            return (Criteria) this;
        }

        public Criteria andDatminmxidNotBetween(Object value1, Object value2) {
            addCriterion("datminmxid not between", value1, value2, "datminmxid");
            return (Criteria) this;
        }

        public Criteria andDattablespaceIsNull() {
            addCriterion("dattablespace is null");
            return (Criteria) this;
        }

        public Criteria andDattablespaceIsNotNull() {
            addCriterion("dattablespace is not null");
            return (Criteria) this;
        }

        public Criteria andDattablespaceEqualTo(Long value) {
            addCriterion("dattablespace =", value, "dattablespace");
            return (Criteria) this;
        }

        public Criteria andDattablespaceNotEqualTo(Long value) {
            addCriterion("dattablespace <>", value, "dattablespace");
            return (Criteria) this;
        }

        public Criteria andDattablespaceGreaterThan(Long value) {
            addCriterion("dattablespace >", value, "dattablespace");
            return (Criteria) this;
        }

        public Criteria andDattablespaceGreaterThanOrEqualTo(Long value) {
            addCriterion("dattablespace >=", value, "dattablespace");
            return (Criteria) this;
        }

        public Criteria andDattablespaceLessThan(Long value) {
            addCriterion("dattablespace <", value, "dattablespace");
            return (Criteria) this;
        }

        public Criteria andDattablespaceLessThanOrEqualTo(Long value) {
            addCriterion("dattablespace <=", value, "dattablespace");
            return (Criteria) this;
        }

        public Criteria andDattablespaceIn(List<Long> values) {
            addCriterion("dattablespace in", values, "dattablespace");
            return (Criteria) this;
        }

        public Criteria andDattablespaceNotIn(List<Long> values) {
            addCriterion("dattablespace not in", values, "dattablespace");
            return (Criteria) this;
        }

        public Criteria andDattablespaceBetween(Long value1, Long value2) {
            addCriterion("dattablespace between", value1, value2, "dattablespace");
            return (Criteria) this;
        }

        public Criteria andDattablespaceNotBetween(Long value1, Long value2) {
            addCriterion("dattablespace not between", value1, value2, "dattablespace");
            return (Criteria) this;
        }

        public Criteria andDatcollateIsNull() {
            addCriterion("datcollate is null");
            return (Criteria) this;
        }

        public Criteria andDatcollateIsNotNull() {
            addCriterion("datcollate is not null");
            return (Criteria) this;
        }

        public Criteria andDatcollateEqualTo(String value) {
            addCriterion("datcollate =", value, "datcollate");
            return (Criteria) this;
        }

        public Criteria andDatcollateNotEqualTo(String value) {
            addCriterion("datcollate <>", value, "datcollate");
            return (Criteria) this;
        }

        public Criteria andDatcollateGreaterThan(String value) {
            addCriterion("datcollate >", value, "datcollate");
            return (Criteria) this;
        }

        public Criteria andDatcollateGreaterThanOrEqualTo(String value) {
            addCriterion("datcollate >=", value, "datcollate");
            return (Criteria) this;
        }

        public Criteria andDatcollateLessThan(String value) {
            addCriterion("datcollate <", value, "datcollate");
            return (Criteria) this;
        }

        public Criteria andDatcollateLessThanOrEqualTo(String value) {
            addCriterion("datcollate <=", value, "datcollate");
            return (Criteria) this;
        }

        public Criteria andDatcollateLike(String value) {
            addCriterion("datcollate like", value, "datcollate");
            return (Criteria) this;
        }

        public Criteria andDatcollateNotLike(String value) {
            addCriterion("datcollate not like", value, "datcollate");
            return (Criteria) this;
        }

        public Criteria andDatcollateIn(List<String> values) {
            addCriterion("datcollate in", values, "datcollate");
            return (Criteria) this;
        }

        public Criteria andDatcollateNotIn(List<String> values) {
            addCriterion("datcollate not in", values, "datcollate");
            return (Criteria) this;
        }

        public Criteria andDatcollateBetween(String value1, String value2) {
            addCriterion("datcollate between", value1, value2, "datcollate");
            return (Criteria) this;
        }

        public Criteria andDatcollateNotBetween(String value1, String value2) {
            addCriterion("datcollate not between", value1, value2, "datcollate");
            return (Criteria) this;
        }

        public Criteria andDatctypeIsNull() {
            addCriterion("datctype is null");
            return (Criteria) this;
        }

        public Criteria andDatctypeIsNotNull() {
            addCriterion("datctype is not null");
            return (Criteria) this;
        }

        public Criteria andDatctypeEqualTo(String value) {
            addCriterion("datctype =", value, "datctype");
            return (Criteria) this;
        }

        public Criteria andDatctypeNotEqualTo(String value) {
            addCriterion("datctype <>", value, "datctype");
            return (Criteria) this;
        }

        public Criteria andDatctypeGreaterThan(String value) {
            addCriterion("datctype >", value, "datctype");
            return (Criteria) this;
        }

        public Criteria andDatctypeGreaterThanOrEqualTo(String value) {
            addCriterion("datctype >=", value, "datctype");
            return (Criteria) this;
        }

        public Criteria andDatctypeLessThan(String value) {
            addCriterion("datctype <", value, "datctype");
            return (Criteria) this;
        }

        public Criteria andDatctypeLessThanOrEqualTo(String value) {
            addCriterion("datctype <=", value, "datctype");
            return (Criteria) this;
        }

        public Criteria andDatctypeLike(String value) {
            addCriterion("datctype like", value, "datctype");
            return (Criteria) this;
        }

        public Criteria andDatctypeNotLike(String value) {
            addCriterion("datctype not like", value, "datctype");
            return (Criteria) this;
        }

        public Criteria andDatctypeIn(List<String> values) {
            addCriterion("datctype in", values, "datctype");
            return (Criteria) this;
        }

        public Criteria andDatctypeNotIn(List<String> values) {
            addCriterion("datctype not in", values, "datctype");
            return (Criteria) this;
        }

        public Criteria andDatctypeBetween(String value1, String value2) {
            addCriterion("datctype between", value1, value2, "datctype");
            return (Criteria) this;
        }

        public Criteria andDatctypeNotBetween(String value1, String value2) {
            addCriterion("datctype not between", value1, value2, "datctype");
            return (Criteria) this;
        }

        public Criteria andDatlocaleIsNull() {
            addCriterion("datlocale is null");
            return (Criteria) this;
        }

        public Criteria andDatlocaleIsNotNull() {
            addCriterion("datlocale is not null");
            return (Criteria) this;
        }

        public Criteria andDatlocaleEqualTo(String value) {
            addCriterion("datlocale =", value, "datlocale");
            return (Criteria) this;
        }

        public Criteria andDatlocaleNotEqualTo(String value) {
            addCriterion("datlocale <>", value, "datlocale");
            return (Criteria) this;
        }

        public Criteria andDatlocaleGreaterThan(String value) {
            addCriterion("datlocale >", value, "datlocale");
            return (Criteria) this;
        }

        public Criteria andDatlocaleGreaterThanOrEqualTo(String value) {
            addCriterion("datlocale >=", value, "datlocale");
            return (Criteria) this;
        }

        public Criteria andDatlocaleLessThan(String value) {
            addCriterion("datlocale <", value, "datlocale");
            return (Criteria) this;
        }

        public Criteria andDatlocaleLessThanOrEqualTo(String value) {
            addCriterion("datlocale <=", value, "datlocale");
            return (Criteria) this;
        }

        public Criteria andDatlocaleLike(String value) {
            addCriterion("datlocale like", value, "datlocale");
            return (Criteria) this;
        }

        public Criteria andDatlocaleNotLike(String value) {
            addCriterion("datlocale not like", value, "datlocale");
            return (Criteria) this;
        }

        public Criteria andDatlocaleIn(List<String> values) {
            addCriterion("datlocale in", values, "datlocale");
            return (Criteria) this;
        }

        public Criteria andDatlocaleNotIn(List<String> values) {
            addCriterion("datlocale not in", values, "datlocale");
            return (Criteria) this;
        }

        public Criteria andDatlocaleBetween(String value1, String value2) {
            addCriterion("datlocale between", value1, value2, "datlocale");
            return (Criteria) this;
        }

        public Criteria andDatlocaleNotBetween(String value1, String value2) {
            addCriterion("datlocale not between", value1, value2, "datlocale");
            return (Criteria) this;
        }

        public Criteria andDaticurulesIsNull() {
            addCriterion("daticurules is null");
            return (Criteria) this;
        }

        public Criteria andDaticurulesIsNotNull() {
            addCriterion("daticurules is not null");
            return (Criteria) this;
        }

        public Criteria andDaticurulesEqualTo(String value) {
            addCriterion("daticurules =", value, "daticurules");
            return (Criteria) this;
        }

        public Criteria andDaticurulesNotEqualTo(String value) {
            addCriterion("daticurules <>", value, "daticurules");
            return (Criteria) this;
        }

        public Criteria andDaticurulesGreaterThan(String value) {
            addCriterion("daticurules >", value, "daticurules");
            return (Criteria) this;
        }

        public Criteria andDaticurulesGreaterThanOrEqualTo(String value) {
            addCriterion("daticurules >=", value, "daticurules");
            return (Criteria) this;
        }

        public Criteria andDaticurulesLessThan(String value) {
            addCriterion("daticurules <", value, "daticurules");
            return (Criteria) this;
        }

        public Criteria andDaticurulesLessThanOrEqualTo(String value) {
            addCriterion("daticurules <=", value, "daticurules");
            return (Criteria) this;
        }

        public Criteria andDaticurulesLike(String value) {
            addCriterion("daticurules like", value, "daticurules");
            return (Criteria) this;
        }

        public Criteria andDaticurulesNotLike(String value) {
            addCriterion("daticurules not like", value, "daticurules");
            return (Criteria) this;
        }

        public Criteria andDaticurulesIn(List<String> values) {
            addCriterion("daticurules in", values, "daticurules");
            return (Criteria) this;
        }

        public Criteria andDaticurulesNotIn(List<String> values) {
            addCriterion("daticurules not in", values, "daticurules");
            return (Criteria) this;
        }

        public Criteria andDaticurulesBetween(String value1, String value2) {
            addCriterion("daticurules between", value1, value2, "daticurules");
            return (Criteria) this;
        }

        public Criteria andDaticurulesNotBetween(String value1, String value2) {
            addCriterion("daticurules not between", value1, value2, "daticurules");
            return (Criteria) this;
        }

        public Criteria andDatcollversionIsNull() {
            addCriterion("datcollversion is null");
            return (Criteria) this;
        }

        public Criteria andDatcollversionIsNotNull() {
            addCriterion("datcollversion is not null");
            return (Criteria) this;
        }

        public Criteria andDatcollversionEqualTo(String value) {
            addCriterion("datcollversion =", value, "datcollversion");
            return (Criteria) this;
        }

        public Criteria andDatcollversionNotEqualTo(String value) {
            addCriterion("datcollversion <>", value, "datcollversion");
            return (Criteria) this;
        }

        public Criteria andDatcollversionGreaterThan(String value) {
            addCriterion("datcollversion >", value, "datcollversion");
            return (Criteria) this;
        }

        public Criteria andDatcollversionGreaterThanOrEqualTo(String value) {
            addCriterion("datcollversion >=", value, "datcollversion");
            return (Criteria) this;
        }

        public Criteria andDatcollversionLessThan(String value) {
            addCriterion("datcollversion <", value, "datcollversion");
            return (Criteria) this;
        }

        public Criteria andDatcollversionLessThanOrEqualTo(String value) {
            addCriterion("datcollversion <=", value, "datcollversion");
            return (Criteria) this;
        }

        public Criteria andDatcollversionLike(String value) {
            addCriterion("datcollversion like", value, "datcollversion");
            return (Criteria) this;
        }

        public Criteria andDatcollversionNotLike(String value) {
            addCriterion("datcollversion not like", value, "datcollversion");
            return (Criteria) this;
        }

        public Criteria andDatcollversionIn(List<String> values) {
            addCriterion("datcollversion in", values, "datcollversion");
            return (Criteria) this;
        }

        public Criteria andDatcollversionNotIn(List<String> values) {
            addCriterion("datcollversion not in", values, "datcollversion");
            return (Criteria) this;
        }

        public Criteria andDatcollversionBetween(String value1, String value2) {
            addCriterion("datcollversion between", value1, value2, "datcollversion");
            return (Criteria) this;
        }

        public Criteria andDatcollversionNotBetween(String value1, String value2) {
            addCriterion("datcollversion not between", value1, value2, "datcollversion");
            return (Criteria) this;
        }

        public Criteria andDataclIsNull() {
            addCriterion("datacl is null");
            return (Criteria) this;
        }

        public Criteria andDataclIsNotNull() {
            addCriterion("datacl is not null");
            return (Criteria) this;
        }

        public Criteria andDataclEqualTo(Object value) {
            addCriterion("datacl =", value, "datacl");
            return (Criteria) this;
        }

        public Criteria andDataclNotEqualTo(Object value) {
            addCriterion("datacl <>", value, "datacl");
            return (Criteria) this;
        }

        public Criteria andDataclGreaterThan(Object value) {
            addCriterion("datacl >", value, "datacl");
            return (Criteria) this;
        }

        public Criteria andDataclGreaterThanOrEqualTo(Object value) {
            addCriterion("datacl >=", value, "datacl");
            return (Criteria) this;
        }

        public Criteria andDataclLessThan(Object value) {
            addCriterion("datacl <", value, "datacl");
            return (Criteria) this;
        }

        public Criteria andDataclLessThanOrEqualTo(Object value) {
            addCriterion("datacl <=", value, "datacl");
            return (Criteria) this;
        }

        public Criteria andDataclIn(List<Object> values) {
            addCriterion("datacl in", values, "datacl");
            return (Criteria) this;
        }

        public Criteria andDataclNotIn(List<Object> values) {
            addCriterion("datacl not in", values, "datacl");
            return (Criteria) this;
        }

        public Criteria andDataclBetween(Object value1, Object value2) {
            addCriterion("datacl between", value1, value2, "datacl");
            return (Criteria) this;
        }

        public Criteria andDataclNotBetween(Object value1, Object value2) {
            addCriterion("datacl not between", value1, value2, "datacl");
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