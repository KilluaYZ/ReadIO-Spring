package com.pool.readio.readiombg.model;

import java.util.ArrayList;
import java.util.List;

public class PgStatProgressClusterExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PgStatProgressClusterExample() {
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

        public Criteria andClusterIndexRelidIsNull() {
            addCriterion("cluster_index_relid is null");
            return (Criteria) this;
        }

        public Criteria andClusterIndexRelidIsNotNull() {
            addCriterion("cluster_index_relid is not null");
            return (Criteria) this;
        }

        public Criteria andClusterIndexRelidEqualTo(Long value) {
            addCriterion("cluster_index_relid =", value, "clusterIndexRelid");
            return (Criteria) this;
        }

        public Criteria andClusterIndexRelidNotEqualTo(Long value) {
            addCriterion("cluster_index_relid <>", value, "clusterIndexRelid");
            return (Criteria) this;
        }

        public Criteria andClusterIndexRelidGreaterThan(Long value) {
            addCriterion("cluster_index_relid >", value, "clusterIndexRelid");
            return (Criteria) this;
        }

        public Criteria andClusterIndexRelidGreaterThanOrEqualTo(Long value) {
            addCriterion("cluster_index_relid >=", value, "clusterIndexRelid");
            return (Criteria) this;
        }

        public Criteria andClusterIndexRelidLessThan(Long value) {
            addCriterion("cluster_index_relid <", value, "clusterIndexRelid");
            return (Criteria) this;
        }

        public Criteria andClusterIndexRelidLessThanOrEqualTo(Long value) {
            addCriterion("cluster_index_relid <=", value, "clusterIndexRelid");
            return (Criteria) this;
        }

        public Criteria andClusterIndexRelidIn(List<Long> values) {
            addCriterion("cluster_index_relid in", values, "clusterIndexRelid");
            return (Criteria) this;
        }

        public Criteria andClusterIndexRelidNotIn(List<Long> values) {
            addCriterion("cluster_index_relid not in", values, "clusterIndexRelid");
            return (Criteria) this;
        }

        public Criteria andClusterIndexRelidBetween(Long value1, Long value2) {
            addCriterion("cluster_index_relid between", value1, value2, "clusterIndexRelid");
            return (Criteria) this;
        }

        public Criteria andClusterIndexRelidNotBetween(Long value1, Long value2) {
            addCriterion("cluster_index_relid not between", value1, value2, "clusterIndexRelid");
            return (Criteria) this;
        }

        public Criteria andHeapTuplesScannedIsNull() {
            addCriterion("heap_tuples_scanned is null");
            return (Criteria) this;
        }

        public Criteria andHeapTuplesScannedIsNotNull() {
            addCriterion("heap_tuples_scanned is not null");
            return (Criteria) this;
        }

        public Criteria andHeapTuplesScannedEqualTo(Long value) {
            addCriterion("heap_tuples_scanned =", value, "heapTuplesScanned");
            return (Criteria) this;
        }

        public Criteria andHeapTuplesScannedNotEqualTo(Long value) {
            addCriterion("heap_tuples_scanned <>", value, "heapTuplesScanned");
            return (Criteria) this;
        }

        public Criteria andHeapTuplesScannedGreaterThan(Long value) {
            addCriterion("heap_tuples_scanned >", value, "heapTuplesScanned");
            return (Criteria) this;
        }

        public Criteria andHeapTuplesScannedGreaterThanOrEqualTo(Long value) {
            addCriterion("heap_tuples_scanned >=", value, "heapTuplesScanned");
            return (Criteria) this;
        }

        public Criteria andHeapTuplesScannedLessThan(Long value) {
            addCriterion("heap_tuples_scanned <", value, "heapTuplesScanned");
            return (Criteria) this;
        }

        public Criteria andHeapTuplesScannedLessThanOrEqualTo(Long value) {
            addCriterion("heap_tuples_scanned <=", value, "heapTuplesScanned");
            return (Criteria) this;
        }

        public Criteria andHeapTuplesScannedIn(List<Long> values) {
            addCriterion("heap_tuples_scanned in", values, "heapTuplesScanned");
            return (Criteria) this;
        }

        public Criteria andHeapTuplesScannedNotIn(List<Long> values) {
            addCriterion("heap_tuples_scanned not in", values, "heapTuplesScanned");
            return (Criteria) this;
        }

        public Criteria andHeapTuplesScannedBetween(Long value1, Long value2) {
            addCriterion("heap_tuples_scanned between", value1, value2, "heapTuplesScanned");
            return (Criteria) this;
        }

