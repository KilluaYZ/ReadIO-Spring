package com.pool.readio.readiombg.model;

import java.util.ArrayList;
import java.util.List;

public class PgCollationExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PgCollationExample() {
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

        public Criteria andCollnameIsNull() {
            addCriterion("collname is null");
            return (Criteria) this;
        }

        public Criteria andCollnameIsNotNull() {
            addCriterion("collname is not null");
            return (Criteria) this;
        }

        public Criteria andCollnameEqualTo(String value) {
            addCriterion("collname =", value, "collname");
            return (Criteria) this;
        }

        public Criteria andCollnameNotEqualTo(String value) {
            addCriterion("collname <>", value, "collname");
            return (Criteria) this;
        }

        public Criteria andCollnameGreaterThan(String value) {
            addCriterion("collname >", value, "collname");
            return (Criteria) this;
        }

        public Criteria andCollnameGreaterThanOrEqualTo(String value) {
            addCriterion("collname >=", value, "collname");
            return (Criteria) this;
        }

        public Criteria andCollnameLessThan(String value) {
            addCriterion("collname <", value, "collname");
            return (Criteria) this;
        }

        public Criteria andCollnameLessThanOrEqualTo(String value) {
            addCriterion("collname <=", value, "collname");
            return (Criteria) this;
        }

        public Criteria andCollnameLike(String value) {
            addCriterion("collname like", value, "collname");
            return (Criteria) this;
        }

        public Criteria andCollnameNotLike(String value) {
            addCriterion("collname not like", value, "collname");
            return (Criteria) this;
        }

        public Criteria andCollnameIn(List<String> values) {
            addCriterion("collname in", values, "collname");
            return (Criteria) this;
        }

        public Criteria andCollnameNotIn(List<String> values) {
            addCriterion("collname not in", values, "collname");
            return (Criteria) this;
        }

        public Criteria andCollnameBetween(String value1, String value2) {
            addCriterion("collname between", value1, value2, "collname");
            return (Criteria) this;
        }

        public Criteria andCollnameNotBetween(String value1, String value2) {
            addCriterion("collname not between", value1, value2, "collname");
            return (Criteria) this;
        }

        public Criteria andCollnamespaceIsNull() {
            addCriterion("collnamespace is null");
            return (Criteria) this;
        }

        public Criteria andCollnamespaceIsNotNull() {
            addCriterion("collnamespace is not null");
            return (Criteria) this;
        }

        public Criteria andCollnamespaceEqualTo(Long value) {
            addCriterion("collnamespace =", value, "collnamespace");
            return (Criteria) this;
        }

        public Criteria andCollnamespaceNotEqualTo(Long value) {
            addCriterion("collnamespace <>", value, "collnamespace");
            return (Criteria) this;
        }

        public Criteria andCollnamespaceGreaterThan(Long value) {
            addCriterion("collnamespace >", value, "collnamespace");
            return (Criteria) this;
        }

        public Criteria andCollnamespaceGreaterThanOrEqualTo(Long value) {
            addCriterion("collnamespace >=", value, "collnamespace");
            return (Criteria) this;
        }

        public Criteria andCollnamespaceLessThan(Long value) {
            addCriterion("collnamespace <", value, "collnamespace");
            return (Criteria) this;
        }

        public Criteria andCollnamespaceLessThanOrEqualTo(Long value) {
            addCriterion("collnamespace <=", value, "collnamespace");
            return (Criteria) this;
        }

        public Criteria andCollnamespaceIn(List<Long> values) {
            addCriterion("collnamespace in", values, "collnamespace");
            return (Criteria) this;
        }

        public Criteria andCollnamespaceNotIn(List<Long> values) {
            addCriterion("collnamespace not in", values, "collnamespace");
            return (Criteria) this;
        }

        public Criteria andCollnamespaceBetween(Long value1, Long value2) {
            addCriterion("collnamespace between", value1, value2, "collnamespace");
            return (Criteria) this;
        }

        public Criteria andCollnamespaceNotBetween(Long value1, Long value2) {
            addCriterion("collnamespace not between", value1, value2, "collnamespace");
            return (Criteria) this;
        }

        public Criteria andCollownerIsNull() {
            addCriterion("collowner is null");
            return (Criteria) this;
        }

        public Criteria andCollownerIsNotNull() {
            addCriterion("collowner is not null");
            return (Criteria) this;
        }

        public Criteria andCollownerEqualTo(Long value) {
            addCriterion("collowner =", value, "collowner");
            return (Criteria) this;
        }

