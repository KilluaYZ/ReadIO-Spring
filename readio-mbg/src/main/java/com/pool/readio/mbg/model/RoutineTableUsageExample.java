package com.pool.readio.mbg.model;

import java.util.ArrayList;
import java.util.List;

public class RoutineTableUsageExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RoutineTableUsageExample() {
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

        public Criteria andSpecificCatalogIsNull() {
            addCriterion("specific_catalog is null");
            return (Criteria) this;
        }

        public Criteria andSpecificCatalogIsNotNull() {
            addCriterion("specific_catalog is not null");
            return (Criteria) this;
        }

        public Criteria andSpecificCatalogEqualTo(Object value) {
            addCriterion("specific_catalog =", value, "specificCatalog");
            return (Criteria) this;
        }

        public Criteria andSpecificCatalogNotEqualTo(Object value) {
            addCriterion("specific_catalog <>", value, "specificCatalog");
            return (Criteria) this;
        }

        public Criteria andSpecificCatalogGreaterThan(Object value) {
            addCriterion("specific_catalog >", value, "specificCatalog");
            return (Criteria) this;
        }

        public Criteria andSpecificCatalogGreaterThanOrEqualTo(Object value) {
            addCriterion("specific_catalog >=", value, "specificCatalog");
            return (Criteria) this;
        }

        public Criteria andSpecificCatalogLessThan(Object value) {
            addCriterion("specific_catalog <", value, "specificCatalog");
            return (Criteria) this;
        }

        public Criteria andSpecificCatalogLessThanOrEqualTo(Object value) {
            addCriterion("specific_catalog <=", value, "specificCatalog");
            return (Criteria) this;
        }

        public Criteria andSpecificCatalogIn(List<Object> values) {
            addCriterion("specific_catalog in", values, "specificCatalog");
            return (Criteria) this;
        }

        public Criteria andSpecificCatalogNotIn(List<Object> values) {
            addCriterion("specific_catalog not in", values, "specificCatalog");
            return (Criteria) this;
        }

        public Criteria andSpecificCatalogBetween(Object value1, Object value2) {
            addCriterion("specific_catalog between", value1, value2, "specificCatalog");
            return (Criteria) this;
        }

        public Criteria andSpecificCatalogNotBetween(Object value1, Object value2) {
            addCriterion("specific_catalog not between", value1, value2, "specificCatalog");
            return (Criteria) this;
        }

        public Criteria andSpecificSchemaIsNull() {
            addCriterion("specific_schema is null");
            return (Criteria) this;
        }

        public Criteria andSpecificSchemaIsNotNull() {
            addCriterion("specific_schema is not null");
            return (Criteria) this;
        }

        public Criteria andSpecificSchemaEqualTo(Object value) {
            addCriterion("specific_schema =", value, "specificSchema");
            return (Criteria) this;
        }

        public Criteria andSpecificSchemaNotEqualTo(Object value) {
            addCriterion("specific_schema <>", value, "specificSchema");
            return (Criteria) this;
        }

        public Criteria andSpecificSchemaGreaterThan(Object value) {
            addCriterion("specific_schema >", value, "specificSchema");
            return (Criteria) this;
        }

        public Criteria andSpecificSchemaGreaterThanOrEqualTo(Object value) {
            addCriterion("specific_schema >=", value, "specificSchema");
            return (Criteria) this;
        }

        public Criteria andSpecificSchemaLessThan(Object value) {
            addCriterion("specific_schema <", value, "specificSchema");
            return (Criteria) this;
        }

        public Criteria andSpecificSchemaLessThanOrEqualTo(Object value) {
            addCriterion("specific_schema <=", value, "specificSchema");
            return (Criteria) this;
        }

        public Criteria andSpecificSchemaIn(List<Object> values) {
            addCriterion("specific_schema in", values, "specificSchema");
            return (Criteria) this;
        }

        public Criteria andSpecificSchemaNotIn(List<Object> values) {
            addCriterion("specific_schema not in", values, "specificSchema");
            return (Criteria) this;
        }

