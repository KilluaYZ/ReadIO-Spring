package com.pool.readio.mbg.model;

import java.util.ArrayList;
import java.util.List;

public class PgForeignTablesExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PgForeignTablesExample() {
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

        public Criteria andForeignTableCatalogIsNull() {
            addCriterion("foreign_table_catalog is null");
            return (Criteria) this;
        }

        public Criteria andForeignTableCatalogIsNotNull() {
            addCriterion("foreign_table_catalog is not null");
            return (Criteria) this;
        }

        public Criteria andForeignTableCatalogEqualTo(Object value) {
            addCriterion("foreign_table_catalog =", value, "foreignTableCatalog");
            return (Criteria) this;
        }

        public Criteria andForeignTableCatalogNotEqualTo(Object value) {
            addCriterion("foreign_table_catalog <>", value, "foreignTableCatalog");
            return (Criteria) this;
        }

        public Criteria andForeignTableCatalogGreaterThan(Object value) {
            addCriterion("foreign_table_catalog >", value, "foreignTableCatalog");
            return (Criteria) this;
        }

        public Criteria andForeignTableCatalogGreaterThanOrEqualTo(Object value) {
            addCriterion("foreign_table_catalog >=", value, "foreignTableCatalog");
            return (Criteria) this;
        }

        public Criteria andForeignTableCatalogLessThan(Object value) {
            addCriterion("foreign_table_catalog <", value, "foreignTableCatalog");
            return (Criteria) this;
        }

        public Criteria andForeignTableCatalogLessThanOrEqualTo(Object value) {
            addCriterion("foreign_table_catalog <=", value, "foreignTableCatalog");
            return (Criteria) this;
        }

        public Criteria andForeignTableCatalogIn(List<Object> values) {
            addCriterion("foreign_table_catalog in", values, "foreignTableCatalog");
            return (Criteria) this;
        }

        public Criteria andForeignTableCatalogNotIn(List<Object> values) {
            addCriterion("foreign_table_catalog not in", values, "foreignTableCatalog");
            return (Criteria) this;
        }

        public Criteria andForeignTableCatalogBetween(Object value1, Object value2) {
            addCriterion("foreign_table_catalog between", value1, value2, "foreignTableCatalog");
            return (Criteria) this;
        }

        public Criteria andForeignTableCatalogNotBetween(Object value1, Object value2) {
            addCriterion("foreign_table_catalog not between", value1, value2, "foreignTableCatalog");
            return (Criteria) this;
        }

        public Criteria andForeignTableSchemaIsNull() {
            addCriterion("foreign_table_schema is null");
            return (Criteria) this;
        }

        public Criteria andForeignTableSchemaIsNotNull() {
            addCriterion("foreign_table_schema is not null");
            return (Criteria) this;
        }

        public Criteria andForeignTableSchemaEqualTo(Object value) {
            addCriterion("foreign_table_schema =", value, "foreignTableSchema");
            return (Criteria) this;
        }

        public Criteria andForeignTableSchemaNotEqualTo(Object value) {
            addCriterion("foreign_table_schema <>", value, "foreignTableSchema");
            return (Criteria) this;
        }

        public Criteria andForeignTableSchemaGreaterThan(Object value) {
            addCriterion("foreign_table_schema >", value, "foreignTableSchema");
            return (Criteria) this;
        }

        public Criteria andForeignTableSchemaGreaterThanOrEqualTo(Object value) {
            addCriterion("foreign_table_schema >=", value, "foreignTableSchema");
            return (Criteria) this;
        }

        public Criteria andForeignTableSchemaLessThan(Object value) {
            addCriterion("foreign_table_schema <", value, "foreignTableSchema");
            return (Criteria) this;
        }

        public Criteria andForeignTableSchemaLessThanOrEqualTo(Object value) {
            addCriterion("foreign_table_schema <=", value, "foreignTableSchema");
            return (Criteria) this;
        }

        public Criteria andForeignTableSchemaIn(List<Object> values) {
            addCriterion("foreign_table_schema in", values, "foreignTableSchema");
            return (Criteria) this;
        }

        public Criteria andForeignTableSchemaNotIn(List<Object> values) {
            addCriterion("foreign_table_schema not in", values, "foreignTableSchema");
            return (Criteria) this;
        }

