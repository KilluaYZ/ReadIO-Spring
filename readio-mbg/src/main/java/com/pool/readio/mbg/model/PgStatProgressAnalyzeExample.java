package com.pool.readio.mbg.model;

import java.util.ArrayList;
import java.util.List;

public class PgStatProgressAnalyzeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PgStatProgressAnalyzeExample() {
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

        public Criteria andSampleBlksTotalIsNull() {
            addCriterion("sample_blks_total is null");
            return (Criteria) this;
        }

        public Criteria andSampleBlksTotalIsNotNull() {
            addCriterion("sample_blks_total is not null");
            return (Criteria) this;
        }

        public Criteria andSampleBlksTotalEqualTo(Long value) {
            addCriterion("sample_blks_total =", value, "sampleBlksTotal");
            return (Criteria) this;
        }

        public Criteria andSampleBlksTotalNotEqualTo(Long value) {
            addCriterion("sample_blks_total <>", value, "sampleBlksTotal");
            return (Criteria) this;
        }

        public Criteria andSampleBlksTotalGreaterThan(Long value) {
            addCriterion("sample_blks_total >", value, "sampleBlksTotal");
            return (Criteria) this;
        }

        public Criteria andSampleBlksTotalGreaterThanOrEqualTo(Long value) {
            addCriterion("sample_blks_total >=", value, "sampleBlksTotal");
            return (Criteria) this;
        }

        public Criteria andSampleBlksTotalLessThan(Long value) {
            addCriterion("sample_blks_total <", value, "sampleBlksTotal");
            return (Criteria) this;
        }

        public Criteria andSampleBlksTotalLessThanOrEqualTo(Long value) {
            addCriterion("sample_blks_total <=", value, "sampleBlksTotal");
            return (Criteria) this;
        }

        public Criteria andSampleBlksTotalIn(List<Long> values) {
            addCriterion("sample_blks_total in", values, "sampleBlksTotal");
            return (Criteria) this;
        }

        public Criteria andSampleBlksTotalNotIn(List<Long> values) {
            addCriterion("sample_blks_total not in", values, "sampleBlksTotal");
            return (Criteria) this;
        }

        public Criteria andSampleBlksTotalBetween(Long value1, Long value2) {
            addCriterion("sample_blks_total between", value1, value2, "sampleBlksTotal");
            return (Criteria) this;
        }

        public Criteria andSampleBlksTotalNotBetween(Long value1, Long value2) {
            addCriterion("sample_blks_total not between", value1, value2, "sampleBlksTotal");
            return (Criteria) this;
        }

        public Criteria andSampleBlksScannedIsNull() {
            addCriterion("sample_blks_scanned is null");
            return (Criteria) this;
        }

        public Criteria andSampleBlksScannedIsNotNull() {
            addCriterion("sample_blks_scanned is not null");
            return (Criteria) this;
        }

        public Criteria andSampleBlksScannedEqualTo(Long value) {
            addCriterion("sample_blks_scanned =", value, "sampleBlksScanned");
            return (Criteria) this;
        }

        public Criteria andSampleBlksScannedNotEqualTo(Long value) {
            addCriterion("sample_blks_scanned <>", value, "sampleBlksScanned");
            return (Criteria) this;
        }

        public Criteria andSampleBlksScannedGreaterThan(Long value) {
            addCriterion("sample_blks_scanned >", value, "sampleBlksScanned");
            return (Criteria) this;
        }

        public Criteria andSampleBlksScannedGreaterThanOrEqualTo(Long value) {
            addCriterion("sample_blks_scanned >=", value, "sampleBlksScanned");
            return (Criteria) this;
        }

        public Criteria andSampleBlksScannedLessThan(Long value) {
            addCriterion("sample_blks_scanned <", value, "sampleBlksScanned");
            return (Criteria) this;
        }

