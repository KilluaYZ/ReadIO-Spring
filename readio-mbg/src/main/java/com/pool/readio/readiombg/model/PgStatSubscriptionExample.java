package com.pool.readio.readiombg.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PgStatSubscriptionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PgStatSubscriptionExample() {
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

        public Criteria andSubidIsNull() {
            addCriterion("subid is null");
            return (Criteria) this;
        }

        public Criteria andSubidIsNotNull() {
            addCriterion("subid is not null");
            return (Criteria) this;
        }

        public Criteria andSubidEqualTo(Long value) {
            addCriterion("subid =", value, "subid");
            return (Criteria) this;
        }

        public Criteria andSubidNotEqualTo(Long value) {
            addCriterion("subid <>", value, "subid");
            return (Criteria) this;
        }

        public Criteria andSubidGreaterThan(Long value) {
            addCriterion("subid >", value, "subid");
            return (Criteria) this;
        }

        public Criteria andSubidGreaterThanOrEqualTo(Long value) {
            addCriterion("subid >=", value, "subid");
            return (Criteria) this;
        }

        public Criteria andSubidLessThan(Long value) {
            addCriterion("subid <", value, "subid");
            return (Criteria) this;
        }

        public Criteria andSubidLessThanOrEqualTo(Long value) {
            addCriterion("subid <=", value, "subid");
            return (Criteria) this;
        }

        public Criteria andSubidIn(List<Long> values) {
            addCriterion("subid in", values, "subid");
            return (Criteria) this;
        }

        public Criteria andSubidNotIn(List<Long> values) {
            addCriterion("subid not in", values, "subid");
            return (Criteria) this;
        }

        public Criteria andSubidBetween(Long value1, Long value2) {
            addCriterion("subid between", value1, value2, "subid");
            return (Criteria) this;
        }

        public Criteria andSubidNotBetween(Long value1, Long value2) {
            addCriterion("subid not between", value1, value2, "subid");
            return (Criteria) this;
        }

        public Criteria andSubnameIsNull() {
            addCriterion("subname is null");
            return (Criteria) this;
        }

        public Criteria andSubnameIsNotNull() {
            addCriterion("subname is not null");
            return (Criteria) this;
        }

        public Criteria andSubnameEqualTo(String value) {
            addCriterion("subname =", value, "subname");
            return (Criteria) this;
        }

        public Criteria andSubnameNotEqualTo(String value) {
            addCriterion("subname <>", value, "subname");
            return (Criteria) this;
        }

        public Criteria andSubnameGreaterThan(String value) {
            addCriterion("subname >", value, "subname");
            return (Criteria) this;
        }

        public Criteria andSubnameGreaterThanOrEqualTo(String value) {
            addCriterion("subname >=", value, "subname");
            return (Criteria) this;
        }

        public Criteria andSubnameLessThan(String value) {
            addCriterion("subname <", value, "subname");
            return (Criteria) this;
        }

        public Criteria andSubnameLessThanOrEqualTo(String value) {
            addCriterion("subname <=", value, "subname");
            return (Criteria) this;
        }

        public Criteria andSubnameLike(String value) {
            addCriterion("subname like", value, "subname");
            return (Criteria) this;
        }

        public Criteria andSubnameNotLike(String value) {
            addCriterion("subname not like", value, "subname");
            return (Criteria) this;
        }

        public Criteria andSubnameIn(List<String> values) {
            addCriterion("subname in", values, "subname");
            return (Criteria) this;
        }

        public Criteria andSubnameNotIn(List<String> values) {
            addCriterion("subname not in", values, "subname");
            return (Criteria) this;
        }

        public Criteria andSubnameBetween(String value1, String value2) {
            addCriterion("subname between", value1, value2, "subname");
            return (Criteria) this;
        }

        public Criteria andSubnameNotBetween(String value1, String value2) {
            addCriterion("subname not between", value1, value2, "subname");
            return (Criteria) this;
        }

        public Criteria andWorkerTypeIsNull() {
            addCriterion("worker_type is null");
            return (Criteria) this;
        }

        public Criteria andWorkerTypeIsNotNull() {
            addCriterion("worker_type is not null");
            return (Criteria) this;
        }

        public Criteria andWorkerTypeEqualTo(String value) {
            addCriterion("worker_type =", value, "workerType");
            return (Criteria) this;
        }

        public Criteria andWorkerTypeNotEqualTo(String value) {
            addCriterion("worker_type <>", value, "workerType");
            return (Criteria) this;
        }

        public Criteria andWorkerTypeGreaterThan(String value) {
            addCriterion("worker_type >", value, "workerType");
            return (Criteria) this;
        }

        public Criteria andWorkerTypeGreaterThanOrEqualTo(String value) {
            addCriterion("worker_type >=", value, "workerType");
            return (Criteria) this;
        }

        public Criteria andWorkerTypeLessThan(String value) {
            addCriterion("worker_type <", value, "workerType");
            return (Criteria) this;
        }

        public Criteria andWorkerTypeLessThanOrEqualTo(String value) {
            addCriterion("worker_type <=", value, "workerType");
            return (Criteria) this;
        }

        public Criteria andWorkerTypeLike(String value) {
            addCriterion("worker_type like", value, "workerType");
            return (Criteria) this;
        }

        public Criteria andWorkerTypeNotLike(String value) {
            addCriterion("worker_type not like", value, "workerType");
            return (Criteria) this;
        }

        public Criteria andWorkerTypeIn(List<String> values) {
            addCriterion("worker_type in", values, "workerType");
            return (Criteria) this;
        }

        public Criteria andWorkerTypeNotIn(List<String> values) {
            addCriterion("worker_type not in", values, "workerType");
            return (Criteria) this;
        }

        public Criteria andWorkerTypeBetween(String value1, String value2) {
            addCriterion("worker_type between", value1, value2, "workerType");
            return (Criteria) this;
        }

        public Criteria andWorkerTypeNotBetween(String value1, String value2) {
            addCriterion("worker_type not between", value1, value2, "workerType");
            return (Criteria) this;
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

        public Criteria andLeaderPidIsNull() {
            addCriterion("leader_pid is null");
            return (Criteria) this;
        }

        public Criteria andLeaderPidIsNotNull() {
            addCriterion("leader_pid is not null");
            return (Criteria) this;
        }

        public Criteria andLeaderPidEqualTo(Integer value) {
            addCriterion("leader_pid =", value, "leaderPid");
            return (Criteria) this;
        }

        public Criteria andLeaderPidNotEqualTo(Integer value) {
            addCriterion("leader_pid <>", value, "leaderPid");
            return (Criteria) this;
        }

        public Criteria andLeaderPidGreaterThan(Integer value) {
            addCriterion("leader_pid >", value, "leaderPid");
            return (Criteria) this;
        }

        public Criteria andLeaderPidGreaterThanOrEqualTo(Integer value) {
            addCriterion("leader_pid >=", value, "leaderPid");
            return (Criteria) this;
        }

        public Criteria andLeaderPidLessThan(Integer value) {
            addCriterion("leader_pid <", value, "leaderPid");
            return (Criteria) this;
        }

        public Criteria andLeaderPidLessThanOrEqualTo(Integer value) {
            addCriterion("leader_pid <=", value, "leaderPid");
            return (Criteria) this;
        }

        public Criteria andLeaderPidIn(List<Integer> values) {
            addCriterion("leader_pid in", values, "leaderPid");
            return (Criteria) this;
        }

        public Criteria andLeaderPidNotIn(List<Integer> values) {
            addCriterion("leader_pid not in", values, "leaderPid");
            return (Criteria) this;
        }

        public Criteria andLeaderPidBetween(Integer value1, Integer value2) {
            addCriterion("leader_pid between", value1, value2, "leaderPid");
            return (Criteria) this;
        }

        public Criteria andLeaderPidNotBetween(Integer value1, Integer value2) {
            addCriterion("leader_pid not between", value1, value2, "leaderPid");
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

        public Criteria andReceivedLsnIsNull() {
            addCriterion("received_lsn is null");
            return (Criteria) this;
        }

        public Criteria andReceivedLsnIsNotNull() {
            addCriterion("received_lsn is not null");
            return (Criteria) this;
        }

        public Criteria andReceivedLsnEqualTo(Object value) {
            addCriterion("received_lsn =", value, "receivedLsn");
            return (Criteria) this;
        }

        public Criteria andReceivedLsnNotEqualTo(Object value) {
            addCriterion("received_lsn <>", value, "receivedLsn");
            return (Criteria) this;
        }

        public Criteria andReceivedLsnGreaterThan(Object value) {
            addCriterion("received_lsn >", value, "receivedLsn");
            return (Criteria) this;
        }

        public Criteria andReceivedLsnGreaterThanOrEqualTo(Object value) {
            addCriterion("received_lsn >=", value, "receivedLsn");
            return (Criteria) this;
        }

        public Criteria andReceivedLsnLessThan(Object value) {
            addCriterion("received_lsn <", value, "receivedLsn");
            return (Criteria) this;
        }

        public Criteria andReceivedLsnLessThanOrEqualTo(Object value) {
            addCriterion("received_lsn <=", value, "receivedLsn");
            return (Criteria) this;
        }

        public Criteria andReceivedLsnIn(List<Object> values) {
            addCriterion("received_lsn in", values, "receivedLsn");
            return (Criteria) this;
        }

        public Criteria andReceivedLsnNotIn(List<Object> values) {
            addCriterion("received_lsn not in", values, "receivedLsn");
            return (Criteria) this;
        }

        public Criteria andReceivedLsnBetween(Object value1, Object value2) {
            addCriterion("received_lsn between", value1, value2, "receivedLsn");
            return (Criteria) this;
        }

        public Criteria andReceivedLsnNotBetween(Object value1, Object value2) {
            addCriterion("received_lsn not between", value1, value2, "receivedLsn");
            return (Criteria) this;
        }

        public Criteria andLastMsgSendTimeIsNull() {
            addCriterion("last_msg_send_time is null");
            return (Criteria) this;
        }

        public Criteria andLastMsgSendTimeIsNotNull() {
            addCriterion("last_msg_send_time is not null");
            return (Criteria) this;
        }

        public Criteria andLastMsgSendTimeEqualTo(Date value) {
            addCriterion("last_msg_send_time =", value, "lastMsgSendTime");
            return (Criteria) this;
        }

        public Criteria andLastMsgSendTimeNotEqualTo(Date value) {
            addCriterion("last_msg_send_time <>", value, "lastMsgSendTime");
            return (Criteria) this;
        }

        public Criteria andLastMsgSendTimeGreaterThan(Date value) {
            addCriterion("last_msg_send_time >", value, "lastMsgSendTime");
            return (Criteria) this;
        }

        public Criteria andLastMsgSendTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("last_msg_send_time >=", value, "lastMsgSendTime");
            return (Criteria) this;
        }

        public Criteria andLastMsgSendTimeLessThan(Date value) {
            addCriterion("last_msg_send_time <", value, "lastMsgSendTime");
            return (Criteria) this;
        }

        public Criteria andLastMsgSendTimeLessThanOrEqualTo(Date value) {
            addCriterion("last_msg_send_time <=", value, "lastMsgSendTime");
            return (Criteria) this;
        }

        public Criteria andLastMsgSendTimeIn(List<Date> values) {
            addCriterion("last_msg_send_time in", values, "lastMsgSendTime");
            return (Criteria) this;
        }

        public Criteria andLastMsgSendTimeNotIn(List<Date> values) {
            addCriterion("last_msg_send_time not in", values, "lastMsgSendTime");
            return (Criteria) this;
        }

        public Criteria andLastMsgSendTimeBetween(Date value1, Date value2) {
            addCriterion("last_msg_send_time between", value1, value2, "lastMsgSendTime");
            return (Criteria) this;
        }

        public Criteria andLastMsgSendTimeNotBetween(Date value1, Date value2) {
            addCriterion("last_msg_send_time not between", value1, value2, "lastMsgSendTime");
            return (Criteria) this;
        }

        public Criteria andLastMsgReceiptTimeIsNull() {
            addCriterion("last_msg_receipt_time is null");
            return (Criteria) this;
        }

        public Criteria andLastMsgReceiptTimeIsNotNull() {
            addCriterion("last_msg_receipt_time is not null");
            return (Criteria) this;
        }

        public Criteria andLastMsgReceiptTimeEqualTo(Date value) {
            addCriterion("last_msg_receipt_time =", value, "lastMsgReceiptTime");
            return (Criteria) this;
        }

        public Criteria andLastMsgReceiptTimeNotEqualTo(Date value) {
            addCriterion("last_msg_receipt_time <>", value, "lastMsgReceiptTime");
            return (Criteria) this;
        }

        public Criteria andLastMsgReceiptTimeGreaterThan(Date value) {
            addCriterion("last_msg_receipt_time >", value, "lastMsgReceiptTime");
            return (Criteria) this;
        }

        public Criteria andLastMsgReceiptTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("last_msg_receipt_time >=", value, "lastMsgReceiptTime");
            return (Criteria) this;
        }

        public Criteria andLastMsgReceiptTimeLessThan(Date value) {
            addCriterion("last_msg_receipt_time <", value, "lastMsgReceiptTime");
            return (Criteria) this;
        }

        public Criteria andLastMsgReceiptTimeLessThanOrEqualTo(Date value) {
            addCriterion("last_msg_receipt_time <=", value, "lastMsgReceiptTime");
            return (Criteria) this;
        }

        public Criteria andLastMsgReceiptTimeIn(List<Date> values) {
            addCriterion("last_msg_receipt_time in", values, "lastMsgReceiptTime");
            return (Criteria) this;
        }

        public Criteria andLastMsgReceiptTimeNotIn(List<Date> values) {
            addCriterion("last_msg_receipt_time not in", values, "lastMsgReceiptTime");
            return (Criteria) this;
        }

        public Criteria andLastMsgReceiptTimeBetween(Date value1, Date value2) {
            addCriterion("last_msg_receipt_time between", value1, value2, "lastMsgReceiptTime");
            return (Criteria) this;
        }

        public Criteria andLastMsgReceiptTimeNotBetween(Date value1, Date value2) {
            addCriterion("last_msg_receipt_time not between", value1, value2, "lastMsgReceiptTime");
            return (Criteria) this;
        }

        public Criteria andLatestEndLsnIsNull() {
            addCriterion("latest_end_lsn is null");
            return (Criteria) this;
        }

        public Criteria andLatestEndLsnIsNotNull() {
            addCriterion("latest_end_lsn is not null");
            return (Criteria) this;
        }

        public Criteria andLatestEndLsnEqualTo(Object value) {
            addCriterion("latest_end_lsn =", value, "latestEndLsn");
            return (Criteria) this;
        }

        public Criteria andLatestEndLsnNotEqualTo(Object value) {
            addCriterion("latest_end_lsn <>", value, "latestEndLsn");
            return (Criteria) this;
        }

        public Criteria andLatestEndLsnGreaterThan(Object value) {
            addCriterion("latest_end_lsn >", value, "latestEndLsn");
            return (Criteria) this;
        }

        public Criteria andLatestEndLsnGreaterThanOrEqualTo(Object value) {
            addCriterion("latest_end_lsn >=", value, "latestEndLsn");
            return (Criteria) this;
        }

        public Criteria andLatestEndLsnLessThan(Object value) {
            addCriterion("latest_end_lsn <", value, "latestEndLsn");
            return (Criteria) this;
        }

        public Criteria andLatestEndLsnLessThanOrEqualTo(Object value) {
            addCriterion("latest_end_lsn <=", value, "latestEndLsn");
            return (Criteria) this;
        }

        public Criteria andLatestEndLsnIn(List<Object> values) {
            addCriterion("latest_end_lsn in", values, "latestEndLsn");
            return (Criteria) this;
        }

        public Criteria andLatestEndLsnNotIn(List<Object> values) {
            addCriterion("latest_end_lsn not in", values, "latestEndLsn");
            return (Criteria) this;
        }

        public Criteria andLatestEndLsnBetween(Object value1, Object value2) {
            addCriterion("latest_end_lsn between", value1, value2, "latestEndLsn");
            return (Criteria) this;
        }

        public Criteria andLatestEndLsnNotBetween(Object value1, Object value2) {
            addCriterion("latest_end_lsn not between", value1, value2, "latestEndLsn");
            return (Criteria) this;
        }

        public Criteria andLatestEndTimeIsNull() {
            addCriterion("latest_end_time is null");
            return (Criteria) this;
        }

        public Criteria andLatestEndTimeIsNotNull() {
            addCriterion("latest_end_time is not null");
            return (Criteria) this;
        }

        public Criteria andLatestEndTimeEqualTo(Date value) {
            addCriterion("latest_end_time =", value, "latestEndTime");
            return (Criteria) this;
        }

        public Criteria andLatestEndTimeNotEqualTo(Date value) {
            addCriterion("latest_end_time <>", value, "latestEndTime");
            return (Criteria) this;
        }

        public Criteria andLatestEndTimeGreaterThan(Date value) {
            addCriterion("latest_end_time >", value, "latestEndTime");
            return (Criteria) this;
        }

        public Criteria andLatestEndTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("latest_end_time >=", value, "latestEndTime");
            return (Criteria) this;
        }

        public Criteria andLatestEndTimeLessThan(Date value) {
            addCriterion("latest_end_time <", value, "latestEndTime");
            return (Criteria) this;
        }

        public Criteria andLatestEndTimeLessThanOrEqualTo(Date value) {
            addCriterion("latest_end_time <=", value, "latestEndTime");
            return (Criteria) this;
        }

        public Criteria andLatestEndTimeIn(List<Date> values) {
            addCriterion("latest_end_time in", values, "latestEndTime");
            return (Criteria) this;
        }

        public Criteria andLatestEndTimeNotIn(List<Date> values) {
            addCriterion("latest_end_time not in", values, "latestEndTime");
            return (Criteria) this;
        }

        public Criteria andLatestEndTimeBetween(Date value1, Date value2) {
            addCriterion("latest_end_time between", value1, value2, "latestEndTime");
            return (Criteria) this;
        }

        public Criteria andLatestEndTimeNotBetween(Date value1, Date value2) {
            addCriterion("latest_end_time not between", value1, value2, "latestEndTime");
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