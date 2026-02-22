package com.pool.readio.mbg.model;

import java.util.ArrayList;
import java.util.List;

public class PgAiosExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PgAiosExample() {
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

        public Criteria andIoIdIsNull() {
            addCriterion("io_id is null");
            return (Criteria) this;
        }

        public Criteria andIoIdIsNotNull() {
            addCriterion("io_id is not null");
            return (Criteria) this;
        }

        public Criteria andIoIdEqualTo(Integer value) {
            addCriterion("io_id =", value, "ioId");
            return (Criteria) this;
        }

        public Criteria andIoIdNotEqualTo(Integer value) {
            addCriterion("io_id <>", value, "ioId");
            return (Criteria) this;
        }

        public Criteria andIoIdGreaterThan(Integer value) {
            addCriterion("io_id >", value, "ioId");
            return (Criteria) this;
        }

        public Criteria andIoIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("io_id >=", value, "ioId");
            return (Criteria) this;
        }

        public Criteria andIoIdLessThan(Integer value) {
            addCriterion("io_id <", value, "ioId");
            return (Criteria) this;
        }

        public Criteria andIoIdLessThanOrEqualTo(Integer value) {
            addCriterion("io_id <=", value, "ioId");
            return (Criteria) this;
        }

        public Criteria andIoIdIn(List<Integer> values) {
            addCriterion("io_id in", values, "ioId");
            return (Criteria) this;
        }

        public Criteria andIoIdNotIn(List<Integer> values) {
            addCriterion("io_id not in", values, "ioId");
            return (Criteria) this;
        }

        public Criteria andIoIdBetween(Integer value1, Integer value2) {
            addCriterion("io_id between", value1, value2, "ioId");
            return (Criteria) this;
        }

        public Criteria andIoIdNotBetween(Integer value1, Integer value2) {
            addCriterion("io_id not between", value1, value2, "ioId");
            return (Criteria) this;
        }

        public Criteria andIoGenerationIsNull() {
            addCriterion("io_generation is null");
            return (Criteria) this;
        }

        public Criteria andIoGenerationIsNotNull() {
            addCriterion("io_generation is not null");
            return (Criteria) this;
        }

        public Criteria andIoGenerationEqualTo(Long value) {
            addCriterion("io_generation =", value, "ioGeneration");
            return (Criteria) this;
        }

        public Criteria andIoGenerationNotEqualTo(Long value) {
            addCriterion("io_generation <>", value, "ioGeneration");
            return (Criteria) this;
        }

        public Criteria andIoGenerationGreaterThan(Long value) {
            addCriterion("io_generation >", value, "ioGeneration");
            return (Criteria) this;
        }

        public Criteria andIoGenerationGreaterThanOrEqualTo(Long value) {
            addCriterion("io_generation >=", value, "ioGeneration");
            return (Criteria) this;
        }

        public Criteria andIoGenerationLessThan(Long value) {
            addCriterion("io_generation <", value, "ioGeneration");
            return (Criteria) this;
        }

        public Criteria andIoGenerationLessThanOrEqualTo(Long value) {
            addCriterion("io_generation <=", value, "ioGeneration");
            return (Criteria) this;
        }

        public Criteria andIoGenerationIn(List<Long> values) {
            addCriterion("io_generation in", values, "ioGeneration");
            return (Criteria) this;
        }

        public Criteria andIoGenerationNotIn(List<Long> values) {
            addCriterion("io_generation not in", values, "ioGeneration");
            return (Criteria) this;
        }

        public Criteria andIoGenerationBetween(Long value1, Long value2) {
            addCriterion("io_generation between", value1, value2, "ioGeneration");
            return (Criteria) this;
        }

        public Criteria andIoGenerationNotBetween(Long value1, Long value2) {
            addCriterion("io_generation not between", value1, value2, "ioGeneration");
            return (Criteria) this;
        }

        public Criteria andStateIsNull() {
            addCriterion("state is null");
            return (Criteria) this;
        }

        public Criteria andStateIsNotNull() {
            addCriterion("state is not null");
            return (Criteria) this;
        }

        public Criteria andStateEqualTo(String value) {
            addCriterion("state =", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotEqualTo(String value) {
            addCriterion("state <>", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThan(String value) {
            addCriterion("state >", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThanOrEqualTo(String value) {
            addCriterion("state >=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThan(String value) {
            addCriterion("state <", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThanOrEqualTo(String value) {
            addCriterion("state <=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLike(String value) {
            addCriterion("state like", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotLike(String value) {
            addCriterion("state not like", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateIn(List<String> values) {
            addCriterion("state in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotIn(List<String> values) {
            addCriterion("state not in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateBetween(String value1, String value2) {
            addCriterion("state between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotBetween(String value1, String value2) {
            addCriterion("state not between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andOperationIsNull() {
            addCriterion("operation is null");
            return (Criteria) this;
        }

        public Criteria andOperationIsNotNull() {
            addCriterion("operation is not null");
            return (Criteria) this;
        }

        public Criteria andOperationEqualTo(String value) {
            addCriterion("operation =", value, "operation");
            return (Criteria) this;
        }

        public Criteria andOperationNotEqualTo(String value) {
            addCriterion("operation <>", value, "operation");
            return (Criteria) this;
        }

        public Criteria andOperationGreaterThan(String value) {
            addCriterion("operation >", value, "operation");
            return (Criteria) this;
        }

        public Criteria andOperationGreaterThanOrEqualTo(String value) {
            addCriterion("operation >=", value, "operation");
            return (Criteria) this;
        }

        public Criteria andOperationLessThan(String value) {
            addCriterion("operation <", value, "operation");
            return (Criteria) this;
        }

        public Criteria andOperationLessThanOrEqualTo(String value) {
            addCriterion("operation <=", value, "operation");
            return (Criteria) this;
        }

        public Criteria andOperationLike(String value) {
            addCriterion("operation like", value, "operation");
            return (Criteria) this;
        }

        public Criteria andOperationNotLike(String value) {
            addCriterion("operation not like", value, "operation");
            return (Criteria) this;
        }

        public Criteria andOperationIn(List<String> values) {
            addCriterion("operation in", values, "operation");
            return (Criteria) this;
        }

        public Criteria andOperationNotIn(List<String> values) {
            addCriterion("operation not in", values, "operation");
            return (Criteria) this;
        }

        public Criteria andOperationBetween(String value1, String value2) {
            addCriterion("operation between", value1, value2, "operation");
            return (Criteria) this;
        }

        public Criteria andOperationNotBetween(String value1, String value2) {
            addCriterion("operation not between", value1, value2, "operation");
            return (Criteria) this;
        }

        public Criteria andOffIsNull() {
            addCriterion("off is null");
            return (Criteria) this;
        }

        public Criteria andOffIsNotNull() {
            addCriterion("off is not null");
            return (Criteria) this;
        }

        public Criteria andOffEqualTo(Long value) {
            addCriterion("off =", value, "off");
            return (Criteria) this;
        }

        public Criteria andOffNotEqualTo(Long value) {
            addCriterion("off <>", value, "off");
            return (Criteria) this;
        }

        public Criteria andOffGreaterThan(Long value) {
            addCriterion("off >", value, "off");
            return (Criteria) this;
        }

        public Criteria andOffGreaterThanOrEqualTo(Long value) {
            addCriterion("off >=", value, "off");
            return (Criteria) this;
        }

        public Criteria andOffLessThan(Long value) {
            addCriterion("off <", value, "off");
            return (Criteria) this;
        }

        public Criteria andOffLessThanOrEqualTo(Long value) {
            addCriterion("off <=", value, "off");
            return (Criteria) this;
        }

        public Criteria andOffIn(List<Long> values) {
            addCriterion("off in", values, "off");
            return (Criteria) this;
        }

        public Criteria andOffNotIn(List<Long> values) {
            addCriterion("off not in", values, "off");
            return (Criteria) this;
        }

        public Criteria andOffBetween(Long value1, Long value2) {
            addCriterion("off between", value1, value2, "off");
            return (Criteria) this;
        }

        public Criteria andOffNotBetween(Long value1, Long value2) {
            addCriterion("off not between", value1, value2, "off");
            return (Criteria) this;
        }

        public Criteria andLengthIsNull() {
            addCriterion("length is null");
            return (Criteria) this;
        }

        public Criteria andLengthIsNotNull() {
            addCriterion("length is not null");
            return (Criteria) this;
        }

        public Criteria andLengthEqualTo(Long value) {
            addCriterion("length =", value, "length");
            return (Criteria) this;
        }

        public Criteria andLengthNotEqualTo(Long value) {
            addCriterion("length <>", value, "length");
            return (Criteria) this;
        }

        public Criteria andLengthGreaterThan(Long value) {
            addCriterion("length >", value, "length");
            return (Criteria) this;
        }

        public Criteria andLengthGreaterThanOrEqualTo(Long value) {
            addCriterion("length >=", value, "length");
            return (Criteria) this;
        }

        public Criteria andLengthLessThan(Long value) {
            addCriterion("length <", value, "length");
            return (Criteria) this;
        }

        public Criteria andLengthLessThanOrEqualTo(Long value) {
            addCriterion("length <=", value, "length");
            return (Criteria) this;
        }

        public Criteria andLengthIn(List<Long> values) {
            addCriterion("length in", values, "length");
            return (Criteria) this;
        }

        public Criteria andLengthNotIn(List<Long> values) {
            addCriterion("length not in", values, "length");
            return (Criteria) this;
        }

        public Criteria andLengthBetween(Long value1, Long value2) {
            addCriterion("length between", value1, value2, "length");
            return (Criteria) this;
        }

        public Criteria andLengthNotBetween(Long value1, Long value2) {
            addCriterion("length not between", value1, value2, "length");
            return (Criteria) this;
        }

        public Criteria andTargetIsNull() {
            addCriterion("target is null");
            return (Criteria) this;
        }

        public Criteria andTargetIsNotNull() {
            addCriterion("target is not null");
            return (Criteria) this;
        }

        public Criteria andTargetEqualTo(String value) {
            addCriterion("target =", value, "target");
            return (Criteria) this;
        }

        public Criteria andTargetNotEqualTo(String value) {
            addCriterion("target <>", value, "target");
            return (Criteria) this;
        }

        public Criteria andTargetGreaterThan(String value) {
            addCriterion("target >", value, "target");
            return (Criteria) this;
        }

        public Criteria andTargetGreaterThanOrEqualTo(String value) {
            addCriterion("target >=", value, "target");
            return (Criteria) this;
        }

        public Criteria andTargetLessThan(String value) {
            addCriterion("target <", value, "target");
            return (Criteria) this;
        }

        public Criteria andTargetLessThanOrEqualTo(String value) {
            addCriterion("target <=", value, "target");
            return (Criteria) this;
        }

        public Criteria andTargetLike(String value) {
            addCriterion("target like", value, "target");
            return (Criteria) this;
        }

        public Criteria andTargetNotLike(String value) {
            addCriterion("target not like", value, "target");
            return (Criteria) this;
        }

        public Criteria andTargetIn(List<String> values) {
            addCriterion("target in", values, "target");
            return (Criteria) this;
        }

        public Criteria andTargetNotIn(List<String> values) {
            addCriterion("target not in", values, "target");
            return (Criteria) this;
        }

        public Criteria andTargetBetween(String value1, String value2) {
            addCriterion("target between", value1, value2, "target");
            return (Criteria) this;
        }

        public Criteria andTargetNotBetween(String value1, String value2) {
            addCriterion("target not between", value1, value2, "target");
            return (Criteria) this;
        }

        public Criteria andHandleDataLenIsNull() {
            addCriterion("handle_data_len is null");
            return (Criteria) this;
        }

        public Criteria andHandleDataLenIsNotNull() {
            addCriterion("handle_data_len is not null");
            return (Criteria) this;
        }

        public Criteria andHandleDataLenEqualTo(Short value) {
            addCriterion("handle_data_len =", value, "handleDataLen");
            return (Criteria) this;
        }

        public Criteria andHandleDataLenNotEqualTo(Short value) {
            addCriterion("handle_data_len <>", value, "handleDataLen");
            return (Criteria) this;
        }

        public Criteria andHandleDataLenGreaterThan(Short value) {
            addCriterion("handle_data_len >", value, "handleDataLen");
            return (Criteria) this;
        }

        public Criteria andHandleDataLenGreaterThanOrEqualTo(Short value) {
            addCriterion("handle_data_len >=", value, "handleDataLen");
            return (Criteria) this;
        }

        public Criteria andHandleDataLenLessThan(Short value) {
            addCriterion("handle_data_len <", value, "handleDataLen");
            return (Criteria) this;
        }

        public Criteria andHandleDataLenLessThanOrEqualTo(Short value) {
            addCriterion("handle_data_len <=", value, "handleDataLen");
            return (Criteria) this;
        }

        public Criteria andHandleDataLenIn(List<Short> values) {
            addCriterion("handle_data_len in", values, "handleDataLen");
            return (Criteria) this;
        }

        public Criteria andHandleDataLenNotIn(List<Short> values) {
            addCriterion("handle_data_len not in", values, "handleDataLen");
            return (Criteria) this;
        }

        public Criteria andHandleDataLenBetween(Short value1, Short value2) {
            addCriterion("handle_data_len between", value1, value2, "handleDataLen");
            return (Criteria) this;
        }

        public Criteria andHandleDataLenNotBetween(Short value1, Short value2) {
            addCriterion("handle_data_len not between", value1, value2, "handleDataLen");
            return (Criteria) this;
        }

        public Criteria andRawResultIsNull() {
            addCriterion("raw_result is null");
            return (Criteria) this;
        }

        public Criteria andRawResultIsNotNull() {
            addCriterion("raw_result is not null");
            return (Criteria) this;
        }

        public Criteria andRawResultEqualTo(Integer value) {
            addCriterion("raw_result =", value, "rawResult");
            return (Criteria) this;
        }

        public Criteria andRawResultNotEqualTo(Integer value) {
            addCriterion("raw_result <>", value, "rawResult");
            return (Criteria) this;
        }

        public Criteria andRawResultGreaterThan(Integer value) {
            addCriterion("raw_result >", value, "rawResult");
            return (Criteria) this;
        }

        public Criteria andRawResultGreaterThanOrEqualTo(Integer value) {
            addCriterion("raw_result >=", value, "rawResult");
            return (Criteria) this;
        }

        public Criteria andRawResultLessThan(Integer value) {
            addCriterion("raw_result <", value, "rawResult");
            return (Criteria) this;
        }

        public Criteria andRawResultLessThanOrEqualTo(Integer value) {
            addCriterion("raw_result <=", value, "rawResult");
            return (Criteria) this;
        }

        public Criteria andRawResultIn(List<Integer> values) {
            addCriterion("raw_result in", values, "rawResult");
            return (Criteria) this;
        }

        public Criteria andRawResultNotIn(List<Integer> values) {
            addCriterion("raw_result not in", values, "rawResult");
            return (Criteria) this;
        }

        public Criteria andRawResultBetween(Integer value1, Integer value2) {
            addCriterion("raw_result between", value1, value2, "rawResult");
            return (Criteria) this;
        }

        public Criteria andRawResultNotBetween(Integer value1, Integer value2) {
            addCriterion("raw_result not between", value1, value2, "rawResult");
            return (Criteria) this;
        }

        public Criteria andResultIsNull() {
            addCriterion("result is null");
            return (Criteria) this;
        }

        public Criteria andResultIsNotNull() {
            addCriterion("result is not null");
            return (Criteria) this;
        }

        public Criteria andResultEqualTo(String value) {
            addCriterion("result =", value, "result");
            return (Criteria) this;
        }

        public Criteria andResultNotEqualTo(String value) {
            addCriterion("result <>", value, "result");
            return (Criteria) this;
        }

        public Criteria andResultGreaterThan(String value) {
            addCriterion("result >", value, "result");
            return (Criteria) this;
        }

        public Criteria andResultGreaterThanOrEqualTo(String value) {
            addCriterion("result >=", value, "result");
            return (Criteria) this;
        }

        public Criteria andResultLessThan(String value) {
            addCriterion("result <", value, "result");
            return (Criteria) this;
        }

        public Criteria andResultLessThanOrEqualTo(String value) {
            addCriterion("result <=", value, "result");
            return (Criteria) this;
        }

        public Criteria andResultLike(String value) {
            addCriterion("result like", value, "result");
            return (Criteria) this;
        }

        public Criteria andResultNotLike(String value) {
            addCriterion("result not like", value, "result");
            return (Criteria) this;
        }

        public Criteria andResultIn(List<String> values) {
            addCriterion("result in", values, "result");
            return (Criteria) this;
        }

        public Criteria andResultNotIn(List<String> values) {
            addCriterion("result not in", values, "result");
            return (Criteria) this;
        }

        public Criteria andResultBetween(String value1, String value2) {
            addCriterion("result between", value1, value2, "result");
            return (Criteria) this;
        }

        public Criteria andResultNotBetween(String value1, String value2) {
            addCriterion("result not between", value1, value2, "result");
            return (Criteria) this;
        }

        public Criteria andTargetDescIsNull() {
            addCriterion("target_desc is null");
            return (Criteria) this;
        }

        public Criteria andTargetDescIsNotNull() {
            addCriterion("target_desc is not null");
            return (Criteria) this;
        }

        public Criteria andTargetDescEqualTo(String value) {
            addCriterion("target_desc =", value, "targetDesc");
            return (Criteria) this;
        }

        public Criteria andTargetDescNotEqualTo(String value) {
            addCriterion("target_desc <>", value, "targetDesc");
            return (Criteria) this;
        }

        public Criteria andTargetDescGreaterThan(String value) {
            addCriterion("target_desc >", value, "targetDesc");
            return (Criteria) this;
        }

        public Criteria andTargetDescGreaterThanOrEqualTo(String value) {
            addCriterion("target_desc >=", value, "targetDesc");
            return (Criteria) this;
        }

        public Criteria andTargetDescLessThan(String value) {
            addCriterion("target_desc <", value, "targetDesc");
            return (Criteria) this;
        }

        public Criteria andTargetDescLessThanOrEqualTo(String value) {
            addCriterion("target_desc <=", value, "targetDesc");
            return (Criteria) this;
        }

        public Criteria andTargetDescLike(String value) {
            addCriterion("target_desc like", value, "targetDesc");
            return (Criteria) this;
        }

        public Criteria andTargetDescNotLike(String value) {
            addCriterion("target_desc not like", value, "targetDesc");
            return (Criteria) this;
        }

        public Criteria andTargetDescIn(List<String> values) {
            addCriterion("target_desc in", values, "targetDesc");
            return (Criteria) this;
        }

        public Criteria andTargetDescNotIn(List<String> values) {
            addCriterion("target_desc not in", values, "targetDesc");
            return (Criteria) this;
        }

        public Criteria andTargetDescBetween(String value1, String value2) {
            addCriterion("target_desc between", value1, value2, "targetDesc");
            return (Criteria) this;
        }

        public Criteria andTargetDescNotBetween(String value1, String value2) {
            addCriterion("target_desc not between", value1, value2, "targetDesc");
            return (Criteria) this;
        }

        public Criteria andFSyncIsNull() {
            addCriterion("f_sync is null");
            return (Criteria) this;
        }

        public Criteria andFSyncIsNotNull() {
            addCriterion("f_sync is not null");
            return (Criteria) this;
        }

        public Criteria andFSyncEqualTo(Boolean value) {
            addCriterion("f_sync =", value, "fSync");
            return (Criteria) this;
        }

        public Criteria andFSyncNotEqualTo(Boolean value) {
            addCriterion("f_sync <>", value, "fSync");
            return (Criteria) this;
        }

        public Criteria andFSyncGreaterThan(Boolean value) {
            addCriterion("f_sync >", value, "fSync");
            return (Criteria) this;
        }

        public Criteria andFSyncGreaterThanOrEqualTo(Boolean value) {
            addCriterion("f_sync >=", value, "fSync");
            return (Criteria) this;
        }

        public Criteria andFSyncLessThan(Boolean value) {
            addCriterion("f_sync <", value, "fSync");
            return (Criteria) this;
        }

        public Criteria andFSyncLessThanOrEqualTo(Boolean value) {
            addCriterion("f_sync <=", value, "fSync");
            return (Criteria) this;
        }

        public Criteria andFSyncIn(List<Boolean> values) {
            addCriterion("f_sync in", values, "fSync");
            return (Criteria) this;
        }

        public Criteria andFSyncNotIn(List<Boolean> values) {
            addCriterion("f_sync not in", values, "fSync");
            return (Criteria) this;
        }

        public Criteria andFSyncBetween(Boolean value1, Boolean value2) {
            addCriterion("f_sync between", value1, value2, "fSync");
            return (Criteria) this;
        }

        public Criteria andFSyncNotBetween(Boolean value1, Boolean value2) {
            addCriterion("f_sync not between", value1, value2, "fSync");
            return (Criteria) this;
        }

        public Criteria andFLocalmemIsNull() {
            addCriterion("f_localmem is null");
            return (Criteria) this;
        }

        public Criteria andFLocalmemIsNotNull() {
            addCriterion("f_localmem is not null");
            return (Criteria) this;
        }

        public Criteria andFLocalmemEqualTo(Boolean value) {
            addCriterion("f_localmem =", value, "fLocalmem");
            return (Criteria) this;
        }

        public Criteria andFLocalmemNotEqualTo(Boolean value) {
            addCriterion("f_localmem <>", value, "fLocalmem");
            return (Criteria) this;
        }

        public Criteria andFLocalmemGreaterThan(Boolean value) {
            addCriterion("f_localmem >", value, "fLocalmem");
            return (Criteria) this;
        }

        public Criteria andFLocalmemGreaterThanOrEqualTo(Boolean value) {
            addCriterion("f_localmem >=", value, "fLocalmem");
            return (Criteria) this;
        }

        public Criteria andFLocalmemLessThan(Boolean value) {
            addCriterion("f_localmem <", value, "fLocalmem");
            return (Criteria) this;
        }

        public Criteria andFLocalmemLessThanOrEqualTo(Boolean value) {
            addCriterion("f_localmem <=", value, "fLocalmem");
            return (Criteria) this;
        }

        public Criteria andFLocalmemIn(List<Boolean> values) {
            addCriterion("f_localmem in", values, "fLocalmem");
            return (Criteria) this;
        }

        public Criteria andFLocalmemNotIn(List<Boolean> values) {
            addCriterion("f_localmem not in", values, "fLocalmem");
            return (Criteria) this;
        }

        public Criteria andFLocalmemBetween(Boolean value1, Boolean value2) {
            addCriterion("f_localmem between", value1, value2, "fLocalmem");
            return (Criteria) this;
        }

        public Criteria andFLocalmemNotBetween(Boolean value1, Boolean value2) {
            addCriterion("f_localmem not between", value1, value2, "fLocalmem");
            return (Criteria) this;
        }

        public Criteria andFBufferedIsNull() {
            addCriterion("f_buffered is null");
            return (Criteria) this;
        }

        public Criteria andFBufferedIsNotNull() {
            addCriterion("f_buffered is not null");
            return (Criteria) this;
        }

        public Criteria andFBufferedEqualTo(Boolean value) {
            addCriterion("f_buffered =", value, "fBuffered");
            return (Criteria) this;
        }

        public Criteria andFBufferedNotEqualTo(Boolean value) {
            addCriterion("f_buffered <>", value, "fBuffered");
            return (Criteria) this;
        }

        public Criteria andFBufferedGreaterThan(Boolean value) {
            addCriterion("f_buffered >", value, "fBuffered");
            return (Criteria) this;
        }

        public Criteria andFBufferedGreaterThanOrEqualTo(Boolean value) {
            addCriterion("f_buffered >=", value, "fBuffered");
            return (Criteria) this;
        }

        public Criteria andFBufferedLessThan(Boolean value) {
            addCriterion("f_buffered <", value, "fBuffered");
            return (Criteria) this;
        }

        public Criteria andFBufferedLessThanOrEqualTo(Boolean value) {
            addCriterion("f_buffered <=", value, "fBuffered");
            return (Criteria) this;
        }

        public Criteria andFBufferedIn(List<Boolean> values) {
            addCriterion("f_buffered in", values, "fBuffered");
            return (Criteria) this;
        }

        public Criteria andFBufferedNotIn(List<Boolean> values) {
            addCriterion("f_buffered not in", values, "fBuffered");
            return (Criteria) this;
        }

        public Criteria andFBufferedBetween(Boolean value1, Boolean value2) {
            addCriterion("f_buffered between", value1, value2, "fBuffered");
            return (Criteria) this;
        }

        public Criteria andFBufferedNotBetween(Boolean value1, Boolean value2) {
            addCriterion("f_buffered not between", value1, value2, "fBuffered");
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