        public Criteria andCollownerNotEqualTo(Long value) {
            addCriterion("collowner <>", value, "collowner");
            return (Criteria) this;
        }

        public Criteria andCollownerGreaterThan(Long value) {
            addCriterion("collowner >", value, "collowner");
            return (Criteria) this;
        }

        public Criteria andCollownerGreaterThanOrEqualTo(Long value) {
            addCriterion("collowner >=", value, "collowner");
            return (Criteria) this;
        }

        public Criteria andCollownerLessThan(Long value) {
            addCriterion("collowner <", value, "collowner");
            return (Criteria) this;
        }

        public Criteria andCollownerLessThanOrEqualTo(Long value) {
            addCriterion("collowner <=", value, "collowner");
            return (Criteria) this;
        }

        public Criteria andCollownerIn(List<Long> values) {
            addCriterion("collowner in", values, "collowner");
            return (Criteria) this;
        }

        public Criteria andCollownerNotIn(List<Long> values) {
            addCriterion("collowner not in", values, "collowner");
            return (Criteria) this;
        }

        public Criteria andCollownerBetween(Long value1, Long value2) {
            addCriterion("collowner between", value1, value2, "collowner");
            return (Criteria) this;
        }

        public Criteria andCollownerNotBetween(Long value1, Long value2) {
            addCriterion("collowner not between", value1, value2, "collowner");
            return (Criteria) this;
        }

        public Criteria andCollproviderIsNull() {
            addCriterion("collprovider is null");
            return (Criteria) this;
        }

        public Criteria andCollproviderIsNotNull() {
            addCriterion("collprovider is not null");
            return (Criteria) this;
        }

        public Criteria andCollproviderEqualTo(String value) {
            addCriterion("collprovider =", value, "collprovider");
            return (Criteria) this;
        }

        public Criteria andCollproviderNotEqualTo(String value) {
            addCriterion("collprovider <>", value, "collprovider");
            return (Criteria) this;
        }

        public Criteria andCollproviderGreaterThan(String value) {
            addCriterion("collprovider >", value, "collprovider");
            return (Criteria) this;
        }

        public Criteria andCollproviderGreaterThanOrEqualTo(String value) {
            addCriterion("collprovider >=", value, "collprovider");
            return (Criteria) this;
        }

        public Criteria andCollproviderLessThan(String value) {
            addCriterion("collprovider <", value, "collprovider");
            return (Criteria) this;
        }

        public Criteria andCollproviderLessThanOrEqualTo(String value) {
            addCriterion("collprovider <=", value, "collprovider");
            return (Criteria) this;
        }

        public Criteria andCollproviderLike(String value) {
            addCriterion("collprovider like", value, "collprovider");
            return (Criteria) this;
        }

        public Criteria andCollproviderNotLike(String value) {
            addCriterion("collprovider not like", value, "collprovider");
            return (Criteria) this;
        }

        public Criteria andCollproviderIn(List<String> values) {
            addCriterion("collprovider in", values, "collprovider");
            return (Criteria) this;
        }

        public Criteria andCollproviderNotIn(List<String> values) {
            addCriterion("collprovider not in", values, "collprovider");
            return (Criteria) this;
        }

        public Criteria andCollproviderBetween(String value1, String value2) {
            addCriterion("collprovider between", value1, value2, "collprovider");
            return (Criteria) this;
        }

        public Criteria andCollproviderNotBetween(String value1, String value2) {
            addCriterion("collprovider not between", value1, value2, "collprovider");
            return (Criteria) this;
        }

        public Criteria andCollisdeterministicIsNull() {
            addCriterion("collisdeterministic is null");
            return (Criteria) this;
        }

        public Criteria andCollisdeterministicIsNotNull() {
            addCriterion("collisdeterministic is not null");
            return (Criteria) this;
        }

        public Criteria andCollisdeterministicEqualTo(Boolean value) {
            addCriterion("collisdeterministic =", value, "collisdeterministic");
            return (Criteria) this;
        }

        public Criteria andCollisdeterministicNotEqualTo(Boolean value) {
            addCriterion("collisdeterministic <>", value, "collisdeterministic");
            return (Criteria) this;
        }

        public Criteria andCollisdeterministicGreaterThan(Boolean value) {
            addCriterion("collisdeterministic >", value, "collisdeterministic");
            return (Criteria) this;
        }

        public Criteria andCollisdeterministicGreaterThanOrEqualTo(Boolean value) {
            addCriterion("collisdeterministic >=", value, "collisdeterministic");
            return (Criteria) this;
        }

