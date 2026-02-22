package com.pool.readio.readiombg.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PgStatSubscriptionStatsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PgStatSubscriptionStatsExample() {
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

        public Criteria andApplyErrorCountIsNull() {
            addCriterion("apply_error_count is null");
            return (Criteria) this;
        }

        public Criteria andApplyErrorCountIsNotNull() {
            addCriterion("apply_error_count is not null");
            return (Criteria) this;
        }

        public Criteria andApplyErrorCountEqualTo(Long value) {
            addCriterion("apply_error_count =", value, "applyErrorCount");
            return (Criteria) this;
        }

        public Criteria andApplyErrorCountNotEqualTo(Long value) {
            addCriterion("apply_error_count <>", value, "applyErrorCount");
            return (Criteria) this;
        }

        public Criteria andApplyErrorCountGreaterThan(Long value) {
            addCriterion("apply_error_count >", value, "applyErrorCount");
            return (Criteria) this;
        }

        public Criteria andApplyErrorCountGreaterThanOrEqualTo(Long value) {
            addCriterion("apply_error_count >=", value, "applyErrorCount");
            return (Criteria) this;
        }

        public Criteria andApplyErrorCountLessThan(Long value) {
            addCriterion("apply_error_count <", value, "applyErrorCount");
            return (Criteria) this;
        }

        public Criteria andApplyErrorCountLessThanOrEqualTo(Long value) {
            addCriterion("apply_error_count <=", value, "applyErrorCount");
            return (Criteria) this;
        }

        public Criteria andApplyErrorCountIn(List<Long> values) {
            addCriterion("apply_error_count in", values, "applyErrorCount");
            return (Criteria) this;
        }

        public Criteria andApplyErrorCountNotIn(List<Long> values) {
            addCriterion("apply_error_count not in", values, "applyErrorCount");
            return (Criteria) this;
        }

        public Criteria andApplyErrorCountBetween(Long value1, Long value2) {
            addCriterion("apply_error_count between", value1, value2, "applyErrorCount");
            return (Criteria) this;
        }

        public Criteria andApplyErrorCountNotBetween(Long value1, Long value2) {
            addCriterion("apply_error_count not between", value1, value2, "applyErrorCount");
            return (Criteria) this;
        }

        public Criteria andSyncErrorCountIsNull() {
            addCriterion("sync_error_count is null");
            return (Criteria) this;
        }

        public Criteria andSyncErrorCountIsNotNull() {
            addCriterion("sync_error_count is not null");
            return (Criteria) this;
        }

        public Criteria andSyncErrorCountEqualTo(Long value) {
            addCriterion("sync_error_count =", value, "syncErrorCount");
            return (Criteria) this;
        }

        public Criteria andSyncErrorCountNotEqualTo(Long value) {
            addCriterion("sync_error_count <>", value, "syncErrorCount");
            return (Criteria) this;
        }

        public Criteria andSyncErrorCountGreaterThan(Long value) {
            addCriterion("sync_error_count >", value, "syncErrorCount");
            return (Criteria) this;
        }

        public Criteria andSyncErrorCountGreaterThanOrEqualTo(Long value) {
            addCriterion("sync_error_count >=", value, "syncErrorCount");
            return (Criteria) this;
        }

        public Criteria andSyncErrorCountLessThan(Long value) {
            addCriterion("sync_error_count <", value, "syncErrorCount");
            return (Criteria) this;
        }

        public Criteria andSyncErrorCountLessThanOrEqualTo(Long value) {
            addCriterion("sync_error_count <=", value, "syncErrorCount");
            return (Criteria) this;
        }

        public Criteria andSyncErrorCountIn(List<Long> values) {
            addCriterion("sync_error_count in", values, "syncErrorCount");
            return (Criteria) this;
        }

        public Criteria andSyncErrorCountNotIn(List<Long> values) {
            addCriterion("sync_error_count not in", values, "syncErrorCount");
            return (Criteria) this;
        }

        public Criteria andSyncErrorCountBetween(Long value1, Long value2) {
            addCriterion("sync_error_count between", value1, value2, "syncErrorCount");
            return (Criteria) this;
        }

        public Criteria andSyncErrorCountNotBetween(Long value1, Long value2) {
            addCriterion("sync_error_count not between", value1, value2, "syncErrorCount");
            return (Criteria) this;
        }

        public Criteria andConflInsertExistsIsNull() {
            addCriterion("confl_insert_exists is null");
            return (Criteria) this;
        }

        public Criteria andConflInsertExistsIsNotNull() {
            addCriterion("confl_insert_exists is not null");
            return (Criteria) this;
        }

        public Criteria andConflInsertExistsEqualTo(Long value) {
            addCriterion("confl_insert_exists =", value, "conflInsertExists");
            return (Criteria) this;
        }

        public Criteria andConflInsertExistsNotEqualTo(Long value) {
            addCriterion("confl_insert_exists <>", value, "conflInsertExists");
            return (Criteria) this;
        }

        public Criteria andConflInsertExistsGreaterThan(Long value) {
            addCriterion("confl_insert_exists >", value, "conflInsertExists");
            return (Criteria) this;
        }

        public Criteria andConflInsertExistsGreaterThanOrEqualTo(Long value) {
            addCriterion("confl_insert_exists >=", value, "conflInsertExists");
            return (Criteria) this;
        }

        public Criteria andConflInsertExistsLessThan(Long value) {
            addCriterion("confl_insert_exists <", value, "conflInsertExists");
            return (Criteria) this;
        }

        public Criteria andConflInsertExistsLessThanOrEqualTo(Long value) {
            addCriterion("confl_insert_exists <=", value, "conflInsertExists");
            return (Criteria) this;
        }

        public Criteria andConflInsertExistsIn(List<Long> values) {
            addCriterion("confl_insert_exists in", values, "conflInsertExists");
            return (Criteria) this;
        }

        public Criteria andConflInsertExistsNotIn(List<Long> values) {
            addCriterion("confl_insert_exists not in", values, "conflInsertExists");
            return (Criteria) this;
        }

        public Criteria andConflInsertExistsBetween(Long value1, Long value2) {
            addCriterion("confl_insert_exists between", value1, value2, "conflInsertExists");
            return (Criteria) this;
        }

        public Criteria andConflInsertExistsNotBetween(Long value1, Long value2) {
            addCriterion("confl_insert_exists not between", value1, value2, "conflInsertExists");
            return (Criteria) this;
        }

        public Criteria andConflUpdateOriginDiffersIsNull() {
            addCriterion("confl_update_origin_differs is null");
            return (Criteria) this;
        }

        public Criteria andConflUpdateOriginDiffersIsNotNull() {
            addCriterion("confl_update_origin_differs is not null");
            return (Criteria) this;
        }

        public Criteria andConflUpdateOriginDiffersEqualTo(Long value) {
            addCriterion("confl_update_origin_differs =", value, "conflUpdateOriginDiffers");
            return (Criteria) this;
        }

        public Criteria andConflUpdateOriginDiffersNotEqualTo(Long value) {
            addCriterion("confl_update_origin_differs <>", value, "conflUpdateOriginDiffers");
            return (Criteria) this;
        }

        public Criteria andConflUpdateOriginDiffersGreaterThan(Long value) {
            addCriterion("confl_update_origin_differs >", value, "conflUpdateOriginDiffers");
            return (Criteria) this;
        }

        public Criteria andConflUpdateOriginDiffersGreaterThanOrEqualTo(Long value) {
            addCriterion("confl_update_origin_differs >=", value, "conflUpdateOriginDiffers");
            return (Criteria) this;
        }

        public Criteria andConflUpdateOriginDiffersLessThan(Long value) {
            addCriterion("confl_update_origin_differs <", value, "conflUpdateOriginDiffers");
            return (Criteria) this;
        }

        public Criteria andConflUpdateOriginDiffersLessThanOrEqualTo(Long value) {
            addCriterion("confl_update_origin_differs <=", value, "conflUpdateOriginDiffers");
            return (Criteria) this;
        }

        public Criteria andConflUpdateOriginDiffersIn(List<Long> values) {
            addCriterion("confl_update_origin_differs in", values, "conflUpdateOriginDiffers");
            return (Criteria) this;
        }

        public Criteria andConflUpdateOriginDiffersNotIn(List<Long> values) {
            addCriterion("confl_update_origin_differs not in", values, "conflUpdateOriginDiffers");
            return (Criteria) this;
        }

        public Criteria andConflUpdateOriginDiffersBetween(Long value1, Long value2) {
            addCriterion("confl_update_origin_differs between", value1, value2, "conflUpdateOriginDiffers");
            return (Criteria) this;
        }

        public Criteria andConflUpdateOriginDiffersNotBetween(Long value1, Long value2) {
            addCriterion("confl_update_origin_differs not between", value1, value2, "conflUpdateOriginDiffers");
            return (Criteria) this;
        }

        public Criteria andConflUpdateExistsIsNull() {
            addCriterion("confl_update_exists is null");
            return (Criteria) this;
        }

        public Criteria andConflUpdateExistsIsNotNull() {
            addCriterion("confl_update_exists is not null");
            return (Criteria) this;
        }

        public Criteria andConflUpdateExistsEqualTo(Long value) {
            addCriterion("confl_update_exists =", value, "conflUpdateExists");
            return (Criteria) this;
        }

        public Criteria andConflUpdateExistsNotEqualTo(Long value) {
            addCriterion("confl_update_exists <>", value, "conflUpdateExists");
            return (Criteria) this;
        }

        public Criteria andConflUpdateExistsGreaterThan(Long value) {
            addCriterion("confl_update_exists >", value, "conflUpdateExists");
            return (Criteria) this;
        }

        public Criteria andConflUpdateExistsGreaterThanOrEqualTo(Long value) {
            addCriterion("confl_update_exists >=", value, "conflUpdateExists");
            return (Criteria) this;
        }

        public Criteria andConflUpdateExistsLessThan(Long value) {
            addCriterion("confl_update_exists <", value, "conflUpdateExists");
            return (Criteria) this;
        }

        public Criteria andConflUpdateExistsLessThanOrEqualTo(Long value) {
            addCriterion("confl_update_exists <=", value, "conflUpdateExists");
            return (Criteria) this;
        }

        public Criteria andConflUpdateExistsIn(List<Long> values) {
            addCriterion("confl_update_exists in", values, "conflUpdateExists");
            return (Criteria) this;
        }

        public Criteria andConflUpdateExistsNotIn(List<Long> values) {
            addCriterion("confl_update_exists not in", values, "conflUpdateExists");
            return (Criteria) this;
        }

        public Criteria andConflUpdateExistsBetween(Long value1, Long value2) {
            addCriterion("confl_update_exists between", value1, value2, "conflUpdateExists");
            return (Criteria) this;
        }

        public Criteria andConflUpdateExistsNotBetween(Long value1, Long value2) {
            addCriterion("confl_update_exists not between", value1, value2, "conflUpdateExists");
            return (Criteria) this;
        }

        public Criteria andConflUpdateMissingIsNull() {
            addCriterion("confl_update_missing is null");
            return (Criteria) this;
        }

        public Criteria andConflUpdateMissingIsNotNull() {
            addCriterion("confl_update_missing is not null");
            return (Criteria) this;
        }

        public Criteria andConflUpdateMissingEqualTo(Long value) {
            addCriterion("confl_update_missing =", value, "conflUpdateMissing");
            return (Criteria) this;
        }

        public Criteria andConflUpdateMissingNotEqualTo(Long value) {
            addCriterion("confl_update_missing <>", value, "conflUpdateMissing");
            return (Criteria) this;
        }

        public Criteria andConflUpdateMissingGreaterThan(Long value) {
            addCriterion("confl_update_missing >", value, "conflUpdateMissing");
            return (Criteria) this;
        }

        public Criteria andConflUpdateMissingGreaterThanOrEqualTo(Long value) {
            addCriterion("confl_update_missing >=", value, "conflUpdateMissing");
            return (Criteria) this;
        }

        public Criteria andConflUpdateMissingLessThan(Long value) {
            addCriterion("confl_update_missing <", value, "conflUpdateMissing");
            return (Criteria) this;
        }

        public Criteria andConflUpdateMissingLessThanOrEqualTo(Long value) {
            addCriterion("confl_update_missing <=", value, "conflUpdateMissing");
            return (Criteria) this;
        }

        public Criteria andConflUpdateMissingIn(List<Long> values) {
            addCriterion("confl_update_missing in", values, "conflUpdateMissing");
            return (Criteria) this;
        }

        public Criteria andConflUpdateMissingNotIn(List<Long> values) {
            addCriterion("confl_update_missing not in", values, "conflUpdateMissing");
            return (Criteria) this;
        }

        public Criteria andConflUpdateMissingBetween(Long value1, Long value2) {
            addCriterion("confl_update_missing between", value1, value2, "conflUpdateMissing");
            return (Criteria) this;
        }

        public Criteria andConflUpdateMissingNotBetween(Long value1, Long value2) {
            addCriterion("confl_update_missing not between", value1, value2, "conflUpdateMissing");
            return (Criteria) this;
        }

        public Criteria andConflDeleteOriginDiffersIsNull() {
            addCriterion("confl_delete_origin_differs is null");
            return (Criteria) this;
        }

        public Criteria andConflDeleteOriginDiffersIsNotNull() {
            addCriterion("confl_delete_origin_differs is not null");
            return (Criteria) this;
        }

        public Criteria andConflDeleteOriginDiffersEqualTo(Long value) {
            addCriterion("confl_delete_origin_differs =", value, "conflDeleteOriginDiffers");
            return (Criteria) this;
        }

        public Criteria andConflDeleteOriginDiffersNotEqualTo(Long value) {
            addCriterion("confl_delete_origin_differs <>", value, "conflDeleteOriginDiffers");
            return (Criteria) this;
        }

        public Criteria andConflDeleteOriginDiffersGreaterThan(Long value) {
            addCriterion("confl_delete_origin_differs >", value, "conflDeleteOriginDiffers");
            return (Criteria) this;
        }

        public Criteria andConflDeleteOriginDiffersGreaterThanOrEqualTo(Long value) {
            addCriterion("confl_delete_origin_differs >=", value, "conflDeleteOriginDiffers");
            return (Criteria) this;
        }

        public Criteria andConflDeleteOriginDiffersLessThan(Long value) {
            addCriterion("confl_delete_origin_differs <", value, "conflDeleteOriginDiffers");
            return (Criteria) this;
        }

        public Criteria andConflDeleteOriginDiffersLessThanOrEqualTo(Long value) {
            addCriterion("confl_delete_origin_differs <=", value, "conflDeleteOriginDiffers");
            return (Criteria) this;
        }

        public Criteria andConflDeleteOriginDiffersIn(List<Long> values) {
            addCriterion("confl_delete_origin_differs in", values, "conflDeleteOriginDiffers");
            return (Criteria) this;
        }

        public Criteria andConflDeleteOriginDiffersNotIn(List<Long> values) {
            addCriterion("confl_delete_origin_differs not in", values, "conflDeleteOriginDiffers");
            return (Criteria) this;
        }

        public Criteria andConflDeleteOriginDiffersBetween(Long value1, Long value2) {
            addCriterion("confl_delete_origin_differs between", value1, value2, "conflDeleteOriginDiffers");
            return (Criteria) this;
        }

        public Criteria andConflDeleteOriginDiffersNotBetween(Long value1, Long value2) {
            addCriterion("confl_delete_origin_differs not between", value1, value2, "conflDeleteOriginDiffers");
            return (Criteria) this;
        }

        public Criteria andConflDeleteMissingIsNull() {
            addCriterion("confl_delete_missing is null");
            return (Criteria) this;
        }

        public Criteria andConflDeleteMissingIsNotNull() {
            addCriterion("confl_delete_missing is not null");
            return (Criteria) this;
        }

        public Criteria andConflDeleteMissingEqualTo(Long value) {
            addCriterion("confl_delete_missing =", value, "conflDeleteMissing");
            return (Criteria) this;
        }

        public Criteria andConflDeleteMissingNotEqualTo(Long value) {
            addCriterion("confl_delete_missing <>", value, "conflDeleteMissing");
            return (Criteria) this;
        }

        public Criteria andConflDeleteMissingGreaterThan(Long value) {
            addCriterion("confl_delete_missing >", value, "conflDeleteMissing");
            return (Criteria) this;
        }

        public Criteria andConflDeleteMissingGreaterThanOrEqualTo(Long value) {
            addCriterion("confl_delete_missing >=", value, "conflDeleteMissing");
            return (Criteria) this;
        }

        public Criteria andConflDeleteMissingLessThan(Long value) {
            addCriterion("confl_delete_missing <", value, "conflDeleteMissing");
            return (Criteria) this;
        }

        public Criteria andConflDeleteMissingLessThanOrEqualTo(Long value) {
            addCriterion("confl_delete_missing <=", value, "conflDeleteMissing");
            return (Criteria) this;
        }

        public Criteria andConflDeleteMissingIn(List<Long> values) {
            addCriterion("confl_delete_missing in", values, "conflDeleteMissing");
            return (Criteria) this;
        }

        public Criteria andConflDeleteMissingNotIn(List<Long> values) {
            addCriterion("confl_delete_missing not in", values, "conflDeleteMissing");
            return (Criteria) this;
        }

        public Criteria andConflDeleteMissingBetween(Long value1, Long value2) {
            addCriterion("confl_delete_missing between", value1, value2, "conflDeleteMissing");
            return (Criteria) this;
        }

        public Criteria andConflDeleteMissingNotBetween(Long value1, Long value2) {
            addCriterion("confl_delete_missing not between", value1, value2, "conflDeleteMissing");
            return (Criteria) this;
        }

        public Criteria andConflMultipleUniqueConflictsIsNull() {
            addCriterion("confl_multiple_unique_conflicts is null");
            return (Criteria) this;
        }

        public Criteria andConflMultipleUniqueConflictsIsNotNull() {
            addCriterion("confl_multiple_unique_conflicts is not null");
            return (Criteria) this;
        }

        public Criteria andConflMultipleUniqueConflictsEqualTo(Long value) {
            addCriterion("confl_multiple_unique_conflicts =", value, "conflMultipleUniqueConflicts");
            return (Criteria) this;
        }

        public Criteria andConflMultipleUniqueConflictsNotEqualTo(Long value) {
            addCriterion("confl_multiple_unique_conflicts <>", value, "conflMultipleUniqueConflicts");
            return (Criteria) this;
        }

        public Criteria andConflMultipleUniqueConflictsGreaterThan(Long value) {
            addCriterion("confl_multiple_unique_conflicts >", value, "conflMultipleUniqueConflicts");
            return (Criteria) this;
        }

        public Criteria andConflMultipleUniqueConflictsGreaterThanOrEqualTo(Long value) {
            addCriterion("confl_multiple_unique_conflicts >=", value, "conflMultipleUniqueConflicts");
            return (Criteria) this;
        }

        public Criteria andConflMultipleUniqueConflictsLessThan(Long value) {
            addCriterion("confl_multiple_unique_conflicts <", value, "conflMultipleUniqueConflicts");
            return (Criteria) this;
        }

        public Criteria andConflMultipleUniqueConflictsLessThanOrEqualTo(Long value) {
            addCriterion("confl_multiple_unique_conflicts <=", value, "conflMultipleUniqueConflicts");
            return (Criteria) this;
        }

        public Criteria andConflMultipleUniqueConflictsIn(List<Long> values) {
            addCriterion("confl_multiple_unique_conflicts in", values, "conflMultipleUniqueConflicts");
            return (Criteria) this;
        }

        public Criteria andConflMultipleUniqueConflictsNotIn(List<Long> values) {
            addCriterion("confl_multiple_unique_conflicts not in", values, "conflMultipleUniqueConflicts");
            return (Criteria) this;
        }

        public Criteria andConflMultipleUniqueConflictsBetween(Long value1, Long value2) {
            addCriterion("confl_multiple_unique_conflicts between", value1, value2, "conflMultipleUniqueConflicts");
            return (Criteria) this;
        }

        public Criteria andConflMultipleUniqueConflictsNotBetween(Long value1, Long value2) {
            addCriterion("confl_multiple_unique_conflicts not between", value1, value2, "conflMultipleUniqueConflicts");
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