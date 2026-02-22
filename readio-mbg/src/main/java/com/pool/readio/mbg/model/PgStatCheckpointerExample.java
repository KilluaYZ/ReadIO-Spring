package com.pool.readio.mbg.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PgStatCheckpointerExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PgStatCheckpointerExample() {
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

        public Criteria andNumTimedIsNull() {
            addCriterion("num_timed is null");
            return (Criteria) this;
        }

        public Criteria andNumTimedIsNotNull() {
            addCriterion("num_timed is not null");
            return (Criteria) this;
        }

        public Criteria andNumTimedEqualTo(Long value) {
            addCriterion("num_timed =", value, "numTimed");
            return (Criteria) this;
        }

        public Criteria andNumTimedNotEqualTo(Long value) {
            addCriterion("num_timed <>", value, "numTimed");
            return (Criteria) this;
        }

        public Criteria andNumTimedGreaterThan(Long value) {
            addCriterion("num_timed >", value, "numTimed");
            return (Criteria) this;
        }

        public Criteria andNumTimedGreaterThanOrEqualTo(Long value) {
            addCriterion("num_timed >=", value, "numTimed");
            return (Criteria) this;
        }

        public Criteria andNumTimedLessThan(Long value) {
            addCriterion("num_timed <", value, "numTimed");
            return (Criteria) this;
        }

        public Criteria andNumTimedLessThanOrEqualTo(Long value) {
            addCriterion("num_timed <=", value, "numTimed");
            return (Criteria) this;
        }

        public Criteria andNumTimedIn(List<Long> values) {
            addCriterion("num_timed in", values, "numTimed");
            return (Criteria) this;
        }

        public Criteria andNumTimedNotIn(List<Long> values) {
            addCriterion("num_timed not in", values, "numTimed");
            return (Criteria) this;
        }

        public Criteria andNumTimedBetween(Long value1, Long value2) {
            addCriterion("num_timed between", value1, value2, "numTimed");
            return (Criteria) this;
        }

        public Criteria andNumTimedNotBetween(Long value1, Long value2) {
            addCriterion("num_timed not between", value1, value2, "numTimed");
            return (Criteria) this;
        }

        public Criteria andNumRequestedIsNull() {
            addCriterion("num_requested is null");
            return (Criteria) this;
        }

        public Criteria andNumRequestedIsNotNull() {
            addCriterion("num_requested is not null");
            return (Criteria) this;
        }

        public Criteria andNumRequestedEqualTo(Long value) {
            addCriterion("num_requested =", value, "numRequested");
            return (Criteria) this;
        }

        public Criteria andNumRequestedNotEqualTo(Long value) {
            addCriterion("num_requested <>", value, "numRequested");
            return (Criteria) this;
        }

        public Criteria andNumRequestedGreaterThan(Long value) {
            addCriterion("num_requested >", value, "numRequested");
            return (Criteria) this;
        }

        public Criteria andNumRequestedGreaterThanOrEqualTo(Long value) {
            addCriterion("num_requested >=", value, "numRequested");
            return (Criteria) this;
        }

        public Criteria andNumRequestedLessThan(Long value) {
            addCriterion("num_requested <", value, "numRequested");
            return (Criteria) this;
        }

        public Criteria andNumRequestedLessThanOrEqualTo(Long value) {
            addCriterion("num_requested <=", value, "numRequested");
            return (Criteria) this;
        }

        public Criteria andNumRequestedIn(List<Long> values) {
            addCriterion("num_requested in", values, "numRequested");
            return (Criteria) this;
        }

        public Criteria andNumRequestedNotIn(List<Long> values) {
            addCriterion("num_requested not in", values, "numRequested");
            return (Criteria) this;
        }

        public Criteria andNumRequestedBetween(Long value1, Long value2) {
            addCriterion("num_requested between", value1, value2, "numRequested");
            return (Criteria) this;
        }

        public Criteria andNumRequestedNotBetween(Long value1, Long value2) {
            addCriterion("num_requested not between", value1, value2, "numRequested");
            return (Criteria) this;
        }

        public Criteria andNumDoneIsNull() {
            addCriterion("num_done is null");
            return (Criteria) this;
        }

        public Criteria andNumDoneIsNotNull() {
            addCriterion("num_done is not null");
            return (Criteria) this;
        }

        public Criteria andNumDoneEqualTo(Long value) {
            addCriterion("num_done =", value, "numDone");
            return (Criteria) this;
        }

        public Criteria andNumDoneNotEqualTo(Long value) {
            addCriterion("num_done <>", value, "numDone");
            return (Criteria) this;
        }

        public Criteria andNumDoneGreaterThan(Long value) {
            addCriterion("num_done >", value, "numDone");
            return (Criteria) this;
        }

        public Criteria andNumDoneGreaterThanOrEqualTo(Long value) {
            addCriterion("num_done >=", value, "numDone");
            return (Criteria) this;
        }

        public Criteria andNumDoneLessThan(Long value) {
            addCriterion("num_done <", value, "numDone");
            return (Criteria) this;
        }

        public Criteria andNumDoneLessThanOrEqualTo(Long value) {
            addCriterion("num_done <=", value, "numDone");
            return (Criteria) this;
        }

        public Criteria andNumDoneIn(List<Long> values) {
            addCriterion("num_done in", values, "numDone");
            return (Criteria) this;
        }

        public Criteria andNumDoneNotIn(List<Long> values) {
            addCriterion("num_done not in", values, "numDone");
            return (Criteria) this;
        }

        public Criteria andNumDoneBetween(Long value1, Long value2) {
            addCriterion("num_done between", value1, value2, "numDone");
            return (Criteria) this;
        }

        public Criteria andNumDoneNotBetween(Long value1, Long value2) {
            addCriterion("num_done not between", value1, value2, "numDone");
            return (Criteria) this;
        }

        public Criteria andRestartpointsTimedIsNull() {
            addCriterion("restartpoints_timed is null");
            return (Criteria) this;
        }

        public Criteria andRestartpointsTimedIsNotNull() {
            addCriterion("restartpoints_timed is not null");
            return (Criteria) this;
        }

        public Criteria andRestartpointsTimedEqualTo(Long value) {
            addCriterion("restartpoints_timed =", value, "restartpointsTimed");
            return (Criteria) this;
        }

        public Criteria andRestartpointsTimedNotEqualTo(Long value) {
            addCriterion("restartpoints_timed <>", value, "restartpointsTimed");
            return (Criteria) this;
        }

        public Criteria andRestartpointsTimedGreaterThan(Long value) {
            addCriterion("restartpoints_timed >", value, "restartpointsTimed");
            return (Criteria) this;
        }

        public Criteria andRestartpointsTimedGreaterThanOrEqualTo(Long value) {
            addCriterion("restartpoints_timed >=", value, "restartpointsTimed");
            return (Criteria) this;
        }

        public Criteria andRestartpointsTimedLessThan(Long value) {
            addCriterion("restartpoints_timed <", value, "restartpointsTimed");
            return (Criteria) this;
        }

        public Criteria andRestartpointsTimedLessThanOrEqualTo(Long value) {
            addCriterion("restartpoints_timed <=", value, "restartpointsTimed");
            return (Criteria) this;
        }

        public Criteria andRestartpointsTimedIn(List<Long> values) {
            addCriterion("restartpoints_timed in", values, "restartpointsTimed");
            return (Criteria) this;
        }

        public Criteria andRestartpointsTimedNotIn(List<Long> values) {
            addCriterion("restartpoints_timed not in", values, "restartpointsTimed");
            return (Criteria) this;
        }

        public Criteria andRestartpointsTimedBetween(Long value1, Long value2) {
            addCriterion("restartpoints_timed between", value1, value2, "restartpointsTimed");
            return (Criteria) this;
        }

        public Criteria andRestartpointsTimedNotBetween(Long value1, Long value2) {
            addCriterion("restartpoints_timed not between", value1, value2, "restartpointsTimed");
            return (Criteria) this;
        }

        public Criteria andRestartpointsReqIsNull() {
            addCriterion("restartpoints_req is null");
            return (Criteria) this;
        }

        public Criteria andRestartpointsReqIsNotNull() {
            addCriterion("restartpoints_req is not null");
            return (Criteria) this;
        }

        public Criteria andRestartpointsReqEqualTo(Long value) {
            addCriterion("restartpoints_req =", value, "restartpointsReq");
            return (Criteria) this;
        }

        public Criteria andRestartpointsReqNotEqualTo(Long value) {
            addCriterion("restartpoints_req <>", value, "restartpointsReq");
            return (Criteria) this;
        }

        public Criteria andRestartpointsReqGreaterThan(Long value) {
            addCriterion("restartpoints_req >", value, "restartpointsReq");
            return (Criteria) this;
        }

        public Criteria andRestartpointsReqGreaterThanOrEqualTo(Long value) {
            addCriterion("restartpoints_req >=", value, "restartpointsReq");
            return (Criteria) this;
        }

        public Criteria andRestartpointsReqLessThan(Long value) {
            addCriterion("restartpoints_req <", value, "restartpointsReq");
            return (Criteria) this;
        }

        public Criteria andRestartpointsReqLessThanOrEqualTo(Long value) {
            addCriterion("restartpoints_req <=", value, "restartpointsReq");
            return (Criteria) this;
        }

        public Criteria andRestartpointsReqIn(List<Long> values) {
            addCriterion("restartpoints_req in", values, "restartpointsReq");
            return (Criteria) this;
        }

        public Criteria andRestartpointsReqNotIn(List<Long> values) {
            addCriterion("restartpoints_req not in", values, "restartpointsReq");
            return (Criteria) this;
        }

        public Criteria andRestartpointsReqBetween(Long value1, Long value2) {
            addCriterion("restartpoints_req between", value1, value2, "restartpointsReq");
            return (Criteria) this;
        }

        public Criteria andRestartpointsReqNotBetween(Long value1, Long value2) {
            addCriterion("restartpoints_req not between", value1, value2, "restartpointsReq");
            return (Criteria) this;
        }

        public Criteria andRestartpointsDoneIsNull() {
            addCriterion("restartpoints_done is null");
            return (Criteria) this;
        }

        public Criteria andRestartpointsDoneIsNotNull() {
            addCriterion("restartpoints_done is not null");
            return (Criteria) this;
        }

        public Criteria andRestartpointsDoneEqualTo(Long value) {
            addCriterion("restartpoints_done =", value, "restartpointsDone");
            return (Criteria) this;
        }

        public Criteria andRestartpointsDoneNotEqualTo(Long value) {
            addCriterion("restartpoints_done <>", value, "restartpointsDone");
            return (Criteria) this;
        }

        public Criteria andRestartpointsDoneGreaterThan(Long value) {
            addCriterion("restartpoints_done >", value, "restartpointsDone");
            return (Criteria) this;
        }

        public Criteria andRestartpointsDoneGreaterThanOrEqualTo(Long value) {
            addCriterion("restartpoints_done >=", value, "restartpointsDone");
            return (Criteria) this;
        }

        public Criteria andRestartpointsDoneLessThan(Long value) {
            addCriterion("restartpoints_done <", value, "restartpointsDone");
            return (Criteria) this;
        }

        public Criteria andRestartpointsDoneLessThanOrEqualTo(Long value) {
            addCriterion("restartpoints_done <=", value, "restartpointsDone");
            return (Criteria) this;
        }

        public Criteria andRestartpointsDoneIn(List<Long> values) {
            addCriterion("restartpoints_done in", values, "restartpointsDone");
            return (Criteria) this;
        }

        public Criteria andRestartpointsDoneNotIn(List<Long> values) {
            addCriterion("restartpoints_done not in", values, "restartpointsDone");
            return (Criteria) this;
        }

        public Criteria andRestartpointsDoneBetween(Long value1, Long value2) {
            addCriterion("restartpoints_done between", value1, value2, "restartpointsDone");
            return (Criteria) this;
        }

        public Criteria andRestartpointsDoneNotBetween(Long value1, Long value2) {
            addCriterion("restartpoints_done not between", value1, value2, "restartpointsDone");
            return (Criteria) this;
        }

        public Criteria andWriteTimeIsNull() {
            addCriterion("write_time is null");
            return (Criteria) this;
        }

        public Criteria andWriteTimeIsNotNull() {
            addCriterion("write_time is not null");
            return (Criteria) this;
        }

        public Criteria andWriteTimeEqualTo(Double value) {
            addCriterion("write_time =", value, "writeTime");
            return (Criteria) this;
        }

        public Criteria andWriteTimeNotEqualTo(Double value) {
            addCriterion("write_time <>", value, "writeTime");
            return (Criteria) this;
        }

        public Criteria andWriteTimeGreaterThan(Double value) {
            addCriterion("write_time >", value, "writeTime");
            return (Criteria) this;
        }

        public Criteria andWriteTimeGreaterThanOrEqualTo(Double value) {
            addCriterion("write_time >=", value, "writeTime");
            return (Criteria) this;
        }

        public Criteria andWriteTimeLessThan(Double value) {
            addCriterion("write_time <", value, "writeTime");
            return (Criteria) this;
        }

        public Criteria andWriteTimeLessThanOrEqualTo(Double value) {
            addCriterion("write_time <=", value, "writeTime");
            return (Criteria) this;
        }

        public Criteria andWriteTimeIn(List<Double> values) {
            addCriterion("write_time in", values, "writeTime");
            return (Criteria) this;
        }

        public Criteria andWriteTimeNotIn(List<Double> values) {
            addCriterion("write_time not in", values, "writeTime");
            return (Criteria) this;
        }

        public Criteria andWriteTimeBetween(Double value1, Double value2) {
            addCriterion("write_time between", value1, value2, "writeTime");
            return (Criteria) this;
        }

        public Criteria andWriteTimeNotBetween(Double value1, Double value2) {
            addCriterion("write_time not between", value1, value2, "writeTime");
            return (Criteria) this;
        }

        public Criteria andSyncTimeIsNull() {
            addCriterion("sync_time is null");
            return (Criteria) this;
        }

        public Criteria andSyncTimeIsNotNull() {
            addCriterion("sync_time is not null");
            return (Criteria) this;
        }

        public Criteria andSyncTimeEqualTo(Double value) {
            addCriterion("sync_time =", value, "syncTime");
            return (Criteria) this;
        }

        public Criteria andSyncTimeNotEqualTo(Double value) {
            addCriterion("sync_time <>", value, "syncTime");
            return (Criteria) this;
        }

        public Criteria andSyncTimeGreaterThan(Double value) {
            addCriterion("sync_time >", value, "syncTime");
            return (Criteria) this;
        }

        public Criteria andSyncTimeGreaterThanOrEqualTo(Double value) {
            addCriterion("sync_time >=", value, "syncTime");
            return (Criteria) this;
        }

        public Criteria andSyncTimeLessThan(Double value) {
            addCriterion("sync_time <", value, "syncTime");
            return (Criteria) this;
        }

        public Criteria andSyncTimeLessThanOrEqualTo(Double value) {
            addCriterion("sync_time <=", value, "syncTime");
            return (Criteria) this;
        }

        public Criteria andSyncTimeIn(List<Double> values) {
            addCriterion("sync_time in", values, "syncTime");
            return (Criteria) this;
        }

        public Criteria andSyncTimeNotIn(List<Double> values) {
            addCriterion("sync_time not in", values, "syncTime");
            return (Criteria) this;
        }

        public Criteria andSyncTimeBetween(Double value1, Double value2) {
            addCriterion("sync_time between", value1, value2, "syncTime");
            return (Criteria) this;
        }

        public Criteria andSyncTimeNotBetween(Double value1, Double value2) {
            addCriterion("sync_time not between", value1, value2, "syncTime");
            return (Criteria) this;
        }

        public Criteria andBuffersWrittenIsNull() {
            addCriterion("buffers_written is null");
            return (Criteria) this;
        }

        public Criteria andBuffersWrittenIsNotNull() {
            addCriterion("buffers_written is not null");
            return (Criteria) this;
        }

        public Criteria andBuffersWrittenEqualTo(Long value) {
            addCriterion("buffers_written =", value, "buffersWritten");
            return (Criteria) this;
        }

        public Criteria andBuffersWrittenNotEqualTo(Long value) {
            addCriterion("buffers_written <>", value, "buffersWritten");
            return (Criteria) this;
        }

        public Criteria andBuffersWrittenGreaterThan(Long value) {
            addCriterion("buffers_written >", value, "buffersWritten");
            return (Criteria) this;
        }

        public Criteria andBuffersWrittenGreaterThanOrEqualTo(Long value) {
            addCriterion("buffers_written >=", value, "buffersWritten");
            return (Criteria) this;
        }

        public Criteria andBuffersWrittenLessThan(Long value) {
            addCriterion("buffers_written <", value, "buffersWritten");
            return (Criteria) this;
        }

        public Criteria andBuffersWrittenLessThanOrEqualTo(Long value) {
            addCriterion("buffers_written <=", value, "buffersWritten");
            return (Criteria) this;
        }

        public Criteria andBuffersWrittenIn(List<Long> values) {
            addCriterion("buffers_written in", values, "buffersWritten");
            return (Criteria) this;
        }

        public Criteria andBuffersWrittenNotIn(List<Long> values) {
            addCriterion("buffers_written not in", values, "buffersWritten");
            return (Criteria) this;
        }

        public Criteria andBuffersWrittenBetween(Long value1, Long value2) {
            addCriterion("buffers_written between", value1, value2, "buffersWritten");
            return (Criteria) this;
        }

        public Criteria andBuffersWrittenNotBetween(Long value1, Long value2) {
            addCriterion("buffers_written not between", value1, value2, "buffersWritten");
            return (Criteria) this;
        }

        public Criteria andSlruWrittenIsNull() {
            addCriterion("slru_written is null");
            return (Criteria) this;
        }

        public Criteria andSlruWrittenIsNotNull() {
            addCriterion("slru_written is not null");
            return (Criteria) this;
        }

        public Criteria andSlruWrittenEqualTo(Long value) {
            addCriterion("slru_written =", value, "slruWritten");
            return (Criteria) this;
        }

        public Criteria andSlruWrittenNotEqualTo(Long value) {
            addCriterion("slru_written <>", value, "slruWritten");
            return (Criteria) this;
        }

        public Criteria andSlruWrittenGreaterThan(Long value) {
            addCriterion("slru_written >", value, "slruWritten");
            return (Criteria) this;
        }

        public Criteria andSlruWrittenGreaterThanOrEqualTo(Long value) {
            addCriterion("slru_written >=", value, "slruWritten");
            return (Criteria) this;
        }

        public Criteria andSlruWrittenLessThan(Long value) {
            addCriterion("slru_written <", value, "slruWritten");
            return (Criteria) this;
        }

        public Criteria andSlruWrittenLessThanOrEqualTo(Long value) {
            addCriterion("slru_written <=", value, "slruWritten");
            return (Criteria) this;
        }

        public Criteria andSlruWrittenIn(List<Long> values) {
            addCriterion("slru_written in", values, "slruWritten");
            return (Criteria) this;
        }

        public Criteria andSlruWrittenNotIn(List<Long> values) {
            addCriterion("slru_written not in", values, "slruWritten");
            return (Criteria) this;
        }

        public Criteria andSlruWrittenBetween(Long value1, Long value2) {
            addCriterion("slru_written between", value1, value2, "slruWritten");
            return (Criteria) this;
        }

        public Criteria andSlruWrittenNotBetween(Long value1, Long value2) {
            addCriterion("slru_written not between", value1, value2, "slruWritten");
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