package com.pool.readio.mbg.model;

import java.util.ArrayList;
import java.util.List;

public class PgStatisticExtDataExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PgStatisticExtDataExample() {
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

        public Criteria andStxoidIsNull() {
            addCriterion("stxoid is null");
            return (Criteria) this;
        }

        public Criteria andStxoidIsNotNull() {
            addCriterion("stxoid is not null");
            return (Criteria) this;
        }

        public Criteria andStxoidEqualTo(Long value) {
            addCriterion("stxoid =", value, "stxoid");
            return (Criteria) this;
        }

        public Criteria andStxoidNotEqualTo(Long value) {
            addCriterion("stxoid <>", value, "stxoid");
            return (Criteria) this;
        }

        public Criteria andStxoidGreaterThan(Long value) {
            addCriterion("stxoid >", value, "stxoid");
            return (Criteria) this;
        }

        public Criteria andStxoidGreaterThanOrEqualTo(Long value) {
            addCriterion("stxoid >=", value, "stxoid");
            return (Criteria) this;
        }

        public Criteria andStxoidLessThan(Long value) {
            addCriterion("stxoid <", value, "stxoid");
            return (Criteria) this;
        }

        public Criteria andStxoidLessThanOrEqualTo(Long value) {
            addCriterion("stxoid <=", value, "stxoid");
            return (Criteria) this;
        }

        public Criteria andStxoidIn(List<Long> values) {
            addCriterion("stxoid in", values, "stxoid");
            return (Criteria) this;
        }

        public Criteria andStxoidNotIn(List<Long> values) {
            addCriterion("stxoid not in", values, "stxoid");
            return (Criteria) this;
        }

        public Criteria andStxoidBetween(Long value1, Long value2) {
            addCriterion("stxoid between", value1, value2, "stxoid");
            return (Criteria) this;
        }

        public Criteria andStxoidNotBetween(Long value1, Long value2) {
            addCriterion("stxoid not between", value1, value2, "stxoid");
            return (Criteria) this;
        }

        public Criteria andStxdinheritIsNull() {
            addCriterion("stxdinherit is null");
            return (Criteria) this;
        }

        public Criteria andStxdinheritIsNotNull() {
            addCriterion("stxdinherit is not null");
            return (Criteria) this;
        }

        public Criteria andStxdinheritEqualTo(Boolean value) {
            addCriterion("stxdinherit =", value, "stxdinherit");
            return (Criteria) this;
        }

        public Criteria andStxdinheritNotEqualTo(Boolean value) {
            addCriterion("stxdinherit <>", value, "stxdinherit");
            return (Criteria) this;
        }

        public Criteria andStxdinheritGreaterThan(Boolean value) {
            addCriterion("stxdinherit >", value, "stxdinherit");
            return (Criteria) this;
        }

        public Criteria andStxdinheritGreaterThanOrEqualTo(Boolean value) {
            addCriterion("stxdinherit >=", value, "stxdinherit");
            return (Criteria) this;
        }

        public Criteria andStxdinheritLessThan(Boolean value) {
            addCriterion("stxdinherit <", value, "stxdinherit");
            return (Criteria) this;
        }

        public Criteria andStxdinheritLessThanOrEqualTo(Boolean value) {
            addCriterion("stxdinherit <=", value, "stxdinherit");
            return (Criteria) this;
        }

        public Criteria andStxdinheritIn(List<Boolean> values) {
            addCriterion("stxdinherit in", values, "stxdinherit");
            return (Criteria) this;
        }

        public Criteria andStxdinheritNotIn(List<Boolean> values) {
            addCriterion("stxdinherit not in", values, "stxdinherit");
            return (Criteria) this;
        }

        public Criteria andStxdinheritBetween(Boolean value1, Boolean value2) {
            addCriterion("stxdinherit between", value1, value2, "stxdinherit");
            return (Criteria) this;
        }

        public Criteria andStxdinheritNotBetween(Boolean value1, Boolean value2) {
            addCriterion("stxdinherit not between", value1, value2, "stxdinherit");
            return (Criteria) this;
        }

