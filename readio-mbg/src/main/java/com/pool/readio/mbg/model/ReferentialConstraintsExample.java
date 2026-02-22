package com.pool.readio.mbg.model;

import java.util.ArrayList;
import java.util.List;

public class ReferentialConstraintsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ReferentialConstraintsExample() {
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

        public Criteria andUniqueConstraintCatalogIsNull() {
            addCriterion("unique_constraint_catalog is null");
            return (Criteria) this;
        }

        public Criteria andUniqueConstraintCatalogIsNotNull() {
            addCriterion("unique_constraint_catalog is not null");
            return (Criteria) this;
        }

        public Criteria andUniqueConstraintCatalogEqualTo(Object value) {
            addCriterion("unique_constraint_catalog =", value, "uniqueConstraintCatalog");
            return (Criteria) this;
        }

        public Criteria andUniqueConstraintCatalogNotEqualTo(Object value) {
            addCriterion("unique_constraint_catalog <>", value, "uniqueConstraintCatalog");
            return (Criteria) this;
        }

        public Criteria andUniqueConstraintCatalogGreaterThan(Object value) {
            addCriterion("unique_constraint_catalog >", value, "uniqueConstraintCatalog");
            return (Criteria) this;
        }

        public Criteria andUniqueConstraintCatalogGreaterThanOrEqualTo(Object value) {
            addCriterion("unique_constraint_catalog >=", value, "uniqueConstraintCatalog");
            return (Criteria) this;
        }

        public Criteria andUniqueConstraintCatalogLessThan(Object value) {
            addCriterion("unique_constraint_catalog <", value, "uniqueConstraintCatalog");
            return (Criteria) this;
        }

        public Criteria andUniqueConstraintCatalogLessThanOrEqualTo(Object value) {
            addCriterion("unique_constraint_catalog <=", value, "uniqueConstraintCatalog");
            return (Criteria) this;
        }

        public Criteria andUniqueConstraintCatalogIn(List<Object> values) {
            addCriterion("unique_constraint_catalog in", values, "uniqueConstraintCatalog");
            return (Criteria) this;
        }

        public Criteria andUniqueConstraintCatalogNotIn(List<Object> values) {
            addCriterion("unique_constraint_catalog not in", values, "uniqueConstraintCatalog");
            return (Criteria) this;
        }

        public Criteria andUniqueConstraintCatalogBetween(Object value1, Object value2) {
            addCriterion("unique_constraint_catalog between", value1, value2, "uniqueConstraintCatalog");
            return (Criteria) this;
        }

        public Criteria andUniqueConstraintCatalogNotBetween(Object value1, Object value2) {
            addCriterion("unique_constraint_catalog not between", value1, value2, "uniqueConstraintCatalog");
            return (Criteria) this;
        }

        public Criteria andUniqueConstraintSchemaIsNull() {
            addCriterion("unique_constraint_schema is null");
            return (Criteria) this;
        }

        public Criteria andUniqueConstraintSchemaIsNotNull() {
            addCriterion("unique_constraint_schema is not null");
            return (Criteria) this;
        }

        public Criteria andUniqueConstraintSchemaEqualTo(Object value) {
            addCriterion("unique_constraint_schema =", value, "uniqueConstraintSchema");
            return (Criteria) this;
        }

        public Criteria andUniqueConstraintSchemaNotEqualTo(Object value) {
            addCriterion("unique_constraint_schema <>", value, "uniqueConstraintSchema");
            return (Criteria) this;
        }

        public Criteria andUniqueConstraintSchemaGreaterThan(Object value) {
            addCriterion("unique_constraint_schema >", value, "uniqueConstraintSchema");
            return (Criteria) this;
        }

        public Criteria andUniqueConstraintSchemaGreaterThanOrEqualTo(Object value) {
            addCriterion("unique_constraint_schema >=", value, "uniqueConstraintSchema");
            return (Criteria) this;
        }

        public Criteria andUniqueConstraintSchemaLessThan(Object value) {
            addCriterion("unique_constraint_schema <", value, "uniqueConstraintSchema");
            return (Criteria) this;
        }

        public Criteria andUniqueConstraintSchemaLessThanOrEqualTo(Object value) {
            addCriterion("unique_constraint_schema <=", value, "uniqueConstraintSchema");
            return (Criteria) this;
        }

