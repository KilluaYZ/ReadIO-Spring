package com.pool.readio.mbg.model;

import java.util.ArrayList;
import java.util.List;

public class ForeignDataWrapperOptionsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ForeignDataWrapperOptionsExample() {
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

        public Criteria andOptionNameIsNull() {
            addCriterion("option_name is null");
            return (Criteria) this;
        }

        public Criteria andOptionNameIsNotNull() {
            addCriterion("option_name is not null");
            return (Criteria) this;
        }

        public Criteria andOptionNameEqualTo(Object value) {
            addCriterion("option_name =", value, "optionName");
            return (Criteria) this;
        }

        public Criteria andOptionNameNotEqualTo(Object value) {
            addCriterion("option_name <>", value, "optionName");
            return (Criteria) this;
        }

        public Criteria andOptionNameGreaterThan(Object value) {
            addCriterion("option_name >", value, "optionName");
            return (Criteria) this;
        }

        public Criteria andOptionNameGreaterThanOrEqualTo(Object value) {
            addCriterion("option_name >=", value, "optionName");
            return (Criteria) this;
        }

        public Criteria andOptionNameLessThan(Object value) {
            addCriterion("option_name <", value, "optionName");
            return (Criteria) this;
        }

        public Criteria andOptionNameLessThanOrEqualTo(Object value) {
            addCriterion("option_name <=", value, "optionName");
            return (Criteria) this;
        }

        public Criteria andOptionNameIn(List<Object> values) {
            addCriterion("option_name in", values, "optionName");
            return (Criteria) this;
        }

        public Criteria andOptionNameNotIn(List<Object> values) {
            addCriterion("option_name not in", values, "optionName");
            return (Criteria) this;
        }

        public Criteria andOptionNameBetween(Object value1, Object value2) {
            addCriterion("option_name between", value1, value2, "optionName");
            return (Criteria) this;
        }

        public Criteria andOptionNameNotBetween(Object value1, Object value2) {
            addCriterion("option_name not between", value1, value2, "optionName");
            return (Criteria) this;
        }

        public Criteria andOptionValueIsNull() {
            addCriterion("option_value is null");
            return (Criteria) this;
        }

        public Criteria andOptionValueIsNotNull() {
            addCriterion("option_value is not null");
            return (Criteria) this;
        }

        public Criteria andOptionValueEqualTo(Object value) {
            addCriterion("option_value =", value, "optionValue");
            return (Criteria) this;
        }

        public Criteria andOptionValueNotEqualTo(Object value) {
            addCriterion("option_value <>", value, "optionValue");
            return (Criteria) this;
        }

        public Criteria andOptionValueGreaterThan(Object value) {
            addCriterion("option_value >", value, "optionValue");
            return (Criteria) this;
        }

        public Criteria andOptionValueGreaterThanOrEqualTo(Object value) {
            addCriterion("option_value >=", value, "optionValue");
            return (Criteria) this;
        }

        public Criteria andOptionValueLessThan(Object value) {
            addCriterion("option_value <", value, "optionValue");
            return (Criteria) this;
        }

        public Criteria andOptionValueLessThanOrEqualTo(Object value) {
            addCriterion("option_value <=", value, "optionValue");
            return (Criteria) this;
        }

        public Criteria andOptionValueIn(List<Object> values) {
            addCriterion("option_value in", values, "optionValue");
            return (Criteria) this;
        }

        public Criteria andOptionValueNotIn(List<Object> values) {
            addCriterion("option_value not in", values, "optionValue");
            return (Criteria) this;
        }

        public Criteria andOptionValueBetween(Object value1, Object value2) {
            addCriterion("option_value between", value1, value2, "optionValue");
            return (Criteria) this;
        }

        public Criteria andOptionValueNotBetween(Object value1, Object value2) {
            addCriterion("option_value not between", value1, value2, "optionValue");
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