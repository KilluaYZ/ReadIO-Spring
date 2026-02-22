package com.pool.readio.readiombg.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PgStatIoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PgStatIoExample() {
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

        public Criteria andBackendTypeIsNull() {
            addCriterion("backend_type is null");
            return (Criteria) this;
        }

        public Criteria andBackendTypeIsNotNull() {
            addCriterion("backend_type is not null");
            return (Criteria) this;
        }

        public Criteria andBackendTypeEqualTo(String value) {
            addCriterion("backend_type =", value, "backendType");
            return (Criteria) this;
        }

        public Criteria andBackendTypeNotEqualTo(String value) {
            addCriterion("backend_type <>", value, "backendType");
            return (Criteria) this;
        }

        public Criteria andBackendTypeGreaterThan(String value) {
            addCriterion("backend_type >", value, "backendType");
            return (Criteria) this;
        }

        public Criteria andBackendTypeGreaterThanOrEqualTo(String value) {
            addCriterion("backend_type >=", value, "backendType");
            return (Criteria) this;
        }

        public Criteria andBackendTypeLessThan(String value) {
            addCriterion("backend_type <", value, "backendType");
            return (Criteria) this;
        }

        public Criteria andBackendTypeLessThanOrEqualTo(String value) {
            addCriterion("backend_type <=", value, "backendType");
            return (Criteria) this;
        }

        public Criteria andBackendTypeLike(String value) {
            addCriterion("backend_type like", value, "backendType");
            return (Criteria) this;
        }

        public Criteria andBackendTypeNotLike(String value) {
            addCriterion("backend_type not like", value, "backendType");
            return (Criteria) this;
        }

        public Criteria andBackendTypeIn(List<String> values) {
            addCriterion("backend_type in", values, "backendType");
            return (Criteria) this;
        }

        public Criteria andBackendTypeNotIn(List<String> values) {
            addCriterion("backend_type not in", values, "backendType");
            return (Criteria) this;
        }

        public Criteria andBackendTypeBetween(String value1, String value2) {
            addCriterion("backend_type between", value1, value2, "backendType");
            return (Criteria) this;
        }

        public Criteria andBackendTypeNotBetween(String value1, String value2) {
            addCriterion("backend_type not between", value1, value2, "backendType");
            return (Criteria) this;
        }

        public Criteria andObjectIsNull() {
            addCriterion("object is null");
            return (Criteria) this;
        }

        public Criteria andObjectIsNotNull() {
            addCriterion("object is not null");
            return (Criteria) this;
        }

        public Criteria andObjectEqualTo(String value) {
            addCriterion("object =", value, "object");
            return (Criteria) this;
        }

        public Criteria andObjectNotEqualTo(String value) {
            addCriterion("object <>", value, "object");
            return (Criteria) this;
        }

        public Criteria andObjectGreaterThan(String value) {
            addCriterion("object >", value, "object");
            return (Criteria) this;
        }

        public Criteria andObjectGreaterThanOrEqualTo(String value) {
            addCriterion("object >=", value, "object");
            return (Criteria) this;
        }

        public Criteria andObjectLessThan(String value) {
            addCriterion("object <", value, "object");
            return (Criteria) this;
        }

        public Criteria andObjectLessThanOrEqualTo(String value) {
            addCriterion("object <=", value, "object");
            return (Criteria) this;
        }

        public Criteria andObjectLike(String value) {
            addCriterion("object like", value, "object");
            return (Criteria) this;
        }

        public Criteria andObjectNotLike(String value) {
            addCriterion("object not like", value, "object");
            return (Criteria) this;
        }

        public Criteria andObjectIn(List<String> values) {
            addCriterion("object in", values, "object");
            return (Criteria) this;
        }

        public Criteria andObjectNotIn(List<String> values) {
            addCriterion("object not in", values, "object");
            return (Criteria) this;
        }

        public Criteria andObjectBetween(String value1, String value2) {
            addCriterion("object between", value1, value2, "object");
            return (Criteria) this;
        }

        public Criteria andObjectNotBetween(String value1, String value2) {
            addCriterion("object not between", value1, value2, "object");
            return (Criteria) this;
        }

        public Criteria andContextIsNull() {
            addCriterion("context is null");
            return (Criteria) this;
        }

        public Criteria andContextIsNotNull() {
            addCriterion("context is not null");
            return (Criteria) this;
        }

        public Criteria andContextEqualTo(String value) {
            addCriterion("context =", value, "context");
            return (Criteria) this;
        }

        public Criteria andContextNotEqualTo(String value) {
            addCriterion("context <>", value, "context");
            return (Criteria) this;
        }

        public Criteria andContextGreaterThan(String value) {
            addCriterion("context >", value, "context");
            return (Criteria) this;
        }

        public Criteria andContextGreaterThanOrEqualTo(String value) {
            addCriterion("context >=", value, "context");
            return (Criteria) this;
        }

        public Criteria andContextLessThan(String value) {
            addCriterion("context <", value, "context");
            return (Criteria) this;
        }

        public Criteria andContextLessThanOrEqualTo(String value) {
            addCriterion("context <=", value, "context");
            return (Criteria) this;
        }

        public Criteria andContextLike(String value) {
            addCriterion("context like", value, "context");
            return (Criteria) this;
        }

        public Criteria andContextNotLike(String value) {
            addCriterion("context not like", value, "context");
            return (Criteria) this;
        }

        public Criteria andContextIn(List<String> values) {
            addCriterion("context in", values, "context");
            return (Criteria) this;
        }

        public Criteria andContextNotIn(List<String> values) {
            addCriterion("context not in", values, "context");
            return (Criteria) this;
        }

        public Criteria andContextBetween(String value1, String value2) {
            addCriterion("context between", value1, value2, "context");
            return (Criteria) this;
        }

        public Criteria andContextNotBetween(String value1, String value2) {
            addCriterion("context not between", value1, value2, "context");
            return (Criteria) this;
        }

        public Criteria andReadsIsNull() {
            addCriterion("reads is null");
            return (Criteria) this;
        }

        public Criteria andReadsIsNotNull() {
            addCriterion("reads is not null");
            return (Criteria) this;
        }

        public Criteria andReadsEqualTo(Long value) {
            addCriterion("reads =", value, "reads");
            return (Criteria) this;
        }

        public Criteria andReadsNotEqualTo(Long value) {
            addCriterion("reads <>", value, "reads");
            return (Criteria) this;
        }

        public Criteria andReadsGreaterThan(Long value) {
            addCriterion("reads >", value, "reads");
            return (Criteria) this;
        }

        public Criteria andReadsGreaterThanOrEqualTo(Long value) {
            addCriterion("reads >=", value, "reads");
            return (Criteria) this;
        }

        public Criteria andReadsLessThan(Long value) {
            addCriterion("reads <", value, "reads");
            return (Criteria) this;
        }

        public Criteria andReadsLessThanOrEqualTo(Long value) {
            addCriterion("reads <=", value, "reads");
            return (Criteria) this;
        }

        public Criteria andReadsIn(List<Long> values) {
            addCriterion("reads in", values, "reads");
            return (Criteria) this;
        }

        public Criteria andReadsNotIn(List<Long> values) {
            addCriterion("reads not in", values, "reads");
            return (Criteria) this;
        }

        public Criteria andReadsBetween(Long value1, Long value2) {
            addCriterion("reads between", value1, value2, "reads");
            return (Criteria) this;
        }

        public Criteria andReadsNotBetween(Long value1, Long value2) {
            addCriterion("reads not between", value1, value2, "reads");
            return (Criteria) this;
        }

        public Criteria andReadBytesIsNull() {
            addCriterion("read_bytes is null");
            return (Criteria) this;
        }

        public Criteria andReadBytesIsNotNull() {
            addCriterion("read_bytes is not null");
            return (Criteria) this;
        }

        public Criteria andReadBytesEqualTo(Short value) {
            addCriterion("read_bytes =", value, "readBytes");
            return (Criteria) this;
        }

        public Criteria andReadBytesNotEqualTo(Short value) {
            addCriterion("read_bytes <>", value, "readBytes");
            return (Criteria) this;
        }

        public Criteria andReadBytesGreaterThan(Short value) {
            addCriterion("read_bytes >", value, "readBytes");
            return (Criteria) this;
        }

        public Criteria andReadBytesGreaterThanOrEqualTo(Short value) {
            addCriterion("read_bytes >=", value, "readBytes");
            return (Criteria) this;
        }

        public Criteria andReadBytesLessThan(Short value) {
            addCriterion("read_bytes <", value, "readBytes");
            return (Criteria) this;
        }

        public Criteria andReadBytesLessThanOrEqualTo(Short value) {
            addCriterion("read_bytes <=", value, "readBytes");
            return (Criteria) this;
        }

        public Criteria andReadBytesIn(List<Short> values) {
            addCriterion("read_bytes in", values, "readBytes");
            return (Criteria) this;
        }

        public Criteria andReadBytesNotIn(List<Short> values) {
            addCriterion("read_bytes not in", values, "readBytes");
            return (Criteria) this;
        }

        public Criteria andReadBytesBetween(Short value1, Short value2) {
            addCriterion("read_bytes between", value1, value2, "readBytes");
            return (Criteria) this;
        }

        public Criteria andReadBytesNotBetween(Short value1, Short value2) {
            addCriterion("read_bytes not between", value1, value2, "readBytes");
            return (Criteria) this;
        }

        public Criteria andReadTimeIsNull() {
            addCriterion("read_time is null");
            return (Criteria) this;
        }

        public Criteria andReadTimeIsNotNull() {
            addCriterion("read_time is not null");
            return (Criteria) this;
        }

        public Criteria andReadTimeEqualTo(Double value) {
            addCriterion("read_time =", value, "readTime");
            return (Criteria) this;
        }

        public Criteria andReadTimeNotEqualTo(Double value) {
            addCriterion("read_time <>", value, "readTime");
            return (Criteria) this;
        }

        public Criteria andReadTimeGreaterThan(Double value) {
            addCriterion("read_time >", value, "readTime");
            return (Criteria) this;
        }

        public Criteria andReadTimeGreaterThanOrEqualTo(Double value) {
            addCriterion("read_time >=", value, "readTime");
            return (Criteria) this;
        }

        public Criteria andReadTimeLessThan(Double value) {
            addCriterion("read_time <", value, "readTime");
            return (Criteria) this;
        }

        public Criteria andReadTimeLessThanOrEqualTo(Double value) {
            addCriterion("read_time <=", value, "readTime");
            return (Criteria) this;
        }

        public Criteria andReadTimeIn(List<Double> values) {
            addCriterion("read_time in", values, "readTime");
            return (Criteria) this;
        }

        public Criteria andReadTimeNotIn(List<Double> values) {
            addCriterion("read_time not in", values, "readTime");
            return (Criteria) this;
        }

        public Criteria andReadTimeBetween(Double value1, Double value2) {
            addCriterion("read_time between", value1, value2, "readTime");
            return (Criteria) this;
        }

        public Criteria andReadTimeNotBetween(Double value1, Double value2) {
            addCriterion("read_time not between", value1, value2, "readTime");
            return (Criteria) this;
        }

        public Criteria andWritesIsNull() {
            addCriterion("writes is null");
            return (Criteria) this;
        }

        public Criteria andWritesIsNotNull() {
            addCriterion("writes is not null");
            return (Criteria) this;
        }

        public Criteria andWritesEqualTo(Long value) {
            addCriterion("writes =", value, "writes");
            return (Criteria) this;
        }

        public Criteria andWritesNotEqualTo(Long value) {
            addCriterion("writes <>", value, "writes");
            return (Criteria) this;
        }

        public Criteria andWritesGreaterThan(Long value) {
            addCriterion("writes >", value, "writes");
            return (Criteria) this;
        }

        public Criteria andWritesGreaterThanOrEqualTo(Long value) {
            addCriterion("writes >=", value, "writes");
            return (Criteria) this;
        }

        public Criteria andWritesLessThan(Long value) {
            addCriterion("writes <", value, "writes");
            return (Criteria) this;
        }

        public Criteria andWritesLessThanOrEqualTo(Long value) {
            addCriterion("writes <=", value, "writes");
            return (Criteria) this;
        }

        public Criteria andWritesIn(List<Long> values) {
            addCriterion("writes in", values, "writes");
            return (Criteria) this;
        }

        public Criteria andWritesNotIn(List<Long> values) {
            addCriterion("writes not in", values, "writes");
            return (Criteria) this;
        }

        public Criteria andWritesBetween(Long value1, Long value2) {
            addCriterion("writes between", value1, value2, "writes");
            return (Criteria) this;
        }

        public Criteria andWritesNotBetween(Long value1, Long value2) {
            addCriterion("writes not between", value1, value2, "writes");
            return (Criteria) this;
        }

        public Criteria andWriteBytesIsNull() {
            addCriterion("write_bytes is null");
            return (Criteria) this;
        }

        public Criteria andWriteBytesIsNotNull() {
            addCriterion("write_bytes is not null");
            return (Criteria) this;
        }

        public Criteria andWriteBytesEqualTo(Short value) {
            addCriterion("write_bytes =", value, "writeBytes");
            return (Criteria) this;
        }

        public Criteria andWriteBytesNotEqualTo(Short value) {
            addCriterion("write_bytes <>", value, "writeBytes");
            return (Criteria) this;
        }

        public Criteria andWriteBytesGreaterThan(Short value) {
            addCriterion("write_bytes >", value, "writeBytes");
            return (Criteria) this;
        }

        public Criteria andWriteBytesGreaterThanOrEqualTo(Short value) {
            addCriterion("write_bytes >=", value, "writeBytes");
            return (Criteria) this;
        }

        public Criteria andWriteBytesLessThan(Short value) {
            addCriterion("write_bytes <", value, "writeBytes");
            return (Criteria) this;
        }

        public Criteria andWriteBytesLessThanOrEqualTo(Short value) {
            addCriterion("write_bytes <=", value, "writeBytes");
            return (Criteria) this;
        }

        public Criteria andWriteBytesIn(List<Short> values) {
            addCriterion("write_bytes in", values, "writeBytes");
            return (Criteria) this;
        }

        public Criteria andWriteBytesNotIn(List<Short> values) {
            addCriterion("write_bytes not in", values, "writeBytes");
            return (Criteria) this;
        }

        public Criteria andWriteBytesBetween(Short value1, Short value2) {
            addCriterion("write_bytes between", value1, value2, "writeBytes");
            return (Criteria) this;
        }

        public Criteria andWriteBytesNotBetween(Short value1, Short value2) {
            addCriterion("write_bytes not between", value1, value2, "writeBytes");
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

        public Criteria andWritebacksIsNull() {
            addCriterion("writebacks is null");
            return (Criteria) this;
        }

        public Criteria andWritebacksIsNotNull() {
            addCriterion("writebacks is not null");
            return (Criteria) this;
        }

        public Criteria andWritebacksEqualTo(Long value) {
            addCriterion("writebacks =", value, "writebacks");
            return (Criteria) this;
        }

        public Criteria andWritebacksNotEqualTo(Long value) {
            addCriterion("writebacks <>", value, "writebacks");
            return (Criteria) this;
        }

        public Criteria andWritebacksGreaterThan(Long value) {
            addCriterion("writebacks >", value, "writebacks");
            return (Criteria) this;
        }

        public Criteria andWritebacksGreaterThanOrEqualTo(Long value) {
            addCriterion("writebacks >=", value, "writebacks");
            return (Criteria) this;
        }

        public Criteria andWritebacksLessThan(Long value) {
            addCriterion("writebacks <", value, "writebacks");
            return (Criteria) this;
        }

        public Criteria andWritebacksLessThanOrEqualTo(Long value) {
            addCriterion("writebacks <=", value, "writebacks");
            return (Criteria) this;
        }

        public Criteria andWritebacksIn(List<Long> values) {
            addCriterion("writebacks in", values, "writebacks");
            return (Criteria) this;
        }

        public Criteria andWritebacksNotIn(List<Long> values) {
            addCriterion("writebacks not in", values, "writebacks");
            return (Criteria) this;
        }

        public Criteria andWritebacksBetween(Long value1, Long value2) {
            addCriterion("writebacks between", value1, value2, "writebacks");
            return (Criteria) this;
        }

        public Criteria andWritebacksNotBetween(Long value1, Long value2) {
            addCriterion("writebacks not between", value1, value2, "writebacks");
            return (Criteria) this;
        }

        public Criteria andWritebackTimeIsNull() {
            addCriterion("writeback_time is null");
            return (Criteria) this;
        }

        public Criteria andWritebackTimeIsNotNull() {
            addCriterion("writeback_time is not null");
            return (Criteria) this;
        }

        public Criteria andWritebackTimeEqualTo(Double value) {
            addCriterion("writeback_time =", value, "writebackTime");
            return (Criteria) this;
        }

        public Criteria andWritebackTimeNotEqualTo(Double value) {
            addCriterion("writeback_time <>", value, "writebackTime");
            return (Criteria) this;
        }

        public Criteria andWritebackTimeGreaterThan(Double value) {
            addCriterion("writeback_time >", value, "writebackTime");
            return (Criteria) this;
        }

        public Criteria andWritebackTimeGreaterThanOrEqualTo(Double value) {
            addCriterion("writeback_time >=", value, "writebackTime");
            return (Criteria) this;
        }

        public Criteria andWritebackTimeLessThan(Double value) {
            addCriterion("writeback_time <", value, "writebackTime");
            return (Criteria) this;
        }

        public Criteria andWritebackTimeLessThanOrEqualTo(Double value) {
            addCriterion("writeback_time <=", value, "writebackTime");
            return (Criteria) this;
        }

        public Criteria andWritebackTimeIn(List<Double> values) {
            addCriterion("writeback_time in", values, "writebackTime");
            return (Criteria) this;
        }

        public Criteria andWritebackTimeNotIn(List<Double> values) {
            addCriterion("writeback_time not in", values, "writebackTime");
            return (Criteria) this;
        }

        public Criteria andWritebackTimeBetween(Double value1, Double value2) {
            addCriterion("writeback_time between", value1, value2, "writebackTime");
            return (Criteria) this;
        }

        public Criteria andWritebackTimeNotBetween(Double value1, Double value2) {
            addCriterion("writeback_time not between", value1, value2, "writebackTime");
            return (Criteria) this;
        }

        public Criteria andExtendsIsNull() {
            addCriterion("extends is null");
            return (Criteria) this;
        }

        public Criteria andExtendsIsNotNull() {
            addCriterion("extends is not null");
            return (Criteria) this;
        }

        public Criteria andExtendsEqualTo(Long value) {
            addCriterion("extends =", value, "extends");
            return (Criteria) this;
        }

        public Criteria andExtendsNotEqualTo(Long value) {
            addCriterion("extends <>", value, "extends");
            return (Criteria) this;
        }

        public Criteria andExtendsGreaterThan(Long value) {
            addCriterion("extends >", value, "extends");
            return (Criteria) this;
        }

        public Criteria andExtendsGreaterThanOrEqualTo(Long value) {
            addCriterion("extends >=", value, "extends");
            return (Criteria) this;
        }

        public Criteria andExtendsLessThan(Long value) {
            addCriterion("extends <", value, "extends");
            return (Criteria) this;
        }

        public Criteria andExtendsLessThanOrEqualTo(Long value) {
            addCriterion("extends <=", value, "extends");
            return (Criteria) this;
        }

        public Criteria andExtendsIn(List<Long> values) {
            addCriterion("extends in", values, "extends");
            return (Criteria) this;
        }

        public Criteria andExtendsNotIn(List<Long> values) {
            addCriterion("extends not in", values, "extends");
            return (Criteria) this;
        }

        public Criteria andExtendsBetween(Long value1, Long value2) {
            addCriterion("extends between", value1, value2, "extends");
            return (Criteria) this;
        }

        public Criteria andExtendsNotBetween(Long value1, Long value2) {
            addCriterion("extends not between", value1, value2, "extends");
            return (Criteria) this;
        }

        public Criteria andExtendBytesIsNull() {
            addCriterion("extend_bytes is null");
            return (Criteria) this;
        }

        public Criteria andExtendBytesIsNotNull() {
            addCriterion("extend_bytes is not null");
            return (Criteria) this;
        }

        public Criteria andExtendBytesEqualTo(Short value) {
            addCriterion("extend_bytes =", value, "extendBytes");
            return (Criteria) this;
        }

        public Criteria andExtendBytesNotEqualTo(Short value) {
            addCriterion("extend_bytes <>", value, "extendBytes");
            return (Criteria) this;
        }

        public Criteria andExtendBytesGreaterThan(Short value) {
            addCriterion("extend_bytes >", value, "extendBytes");
            return (Criteria) this;
        }

        public Criteria andExtendBytesGreaterThanOrEqualTo(Short value) {
            addCriterion("extend_bytes >=", value, "extendBytes");
            return (Criteria) this;
        }

        public Criteria andExtendBytesLessThan(Short value) {
            addCriterion("extend_bytes <", value, "extendBytes");
            return (Criteria) this;
        }

        public Criteria andExtendBytesLessThanOrEqualTo(Short value) {
            addCriterion("extend_bytes <=", value, "extendBytes");
            return (Criteria) this;
        }

        public Criteria andExtendBytesIn(List<Short> values) {
            addCriterion("extend_bytes in", values, "extendBytes");
            return (Criteria) this;
        }

        public Criteria andExtendBytesNotIn(List<Short> values) {
            addCriterion("extend_bytes not in", values, "extendBytes");
            return (Criteria) this;
        }

        public Criteria andExtendBytesBetween(Short value1, Short value2) {
            addCriterion("extend_bytes between", value1, value2, "extendBytes");
            return (Criteria) this;
        }

        public Criteria andExtendBytesNotBetween(Short value1, Short value2) {
            addCriterion("extend_bytes not between", value1, value2, "extendBytes");
            return (Criteria) this;
        }

        public Criteria andExtendTimeIsNull() {
            addCriterion("extend_time is null");
            return (Criteria) this;
        }

        public Criteria andExtendTimeIsNotNull() {
            addCriterion("extend_time is not null");
            return (Criteria) this;
        }

        public Criteria andExtendTimeEqualTo(Double value) {
            addCriterion("extend_time =", value, "extendTime");
            return (Criteria) this;
        }

        public Criteria andExtendTimeNotEqualTo(Double value) {
            addCriterion("extend_time <>", value, "extendTime");
            return (Criteria) this;
        }

        public Criteria andExtendTimeGreaterThan(Double value) {
            addCriterion("extend_time >", value, "extendTime");
            return (Criteria) this;
        }

        public Criteria andExtendTimeGreaterThanOrEqualTo(Double value) {
            addCriterion("extend_time >=", value, "extendTime");
            return (Criteria) this;
        }

        public Criteria andExtendTimeLessThan(Double value) {
            addCriterion("extend_time <", value, "extendTime");
            return (Criteria) this;
        }

        public Criteria andExtendTimeLessThanOrEqualTo(Double value) {
            addCriterion("extend_time <=", value, "extendTime");
            return (Criteria) this;
        }

        public Criteria andExtendTimeIn(List<Double> values) {
            addCriterion("extend_time in", values, "extendTime");
            return (Criteria) this;
        }

        public Criteria andExtendTimeNotIn(List<Double> values) {
            addCriterion("extend_time not in", values, "extendTime");
            return (Criteria) this;
        }

        public Criteria andExtendTimeBetween(Double value1, Double value2) {
            addCriterion("extend_time between", value1, value2, "extendTime");
            return (Criteria) this;
        }

        public Criteria andExtendTimeNotBetween(Double value1, Double value2) {
            addCriterion("extend_time not between", value1, value2, "extendTime");
            return (Criteria) this;
        }

        public Criteria andHitsIsNull() {
            addCriterion("hits is null");
            return (Criteria) this;
        }

        public Criteria andHitsIsNotNull() {
            addCriterion("hits is not null");
            return (Criteria) this;
        }

        public Criteria andHitsEqualTo(Long value) {
            addCriterion("hits =", value, "hits");
            return (Criteria) this;
        }

        public Criteria andHitsNotEqualTo(Long value) {
            addCriterion("hits <>", value, "hits");
            return (Criteria) this;
        }

        public Criteria andHitsGreaterThan(Long value) {
            addCriterion("hits >", value, "hits");
            return (Criteria) this;
        }

        public Criteria andHitsGreaterThanOrEqualTo(Long value) {
            addCriterion("hits >=", value, "hits");
            return (Criteria) this;
        }

        public Criteria andHitsLessThan(Long value) {
            addCriterion("hits <", value, "hits");
            return (Criteria) this;
        }

        public Criteria andHitsLessThanOrEqualTo(Long value) {
            addCriterion("hits <=", value, "hits");
            return (Criteria) this;
        }

        public Criteria andHitsIn(List<Long> values) {
            addCriterion("hits in", values, "hits");
            return (Criteria) this;
        }

        public Criteria andHitsNotIn(List<Long> values) {
            addCriterion("hits not in", values, "hits");
            return (Criteria) this;
        }

        public Criteria andHitsBetween(Long value1, Long value2) {
            addCriterion("hits between", value1, value2, "hits");
            return (Criteria) this;
        }

        public Criteria andHitsNotBetween(Long value1, Long value2) {
            addCriterion("hits not between", value1, value2, "hits");
            return (Criteria) this;
        }

        public Criteria andEvictionsIsNull() {
            addCriterion("evictions is null");
            return (Criteria) this;
        }

        public Criteria andEvictionsIsNotNull() {
            addCriterion("evictions is not null");
            return (Criteria) this;
        }

        public Criteria andEvictionsEqualTo(Long value) {
            addCriterion("evictions =", value, "evictions");
            return (Criteria) this;
        }

        public Criteria andEvictionsNotEqualTo(Long value) {
            addCriterion("evictions <>", value, "evictions");
            return (Criteria) this;
        }

        public Criteria andEvictionsGreaterThan(Long value) {
            addCriterion("evictions >", value, "evictions");
            return (Criteria) this;
        }

        public Criteria andEvictionsGreaterThanOrEqualTo(Long value) {
            addCriterion("evictions >=", value, "evictions");
            return (Criteria) this;
        }

        public Criteria andEvictionsLessThan(Long value) {
            addCriterion("evictions <", value, "evictions");
            return (Criteria) this;
        }

        public Criteria andEvictionsLessThanOrEqualTo(Long value) {
            addCriterion("evictions <=", value, "evictions");
            return (Criteria) this;
        }

        public Criteria andEvictionsIn(List<Long> values) {
            addCriterion("evictions in", values, "evictions");
            return (Criteria) this;
        }

        public Criteria andEvictionsNotIn(List<Long> values) {
            addCriterion("evictions not in", values, "evictions");
            return (Criteria) this;
        }

        public Criteria andEvictionsBetween(Long value1, Long value2) {
            addCriterion("evictions between", value1, value2, "evictions");
            return (Criteria) this;
        }

        public Criteria andEvictionsNotBetween(Long value1, Long value2) {
            addCriterion("evictions not between", value1, value2, "evictions");
            return (Criteria) this;
        }

        public Criteria andReusesIsNull() {
            addCriterion("reuses is null");
            return (Criteria) this;
        }

        public Criteria andReusesIsNotNull() {
            addCriterion("reuses is not null");
            return (Criteria) this;
        }

        public Criteria andReusesEqualTo(Long value) {
            addCriterion("reuses =", value, "reuses");
            return (Criteria) this;
        }

        public Criteria andReusesNotEqualTo(Long value) {
            addCriterion("reuses <>", value, "reuses");
            return (Criteria) this;
        }

        public Criteria andReusesGreaterThan(Long value) {
            addCriterion("reuses >", value, "reuses");
            return (Criteria) this;
        }

        public Criteria andReusesGreaterThanOrEqualTo(Long value) {
            addCriterion("reuses >=", value, "reuses");
            return (Criteria) this;
        }

        public Criteria andReusesLessThan(Long value) {
            addCriterion("reuses <", value, "reuses");
            return (Criteria) this;
        }

        public Criteria andReusesLessThanOrEqualTo(Long value) {
            addCriterion("reuses <=", value, "reuses");
            return (Criteria) this;
        }

        public Criteria andReusesIn(List<Long> values) {
            addCriterion("reuses in", values, "reuses");
            return (Criteria) this;
        }

        public Criteria andReusesNotIn(List<Long> values) {
            addCriterion("reuses not in", values, "reuses");
            return (Criteria) this;
        }

        public Criteria andReusesBetween(Long value1, Long value2) {
            addCriterion("reuses between", value1, value2, "reuses");
            return (Criteria) this;
        }

        public Criteria andReusesNotBetween(Long value1, Long value2) {
            addCriterion("reuses not between", value1, value2, "reuses");
            return (Criteria) this;
        }

        public Criteria andFsyncsIsNull() {
            addCriterion("fsyncs is null");
            return (Criteria) this;
        }

        public Criteria andFsyncsIsNotNull() {
            addCriterion("fsyncs is not null");
            return (Criteria) this;
        }

        public Criteria andFsyncsEqualTo(Long value) {
            addCriterion("fsyncs =", value, "fsyncs");
            return (Criteria) this;
        }

        public Criteria andFsyncsNotEqualTo(Long value) {
            addCriterion("fsyncs <>", value, "fsyncs");
            return (Criteria) this;
        }

        public Criteria andFsyncsGreaterThan(Long value) {
            addCriterion("fsyncs >", value, "fsyncs");
            return (Criteria) this;
        }

        public Criteria andFsyncsGreaterThanOrEqualTo(Long value) {
            addCriterion("fsyncs >=", value, "fsyncs");
            return (Criteria) this;
        }

        public Criteria andFsyncsLessThan(Long value) {
            addCriterion("fsyncs <", value, "fsyncs");
            return (Criteria) this;
        }

        public Criteria andFsyncsLessThanOrEqualTo(Long value) {
            addCriterion("fsyncs <=", value, "fsyncs");
            return (Criteria) this;
        }

        public Criteria andFsyncsIn(List<Long> values) {
            addCriterion("fsyncs in", values, "fsyncs");
            return (Criteria) this;
        }

        public Criteria andFsyncsNotIn(List<Long> values) {
            addCriterion("fsyncs not in", values, "fsyncs");
            return (Criteria) this;
        }

        public Criteria andFsyncsBetween(Long value1, Long value2) {
            addCriterion("fsyncs between", value1, value2, "fsyncs");
            return (Criteria) this;
        }

        public Criteria andFsyncsNotBetween(Long value1, Long value2) {
            addCriterion("fsyncs not between", value1, value2, "fsyncs");
            return (Criteria) this;
        }

        public Criteria andFsyncTimeIsNull() {
            addCriterion("fsync_time is null");
            return (Criteria) this;
        }

        public Criteria andFsyncTimeIsNotNull() {
            addCriterion("fsync_time is not null");
            return (Criteria) this;
        }

        public Criteria andFsyncTimeEqualTo(Double value) {
            addCriterion("fsync_time =", value, "fsyncTime");
            return (Criteria) this;
        }

        public Criteria andFsyncTimeNotEqualTo(Double value) {
            addCriterion("fsync_time <>", value, "fsyncTime");
            return (Criteria) this;
        }

        public Criteria andFsyncTimeGreaterThan(Double value) {
            addCriterion("fsync_time >", value, "fsyncTime");
            return (Criteria) this;
        }

        public Criteria andFsyncTimeGreaterThanOrEqualTo(Double value) {
            addCriterion("fsync_time >=", value, "fsyncTime");
            return (Criteria) this;
        }

        public Criteria andFsyncTimeLessThan(Double value) {
            addCriterion("fsync_time <", value, "fsyncTime");
            return (Criteria) this;
        }

        public Criteria andFsyncTimeLessThanOrEqualTo(Double value) {
            addCriterion("fsync_time <=", value, "fsyncTime");
            return (Criteria) this;
        }

        public Criteria andFsyncTimeIn(List<Double> values) {
            addCriterion("fsync_time in", values, "fsyncTime");
            return (Criteria) this;
        }

        public Criteria andFsyncTimeNotIn(List<Double> values) {
            addCriterion("fsync_time not in", values, "fsyncTime");
            return (Criteria) this;
        }

        public Criteria andFsyncTimeBetween(Double value1, Double value2) {
            addCriterion("fsync_time between", value1, value2, "fsyncTime");
            return (Criteria) this;
        }

        public Criteria andFsyncTimeNotBetween(Double value1, Double value2) {
            addCriterion("fsync_time not between", value1, value2, "fsyncTime");
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