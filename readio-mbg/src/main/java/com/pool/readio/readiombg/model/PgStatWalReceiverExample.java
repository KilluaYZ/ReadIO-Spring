package com.pool.readio.readiombg.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PgStatWalReceiverExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PgStatWalReceiverExample() {
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

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(String value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(String value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(String value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(String value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(String value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(String value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLike(String value) {
            addCriterion("status like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotLike(String value) {
            addCriterion("status not like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<String> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<String> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(String value1, String value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(String value1, String value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andReceiveStartLsnIsNull() {
            addCriterion("receive_start_lsn is null");
            return (Criteria) this;
        }

        public Criteria andReceiveStartLsnIsNotNull() {
            addCriterion("receive_start_lsn is not null");
            return (Criteria) this;
        }

        public Criteria andReceiveStartLsnEqualTo(Object value) {
            addCriterion("receive_start_lsn =", value, "receiveStartLsn");
            return (Criteria) this;
        }

        public Criteria andReceiveStartLsnNotEqualTo(Object value) {
            addCriterion("receive_start_lsn <>", value, "receiveStartLsn");
            return (Criteria) this;
        }

        public Criteria andReceiveStartLsnGreaterThan(Object value) {
            addCriterion("receive_start_lsn >", value, "receiveStartLsn");
            return (Criteria) this;
        }

        public Criteria andReceiveStartLsnGreaterThanOrEqualTo(Object value) {
            addCriterion("receive_start_lsn >=", value, "receiveStartLsn");
            return (Criteria) this;
        }

        public Criteria andReceiveStartLsnLessThan(Object value) {
            addCriterion("receive_start_lsn <", value, "receiveStartLsn");
            return (Criteria) this;
        }

        public Criteria andReceiveStartLsnLessThanOrEqualTo(Object value) {
            addCriterion("receive_start_lsn <=", value, "receiveStartLsn");
            return (Criteria) this;
        }

        public Criteria andReceiveStartLsnIn(List<Object> values) {
            addCriterion("receive_start_lsn in", values, "receiveStartLsn");
            return (Criteria) this;
        }

        public Criteria andReceiveStartLsnNotIn(List<Object> values) {
            addCriterion("receive_start_lsn not in", values, "receiveStartLsn");
            return (Criteria) this;
        }

        public Criteria andReceiveStartLsnBetween(Object value1, Object value2) {
            addCriterion("receive_start_lsn between", value1, value2, "receiveStartLsn");
            return (Criteria) this;
        }

        public Criteria andReceiveStartLsnNotBetween(Object value1, Object value2) {
            addCriterion("receive_start_lsn not between", value1, value2, "receiveStartLsn");
            return (Criteria) this;
        }

        public Criteria andReceiveStartTliIsNull() {
            addCriterion("receive_start_tli is null");
            return (Criteria) this;
        }

        public Criteria andReceiveStartTliIsNotNull() {
            addCriterion("receive_start_tli is not null");
            return (Criteria) this;
        }

        public Criteria andReceiveStartTliEqualTo(Integer value) {
            addCriterion("receive_start_tli =", value, "receiveStartTli");
            return (Criteria) this;
        }

        public Criteria andReceiveStartTliNotEqualTo(Integer value) {
            addCriterion("receive_start_tli <>", value, "receiveStartTli");
            return (Criteria) this;
        }

        public Criteria andReceiveStartTliGreaterThan(Integer value) {
            addCriterion("receive_start_tli >", value, "receiveStartTli");
            return (Criteria) this;
        }

        public Criteria andReceiveStartTliGreaterThanOrEqualTo(Integer value) {
            addCriterion("receive_start_tli >=", value, "receiveStartTli");
            return (Criteria) this;
        }

        public Criteria andReceiveStartTliLessThan(Integer value) {
            addCriterion("receive_start_tli <", value, "receiveStartTli");
            return (Criteria) this;
        }

        public Criteria andReceiveStartTliLessThanOrEqualTo(Integer value) {
            addCriterion("receive_start_tli <=", value, "receiveStartTli");
            return (Criteria) this;
        }

        public Criteria andReceiveStartTliIn(List<Integer> values) {
            addCriterion("receive_start_tli in", values, "receiveStartTli");
            return (Criteria) this;
        }

        public Criteria andReceiveStartTliNotIn(List<Integer> values) {
            addCriterion("receive_start_tli not in", values, "receiveStartTli");
            return (Criteria) this;
        }

        public Criteria andReceiveStartTliBetween(Integer value1, Integer value2) {
            addCriterion("receive_start_tli between", value1, value2, "receiveStartTli");
            return (Criteria) this;
        }

        public Criteria andReceiveStartTliNotBetween(Integer value1, Integer value2) {
            addCriterion("receive_start_tli not between", value1, value2, "receiveStartTli");
            return (Criteria) this;
        }

        public Criteria andWrittenLsnIsNull() {
            addCriterion("written_lsn is null");
            return (Criteria) this;
        }

        public Criteria andWrittenLsnIsNotNull() {
            addCriterion("written_lsn is not null");
            return (Criteria) this;
        }

        public Criteria andWrittenLsnEqualTo(Object value) {
            addCriterion("written_lsn =", value, "writtenLsn");
            return (Criteria) this;
        }

        public Criteria andWrittenLsnNotEqualTo(Object value) {
            addCriterion("written_lsn <>", value, "writtenLsn");
            return (Criteria) this;
        }

        public Criteria andWrittenLsnGreaterThan(Object value) {
            addCriterion("written_lsn >", value, "writtenLsn");
            return (Criteria) this;
        }

        public Criteria andWrittenLsnGreaterThanOrEqualTo(Object value) {
            addCriterion("written_lsn >=", value, "writtenLsn");
            return (Criteria) this;
        }

        public Criteria andWrittenLsnLessThan(Object value) {
            addCriterion("written_lsn <", value, "writtenLsn");
            return (Criteria) this;
        }

        public Criteria andWrittenLsnLessThanOrEqualTo(Object value) {
            addCriterion("written_lsn <=", value, "writtenLsn");
            return (Criteria) this;
        }

        public Criteria andWrittenLsnIn(List<Object> values) {
            addCriterion("written_lsn in", values, "writtenLsn");
            return (Criteria) this;
        }

        public Criteria andWrittenLsnNotIn(List<Object> values) {
            addCriterion("written_lsn not in", values, "writtenLsn");
            return (Criteria) this;
        }

        public Criteria andWrittenLsnBetween(Object value1, Object value2) {
            addCriterion("written_lsn between", value1, value2, "writtenLsn");
            return (Criteria) this;
        }

        public Criteria andWrittenLsnNotBetween(Object value1, Object value2) {
            addCriterion("written_lsn not between", value1, value2, "writtenLsn");
            return (Criteria) this;
        }

        public Criteria andFlushedLsnIsNull() {
            addCriterion("flushed_lsn is null");
            return (Criteria) this;
        }

        public Criteria andFlushedLsnIsNotNull() {
            addCriterion("flushed_lsn is not null");
            return (Criteria) this;
        }

        public Criteria andFlushedLsnEqualTo(Object value) {
            addCriterion("flushed_lsn =", value, "flushedLsn");
            return (Criteria) this;
        }

        public Criteria andFlushedLsnNotEqualTo(Object value) {
            addCriterion("flushed_lsn <>", value, "flushedLsn");
            return (Criteria) this;
        }

        public Criteria andFlushedLsnGreaterThan(Object value) {
            addCriterion("flushed_lsn >", value, "flushedLsn");
            return (Criteria) this;
        }

        public Criteria andFlushedLsnGreaterThanOrEqualTo(Object value) {
            addCriterion("flushed_lsn >=", value, "flushedLsn");
            return (Criteria) this;
        }

        public Criteria andFlushedLsnLessThan(Object value) {
            addCriterion("flushed_lsn <", value, "flushedLsn");
            return (Criteria) this;
        }

        public Criteria andFlushedLsnLessThanOrEqualTo(Object value) {
            addCriterion("flushed_lsn <=", value, "flushedLsn");
            return (Criteria) this;
        }

        public Criteria andFlushedLsnIn(List<Object> values) {
            addCriterion("flushed_lsn in", values, "flushedLsn");
            return (Criteria) this;
        }

        public Criteria andFlushedLsnNotIn(List<Object> values) {
            addCriterion("flushed_lsn not in", values, "flushedLsn");
            return (Criteria) this;
        }

        public Criteria andFlushedLsnBetween(Object value1, Object value2) {
            addCriterion("flushed_lsn between", value1, value2, "flushedLsn");
            return (Criteria) this;
        }

        public Criteria andFlushedLsnNotBetween(Object value1, Object value2) {
            addCriterion("flushed_lsn not between", value1, value2, "flushedLsn");
            return (Criteria) this;
        }

        public Criteria andReceivedTliIsNull() {
            addCriterion("received_tli is null");
            return (Criteria) this;
        }

        public Criteria andReceivedTliIsNotNull() {
            addCriterion("received_tli is not null");
            return (Criteria) this;
        }

        public Criteria andReceivedTliEqualTo(Integer value) {
            addCriterion("received_tli =", value, "receivedTli");
            return (Criteria) this;
        }

        public Criteria andReceivedTliNotEqualTo(Integer value) {
            addCriterion("received_tli <>", value, "receivedTli");
            return (Criteria) this;
        }

        public Criteria andReceivedTliGreaterThan(Integer value) {
            addCriterion("received_tli >", value, "receivedTli");
            return (Criteria) this;
        }

        public Criteria andReceivedTliGreaterThanOrEqualTo(Integer value) {
            addCriterion("received_tli >=", value, "receivedTli");
            return (Criteria) this;
        }

        public Criteria andReceivedTliLessThan(Integer value) {
            addCriterion("received_tli <", value, "receivedTli");
            return (Criteria) this;
        }

        public Criteria andReceivedTliLessThanOrEqualTo(Integer value) {
            addCriterion("received_tli <=", value, "receivedTli");
            return (Criteria) this;
        }

        public Criteria andReceivedTliIn(List<Integer> values) {
            addCriterion("received_tli in", values, "receivedTli");
            return (Criteria) this;
        }

        public Criteria andReceivedTliNotIn(List<Integer> values) {
            addCriterion("received_tli not in", values, "receivedTli");
            return (Criteria) this;
        }

        public Criteria andReceivedTliBetween(Integer value1, Integer value2) {
            addCriterion("received_tli between", value1, value2, "receivedTli");
            return (Criteria) this;
        }

        public Criteria andReceivedTliNotBetween(Integer value1, Integer value2) {
            addCriterion("received_tli not between", value1, value2, "receivedTli");
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

        public Criteria andSenderHostIsNull() {
            addCriterion("sender_host is null");
            return (Criteria) this;
        }

        public Criteria andSenderHostIsNotNull() {
            addCriterion("sender_host is not null");
            return (Criteria) this;
        }

        public Criteria andSenderHostEqualTo(String value) {
            addCriterion("sender_host =", value, "senderHost");
            return (Criteria) this;
        }

        public Criteria andSenderHostNotEqualTo(String value) {
            addCriterion("sender_host <>", value, "senderHost");
            return (Criteria) this;
        }

        public Criteria andSenderHostGreaterThan(String value) {
            addCriterion("sender_host >", value, "senderHost");
            return (Criteria) this;
        }

        public Criteria andSenderHostGreaterThanOrEqualTo(String value) {
            addCriterion("sender_host >=", value, "senderHost");
            return (Criteria) this;
        }

        public Criteria andSenderHostLessThan(String value) {
            addCriterion("sender_host <", value, "senderHost");
            return (Criteria) this;
        }

        public Criteria andSenderHostLessThanOrEqualTo(String value) {
            addCriterion("sender_host <=", value, "senderHost");
            return (Criteria) this;
        }

        public Criteria andSenderHostLike(String value) {
            addCriterion("sender_host like", value, "senderHost");
            return (Criteria) this;
        }

        public Criteria andSenderHostNotLike(String value) {
            addCriterion("sender_host not like", value, "senderHost");
            return (Criteria) this;
        }

        public Criteria andSenderHostIn(List<String> values) {
            addCriterion("sender_host in", values, "senderHost");
            return (Criteria) this;
        }

        public Criteria andSenderHostNotIn(List<String> values) {
            addCriterion("sender_host not in", values, "senderHost");
            return (Criteria) this;
        }

        public Criteria andSenderHostBetween(String value1, String value2) {
            addCriterion("sender_host between", value1, value2, "senderHost");
            return (Criteria) this;
        }

        public Criteria andSenderHostNotBetween(String value1, String value2) {
            addCriterion("sender_host not between", value1, value2, "senderHost");
            return (Criteria) this;
        }

        public Criteria andSenderPortIsNull() {
            addCriterion("sender_port is null");
            return (Criteria) this;
        }

        public Criteria andSenderPortIsNotNull() {
            addCriterion("sender_port is not null");
            return (Criteria) this;
        }

        public Criteria andSenderPortEqualTo(Integer value) {
            addCriterion("sender_port =", value, "senderPort");
            return (Criteria) this;
        }

        public Criteria andSenderPortNotEqualTo(Integer value) {
            addCriterion("sender_port <>", value, "senderPort");
            return (Criteria) this;
        }

        public Criteria andSenderPortGreaterThan(Integer value) {
            addCriterion("sender_port >", value, "senderPort");
            return (Criteria) this;
        }

        public Criteria andSenderPortGreaterThanOrEqualTo(Integer value) {
            addCriterion("sender_port >=", value, "senderPort");
            return (Criteria) this;
        }

        public Criteria andSenderPortLessThan(Integer value) {
            addCriterion("sender_port <", value, "senderPort");
            return (Criteria) this;
        }

        public Criteria andSenderPortLessThanOrEqualTo(Integer value) {
            addCriterion("sender_port <=", value, "senderPort");
            return (Criteria) this;
        }

        public Criteria andSenderPortIn(List<Integer> values) {
            addCriterion("sender_port in", values, "senderPort");
            return (Criteria) this;
        }

        public Criteria andSenderPortNotIn(List<Integer> values) {
            addCriterion("sender_port not in", values, "senderPort");
            return (Criteria) this;
        }

        public Criteria andSenderPortBetween(Integer value1, Integer value2) {
            addCriterion("sender_port between", value1, value2, "senderPort");
            return (Criteria) this;
        }

        public Criteria andSenderPortNotBetween(Integer value1, Integer value2) {
            addCriterion("sender_port not between", value1, value2, "senderPort");
            return (Criteria) this;
        }

        public Criteria andConninfoIsNull() {
            addCriterion("conninfo is null");
            return (Criteria) this;
        }

        public Criteria andConninfoIsNotNull() {
            addCriterion("conninfo is not null");
            return (Criteria) this;
        }

        public Criteria andConninfoEqualTo(String value) {
            addCriterion("conninfo =", value, "conninfo");
            return (Criteria) this;
        }

        public Criteria andConninfoNotEqualTo(String value) {
            addCriterion("conninfo <>", value, "conninfo");
            return (Criteria) this;
        }

        public Criteria andConninfoGreaterThan(String value) {
            addCriterion("conninfo >", value, "conninfo");
            return (Criteria) this;
        }

        public Criteria andConninfoGreaterThanOrEqualTo(String value) {
            addCriterion("conninfo >=", value, "conninfo");
            return (Criteria) this;
        }

        public Criteria andConninfoLessThan(String value) {
            addCriterion("conninfo <", value, "conninfo");
            return (Criteria) this;
        }

        public Criteria andConninfoLessThanOrEqualTo(String value) {
            addCriterion("conninfo <=", value, "conninfo");
            return (Criteria) this;
        }

        public Criteria andConninfoLike(String value) {
            addCriterion("conninfo like", value, "conninfo");
            return (Criteria) this;
        }

        public Criteria andConninfoNotLike(String value) {
            addCriterion("conninfo not like", value, "conninfo");
            return (Criteria) this;
        }

        public Criteria andConninfoIn(List<String> values) {
            addCriterion("conninfo in", values, "conninfo");
            return (Criteria) this;
        }

        public Criteria andConninfoNotIn(List<String> values) {
            addCriterion("conninfo not in", values, "conninfo");
            return (Criteria) this;
        }

        public Criteria andConninfoBetween(String value1, String value2) {
            addCriterion("conninfo between", value1, value2, "conninfo");
            return (Criteria) this;
        }

        public Criteria andConninfoNotBetween(String value1, String value2) {
            addCriterion("conninfo not between", value1, value2, "conninfo");
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