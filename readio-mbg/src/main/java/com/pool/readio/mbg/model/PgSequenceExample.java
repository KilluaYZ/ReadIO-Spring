package com.pool.readio.mbg.model;

import java.util.ArrayList;
import java.util.List;

public class PgSequenceExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PgSequenceExample() {
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

        public Criteria andSeqrelidIsNull() {
            addCriterion("seqrelid is null");
            return (Criteria) this;
        }

        public Criteria andSeqrelidIsNotNull() {
            addCriterion("seqrelid is not null");
            return (Criteria) this;
        }

        public Criteria andSeqrelidEqualTo(Long value) {
            addCriterion("seqrelid =", value, "seqrelid");
            return (Criteria) this;
        }

        public Criteria andSeqrelidNotEqualTo(Long value) {
            addCriterion("seqrelid <>", value, "seqrelid");
            return (Criteria) this;
        }

        public Criteria andSeqrelidGreaterThan(Long value) {
            addCriterion("seqrelid >", value, "seqrelid");
            return (Criteria) this;
        }

        public Criteria andSeqrelidGreaterThanOrEqualTo(Long value) {
            addCriterion("seqrelid >=", value, "seqrelid");
            return (Criteria) this;
        }

        public Criteria andSeqrelidLessThan(Long value) {
            addCriterion("seqrelid <", value, "seqrelid");
            return (Criteria) this;
        }

        public Criteria andSeqrelidLessThanOrEqualTo(Long value) {
            addCriterion("seqrelid <=", value, "seqrelid");
            return (Criteria) this;
        }

        public Criteria andSeqrelidIn(List<Long> values) {
            addCriterion("seqrelid in", values, "seqrelid");
            return (Criteria) this;
        }

        public Criteria andSeqrelidNotIn(List<Long> values) {
            addCriterion("seqrelid not in", values, "seqrelid");
            return (Criteria) this;
        }

        public Criteria andSeqrelidBetween(Long value1, Long value2) {
            addCriterion("seqrelid between", value1, value2, "seqrelid");
            return (Criteria) this;
        }

        public Criteria andSeqrelidNotBetween(Long value1, Long value2) {
            addCriterion("seqrelid not between", value1, value2, "seqrelid");
            return (Criteria) this;
        }

        public Criteria andSeqtypidIsNull() {
            addCriterion("seqtypid is null");
            return (Criteria) this;
        }

        public Criteria andSeqtypidIsNotNull() {
            addCriterion("seqtypid is not null");
            return (Criteria) this;
        }

        public Criteria andSeqtypidEqualTo(Long value) {
            addCriterion("seqtypid =", value, "seqtypid");
            return (Criteria) this;
        }

        public Criteria andSeqtypidNotEqualTo(Long value) {
            addCriterion("seqtypid <>", value, "seqtypid");
            return (Criteria) this;
        }

        public Criteria andSeqtypidGreaterThan(Long value) {
            addCriterion("seqtypid >", value, "seqtypid");
            return (Criteria) this;
        }

        public Criteria andSeqtypidGreaterThanOrEqualTo(Long value) {
            addCriterion("seqtypid >=", value, "seqtypid");
            return (Criteria) this;
        }

        public Criteria andSeqtypidLessThan(Long value) {
            addCriterion("seqtypid <", value, "seqtypid");
            return (Criteria) this;
        }

        public Criteria andSeqtypidLessThanOrEqualTo(Long value) {
            addCriterion("seqtypid <=", value, "seqtypid");
            return (Criteria) this;
        }

        public Criteria andSeqtypidIn(List<Long> values) {
            addCriterion("seqtypid in", values, "seqtypid");
            return (Criteria) this;
        }

        public Criteria andSeqtypidNotIn(List<Long> values) {
            addCriterion("seqtypid not in", values, "seqtypid");
            return (Criteria) this;
        }