        public Criteria andSampleBlksScannedLessThanOrEqualTo(Long value) {
            addCriterion("sample_blks_scanned <=", value, "sampleBlksScanned");
            return (Criteria) this;
        }

        public Criteria andSampleBlksScannedIn(List<Long> values) {
            addCriterion("sample_blks_scanned in", values, "sampleBlksScanned");
            return (Criteria) this;
        }

        public Criteria andSampleBlksScannedNotIn(List<Long> values) {
            addCriterion("sample_blks_scanned not in", values, "sampleBlksScanned");
            return (Criteria) this;
        }

        public Criteria andSampleBlksScannedBetween(Long value1, Long value2) {
            addCriterion("sample_blks_scanned between", value1, value2, "sampleBlksScanned");
            return (Criteria) this;
        }

        public Criteria andSampleBlksScannedNotBetween(Long value1, Long value2) {
            addCriterion("sample_blks_scanned not between", value1, value2, "sampleBlksScanned");
            return (Criteria) this;
        }

        public Criteria andExtStatsTotalIsNull() {
            addCriterion("ext_stats_total is null");
            return (Criteria) this;
        }

        public Criteria andExtStatsTotalIsNotNull() {
            addCriterion("ext_stats_total is not null");
            return (Criteria) this;
        }

        public Criteria andExtStatsTotalEqualTo(Long value) {
            addCriterion("ext_stats_total =", value, "extStatsTotal");
            return (Criteria) this;
        }

        public Criteria andExtStatsTotalNotEqualTo(Long value) {
            addCriterion("ext_stats_total <>", value, "extStatsTotal");
            return (Criteria) this;
        }

        public Criteria andExtStatsTotalGreaterThan(Long value) {
            addCriterion("ext_stats_total >", value, "extStatsTotal");
            return (Criteria) this;
        }

        public Criteria andExtStatsTotalGreaterThanOrEqualTo(Long value) {
            addCriterion("ext_stats_total >=", value, "extStatsTotal");
            return (Criteria) this;
        }

        public Criteria andExtStatsTotalLessThan(Long value) {
            addCriterion("ext_stats_total <", value, "extStatsTotal");
            return (Criteria) this;
        }

        public Criteria andExtStatsTotalLessThanOrEqualTo(Long value) {
            addCriterion("ext_stats_total <=", value, "extStatsTotal");
            return (Criteria) this;
        }

        public Criteria andExtStatsTotalIn(List<Long> values) {
            addCriterion("ext_stats_total in", values, "extStatsTotal");
            return (Criteria) this;
        }

        public Criteria andExtStatsTotalNotIn(List<Long> values) {
            addCriterion("ext_stats_total not in", values, "extStatsTotal");
            return (Criteria) this;
        }

        public Criteria andExtStatsTotalBetween(Long value1, Long value2) {
            addCriterion("ext_stats_total between", value1, value2, "extStatsTotal");
            return (Criteria) this;
        }

        public Criteria andExtStatsTotalNotBetween(Long value1, Long value2) {
            addCriterion("ext_stats_total not between", value1, value2, "extStatsTotal");
            return (Criteria) this;
        }

        public Criteria andExtStatsComputedIsNull() {
            addCriterion("ext_stats_computed is null");
            return (Criteria) this;
        }

        public Criteria andExtStatsComputedIsNotNull() {
            addCriterion("ext_stats_computed is not null");
            return (Criteria) this;
        }

        public Criteria andExtStatsComputedEqualTo(Long value) {
            addCriterion("ext_stats_computed =", value, "extStatsComputed");
            return (Criteria) this;
        }

        public Criteria andExtStatsComputedNotEqualTo(Long value) {
            addCriterion("ext_stats_computed <>", value, "extStatsComputed");
            return (Criteria) this;
        }

        public Criteria andExtStatsComputedGreaterThan(Long value) {
            addCriterion("ext_stats_computed >", value, "extStatsComputed");
            return (Criteria) this;
        }

