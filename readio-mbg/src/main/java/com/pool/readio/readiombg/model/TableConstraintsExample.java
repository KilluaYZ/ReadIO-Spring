package com.pool.readio.readiombg.model;

import java.util.ArrayList;
import java.util.List;

public class TableConstraintsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TableConstraintsExample() {
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

        public Criteria andConstraintCatalogIsNull() {
            addCriterion("constraint_catalog is null");
            return (Criteria) this;
        }

        public Criteria andConstraintCatalogIsNotNull() {
            addCriterion("constraint_catalog is not null");
            return (Criteria) this;
        }

        public Criteria andConstraintCatalogEqualTo(Object value) {
            addCriterion("constraint_catalog =", value, "constraintCatalog");
            return (Criteria) this;
        }

        public Criteria andConstraintCatalogNotEqualTo(Object value) {
            addCriterion("constraint_catalog <>", value, "constraintCatalog");
            return (Criteria) this;
        }

        public Criteria andConstraintCatalogGreaterThan(Object value) {
            addCriterion("constraint_catalog >", value, "constraintCatalog");
            return (Criteria) this;
        }

        public Criteria andConstraintCatalogGreaterThanOrEqualTo(Object value) {
            addCriterion("constraint_catalog >=", value, "constraintCatalog");
            return (Criteria) this;
        }

        public Criteria andConstraintCatalogLessThan(Object value) {
            addCriterion("constraint_catalog <", value, "constraintCatalog");
            return (Criteria) this;
        }

        public Criteria andConstraintCatalogLessThanOrEqualTo(Object value) {
            addCriterion("constraint_catalog <=", value, "constraintCatalog");
            return (Criteria) this;
        }

        public Criteria andConstraintCatalogIn(List<Object> values) {
            addCriterion("constraint_catalog in", values, "constraintCatalog");
            return (Criteria) this;
        }

        public Criteria andConstraintCatalogNotIn(List<Object> values) {
            addCriterion("constraint_catalog not in", values, "constraintCatalog");
            return (Criteria) this;
        }

        public Criteria andConstraintCatalogBetween(Object value1, Object value2) {
            addCriterion("constraint_catalog between", value1, value2, "constraintCatalog");
            return (Criteria) this;
        }

        public Criteria andConstraintCatalogNotBetween(Object value1, Object value2) {
            addCriterion("constraint_catalog not between", value1, value2, "constraintCatalog");
            return (Criteria) this;
        }

        public Criteria andConstraintSchemaIsNull() {
            addCriterion("constraint_schema is null");
            return (Criteria) this;
        }

        public Criteria andConstraintSchemaIsNotNull() {
            addCriterion("constraint_schema is not null");
            return (Criteria) this;
        }

        public Criteria andConstraintSchemaEqualTo(Object value) {
            addCriterion("constraint_schema =", value, "constraintSchema");
            return (Criteria) this;
        }

        public Criteria andConstraintSchemaNotEqualTo(Object value) {
            addCriterion("constraint_schema <>", value, "constraintSchema");
            return (Criteria) this;
        }

        public Criteria andConstraintSchemaGreaterThan(Object value) {
            addCriterion("constraint_schema >", value, "constraintSchema");
            return (Criteria) this;
        }

        public Criteria andConstraintSchemaGreaterThanOrEqualTo(Object value) {
            addCriterion("constraint_schema >=", value, "constraintSchema");
            return (Criteria) this;
        }

        public Criteria andConstraintSchemaLessThan(Object value) {
            addCriterion("constraint_schema <", value, "constraintSchema");
            return (Criteria) this;
        }

        public Criteria andConstraintSchemaLessThanOrEqualTo(Object value) {
            addCriterion("constraint_schema <=", value, "constraintSchema");
            return (Criteria) this;
        }

        public Criteria andConstraintSchemaIn(List<Object> values) {
            addCriterion("constraint_schema in", values, "constraintSchema");
            return (Criteria) this;
        }

        public Criteria andConstraintSchemaNotIn(List<Object> values) {
            addCriterion("constraint_schema not in", values, "constraintSchema");
            return (Criteria) this;
        }