        public Criteria andSeqtypidBetween(Long value1, Long value2) {
            addCriterion("seqtypid between", value1, value2, "seqtypid");
            return (Criteria) this;
        }

        public Criteria andSeqtypidNotBetween(Long value1, Long value2) {
            addCriterion("seqtypid not between", value1, value2, "seqtypid");
            return (Criteria) this;
        }

        public Criteria andSeqstartIsNull() {
            addCriterion("seqstart is null");
            return (Criteria) this;
        }

        public Criteria andSeqstartIsNotNull() {
            addCriterion("seqstart is not null");
            return (Criteria) this;
        }

        public Criteria andSeqstartEqualTo(Long value) {
            addCriterion("seqstart =", value, "seqstart");
            return (Criteria) this;
        }

        public Criteria andSeqstartNotEqualTo(Long value) {
            addCriterion("seqstart <>", value, "seqstart");
            return (Criteria) this;
        }

        public Criteria andSeqstartGreaterThan(Long value) {
            addCriterion("seqstart >", value, "seqstart");
            return (Criteria) this;
        }

        public Criteria andSeqstartGreaterThanOrEqualTo(Long value) {
            addCriterion("seqstart >=", value, "seqstart");
            return (Criteria) this;
        }

        public Criteria andSeqstartLessThan(Long value) {
            addCriterion("seqstart <", value, "seqstart");
            return (Criteria) this;
        }

        public Criteria andSeqstartLessThanOrEqualTo(Long value) {
            addCriterion("seqstart <=", value, "seqstart");
            return (Criteria) this;
        }

        public Criteria andSeqstartIn(List<Long> values) {
            addCriterion("seqstart in", values, "seqstart");
            return (Criteria) this;
        }

        public Criteria andSeqstartNotIn(List<Long> values) {
            addCriterion("seqstart not in", values, "seqstart");
            return (Criteria) this;
        }

        public Criteria andSeqstartBetween(Long value1, Long value2) {
            addCriterion("seqstart between", value1, value2, "seqstart");
            return (Criteria) this;
        }

        public Criteria andSeqstartNotBetween(Long value1, Long value2) {
            addCriterion("seqstart not between", value1, value2, "seqstart");
            return (Criteria) this;
        }

        public Criteria andSeqincrementIsNull() {
            addCriterion("seqincrement is null");
            return (Criteria) this;
        }

        public Criteria andSeqincrementIsNotNull() {
            addCriterion("seqincrement is not null");
            return (Criteria) this;
        }

        public Criteria andSeqincrementEqualTo(Long value) {
            addCriterion("seqincrement =", value, "seqincrement");
            return (Criteria) this;
        }

        public Criteria andSeqincrementNotEqualTo(Long value) {
            addCriterion("seqincrement <>", value, "seqincrement");
            return (Criteria) this;
        }

        public Criteria andSeqincrementGreaterThan(Long value) {
            addCriterion("seqincrement >", value, "seqincrement");
            return (Criteria) this;
        }

        public Criteria andSeqincrementGreaterThanOrEqualTo(Long value) {
            addCriterion("seqincrement >=", value, "seqincrement");
            return (Criteria) this;
        }

        public Criteria andSeqincrementLessThan(Long value) {
            addCriterion("seqincrement <", value, "seqincrement");
            return (Criteria) this;
        }

        public Criteria andSeqincrementLessThanOrEqualTo(Long value) {
            addCriterion("seqincrement <=", value, "seqincrement");
            return (Criteria) this;
        }

        public Criteria andSeqincrementIn(List<Long> values) {
            addCriterion("seqincrement in", values, "seqincrement");
            return (Criteria) this;
        }

        public Criteria andSeqincrementNotIn(List<Long> values) {
            addCriterion("seqincrement not in", values, "seqincrement");
            return (Criteria) this;
        }

        public Criteria andSeqincrementBetween(Long value1, Long value2) {
            addCriterion("seqincrement between", value1, value2, "seqincrement");
            return (Criteria) this;
        }

