package com.pool.readio.mbg.model;

import java.util.ArrayList;
import java.util.List;

public class PgStatProgressVacuumExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PgStatProgressVacuumExample() {
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

        public Criteria andPhaseIsNull() {
            addCriterion("phase is null");
            return (Criteria) this;
        }

        public Criteria andPhaseIsNotNull() {
            addCriterion("phase is not null");
            return (Criteria) this;
        }

        public Criteria andPhaseEqualTo(String value) {
            addCriterion("phase =", value, "phase");
            return (Criteria) this;
        }

        public Criteria andPhaseNotEqualTo(String value) {
            addCriterion("phase <>", value, "phase");
            return (Criteria) this;
        }

        public Criteria andPhaseGreaterThan(String value) {
            addCriterion("phase >", value, "phase");
            return (Criteria) this;
        }

        public Criteria andPhaseGreaterThanOrEqualTo(String value) {
            addCriterion("phase >=", value, "phase");
            return (Criteria) this;
        }

        public Criteria andPhaseLessThan(String value) {
            addCriterion("phase <", value, "phase");
            return (Criteria) this;
        }

        public Criteria andPhaseLessThanOrEqualTo(String value) {
            addCriterion("phase <=", value, "phase");
            return (Criteria) this;
        }

        public Criteria andPhaseLike(String value) {
            addCriterion("phase like", value, "phase");
            return (Criteria) this;
        }

        public Criteria andPhaseNotLike(String value) {
            addCriterion("phase not like", value, "phase");
            return (Criteria) this;
        }

        public Criteria andPhaseIn(List<String> values) {
            addCriterion("phase in", values, "phase");
            return (Criteria) this;
        }

        public Criteria andPhaseNotIn(List<String> values) {
            addCriterion("phase not in", values, "phase");
            return (Criteria) this;
        }

        public Criteria andPhaseBetween(String value1, String value2) {
            addCriterion("phase between", value1, value2, "phase");
            return (Criteria) this;
        }

        public Criteria andPhaseNotBetween(String value1, String value2) {
            addCriterion("phase not between", value1, value2, "phase");
            return (Criteria) this;
        }

        public Criteria andHeapBlksTotalIsNull() {
            addCriterion("heap_blks_total is null");
            return (Criteria) this;
        }

        public Criteria andHeapBlksTotalIsNotNull() {
            addCriterion("heap_blks_total is not null");
            return (Criteria) this;
        }

        public Criteria andHeapBlksTotalEqualTo(Long value) {
            addCriterion("heap_blks_total =", value, "heapBlksTotal");
            return (Criteria) this;
        }

        public Criteria andHeapBlksTotalNotEqualTo(Long value) {
            addCriterion("heap_blks_total <>", value, "heapBlksTotal");
            return (Criteria) this;
        }

        public Criteria andHeapBlksTotalGreaterThan(Long value) {
            addCriterion("heap_blks_total >", value, "heapBlksTotal");
            return (Criteria) this;
        }

        public Criteria andHeapBlksTotalGreaterThanOrEqualTo(Long value) {
            addCriterion("heap_blks_total >=", value, "heapBlksTotal");
            return (Criteria) this;
        }

        public Criteria andHeapBlksTotalLessThan(Long value) {
            addCriterion("heap_blks_total <", value, "heapBlksTotal");
            return (Criteria) this;
        }

        public Criteria andHeapBlksTotalLessThanOrEqualTo(Long value) {
            addCriterion("heap_blks_total <=", value, "heapBlksTotal");
            return (Criteria) this;
        }

        public Criteria andHeapBlksTotalIn(List<Long> values) {
            addCriterion("heap_blks_total in", values, "heapBlksTotal");
            return (Criteria) this;
        }

        public Criteria andHeapBlksTotalNotIn(List<Long> values) {
            addCriterion("heap_blks_total not in", values, "heapBlksTotal");
            return (Criteria) this;
        }

        public Criteria andHeapBlksTotalBetween(Long value1, Long value2) {
            addCriterion("heap_blks_total between", value1, value2, "heapBlksTotal");
            return (Criteria) this;
        }

