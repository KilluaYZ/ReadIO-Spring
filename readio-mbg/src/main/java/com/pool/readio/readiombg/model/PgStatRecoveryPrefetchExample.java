package com.pool.readio.readiombg.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PgStatRecoveryPrefetchExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PgStatRecoveryPrefetchExample() {
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

        public Criteria andPrefetchIsNull() {
            addCriterion("prefetch is null");
            return (Criteria) this;
        }

        public Criteria andPrefetchIsNotNull() {
            addCriterion("prefetch is not null");
            return (Criteria) this;
        }

        public Criteria andPrefetchEqualTo(Long value) {
            addCriterion("prefetch =", value, "prefetch");
            return (Criteria) this;
        }

        public Criteria andPrefetchNotEqualTo(Long value) {
            addCriterion("prefetch <>", value, "prefetch");
            return (Criteria) this;
        }

        public Criteria andPrefetchGreaterThan(Long value) {
            addCriterion("prefetch >", value, "prefetch");
            return (Criteria) this;
        }

        public Criteria andPrefetchGreaterThanOrEqualTo(Long value) {
            addCriterion("prefetch >=", value, "prefetch");
            return (Criteria) this;
        }

        public Criteria andPrefetchLessThan(Long value) {
            addCriterion("prefetch <", value, "prefetch");
            return (Criteria) this;
        }

        public Criteria andPrefetchLessThanOrEqualTo(Long value) {
            addCriterion("prefetch <=", value, "prefetch");
            return (Criteria) this;
        }

        public Criteria andPrefetchIn(List<Long> values) {
            addCriterion("prefetch in", values, "prefetch");
            return (Criteria) this;
        }

        public Criteria andPrefetchNotIn(List<Long> values) {
            addCriterion("prefetch not in", values, "prefetch");
            return (Criteria) this;
        }

        public Criteria andPrefetchBetween(Long value1, Long value2) {
            addCriterion("prefetch between", value1, value2, "prefetch");
            return (Criteria) this;
        }

        public Criteria andPrefetchNotBetween(Long value1, Long value2) {
            addCriterion("prefetch not between", value1, value2, "prefetch");
            return (Criteria) this;
        }

        public Criteria andHitIsNull() {
            addCriterion("hit is null");
            return (Criteria) this;
        }

        public Criteria andHitIsNotNull() {
            addCriterion("hit is not null");
            return (Criteria) this;
        }

        public Criteria andHitEqualTo(Long value) {
            addCriterion("hit =", value, "hit");
            return (Criteria) this;
        }

        public Criteria andHitNotEqualTo(Long value) {
            addCriterion("hit <>", value, "hit");
            return (Criteria) this;
        }

        public Criteria andHitGreaterThan(Long value) {
            addCriterion("hit >", value, "hit");
            return (Criteria) this;
        }

        public Criteria andHitGreaterThanOrEqualTo(Long value) {
            addCriterion("hit >=", value, "hit");
            return (Criteria) this;
        }

        public Criteria andHitLessThan(Long value) {
            addCriterion("hit <", value, "hit");
            return (Criteria) this;
        }

        public Criteria andHitLessThanOrEqualTo(Long value) {
            addCriterion("hit <=", value, "hit");
            return (Criteria) this;
        }

        public Criteria andHitIn(List<Long> values) {
            addCriterion("hit in", values, "hit");
            return (Criteria) this;
        }

        public Criteria andHitNotIn(List<Long> values) {
            addCriterion("hit not in", values, "hit");
            return (Criteria) this;
        }

        public Criteria andHitBetween(Long value1, Long value2) {
            addCriterion("hit between", value1, value2, "hit");
            return (Criteria) this;
        }

        public Criteria andHitNotBetween(Long value1, Long value2) {
            addCriterion("hit not between", value1, value2, "hit");
            return (Criteria) this;
        }

        public Criteria andSkipInitIsNull() {
            addCriterion("skip_init is null");
            return (Criteria) this;
        }

        public Criteria andSkipInitIsNotNull() {
            addCriterion("skip_init is not null");
            return (Criteria) this;
        }

        public Criteria andSkipInitEqualTo(Long value) {
            addCriterion("skip_init =", value, "skipInit");
            return (Criteria) this;
        }

        public Criteria andSkipInitNotEqualTo(Long value) {
            addCriterion("skip_init <>", value, "skipInit");
            return (Criteria) this;
        }

        public Criteria andSkipInitGreaterThan(Long value) {
            addCriterion("skip_init >", value, "skipInit");
            return (Criteria) this;
        }

        public Criteria andSkipInitGreaterThanOrEqualTo(Long value) {
            addCriterion("skip_init >=", value, "skipInit");
            return (Criteria) this;
        }

        public Criteria andSkipInitLessThan(Long value) {
            addCriterion("skip_init <", value, "skipInit");
            return (Criteria) this;
        }

        public Criteria andSkipInitLessThanOrEqualTo(Long value) {
            addCriterion("skip_init <=", value, "skipInit");
            return (Criteria) this;
        }

        public Criteria andSkipInitIn(List<Long> values) {
            addCriterion("skip_init in", values, "skipInit");
            return (Criteria) this;
        }

        public Criteria andSkipInitNotIn(List<Long> values) {
            addCriterion("skip_init not in", values, "skipInit");
            return (Criteria) this;
        }

        public Criteria andSkipInitBetween(Long value1, Long value2) {
            addCriterion("skip_init between", value1, value2, "skipInit");
            return (Criteria) this;
        }

        public Criteria andSkipInitNotBetween(Long value1, Long value2) {
            addCriterion("skip_init not between", value1, value2, "skipInit");
            return (Criteria) this;
        }

        public Criteria andSkipNewIsNull() {
            addCriterion("skip_new is null");
            return (Criteria) this;
        }

        public Criteria andSkipNewIsNotNull() {
            addCriterion("skip_new is not null");
            return (Criteria) this;
        }

        public Criteria andSkipNewEqualTo(Long value) {
            addCriterion("skip_new =", value, "skipNew");
            return (Criteria) this;
        }

        public Criteria andSkipNewNotEqualTo(Long value) {
            addCriterion("skip_new <>", value, "skipNew");
            return (Criteria) this;
        }

        public Criteria andSkipNewGreaterThan(Long value) {
            addCriterion("skip_new >", value, "skipNew");
            return (Criteria) this;
        }

        public Criteria andSkipNewGreaterThanOrEqualTo(Long value) {
            addCriterion("skip_new >=", value, "skipNew");
            return (Criteria) this;
        }

        public Criteria andSkipNewLessThan(Long value) {
            addCriterion("skip_new <", value, "skipNew");
            return (Criteria) this;
        }

        public Criteria andSkipNewLessThanOrEqualTo(Long value) {
            addCriterion("skip_new <=", value, "skipNew");
            return (Criteria) this;
        }

        public Criteria andSkipNewIn(List<Long> values) {
            addCriterion("skip_new in", values, "skipNew");
            return (Criteria) this;
        }

        public Criteria andSkipNewNotIn(List<Long> values) {
            addCriterion("skip_new not in", values, "skipNew");
            return (Criteria) this;
        }

        public Criteria andSkipNewBetween(Long value1, Long value2) {
            addCriterion("skip_new between", value1, value2, "skipNew");
            return (Criteria) this;
        }

        public Criteria andSkipNewNotBetween(Long value1, Long value2) {
            addCriterion("skip_new not between", value1, value2, "skipNew");
            return (Criteria) this;
        }

        public Criteria andSkipFpwIsNull() {
            addCriterion("skip_fpw is null");
            return (Criteria) this;
        }

        public Criteria andSkipFpwIsNotNull() {
            addCriterion("skip_fpw is not null");
            return (Criteria) this;
        }

        public Criteria andSkipFpwEqualTo(Long value) {
            addCriterion("skip_fpw =", value, "skipFpw");
            return (Criteria) this;
        }

        public Criteria andSkipFpwNotEqualTo(Long value) {
            addCriterion("skip_fpw <>", value, "skipFpw");
            return (Criteria) this;
        }

        public Criteria andSkipFpwGreaterThan(Long value) {
            addCriterion("skip_fpw >", value, "skipFpw");
            return (Criteria) this;
        }

        public Criteria andSkipFpwGreaterThanOrEqualTo(Long value) {
            addCriterion("skip_fpw >=", value, "skipFpw");
            return (Criteria) this;
        }

        public Criteria andSkipFpwLessThan(Long value) {
            addCriterion("skip_fpw <", value, "skipFpw");
            return (Criteria) this;
        }

        public Criteria andSkipFpwLessThanOrEqualTo(Long value) {
            addCriterion("skip_fpw <=", value, "skipFpw");
            return (Criteria) this;
        }

        public Criteria andSkipFpwIn(List<Long> values) {
            addCriterion("skip_fpw in", values, "skipFpw");
            return (Criteria) this;
        }

        public Criteria andSkipFpwNotIn(List<Long> values) {
            addCriterion("skip_fpw not in", values, "skipFpw");
            return (Criteria) this;
        }

        public Criteria andSkipFpwBetween(Long value1, Long value2) {
            addCriterion("skip_fpw between", value1, value2, "skipFpw");
            return (Criteria) this;
        }

        public Criteria andSkipFpwNotBetween(Long value1, Long value2) {
            addCriterion("skip_fpw not between", value1, value2, "skipFpw");
            return (Criteria) this;
        }

        public Criteria andSkipRepIsNull() {
            addCriterion("skip_rep is null");
            return (Criteria) this;
        }

        public Criteria andSkipRepIsNotNull() {
            addCriterion("skip_rep is not null");
            return (Criteria) this;
        }

        public Criteria andSkipRepEqualTo(Long value) {
            addCriterion("skip_rep =", value, "skipRep");
            return (Criteria) this;
        }

        public Criteria andSkipRepNotEqualTo(Long value) {
            addCriterion("skip_rep <>", value, "skipRep");
            return (Criteria) this;
        }

        public Criteria andSkipRepGreaterThan(Long value) {
            addCriterion("skip_rep >", value, "skipRep");
            return (Criteria) this;
        }

        public Criteria andSkipRepGreaterThanOrEqualTo(Long value) {
            addCriterion("skip_rep >=", value, "skipRep");
            return (Criteria) this;
        }

        public Criteria andSkipRepLessThan(Long value) {
            addCriterion("skip_rep <", value, "skipRep");
            return (Criteria) this;
        }

        public Criteria andSkipRepLessThanOrEqualTo(Long value) {
            addCriterion("skip_rep <=", value, "skipRep");
            return (Criteria) this;
        }

        public Criteria andSkipRepIn(List<Long> values) {
            addCriterion("skip_rep in", values, "skipRep");
            return (Criteria) this;
        }

        public Criteria andSkipRepNotIn(List<Long> values) {
            addCriterion("skip_rep not in", values, "skipRep");
            return (Criteria) this;
        }

        public Criteria andSkipRepBetween(Long value1, Long value2) {
            addCriterion("skip_rep between", value1, value2, "skipRep");
            return (Criteria) this;
        }

        public Criteria andSkipRepNotBetween(Long value1, Long value2) {
            addCriterion("skip_rep not between", value1, value2, "skipRep");
            return (Criteria) this;
        }

        public Criteria andWalDistanceIsNull() {
            addCriterion("wal_distance is null");
            return (Criteria) this;
        }

        public Criteria andWalDistanceIsNotNull() {
            addCriterion("wal_distance is not null");
            return (Criteria) this;
        }

        public Criteria andWalDistanceEqualTo(Integer value) {
            addCriterion("wal_distance =", value, "walDistance");
            return (Criteria) this;
        }

        public Criteria andWalDistanceNotEqualTo(Integer value) {
            addCriterion("wal_distance <>", value, "walDistance");
            return (Criteria) this;
        }

        public Criteria andWalDistanceGreaterThan(Integer value) {
            addCriterion("wal_distance >", value, "walDistance");
            return (Criteria) this;
        }

        public Criteria andWalDistanceGreaterThanOrEqualTo(Integer value) {
            addCriterion("wal_distance >=", value, "walDistance");
            return (Criteria) this;
        }

        public Criteria andWalDistanceLessThan(Integer value) {
            addCriterion("wal_distance <", value, "walDistance");
            return (Criteria) this;
        }

        public Criteria andWalDistanceLessThanOrEqualTo(Integer value) {
            addCriterion("wal_distance <=", value, "walDistance");
            return (Criteria) this;
        }

        public Criteria andWalDistanceIn(List<Integer> values) {
            addCriterion("wal_distance in", values, "walDistance");
            return (Criteria) this;
        }

        public Criteria andWalDistanceNotIn(List<Integer> values) {
            addCriterion("wal_distance not in", values, "walDistance");
            return (Criteria) this;
        }

        public Criteria andWalDistanceBetween(Integer value1, Integer value2) {
            addCriterion("wal_distance between", value1, value2, "walDistance");
            return (Criteria) this;
        }

        public Criteria andWalDistanceNotBetween(Integer value1, Integer value2) {
            addCriterion("wal_distance not between", value1, value2, "walDistance");
            return (Criteria) this;
        }

        public Criteria andBlockDistanceIsNull() {
            addCriterion("block_distance is null");
            return (Criteria) this;
        }

        public Criteria andBlockDistanceIsNotNull() {
            addCriterion("block_distance is not null");
            return (Criteria) this;
        }

        public Criteria andBlockDistanceEqualTo(Integer value) {
            addCriterion("block_distance =", value, "blockDistance");
            return (Criteria) this;
        }

        public Criteria andBlockDistanceNotEqualTo(Integer value) {
            addCriterion("block_distance <>", value, "blockDistance");
            return (Criteria) this;
        }

        public Criteria andBlockDistanceGreaterThan(Integer value) {
            addCriterion("block_distance >", value, "blockDistance");
            return (Criteria) this;
        }

        public Criteria andBlockDistanceGreaterThanOrEqualTo(Integer value) {
            addCriterion("block_distance >=", value, "blockDistance");
            return (Criteria) this;
        }

        public Criteria andBlockDistanceLessThan(Integer value) {
            addCriterion("block_distance <", value, "blockDistance");
            return (Criteria) this;
        }

        public Criteria andBlockDistanceLessThanOrEqualTo(Integer value) {
            addCriterion("block_distance <=", value, "blockDistance");
            return (Criteria) this;
        }

        public Criteria andBlockDistanceIn(List<Integer> values) {
            addCriterion("block_distance in", values, "blockDistance");
            return (Criteria) this;
        }

        public Criteria andBlockDistanceNotIn(List<Integer> values) {
            addCriterion("block_distance not in", values, "blockDistance");
            return (Criteria) this;
        }

        public Criteria andBlockDistanceBetween(Integer value1, Integer value2) {
            addCriterion("block_distance between", value1, value2, "blockDistance");
            return (Criteria) this;
        }

        public Criteria andBlockDistanceNotBetween(Integer value1, Integer value2) {
            addCriterion("block_distance not between", value1, value2, "blockDistance");
            return (Criteria) this;
        }

        public Criteria andIoDepthIsNull() {
            addCriterion("io_depth is null");
            return (Criteria) this;
        }

        public Criteria andIoDepthIsNotNull() {
            addCriterion("io_depth is not null");
            return (Criteria) this;
        }

        public Criteria andIoDepthEqualTo(Integer value) {
            addCriterion("io_depth =", value, "ioDepth");
            return (Criteria) this;
        }

        public Criteria andIoDepthNotEqualTo(Integer value) {
            addCriterion("io_depth <>", value, "ioDepth");
            return (Criteria) this;
        }

        public Criteria andIoDepthGreaterThan(Integer value) {
            addCriterion("io_depth >", value, "ioDepth");
            return (Criteria) this;
        }

        public Criteria andIoDepthGreaterThanOrEqualTo(Integer value) {
            addCriterion("io_depth >=", value, "ioDepth");
            return (Criteria) this;
        }

        public Criteria andIoDepthLessThan(Integer value) {
            addCriterion("io_depth <", value, "ioDepth");
            return (Criteria) this;
        }

        public Criteria andIoDepthLessThanOrEqualTo(Integer value) {
            addCriterion("io_depth <=", value, "ioDepth");
            return (Criteria) this;
        }

        public Criteria andIoDepthIn(List<Integer> values) {
            addCriterion("io_depth in", values, "ioDepth");
            return (Criteria) this;
        }

        public Criteria andIoDepthNotIn(List<Integer> values) {
            addCriterion("io_depth not in", values, "ioDepth");
            return (Criteria) this;
        }

        public Criteria andIoDepthBetween(Integer value1, Integer value2) {
            addCriterion("io_depth between", value1, value2, "ioDepth");
            return (Criteria) this;
        }

        public Criteria andIoDepthNotBetween(Integer value1, Integer value2) {
            addCriterion("io_depth not between", value1, value2, "ioDepth");
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