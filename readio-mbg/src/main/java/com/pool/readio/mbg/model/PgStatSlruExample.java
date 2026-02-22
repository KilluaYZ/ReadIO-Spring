package com.pool.readio.mbg.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PgStatSlruExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PgStatSlruExample() {
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

        public Criteria andBlksZeroedIsNull() {
            addCriterion("blks_zeroed is null");
            return (Criteria) this;
        }

        public Criteria andBlksZeroedIsNotNull() {
            addCriterion("blks_zeroed is not null");
            return (Criteria) this;
        }

        public Criteria andBlksZeroedEqualTo(Long value) {
            addCriterion("blks_zeroed =", value, "blksZeroed");
            return (Criteria) this;
        }

        public Criteria andBlksZeroedNotEqualTo(Long value) {
            addCriterion("blks_zeroed <>", value, "blksZeroed");
            return (Criteria) this;
        }

        public Criteria andBlksZeroedGreaterThan(Long value) {
            addCriterion("blks_zeroed >", value, "blksZeroed");
            return (Criteria) this;
        }

        public Criteria andBlksZeroedGreaterThanOrEqualTo(Long value) {
            addCriterion("blks_zeroed >=", value, "blksZeroed");
            return (Criteria) this;
        }

        public Criteria andBlksZeroedLessThan(Long value) {
            addCriterion("blks_zeroed <", value, "blksZeroed");
            return (Criteria) this;
        }

        public Criteria andBlksZeroedLessThanOrEqualTo(Long value) {
            addCriterion("blks_zeroed <=", value, "blksZeroed");
            return (Criteria) this;
        }

        public Criteria andBlksZeroedIn(List<Long> values) {
            addCriterion("blks_zeroed in", values, "blksZeroed");
            return (Criteria) this;
        }

        public Criteria andBlksZeroedNotIn(List<Long> values) {
            addCriterion("blks_zeroed not in", values, "blksZeroed");
            return (Criteria) this;
        }

        public Criteria andBlksZeroedBetween(Long value1, Long value2) {
            addCriterion("blks_zeroed between", value1, value2, "blksZeroed");
            return (Criteria) this;
        }

        public Criteria andBlksZeroedNotBetween(Long value1, Long value2) {
            addCriterion("blks_zeroed not between", value1, value2, "blksZeroed");
            return (Criteria) this;
        }

        public Criteria andBlksHitIsNull() {
            addCriterion("blks_hit is null");
            return (Criteria) this;
        }

        public Criteria andBlksHitIsNotNull() {
            addCriterion("blks_hit is not null");
            return (Criteria) this;
        }

        public Criteria andBlksHitEqualTo(Long value) {
            addCriterion("blks_hit =", value, "blksHit");
            return (Criteria) this;
        }

        public Criteria andBlksHitNotEqualTo(Long value) {
            addCriterion("blks_hit <>", value, "blksHit");
            return (Criteria) this;
        }

        public Criteria andBlksHitGreaterThan(Long value) {
            addCriterion("blks_hit >", value, "blksHit");
            return (Criteria) this;
        }

        public Criteria andBlksHitGreaterThanOrEqualTo(Long value) {
            addCriterion("blks_hit >=", value, "blksHit");
            return (Criteria) this;
        }

        public Criteria andBlksHitLessThan(Long value) {
            addCriterion("blks_hit <", value, "blksHit");
            return (Criteria) this;
        }

        public Criteria andBlksHitLessThanOrEqualTo(Long value) {
            addCriterion("blks_hit <=", value, "blksHit");
            return (Criteria) this;
        }

        public Criteria andBlksHitIn(List<Long> values) {
            addCriterion("blks_hit in", values, "blksHit");
            return (Criteria) this;
        }

        public Criteria andBlksHitNotIn(List<Long> values) {
            addCriterion("blks_hit not in", values, "blksHit");
            return (Criteria) this;
        }

        public Criteria andBlksHitBetween(Long value1, Long value2) {
            addCriterion("blks_hit between", value1, value2, "blksHit");
            return (Criteria) this;
        }

        public Criteria andBlksHitNotBetween(Long value1, Long value2) {
            addCriterion("blks_hit not between", value1, value2, "blksHit");
            return (Criteria) this;
        }

        public Criteria andBlksReadIsNull() {
            addCriterion("blks_read is null");
            return (Criteria) this;
        }

        public Criteria andBlksReadIsNotNull() {
            addCriterion("blks_read is not null");
            return (Criteria) this;
        }

        public Criteria andBlksReadEqualTo(Long value) {
            addCriterion("blks_read =", value, "blksRead");
            return (Criteria) this;
        }

        public Criteria andBlksReadNotEqualTo(Long value) {
            addCriterion("blks_read <>", value, "blksRead");
            return (Criteria) this;
        }

        public Criteria andBlksReadGreaterThan(Long value) {
            addCriterion("blks_read >", value, "blksRead");
            return (Criteria) this;
        }

        public Criteria andBlksReadGreaterThanOrEqualTo(Long value) {
            addCriterion("blks_read >=", value, "blksRead");
            return (Criteria) this;
        }

        public Criteria andBlksReadLessThan(Long value) {
            addCriterion("blks_read <", value, "blksRead");
            return (Criteria) this;
        }

        public Criteria andBlksReadLessThanOrEqualTo(Long value) {
            addCriterion("blks_read <=", value, "blksRead");
            return (Criteria) this;
        }

        public Criteria andBlksReadIn(List<Long> values) {
            addCriterion("blks_read in", values, "blksRead");
            return (Criteria) this;
        }

        public Criteria andBlksReadNotIn(List<Long> values) {
            addCriterion("blks_read not in", values, "blksRead");
            return (Criteria) this;
        }

        public Criteria andBlksReadBetween(Long value1, Long value2) {
            addCriterion("blks_read between", value1, value2, "blksRead");
            return (Criteria) this;
        }

        public Criteria andBlksReadNotBetween(Long value1, Long value2) {
            addCriterion("blks_read not between", value1, value2, "blksRead");
            return (Criteria) this;
        }

        public Criteria andBlksWrittenIsNull() {
            addCriterion("blks_written is null");
            return (Criteria) this;
        }

        public Criteria andBlksWrittenIsNotNull() {
            addCriterion("blks_written is not null");
            return (Criteria) this;
        }

        public Criteria andBlksWrittenEqualTo(Long value) {
            addCriterion("blks_written =", value, "blksWritten");
            return (Criteria) this;
        }

        public Criteria andBlksWrittenNotEqualTo(Long value) {
            addCriterion("blks_written <>", value, "blksWritten");
            return (Criteria) this;
        }

        public Criteria andBlksWrittenGreaterThan(Long value) {
            addCriterion("blks_written >", value, "blksWritten");
            return (Criteria) this;
        }

        public Criteria andBlksWrittenGreaterThanOrEqualTo(Long value) {
            addCriterion("blks_written >=", value, "blksWritten");
            return (Criteria) this;
        }

        public Criteria andBlksWrittenLessThan(Long value) {
            addCriterion("blks_written <", value, "blksWritten");
            return (Criteria) this;
        }

        public Criteria andBlksWrittenLessThanOrEqualTo(Long value) {
            addCriterion("blks_written <=", value, "blksWritten");
            return (Criteria) this;
        }

        public Criteria andBlksWrittenIn(List<Long> values) {
            addCriterion("blks_written in", values, "blksWritten");
            return (Criteria) this;
        }

        public Criteria andBlksWrittenNotIn(List<Long> values) {
            addCriterion("blks_written not in", values, "blksWritten");
            return (Criteria) this;
        }

        public Criteria andBlksWrittenBetween(Long value1, Long value2) {
            addCriterion("blks_written between", value1, value2, "blksWritten");
            return (Criteria) this;
        }

        public Criteria andBlksWrittenNotBetween(Long value1, Long value2) {
            addCriterion("blks_written not between", value1, value2, "blksWritten");
            return (Criteria) this;
        }

        public Criteria andBlksExistsIsNull() {
            addCriterion("blks_exists is null");
            return (Criteria) this;
        }

        public Criteria andBlksExistsIsNotNull() {
            addCriterion("blks_exists is not null");
            return (Criteria) this;
        }

        public Criteria andBlksExistsEqualTo(Long value) {
            addCriterion("blks_exists =", value, "blksExists");
            return (Criteria) this;
        }

        public Criteria andBlksExistsNotEqualTo(Long value) {
            addCriterion("blks_exists <>", value, "blksExists");
            return (Criteria) this;
        }

        public Criteria andBlksExistsGreaterThan(Long value) {
            addCriterion("blks_exists >", value, "blksExists");
            return (Criteria) this;
        }

        public Criteria andBlksExistsGreaterThanOrEqualTo(Long value) {
            addCriterion("blks_exists >=", value, "blksExists");
            return (Criteria) this;
        }

        public Criteria andBlksExistsLessThan(Long value) {
            addCriterion("blks_exists <", value, "blksExists");
            return (Criteria) this;
        }

        public Criteria andBlksExistsLessThanOrEqualTo(Long value) {
            addCriterion("blks_exists <=", value, "blksExists");
            return (Criteria) this;
        }

        public Criteria andBlksExistsIn(List<Long> values) {
            addCriterion("blks_exists in", values, "blksExists");
            return (Criteria) this;
        }

        public Criteria andBlksExistsNotIn(List<Long> values) {
            addCriterion("blks_exists not in", values, "blksExists");
            return (Criteria) this;
        }

        public Criteria andBlksExistsBetween(Long value1, Long value2) {
            addCriterion("blks_exists between", value1, value2, "blksExists");
            return (Criteria) this;
        }

        public Criteria andBlksExistsNotBetween(Long value1, Long value2) {
            addCriterion("blks_exists not between", value1, value2, "blksExists");
            return (Criteria) this;
        }

        public Criteria andFlushesIsNull() {
            addCriterion("flushes is null");
            return (Criteria) this;
        }

        public Criteria andFlushesIsNotNull() {
            addCriterion("flushes is not null");
            return (Criteria) this;
        }

        public Criteria andFlushesEqualTo(Long value) {
            addCriterion("flushes =", value, "flushes");
            return (Criteria) this;
        }

        public Criteria andFlushesNotEqualTo(Long value) {
            addCriterion("flushes <>", value, "flushes");
            return (Criteria) this;
        }

        public Criteria andFlushesGreaterThan(Long value) {
            addCriterion("flushes >", value, "flushes");
            return (Criteria) this;
        }

        public Criteria andFlushesGreaterThanOrEqualTo(Long value) {
            addCriterion("flushes >=", value, "flushes");
            return (Criteria) this;
        }

        public Criteria andFlushesLessThan(Long value) {
            addCriterion("flushes <", value, "flushes");
            return (Criteria) this;
        }

        public Criteria andFlushesLessThanOrEqualTo(Long value) {
            addCriterion("flushes <=", value, "flushes");
            return (Criteria) this;
        }

        public Criteria andFlushesIn(List<Long> values) {
            addCriterion("flushes in", values, "flushes");
            return (Criteria) this;
        }

        public Criteria andFlushesNotIn(List<Long> values) {
            addCriterion("flushes not in", values, "flushes");
            return (Criteria) this;
        }

        public Criteria andFlushesBetween(Long value1, Long value2) {
            addCriterion("flushes between", value1, value2, "flushes");
            return (Criteria) this;
        }

        public Criteria andFlushesNotBetween(Long value1, Long value2) {
            addCriterion("flushes not between", value1, value2, "flushes");
            return (Criteria) this;
        }

        public Criteria andTruncatesIsNull() {
            addCriterion("truncates is null");
            return (Criteria) this;
        }

        public Criteria andTruncatesIsNotNull() {
            addCriterion("truncates is not null");
            return (Criteria) this;
        }

        public Criteria andTruncatesEqualTo(Long value) {
            addCriterion("truncates =", value, "truncates");
            return (Criteria) this;
        }

        public Criteria andTruncatesNotEqualTo(Long value) {
            addCriterion("truncates <>", value, "truncates");
            return (Criteria) this;
        }

        public Criteria andTruncatesGreaterThan(Long value) {
            addCriterion("truncates >", value, "truncates");
            return (Criteria) this;
        }

        public Criteria andTruncatesGreaterThanOrEqualTo(Long value) {
            addCriterion("truncates >=", value, "truncates");
            return (Criteria) this;
        }

        public Criteria andTruncatesLessThan(Long value) {
            addCriterion("truncates <", value, "truncates");
            return (Criteria) this;
        }

        public Criteria andTruncatesLessThanOrEqualTo(Long value) {
            addCriterion("truncates <=", value, "truncates");
            return (Criteria) this;
        }

        public Criteria andTruncatesIn(List<Long> values) {
            addCriterion("truncates in", values, "truncates");
            return (Criteria) this;
        }

        public Criteria andTruncatesNotIn(List<Long> values) {
            addCriterion("truncates not in", values, "truncates");
            return (Criteria) this;
        }

        public Criteria andTruncatesBetween(Long value1, Long value2) {
            addCriterion("truncates between", value1, value2, "truncates");
            return (Criteria) this;
        }

        public Criteria andTruncatesNotBetween(Long value1, Long value2) {
            addCriterion("truncates not between", value1, value2, "truncates");
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