        public Criteria andHeapBlksTotalNotBetween(Long value1, Long value2) {
            addCriterion("heap_blks_total not between", value1, value2, "heapBlksTotal");
            return (Criteria) this;
        }

        public Criteria andHeapBlksScannedIsNull() {
            addCriterion("heap_blks_scanned is null");
            return (Criteria) this;
        }

        public Criteria andHeapBlksScannedIsNotNull() {
            addCriterion("heap_blks_scanned is not null");
            return (Criteria) this;
        }

        public Criteria andHeapBlksScannedEqualTo(Long value) {
            addCriterion("heap_blks_scanned =", value, "heapBlksScanned");
            return (Criteria) this;
        }

        public Criteria andHeapBlksScannedNotEqualTo(Long value) {
            addCriterion("heap_blks_scanned <>", value, "heapBlksScanned");
            return (Criteria) this;
        }

        public Criteria andHeapBlksScannedGreaterThan(Long value) {
            addCriterion("heap_blks_scanned >", value, "heapBlksScanned");
            return (Criteria) this;
        }

        public Criteria andHeapBlksScannedGreaterThanOrEqualTo(Long value) {
            addCriterion("heap_blks_scanned >=", value, "heapBlksScanned");
            return (Criteria) this;
        }

        public Criteria andHeapBlksScannedLessThan(Long value) {
            addCriterion("heap_blks_scanned <", value, "heapBlksScanned");
            return (Criteria) this;
        }

        public Criteria andHeapBlksScannedLessThanOrEqualTo(Long value) {
            addCriterion("heap_blks_scanned <=", value, "heapBlksScanned");
            return (Criteria) this;
        }

        public Criteria andHeapBlksScannedIn(List<Long> values) {
            addCriterion("heap_blks_scanned in", values, "heapBlksScanned");
            return (Criteria) this;
        }

        public Criteria andHeapBlksScannedNotIn(List<Long> values) {
            addCriterion("heap_blks_scanned not in", values, "heapBlksScanned");
            return (Criteria) this;
        }

        public Criteria andHeapBlksScannedBetween(Long value1, Long value2) {
            addCriterion("heap_blks_scanned between", value1, value2, "heapBlksScanned");
            return (Criteria) this;
        }

        public Criteria andHeapBlksScannedNotBetween(Long value1, Long value2) {
            addCriterion("heap_blks_scanned not between", value1, value2, "heapBlksScanned");
            return (Criteria) this;
        }

        public Criteria andHeapBlksVacuumedIsNull() {
            addCriterion("heap_blks_vacuumed is null");
            return (Criteria) this;
        }

        public Criteria andHeapBlksVacuumedIsNotNull() {
            addCriterion("heap_blks_vacuumed is not null");
            return (Criteria) this;
        }

        public Criteria andHeapBlksVacuumedEqualTo(Long value) {
            addCriterion("heap_blks_vacuumed =", value, "heapBlksVacuumed");
            return (Criteria) this;
        }

        public Criteria andHeapBlksVacuumedNotEqualTo(Long value) {
            addCriterion("heap_blks_vacuumed <>", value, "heapBlksVacuumed");
            return (Criteria) this;
        }

        public Criteria andHeapBlksVacuumedGreaterThan(Long value) {
            addCriterion("heap_blks_vacuumed >", value, "heapBlksVacuumed");
            return (Criteria) this;
        }

        public Criteria andHeapBlksVacuumedGreaterThanOrEqualTo(Long value) {
            addCriterion("heap_blks_vacuumed >=", value, "heapBlksVacuumed");
            return (Criteria) this;
        }

        public Criteria andHeapBlksVacuumedLessThan(Long value) {
            addCriterion("heap_blks_vacuumed <", value, "heapBlksVacuumed");
            return (Criteria) this;
        }

        public Criteria andHeapBlksVacuumedLessThanOrEqualTo(Long value) {
            addCriterion("heap_blks_vacuumed <=", value, "heapBlksVacuumed");
            return (Criteria) this;
        }