        public Criteria andUniqueConstraintSchemaIn(List<Object> values) {
            addCriterion("unique_constraint_schema in", values, "uniqueConstraintSchema");
            return (Criteria) this;
        }

        public Criteria andUniqueConstraintSchemaNotIn(List<Object> values) {
            addCriterion("unique_constraint_schema not in", values, "uniqueConstraintSchema");
            return (Criteria) this;
        }

        public Criteria andUniqueConstraintSchemaBetween(Object value1, Object value2) {
            addCriterion("unique_constraint_schema between", value1, value2, "uniqueConstraintSchema");
            return (Criteria) this;
        }

        public Criteria andUniqueConstraintSchemaNotBetween(Object value1, Object value2) {
            addCriterion("unique_constraint_schema not between", value1, value2, "uniqueConstraintSchema");
            return (Criteria) this;
        }

        public Criteria andUniqueConstraintNameIsNull() {
            addCriterion("unique_constraint_name is null");
            return (Criteria) this;
        }

        public Criteria andUniqueConstraintNameIsNotNull() {
            addCriterion("unique_constraint_name is not null");
            return (Criteria) this;
        }

        public Criteria andUniqueConstraintNameEqualTo(Object value) {
            addCriterion("unique_constraint_name =", value, "uniqueConstraintName");
            return (Criteria) this;
        }

        public Criteria andUniqueConstraintNameNotEqualTo(Object value) {
            addCriterion("unique_constraint_name <>", value, "uniqueConstraintName");
            return (Criteria) this;
        }

        public Criteria andUniqueConstraintNameGreaterThan(Object value) {
            addCriterion("unique_constraint_name >", value, "uniqueConstraintName");
            return (Criteria) this;
        }

        public Criteria andUniqueConstraintNameGreaterThanOrEqualTo(Object value) {
            addCriterion("unique_constraint_name >=", value, "uniqueConstraintName");
            return (Criteria) this;
        }

        public Criteria andUniqueConstraintNameLessThan(Object value) {
            addCriterion("unique_constraint_name <", value, "uniqueConstraintName");
            return (Criteria) this;
        }

        public Criteria andUniqueConstraintNameLessThanOrEqualTo(Object value) {
            addCriterion("unique_constraint_name <=", value, "uniqueConstraintName");
            return (Criteria) this;
        }

        public Criteria andUniqueConstraintNameIn(List<Object> values) {
            addCriterion("unique_constraint_name in", values, "uniqueConstraintName");
            return (Criteria) this;
        }

        public Criteria andUniqueConstraintNameNotIn(List<Object> values) {
            addCriterion("unique_constraint_name not in", values, "uniqueConstraintName");
            return (Criteria) this;
        }

        public Criteria andUniqueConstraintNameBetween(Object value1, Object value2) {
            addCriterion("unique_constraint_name between", value1, value2, "uniqueConstraintName");
            return (Criteria) this;
        }

        public Criteria andUniqueConstraintNameNotBetween(Object value1, Object value2) {
            addCriterion("unique_constraint_name not between", value1, value2, "uniqueConstraintName");
            return (Criteria) this;
        }

        public Criteria andMatchOptionIsNull() {
            addCriterion("match_option is null");
            return (Criteria) this;
        }

        public Criteria andMatchOptionIsNotNull() {
            addCriterion("match_option is not null");
            return (Criteria) this;
        }

        public Criteria andMatchOptionEqualTo(Object value) {
            addCriterion("match_option =", value, "matchOption");
            return (Criteria) this;
        }

        public Criteria andMatchOptionNotEqualTo(Object value) {
            addCriterion("match_option <>", value, "matchOption");
            return (Criteria) this;
        }

        public Criteria andMatchOptionGreaterThan(Object value) {
            addCriterion("match_option >", value, "matchOption");
            return (Criteria) this;
        }

        public Criteria andMatchOptionGreaterThanOrEqualTo(Object value) {
            addCriterion("match_option >=", value, "matchOption");
            return (Criteria) this;
        }

        public Criteria andMatchOptionLessThan(Object value) {
            addCriterion("match_option <", value, "matchOption");
            return (Criteria) this;
        }

        public Criteria andMatchOptionLessThanOrEqualTo(Object value) {
            addCriterion("match_option <=", value, "matchOption");
            return (Criteria) this;
        }

        public Criteria andMatchOptionIn(List<Object> values) {
            addCriterion("match_option in", values, "matchOption");
            return (Criteria) this;
        }

