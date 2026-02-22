package com.pool.readio.readiombg.model;

import java.util.ArrayList;
import java.util.List;

public class ColumnColumnUsageExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ColumnColumnUsageExample() {
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

        public Criteria andTableCatalogIsNull() {
            addCriterion("table_catalog is null");
            return (Criteria) this;
        }

        public Criteria andTableCatalogIsNotNull() {
            addCriterion("table_catalog is not null");
            return (Criteria) this;
        }

        public Criteria andTableCatalogEqualTo(Object value) {
            addCriterion("table_catalog =", value, "tableCatalog");
            return (Criteria) this;
        }

        public Criteria andTableCatalogNotEqualTo(Object value) {
            addCriterion("table_catalog <>", value, "tableCatalog");
            return (Criteria) this;
        }

        public Criteria andTableCatalogGreaterThan(Object value) {
            addCriterion("table_catalog >", value, "tableCatalog");
            return (Criteria) this;
        }

        public Criteria andTableCatalogGreaterThanOrEqualTo(Object value) {
            addCriterion("table_catalog >=", value, "tableCatalog");
            return (Criteria) this;
        }

        public Criteria andTableCatalogLessThan(Object value) {
            addCriterion("table_catalog <", value, "tableCatalog");
            return (Criteria) this;
        }

        public Criteria andTableCatalogLessThanOrEqualTo(Object value) {
            addCriterion("table_catalog <=", value, "tableCatalog");
            return (Criteria) this;
        }

        public Criteria andTableCatalogIn(List<Object> values) {
            addCriterion("table_catalog in", values, "tableCatalog");
            return (Criteria) this;
        }

        public Criteria andTableCatalogNotIn(List<Object> values) {
            addCriterion("table_catalog not in", values, "tableCatalog");
            return (Criteria) this;
        }

        public Criteria andTableCatalogBetween(Object value1, Object value2) {
            addCriterion("table_catalog between", value1, value2, "tableCatalog");
            return (Criteria) this;
        }

        public Criteria andTableCatalogNotBetween(Object value1, Object value2) {
            addCriterion("table_catalog not between", value1, value2, "tableCatalog");
            return (Criteria) this;
        }

        public Criteria andTableSchemaIsNull() {
            addCriterion("table_schema is null");
            return (Criteria) this;
        }

        public Criteria andTableSchemaIsNotNull() {
            addCriterion("table_schema is not null");
            return (Criteria) this;
        }

        public Criteria andTableSchemaEqualTo(Object value) {
            addCriterion("table_schema =", value, "tableSchema");
            return (Criteria) this;
        }

        public Criteria andTableSchemaNotEqualTo(Object value) {
            addCriterion("table_schema <>", value, "tableSchema");
            return (Criteria) this;
        }

        public Criteria andTableSchemaGreaterThan(Object value) {
            addCriterion("table_schema >", value, "tableSchema");
            return (Criteria) this;
        }

        public Criteria andTableSchemaGreaterThanOrEqualTo(Object value) {
            addCriterion("table_schema >=", value, "tableSchema");
            return (Criteria) this;
        }

        public Criteria andTableSchemaLessThan(Object value) {
            addCriterion("table_schema <", value, "tableSchema");
            return (Criteria) this;
        }

        public Criteria andTableSchemaLessThanOrEqualTo(Object value) {
            addCriterion("table_schema <=", value, "tableSchema");
            return (Criteria) this;
        }

        public Criteria andTableSchemaIn(List<Object> values) {
            addCriterion("table_schema in", values, "tableSchema");
            return (Criteria) this;
        }

        public Criteria andTableSchemaNotIn(List<Object> values) {
            addCriterion("table_schema not in", values, "tableSchema");
            return (Criteria) this;
        }

        public Criteria andTableSchemaBetween(Object value1, Object value2) {
            addCriterion("table_schema between", value1, value2, "tableSchema");
            return (Criteria) this;
        }

        public Criteria andTableSchemaNotBetween(Object value1, Object value2) {
            addCriterion("table_schema not between", value1, value2, "tableSchema");
            return (Criteria) this;
        }

        public Criteria andTableNameIsNull() {
            addCriterion("table_name is null");
            return (Criteria) this;
        }

        public Criteria andTableNameIsNotNull() {
            addCriterion("table_name is not null");
            return (Criteria) this;
        }

        public Criteria andTableNameEqualTo(Object value) {
            addCriterion("table_name =", value, "tableName");
            return (Criteria) this;
        }

        public Criteria andTableNameNotEqualTo(Object value) {
            addCriterion("table_name <>", value, "tableName");
            return (Criteria) this;
        }

        public Criteria andTableNameGreaterThan(Object value) {
            addCriterion("table_name >", value, "tableName");
            return (Criteria) this;
        }