        public Criteria andHeapBlksVacuumedIn(List<Long> values) {
            addCriterion("heap_blks_vacuumed in", values, "heapBlksVacuumed");
            return (Criteria) this;
        }

        public Criteria andHeapBlksVacuumedNotIn(List<Long> values) {
            addCriterion("heap_blks_vacuumed not in", values, "heapBlksVacuumed");
            return (Criteria) this;
        }

        public Criteria andHeapBlksVacuumedBetween(Long value1, Long value2) {
            addCriterion("heap_blks_vacuumed between", value1, value2, "heapBlksVacuumed");
            return (Criteria) this;
        }

        public Criteria andHeapBlksVacuumedNotBetween(Long value1, Long value2) {
            addCriterion("heap_blks_vacuumed not between", value1, value2, "heapBlksVacuumed");
            return (Criteria) this;
        }

        public Criteria andIndexVacuumCountIsNull() {
            addCriterion("index_vacuum_count is null");
            return (Criteria) this;
        }

        public Criteria andIndexVacuumCountIsNotNull() {
            addCriterion("index_vacuum_count is not null");
            return (Criteria) this;
        }

        public Criteria andIndexVacuumCountEqualTo(Long value) {
            addCriterion("index_vacuum_count =", value, "indexVacuumCount");
            return (Criteria) this;
        }

        public Criteria andIndexVacuumCountNotEqualTo(Long value) {
            addCriterion("index_vacuum_count <>", value, "indexVacuumCount");
            return (Criteria) this;
        }

        public Criteria andIndexVacuumCountGreaterThan(Long value) {
            addCriterion("index_vacuum_count >", value, "indexVacuumCount");
            return (Criteria) this;
        }

        public Criteria andIndexVacuumCountGreaterThanOrEqualTo(Long value) {
            addCriterion("index_vacuum_count >=", value, "indexVacuumCount");
            return (Criteria) this;
        }

        public Criteria andIndexVacuumCountLessThan(Long value) {
            addCriterion("index_vacuum_count <", value, "indexVacuumCount");
            return (Criteria) this;
        }

        public Criteria andIndexVacuumCountLessThanOrEqualTo(Long value) {
            addCriterion("index_vacuum_count <=", value, "indexVacuumCount");
            return (Criteria) this;
        }

        public Criteria andIndexVacuumCountIn(List<Long> values) {
            addCriterion("index_vacuum_count in", values, "indexVacuumCount");
            return (Criteria) this;
        }

        public Criteria andIndexVacuumCountNotIn(List<Long> values) {
            addCriterion("index_vacuum_count not in", values, "indexVacuumCount");
            return (Criteria) this;
        }

        public Criteria andIndexVacuumCountBetween(Long value1, Long value2) {
            addCriterion("index_vacuum_count between", value1, value2, "indexVacuumCount");
            return (Criteria) this;
        }

        public Criteria andIndexVacuumCountNotBetween(Long value1, Long value2) {
            addCriterion("index_vacuum_count not between", value1, value2, "indexVacuumCount");
            return (Criteria) this;
        }

        public Criteria andMaxDeadTupleBytesIsNull() {
            addCriterion("max_dead_tuple_bytes is null");
            return (Criteria) this;
        }

        public Criteria andMaxDeadTupleBytesIsNotNull() {
            addCriterion("max_dead_tuple_bytes is not null");
            return (Criteria) this;
        }

        public Criteria andMaxDeadTupleBytesEqualTo(Long value) {
            addCriterion("max_dead_tuple_bytes =", value, "maxDeadTupleBytes");
            return (Criteria) this;
        }

        public Criteria andMaxDeadTupleBytesNotEqualTo(Long value) {
            addCriterion("max_dead_tuple_bytes <>", value, "maxDeadTupleBytes");
            return (Criteria) this;
        }

        public Criteria andMaxDeadTupleBytesGreaterThan(Long value) {
            addCriterion("max_dead_tuple_bytes >", value, "maxDeadTupleBytes");
            return (Criteria) this;
        }