        public Criteria andCollisdeterministicLessThan(Boolean value) {
            addCriterion("collisdeterministic <", value, "collisdeterministic");
            return (Criteria) this;
        }

        public Criteria andCollisdeterministicLessThanOrEqualTo(Boolean value) {
            addCriterion("collisdeterministic <=", value, "collisdeterministic");
            return (Criteria) this;
        }

        public Criteria andCollisdeterministicIn(List<Boolean> values) {
            addCriterion("collisdeterministic in", values, "collisdeterministic");
            return (Criteria) this;
        }

        public Criteria andCollisdeterministicNotIn(List<Boolean> values) {
            addCriterion("collisdeterministic not in", values, "collisdeterministic");
            return (Criteria) this;
        }

        public Criteria andCollisdeterministicBetween(Boolean value1, Boolean value2) {
            addCriterion("collisdeterministic between", value1, value2, "collisdeterministic");
            return (Criteria) this;
        }

        public Criteria andCollisdeterministicNotBetween(Boolean value1, Boolean value2) {
            addCriterion("collisdeterministic not between", value1, value2, "collisdeterministic");
            return (Criteria) this;
        }

        public Criteria andCollencodingIsNull() {
            addCriterion("collencoding is null");
            return (Criteria) this;
        }

        public Criteria andCollencodingIsNotNull() {
            addCriterion("collencoding is not null");
            return (Criteria) this;
        }

        public Criteria andCollencodingEqualTo(Integer value) {
            addCriterion("collencoding =", value, "collencoding");
            return (Criteria) this;
        }

        public Criteria andCollencodingNotEqualTo(Integer value) {
            addCriterion("collencoding <>", value, "collencoding");
            return (Criteria) this;
        }

        public Criteria andCollencodingGreaterThan(Integer value) {
            addCriterion("collencoding >", value, "collencoding");
            return (Criteria) this;
        }

        public Criteria andCollencodingGreaterThanOrEqualTo(Integer value) {
            addCriterion("collencoding >=", value, "collencoding");
            return (Criteria) this;
        }

        public Criteria andCollencodingLessThan(Integer value) {
            addCriterion("collencoding <", value, "collencoding");
            return (Criteria) this;
        }

        public Criteria andCollencodingLessThanOrEqualTo(Integer value) {
            addCriterion("collencoding <=", value, "collencoding");
            return (Criteria) this;
        }

        public Criteria andCollencodingIn(List<Integer> values) {
            addCriterion("collencoding in", values, "collencoding");
            return (Criteria) this;
        }

        public Criteria andCollencodingNotIn(List<Integer> values) {
            addCriterion("collencoding not in", values, "collencoding");
            return (Criteria) this;
        }

        public Criteria andCollencodingBetween(Integer value1, Integer value2) {
            addCriterion("collencoding between", value1, value2, "collencoding");
            return (Criteria) this;
        }

        public Criteria andCollencodingNotBetween(Integer value1, Integer value2) {
            addCriterion("collencoding not between", value1, value2, "collencoding");
            return (Criteria) this;
        }

        public Criteria andCollcollateIsNull() {
            addCriterion("collcollate is null");
            return (Criteria) this;
        }

        public Criteria andCollcollateIsNotNull() {
            addCriterion("collcollate is not null");
            return (Criteria) this;
        }

        public Criteria andCollcollateEqualTo(String value) {
            addCriterion("collcollate =", value, "collcollate");
            return (Criteria) this;
        }

        public Criteria andCollcollateNotEqualTo(String value) {
            addCriterion("collcollate <>", value, "collcollate");
            return (Criteria) this;
        }

        public Criteria andCollcollateGreaterThan(String value) {
            addCriterion("collcollate >", value, "collcollate");
            return (Criteria) this;
        }

        public Criteria andCollcollateGreaterThanOrEqualTo(String value) {
            addCriterion("collcollate >=", value, "collcollate");
            return (Criteria) this;
        }

        public Criteria andCollcollateLessThan(String value) {
            addCriterion("collcollate <", value, "collcollate");
            return (Criteria) this;
        }

        public Criteria andCollcollateLessThanOrEqualTo(String value) {
            addCriterion("collcollate <=", value, "collcollate");
            return (Criteria) this;
        }

        public Criteria andCollcollateLike(String value) {
            addCriterion("collcollate like", value, "collcollate");
            return (Criteria) this;
        }

        public Criteria andCollcollateNotLike(String value) {
            addCriterion("collcollate not like", value, "collcollate");
            return (Criteria) this;
        }

