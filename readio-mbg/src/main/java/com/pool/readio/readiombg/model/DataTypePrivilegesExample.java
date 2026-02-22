package com.pool.readio.readiombg.model;

import java.util.ArrayList;
import java.util.List;

public class DataTypePrivilegesExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DataTypePrivilegesExample() {
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

        public Criteria andObjectCatalogIsNull() {
            addCriterion("object_catalog is null");
            return (Criteria) this;
        }

        public Criteria andObjectCatalogIsNotNull() {
            addCriterion("object_catalog is not null");
            return (Criteria) this;
        }

        public Criteria andObjectCatalogEqualTo(Object value) {
            addCriterion("object_catalog =", value, "objectCatalog");
            return (Criteria) this;
        }

        public Criteria andObjectCatalogNotEqualTo(Object value) {
            addCriterion("object_catalog <>", value, "objectCatalog");
            return (Criteria) this;
        }

        public Criteria andObjectCatalogGreaterThan(Object value) {
            addCriterion("object_catalog >", value, "objectCatalog");
            return (Criteria) this;
        }

        public Criteria andObjectCatalogGreaterThanOrEqualTo(Object value) {
            addCriterion("object_catalog >=", value, "objectCatalog");
            return (Criteria) this;
        }

        public Criteria andObjectCatalogLessThan(Object value) {
            addCriterion("object_catalog <", value, "objectCatalog");
            return (Criteria) this;
        }

        public Criteria andObjectCatalogLessThanOrEqualTo(Object value) {
            addCriterion("object_catalog <=", value, "objectCatalog");
            return (Criteria) this;
        }

        public Criteria andObjectCatalogIn(List<Object> values) {
            addCriterion("object_catalog in", values, "objectCatalog");
            return (Criteria) this;
        }

        public Criteria andObjectCatalogNotIn(List<Object> values) {
            addCriterion("object_catalog not in", values, "objectCatalog");
            return (Criteria) this;
        }

        public Criteria andObjectCatalogBetween(Object value1, Object value2) {
            addCriterion("object_catalog between", value1, value2, "objectCatalog");
            return (Criteria) this;
        }

        public Criteria andObjectCatalogNotBetween(Object value1, Object value2) {
            addCriterion("object_catalog not between", value1, value2, "objectCatalog");
            return (Criteria) this;
        }

        public Criteria andObjectSchemaIsNull() {
            addCriterion("object_schema is null");
            return (Criteria) this;
        }

        public Criteria andObjectSchemaIsNotNull() {
            addCriterion("object_schema is not null");
            return (Criteria) this;
        }

        public Criteria andObjectSchemaEqualTo(Object value) {
            addCriterion("object_schema =", value, "objectSchema");
            return (Criteria) this;
        }

        public Criteria andObjectSchemaNotEqualTo(Object value) {
            addCriterion("object_schema <>", value, "objectSchema");
            return (Criteria) this;
        }

        public Criteria andObjectSchemaGreaterThan(Object value) {
            addCriterion("object_schema >", value, "objectSchema");
            return (Criteria) this;
        }

        public Criteria andObjectSchemaGreaterThanOrEqualTo(Object value) {
            addCriterion("object_schema >=", value, "objectSchema");
            return (Criteria) this;
        }

        public Criteria andObjectSchemaLessThan(Object value) {
            addCriterion("object_schema <", value, "objectSchema");
            return (Criteria) this;
        }

        public Criteria andObjectSchemaLessThanOrEqualTo(Object value) {
            addCriterion("object_schema <=", value, "objectSchema");
            return (Criteria) this;
        }

        public Criteria andObjectSchemaIn(List<Object> values) {
            addCriterion("object_schema in", values, "objectSchema");
            return (Criteria) this;
        }

        public Criteria andObjectSchemaNotIn(List<Object> values) {
            addCriterion("object_schema not in", values, "objectSchema");
            return (Criteria) this;
        }

        public Criteria andObjectSchemaBetween(Object value1, Object value2) {
            addCriterion("object_schema between", value1, value2, "objectSchema");
            return (Criteria) this;
        }

        public Criteria andObjectSchemaNotBetween(Object value1, Object value2) {
            addCriterion("object_schema not between", value1, value2, "objectSchema");
            return (Criteria) this;
        }

        public Criteria andObjectNameIsNull() {
            addCriterion("object_name is null");
            return (Criteria) this;
        }

        public Criteria andObjectNameIsNotNull() {
            addCriterion("object_name is not null");
            return (Criteria) this;
        }

        public Criteria andObjectNameEqualTo(Object value) {
            addCriterion("object_name =", value, "objectName");
            return (Criteria) this;
        }

        public Criteria andObjectNameNotEqualTo(Object value) {
            addCriterion("object_name <>", value, "objectName");
            return (Criteria) this;
        }

        public Criteria andObjectNameGreaterThan(Object value) {
            addCriterion("object_name >", value, "objectName");
            return (Criteria) this;
        }