        public Criteria andMaxDeadTupleBytesGreaterThanOrEqualTo(Long value) {
            addCriterion("max_dead_tuple_bytes >=", value, "maxDeadTupleBytes");
            return (Criteria) this;
        }

        public Criteria andMaxDeadTupleBytesLessThan(Long value) {
            addCriterion("max_dead_tuple_bytes <", value, "maxDeadTupleBytes");
            return (Criteria) this;
        }

        public Criteria andMaxDeadTupleBytesLessThanOrEqualTo(Long value) {
            addCriterion("max_dead_tuple_bytes <=", value, "maxDeadTupleBytes");
            return (Criteria) this;
        }

        public Criteria andMaxDeadTupleBytesIn(List<Long> values) {
            addCriterion("max_dead_tuple_bytes in", values, "maxDeadTupleBytes");
            return (Criteria) this;
        }

        public Criteria andMaxDeadTupleBytesNotIn(List<Long> values) {
            addCriterion("max_dead_tuple_bytes not in", values, "maxDeadTupleBytes");
            return (Criteria) this;
        }

        public Criteria andMaxDeadTupleBytesBetween(Long value1, Long value2) {
            addCriterion("max_dead_tuple_bytes between", value1, value2, "maxDeadTupleBytes");
            return (Criteria) this;
        }

        public Criteria andMaxDeadTupleBytesNotBetween(Long value1, Long value2) {
            addCriterion("max_dead_tuple_bytes not between", value1, value2, "maxDeadTupleBytes");
            return (Criteria) this;
        }

        public Criteria andDeadTupleBytesIsNull() {
            addCriterion("dead_tuple_bytes is null");
            return (Criteria) this;
        }

        public Criteria andDeadTupleBytesIsNotNull() {
            addCriterion("dead_tuple_bytes is not null");
            return (Criteria) this;
        }

        public Criteria andDeadTupleBytesEqualTo(Long value) {
            addCriterion("dead_tuple_bytes =", value, "deadTupleBytes");
            return (Criteria) this;
        }

        public Criteria andDeadTupleBytesNotEqualTo(Long value) {
            addCriterion("dead_tuple_bytes <>", value, "deadTupleBytes");
            return (Criteria) this;
        }

        public Criteria andDeadTupleBytesGreaterThan(Long value) {
            addCriterion("dead_tuple_bytes >", value, "deadTupleBytes");
            return (Criteria) this;
        }

        public Criteria andDeadTupleBytesGreaterThanOrEqualTo(Long value) {
            addCriterion("dead_tuple_bytes >=", value, "deadTupleBytes");
            return (Criteria) this;
        }

        public Criteria andDeadTupleBytesLessThan(Long value) {
            addCriterion("dead_tuple_bytes <", value, "deadTupleBytes");
            return (Criteria) this;
        }

        public Criteria andDeadTupleBytesLessThanOrEqualTo(Long value) {
            addCriterion("dead_tuple_bytes <=", value, "deadTupleBytes");
            return (Criteria) this;
        }

        public Criteria andDeadTupleBytesIn(List<Long> values) {
            addCriterion("dead_tuple_bytes in", values, "deadTupleBytes");
            return (Criteria) this;
        }

        public Criteria andDeadTupleBytesNotIn(List<Long> values) {
            addCriterion("dead_tuple_bytes not in", values, "deadTupleBytes");
            return (Criteria) this;
        }

        public Criteria andDeadTupleBytesBetween(Long value1, Long value2) {
            addCriterion("dead_tuple_bytes between", value1, value2, "deadTupleBytes");
            return (Criteria) this;
        }

        public Criteria andDeadTupleBytesNotBetween(Long value1, Long value2) {
            addCriterion("dead_tuple_bytes not between", value1, value2, "deadTupleBytes");
            return (Criteria) this;
        }

        public Criteria andNumDeadItemIdsIsNull() {
            addCriterion("num_dead_item_ids is null");
            return (Criteria) this;
        }