        public Criteria andExtStatsComputedGreaterThanOrEqualTo(Long value) {
            addCriterion("ext_stats_computed >=", value, "extStatsComputed");
            return (Criteria) this;
        }

        public Criteria andExtStatsComputedLessThan(Long value) {
            addCriterion("ext_stats_computed <", value, "extStatsComputed");
            return (Criteria) this;
        }

        public Criteria andExtStatsComputedLessThanOrEqualTo(Long value) {
            addCriterion("ext_stats_computed <=", value, "extStatsComputed");
            return (Criteria) this;
        }

        public Criteria andExtStatsComputedIn(List<Long> values) {
            addCriterion("ext_stats_computed in", values, "extStatsComputed");
            return (Criteria) this;
        }

        public Criteria andExtStatsComputedNotIn(List<Long> values) {
            addCriterion("ext_stats_computed not in", values, "extStatsComputed");
            return (Criteria) this;
        }

        public Criteria andExtStatsComputedBetween(Long value1, Long value2) {
            addCriterion("ext_stats_computed between", value1, value2, "extStatsComputed");
            return (Criteria) this;
        }

        public Criteria andExtStatsComputedNotBetween(Long value1, Long value2) {
            addCriterion("ext_stats_computed not between", value1, value2, "extStatsComputed");
            return (Criteria) this;
        }

        public Criteria andChildTablesTotalIsNull() {
            addCriterion("child_tables_total is null");
            return (Criteria) this;
        }

        public Criteria andChildTablesTotalIsNotNull() {
            addCriterion("child_tables_total is not null");
            return (Criteria) this;
        }

        public Criteria andChildTablesTotalEqualTo(Long value) {
            addCriterion("child_tables_total =", value, "childTablesTotal");
            return (Criteria) this;
        }

        public Criteria andChildTablesTotalNotEqualTo(Long value) {
            addCriterion("child_tables_total <>", value, "childTablesTotal");
            return (Criteria) this;
        }

        public Criteria andChildTablesTotalGreaterThan(Long value) {
            addCriterion("child_tables_total >", value, "childTablesTotal");
            return (Criteria) this;
        }

        public Criteria andChildTablesTotalGreaterThanOrEqualTo(Long value) {
            addCriterion("child_tables_total >=", value, "childTablesTotal");
            return (Criteria) this;
        }

        public Criteria andChildTablesTotalLessThan(Long value) {
            addCriterion("child_tables_total <", value, "childTablesTotal");
            return (Criteria) this;
        }

        public Criteria andChildTablesTotalLessThanOrEqualTo(Long value) {
            addCriterion("child_tables_total <=", value, "childTablesTotal");
            return (Criteria) this;
        }

        public Criteria andChildTablesTotalIn(List<Long> values) {
            addCriterion("child_tables_total in", values, "childTablesTotal");
            return (Criteria) this;
        }

        public Criteria andChildTablesTotalNotIn(List<Long> values) {
            addCriterion("child_tables_total not in", values, "childTablesTotal");
            return (Criteria) this;
        }

        public Criteria andChildTablesTotalBetween(Long value1, Long value2) {
            addCriterion("child_tables_total between", value1, value2, "childTablesTotal");
            return (Criteria) this;
        }

        public Criteria andChildTablesTotalNotBetween(Long value1, Long value2) {
            addCriterion("child_tables_total not between", value1, value2, "childTablesTotal");
            return (Criteria) this;
        }

        public Criteria andChildTablesDoneIsNull() {
            addCriterion("child_tables_done is null");
            return (Criteria) this;
        }

        public Criteria andChildTablesDoneIsNotNull() {
            addCriterion("child_tables_done is not null");
            return (Criteria) this;
        }

        public Criteria andChildTablesDoneEqualTo(Long value) {
            addCriterion("child_tables_done =", value, "childTablesDone");
            return (Criteria) this;
        }

