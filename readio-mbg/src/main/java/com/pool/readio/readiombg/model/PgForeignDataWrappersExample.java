package com.pool.readio.readiombg.model;

import java.util.ArrayList;
import java.util.List;

public class PgForeignDataWrappersExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PgForeignDataWrappersExample() {
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

        public Criteria andFdwownerIsNull() {
            addCriterion("fdwowner is null");
            return (Criteria) this;
        }

        public Criteria andFdwownerIsNotNull() {
            addCriterion("fdwowner is not null");
            return (Criteria) this;
        }

        public Criteria andFdwownerEqualTo(Long value) {
            addCriterion("fdwowner =", value, "fdwowner");
            return (Criteria) this;
        }

        public Criteria andFdwownerNotEqualTo(Long value) {
            addCriterion("fdwowner <>", value, "fdwowner");
            return (Criteria) this;
        }

        public Criteria andFdwownerGreaterThan(Long value) {
            addCriterion("fdwowner >", value, "fdwowner");
            return (Criteria) this;
        }

        public Criteria andFdwownerGreaterThanOrEqualTo(Long value) {
            addCriterion("fdwowner >=", value, "fdwowner");
            return (Criteria) this;
        }

        public Criteria andFdwownerLessThan(Long value) {
            addCriterion("fdwowner <", value, "fdwowner");
            return (Criteria) this;
        }

        public Criteria andFdwownerLessThanOrEqualTo(Long value) {
            addCriterion("fdwowner <=", value, "fdwowner");
            return (Criteria) this;
        }

        public Criteria andFdwownerIn(List<Long> values) {
            addCriterion("fdwowner in", values, "fdwowner");
            return (Criteria) this;
        }

        public Criteria andFdwownerNotIn(List<Long> values) {
            addCriterion("fdwowner not in", values, "fdwowner");
            return (Criteria) this;
        }

        public Criteria andFdwownerBetween(Long value1, Long value2) {
            addCriterion("fdwowner between", value1, value2, "fdwowner");
            return (Criteria) this;
        }

        public Criteria andFdwownerNotBetween(Long value1, Long value2) {
            addCriterion("fdwowner not between", value1, value2, "fdwowner");
            return (Criteria) this;
        }

        public Criteria andFdwoptionsIsNull() {
            addCriterion("fdwoptions is null");
            return (Criteria) this;
        }

        public Criteria andFdwoptionsIsNotNull() {
            addCriterion("fdwoptions is not null");
            return (Criteria) this;
        }

        public Criteria andFdwoptionsEqualTo(Object value) {
            addCriterion("fdwoptions =", value, "fdwoptions");
            return (Criteria) this;
        }

        public Criteria andFdwoptionsNotEqualTo(Object value) {
            addCriterion("fdwoptions <>", value, "fdwoptions");
            return (Criteria) this;
        }

        public Criteria andFdwoptionsGreaterThan(Object value) {
            addCriterion("fdwoptions >", value, "fdwoptions");
            return (Criteria) this;
        }

        public Criteria andFdwoptionsGreaterThanOrEqualTo(Object value) {
            addCriterion("fdwoptions >=", value, "fdwoptions");
            return (Criteria) this;
        }

        public Criteria andFdwoptionsLessThan(Object value) {
            addCriterion("fdwoptions <", value, "fdwoptions");
            return (Criteria) this;
        }

        public Criteria andFdwoptionsLessThanOrEqualTo(Object value) {
            addCriterion("fdwoptions <=", value, "fdwoptions");
            return (Criteria) this;
        }

        public Criteria andFdwoptionsIn(List<Object> values) {
            addCriterion("fdwoptions in", values, "fdwoptions");
            return (Criteria) this;
        }

        public Criteria andFdwoptionsNotIn(List<Object> values) {
            addCriterion("fdwoptions not in", values, "fdwoptions");
            return (Criteria) this;
        }

        public Criteria andFdwoptionsBetween(Object value1, Object value2) {
            addCriterion("fdwoptions between", value1, value2, "fdwoptions");
            return (Criteria) this;
        }

        public Criteria andFdwoptionsNotBetween(Object value1, Object value2) {
            addCriterion("fdwoptions not between", value1, value2, "fdwoptions");
            return (Criteria) this;
        }

        public Criteria andForeignDataWrapperCatalogIsNull() {
            addCriterion("foreign_data_wrapper_catalog is null");
            return (Criteria) this;
        }

        public Criteria andForeignDataWrapperCatalogIsNotNull() {
            addCriterion("foreign_data_wrapper_catalog is not null");
            return (Criteria) this;
        }

        public Criteria andForeignDataWrapperCatalogEqualTo(Object value) {
            addCriterion("foreign_data_wrapper_catalog =", value, "foreignDataWrapperCatalog");
            return (Criteria) this;
        }