        public Criteria andSeqincrementNotBetween(Long value1, Long value2) {
            addCriterion("seqincrement not between", value1, value2, "seqincrement");
            return (Criteria) this;
        }

        public Criteria andSeqmaxIsNull() {
            addCriterion("seqmax is null");
            return (Criteria) this;
        }

        public Criteria andSeqmaxIsNotNull() {
            addCriterion("seqmax is not null");
            return (Criteria) this;
        }

        public Criteria andSeqmaxEqualTo(Long value) {
            addCriterion("seqmax =", value, "seqmax");
            return (Criteria) this;
        }

        public Criteria andSeqmaxNotEqualTo(Long value) {
            addCriterion("seqmax <>", value, "seqmax");
            return (Criteria) this;
        }

        public Criteria andSeqmaxGreaterThan(Long value) {
            addCriterion("seqmax >", value, "seqmax");
            return (Criteria) this;
        }

        public Criteria andSeqmaxGreaterThanOrEqualTo(Long value) {
            addCriterion("seqmax >=", value, "seqmax");
            return (Criteria) this;
        }

        public Criteria andSeqmaxLessThan(Long value) {
            addCriterion("seqmax <", value, "seqmax");
            return (Criteria) this;
        }

        public Criteria andSeqmaxLessThanOrEqualTo(Long value) {
            addCriterion("seqmax <=", value, "seqmax");
            return (Criteria) this;
        }

        public Criteria andSeqmaxIn(List<Long> values) {
            addCriterion("seqmax in", values, "seqmax");
            return (Criteria) this;
        }

        public Criteria andSeqmaxNotIn(List<Long> values) {
            addCriterion("seqmax not in", values, "seqmax");
            return (Criteria) this;
        }

        public Criteria andSeqmaxBetween(Long value1, Long value2) {
            addCriterion("seqmax between", value1, value2, "seqmax");
            return (Criteria) this;
        }

        public Criteria andSeqmaxNotBetween(Long value1, Long value2) {
            addCriterion("seqmax not between", value1, value2, "seqmax");
            return (Criteria) this;
        }

        public Criteria andSeqminIsNull() {
            addCriterion("seqmin is null");
            return (Criteria) this;
        }

        public Criteria andSeqminIsNotNull() {
            addCriterion("seqmin is not null");
            return (Criteria) this;
        }

        public Criteria andSeqminEqualTo(Long value) {
            addCriterion("seqmin =", value, "seqmin");
            return (Criteria) this;
        }

        public Criteria andSeqminNotEqualTo(Long value) {
            addCriterion("seqmin <>", value, "seqmin");
            return (Criteria) this;
        }

        public Criteria andSeqminGreaterThan(Long value) {
            addCriterion("seqmin >", value, "seqmin");
            return (Criteria) this;
        }

        public Criteria andSeqminGreaterThanOrEqualTo(Long value) {
            addCriterion("seqmin >=", value, "seqmin");
            return (Criteria) this;
        }

        public Criteria andSeqminLessThan(Long value) {
            addCriterion("seqmin <", value, "seqmin");
            return (Criteria) this;
        }

        public Criteria andSeqminLessThanOrEqualTo(Long value) {
            addCriterion("seqmin <=", value, "seqmin");
            return (Criteria) this;
        }

        public Criteria andSeqminIn(List<Long> values) {
            addCriterion("seqmin in", values, "seqmin");
            return (Criteria) this;
        }

        public Criteria andSeqminNotIn(List<Long> values) {
            addCriterion("seqmin not in", values, "seqmin");
            return (Criteria) this;
        }

        public Criteria andSeqminBetween(Long value1, Long value2) {
            addCriterion("seqmin between", value1, value2, "seqmin");
            return (Criteria) this;
        }

        public Criteria andSeqminNotBetween(Long value1, Long value2) {
            addCriterion("seqmin not between", value1, value2, "seqmin");
            return (Criteria) this;
        }