        public Criteria andMatchOptionNotIn(List<Object> values) {
            addCriterion("match_option not in", values, "matchOption");
            return (Criteria) this;
        }

        public Criteria andMatchOptionBetween(Object value1, Object value2) {
            addCriterion("match_option between", value1, value2, "matchOption");
            return (Criteria) this;
        }

        public Criteria andMatchOptionNotBetween(Object value1, Object value2) {
            addCriterion("match_option not between", value1, value2, "matchOption");
            return (Criteria) this;
        }

        public Criteria andUpdateRuleIsNull() {
            addCriterion("update_rule is null");
            return (Criteria) this;
        }

        public Criteria andUpdateRuleIsNotNull() {
            addCriterion("update_rule is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateRuleEqualTo(Object value) {
            addCriterion("update_rule =", value, "updateRule");
            return (Criteria) this;
        }

        public Criteria andUpdateRuleNotEqualTo(Object value) {
            addCriterion("update_rule <>", value, "updateRule");
            return (Criteria) this;
        }

        public Criteria andUpdateRuleGreaterThan(Object value) {
            addCriterion("update_rule >", value, "updateRule");
            return (Criteria) this;
        }

        public Criteria andUpdateRuleGreaterThanOrEqualTo(Object value) {
            addCriterion("update_rule >=", value, "updateRule");
            return (Criteria) this;
        }

        public Criteria andUpdateRuleLessThan(Object value) {
            addCriterion("update_rule <", value, "updateRule");
            return (Criteria) this;
        }

        public Criteria andUpdateRuleLessThanOrEqualTo(Object value) {
            addCriterion("update_rule <=", value, "updateRule");
            return (Criteria) this;
        }

        public Criteria andUpdateRuleIn(List<Object> values) {
            addCriterion("update_rule in", values, "updateRule");
            return (Criteria) this;
        }

        public Criteria andUpdateRuleNotIn(List<Object> values) {
            addCriterion("update_rule not in", values, "updateRule");
            return (Criteria) this;
        }

        public Criteria andUpdateRuleBetween(Object value1, Object value2) {
            addCriterion("update_rule between", value1, value2, "updateRule");
            return (Criteria) this;
        }

        public Criteria andUpdateRuleNotBetween(Object value1, Object value2) {
            addCriterion("update_rule not between", value1, value2, "updateRule");
            return (Criteria) this;
        }

        public Criteria andDeleteRuleIsNull() {
            addCriterion("delete_rule is null");
            return (Criteria) this;
        }

        public Criteria andDeleteRuleIsNotNull() {
            addCriterion("delete_rule is not null");
            return (Criteria) this;
        }

        public Criteria andDeleteRuleEqualTo(Object value) {
            addCriterion("delete_rule =", value, "deleteRule");
            return (Criteria) this;
        }

        public Criteria andDeleteRuleNotEqualTo(Object value) {
            addCriterion("delete_rule <>", value, "deleteRule");
            return (Criteria) this;
        }

        public Criteria andDeleteRuleGreaterThan(Object value) {
            addCriterion("delete_rule >", value, "deleteRule");
            return (Criteria) this;
        }

        public Criteria andDeleteRuleGreaterThanOrEqualTo(Object value) {
            addCriterion("delete_rule >=", value, "deleteRule");
            return (Criteria) this;
        }

        public Criteria andDeleteRuleLessThan(Object value) {
            addCriterion("delete_rule <", value, "deleteRule");
            return (Criteria) this;
        }

        public Criteria andDeleteRuleLessThanOrEqualTo(Object value) {
            addCriterion("delete_rule <=", value, "deleteRule");
            return (Criteria) this;
        }

        public Criteria andDeleteRuleIn(List<Object> values) {
            addCriterion("delete_rule in", values, "deleteRule");
            return (Criteria) this;
        }

        public Criteria andDeleteRuleNotIn(List<Object> values) {
            addCriterion("delete_rule not in", values, "deleteRule");
            return (Criteria) this;
        }

        public Criteria andDeleteRuleBetween(Object value1, Object value2) {
            addCriterion("delete_rule between", value1, value2, "deleteRule");
            return (Criteria) this;
        }

        public Criteria andDeleteRuleNotBetween(Object value1, Object value2) {
            addCriterion("delete_rule not between", value1, value2, "deleteRule");
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