        public Criteria andNumDeadItemIdsIsNotNull() {
            addCriterion("num_dead_item_ids is not null");
            return (Criteria) this;
        }

        public Criteria andNumDeadItemIdsEqualTo(Long value) {
            addCriterion("num_dead_item_ids =", value, "numDeadItemIds");
            return (Criteria) this;
        }

        public Criteria andNumDeadItemIdsNotEqualTo(Long value) {
            addCriterion("num_dead_item_ids <>", value, "numDeadItemIds");
            return (Criteria) this;
        }

        public Criteria andNumDeadItemIdsGreaterThan(Long value) {
            addCriterion("num_dead_item_ids >", value, "numDeadItemIds");
            return (Criteria) this;
        }

        public Criteria andNumDeadItemIdsGreaterThanOrEqualTo(Long value) {
            addCriterion("num_dead_item_ids >=", value, "numDeadItemIds");
            return (Criteria) this;
        }

        public Criteria andNumDeadItemIdsLessThan(Long value) {
            addCriterion("num_dead_item_ids <", value, "numDeadItemIds");
            return (Criteria) this;
        }

        public Criteria andNumDeadItemIdsLessThanOrEqualTo(Long value) {
            addCriterion("num_dead_item_ids <=", value, "numDeadItemIds");
            return (Criteria) this;
        }

        public Criteria andNumDeadItemIdsIn(List<Long> values) {
            addCriterion("num_dead_item_ids in", values, "numDeadItemIds");
            return (Criteria) this;
        }

        public Criteria andNumDeadItemIdsNotIn(List<Long> values) {
            addCriterion("num_dead_item_ids not in", values, "numDeadItemIds");
            return (Criteria) this;
        }

        public Criteria andNumDeadItemIdsBetween(Long value1, Long value2) {
            addCriterion("num_dead_item_ids between", value1, value2, "numDeadItemIds");
            return (Criteria) this;
        }

        public Criteria andNumDeadItemIdsNotBetween(Long value1, Long value2) {
            addCriterion("num_dead_item_ids not between", value1, value2, "numDeadItemIds");
            return (Criteria) this;
        }

        public Criteria andIndexesTotalIsNull() {
            addCriterion("indexes_total is null");
            return (Criteria) this;
        }

        public Criteria andIndexesTotalIsNotNull() {
            addCriterion("indexes_total is not null");
            return (Criteria) this;
        }

        public Criteria andIndexesTotalEqualTo(Long value) {
            addCriterion("indexes_total =", value, "indexesTotal");
            return (Criteria) this;
        }

        public Criteria andIndexesTotalNotEqualTo(Long value) {
            addCriterion("indexes_total <>", value, "indexesTotal");
            return (Criteria) this;
        }

        public Criteria andIndexesTotalGreaterThan(Long value) {
            addCriterion("indexes_total >", value, "indexesTotal");
            return (Criteria) this;
        }

        public Criteria andIndexesTotalGreaterThanOrEqualTo(Long value) {
            addCriterion("indexes_total >=", value, "indexesTotal");
            return (Criteria) this;
        }

        public Criteria andIndexesTotalLessThan(Long value) {
            addCriterion("indexes_total <", value, "indexesTotal");
            return (Criteria) this;
        }

        public Criteria andIndexesTotalLessThanOrEqualTo(Long value) {
            addCriterion("indexes_total <=", value, "indexesTotal");
            return (Criteria) this;
        }

        public Criteria andIndexesTotalIn(List<Long> values) {
            addCriterion("indexes_total in", values, "indexesTotal");
            return (Criteria) this;
        }

        public Criteria andIndexesTotalNotIn(List<Long> values) {
            addCriterion("indexes_total not in", values, "indexesTotal");
            return (Criteria) this;
        }

        public Criteria andIndexesTotalBetween(Long value1, Long value2) {
            addCriterion("indexes_total between", value1, value2, "indexesTotal");
            return (Criteria) this;
        }

        public Criteria andIndexesTotalNotBetween(Long value1, Long value2) {
            addCriterion("indexes_total not between", value1, value2, "indexesTotal");
            return (Criteria) this;
        }