        public Criteria andChildTablesDoneNotEqualTo(Long value) {
            addCriterion("child_tables_done <>", value, "childTablesDone");
            return (Criteria) this;
        }

        public Criteria andChildTablesDoneGreaterThan(Long value) {
            addCriterion("child_tables_done >", value, "childTablesDone");
            return (Criteria) this;
        }

        public Criteria andChildTablesDoneGreaterThanOrEqualTo(Long value) {
            addCriterion("child_tables_done >=", value, "childTablesDone");
            return (Criteria) this;
        }

        public Criteria andChildTablesDoneLessThan(Long value) {
            addCriterion("child_tables_done <", value, "childTablesDone");
            return (Criteria) this;
        }

        public Criteria andChildTablesDoneLessThanOrEqualTo(Long value) {
            addCriterion("child_tables_done <=", value, "childTablesDone");
            return (Criteria) this;
        }

        public Criteria andChildTablesDoneIn(List<Long> values) {
            addCriterion("child_tables_done in", values, "childTablesDone");
            return (Criteria) this;
        }

        public Criteria andChildTablesDoneNotIn(List<Long> values) {
            addCriterion("child_tables_done not in", values, "childTablesDone");
            return (Criteria) this;
        }

        public Criteria andChildTablesDoneBetween(Long value1, Long value2) {
            addCriterion("child_tables_done between", value1, value2, "childTablesDone");
            return (Criteria) this;
        }

        public Criteria andChildTablesDoneNotBetween(Long value1, Long value2) {
            addCriterion("child_tables_done not between", value1, value2, "childTablesDone");
            return (Criteria) this;
        }

        public Criteria andCurrentChildTableRelidIsNull() {
            addCriterion("current_child_table_relid is null");
            return (Criteria) this;
        }

        public Criteria andCurrentChildTableRelidIsNotNull() {
            addCriterion("current_child_table_relid is not null");
            return (Criteria) this;
        }

        public Criteria andCurrentChildTableRelidEqualTo(Long value) {
            addCriterion("current_child_table_relid =", value, "currentChildTableRelid");
            return (Criteria) this;
        }

        public Criteria andCurrentChildTableRelidNotEqualTo(Long value) {
            addCriterion("current_child_table_relid <>", value, "currentChildTableRelid");
            return (Criteria) this;
        }

        public Criteria andCurrentChildTableRelidGreaterThan(Long value) {
            addCriterion("current_child_table_relid >", value, "currentChildTableRelid");
            return (Criteria) this;
        }

        public Criteria andCurrentChildTableRelidGreaterThanOrEqualTo(Long value) {
            addCriterion("current_child_table_relid >=", value, "currentChildTableRelid");
            return (Criteria) this;
        }

        public Criteria andCurrentChildTableRelidLessThan(Long value) {
            addCriterion("current_child_table_relid <", value, "currentChildTableRelid");
            return (Criteria) this;
        }

        public Criteria andCurrentChildTableRelidLessThanOrEqualTo(Long value) {
            addCriterion("current_child_table_relid <=", value, "currentChildTableRelid");
            return (Criteria) this;
        }

        public Criteria andCurrentChildTableRelidIn(List<Long> values) {
            addCriterion("current_child_table_relid in", values, "currentChildTableRelid");
            return (Criteria) this;
        }

        public Criteria andCurrentChildTableRelidNotIn(List<Long> values) {
            addCriterion("current_child_table_relid not in", values, "currentChildTableRelid");
            return (Criteria) this;
        }

        public Criteria andCurrentChildTableRelidBetween(Long value1, Long value2) {
            addCriterion("current_child_table_relid between", value1, value2, "currentChildTableRelid");
            return (Criteria) this;
        }

        public Criteria andCurrentChildTableRelidNotBetween(Long value1, Long value2) {
            addCriterion("current_child_table_relid not between", value1, value2, "currentChildTableRelid");
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