        public Criteria andCollcollateIn(List<String> values) {
            addCriterion("collcollate in", values, "collcollate");
            return (Criteria) this;
        }

        public Criteria andCollcollateNotIn(List<String> values) {
            addCriterion("collcollate not in", values, "collcollate");
            return (Criteria) this;
        }

        public Criteria andCollcollateBetween(String value1, String value2) {
            addCriterion("collcollate between", value1, value2, "collcollate");
            return (Criteria) this;
        }

        public Criteria andCollcollateNotBetween(String value1, String value2) {
            addCriterion("collcollate not between", value1, value2, "collcollate");
            return (Criteria) this;
        }

        public Criteria andCollctypeIsNull() {
            addCriterion("collctype is null");
            return (Criteria) this;
        }

        public Criteria andCollctypeIsNotNull() {
            addCriterion("collctype is not null");
            return (Criteria) this;
        }

        public Criteria andCollctypeEqualTo(String value) {
            addCriterion("collctype =", value, "collctype");
            return (Criteria) this;
        }

        public Criteria andCollctypeNotEqualTo(String value) {
            addCriterion("collctype <>", value, "collctype");
            return (Criteria) this;
        }

        public Criteria andCollctypeGreaterThan(String value) {
            addCriterion("collctype >", value, "collctype");
            return (Criteria) this;
        }

        public Criteria andCollctypeGreaterThanOrEqualTo(String value) {
            addCriterion("collctype >=", value, "collctype");
            return (Criteria) this;
        }

        public Criteria andCollctypeLessThan(String value) {
            addCriterion("collctype <", value, "collctype");
            return (Criteria) this;
        }

        public Criteria andCollctypeLessThanOrEqualTo(String value) {
            addCriterion("collctype <=", value, "collctype");
            return (Criteria) this;
        }

        public Criteria andCollctypeLike(String value) {
            addCriterion("collctype like", value, "collctype");
            return (Criteria) this;
        }

        public Criteria andCollctypeNotLike(String value) {
            addCriterion("collctype not like", value, "collctype");
            return (Criteria) this;
        }

        public Criteria andCollctypeIn(List<String> values) {
            addCriterion("collctype in", values, "collctype");
            return (Criteria) this;
        }

        public Criteria andCollctypeNotIn(List<String> values) {
            addCriterion("collctype not in", values, "collctype");
            return (Criteria) this;
        }

        public Criteria andCollctypeBetween(String value1, String value2) {
            addCriterion("collctype between", value1, value2, "collctype");
            return (Criteria) this;
        }

        public Criteria andCollctypeNotBetween(String value1, String value2) {
            addCriterion("collctype not between", value1, value2, "collctype");
            return (Criteria) this;
        }

        public Criteria andColllocaleIsNull() {
            addCriterion("colllocale is null");
            return (Criteria) this;
        }

        public Criteria andColllocaleIsNotNull() {
            addCriterion("colllocale is not null");
            return (Criteria) this;
        }

        public Criteria andColllocaleEqualTo(String value) {
            addCriterion("colllocale =", value, "colllocale");
            return (Criteria) this;
        }

        public Criteria andColllocaleNotEqualTo(String value) {
            addCriterion("colllocale <>", value, "colllocale");
            return (Criteria) this;
        }

        public Criteria andColllocaleGreaterThan(String value) {
            addCriterion("colllocale >", value, "colllocale");
            return (Criteria) this;
        }

        public Criteria andColllocaleGreaterThanOrEqualTo(String value) {
            addCriterion("colllocale >=", value, "colllocale");
            return (Criteria) this;
        }

        public Criteria andColllocaleLessThan(String value) {
            addCriterion("colllocale <", value, "colllocale");
            return (Criteria) this;
        }

        public Criteria andColllocaleLessThanOrEqualTo(String value) {
            addCriterion("colllocale <=", value, "colllocale");
            return (Criteria) this;
        }

        public Criteria andColllocaleLike(String value) {
            addCriterion("colllocale like", value, "colllocale");
            return (Criteria) this;
        }

        public Criteria andColllocaleNotLike(String value) {
            addCriterion("colllocale not like", value, "colllocale");
            return (Criteria) this;
        }

        public Criteria andColllocaleIn(List<String> values) {
            addCriterion("colllocale in", values, "colllocale");
            return (Criteria) this;
        }

        public Criteria andColllocaleNotIn(List<String> values) {
            addCriterion("colllocale not in", values, "colllocale");
            return (Criteria) this;
        }

