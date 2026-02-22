package com.pool.readio.readiombg.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PgStatBgwriterExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PgStatBgwriterExample() {
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

        public Criteria andBuffersCleanIsNull() {
            addCriterion("buffers_clean is null");
            return (Criteria) this;
        }

        public Criteria andBuffersCleanIsNotNull() {
            addCriterion("buffers_clean is not null");
            return (Criteria) this;
        }

        public Criteria andBuffersCleanEqualTo(Long value) {
            addCriterion("buffers_clean =", value, "buffersClean");
            return (Criteria) this;
        }

        public Criteria andBuffersCleanNotEqualTo(Long value) {
            addCriterion("buffers_clean <>", value, "buffersClean");
            return (Criteria) this;
        }

        public Criteria andBuffersCleanGreaterThan(Long value) {
            addCriterion("buffers_clean >", value, "buffersClean");
            return (Criteria) this;
        }

        public Criteria andBuffersCleanGreaterThanOrEqualTo(Long value) {
            addCriterion("buffers_clean >=", value, "buffersClean");
            return (Criteria) this;
        }

        public Criteria andBuffersCleanLessThan(Long value) {
            addCriterion("buffers_clean <", value, "buffersClean");
            return (Criteria) this;
        }

        public Criteria andBuffersCleanLessThanOrEqualTo(Long value) {
            addCriterion("buffers_clean <=", value, "buffersClean");
            return (Criteria) this;
        }

        public Criteria andBuffersCleanIn(List<Long> values) {
            addCriterion("buffers_clean in", values, "buffersClean");
            return (Criteria) this;
        }

        public Criteria andBuffersCleanNotIn(List<Long> values) {
            addCriterion("buffers_clean not in", values, "buffersClean");
            return (Criteria) this;
        }

        public Criteria andBuffersCleanBetween(Long value1, Long value2) {
            addCriterion("buffers_clean between", value1, value2, "buffersClean");
            return (Criteria) this;
        }

        public Criteria andBuffersCleanNotBetween(Long value1, Long value2) {
            addCriterion("buffers_clean not between", value1, value2, "buffersClean");
            return (Criteria) this;
        }

        public Criteria andMaxwrittenCleanIsNull() {
            addCriterion("maxwritten_clean is null");
            return (Criteria) this;
        }

        public Criteria andMaxwrittenCleanIsNotNull() {
            addCriterion("maxwritten_clean is not null");
            return (Criteria) this;
        }

        public Criteria andMaxwrittenCleanEqualTo(Long value) {
            addCriterion("maxwritten_clean =", value, "maxwrittenClean");
            return (Criteria) this;
        }

        public Criteria andMaxwrittenCleanNotEqualTo(Long value) {
            addCriterion("maxwritten_clean <>", value, "maxwrittenClean");
            return (Criteria) this;
        }

        public Criteria andMaxwrittenCleanGreaterThan(Long value) {
            addCriterion("maxwritten_clean >", value, "maxwrittenClean");
            return (Criteria) this;
        }

        public Criteria andMaxwrittenCleanGreaterThanOrEqualTo(Long value) {
            addCriterion("maxwritten_clean >=", value, "maxwrittenClean");
            return (Criteria) this;
        }

        public Criteria andMaxwrittenCleanLessThan(Long value) {
            addCriterion("maxwritten_clean <", value, "maxwrittenClean");
            return (Criteria) this;
        }

        public Criteria andMaxwrittenCleanLessThanOrEqualTo(Long value) {
            addCriterion("maxwritten_clean <=", value, "maxwrittenClean");
            return (Criteria) this;
        }

        public Criteria andMaxwrittenCleanIn(List<Long> values) {
            addCriterion("maxwritten_clean in", values, "maxwrittenClean");
            return (Criteria) this;
        }

        public Criteria andMaxwrittenCleanNotIn(List<Long> values) {
            addCriterion("maxwritten_clean not in", values, "maxwrittenClean");
            return (Criteria) this;
        }

        public Criteria andMaxwrittenCleanBetween(Long value1, Long value2) {
            addCriterion("maxwritten_clean between", value1, value2, "maxwrittenClean");
            return (Criteria) this;
        }

        public Criteria andMaxwrittenCleanNotBetween(Long value1, Long value2) {
            addCriterion("maxwritten_clean not between", value1, value2, "maxwrittenClean");
            return (Criteria) this;
        }

        public Criteria andBuffersAllocIsNull() {
            addCriterion("buffers_alloc is null");
            return (Criteria) this;
        }

        public Criteria andBuffersAllocIsNotNull() {
            addCriterion("buffers_alloc is not null");
            return (Criteria) this;
        }

        public Criteria andBuffersAllocEqualTo(Long value) {
            addCriterion("buffers_alloc =", value, "buffersAlloc");
            return (Criteria) this;
        }

        public Criteria andBuffersAllocNotEqualTo(Long value) {
            addCriterion("buffers_alloc <>", value, "buffersAlloc");
            return (Criteria) this;
        }

        public Criteria andBuffersAllocGreaterThan(Long value) {
            addCriterion("buffers_alloc >", value, "buffersAlloc");
            return (Criteria) this;
        }

        public Criteria andBuffersAllocGreaterThanOrEqualTo(Long value) {
            addCriterion("buffers_alloc >=", value, "buffersAlloc");
            return (Criteria) this;
        }

        public Criteria andBuffersAllocLessThan(Long value) {
            addCriterion("buffers_alloc <", value, "buffersAlloc");
            return (Criteria) this;
        }

        public Criteria andBuffersAllocLessThanOrEqualTo(Long value) {
            addCriterion("buffers_alloc <=", value, "buffersAlloc");
            return (Criteria) this;
        }

        public Criteria andBuffersAllocIn(List<Long> values) {
            addCriterion("buffers_alloc in", values, "buffersAlloc");
            return (Criteria) this;
        }

        public Criteria andBuffersAllocNotIn(List<Long> values) {
            addCriterion("buffers_alloc not in", values, "buffersAlloc");
            return (Criteria) this;
        }

        public Criteria andBuffersAllocBetween(Long value1, Long value2) {
            addCriterion("buffers_alloc between", value1, value2, "buffersAlloc");
            return (Criteria) this;
        }

        public Criteria andBuffersAllocNotBetween(Long value1, Long value2) {
            addCriterion("buffers_alloc not between", value1, value2, "buffersAlloc");
            return (Criteria) this;
        }

        public Criteria andStatsResetIsNull() {
            addCriterion("stats_reset is null");
            return (Criteria) this;
        }

        public Criteria andStatsResetIsNotNull() {
            addCriterion("stats_reset is not null");
            return (Criteria) this;
        }

        public Criteria andStatsResetEqualTo(Date value) {
            addCriterion("stats_reset =", value, "statsReset");
            return (Criteria) this;
        }

        public Criteria andStatsResetNotEqualTo(Date value) {
            addCriterion("stats_reset <>", value, "statsReset");
            return (Criteria) this;
        }

        public Criteria andStatsResetGreaterThan(Date value) {
            addCriterion("stats_reset >", value, "statsReset");
            return (Criteria) this;
        }

        public Criteria andStatsResetGreaterThanOrEqualTo(Date value) {
            addCriterion("stats_reset >=", value, "statsReset");
            return (Criteria) this;
        }

        public Criteria andStatsResetLessThan(Date value) {
            addCriterion("stats_reset <", value, "statsReset");
            return (Criteria) this;
        }

        public Criteria andStatsResetLessThanOrEqualTo(Date value) {
            addCriterion("stats_reset <=", value, "statsReset");
            return (Criteria) this;
        }

        public Criteria andStatsResetIn(List<Date> values) {
            addCriterion("stats_reset in", values, "statsReset");
            return (Criteria) this;
        }

        public Criteria andStatsResetNotIn(List<Date> values) {
            addCriterion("stats_reset not in", values, "statsReset");
            return (Criteria) this;
        }

        public Criteria andStatsResetBetween(Date value1, Date value2) {
            addCriterion("stats_reset between", value1, value2, "statsReset");
            return (Criteria) this;
        }

        public Criteria andStatsResetNotBetween(Date value1, Date value2) {
            addCriterion("stats_reset not between", value1, value2, "statsReset");
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