        public Criteria andConstraintSchemaBetween(Object value1, Object value2) {
            addCriterion("constraint_schema between", value1, value2, "constraintSchema");
            return (Criteria) this;
        }

        public Criteria andConstraintSchemaNotBetween(Object value1, Object value2) {
            addCriterion("constraint_schema not between", value1, value2, "constraintSchema");
            return (Criteria) this;
        }

        public Criteria andConstraintNameIsNull() {
            addCriterion("constraint_name is null");
            return (Criteria) this;
        }

        public Criteria andConstraintNameIsNotNull() {
            addCriterion("constraint_name is not null");
            return (Criteria) this;
        }

        public Criteria andConstraintNameEqualTo(Object value) {
            addCriterion("constraint_name =", value, "constraintName");
            return (Criteria) this;
        }

        public Criteria andConstraintNameNotEqualTo(Object value) {
            addCriterion("constraint_name <>", value, "constraintName");
            return (Criteria) this;
        }

        public Criteria andConstraintNameGreaterThan(Object value) {
            addCriterion("constraint_name >", value, "constraintName");
            return (Criteria) this;
        }

        public Criteria andConstraintNameGreaterThanOrEqualTo(Object value) {
            addCriterion("constraint_name >=", value, "constraintName");
            return (Criteria) this;
        }

        public Criteria andConstraintNameLessThan(Object value) {
            addCriterion("constraint_name <", value, "constraintName");
            return (Criteria) this;
        }

        public Criteria andConstraintNameLessThanOrEqualTo(Object value) {
            addCriterion("constraint_name <=", value, "constraintName");
            return (Criteria) this;
        }

        public Criteria andConstraintNameIn(List<Object> values) {
            addCriterion("constraint_name in", values, "constraintName");
            return (Criteria) this;
        }

        public Criteria andConstraintNameNotIn(List<Object> values) {
            addCriterion("constraint_name not in", values, "constraintName");
            return (Criteria) this;
        }

        public Criteria andConstraintNameBetween(Object value1, Object value2) {
            addCriterion("constraint_name between", value1, value2, "constraintName");
            return (Criteria) this;
        }