        public Criteria andIndexesProcessedIsNull() {
            addCriterion("indexes_processed is null");
            return (Criteria) this;
        }

        public Criteria andIndexesProcessedIsNotNull() {
            addCriterion("indexes_processed is not null");
            return (Criteria) this;
        }

        public Criteria andIndexesProcessedEqualTo(Long value) {
            addCriterion("indexes_processed =", value, "indexesProcessed");
            return (Criteria) this;
        }

        public Criteria andIndexesProcessedNotEqualTo(Long value) {
            addCriterion("indexes_processed <>", value, "indexesProcessed");
            return (Criteria) this;
        }

        public Criteria andIndexesProcessedGreaterThan(Long value) {
            addCriterion("indexes_processed >", value, "indexesProcessed");
            return (Criteria) this;
        }

        public Criteria andIndexesProcessedGreaterThanOrEqualTo(Long value) {
            addCriterion("indexes_processed >=", value, "indexesProcessed");
            return (Criteria) this;
        }

        public Criteria andIndexesProcessedLessThan(Long value) {
            addCriterion("indexes_processed <", value, "indexesProcessed");
            return (Criteria) this;
        }

        public Criteria andIndexesProcessedLessThanOrEqualTo(Long value) {
            addCriterion("indexes_processed <=", value, "indexesProcessed");
            return (Criteria) this;
        }

        public Criteria andIndexesProcessedIn(List<Long> values) {
            addCriterion("indexes_processed in", values, "indexesProcessed");
            return (Criteria) this;
        }

        public Criteria andIndexesProcessedNotIn(List<Long> values) {
            addCriterion("indexes_processed not in", values, "indexesProcessed");
            return (Criteria) this;
        }

        public Criteria andIndexesProcessedBetween(Long value1, Long value2) {
            addCriterion("indexes_processed between", value1, value2, "indexesProcessed");
            return (Criteria) this;
        }

        public Criteria andIndexesProcessedNotBetween(Long value1, Long value2) {
            addCriterion("indexes_processed not between", value1, value2, "indexesProcessed");
            return (Criteria) this;
        }

        public Criteria andDelayTimeIsNull() {
            addCriterion("delay_time is null");
            return (Criteria) this;
        }

        public Criteria andDelayTimeIsNotNull() {
            addCriterion("delay_time is not null");
            return (Criteria) this;
        }

        public Criteria andDelayTimeEqualTo(Double value) {
            addCriterion("delay_time =", value, "delayTime");
            return (Criteria) this;
        }

        public Criteria andDelayTimeNotEqualTo(Double value) {
            addCriterion("delay_time <>", value, "delayTime");
            return (Criteria) this;
        }

        public Criteria andDelayTimeGreaterThan(Double value) {
            addCriterion("delay_time >", value, "delayTime");
            return (Criteria) this;
        }

        public Criteria andDelayTimeGreaterThanOrEqualTo(Double value) {
            addCriterion("delay_time >=", value, "delayTime");
            return (Criteria) this;
        }

        public Criteria andDelayTimeLessThan(Double value) {
            addCriterion("delay_time <", value, "delayTime");
            return (Criteria) this;
        }

        public Criteria andDelayTimeLessThanOrEqualTo(Double value) {
            addCriterion("delay_time <=", value, "delayTime");
            return (Criteria) this;
        }

        public Criteria andDelayTimeIn(List<Double> values) {
            addCriterion("delay_time in", values, "delayTime");
            return (Criteria) this;
        }

        public Criteria andDelayTimeNotIn(List<Double> values) {
            addCriterion("delay_time not in", values, "delayTime");
            return (Criteria) this;
        }

        public Criteria andDelayTimeBetween(Double value1, Double value2) {
            addCriterion("delay_time between", value1, value2, "delayTime");
            return (Criteria) this;
        }

        public Criteria andDelayTimeNotBetween(Double value1, Double value2) {
            addCriterion("delay_time not between", value1, value2, "delayTime");
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