package com.pool.readio.readiombg.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PgStatWalExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PgStatWalExample() {
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

        public Criteria andWalRecordsIsNull() {
            addCriterion("wal_records is null");
            return (Criteria) this;
        }

        public Criteria andWalRecordsIsNotNull() {
            addCriterion("wal_records is not null");
            return (Criteria) this;
        }

        public Criteria andWalRecordsEqualTo(Long value) {
            addCriterion("wal_records =", value, "walRecords");
            return (Criteria) this;
        }

        public Criteria andWalRecordsNotEqualTo(Long value) {
            addCriterion("wal_records <>", value, "walRecords");
            return (Criteria) this;
        }

        public Criteria andWalRecordsGreaterThan(Long value) {
            addCriterion("wal_records >", value, "walRecords");
            return (Criteria) this;
        }

        public Criteria andWalRecordsGreaterThanOrEqualTo(Long value) {
            addCriterion("wal_records >=", value, "walRecords");
            return (Criteria) this;
        }

        public Criteria andWalRecordsLessThan(Long value) {
            addCriterion("wal_records <", value, "walRecords");
            return (Criteria) this;
        }

        public Criteria andWalRecordsLessThanOrEqualTo(Long value) {
            addCriterion("wal_records <=", value, "walRecords");
            return (Criteria) this;
        }

        public Criteria andWalRecordsIn(List<Long> values) {
            addCriterion("wal_records in", values, "walRecords");
            return (Criteria) this;
        }

        public Criteria andWalRecordsNotIn(List<Long> values) {
            addCriterion("wal_records not in", values, "walRecords");
            return (Criteria) this;
        }

        public Criteria andWalRecordsBetween(Long value1, Long value2) {
            addCriterion("wal_records between", value1, value2, "walRecords");
            return (Criteria) this;
        }

        public Criteria andWalRecordsNotBetween(Long value1, Long value2) {
            addCriterion("wal_records not between", value1, value2, "walRecords");
            return (Criteria) this;
        }

        public Criteria andWalFpiIsNull() {
            addCriterion("wal_fpi is null");
            return (Criteria) this;
        }

        public Criteria andWalFpiIsNotNull() {
            addCriterion("wal_fpi is not null");
            return (Criteria) this;
        }

        public Criteria andWalFpiEqualTo(Long value) {
            addCriterion("wal_fpi =", value, "walFpi");
            return (Criteria) this;
        }

        public Criteria andWalFpiNotEqualTo(Long value) {
            addCriterion("wal_fpi <>", value, "walFpi");
            return (Criteria) this;
        }

        public Criteria andWalFpiGreaterThan(Long value) {
            addCriterion("wal_fpi >", value, "walFpi");
            return (Criteria) this;
        }

        public Criteria andWalFpiGreaterThanOrEqualTo(Long value) {
            addCriterion("wal_fpi >=", value, "walFpi");
            return (Criteria) this;
        }

        public Criteria andWalFpiLessThan(Long value) {
            addCriterion("wal_fpi <", value, "walFpi");
            return (Criteria) this;
        }

        public Criteria andWalFpiLessThanOrEqualTo(Long value) {
            addCriterion("wal_fpi <=", value, "walFpi");
            return (Criteria) this;
        }

        public Criteria andWalFpiIn(List<Long> values) {
            addCriterion("wal_fpi in", values, "walFpi");
            return (Criteria) this;
        }

        public Criteria andWalFpiNotIn(List<Long> values) {
            addCriterion("wal_fpi not in", values, "walFpi");
            return (Criteria) this;
        }

        public Criteria andWalFpiBetween(Long value1, Long value2) {
            addCriterion("wal_fpi between", value1, value2, "walFpi");
            return (Criteria) this;
        }

        public Criteria andWalFpiNotBetween(Long value1, Long value2) {
            addCriterion("wal_fpi not between", value1, value2, "walFpi");
            return (Criteria) this;
        }

        public Criteria andWalBytesIsNull() {
            addCriterion("wal_bytes is null");
            return (Criteria) this;
        }

        public Criteria andWalBytesIsNotNull() {
            addCriterion("wal_bytes is not null");
            return (Criteria) this;
        }

        public Criteria andWalBytesEqualTo(Short value) {
            addCriterion("wal_bytes =", value, "walBytes");
            return (Criteria) this;
        }

        public Criteria andWalBytesNotEqualTo(Short value) {
            addCriterion("wal_bytes <>", value, "walBytes");
            return (Criteria) this;
        }

        public Criteria andWalBytesGreaterThan(Short value) {
            addCriterion("wal_bytes >", value, "walBytes");
            return (Criteria) this;
        }

        public Criteria andWalBytesGreaterThanOrEqualTo(Short value) {
            addCriterion("wal_bytes >=", value, "walBytes");
            return (Criteria) this;
        }

        public Criteria andWalBytesLessThan(Short value) {
            addCriterion("wal_bytes <", value, "walBytes");
            return (Criteria) this;
        }

        public Criteria andWalBytesLessThanOrEqualTo(Short value) {
            addCriterion("wal_bytes <=", value, "walBytes");
            return (Criteria) this;
        }

        public Criteria andWalBytesIn(List<Short> values) {
            addCriterion("wal_bytes in", values, "walBytes");
            return (Criteria) this;
        }

        public Criteria andWalBytesNotIn(List<Short> values) {
            addCriterion("wal_bytes not in", values, "walBytes");
            return (Criteria) this;
        }

        public Criteria andWalBytesBetween(Short value1, Short value2) {
            addCriterion("wal_bytes between", value1, value2, "walBytes");
            return (Criteria) this;
        }

        public Criteria andWalBytesNotBetween(Short value1, Short value2) {
            addCriterion("wal_bytes not between", value1, value2, "walBytes");
            return (Criteria) this;
        }

        public Criteria andWalBuffersFullIsNull() {
            addCriterion("wal_buffers_full is null");
            return (Criteria) this;
        }

        public Criteria andWalBuffersFullIsNotNull() {
            addCriterion("wal_buffers_full is not null");
            return (Criteria) this;
        }

        public Criteria andWalBuffersFullEqualTo(Long value) {
            addCriterion("wal_buffers_full =", value, "walBuffersFull");
            return (Criteria) this;
        }

        public Criteria andWalBuffersFullNotEqualTo(Long value) {
            addCriterion("wal_buffers_full <>", value, "walBuffersFull");
            return (Criteria) this;
        }

        public Criteria andWalBuffersFullGreaterThan(Long value) {
            addCriterion("wal_buffers_full >", value, "walBuffersFull");
            return (Criteria) this;
        }

        public Criteria andWalBuffersFullGreaterThanOrEqualTo(Long value) {
            addCriterion("wal_buffers_full >=", value, "walBuffersFull");
            return (Criteria) this;
        }

        public Criteria andWalBuffersFullLessThan(Long value) {
            addCriterion("wal_buffers_full <", value, "walBuffersFull");
            return (Criteria) this;
        }

        public Criteria andWalBuffersFullLessThanOrEqualTo(Long value) {
            addCriterion("wal_buffers_full <=", value, "walBuffersFull");
            return (Criteria) this;
        }

        public Criteria andWalBuffersFullIn(List<Long> values) {
            addCriterion("wal_buffers_full in", values, "walBuffersFull");
            return (Criteria) this;
        }

        public Criteria andWalBuffersFullNotIn(List<Long> values) {
            addCriterion("wal_buffers_full not in", values, "walBuffersFull");
            return (Criteria) this;
        }

        public Criteria andWalBuffersFullBetween(Long value1, Long value2) {
            addCriterion("wal_buffers_full between", value1, value2, "walBuffersFull");
            return (Criteria) this;
        }

        public Criteria andWalBuffersFullNotBetween(Long value1, Long value2) {
            addCriterion("wal_buffers_full not between", value1, value2, "walBuffersFull");
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