        public Criteria andForeignTableSchemaBetween(Object value1, Object value2) {
            addCriterion("foreign_table_schema between", value1, value2, "foreignTableSchema");
            return (Criteria) this;
        }

        public Criteria andForeignTableSchemaNotBetween(Object value1, Object value2) {
            addCriterion("foreign_table_schema not between", value1, value2, "foreignTableSchema");
            return (Criteria) this;
        }

        public Criteria andForeignTableNameIsNull() {
            addCriterion("foreign_table_name is null");
            return (Criteria) this;
        }

        public Criteria andForeignTableNameIsNotNull() {
            addCriterion("foreign_table_name is not null");
            return (Criteria) this;
        }

        public Criteria andForeignTableNameEqualTo(Object value) {
            addCriterion("foreign_table_name =", value, "foreignTableName");
            return (Criteria) this;
        }

        public Criteria andForeignTableNameNotEqualTo(Object value) {
            addCriterion("foreign_table_name <>", value, "foreignTableName");
            return (Criteria) this;
        }

        public Criteria andForeignTableNameGreaterThan(Object value) {
            addCriterion("foreign_table_name >", value, "foreignTableName");
            return (Criteria) this;
        }

        public Criteria andForeignTableNameGreaterThanOrEqualTo(Object value) {
            addCriterion("foreign_table_name >=", value, "foreignTableName");
            return (Criteria) this;
        }

        public Criteria andForeignTableNameLessThan(Object value) {
            addCriterion("foreign_table_name <", value, "foreignTableName");
            return (Criteria) this;
        }

        public Criteria andForeignTableNameLessThanOrEqualTo(Object value) {
            addCriterion("foreign_table_name <=", value, "foreignTableName");
            return (Criteria) this;
        }

        public Criteria andForeignTableNameIn(List<Object> values) {
            addCriterion("foreign_table_name in", values, "foreignTableName");
            return (Criteria) this;
        }

        public Criteria andForeignTableNameNotIn(List<Object> values) {
            addCriterion("foreign_table_name not in", values, "foreignTableName");
            return (Criteria) this;
        }

        public Criteria andForeignTableNameBetween(Object value1, Object value2) {
            addCriterion("foreign_table_name between", value1, value2, "foreignTableName");
            return (Criteria) this;
        }

        public Criteria andForeignTableNameNotBetween(Object value1, Object value2) {
            addCriterion("foreign_table_name not between", value1, value2, "foreignTableName");
            return (Criteria) this;
        }

        public Criteria andFtoptionsIsNull() {
            addCriterion("ftoptions is null");
            return (Criteria) this;
        }

        public Criteria andFtoptionsIsNotNull() {
            addCriterion("ftoptions is not null");
            return (Criteria) this;
        }

        public Criteria andFtoptionsEqualTo(Object value) {
            addCriterion("ftoptions =", value, "ftoptions");
            return (Criteria) this;
        }

        public Criteria andFtoptionsNotEqualTo(Object value) {
            addCriterion("ftoptions <>", value, "ftoptions");
            return (Criteria) this;
        }

        public Criteria andFtoptionsGreaterThan(Object value) {
            addCriterion("ftoptions >", value, "ftoptions");
            return (Criteria) this;
        }

        public Criteria andFtoptionsGreaterThanOrEqualTo(Object value) {
            addCriterion("ftoptions >=", value, "ftoptions");
            return (Criteria) this;
        }

        public Criteria andFtoptionsLessThan(Object value) {
            addCriterion("ftoptions <", value, "ftoptions");
            return (Criteria) this;
        }

        public Criteria andFtoptionsLessThanOrEqualTo(Object value) {
            addCriterion("ftoptions <=", value, "ftoptions");
            return (Criteria) this;
        }

        public Criteria andFtoptionsIn(List<Object> values) {
            addCriterion("ftoptions in", values, "ftoptions");
            return (Criteria) this;
        }

        public Criteria andFtoptionsNotIn(List<Object> values) {
            addCriterion("ftoptions not in", values, "ftoptions");
            return (Criteria) this;
        }

        public Criteria andFtoptionsBetween(Object value1, Object value2) {
            addCriterion("ftoptions between", value1, value2, "ftoptions");
            return (Criteria) this;
        }

        public Criteria andFtoptionsNotBetween(Object value1, Object value2) {
            addCriterion("ftoptions not between", value1, value2, "ftoptions");
            return (Criteria) this;
        }