        public Criteria andObjectNameGreaterThanOrEqualTo(Object value) {
            addCriterion("object_name >=", value, "objectName");
            return (Criteria) this;
        }

        public Criteria andObjectNameLessThan(Object value) {
            addCriterion("object_name <", value, "objectName");
            return (Criteria) this;
        }

        public Criteria andObjectNameLessThanOrEqualTo(Object value) {
            addCriterion("object_name <=", value, "objectName");
            return (Criteria) this;
        }

        public Criteria andObjectNameIn(List<Object> values) {
            addCriterion("object_name in", values, "objectName");
            return (Criteria) this;
        }

        public Criteria andObjectNameNotIn(List<Object> values) {
            addCriterion("object_name not in", values, "objectName");
            return (Criteria) this;
        }

        public Criteria andObjectNameBetween(Object value1, Object value2) {
            addCriterion("object_name between", value1, value2, "objectName");
            return (Criteria) this;
        }

        public Criteria andObjectNameNotBetween(Object value1, Object value2) {
            addCriterion("object_name not between", value1, value2, "objectName");
            return (Criteria) this;
        }

        public Criteria andObjectTypeIsNull() {
            addCriterion("object_type is null");
            return (Criteria) this;
        }

        public Criteria andObjectTypeIsNotNull() {
            addCriterion("object_type is not null");
            return (Criteria) this;
        }

        public Criteria andObjectTypeEqualTo(Object value) {
            addCriterion("object_type =", value, "objectType");
            return (Criteria) this;
        }

        public Criteria andObjectTypeNotEqualTo(Object value) {
            addCriterion("object_type <>", value, "objectType");
            return (Criteria) this;
        }

        public Criteria andObjectTypeGreaterThan(Object value) {
            addCriterion("object_type >", value, "objectType");
            return (Criteria) this;
        }

        public Criteria andObjectTypeGreaterThanOrEqualTo(Object value) {
            addCriterion("object_type >=", value, "objectType");
            return (Criteria) this;
        }

        public Criteria andObjectTypeLessThan(Object value) {
            addCriterion("object_type <", value, "objectType");
            return (Criteria) this;
        }

        public Criteria andObjectTypeLessThanOrEqualTo(Object value) {
            addCriterion("object_type <=", value, "objectType");
            return (Criteria) this;
        }

        public Criteria andObjectTypeIn(List<Object> values) {
            addCriterion("object_type in", values, "objectType");
            return (Criteria) this;
        }

        public Criteria andObjectTypeNotIn(List<Object> values) {
            addCriterion("object_type not in", values, "objectType");
            return (Criteria) this;
        }

        public Criteria andObjectTypeBetween(Object value1, Object value2) {
            addCriterion("object_type between", value1, value2, "objectType");
            return (Criteria) this;
        }

        public Criteria andObjectTypeNotBetween(Object value1, Object value2) {
            addCriterion("object_type not between", value1, value2, "objectType");
            return (Criteria) this;
        }

        public Criteria andDtdIdentifierIsNull() {
            addCriterion("dtd_identifier is null");
            return (Criteria) this;
        }

        public Criteria andDtdIdentifierIsNotNull() {
            addCriterion("dtd_identifier is not null");
            return (Criteria) this;
        }

        public Criteria andDtdIdentifierEqualTo(Object value) {
            addCriterion("dtd_identifier =", value, "dtdIdentifier");
            return (Criteria) this;
        }

        public Criteria andDtdIdentifierNotEqualTo(Object value) {
            addCriterion("dtd_identifier <>", value, "dtdIdentifier");
            return (Criteria) this;
        }

        public Criteria andDtdIdentifierGreaterThan(Object value) {
            addCriterion("dtd_identifier >", value, "dtdIdentifier");
            return (Criteria) this;
        }

        public Criteria andDtdIdentifierGreaterThanOrEqualTo(Object value) {
            addCriterion("dtd_identifier >=", value, "dtdIdentifier");
            return (Criteria) this;
        }

        public Criteria andDtdIdentifierLessThan(Object value) {
            addCriterion("dtd_identifier <", value, "dtdIdentifier");
            return (Criteria) this;
        }

        public Criteria andDtdIdentifierLessThanOrEqualTo(Object value) {
            addCriterion("dtd_identifier <=", value, "dtdIdentifier");
            return (Criteria) this;
        }

        public Criteria andDtdIdentifierIn(List<Object> values) {
            addCriterion("dtd_identifier in", values, "dtdIdentifier");
            return (Criteria) this;
        }

        public Criteria andDtdIdentifierNotIn(List<Object> values) {
            addCriterion("dtd_identifier not in", values, "dtdIdentifier");
            return (Criteria) this;
        }

        public Criteria andDtdIdentifierBetween(Object value1, Object value2) {
            addCriterion("dtd_identifier between", value1, value2, "dtdIdentifier");
            return (Criteria) this;
        }

        public Criteria andDtdIdentifierNotBetween(Object value1, Object value2) {
            addCriterion("dtd_identifier not between", value1, value2, "dtdIdentifier");
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