        public Criteria andHeapTuplesScannedNotBetween(Long value1, Long value2) {
            addCriterion("heap_tuples_scanned not between", value1, value2, "heapTuplesScanned");
            return (Criteria) this;
        }

        public Criteria andHeapTuplesWrittenIsNull() {
            addCriterion("heap_tuples_written is null");
            return (Criteria) this;
        }

        public Criteria andHeapTuplesWrittenIsNotNull() {
            addCriterion("heap_tuples_written is not null");
            return (Criteria) this;
        }

        public Criteria andHeapTuplesWrittenEqualTo(Long value) {
            addCriterion("heap_tuples_written =", value, "heapTuplesWritten");
            return (Criteria) this;
        }

        public Criteria andHeapTuplesWrittenNotEqualTo(Long value) {
            addCriterion("heap_tuples_written <>", value, "heapTuplesWritten");
            return (Criteria) this;
        }

        public Criteria andHeapTuplesWrittenGreaterThan(Long value) {
            addCriterion("heap_tuples_written >", value, "heapTuplesWritten");
            return (Criteria) this;
        }

        public Criteria andHeapTuplesWrittenGreaterThanOrEqualTo(Long value) {
            addCriterion("heap_tuples_written >=", value, "heapTuplesWritten");
            return (Criteria) this;
        }

        public Criteria andHeapTuplesWrittenLessThan(Long value) {
            addCriterion("heap_tuples_written <", value, "heapTuplesWritten");
            return (Criteria) this;
        }

        public Criteria andHeapTuplesWrittenLessThanOrEqualTo(Long value) {
            addCriterion("heap_tuples_written <=", value, "heapTuplesWritten");
            return (Criteria) this;
        }

        public Criteria andHeapTuplesWrittenIn(List<Long> values) {
            addCriterion("heap_tuples_written in", values, "heapTuplesWritten");
            return (Criteria) this;
        }

        public Criteria andHeapTuplesWrittenNotIn(List<Long> values) {
            addCriterion("heap_tuples_written not in", values, "heapTuplesWritten");
            return (Criteria) this;
        }

        public Criteria andHeapTuplesWrittenBetween(Long value1, Long value2) {
            addCriterion("heap_tuples_written between", value1, value2, "heapTuplesWritten");
            return (Criteria) this;
        }

        public Criteria andHeapTuplesWrittenNotBetween(Long value1, Long value2) {
            addCriterion("heap_tuples_written not between", value1, value2, "heapTuplesWritten");
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

        public Criteria andIndexRebuildCountIsNull() {
            addCriterion("index_rebuild_count is null");
            return (Criteria) this;
        }

        public Criteria andIndexRebuildCountIsNotNull() {
            addCriterion("index_rebuild_count is not null");
            return (Criteria) this;
        }

        public Criteria andIndexRebuildCountEqualTo(Long value) {
            addCriterion("index_rebuild_count =", value, "indexRebuildCount");
            return (Criteria) this;
        }

        public Criteria andIndexRebuildCountNotEqualTo(Long value) {
            addCriterion("index_rebuild_count <>", value, "indexRebuildCount");
            return (Criteria) this;
        }

        public Criteria andIndexRebuildCountGreaterThan(Long value) {
            addCriterion("index_rebuild_count >", value, "indexRebuildCount");
            return (Criteria) this;
        }

        public Criteria andIndexRebuildCountGreaterThanOrEqualTo(Long value) {
            addCriterion("index_rebuild_count >=", value, "indexRebuildCount");
            return (Criteria) this;
        }

        public Criteria andIndexRebuildCountLessThan(Long value) {
            addCriterion("index_rebuild_count <", value, "indexRebuildCount");
            return (Criteria) this;
        }

        public Criteria andIndexRebuildCountLessThanOrEqualTo(Long value) {
            addCriterion("index_rebuild_count <=", value, "indexRebuildCount");
            return (Criteria) this;
        }

        public Criteria andIndexRebuildCountIn(List<Long> values) {
            addCriterion("index_rebuild_count in", values, "indexRebuildCount");
            return (Criteria) this;
        }

        public Criteria andIndexRebuildCountNotIn(List<Long> values) {
            addCriterion("index_rebuild_count not in", values, "indexRebuildCount");
            return (Criteria) this;
        }

        public Criteria andIndexRebuildCountBetween(Long value1, Long value2) {
            addCriterion("index_rebuild_count between", value1, value2, "indexRebuildCount");
            return (Criteria) this;
        }

        public Criteria andIndexRebuildCountNotBetween(Long value1, Long value2) {
            addCriterion("index_rebuild_count not between", value1, value2, "indexRebuildCount");
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