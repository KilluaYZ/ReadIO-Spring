package com.pool.readio.mbg.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PgStatReplicationSlotsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PgStatReplicationSlotsExample() {
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

        public Criteria andSlotNameIsNull() {
            addCriterion("slot_name is null");
            return (Criteria) this;
        }

        public Criteria andSlotNameIsNotNull() {
            addCriterion("slot_name is not null");
            return (Criteria) this;
        }

        public Criteria andSlotNameEqualTo(String value) {
            addCriterion("slot_name =", value, "slotName");
            return (Criteria) this;
        }

        public Criteria andSlotNameNotEqualTo(String value) {
            addCriterion("slot_name <>", value, "slotName");
            return (Criteria) this;
        }

        public Criteria andSlotNameGreaterThan(String value) {
            addCriterion("slot_name >", value, "slotName");
            return (Criteria) this;
        }

        public Criteria andSlotNameGreaterThanOrEqualTo(String value) {
            addCriterion("slot_name >=", value, "slotName");
            return (Criteria) this;
        }

        public Criteria andSlotNameLessThan(String value) {
            addCriterion("slot_name <", value, "slotName");
            return (Criteria) this;
        }

        public Criteria andSlotNameLessThanOrEqualTo(String value) {
            addCriterion("slot_name <=", value, "slotName");
            return (Criteria) this;
        }

        public Criteria andSlotNameLike(String value) {
            addCriterion("slot_name like", value, "slotName");
            return (Criteria) this;
        }

        public Criteria andSlotNameNotLike(String value) {
            addCriterion("slot_name not like", value, "slotName");
            return (Criteria) this;
        }

        public Criteria andSlotNameIn(List<String> values) {
            addCriterion("slot_name in", values, "slotName");
            return (Criteria) this;
        }

        public Criteria andSlotNameNotIn(List<String> values) {
            addCriterion("slot_name not in", values, "slotName");
            return (Criteria) this;
        }

        public Criteria andSlotNameBetween(String value1, String value2) {
            addCriterion("slot_name between", value1, value2, "slotName");
            return (Criteria) this;
        }

        public Criteria andSlotNameNotBetween(String value1, String value2) {
            addCriterion("slot_name not between", value1, value2, "slotName");
            return (Criteria) this;
        }

        public Criteria andSpillTxnsIsNull() {
            addCriterion("spill_txns is null");
            return (Criteria) this;
        }

        public Criteria andSpillTxnsIsNotNull() {
            addCriterion("spill_txns is not null");
            return (Criteria) this;
        }

        public Criteria andSpillTxnsEqualTo(Long value) {
            addCriterion("spill_txns =", value, "spillTxns");
            return (Criteria) this;
        }

        public Criteria andSpillTxnsNotEqualTo(Long value) {
            addCriterion("spill_txns <>", value, "spillTxns");
            return (Criteria) this;
        }

        public Criteria andSpillTxnsGreaterThan(Long value) {
            addCriterion("spill_txns >", value, "spillTxns");
            return (Criteria) this;
        }

        public Criteria andSpillTxnsGreaterThanOrEqualTo(Long value) {
            addCriterion("spill_txns >=", value, "spillTxns");
            return (Criteria) this;
        }

        public Criteria andSpillTxnsLessThan(Long value) {
            addCriterion("spill_txns <", value, "spillTxns");
            return (Criteria) this;
        }

        public Criteria andSpillTxnsLessThanOrEqualTo(Long value) {
            addCriterion("spill_txns <=", value, "spillTxns");
            return (Criteria) this;
        }

        public Criteria andSpillTxnsIn(List<Long> values) {
            addCriterion("spill_txns in", values, "spillTxns");
            return (Criteria) this;
        }

        public Criteria andSpillTxnsNotIn(List<Long> values) {
            addCriterion("spill_txns not in", values, "spillTxns");
            return (Criteria) this;
        }

        public Criteria andSpillTxnsBetween(Long value1, Long value2) {
            addCriterion("spill_txns between", value1, value2, "spillTxns");
            return (Criteria) this;
        }

        public Criteria andSpillTxnsNotBetween(Long value1, Long value2) {
            addCriterion("spill_txns not between", value1, value2, "spillTxns");
            return (Criteria) this;
        }

        public Criteria andSpillCountIsNull() {
            addCriterion("spill_count is null");
            return (Criteria) this;
        }

        public Criteria andSpillCountIsNotNull() {
            addCriterion("spill_count is not null");
            return (Criteria) this;
        }

        public Criteria andSpillCountEqualTo(Long value) {
            addCriterion("spill_count =", value, "spillCount");
            return (Criteria) this;
        }

        public Criteria andSpillCountNotEqualTo(Long value) {
            addCriterion("spill_count <>", value, "spillCount");
            return (Criteria) this;
        }

        public Criteria andSpillCountGreaterThan(Long value) {
            addCriterion("spill_count >", value, "spillCount");
            return (Criteria) this;
        }

        public Criteria andSpillCountGreaterThanOrEqualTo(Long value) {
            addCriterion("spill_count >=", value, "spillCount");
            return (Criteria) this;
        }

        public Criteria andSpillCountLessThan(Long value) {
            addCriterion("spill_count <", value, "spillCount");
            return (Criteria) this;
        }

        public Criteria andSpillCountLessThanOrEqualTo(Long value) {
            addCriterion("spill_count <=", value, "spillCount");
            return (Criteria) this;
        }

        public Criteria andSpillCountIn(List<Long> values) {
            addCriterion("spill_count in", values, "spillCount");
            return (Criteria) this;
        }

        public Criteria andSpillCountNotIn(List<Long> values) {
            addCriterion("spill_count not in", values, "spillCount");
            return (Criteria) this;
        }

        public Criteria andSpillCountBetween(Long value1, Long value2) {
            addCriterion("spill_count between", value1, value2, "spillCount");
            return (Criteria) this;
        }

        public Criteria andSpillCountNotBetween(Long value1, Long value2) {
            addCriterion("spill_count not between", value1, value2, "spillCount");
            return (Criteria) this;
        }

        public Criteria andSpillBytesIsNull() {
            addCriterion("spill_bytes is null");
            return (Criteria) this;
        }

        public Criteria andSpillBytesIsNotNull() {
            addCriterion("spill_bytes is not null");
            return (Criteria) this;
        }

        public Criteria andSpillBytesEqualTo(Long value) {
            addCriterion("spill_bytes =", value, "spillBytes");
            return (Criteria) this;
        }

        public Criteria andSpillBytesNotEqualTo(Long value) {
            addCriterion("spill_bytes <>", value, "spillBytes");
            return (Criteria) this;
        }

        public Criteria andSpillBytesGreaterThan(Long value) {
            addCriterion("spill_bytes >", value, "spillBytes");
            return (Criteria) this;
        }

        public Criteria andSpillBytesGreaterThanOrEqualTo(Long value) {
            addCriterion("spill_bytes >=", value, "spillBytes");
            return (Criteria) this;
        }

        public Criteria andSpillBytesLessThan(Long value) {
            addCriterion("spill_bytes <", value, "spillBytes");
            return (Criteria) this;
        }

        public Criteria andSpillBytesLessThanOrEqualTo(Long value) {
            addCriterion("spill_bytes <=", value, "spillBytes");
            return (Criteria) this;
        }

        public Criteria andSpillBytesIn(List<Long> values) {
            addCriterion("spill_bytes in", values, "spillBytes");
            return (Criteria) this;
        }

        public Criteria andSpillBytesNotIn(List<Long> values) {
            addCriterion("spill_bytes not in", values, "spillBytes");
            return (Criteria) this;
        }

        public Criteria andSpillBytesBetween(Long value1, Long value2) {
            addCriterion("spill_bytes between", value1, value2, "spillBytes");
            return (Criteria) this;
        }

        public Criteria andSpillBytesNotBetween(Long value1, Long value2) {
            addCriterion("spill_bytes not between", value1, value2, "spillBytes");
            return (Criteria) this;
        }

        public Criteria andStreamTxnsIsNull() {
            addCriterion("stream_txns is null");
            return (Criteria) this;
        }

        public Criteria andStreamTxnsIsNotNull() {
            addCriterion("stream_txns is not null");
            return (Criteria) this;
        }

        public Criteria andStreamTxnsEqualTo(Long value) {
            addCriterion("stream_txns =", value, "streamTxns");
            return (Criteria) this;
        }

        public Criteria andStreamTxnsNotEqualTo(Long value) {
            addCriterion("stream_txns <>", value, "streamTxns");
            return (Criteria) this;
        }

        public Criteria andStreamTxnsGreaterThan(Long value) {
            addCriterion("stream_txns >", value, "streamTxns");
            return (Criteria) this;
        }

        public Criteria andStreamTxnsGreaterThanOrEqualTo(Long value) {
            addCriterion("stream_txns >=", value, "streamTxns");
            return (Criteria) this;
        }

        public Criteria andStreamTxnsLessThan(Long value) {
            addCriterion("stream_txns <", value, "streamTxns");
            return (Criteria) this;
        }

        public Criteria andStreamTxnsLessThanOrEqualTo(Long value) {
            addCriterion("stream_txns <=", value, "streamTxns");
            return (Criteria) this;
        }

        public Criteria andStreamTxnsIn(List<Long> values) {
            addCriterion("stream_txns in", values, "streamTxns");
            return (Criteria) this;
        }

        public Criteria andStreamTxnsNotIn(List<Long> values) {
            addCriterion("stream_txns not in", values, "streamTxns");
            return (Criteria) this;
        }

        public Criteria andStreamTxnsBetween(Long value1, Long value2) {
            addCriterion("stream_txns between", value1, value2, "streamTxns");
            return (Criteria) this;
        }

        public Criteria andStreamTxnsNotBetween(Long value1, Long value2) {
            addCriterion("stream_txns not between", value1, value2, "streamTxns");
            return (Criteria) this;
        }

        public Criteria andStreamCountIsNull() {
            addCriterion("stream_count is null");
            return (Criteria) this;
        }

        public Criteria andStreamCountIsNotNull() {
            addCriterion("stream_count is not null");
            return (Criteria) this;
        }

        public Criteria andStreamCountEqualTo(Long value) {
            addCriterion("stream_count =", value, "streamCount");
            return (Criteria) this;
        }

        public Criteria andStreamCountNotEqualTo(Long value) {
            addCriterion("stream_count <>", value, "streamCount");
            return (Criteria) this;
        }

        public Criteria andStreamCountGreaterThan(Long value) {
            addCriterion("stream_count >", value, "streamCount");
            return (Criteria) this;
        }

        public Criteria andStreamCountGreaterThanOrEqualTo(Long value) {
            addCriterion("stream_count >=", value, "streamCount");
            return (Criteria) this;
        }

        public Criteria andStreamCountLessThan(Long value) {
            addCriterion("stream_count <", value, "streamCount");
            return (Criteria) this;
        }

        public Criteria andStreamCountLessThanOrEqualTo(Long value) {
            addCriterion("stream_count <=", value, "streamCount");
            return (Criteria) this;
        }

        public Criteria andStreamCountIn(List<Long> values) {
            addCriterion("stream_count in", values, "streamCount");
            return (Criteria) this;
        }

        public Criteria andStreamCountNotIn(List<Long> values) {
            addCriterion("stream_count not in", values, "streamCount");
            return (Criteria) this;
        }

        public Criteria andStreamCountBetween(Long value1, Long value2) {
            addCriterion("stream_count between", value1, value2, "streamCount");
            return (Criteria) this;
        }

        public Criteria andStreamCountNotBetween(Long value1, Long value2) {
            addCriterion("stream_count not between", value1, value2, "streamCount");
            return (Criteria) this;
        }

        public Criteria andStreamBytesIsNull() {
            addCriterion("stream_bytes is null");
            return (Criteria) this;
        }

        public Criteria andStreamBytesIsNotNull() {
            addCriterion("stream_bytes is not null");
            return (Criteria) this;
        }

        public Criteria andStreamBytesEqualTo(Long value) {
            addCriterion("stream_bytes =", value, "streamBytes");
            return (Criteria) this;
        }

        public Criteria andStreamBytesNotEqualTo(Long value) {
            addCriterion("stream_bytes <>", value, "streamBytes");
            return (Criteria) this;
        }

        public Criteria andStreamBytesGreaterThan(Long value) {
            addCriterion("stream_bytes >", value, "streamBytes");
            return (Criteria) this;
        }

        public Criteria andStreamBytesGreaterThanOrEqualTo(Long value) {
            addCriterion("stream_bytes >=", value, "streamBytes");
            return (Criteria) this;
        }

        public Criteria andStreamBytesLessThan(Long value) {
            addCriterion("stream_bytes <", value, "streamBytes");
            return (Criteria) this;
        }

        public Criteria andStreamBytesLessThanOrEqualTo(Long value) {
            addCriterion("stream_bytes <=", value, "streamBytes");
            return (Criteria) this;
        }

        public Criteria andStreamBytesIn(List<Long> values) {
            addCriterion("stream_bytes in", values, "streamBytes");
            return (Criteria) this;
        }

        public Criteria andStreamBytesNotIn(List<Long> values) {
            addCriterion("stream_bytes not in", values, "streamBytes");
            return (Criteria) this;
        }

        public Criteria andStreamBytesBetween(Long value1, Long value2) {
            addCriterion("stream_bytes between", value1, value2, "streamBytes");
            return (Criteria) this;
        }

        public Criteria andStreamBytesNotBetween(Long value1, Long value2) {
            addCriterion("stream_bytes not between", value1, value2, "streamBytes");
            return (Criteria) this;
        }

        public Criteria andTotalTxnsIsNull() {
            addCriterion("total_txns is null");
            return (Criteria) this;
        }

        public Criteria andTotalTxnsIsNotNull() {
            addCriterion("total_txns is not null");
            return (Criteria) this;
        }

        public Criteria andTotalTxnsEqualTo(Long value) {
            addCriterion("total_txns =", value, "totalTxns");
            return (Criteria) this;
        }

        public Criteria andTotalTxnsNotEqualTo(Long value) {
            addCriterion("total_txns <>", value, "totalTxns");
            return (Criteria) this;
        }

        public Criteria andTotalTxnsGreaterThan(Long value) {
            addCriterion("total_txns >", value, "totalTxns");
            return (Criteria) this;
        }

        public Criteria andTotalTxnsGreaterThanOrEqualTo(Long value) {
            addCriterion("total_txns >=", value, "totalTxns");
            return (Criteria) this;
        }

        public Criteria andTotalTxnsLessThan(Long value) {
            addCriterion("total_txns <", value, "totalTxns");
            return (Criteria) this;
        }

        public Criteria andTotalTxnsLessThanOrEqualTo(Long value) {
            addCriterion("total_txns <=", value, "totalTxns");
            return (Criteria) this;
        }

        public Criteria andTotalTxnsIn(List<Long> values) {
            addCriterion("total_txns in", values, "totalTxns");
            return (Criteria) this;
        }

        public Criteria andTotalTxnsNotIn(List<Long> values) {
            addCriterion("total_txns not in", values, "totalTxns");
            return (Criteria) this;
        }

        public Criteria andTotalTxnsBetween(Long value1, Long value2) {
            addCriterion("total_txns between", value1, value2, "totalTxns");
            return (Criteria) this;
        }

        public Criteria andTotalTxnsNotBetween(Long value1, Long value2) {
            addCriterion("total_txns not between", value1, value2, "totalTxns");
            return (Criteria) this;
        }

        public Criteria andTotalBytesIsNull() {
            addCriterion("total_bytes is null");
            return (Criteria) this;
        }

        public Criteria andTotalBytesIsNotNull() {
            addCriterion("total_bytes is not null");
            return (Criteria) this;
        }

        public Criteria andTotalBytesEqualTo(Long value) {
            addCriterion("total_bytes =", value, "totalBytes");
            return (Criteria) this;
        }

        public Criteria andTotalBytesNotEqualTo(Long value) {
            addCriterion("total_bytes <>", value, "totalBytes");
            return (Criteria) this;
        }

        public Criteria andTotalBytesGreaterThan(Long value) {
            addCriterion("total_bytes >", value, "totalBytes");
            return (Criteria) this;
        }

        public Criteria andTotalBytesGreaterThanOrEqualTo(Long value) {
            addCriterion("total_bytes >=", value, "totalBytes");
            return (Criteria) this;
        }

        public Criteria andTotalBytesLessThan(Long value) {
            addCriterion("total_bytes <", value, "totalBytes");
            return (Criteria) this;
        }

        public Criteria andTotalBytesLessThanOrEqualTo(Long value) {
            addCriterion("total_bytes <=", value, "totalBytes");
            return (Criteria) this;
        }

        public Criteria andTotalBytesIn(List<Long> values) {
            addCriterion("total_bytes in", values, "totalBytes");
            return (Criteria) this;
        }

        public Criteria andTotalBytesNotIn(List<Long> values) {
            addCriterion("total_bytes not in", values, "totalBytes");
            return (Criteria) this;
        }

        public Criteria andTotalBytesBetween(Long value1, Long value2) {
            addCriterion("total_bytes between", value1, value2, "totalBytes");
            return (Criteria) this;
        }

        public Criteria andTotalBytesNotBetween(Long value1, Long value2) {
            addCriterion("total_bytes not between", value1, value2, "totalBytes");
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