        public Criteria andStxdndistinctIsNull() {
            addCriterion("stxdndistinct is null");
            return (Criteria) this;
        }

        public Criteria andStxdndistinctIsNotNull() {
            addCriterion("stxdndistinct is not null");
            return (Criteria) this;
        }

        public Criteria andStxdndistinctEqualTo(Object value) {
            addCriterion("stxdndistinct =", value, "stxdndistinct");
            return (Criteria) this;
        }

        public Criteria andStxdndistinctNotEqualTo(Object value) {
            addCriterion("stxdndistinct <>", value, "stxdndistinct");
            return (Criteria) this;
        }

        public Criteria andStxdndistinctGreaterThan(Object value) {
            addCriterion("stxdndistinct >", value, "stxdndistinct");
            return (Criteria) this;
        }

        public Criteria andStxdndistinctGreaterThanOrEqualTo(Object value) {
            addCriterion("stxdndistinct >=", value, "stxdndistinct");
            return (Criteria) this;
        }

        public Criteria andStxdndistinctLessThan(Object value) {
            addCriterion("stxdndistinct <", value, "stxdndistinct");
            return (Criteria) this;
        }

        public Criteria andStxdndistinctLessThanOrEqualTo(Object value) {
            addCriterion("stxdndistinct <=", value, "stxdndistinct");
            return (Criteria) this;
        }

        public Criteria andStxdndistinctIn(List<Object> values) {
            addCriterion("stxdndistinct in", values, "stxdndistinct");
            return (Criteria) this;
        }

        public Criteria andStxdndistinctNotIn(List<Object> values) {
            addCriterion("stxdndistinct not in", values, "stxdndistinct");
            return (Criteria) this;
        }

        public Criteria andStxdndistinctBetween(Object value1, Object value2) {
            addCriterion("stxdndistinct between", value1, value2, "stxdndistinct");
            return (Criteria) this;
        }

        public Criteria andStxdndistinctNotBetween(Object value1, Object value2) {
            addCriterion("stxdndistinct not between", value1, value2, "stxdndistinct");
            return (Criteria) this;
        }

        public Criteria andStxddependenciesIsNull() {
            addCriterion("stxddependencies is null");
            return (Criteria) this;
        }

        public Criteria andStxddependenciesIsNotNull() {
            addCriterion("stxddependencies is not null");
            return (Criteria) this;
        }

        public Criteria andStxddependenciesEqualTo(Object value) {
            addCriterion("stxddependencies =", value, "stxddependencies");
            return (Criteria) this;
        }

        public Criteria andStxddependenciesNotEqualTo(Object value) {
            addCriterion("stxddependencies <>", value, "stxddependencies");
            return (Criteria) this;
        }

        public Criteria andStxddependenciesGreaterThan(Object value) {
            addCriterion("stxddependencies >", value, "stxddependencies");
            return (Criteria) this;
        }

        public Criteria andStxddependenciesGreaterThanOrEqualTo(Object value) {
            addCriterion("stxddependencies >=", value, "stxddependencies");
            return (Criteria) this;
        }

        public Criteria andStxddependenciesLessThan(Object value) {
            addCriterion("stxddependencies <", value, "stxddependencies");
            return (Criteria) this;
        }

        public Criteria andStxddependenciesLessThanOrEqualTo(Object value) {
            addCriterion("stxddependencies <=", value, "stxddependencies");
            return (Criteria) this;
        }

        public Criteria andStxddependenciesIn(List<Object> values) {
            addCriterion("stxddependencies in", values, "stxddependencies");
            return (Criteria) this;
        }

        public Criteria andStxddependenciesNotIn(List<Object> values) {
            addCriterion("stxddependencies not in", values, "stxddependencies");
            return (Criteria) this;
        }

        public Criteria andStxddependenciesBetween(Object value1, Object value2) {
            addCriterion("stxddependencies between", value1, value2, "stxddependencies");
            return (Criteria) this;
        }