        public Criteria andSpecificSchemaBetween(Object value1, Object value2) {
            addCriterion("specific_schema between", value1, value2, "specificSchema");
            return (Criteria) this;
        }

        public Criteria andSpecificSchemaNotBetween(Object value1, Object value2) {
            addCriterion("specific_schema not between", value1, value2, "specificSchema");
            return (Criteria) this;
        }

        public Criteria andSpecificNameIsNull() {
            addCriterion("specific_name is null");
            return (Criteria) this;
        }

        public Criteria andSpecificNameIsNotNull() {
            addCriterion("specific_name is not null");
            return (Criteria) this;
        }

        public Criteria andSpecificNameEqualTo(Object value) {
            addCriterion("specific_name =", value, "specificName");
            return (Criteria) this;
        }

        public Criteria andSpecificNameNotEqualTo(Object value) {
            addCriterion("specific_name <>", value, "specificName");
            return (Criteria) this;
        }

        public Criteria andSpecificNameGreaterThan(Object value) {
            addCriterion("specific_name >", value, "specificName");
            return (Criteria) this;
        }

        public Criteria andSpecificNameGreaterThanOrEqualTo(Object value) {
            addCriterion("specific_name >=", value, "specificName");
            return (Criteria) this;
        }

        public Criteria andSpecificNameLessThan(Object value) {
            addCriterion("specific_name <", value, "specificName");
            return (Criteria) this;
        }

        public Criteria andSpecificNameLessThanOrEqualTo(Object value) {
            addCriterion("specific_name <=", value, "specificName");
            return (Criteria) this;
        }

        public Criteria andSpecificNameIn(List<Object> values) {
            addCriterion("specific_name in", values, "specificName");
            return (Criteria) this;
        }

        public Criteria andSpecificNameNotIn(List<Object> values) {
            addCriterion("specific_name not in", values, "specificName");
            return (Criteria) this;
        }

        public Criteria andSpecificNameBetween(Object value1, Object value2) {
            addCriterion("specific_name between", value1, value2, "specificName");
            return (Criteria) this;
        }

        public Criteria andSpecificNameNotBetween(Object value1, Object value2) {
            addCriterion("specific_name not between", value1, value2, "specificName");
            return (Criteria) this;
        }

        public Criteria andRoutineCatalogIsNull() {
            addCriterion("routine_catalog is null");
            return (Criteria) this;
        }

        public Criteria andRoutineCatalogIsNotNull() {
            addCriterion("routine_catalog is not null");
            return (Criteria) this;
        }

        public Criteria andRoutineCatalogEqualTo(Object value) {
            addCriterion("routine_catalog =", value, "routineCatalog");
            return (Criteria) this;
        }

        public Criteria andRoutineCatalogNotEqualTo(Object value) {
            addCriterion("routine_catalog <>", value, "routineCatalog");
            return (Criteria) this;
        }

        public Criteria andRoutineCatalogGreaterThan(Object value) {
            addCriterion("routine_catalog >", value, "routineCatalog");
            return (Criteria) this;
        }

        public Criteria andRoutineCatalogGreaterThanOrEqualTo(Object value) {
            addCriterion("routine_catalog >=", value, "routineCatalog");
            return (Criteria) this;
        }

        public Criteria andRoutineCatalogLessThan(Object value) {
            addCriterion("routine_catalog <", value, "routineCatalog");
            return (Criteria) this;
        }

        public Criteria andRoutineCatalogLessThanOrEqualTo(Object value) {
            addCriterion("routine_catalog <=", value, "routineCatalog");
            return (Criteria) this;
        }

        public Criteria andRoutineCatalogIn(List<Object> values) {
            addCriterion("routine_catalog in", values, "routineCatalog");
            return (Criteria) this;
        }

        public Criteria andRoutineCatalogNotIn(List<Object> values) {
            addCriterion("routine_catalog not in", values, "routineCatalog");
            return (Criteria) this;
        }

        public Criteria andRoutineCatalogBetween(Object value1, Object value2) {
            addCriterion("routine_catalog between", value1, value2, "routineCatalog");
            return (Criteria) this;
        }

