package com.pool.readio.readiombg.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PgPreparedStatementsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PgPreparedStatementsExample() {
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

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andStatementIsNull() {
            addCriterion("statement is null");
            return (Criteria) this;
        }

        public Criteria andStatementIsNotNull() {
            addCriterion("statement is not null");
            return (Criteria) this;
        }

        public Criteria andStatementEqualTo(String value) {
            addCriterion("statement =", value, "statement");
            return (Criteria) this;
        }

        public Criteria andStatementNotEqualTo(String value) {
            addCriterion("statement <>", value, "statement");
            return (Criteria) this;
        }

        public Criteria andStatementGreaterThan(String value) {
            addCriterion("statement >", value, "statement");
            return (Criteria) this;
        }

        public Criteria andStatementGreaterThanOrEqualTo(String value) {
            addCriterion("statement >=", value, "statement");
            return (Criteria) this;
        }

        public Criteria andStatementLessThan(String value) {
            addCriterion("statement <", value, "statement");
            return (Criteria) this;
        }

        public Criteria andStatementLessThanOrEqualTo(String value) {
            addCriterion("statement <=", value, "statement");
            return (Criteria) this;
        }

        public Criteria andStatementLike(String value) {
            addCriterion("statement like", value, "statement");
            return (Criteria) this;
        }

        public Criteria andStatementNotLike(String value) {
            addCriterion("statement not like", value, "statement");
            return (Criteria) this;
        }

        public Criteria andStatementIn(List<String> values) {
            addCriterion("statement in", values, "statement");
            return (Criteria) this;
        }

        public Criteria andStatementNotIn(List<String> values) {
            addCriterion("statement not in", values, "statement");
            return (Criteria) this;
        }

        public Criteria andStatementBetween(String value1, String value2) {
            addCriterion("statement between", value1, value2, "statement");
            return (Criteria) this;
        }

        public Criteria andStatementNotBetween(String value1, String value2) {
            addCriterion("statement not between", value1, value2, "statement");
            return (Criteria) this;
        }

        public Criteria andPrepareTimeIsNull() {
            addCriterion("prepare_time is null");
            return (Criteria) this;
        }

        public Criteria andPrepareTimeIsNotNull() {
            addCriterion("prepare_time is not null");
            return (Criteria) this;
        }

        public Criteria andPrepareTimeEqualTo(Date value) {
            addCriterion("prepare_time =", value, "prepareTime");
            return (Criteria) this;
        }

        public Criteria andPrepareTimeNotEqualTo(Date value) {
            addCriterion("prepare_time <>", value, "prepareTime");
            return (Criteria) this;
        }

        public Criteria andPrepareTimeGreaterThan(Date value) {
            addCriterion("prepare_time >", value, "prepareTime");
            return (Criteria) this;
        }

        public Criteria andPrepareTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("prepare_time >=", value, "prepareTime");
            return (Criteria) this;
        }

        public Criteria andPrepareTimeLessThan(Date value) {
            addCriterion("prepare_time <", value, "prepareTime");
            return (Criteria) this;
        }

        public Criteria andPrepareTimeLessThanOrEqualTo(Date value) {
            addCriterion("prepare_time <=", value, "prepareTime");
            return (Criteria) this;
        }

        public Criteria andPrepareTimeIn(List<Date> values) {
            addCriterion("prepare_time in", values, "prepareTime");
            return (Criteria) this;
        }

        public Criteria andPrepareTimeNotIn(List<Date> values) {
            addCriterion("prepare_time not in", values, "prepareTime");
            return (Criteria) this;
        }

        public Criteria andPrepareTimeBetween(Date value1, Date value2) {
            addCriterion("prepare_time between", value1, value2, "prepareTime");
            return (Criteria) this;
        }

        public Criteria andPrepareTimeNotBetween(Date value1, Date value2) {
            addCriterion("prepare_time not between", value1, value2, "prepareTime");
            return (Criteria) this;
        }

        public Criteria andParameterTypesIsNull() {
            addCriterion("parameter_types is null");
            return (Criteria) this;
        }

        public Criteria andParameterTypesIsNotNull() {
            addCriterion("parameter_types is not null");
            return (Criteria) this;
        }

        public Criteria andParameterTypesEqualTo(Object value) {
            addCriterion("parameter_types =", value, "parameterTypes");
            return (Criteria) this;
        }

        public Criteria andParameterTypesNotEqualTo(Object value) {
            addCriterion("parameter_types <>", value, "parameterTypes");
            return (Criteria) this;
        }

        public Criteria andParameterTypesGreaterThan(Object value) {
            addCriterion("parameter_types >", value, "parameterTypes");
            return (Criteria) this;
        }

        public Criteria andParameterTypesGreaterThanOrEqualTo(Object value) {
            addCriterion("parameter_types >=", value, "parameterTypes");
            return (Criteria) this;
        }

        public Criteria andParameterTypesLessThan(Object value) {
            addCriterion("parameter_types <", value, "parameterTypes");
            return (Criteria) this;
        }

        public Criteria andParameterTypesLessThanOrEqualTo(Object value) {
            addCriterion("parameter_types <=", value, "parameterTypes");
            return (Criteria) this;
        }

        public Criteria andParameterTypesIn(List<Object> values) {
            addCriterion("parameter_types in", values, "parameterTypes");
            return (Criteria) this;
        }

        public Criteria andParameterTypesNotIn(List<Object> values) {
            addCriterion("parameter_types not in", values, "parameterTypes");
            return (Criteria) this;
        }

        public Criteria andParameterTypesBetween(Object value1, Object value2) {
            addCriterion("parameter_types between", value1, value2, "parameterTypes");
            return (Criteria) this;
        }

        public Criteria andParameterTypesNotBetween(Object value1, Object value2) {
            addCriterion("parameter_types not between", value1, value2, "parameterTypes");
            return (Criteria) this;
        }

        public Criteria andResultTypesIsNull() {
            addCriterion("result_types is null");
            return (Criteria) this;
        }

        public Criteria andResultTypesIsNotNull() {
            addCriterion("result_types is not null");
            return (Criteria) this;
        }

        public Criteria andResultTypesEqualTo(Object value) {
            addCriterion("result_types =", value, "resultTypes");
            return (Criteria) this;
        }

        public Criteria andResultTypesNotEqualTo(Object value) {
            addCriterion("result_types <>", value, "resultTypes");
            return (Criteria) this;
        }

        public Criteria andResultTypesGreaterThan(Object value) {
            addCriterion("result_types >", value, "resultTypes");
            return (Criteria) this;
        }

        public Criteria andResultTypesGreaterThanOrEqualTo(Object value) {
            addCriterion("result_types >=", value, "resultTypes");
            return (Criteria) this;
        }

        public Criteria andResultTypesLessThan(Object value) {
            addCriterion("result_types <", value, "resultTypes");
            return (Criteria) this;
        }

        public Criteria andResultTypesLessThanOrEqualTo(Object value) {
            addCriterion("result_types <=", value, "resultTypes");
            return (Criteria) this;
        }

        public Criteria andResultTypesIn(List<Object> values) {
            addCriterion("result_types in", values, "resultTypes");
            return (Criteria) this;
        }

        public Criteria andResultTypesNotIn(List<Object> values) {
            addCriterion("result_types not in", values, "resultTypes");
            return (Criteria) this;
        }

        public Criteria andResultTypesBetween(Object value1, Object value2) {
            addCriterion("result_types between", value1, value2, "resultTypes");
            return (Criteria) this;
        }

        public Criteria andResultTypesNotBetween(Object value1, Object value2) {
            addCriterion("result_types not between", value1, value2, "resultTypes");
            return (Criteria) this;
        }

        public Criteria andFromSqlIsNull() {
            addCriterion("from_sql is null");
            return (Criteria) this;
        }

        public Criteria andFromSqlIsNotNull() {
            addCriterion("from_sql is not null");
            return (Criteria) this;
        }

        public Criteria andFromSqlEqualTo(Boolean value) {
            addCriterion("from_sql =", value, "fromSql");
            return (Criteria) this;
        }

        public Criteria andFromSqlNotEqualTo(Boolean value) {
            addCriterion("from_sql <>", value, "fromSql");
            return (Criteria) this;
        }

        public Criteria andFromSqlGreaterThan(Boolean value) {
            addCriterion("from_sql >", value, "fromSql");
            return (Criteria) this;
        }

        public Criteria andFromSqlGreaterThanOrEqualTo(Boolean value) {
            addCriterion("from_sql >=", value, "fromSql");
            return (Criteria) this;
        }

        public Criteria andFromSqlLessThan(Boolean value) {
            addCriterion("from_sql <", value, "fromSql");
            return (Criteria) this;
        }

        public Criteria andFromSqlLessThanOrEqualTo(Boolean value) {
            addCriterion("from_sql <=", value, "fromSql");
            return (Criteria) this;
        }

        public Criteria andFromSqlIn(List<Boolean> values) {
            addCriterion("from_sql in", values, "fromSql");
            return (Criteria) this;
        }

        public Criteria andFromSqlNotIn(List<Boolean> values) {
            addCriterion("from_sql not in", values, "fromSql");
            return (Criteria) this;
        }

        public Criteria andFromSqlBetween(Boolean value1, Boolean value2) {
            addCriterion("from_sql between", value1, value2, "fromSql");
            return (Criteria) this;
        }

        public Criteria andFromSqlNotBetween(Boolean value1, Boolean value2) {
            addCriterion("from_sql not between", value1, value2, "fromSql");
            return (Criteria) this;
        }

        public Criteria andGenericPlansIsNull() {
            addCriterion("generic_plans is null");
            return (Criteria) this;
        }

        public Criteria andGenericPlansIsNotNull() {
            addCriterion("generic_plans is not null");
            return (Criteria) this;
        }

        public Criteria andGenericPlansEqualTo(Long value) {
            addCriterion("generic_plans =", value, "genericPlans");
            return (Criteria) this;
        }

        public Criteria andGenericPlansNotEqualTo(Long value) {
            addCriterion("generic_plans <>", value, "genericPlans");
            return (Criteria) this;
        }

        public Criteria andGenericPlansGreaterThan(Long value) {
            addCriterion("generic_plans >", value, "genericPlans");
            return (Criteria) this;
        }

        public Criteria andGenericPlansGreaterThanOrEqualTo(Long value) {
            addCriterion("generic_plans >=", value, "genericPlans");
            return (Criteria) this;
        }

        public Criteria andGenericPlansLessThan(Long value) {
            addCriterion("generic_plans <", value, "genericPlans");
            return (Criteria) this;
        }

        public Criteria andGenericPlansLessThanOrEqualTo(Long value) {
            addCriterion("generic_plans <=", value, "genericPlans");
            return (Criteria) this;
        }

        public Criteria andGenericPlansIn(List<Long> values) {
            addCriterion("generic_plans in", values, "genericPlans");
            return (Criteria) this;
        }

        public Criteria andGenericPlansNotIn(List<Long> values) {
            addCriterion("generic_plans not in", values, "genericPlans");
            return (Criteria) this;
        }

        public Criteria andGenericPlansBetween(Long value1, Long value2) {
            addCriterion("generic_plans between", value1, value2, "genericPlans");
            return (Criteria) this;
        }

        public Criteria andGenericPlansNotBetween(Long value1, Long value2) {
            addCriterion("generic_plans not between", value1, value2, "genericPlans");
            return (Criteria) this;
        }

        public Criteria andCustomPlansIsNull() {
            addCriterion("custom_plans is null");
            return (Criteria) this;
        }

        public Criteria andCustomPlansIsNotNull() {
            addCriterion("custom_plans is not null");
            return (Criteria) this;
        }

        public Criteria andCustomPlansEqualTo(Long value) {
            addCriterion("custom_plans =", value, "customPlans");
            return (Criteria) this;
        }

        public Criteria andCustomPlansNotEqualTo(Long value) {
            addCriterion("custom_plans <>", value, "customPlans");
            return (Criteria) this;
        }

        public Criteria andCustomPlansGreaterThan(Long value) {
            addCriterion("custom_plans >", value, "customPlans");
            return (Criteria) this;
        }

        public Criteria andCustomPlansGreaterThanOrEqualTo(Long value) {
            addCriterion("custom_plans >=", value, "customPlans");
            return (Criteria) this;
        }

        public Criteria andCustomPlansLessThan(Long value) {
            addCriterion("custom_plans <", value, "customPlans");
            return (Criteria) this;
        }

        public Criteria andCustomPlansLessThanOrEqualTo(Long value) {
            addCriterion("custom_plans <=", value, "customPlans");
            return (Criteria) this;
        }

        public Criteria andCustomPlansIn(List<Long> values) {
            addCriterion("custom_plans in", values, "customPlans");
            return (Criteria) this;
        }

        public Criteria andCustomPlansNotIn(List<Long> values) {
            addCriterion("custom_plans not in", values, "customPlans");
            return (Criteria) this;
        }

        public Criteria andCustomPlansBetween(Long value1, Long value2) {
            addCriterion("custom_plans between", value1, value2, "customPlans");
            return (Criteria) this;
        }

        public Criteria andCustomPlansNotBetween(Long value1, Long value2) {
            addCriterion("custom_plans not between", value1, value2, "customPlans");
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