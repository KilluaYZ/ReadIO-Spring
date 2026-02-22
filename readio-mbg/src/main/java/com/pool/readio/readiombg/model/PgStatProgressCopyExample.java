package com.pool.readio.readiombg.model;

import java.util.ArrayList;
import java.util.List;

public class PgStatProgressCopyExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PgStatProgressCopyExample() {
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

        public Criteria andPidIsNull() {
            addCriterion("pid is null");
            return (Criteria) this;
        }

        public Criteria andPidIsNotNull() {
            addCriterion("pid is not null");
            return (Criteria) this;
        }

        public Criteria andPidEqualTo(Integer value) {
            addCriterion("pid =", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidNotEqualTo(Integer value) {
            addCriterion("pid <>", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidGreaterThan(Integer value) {
            addCriterion("pid >", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidGreaterThanOrEqualTo(Integer value) {
            addCriterion("pid >=", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidLessThan(Integer value) {
            addCriterion("pid <", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidLessThanOrEqualTo(Integer value) {
            addCriterion("pid <=", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidIn(List<Integer> values) {
            addCriterion("pid in", values, "pid");
            return (Criteria) this;
        }

        public Criteria andPidNotIn(List<Integer> values) {
            addCriterion("pid not in", values, "pid");
            return (Criteria) this;
        }

        public Criteria andPidBetween(Integer value1, Integer value2) {
            addCriterion("pid between", value1, value2, "pid");
            return (Criteria) this;
        }

        public Criteria andPidNotBetween(Integer value1, Integer value2) {
            addCriterion("pid not between", value1, value2, "pid");
            return (Criteria) this;
        }

        public Criteria andDatidIsNull() {
            addCriterion("datid is null");
            return (Criteria) this;
        }

        public Criteria andDatidIsNotNull() {
            addCriterion("datid is not null");
            return (Criteria) this;
        }

        public Criteria andDatidEqualTo(Long value) {
            addCriterion("datid =", value, "datid");
            return (Criteria) this;
        }

        public Criteria andDatidNotEqualTo(Long value) {
            addCriterion("datid <>", value, "datid");
            return (Criteria) this;
        }

        public Criteria andDatidGreaterThan(Long value) {
            addCriterion("datid >", value, "datid");
            return (Criteria) this;
        }

        public Criteria andDatidGreaterThanOrEqualTo(Long value) {
            addCriterion("datid >=", value, "datid");
            return (Criteria) this;
        }

        public Criteria andDatidLessThan(Long value) {
            addCriterion("datid <", value, "datid");
            return (Criteria) this;
        }

        public Criteria andDatidLessThanOrEqualTo(Long value) {
            addCriterion("datid <=", value, "datid");
            return (Criteria) this;
        }

        public Criteria andDatidIn(List<Long> values) {
            addCriterion("datid in", values, "datid");
            return (Criteria) this;
        }

        public Criteria andDatidNotIn(List<Long> values) {
            addCriterion("datid not in", values, "datid");
            return (Criteria) this;
        }

        public Criteria andDatidBetween(Long value1, Long value2) {
            addCriterion("datid between", value1, value2, "datid");
            return (Criteria) this;
        }

        public Criteria andDatidNotBetween(Long value1, Long value2) {
            addCriterion("datid not between", value1, value2, "datid");
            return (Criteria) this;
        }

        public Criteria andDatnameIsNull() {
            addCriterion("datname is null");
            return (Criteria) this;
        }

        public Criteria andDatnameIsNotNull() {
            addCriterion("datname is not null");
            return (Criteria) this;
        }

        public Criteria andDatnameEqualTo(String value) {
            addCriterion("datname =", value, "datname");
            return (Criteria) this;
        }

        public Criteria andDatnameNotEqualTo(String value) {
            addCriterion("datname <>", value, "datname");
            return (Criteria) this;
        }

        public Criteria andDatnameGreaterThan(String value) {
            addCriterion("datname >", value, "datname");
            return (Criteria) this;
        }

        public Criteria andDatnameGreaterThanOrEqualTo(String value) {
            addCriterion("datname >=", value, "datname");
            return (Criteria) this;
        }

        public Criteria andDatnameLessThan(String value) {
            addCriterion("datname <", value, "datname");
            return (Criteria) this;
        }

        public Criteria andDatnameLessThanOrEqualTo(String value) {
            addCriterion("datname <=", value, "datname");
            return (Criteria) this;
        }

        public Criteria andDatnameLike(String value) {
            addCriterion("datname like", value, "datname");
            return (Criteria) this;
        }

        public Criteria andDatnameNotLike(String value) {
            addCriterion("datname not like", value, "datname");
            return (Criteria) this;
        }

        public Criteria andDatnameIn(List<String> values) {
            addCriterion("datname in", values, "datname");
            return (Criteria) this;
        }

        public Criteria andDatnameNotIn(List<String> values) {
            addCriterion("datname not in", values, "datname");
            return (Criteria) this;
        }

        public Criteria andDatnameBetween(String value1, String value2) {
            addCriterion("datname between", value1, value2, "datname");
            return (Criteria) this;
        }

        public Criteria andDatnameNotBetween(String value1, String value2) {
            addCriterion("datname not between", value1, value2, "datname");
            return (Criteria) this;
        }

        public Criteria andRelidIsNull() {
            addCriterion("relid is null");
            return (Criteria) this;
        }

        public Criteria andRelidIsNotNull() {
            addCriterion("relid is not null");
            return (Criteria) this;
        }

        public Criteria andRelidEqualTo(Long value) {
            addCriterion("relid =", value, "relid");
            return (Criteria) this;
        }

        public Criteria andRelidNotEqualTo(Long value) {
            addCriterion("relid <>", value, "relid");
            return (Criteria) this;
        }

        public Criteria andRelidGreaterThan(Long value) {
            addCriterion("relid >", value, "relid");
            return (Criteria) this;
        }

        public Criteria andRelidGreaterThanOrEqualTo(Long value) {
            addCriterion("relid >=", value, "relid");
            return (Criteria) this;
        }

        public Criteria andRelidLessThan(Long value) {
            addCriterion("relid <", value, "relid");
            return (Criteria) this;
        }

        public Criteria andRelidLessThanOrEqualTo(Long value) {
            addCriterion("relid <=", value, "relid");
            return (Criteria) this;
        }

        public Criteria andRelidIn(List<Long> values) {
            addCriterion("relid in", values, "relid");
            return (Criteria) this;
        }

        public Criteria andRelidNotIn(List<Long> values) {
            addCriterion("relid not in", values, "relid");
            return (Criteria) this;
        }

        public Criteria andRelidBetween(Long value1, Long value2) {
            addCriterion("relid between", value1, value2, "relid");
            return (Criteria) this;
        }

        public Criteria andRelidNotBetween(Long value1, Long value2) {
            addCriterion("relid not between", value1, value2, "relid");
            return (Criteria) this;
        }

        public Criteria andCommandIsNull() {
            addCriterion("command is null");
            return (Criteria) this;
        }

        public Criteria andCommandIsNotNull() {
            addCriterion("command is not null");
            return (Criteria) this;
        }

        public Criteria andCommandEqualTo(String value) {
            addCriterion("command =", value, "command");
            return (Criteria) this;
        }

        public Criteria andCommandNotEqualTo(String value) {
            addCriterion("command <>", value, "command");
            return (Criteria) this;
        }

        public Criteria andCommandGreaterThan(String value) {
            addCriterion("command >", value, "command");
            return (Criteria) this;
        }

        public Criteria andCommandGreaterThanOrEqualTo(String value) {
            addCriterion("command >=", value, "command");
            return (Criteria) this;
        }

        public Criteria andCommandLessThan(String value) {
            addCriterion("command <", value, "command");
            return (Criteria) this;
        }

        public Criteria andCommandLessThanOrEqualTo(String value) {
            addCriterion("command <=", value, "command");
            return (Criteria) this;
        }

        public Criteria andCommandLike(String value) {
            addCriterion("command like", value, "command");
            return (Criteria) this;
        }

        public Criteria andCommandNotLike(String value) {
            addCriterion("command not like", value, "command");
            return (Criteria) this;
        }

        public Criteria andCommandIn(List<String> values) {
            addCriterion("command in", values, "command");
            return (Criteria) this;
        }

        public Criteria andCommandNotIn(List<String> values) {
            addCriterion("command not in", values, "command");
            return (Criteria) this;
        }

        public Criteria andCommandBetween(String value1, String value2) {
            addCriterion("command between", value1, value2, "command");
            return (Criteria) this;
        }

        public Criteria andCommandNotBetween(String value1, String value2) {
            addCriterion("command not between", value1, value2, "command");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("type is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("type is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(String value) {
            addCriterion("type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(String value) {
            addCriterion("type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(String value) {
            addCriterion("type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(String value) {
            addCriterion("type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(String value) {
            addCriterion("type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(String value) {
            addCriterion("type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLike(String value) {
            addCriterion("type like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotLike(String value) {
            addCriterion("type not like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<String> values) {
            addCriterion("type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<String> values) {
            addCriterion("type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(String value1, String value2) {
            addCriterion("type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(String value1, String value2) {
            addCriterion("type not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andBytesProcessedIsNull() {
            addCriterion("bytes_processed is null");
            return (Criteria) this;
        }

        public Criteria andBytesProcessedIsNotNull() {
            addCriterion("bytes_processed is not null");
            return (Criteria) this;
        }

        public Criteria andBytesProcessedEqualTo(Long value) {
            addCriterion("bytes_processed =", value, "bytesProcessed");
            return (Criteria) this;
        }

        public Criteria andBytesProcessedNotEqualTo(Long value) {
            addCriterion("bytes_processed <>", value, "bytesProcessed");
            return (Criteria) this;
        }

        public Criteria andBytesProcessedGreaterThan(Long value) {
            addCriterion("bytes_processed >", value, "bytesProcessed");
            return (Criteria) this;
        }

        public Criteria andBytesProcessedGreaterThanOrEqualTo(Long value) {
            addCriterion("bytes_processed >=", value, "bytesProcessed");
            return (Criteria) this;
        }

        public Criteria andBytesProcessedLessThan(Long value) {
            addCriterion("bytes_processed <", value, "bytesProcessed");
            return (Criteria) this;
        }

        public Criteria andBytesProcessedLessThanOrEqualTo(Long value) {
            addCriterion("bytes_processed <=", value, "bytesProcessed");
            return (Criteria) this;
        }

        public Criteria andBytesProcessedIn(List<Long> values) {
            addCriterion("bytes_processed in", values, "bytesProcessed");
            return (Criteria) this;
        }

        public Criteria andBytesProcessedNotIn(List<Long> values) {
            addCriterion("bytes_processed not in", values, "bytesProcessed");
            return (Criteria) this;
        }

        public Criteria andBytesProcessedBetween(Long value1, Long value2) {
            addCriterion("bytes_processed between", value1, value2, "bytesProcessed");
            return (Criteria) this;
        }

        public Criteria andBytesProcessedNotBetween(Long value1, Long value2) {
            addCriterion("bytes_processed not between", value1, value2, "bytesProcessed");
            return (Criteria) this;
        }

        public Criteria andBytesTotalIsNull() {
            addCriterion("bytes_total is null");
            return (Criteria) this;
        }

        public Criteria andBytesTotalIsNotNull() {
            addCriterion("bytes_total is not null");
            return (Criteria) this;
        }

        public Criteria andBytesTotalEqualTo(Long value) {
            addCriterion("bytes_total =", value, "bytesTotal");
            return (Criteria) this;
        }

        public Criteria andBytesTotalNotEqualTo(Long value) {
            addCriterion("bytes_total <>", value, "bytesTotal");
            return (Criteria) this;
        }

        public Criteria andBytesTotalGreaterThan(Long value) {
            addCriterion("bytes_total >", value, "bytesTotal");
            return (Criteria) this;
        }

        public Criteria andBytesTotalGreaterThanOrEqualTo(Long value) {
            addCriterion("bytes_total >=", value, "bytesTotal");
            return (Criteria) this;
        }

        public Criteria andBytesTotalLessThan(Long value) {
            addCriterion("bytes_total <", value, "bytesTotal");
            return (Criteria) this;
        }

        public Criteria andBytesTotalLessThanOrEqualTo(Long value) {
            addCriterion("bytes_total <=", value, "bytesTotal");
            return (Criteria) this;
        }

        public Criteria andBytesTotalIn(List<Long> values) {
            addCriterion("bytes_total in", values, "bytesTotal");
            return (Criteria) this;
        }

        public Criteria andBytesTotalNotIn(List<Long> values) {
            addCriterion("bytes_total not in", values, "bytesTotal");
            return (Criteria) this;
        }

        public Criteria andBytesTotalBetween(Long value1, Long value2) {
            addCriterion("bytes_total between", value1, value2, "bytesTotal");
            return (Criteria) this;
        }

        public Criteria andBytesTotalNotBetween(Long value1, Long value2) {
            addCriterion("bytes_total not between", value1, value2, "bytesTotal");
            return (Criteria) this;
        }

        public Criteria andTuplesProcessedIsNull() {
            addCriterion("tuples_processed is null");
            return (Criteria) this;
        }

        public Criteria andTuplesProcessedIsNotNull() {
            addCriterion("tuples_processed is not null");
            return (Criteria) this;
        }

        public Criteria andTuplesProcessedEqualTo(Long value) {
            addCriterion("tuples_processed =", value, "tuplesProcessed");
            return (Criteria) this;
        }

        public Criteria andTuplesProcessedNotEqualTo(Long value) {
            addCriterion("tuples_processed <>", value, "tuplesProcessed");
            return (Criteria) this;
        }

        public Criteria andTuplesProcessedGreaterThan(Long value) {
            addCriterion("tuples_processed >", value, "tuplesProcessed");
            return (Criteria) this;
        }

        public Criteria andTuplesProcessedGreaterThanOrEqualTo(Long value) {
            addCriterion("tuples_processed >=", value, "tuplesProcessed");
            return (Criteria) this;
        }

        public Criteria andTuplesProcessedLessThan(Long value) {
            addCriterion("tuples_processed <", value, "tuplesProcessed");
            return (Criteria) this;
        }

        public Criteria andTuplesProcessedLessThanOrEqualTo(Long value) {
            addCriterion("tuples_processed <=", value, "tuplesProcessed");
            return (Criteria) this;
        }

        public Criteria andTuplesProcessedIn(List<Long> values) {
            addCriterion("tuples_processed in", values, "tuplesProcessed");
            return (Criteria) this;
        }

        public Criteria andTuplesProcessedNotIn(List<Long> values) {
            addCriterion("tuples_processed not in", values, "tuplesProcessed");
            return (Criteria) this;
        }

        public Criteria andTuplesProcessedBetween(Long value1, Long value2) {
            addCriterion("tuples_processed between", value1, value2, "tuplesProcessed");
            return (Criteria) this;
        }

        public Criteria andTuplesProcessedNotBetween(Long value1, Long value2) {
            addCriterion("tuples_processed not between", value1, value2, "tuplesProcessed");
            return (Criteria) this;
        }

        public Criteria andTuplesExcludedIsNull() {
            addCriterion("tuples_excluded is null");
            return (Criteria) this;
        }

        public Criteria andTuplesExcludedIsNotNull() {
            addCriterion("tuples_excluded is not null");
            return (Criteria) this;
        }

        public Criteria andTuplesExcludedEqualTo(Long value) {
            addCriterion("tuples_excluded =", value, "tuplesExcluded");
            return (Criteria) this;
        }

        public Criteria andTuplesExcludedNotEqualTo(Long value) {
            addCriterion("tuples_excluded <>", value, "tuplesExcluded");
            return (Criteria) this;
        }

        public Criteria andTuplesExcludedGreaterThan(Long value) {
            addCriterion("tuples_excluded >", value, "tuplesExcluded");
            return (Criteria) this;
        }

        public Criteria andTuplesExcludedGreaterThanOrEqualTo(Long value) {
            addCriterion("tuples_excluded >=", value, "tuplesExcluded");
            return (Criteria) this;
        }

        public Criteria andTuplesExcludedLessThan(Long value) {
            addCriterion("tuples_excluded <", value, "tuplesExcluded");
            return (Criteria) this;
        }

        public Criteria andTuplesExcludedLessThanOrEqualTo(Long value) {
            addCriterion("tuples_excluded <=", value, "tuplesExcluded");
            return (Criteria) this;
        }

        public Criteria andTuplesExcludedIn(List<Long> values) {
            addCriterion("tuples_excluded in", values, "tuplesExcluded");
            return (Criteria) this;
        }

        public Criteria andTuplesExcludedNotIn(List<Long> values) {
            addCriterion("tuples_excluded not in", values, "tuplesExcluded");
            return (Criteria) this;
        }

        public Criteria andTuplesExcludedBetween(Long value1, Long value2) {
            addCriterion("tuples_excluded between", value1, value2, "tuplesExcluded");
            return (Criteria) this;
        }

        public Criteria andTuplesExcludedNotBetween(Long value1, Long value2) {
            addCriterion("tuples_excluded not between", value1, value2, "tuplesExcluded");
            return (Criteria) this;
        }

        public Criteria andTuplesSkippedIsNull() {
            addCriterion("tuples_skipped is null");
            return (Criteria) this;
        }

        public Criteria andTuplesSkippedIsNotNull() {
            addCriterion("tuples_skipped is not null");
            return (Criteria) this;
        }

        public Criteria andTuplesSkippedEqualTo(Long value) {
            addCriterion("tuples_skipped =", value, "tuplesSkipped");
            return (Criteria) this;
        }

        public Criteria andTuplesSkippedNotEqualTo(Long value) {
            addCriterion("tuples_skipped <>", value, "tuplesSkipped");
            return (Criteria) this;
        }

        public Criteria andTuplesSkippedGreaterThan(Long value) {
            addCriterion("tuples_skipped >", value, "tuplesSkipped");
            return (Criteria) this;
        }

        public Criteria andTuplesSkippedGreaterThanOrEqualTo(Long value) {
            addCriterion("tuples_skipped >=", value, "tuplesSkipped");
            return (Criteria) this;
        }

        public Criteria andTuplesSkippedLessThan(Long value) {
            addCriterion("tuples_skipped <", value, "tuplesSkipped");
            return (Criteria) this;
        }

        public Criteria andTuplesSkippedLessThanOrEqualTo(Long value) {
            addCriterion("tuples_skipped <=", value, "tuplesSkipped");
            return (Criteria) this;
        }

        public Criteria andTuplesSkippedIn(List<Long> values) {
            addCriterion("tuples_skipped in", values, "tuplesSkipped");
            return (Criteria) this;
        }

        public Criteria andTuplesSkippedNotIn(List<Long> values) {
            addCriterion("tuples_skipped not in", values, "tuplesSkipped");
            return (Criteria) this;
        }

        public Criteria andTuplesSkippedBetween(Long value1, Long value2) {
            addCriterion("tuples_skipped between", value1, value2, "tuplesSkipped");
            return (Criteria) this;
        }

        public Criteria andTuplesSkippedNotBetween(Long value1, Long value2) {
            addCriterion("tuples_skipped not between", value1, value2, "tuplesSkipped");
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