        public Criteria andSeqcacheIsNull() {
            addCriterion("seqcache is null");
            return (Criteria) this;
        }

        public Criteria andSeqcacheIsNotNull() {
            addCriterion("seqcache is not null");
            return (Criteria) this;
        }

        public Criteria andSeqcacheEqualTo(Long value) {
            addCriterion("seqcache =", value, "seqcache");
            return (Criteria) this;
        }

        public Criteria andSeqcacheNotEqualTo(Long value) {
            addCriterion("seqcache <>", value, "seqcache");
            return (Criteria) this;
        }

        public Criteria andSeqcacheGreaterThan(Long value) {
            addCriterion("seqcache >", value, "seqcache");
            return (Criteria) this;
        }

        public Criteria andSeqcacheGreaterThanOrEqualTo(Long value) {
            addCriterion("seqcache >=", value, "seqcache");
            return (Criteria) this;
        }

        public Criteria andSeqcacheLessThan(Long value) {
            addCriterion("seqcache <", value, "seqcache");
            return (Criteria) this;
        }

        public Criteria andSeqcacheLessThanOrEqualTo(Long value) {
            addCriterion("seqcache <=", value, "seqcache");
            return (Criteria) this;
        }

        public Criteria andSeqcacheIn(List<Long> values) {
            addCriterion("seqcache in", values, "seqcache");
            return (Criteria) this;
        }

        public Criteria andSeqcacheNotIn(List<Long> values) {
            addCriterion("seqcache not in", values, "seqcache");
            return (Criteria) this;
        }

        public Criteria andSeqcacheBetween(Long value1, Long value2) {
            addCriterion("seqcache between", value1, value2, "seqcache");
            return (Criteria) this;
        }

        public Criteria andSeqcacheNotBetween(Long value1, Long value2) {
            addCriterion("seqcache not between", value1, value2, "seqcache");
            return (Criteria) this;
        }

        public Criteria andSeqcycleIsNull() {
            addCriterion("seqcycle is null");
            return (Criteria) this;
        }

        public Criteria andSeqcycleIsNotNull() {
            addCriterion("seqcycle is not null");
            return (Criteria) this;
        }

        public Criteria andSeqcycleEqualTo(Boolean value) {
            addCriterion("seqcycle =", value, "seqcycle");
            return (Criteria) this;
        }

        public Criteria andSeqcycleNotEqualTo(Boolean value) {
            addCriterion("seqcycle <>", value, "seqcycle");
            return (Criteria) this;
        }

        public Criteria andSeqcycleGreaterThan(Boolean value) {
            addCriterion("seqcycle >", value, "seqcycle");
            return (Criteria) this;
        }

        public Criteria andSeqcycleGreaterThanOrEqualTo(Boolean value) {
            addCriterion("seqcycle >=", value, "seqcycle");
            return (Criteria) this;
        }

        public Criteria andSeqcycleLessThan(Boolean value) {
            addCriterion("seqcycle <", value, "seqcycle");
            return (Criteria) this;
        }

        public Criteria andSeqcycleLessThanOrEqualTo(Boolean value) {
            addCriterion("seqcycle <=", value, "seqcycle");
            return (Criteria) this;
        }

        public Criteria andSeqcycleIn(List<Boolean> values) {
            addCriterion("seqcycle in", values, "seqcycle");
            return (Criteria) this;
        }

        public Criteria andSeqcycleNotIn(List<Boolean> values) {
            addCriterion("seqcycle not in", values, "seqcycle");
            return (Criteria) this;
        }

        public Criteria andSeqcycleBetween(Boolean value1, Boolean value2) {
            addCriterion("seqcycle between", value1, value2, "seqcycle");
            return (Criteria) this;
        }

        public Criteria andSeqcycleNotBetween(Boolean value1, Boolean value2) {
            addCriterion("seqcycle not between", value1, value2, "seqcycle");
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