        public Criteria andColllocaleBetween(String value1, String value2) {
            addCriterion("colllocale between", value1, value2, "colllocale");
            return (Criteria) this;
        }

        public Criteria andColllocaleNotBetween(String value1, String value2) {
            addCriterion("colllocale not between", value1, value2, "colllocale");
            return (Criteria) this;
        }

        public Criteria andCollicurulesIsNull() {
            addCriterion("collicurules is null");
            return (Criteria) this;
        }

        public Criteria andCollicurulesIsNotNull() {
            addCriterion("collicurules is not null");
            return (Criteria) this;
        }

        public Criteria andCollicurulesEqualTo(String value) {
            addCriterion("collicurules =", value, "collicurules");
            return (Criteria) this;
        }

        public Criteria andCollicurulesNotEqualTo(String value) {
            addCriterion("collicurules <>", value, "collicurules");
            return (Criteria) this;
        }

        public Criteria andCollicurulesGreaterThan(String value) {
            addCriterion("collicurules >", value, "collicurules");
            return (Criteria) this;
        }

        public Criteria andCollicurulesGreaterThanOrEqualTo(String value) {
            addCriterion("collicurules >=", value, "collicurules");
            return (Criteria) this;
        }

        public Criteria andCollicurulesLessThan(String value) {
            addCriterion("collicurules <", value, "collicurules");
            return (Criteria) this;
        }

        public Criteria andCollicurulesLessThanOrEqualTo(String value) {
            addCriterion("collicurules <=", value, "collicurules");
            return (Criteria) this;
        }

        public Criteria andCollicurulesLike(String value) {
            addCriterion("collicurules like", value, "collicurules");
            return (Criteria) this;
        }

        public Criteria andCollicurulesNotLike(String value) {
            addCriterion("collicurules not like", value, "collicurules");
            return (Criteria) this;
        }

        public Criteria andCollicurulesIn(List<String> values) {
            addCriterion("collicurules in", values, "collicurules");
            return (Criteria) this;
        }

        public Criteria andCollicurulesNotIn(List<String> values) {
            addCriterion("collicurules not in", values, "collicurules");
            return (Criteria) this;
        }

        public Criteria andCollicurulesBetween(String value1, String value2) {
            addCriterion("collicurules between", value1, value2, "collicurules");
            return (Criteria) this;
        }

        public Criteria andCollicurulesNotBetween(String value1, String value2) {
            addCriterion("collicurules not between", value1, value2, "collicurules");
            return (Criteria) this;
        }

        public Criteria andCollversionIsNull() {
            addCriterion("collversion is null");
            return (Criteria) this;
        }

        public Criteria andCollversionIsNotNull() {
            addCriterion("collversion is not null");
            return (Criteria) this;
        }

        public Criteria andCollversionEqualTo(String value) {
            addCriterion("collversion =", value, "collversion");
            return (Criteria) this;
        }

        public Criteria andCollversionNotEqualTo(String value) {
            addCriterion("collversion <>", value, "collversion");
            return (Criteria) this;
        }

        public Criteria andCollversionGreaterThan(String value) {
            addCriterion("collversion >", value, "collversion");
            return (Criteria) this;
        }

        public Criteria andCollversionGreaterThanOrEqualTo(String value) {
            addCriterion("collversion >=", value, "collversion");
            return (Criteria) this;
        }

        public Criteria andCollversionLessThan(String value) {
            addCriterion("collversion <", value, "collversion");
            return (Criteria) this;
        }

        public Criteria andCollversionLessThanOrEqualTo(String value) {
            addCriterion("collversion <=", value, "collversion");
            return (Criteria) this;
        }

        public Criteria andCollversionLike(String value) {
            addCriterion("collversion like", value, "collversion");
            return (Criteria) this;
        }

        public Criteria andCollversionNotLike(String value) {
            addCriterion("collversion not like", value, "collversion");
            return (Criteria) this;
        }

        public Criteria andCollversionIn(List<String> values) {
            addCriterion("collversion in", values, "collversion");
            return (Criteria) this;
        }

        public Criteria andCollversionNotIn(List<String> values) {
            addCriterion("collversion not in", values, "collversion");
            return (Criteria) this;
        }

        public Criteria andCollversionBetween(String value1, String value2) {
            addCriterion("collversion between", value1, value2, "collversion");
            return (Criteria) this;
        }

        public Criteria andCollversionNotBetween(String value1, String value2) {
            addCriterion("collversion not between", value1, value2, "collversion");
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