        public Criteria andForeignDataWrapperCatalogNotEqualTo(Object value) {
            addCriterion("foreign_data_wrapper_catalog <>", value, "foreignDataWrapperCatalog");
            return (Criteria) this;
        }

        public Criteria andForeignDataWrapperCatalogGreaterThan(Object value) {
            addCriterion("foreign_data_wrapper_catalog >", value, "foreignDataWrapperCatalog");
            return (Criteria) this;
        }

        public Criteria andForeignDataWrapperCatalogGreaterThanOrEqualTo(Object value) {
            addCriterion("foreign_data_wrapper_catalog >=", value, "foreignDataWrapperCatalog");
            return (Criteria) this;
        }

        public Criteria andForeignDataWrapperCatalogLessThan(Object value) {
            addCriterion("foreign_data_wrapper_catalog <", value, "foreignDataWrapperCatalog");
            return (Criteria) this;
        }

        public Criteria andForeignDataWrapperCatalogLessThanOrEqualTo(Object value) {
            addCriterion("foreign_data_wrapper_catalog <=", value, "foreignDataWrapperCatalog");
            return (Criteria) this;
        }

        public Criteria andForeignDataWrapperCatalogIn(List<Object> values) {
            addCriterion("foreign_data_wrapper_catalog in", values, "foreignDataWrapperCatalog");
            return (Criteria) this;
        }

        public Criteria andForeignDataWrapperCatalogNotIn(List<Object> values) {
            addCriterion("foreign_data_wrapper_catalog not in", values, "foreignDataWrapperCatalog");
            return (Criteria) this;
        }

        public Criteria andForeignDataWrapperCatalogBetween(Object value1, Object value2) {
            addCriterion("foreign_data_wrapper_catalog between", value1, value2, "foreignDataWrapperCatalog");
            return (Criteria) this;
        }

        public Criteria andForeignDataWrapperCatalogNotBetween(Object value1, Object value2) {
            addCriterion("foreign_data_wrapper_catalog not between", value1, value2, "foreignDataWrapperCatalog");
            return (Criteria) this;
        }

        public Criteria andForeignDataWrapperNameIsNull() {
            addCriterion("foreign_data_wrapper_name is null");
            return (Criteria) this;
        }

        public Criteria andForeignDataWrapperNameIsNotNull() {
            addCriterion("foreign_data_wrapper_name is not null");
            return (Criteria) this;
        }

        public Criteria andForeignDataWrapperNameEqualTo(Object value) {
            addCriterion("foreign_data_wrapper_name =", value, "foreignDataWrapperName");
            return (Criteria) this;
        }

        public Criteria andForeignDataWrapperNameNotEqualTo(Object value) {
            addCriterion("foreign_data_wrapper_name <>", value, "foreignDataWrapperName");
            return (Criteria) this;
        }

        public Criteria andForeignDataWrapperNameGreaterThan(Object value) {
            addCriterion("foreign_data_wrapper_name >", value, "foreignDataWrapperName");
            return (Criteria) this;
        }

        public Criteria andForeignDataWrapperNameGreaterThanOrEqualTo(Object value) {
            addCriterion("foreign_data_wrapper_name >=", value, "foreignDataWrapperName");
            return (Criteria) this;
        }

        public Criteria andForeignDataWrapperNameLessThan(Object value) {
            addCriterion("foreign_data_wrapper_name <", value, "foreignDataWrapperName");
            return (Criteria) this;
        }

        public Criteria andForeignDataWrapperNameLessThanOrEqualTo(Object value) {
            addCriterion("foreign_data_wrapper_name <=", value, "foreignDataWrapperName");
            return (Criteria) this;
        }

        public Criteria andForeignDataWrapperNameIn(List<Object> values) {
            addCriterion("foreign_data_wrapper_name in", values, "foreignDataWrapperName");
            return (Criteria) this;
        }

        public Criteria andForeignDataWrapperNameNotIn(List<Object> values) {
            addCriterion("foreign_data_wrapper_name not in", values, "foreignDataWrapperName");
            return (Criteria) this;
        }

        public Criteria andForeignDataWrapperNameBetween(Object value1, Object value2) {
            addCriterion("foreign_data_wrapper_name between", value1, value2, "foreignDataWrapperName");
            return (Criteria) this;
        }

        public Criteria andForeignDataWrapperNameNotBetween(Object value1, Object value2) {
            addCriterion("foreign_data_wrapper_name not between", value1, value2, "foreignDataWrapperName");
            return (Criteria) this;
        }

        public Criteria andAuthorizationIdentifierIsNull() {
            addCriterion("authorization_identifier is null");
            return (Criteria) this;
        }