        public Criteria andConstraintNameNotBetween(Object value1, Object value2) {
            addCriterion("constraint_name not between", value1, value2, "constraintName");
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

        public Criteria andConstraintTypeIsNull() {
            addCriterion("constraint_type is null");
            return (Criteria) this;
        }

        public Criteria andConstraintTypeIsNotNull() {
            addCriterion("constraint_type is not null");
            return (Criteria) this;
        }

        public Criteria andConstraintTypeEqualTo(Object value) {
            addCriterion("constraint_type =", value, "constraintType");
            return (Criteria) this;
        }

        public Criteria andConstraintTypeNotEqualTo(Object value) {
            addCriterion("constraint_type <>", value, "constraintType");
            return (Criteria) this;
        }

        public Criteria andConstraintTypeGreaterThan(Object value) {
            addCriterion("constraint_type >", value, "constraintType");
            return (Criteria) this;
        }

        public Criteria andConstraintTypeGreaterThanOrEqualTo(Object value) {
            addCriterion("constraint_type >=", value, "constraintType");
            return (Criteria) this;
        }

        public Criteria andConstraintTypeLessThan(Object value) {
            addCriterion("constraint_type <", value, "constraintType");
            return (Criteria) this;
        }

        public Criteria andConstraintTypeLessThanOrEqualTo(Object value) {
            addCriterion("constraint_type <=", value, "constraintType");
            return (Criteria) this;
        }

        public Criteria andConstraintTypeIn(List<Object> values) {
            addCriterion("constraint_type in", values, "constraintType");
            return (Criteria) this;
        }

        public Criteria andConstraintTypeNotIn(List<Object> values) {
            addCriterion("constraint_type not in", values, "constraintType");
            return (Criteria) this;
        }

        public Criteria andConstraintTypeBetween(Object value1, Object value2) {
            addCriterion("constraint_type between", value1, value2, "constraintType");
            return (Criteria) this;
        }

        public Criteria andConstraintTypeNotBetween(Object value1, Object value2) {
            addCriterion("constraint_type not between", value1, value2, "constraintType");
            return (Criteria) this;
        }

        public Criteria andIsDeferrableIsNull() {
            addCriterion("is_deferrable is null");
            return (Criteria) this;
        }

        public Criteria andIsDeferrableIsNotNull() {
            addCriterion("is_deferrable is not null");
            return (Criteria) this;
        }

        public Criteria andIsDeferrableEqualTo(Object value) {
            addCriterion("is_deferrable =", value, "isDeferrable");
            return (Criteria) this;
        }

        public Criteria andIsDeferrableNotEqualTo(Object value) {
            addCriterion("is_deferrable <>", value, "isDeferrable");
            return (Criteria) this;
        }

        public Criteria andIsDeferrableGreaterThan(Object value) {
            addCriterion("is_deferrable >", value, "isDeferrable");
            return (Criteria) this;
        }

        public Criteria andIsDeferrableGreaterThanOrEqualTo(Object value) {
            addCriterion("is_deferrable >=", value, "isDeferrable");
            return (Criteria) this;
        }

        public Criteria andIsDeferrableLessThan(Object value) {
            addCriterion("is_deferrable <", value, "isDeferrable");
            return (Criteria) this;
        }

        public Criteria andIsDeferrableLessThanOrEqualTo(Object value) {
            addCriterion("is_deferrable <=", value, "isDeferrable");
            return (Criteria) this;
        }

        public Criteria andIsDeferrableIn(List<Object> values) {
            addCriterion("is_deferrable in", values, "isDeferrable");
            return (Criteria) this;
        }

        public Criteria andIsDeferrableNotIn(List<Object> values) {
            addCriterion("is_deferrable not in", values, "isDeferrable");
            return (Criteria) this;
        }

        public Criteria andIsDeferrableBetween(Object value1, Object value2) {
            addCriterion("is_deferrable between", value1, value2, "isDeferrable");
            return (Criteria) this;
        }

        public Criteria andIsDeferrableNotBetween(Object value1, Object value2) {
            addCriterion("is_deferrable not between", value1, value2, "isDeferrable");
            return (Criteria) this;
        }

        public Criteria andInitiallyDeferredIsNull() {
            addCriterion("initially_deferred is null");
            return (Criteria) this;
        }

        public Criteria andInitiallyDeferredIsNotNull() {
            addCriterion("initially_deferred is not null");
            return (Criteria) this;
        }

        public Criteria andInitiallyDeferredEqualTo(Object value) {
            addCriterion("initially_deferred =", value, "initiallyDeferred");
            return (Criteria) this;
        }

        public Criteria andInitiallyDeferredNotEqualTo(Object value) {
            addCriterion("initially_deferred <>", value, "initiallyDeferred");
            return (Criteria) this;
        }

        public Criteria andInitiallyDeferredGreaterThan(Object value) {
            addCriterion("initially_deferred >", value, "initiallyDeferred");
            return (Criteria) this;
        }

        public Criteria andInitiallyDeferredGreaterThanOrEqualTo(Object value) {
            addCriterion("initially_deferred >=", value, "initiallyDeferred");
            return (Criteria) this;
        }

        public Criteria andInitiallyDeferredLessThan(Object value) {
            addCriterion("initially_deferred <", value, "initiallyDeferred");
            return (Criteria) this;
        }

        public Criteria andInitiallyDeferredLessThanOrEqualTo(Object value) {
            addCriterion("initially_deferred <=", value, "initiallyDeferred");
            return (Criteria) this;
        }

        public Criteria andInitiallyDeferredIn(List<Object> values) {
            addCriterion("initially_deferred in", values, "initiallyDeferred");
            return (Criteria) this;
        }

        public Criteria andInitiallyDeferredNotIn(List<Object> values) {
            addCriterion("initially_deferred not in", values, "initiallyDeferred");
            return (Criteria) this;
        }

        public Criteria andInitiallyDeferredBetween(Object value1, Object value2) {
            addCriterion("initially_deferred between", value1, value2, "initiallyDeferred");
            return (Criteria) this;
        }

        public Criteria andInitiallyDeferredNotBetween(Object value1, Object value2) {
            addCriterion("initially_deferred not between", value1, value2, "initiallyDeferred");
            return (Criteria) this;
        }

        public Criteria andEnforcedIsNull() {
            addCriterion("enforced is null");
            return (Criteria) this;
        }

        public Criteria andEnforcedIsNotNull() {
            addCriterion("enforced is not null");
            return (Criteria) this;
        }

        public Criteria andEnforcedEqualTo(Object value) {
            addCriterion("enforced =", value, "enforced");
            return (Criteria) this;
        }

        public Criteria andEnforcedNotEqualTo(Object value) {
            addCriterion("enforced <>", value, "enforced");
            return (Criteria) this;
        }

        public Criteria andEnforcedGreaterThan(Object value) {
            addCriterion("enforced >", value, "enforced");
            return (Criteria) this;
        }

        public Criteria andEnforcedGreaterThanOrEqualTo(Object value) {
            addCriterion("enforced >=", value, "enforced");
            return (Criteria) this;
        }

        public Criteria andEnforcedLessThan(Object value) {
            addCriterion("enforced <", value, "enforced");
            return (Criteria) this;
        }

        public Criteria andEnforcedLessThanOrEqualTo(Object value) {
            addCriterion("enforced <=", value, "enforced");
            return (Criteria) this;
        }

        public Criteria andEnforcedIn(List<Object> values) {
            addCriterion("enforced in", values, "enforced");
            return (Criteria) this;
        }

        public Criteria andEnforcedNotIn(List<Object> values) {
            addCriterion("enforced not in", values, "enforced");
            return (Criteria) this;
        }

        public Criteria andEnforcedBetween(Object value1, Object value2) {
            addCriterion("enforced between", value1, value2, "enforced");
            return (Criteria) this;
        }

        public Criteria andEnforcedNotBetween(Object value1, Object value2) {
            addCriterion("enforced not between", value1, value2, "enforced");
            return (Criteria) this;
        }

        public Criteria andNullsDistinctIsNull() {
            addCriterion("nulls_distinct is null");
            return (Criteria) this;
        }

        public Criteria andNullsDistinctIsNotNull() {
            addCriterion("nulls_distinct is not null");
            return (Criteria) this;
        }

        public Criteria andNullsDistinctEqualTo(Object value) {
            addCriterion("nulls_distinct =", value, "nullsDistinct");
            return (Criteria) this;
        }

        public Criteria andNullsDistinctNotEqualTo(Object value) {
            addCriterion("nulls_distinct <>", value, "nullsDistinct");
            return (Criteria) this;
        }

        public Criteria andNullsDistinctGreaterThan(Object value) {
            addCriterion("nulls_distinct >", value, "nullsDistinct");
            return (Criteria) this;
        }

        public Criteria andNullsDistinctGreaterThanOrEqualTo(Object value) {
            addCriterion("nulls_distinct >=", value, "nullsDistinct");
            return (Criteria) this;
        }

        public Criteria andNullsDistinctLessThan(Object value) {
            addCriterion("nulls_distinct <", value, "nullsDistinct");
            return (Criteria) this;
        }

        public Criteria andNullsDistinctLessThanOrEqualTo(Object value) {
            addCriterion("nulls_distinct <=", value, "nullsDistinct");
            return (Criteria) this;
        }

        public Criteria andNullsDistinctIn(List<Object> values) {
            addCriterion("nulls_distinct in", values, "nullsDistinct");
            return (Criteria) this;
        }

        public Criteria andNullsDistinctNotIn(List<Object> values) {
            addCriterion("nulls_distinct not in", values, "nullsDistinct");
            return (Criteria) this;
        }

        public Criteria andNullsDistinctBetween(Object value1, Object value2) {
            addCriterion("nulls_distinct between", value1, value2, "nullsDistinct");
            return (Criteria) this;
        }

        public Criteria andNullsDistinctNotBetween(Object value1, Object value2) {
            addCriterion("nulls_distinct not between", value1, value2, "nullsDistinct");
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