        public Criteria andStxddependenciesNotBetween(Object value1, Object value2) {
            addCriterion("stxddependencies not between", value1, value2, "stxddependencies");
            return (Criteria) this;
        }

        public Criteria andStxdmcvIsNull() {
            addCriterion("stxdmcv is null");
            return (Criteria) this;
        }

        public Criteria andStxdmcvIsNotNull() {
            addCriterion("stxdmcv is not null");
            return (Criteria) this;
        }

        public Criteria andStxdmcvEqualTo(Object value) {
            addCriterion("stxdmcv =", value, "stxdmcv");
            return (Criteria) this;
        }

        public Criteria andStxdmcvNotEqualTo(Object value) {
            addCriterion("stxdmcv <>", value, "stxdmcv");
            return (Criteria) this;
        }

        public Criteria andStxdmcvGreaterThan(Object value) {
            addCriterion("stxdmcv >", value, "stxdmcv");
            return (Criteria) this;
        }

        public Criteria andStxdmcvGreaterThanOrEqualTo(Object value) {
            addCriterion("stxdmcv >=", value, "stxdmcv");
            return (Criteria) this;
        }

        public Criteria andStxdmcvLessThan(Object value) {
            addCriterion("stxdmcv <", value, "stxdmcv");
            return (Criteria) this;
        }

        public Criteria andStxdmcvLessThanOrEqualTo(Object value) {
            addCriterion("stxdmcv <=", value, "stxdmcv");
            return (Criteria) this;
        }

        public Criteria andStxdmcvIn(List<Object> values) {
            addCriterion("stxdmcv in", values, "stxdmcv");
            return (Criteria) this;
        }

        public Criteria andStxdmcvNotIn(List<Object> values) {
            addCriterion("stxdmcv not in", values, "stxdmcv");
            return (Criteria) this;
        }

        public Criteria andStxdmcvBetween(Object value1, Object value2) {
            addCriterion("stxdmcv between", value1, value2, "stxdmcv");
            return (Criteria) this;
        }

        public Criteria andStxdmcvNotBetween(Object value1, Object value2) {
            addCriterion("stxdmcv not between", value1, value2, "stxdmcv");
            return (Criteria) this;
        }

        public Criteria andStxdexprIsNull() {
            addCriterion("stxdexpr is null");
            return (Criteria) this;
        }

        public Criteria andStxdexprIsNotNull() {
            addCriterion("stxdexpr is not null");
            return (Criteria) this;
        }

        public Criteria andStxdexprEqualTo(Object value) {
            addCriterion("stxdexpr =", value, "stxdexpr");
            return (Criteria) this;
        }

        public Criteria andStxdexprNotEqualTo(Object value) {
            addCriterion("stxdexpr <>", value, "stxdexpr");
            return (Criteria) this;
        }

        public Criteria andStxdexprGreaterThan(Object value) {
            addCriterion("stxdexpr >", value, "stxdexpr");
            return (Criteria) this;
        }

        public Criteria andStxdexprGreaterThanOrEqualTo(Object value) {
            addCriterion("stxdexpr >=", value, "stxdexpr");
            return (Criteria) this;
        }

        public Criteria andStxdexprLessThan(Object value) {
            addCriterion("stxdexpr <", value, "stxdexpr");
            return (Criteria) this;
        }

        public Criteria andStxdexprLessThanOrEqualTo(Object value) {
            addCriterion("stxdexpr <=", value, "stxdexpr");
            return (Criteria) this;
        }

        public Criteria andStxdexprIn(List<Object> values) {
            addCriterion("stxdexpr in", values, "stxdexpr");
            return (Criteria) this;
        }

        public Criteria andStxdexprNotIn(List<Object> values) {
            addCriterion("stxdexpr not in", values, "stxdexpr");
            return (Criteria) this;
        }

        public Criteria andStxdexprBetween(Object value1, Object value2) {
            addCriterion("stxdexpr between", value1, value2, "stxdexpr");
            return (Criteria) this;
        }

        public Criteria andStxdexprNotBetween(Object value1, Object value2) {
            addCriterion("stxdexpr not between", value1, value2, "stxdexpr");
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