        public Criteria andAuthorizationIdentifierIsNotNull() {
            addCriterion("authorization_identifier is not null");
            return (Criteria) this;
        }

        public Criteria andAuthorizationIdentifierEqualTo(Object value) {
            addCriterion("authorization_identifier =", value, "authorizationIdentifier");
            return (Criteria) this;
        }

        public Criteria andAuthorizationIdentifierNotEqualTo(Object value) {
            addCriterion("authorization_identifier <>", value, "authorizationIdentifier");
            return (Criteria) this;
        }

        public Criteria andAuthorizationIdentifierGreaterThan(Object value) {
            addCriterion("authorization_identifier >", value, "authorizationIdentifier");
            return (Criteria) this;
        }

        public Criteria andAuthorizationIdentifierGreaterThanOrEqualTo(Object value) {
            addCriterion("authorization_identifier >=", value, "authorizationIdentifier");
            return (Criteria) this;
        }

        public Criteria andAuthorizationIdentifierLessThan(Object value) {
            addCriterion("authorization_identifier <", value, "authorizationIdentifier");
            return (Criteria) this;
        }

        public Criteria andAuthorizationIdentifierLessThanOrEqualTo(Object value) {
            addCriterion("authorization_identifier <=", value, "authorizationIdentifier");
            return (Criteria) this;
        }

        public Criteria andAuthorizationIdentifierIn(List<Object> values) {
            addCriterion("authorization_identifier in", values, "authorizationIdentifier");
            return (Criteria) this;
        }

        public Criteria andAuthorizationIdentifierNotIn(List<Object> values) {
            addCriterion("authorization_identifier not in", values, "authorizationIdentifier");
            return (Criteria) this;
        }

        public Criteria andAuthorizationIdentifierBetween(Object value1, Object value2) {
            addCriterion("authorization_identifier between", value1, value2, "authorizationIdentifier");
            return (Criteria) this;
        }

        public Criteria andAuthorizationIdentifierNotBetween(Object value1, Object value2) {
            addCriterion("authorization_identifier not between", value1, value2, "authorizationIdentifier");
            return (Criteria) this;
        }

        public Criteria andForeignDataWrapperLanguageIsNull() {
            addCriterion("foreign_data_wrapper_language is null");
            return (Criteria) this;
        }

        public Criteria andForeignDataWrapperLanguageIsNotNull() {
            addCriterion("foreign_data_wrapper_language is not null");
            return (Criteria) this;
        }

        public Criteria andForeignDataWrapperLanguageEqualTo(Object value) {
            addCriterion("foreign_data_wrapper_language =", value, "foreignDataWrapperLanguage");
            return (Criteria) this;
        }

        public Criteria andForeignDataWrapperLanguageNotEqualTo(Object value) {
            addCriterion("foreign_data_wrapper_language <>", value, "foreignDataWrapperLanguage");
            return (Criteria) this;
        }

        public Criteria andForeignDataWrapperLanguageGreaterThan(Object value) {
            addCriterion("foreign_data_wrapper_language >", value, "foreignDataWrapperLanguage");
            return (Criteria) this;
        }

        public Criteria andForeignDataWrapperLanguageGreaterThanOrEqualTo(Object value) {
            addCriterion("foreign_data_wrapper_language >=", value, "foreignDataWrapperLanguage");
            return (Criteria) this;
        }

        public Criteria andForeignDataWrapperLanguageLessThan(Object value) {
            addCriterion("foreign_data_wrapper_language <", value, "foreignDataWrapperLanguage");
            return (Criteria) this;
        }

        public Criteria andForeignDataWrapperLanguageLessThanOrEqualTo(Object value) {
            addCriterion("foreign_data_wrapper_language <=", value, "foreignDataWrapperLanguage");
            return (Criteria) this;
        }

        public Criteria andForeignDataWrapperLanguageIn(List<Object> values) {
            addCriterion("foreign_data_wrapper_language in", values, "foreignDataWrapperLanguage");
            return (Criteria) this;
        }

        public Criteria andForeignDataWrapperLanguageNotIn(List<Object> values) {
            addCriterion("foreign_data_wrapper_language not in", values, "foreignDataWrapperLanguage");
            return (Criteria) this;
        }

        public Criteria andForeignDataWrapperLanguageBetween(Object value1, Object value2) {
            addCriterion("foreign_data_wrapper_language between", value1, value2, "foreignDataWrapperLanguage");
            return (Criteria) this;
        }

        public Criteria andForeignDataWrapperLanguageNotBetween(Object value1, Object value2) {
            addCriterion("foreign_data_wrapper_language not between", value1, value2, "foreignDataWrapperLanguage");
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