        public Criteria andRoutineCatalogNotBetween(Object value1, Object value2) {
            addCriterion("routine_catalog not between", value1, value2, "routineCatalog");
            return (Criteria) this;
        }

        public Criteria andRoutineSchemaIsNull() {
            addCriterion("routine_schema is null");
            return (Criteria) this;
        }

        public Criteria andRoutineSchemaIsNotNull() {
            addCriterion("routine_schema is not null");
            return (Criteria) this;
        }

        public Criteria andRoutineSchemaEqualTo(Object value) {
            addCriterion("routine_schema =", value, "routineSchema");
            return (Criteria) this;
        }

        public Criteria andRoutineSchemaNotEqualTo(Object value) {
            addCriterion("routine_schema <>", value, "routineSchema");
            return (Criteria) this;
        }

        public Criteria andRoutineSchemaGreaterThan(Object value) {
            addCriterion("routine_schema >", value, "routineSchema");
            return (Criteria) this;
        }

        public Criteria andRoutineSchemaGreaterThanOrEqualTo(Object value) {
            addCriterion("routine_schema >=", value, "routineSchema");
            return (Criteria) this;
        }

        public Criteria andRoutineSchemaLessThan(Object value) {
            addCriterion("routine_schema <", value, "routineSchema");
            return (Criteria) this;
        }

        public Criteria andRoutineSchemaLessThanOrEqualTo(Object value) {
            addCriterion("routine_schema <=", value, "routineSchema");
            return (Criteria) this;
        }

        public Criteria andRoutineSchemaIn(List<Object> values) {
            addCriterion("routine_schema in", values, "routineSchema");
            return (Criteria) this;
        }

        public Criteria andRoutineSchemaNotIn(List<Object> values) {
            addCriterion("routine_schema not in", values, "routineSchema");
            return (Criteria) this;
        }

        public Criteria andRoutineSchemaBetween(Object value1, Object value2) {
            addCriterion("routine_schema between", value1, value2, "routineSchema");
            return (Criteria) this;
        }

        public Criteria andRoutineSchemaNotBetween(Object value1, Object value2) {
            addCriterion("routine_schema not between", value1, value2, "routineSchema");
            return (Criteria) this;
        }

        public Criteria andRoutineNameIsNull() {
            addCriterion("routine_name is null");
            return (Criteria) this;
        }

        public Criteria andRoutineNameIsNotNull() {
            addCriterion("routine_name is not null");
            return (Criteria) this;
        }

        public Criteria andRoutineNameEqualTo(Object value) {
            addCriterion("routine_name =", value, "routineName");
            return (Criteria) this;
        }

        public Criteria andRoutineNameNotEqualTo(Object value) {
            addCriterion("routine_name <>", value, "routineName");
            return (Criteria) this;
        }

        public Criteria andRoutineNameGreaterThan(Object value) {
            addCriterion("routine_name >", value, "routineName");
            return (Criteria) this;
        }

        public Criteria andRoutineNameGreaterThanOrEqualTo(Object value) {
            addCriterion("routine_name >=", value, "routineName");
            return (Criteria) this;
        }

        public Criteria andRoutineNameLessThan(Object value) {
            addCriterion("routine_name <", value, "routineName");
            return (Criteria) this;
        }

        public Criteria andRoutineNameLessThanOrEqualTo(Object value) {
            addCriterion("routine_name <=", value, "routineName");
            return (Criteria) this;
        }

        public Criteria andRoutineNameIn(List<Object> values) {
            addCriterion("routine_name in", values, "routineName");
            return (Criteria) this;
        }

        public Criteria andRoutineNameNotIn(List<Object> values) {
            addCriterion("routine_name not in", values, "routineName");
            return (Criteria) this;
        }

        public Criteria andRoutineNameBetween(Object value1, Object value2) {
            addCriterion("routine_name between", value1, value2, "routineName");
            return (Criteria) this;
        }

        public Criteria andRoutineNameNotBetween(Object value1, Object value2) {
            addCriterion("routine_name not between", value1, value2, "routineName");
            return (Criteria) this;
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