        public Criteria andForeignServerCatalogIsNull() {
            addCriterion("foreign_server_catalog is null");
            return (Criteria) this;
        }

        public Criteria andForeignServerCatalogIsNotNull() {
            addCriterion("foreign_server_catalog is not null");
            return (Criteria) this;
        }

        public Criteria andForeignServerCatalogEqualTo(Object value) {
            addCriterion("foreign_server_catalog =", value, "foreignServerCatalog");
            return (Criteria) this;
        }

        public Criteria andForeignServerCatalogNotEqualTo(Object value) {
            addCriterion("foreign_server_catalog <>", value, "foreignServerCatalog");
            return (Criteria) this;
        }

        public Criteria andForeignServerCatalogGreaterThan(Object value) {
            addCriterion("foreign_server_catalog >", value, "foreignServerCatalog");
            return (Criteria) this;
        }

        public Criteria andForeignServerCatalogGreaterThanOrEqualTo(Object value) {
            addCriterion("foreign_server_catalog >=", value, "foreignServerCatalog");
            return (Criteria) this;
        }

        public Criteria andForeignServerCatalogLessThan(Object value) {
            addCriterion("foreign_server_catalog <", value, "foreignServerCatalog");
            return (Criteria) this;
        }

        public Criteria andForeignServerCatalogLessThanOrEqualTo(Object value) {
            addCriterion("foreign_server_catalog <=", value, "foreignServerCatalog");
            return (Criteria) this;
        }

        public Criteria andForeignServerCatalogIn(List<Object> values) {
            addCriterion("foreign_server_catalog in", values, "foreignServerCatalog");
            return (Criteria) this;
        }

        public Criteria andForeignServerCatalogNotIn(List<Object> values) {
            addCriterion("foreign_server_catalog not in", values, "foreignServerCatalog");
            return (Criteria) this;
        }

        public Criteria andForeignServerCatalogBetween(Object value1, Object value2) {
            addCriterion("foreign_server_catalog between", value1, value2, "foreignServerCatalog");
            return (Criteria) this;
        }

        public Criteria andForeignServerCatalogNotBetween(Object value1, Object value2) {
            addCriterion("foreign_server_catalog not between", value1, value2, "foreignServerCatalog");
            return (Criteria) this;
        }

        public Criteria andForeignServerNameIsNull() {
            addCriterion("foreign_server_name is null");
            return (Criteria) this;
        }

        public Criteria andForeignServerNameIsNotNull() {
            addCriterion("foreign_server_name is not null");
            return (Criteria) this;
        }

        public Criteria andForeignServerNameEqualTo(Object value) {
            addCriterion("foreign_server_name =", value, "foreignServerName");
            return (Criteria) this;
        }

        public Criteria andForeignServerNameNotEqualTo(Object value) {
            addCriterion("foreign_server_name <>", value, "foreignServerName");
            return (Criteria) this;
        }

        public Criteria andForeignServerNameGreaterThan(Object value) {
            addCriterion("foreign_server_name >", value, "foreignServerName");
            return (Criteria) this;
        }

        public Criteria andForeignServerNameGreaterThanOrEqualTo(Object value) {
            addCriterion("foreign_server_name >=", value, "foreignServerName");
            return (Criteria) this;
        }

        public Criteria andForeignServerNameLessThan(Object value) {
            addCriterion("foreign_server_name <", value, "foreignServerName");
            return (Criteria) this;
        }

        public Criteria andForeignServerNameLessThanOrEqualTo(Object value) {
            addCriterion("foreign_server_name <=", value, "foreignServerName");
            return (Criteria) this;
        }

        public Criteria andForeignServerNameIn(List<Object> values) {
            addCriterion("foreign_server_name in", values, "foreignServerName");
            return (Criteria) this;
        }

        public Criteria andForeignServerNameNotIn(List<Object> values) {
            addCriterion("foreign_server_name not in", values, "foreignServerName");
            return (Criteria) this;
        }

        public Criteria andForeignServerNameBetween(Object value1, Object value2) {
            addCriterion("foreign_server_name between", value1, value2, "foreignServerName");
            return (Criteria) this;
        }

        public Criteria andForeignServerNameNotBetween(Object value1, Object value2) {
            addCriterion("foreign_server_name not between", value1, value2, "foreignServerName");
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