        public Criteria andTableNameGreaterThanOrEqualTo(Object value) {
            addCriterion("table_name >=", value, "tableName");
            return (Criteria) this;
        }

        public Criteria andTableNameLessThan(Object value) {
            addCriterion("table_name <", value, "tableName");
            return (Criteria) this;
        }

        public Criteria andTableNameLessThanOrEqualTo(Object value) {
            addCriterion("table_name <=", value, "tableName");
            return (Criteria) this;
        }

        public Criteria andTableNameIn(List<Object> values) {
            addCriterion("table_name in", values, "tableName");
            return (Criteria) this;
        }

        public Criteria andTableNameNotIn(List<Object> values) {
            addCriterion("table_name not in", values, "tableName");
            return (Criteria) this;
        }

        public Criteria andTableNameBetween(Object value1, Object value2) {
            addCriterion("table_name between", value1, value2, "tableName");
            return (Criteria) this;
        }

        public Criteria andTableNameNotBetween(Object value1, Object value2) {
            addCriterion("table_name not between", value1, value2, "tableName");
            return (Criteria) this;
        }

        public Criteria andColumnNameIsNull() {
            addCriterion("column_name is null");
            return (Criteria) this;
        }

        public Criteria andColumnNameIsNotNull() {
            addCriterion("column_name is not null");
            return (Criteria) this;
        }

        public Criteria andColumnNameEqualTo(Object value) {
            addCriterion("column_name =", value, "columnName");
            return (Criteria) this;
        }

        public Criteria andColumnNameNotEqualTo(Object value) {
            addCriterion("column_name <>", value, "columnName");
            return (Criteria) this;
        }

        public Criteria andColumnNameGreaterThan(Object value) {
            addCriterion("column_name >", value, "columnName");
            return (Criteria) this;
        }

        public Criteria andColumnNameGreaterThanOrEqualTo(Object value) {
            addCriterion("column_name >=", value, "columnName");
            return (Criteria) this;
        }

        public Criteria andColumnNameLessThan(Object value) {
            addCriterion("column_name <", value, "columnName");
            return (Criteria) this;
        }

        public Criteria andColumnNameLessThanOrEqualTo(Object value) {
            addCriterion("column_name <=", value, "columnName");
            return (Criteria) this;
        }

        public Criteria andColumnNameIn(List<Object> values) {
            addCriterion("column_name in", values, "columnName");
            return (Criteria) this;
        }

        public Criteria andColumnNameNotIn(List<Object> values) {
            addCriterion("column_name not in", values, "columnName");
            return (Criteria) this;
        }

        public Criteria andColumnNameBetween(Object value1, Object value2) {
            addCriterion("column_name between", value1, value2, "columnName");
            return (Criteria) this;
        }

        public Criteria andColumnNameNotBetween(Object value1, Object value2) {
            addCriterion("column_name not between", value1, value2, "columnName");
            return (Criteria) this;
        }

        public Criteria andDependentColumnIsNull() {
            addCriterion("dependent_column is null");
            return (Criteria) this;
        }

        public Criteria andDependentColumnIsNotNull() {
            addCriterion("dependent_column is not null");
            return (Criteria) this;
        }

        public Criteria andDependentColumnEqualTo(Object value) {
            addCriterion("dependent_column =", value, "dependentColumn");
            return (Criteria) this;
        }

        public Criteria andDependentColumnNotEqualTo(Object value) {
            addCriterion("dependent_column <>", value, "dependentColumn");
            return (Criteria) this;
        }

        public Criteria andDependentColumnGreaterThan(Object value) {
            addCriterion("dependent_column >", value, "dependentColumn");
            return (Criteria) this;
        }

        public Criteria andDependentColumnGreaterThanOrEqualTo(Object value) {
            addCriterion("dependent_column >=", value, "dependentColumn");
            return (Criteria) this;
        }

        public Criteria andDependentColumnLessThan(Object value) {
            addCriterion("dependent_column <", value, "dependentColumn");
            return (Criteria) this;
        }

        public Criteria andDependentColumnLessThanOrEqualTo(Object value) {
            addCriterion("dependent_column <=", value, "dependentColumn");
            return (Criteria) this;
        }

        public Criteria andDependentColumnIn(List<Object> values) {
            addCriterion("dependent_column in", values, "dependentColumn");
            return (Criteria) this;
        }

        public Criteria andDependentColumnNotIn(List<Object> values) {
            addCriterion("dependent_column not in", values, "dependentColumn");
            return (Criteria) this;
        }

        public Criteria andDependentColumnBetween(Object value1, Object value2) {
            addCriterion("dependent_column between", value1, value2, "dependentColumn");
            return (Criteria) this;
        }

        public Criteria andDependentColumnNotBetween(Object value1, Object value2) {
            addCriterion("dependent_column not between", value1, value2, "dependentColumn");
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