package com.pool.readio.readiombg.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PgReplicationSlotsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PgReplicationSlotsExample() {
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

        public Criteria andPluginIsNull() {
            addCriterion("plugin is null");
            return (Criteria) this;
        }

        public Criteria andPluginIsNotNull() {
            addCriterion("plugin is not null");
            return (Criteria) this;
        }

        public Criteria andPluginEqualTo(String value) {
            addCriterion("plugin =", value, "plugin");
            return (Criteria) this;
        }

        public Criteria andPluginNotEqualTo(String value) {
            addCriterion("plugin <>", value, "plugin");
            return (Criteria) this;
        }

        public Criteria andPluginGreaterThan(String value) {
            addCriterion("plugin >", value, "plugin");
            return (Criteria) this;
        }

        public Criteria andPluginGreaterThanOrEqualTo(String value) {
            addCriterion("plugin >=", value, "plugin");
            return (Criteria) this;
        }

        public Criteria andPluginLessThan(String value) {
            addCriterion("plugin <", value, "plugin");
            return (Criteria) this;
        }

        public Criteria andPluginLessThanOrEqualTo(String value) {
            addCriterion("plugin <=", value, "plugin");
            return (Criteria) this;
        }

        public Criteria andPluginLike(String value) {
            addCriterion("plugin like", value, "plugin");
            return (Criteria) this;
        }

        public Criteria andPluginNotLike(String value) {
            addCriterion("plugin not like", value, "plugin");
            return (Criteria) this;
        }

        public Criteria andPluginIn(List<String> values) {
            addCriterion("plugin in", values, "plugin");
            return (Criteria) this;
        }

        public Criteria andPluginNotIn(List<String> values) {
            addCriterion("plugin not in", values, "plugin");
            return (Criteria) this;
        }

        public Criteria andPluginBetween(String value1, String value2) {
            addCriterion("plugin between", value1, value2, "plugin");
            return (Criteria) this;
        }

        public Criteria andPluginNotBetween(String value1, String value2) {
            addCriterion("plugin not between", value1, value2, "plugin");
            return (Criteria) this;
        }

        public Criteria andSlotTypeIsNull() {
            addCriterion("slot_type is null");
            return (Criteria) this;
        }

        public Criteria andSlotTypeIsNotNull() {
            addCriterion("slot_type is not null");
            return (Criteria) this;
        }

        public Criteria andSlotTypeEqualTo(String value) {
            addCriterion("slot_type =", value, "slotType");
            return (Criteria) this;
        }

        public Criteria andSlotTypeNotEqualTo(String value) {
            addCriterion("slot_type <>", value, "slotType");
            return (Criteria) this;
        }

        public Criteria andSlotTypeGreaterThan(String value) {
            addCriterion("slot_type >", value, "slotType");
            return (Criteria) this;
        }

        public Criteria andSlotTypeGreaterThanOrEqualTo(String value) {
            addCriterion("slot_type >=", value, "slotType");
            return (Criteria) this;
        }

        public Criteria andSlotTypeLessThan(String value) {
            addCriterion("slot_type <", value, "slotType");
            return (Criteria) this;
        }

        public Criteria andSlotTypeLessThanOrEqualTo(String value) {
            addCriterion("slot_type <=", value, "slotType");
            return (Criteria) this;
        }

        public Criteria andSlotTypeLike(String value) {
            addCriterion("slot_type like", value, "slotType");
            return (Criteria) this;
        }

        public Criteria andSlotTypeNotLike(String value) {
            addCriterion("slot_type not like", value, "slotType");
            return (Criteria) this;
        }

        public Criteria andSlotTypeIn(List<String> values) {
            addCriterion("slot_type in", values, "slotType");
            return (Criteria) this;
        }

        public Criteria andSlotTypeNotIn(List<String> values) {
            addCriterion("slot_type not in", values, "slotType");
            return (Criteria) this;
        }

        public Criteria andSlotTypeBetween(String value1, String value2) {
            addCriterion("slot_type between", value1, value2, "slotType");
            return (Criteria) this;
        }

        public Criteria andSlotTypeNotBetween(String value1, String value2) {
            addCriterion("slot_type not between", value1, value2, "slotType");
            return (Criteria) this;
        }

        public Criteria andDatoidIsNull() {
            addCriterion("datoid is null");
            return (Criteria) this;
        }

        public Criteria andDatoidIsNotNull() {
            addCriterion("datoid is not null");
            return (Criteria) this;
        }

        public Criteria andDatoidEqualTo(Long value) {
            addCriterion("datoid =", value, "datoid");
            return (Criteria) this;
        }

        public Criteria andDatoidNotEqualTo(Long value) {
            addCriterion("datoid <>", value, "datoid");
            return (Criteria) this;
        }

        public Criteria andDatoidGreaterThan(Long value) {
            addCriterion("datoid >", value, "datoid");
            return (Criteria) this;
        }

        public Criteria andDatoidGreaterThanOrEqualTo(Long value) {
            addCriterion("datoid >=", value, "datoid");
            return (Criteria) this;
        }

        public Criteria andDatoidLessThan(Long value) {
            addCriterion("datoid <", value, "datoid");
            return (Criteria) this;
        }

        public Criteria andDatoidLessThanOrEqualTo(Long value) {
            addCriterion("datoid <=", value, "datoid");
            return (Criteria) this;
        }

        public Criteria andDatoidIn(List<Long> values) {
            addCriterion("datoid in", values, "datoid");
            return (Criteria) this;
        }

        public Criteria andDatoidNotIn(List<Long> values) {
            addCriterion("datoid not in", values, "datoid");
            return (Criteria) this;
        }

        public Criteria andDatoidBetween(Long value1, Long value2) {
            addCriterion("datoid between", value1, value2, "datoid");
            return (Criteria) this;
        }

        public Criteria andDatoidNotBetween(Long value1, Long value2) {
            addCriterion("datoid not between", value1, value2, "datoid");
            return (Criteria) this;
        }

        public Criteria andDatabaseIsNull() {
            addCriterion("database is null");
            return (Criteria) this;
        }

        public Criteria andDatabaseIsNotNull() {
            addCriterion("database is not null");
            return (Criteria) this;
        }

        public Criteria andDatabaseEqualTo(String value) {
            addCriterion("database =", value, "database");
            return (Criteria) this;
        }

        public Criteria andDatabaseNotEqualTo(String value) {
            addCriterion("database <>", value, "database");
            return (Criteria) this;
        }

        public Criteria andDatabaseGreaterThan(String value) {
            addCriterion("database >", value, "database");
            return (Criteria) this;
        }

        public Criteria andDatabaseGreaterThanOrEqualTo(String value) {
            addCriterion("database >=", value, "database");
            return (Criteria) this;
        }

        public Criteria andDatabaseLessThan(String value) {
            addCriterion("database <", value, "database");
            return (Criteria) this;
        }

        public Criteria andDatabaseLessThanOrEqualTo(String value) {
            addCriterion("database <=", value, "database");
            return (Criteria) this;
        }

        public Criteria andDatabaseLike(String value) {
            addCriterion("database like", value, "database");
            return (Criteria) this;
        }

        public Criteria andDatabaseNotLike(String value) {
            addCriterion("database not like", value, "database");
            return (Criteria) this;
        }

        public Criteria andDatabaseIn(List<String> values) {
            addCriterion("database in", values, "database");
            return (Criteria) this;
        }

        public Criteria andDatabaseNotIn(List<String> values) {
            addCriterion("database not in", values, "database");
            return (Criteria) this;
        }

        public Criteria andDatabaseBetween(String value1, String value2) {
            addCriterion("database between", value1, value2, "database");
            return (Criteria) this;
        }

        public Criteria andDatabaseNotBetween(String value1, String value2) {
            addCriterion("database not between", value1, value2, "database");
            return (Criteria) this;
        }

        public Criteria andTemporaryIsNull() {
            addCriterion("temporary is null");
            return (Criteria) this;
        }

        public Criteria andTemporaryIsNotNull() {
            addCriterion("temporary is not null");
            return (Criteria) this;
        }

        public Criteria andTemporaryEqualTo(Boolean value) {
            addCriterion("temporary =", value, "temporary");
            return (Criteria) this;
        }

        public Criteria andTemporaryNotEqualTo(Boolean value) {
            addCriterion("temporary <>", value, "temporary");
            return (Criteria) this;
        }

        public Criteria andTemporaryGreaterThan(Boolean value) {
            addCriterion("temporary >", value, "temporary");
            return (Criteria) this;
        }

        public Criteria andTemporaryGreaterThanOrEqualTo(Boolean value) {
            addCriterion("temporary >=", value, "temporary");
            return (Criteria) this;
        }

        public Criteria andTemporaryLessThan(Boolean value) {
            addCriterion("temporary <", value, "temporary");
            return (Criteria) this;
        }

        public Criteria andTemporaryLessThanOrEqualTo(Boolean value) {
            addCriterion("temporary <=", value, "temporary");
            return (Criteria) this;
        }

        public Criteria andTemporaryIn(List<Boolean> values) {
            addCriterion("temporary in", values, "temporary");
            return (Criteria) this;
        }

        public Criteria andTemporaryNotIn(List<Boolean> values) {
            addCriterion("temporary not in", values, "temporary");
            return (Criteria) this;
        }

        public Criteria andTemporaryBetween(Boolean value1, Boolean value2) {
            addCriterion("temporary between", value1, value2, "temporary");
            return (Criteria) this;
        }

        public Criteria andTemporaryNotBetween(Boolean value1, Boolean value2) {
            addCriterion("temporary not between", value1, value2, "temporary");
            return (Criteria) this;
        }

        public Criteria andActiveIsNull() {
            addCriterion("active is null");
            return (Criteria) this;
        }

        public Criteria andActiveIsNotNull() {
            addCriterion("active is not null");
            return (Criteria) this;
        }

        public Criteria andActiveEqualTo(Boolean value) {
            addCriterion("active =", value, "active");
            return (Criteria) this;
        }

        public Criteria andActiveNotEqualTo(Boolean value) {
            addCriterion("active <>", value, "active");
            return (Criteria) this;
        }

        public Criteria andActiveGreaterThan(Boolean value) {
            addCriterion("active >", value, "active");
            return (Criteria) this;
        }

        public Criteria andActiveGreaterThanOrEqualTo(Boolean value) {
            addCriterion("active >=", value, "active");
            return (Criteria) this;
        }

        public Criteria andActiveLessThan(Boolean value) {
            addCriterion("active <", value, "active");
            return (Criteria) this;
        }

        public Criteria andActiveLessThanOrEqualTo(Boolean value) {
            addCriterion("active <=", value, "active");
            return (Criteria) this;
        }

        public Criteria andActiveIn(List<Boolean> values) {
            addCriterion("active in", values, "active");
            return (Criteria) this;
        }

        public Criteria andActiveNotIn(List<Boolean> values) {
            addCriterion("active not in", values, "active");
            return (Criteria) this;
        }

        public Criteria andActiveBetween(Boolean value1, Boolean value2) {
            addCriterion("active between", value1, value2, "active");
            return (Criteria) this;
        }

        public Criteria andActiveNotBetween(Boolean value1, Boolean value2) {
            addCriterion("active not between", value1, value2, "active");
            return (Criteria) this;
        }

        public Criteria andActivePidIsNull() {
            addCriterion("active_pid is null");
            return (Criteria) this;
        }

        public Criteria andActivePidIsNotNull() {
            addCriterion("active_pid is not null");
            return (Criteria) this;
        }

        public Criteria andActivePidEqualTo(Integer value) {
            addCriterion("active_pid =", value, "activePid");
            return (Criteria) this;
        }

        public Criteria andActivePidNotEqualTo(Integer value) {
            addCriterion("active_pid <>", value, "activePid");
            return (Criteria) this;
        }

        public Criteria andActivePidGreaterThan(Integer value) {
            addCriterion("active_pid >", value, "activePid");
            return (Criteria) this;
        }

        public Criteria andActivePidGreaterThanOrEqualTo(Integer value) {
            addCriterion("active_pid >=", value, "activePid");
            return (Criteria) this;
        }

        public Criteria andActivePidLessThan(Integer value) {
            addCriterion("active_pid <", value, "activePid");
            return (Criteria) this;
        }

        public Criteria andActivePidLessThanOrEqualTo(Integer value) {
            addCriterion("active_pid <=", value, "activePid");
            return (Criteria) this;
        }

        public Criteria andActivePidIn(List<Integer> values) {
            addCriterion("active_pid in", values, "activePid");
            return (Criteria) this;
        }

        public Criteria andActivePidNotIn(List<Integer> values) {
            addCriterion("active_pid not in", values, "activePid");
            return (Criteria) this;
        }

        public Criteria andActivePidBetween(Integer value1, Integer value2) {
            addCriterion("active_pid between", value1, value2, "activePid");
            return (Criteria) this;
        }

        public Criteria andActivePidNotBetween(Integer value1, Integer value2) {
            addCriterion("active_pid not between", value1, value2, "activePid");
            return (Criteria) this;
        }

        public Criteria andXminIsNull() {
            addCriterion("xmin is null");
            return (Criteria) this;
        }

        public Criteria andXminIsNotNull() {
            addCriterion("xmin is not null");
            return (Criteria) this;
        }

        public Criteria andXminEqualTo(Object value) {
            addCriterion("xmin =", value, "xmin");
            return (Criteria) this;
        }

        public Criteria andXminNotEqualTo(Object value) {
            addCriterion("xmin <>", value, "xmin");
            return (Criteria) this;
        }

        public Criteria andXminGreaterThan(Object value) {
            addCriterion("xmin >", value, "xmin");
            return (Criteria) this;
        }

        public Criteria andXminGreaterThanOrEqualTo(Object value) {
            addCriterion("xmin >=", value, "xmin");
            return (Criteria) this;
        }

        public Criteria andXminLessThan(Object value) {
            addCriterion("xmin <", value, "xmin");
            return (Criteria) this;
        }

        public Criteria andXminLessThanOrEqualTo(Object value) {
            addCriterion("xmin <=", value, "xmin");
            return (Criteria) this;
        }

        public Criteria andXminIn(List<Object> values) {
            addCriterion("xmin in", values, "xmin");
            return (Criteria) this;
        }

        public Criteria andXminNotIn(List<Object> values) {
            addCriterion("xmin not in", values, "xmin");
            return (Criteria) this;
        }

        public Criteria andXminBetween(Object value1, Object value2) {
            addCriterion("xmin between", value1, value2, "xmin");
            return (Criteria) this;
        }

        public Criteria andXminNotBetween(Object value1, Object value2) {
            addCriterion("xmin not between", value1, value2, "xmin");
            return (Criteria) this;
        }

        public Criteria andCatalogXminIsNull() {
            addCriterion("catalog_xmin is null");
            return (Criteria) this;
        }

        public Criteria andCatalogXminIsNotNull() {
            addCriterion("catalog_xmin is not null");
            return (Criteria) this;
        }

        public Criteria andCatalogXminEqualTo(Object value) {
            addCriterion("catalog_xmin =", value, "catalogXmin");
            return (Criteria) this;
        }

        public Criteria andCatalogXminNotEqualTo(Object value) {
            addCriterion("catalog_xmin <>", value, "catalogXmin");
            return (Criteria) this;
        }

        public Criteria andCatalogXminGreaterThan(Object value) {
            addCriterion("catalog_xmin >", value, "catalogXmin");
            return (Criteria) this;
        }

        public Criteria andCatalogXminGreaterThanOrEqualTo(Object value) {
            addCriterion("catalog_xmin >=", value, "catalogXmin");
            return (Criteria) this;
        }

        public Criteria andCatalogXminLessThan(Object value) {
            addCriterion("catalog_xmin <", value, "catalogXmin");
            return (Criteria) this;
        }

        public Criteria andCatalogXminLessThanOrEqualTo(Object value) {
            addCriterion("catalog_xmin <=", value, "catalogXmin");
            return (Criteria) this;
        }

        public Criteria andCatalogXminIn(List<Object> values) {
            addCriterion("catalog_xmin in", values, "catalogXmin");
            return (Criteria) this;
        }

        public Criteria andCatalogXminNotIn(List<Object> values) {
            addCriterion("catalog_xmin not in", values, "catalogXmin");
            return (Criteria) this;
        }

        public Criteria andCatalogXminBetween(Object value1, Object value2) {
            addCriterion("catalog_xmin between", value1, value2, "catalogXmin");
            return (Criteria) this;
        }

        public Criteria andCatalogXminNotBetween(Object value1, Object value2) {
            addCriterion("catalog_xmin not between", value1, value2, "catalogXmin");
            return (Criteria) this;
        }

        public Criteria andRestartLsnIsNull() {
            addCriterion("restart_lsn is null");
            return (Criteria) this;
        }

        public Criteria andRestartLsnIsNotNull() {
            addCriterion("restart_lsn is not null");
            return (Criteria) this;
        }

        public Criteria andRestartLsnEqualTo(Object value) {
            addCriterion("restart_lsn =", value, "restartLsn");
            return (Criteria) this;
        }

        public Criteria andRestartLsnNotEqualTo(Object value) {
            addCriterion("restart_lsn <>", value, "restartLsn");
            return (Criteria) this;
        }

        public Criteria andRestartLsnGreaterThan(Object value) {
            addCriterion("restart_lsn >", value, "restartLsn");
            return (Criteria) this;
        }

        public Criteria andRestartLsnGreaterThanOrEqualTo(Object value) {
            addCriterion("restart_lsn >=", value, "restartLsn");
            return (Criteria) this;
        }

        public Criteria andRestartLsnLessThan(Object value) {
            addCriterion("restart_lsn <", value, "restartLsn");
            return (Criteria) this;
        }

        public Criteria andRestartLsnLessThanOrEqualTo(Object value) {
            addCriterion("restart_lsn <=", value, "restartLsn");
            return (Criteria) this;
        }

        public Criteria andRestartLsnIn(List<Object> values) {
            addCriterion("restart_lsn in", values, "restartLsn");
            return (Criteria) this;
        }

        public Criteria andRestartLsnNotIn(List<Object> values) {
            addCriterion("restart_lsn not in", values, "restartLsn");
            return (Criteria) this;
        }

        public Criteria andRestartLsnBetween(Object value1, Object value2) {
            addCriterion("restart_lsn between", value1, value2, "restartLsn");
            return (Criteria) this;
        }

        public Criteria andRestartLsnNotBetween(Object value1, Object value2) {
            addCriterion("restart_lsn not between", value1, value2, "restartLsn");
            return (Criteria) this;
        }

        public Criteria andConfirmedFlushLsnIsNull() {
            addCriterion("confirmed_flush_lsn is null");
            return (Criteria) this;
        }

        public Criteria andConfirmedFlushLsnIsNotNull() {
            addCriterion("confirmed_flush_lsn is not null");
            return (Criteria) this;
        }

        public Criteria andConfirmedFlushLsnEqualTo(Object value) {
            addCriterion("confirmed_flush_lsn =", value, "confirmedFlushLsn");
            return (Criteria) this;
        }

        public Criteria andConfirmedFlushLsnNotEqualTo(Object value) {
            addCriterion("confirmed_flush_lsn <>", value, "confirmedFlushLsn");
            return (Criteria) this;
        }

        public Criteria andConfirmedFlushLsnGreaterThan(Object value) {
            addCriterion("confirmed_flush_lsn >", value, "confirmedFlushLsn");
            return (Criteria) this;
        }

        public Criteria andConfirmedFlushLsnGreaterThanOrEqualTo(Object value) {
            addCriterion("confirmed_flush_lsn >=", value, "confirmedFlushLsn");
            return (Criteria) this;
        }

        public Criteria andConfirmedFlushLsnLessThan(Object value) {
            addCriterion("confirmed_flush_lsn <", value, "confirmedFlushLsn");
            return (Criteria) this;
        }

        public Criteria andConfirmedFlushLsnLessThanOrEqualTo(Object value) {
            addCriterion("confirmed_flush_lsn <=", value, "confirmedFlushLsn");
            return (Criteria) this;
        }

        public Criteria andConfirmedFlushLsnIn(List<Object> values) {
            addCriterion("confirmed_flush_lsn in", values, "confirmedFlushLsn");
            return (Criteria) this;
        }

        public Criteria andConfirmedFlushLsnNotIn(List<Object> values) {
            addCriterion("confirmed_flush_lsn not in", values, "confirmedFlushLsn");
            return (Criteria) this;
        }

        public Criteria andConfirmedFlushLsnBetween(Object value1, Object value2) {
            addCriterion("confirmed_flush_lsn between", value1, value2, "confirmedFlushLsn");
            return (Criteria) this;
        }

        public Criteria andConfirmedFlushLsnNotBetween(Object value1, Object value2) {
            addCriterion("confirmed_flush_lsn not between", value1, value2, "confirmedFlushLsn");
            return (Criteria) this;
        }

        public Criteria andWalStatusIsNull() {
            addCriterion("wal_status is null");
            return (Criteria) this;
        }

        public Criteria andWalStatusIsNotNull() {
            addCriterion("wal_status is not null");
            return (Criteria) this;
        }

        public Criteria andWalStatusEqualTo(String value) {
            addCriterion("wal_status =", value, "walStatus");
            return (Criteria) this;
        }

        public Criteria andWalStatusNotEqualTo(String value) {
            addCriterion("wal_status <>", value, "walStatus");
            return (Criteria) this;
        }

        public Criteria andWalStatusGreaterThan(String value) {
            addCriterion("wal_status >", value, "walStatus");
            return (Criteria) this;
        }

        public Criteria andWalStatusGreaterThanOrEqualTo(String value) {
            addCriterion("wal_status >=", value, "walStatus");
            return (Criteria) this;
        }

        public Criteria andWalStatusLessThan(String value) {
            addCriterion("wal_status <", value, "walStatus");
            return (Criteria) this;
        }

        public Criteria andWalStatusLessThanOrEqualTo(String value) {
            addCriterion("wal_status <=", value, "walStatus");
            return (Criteria) this;
        }

        public Criteria andWalStatusLike(String value) {
            addCriterion("wal_status like", value, "walStatus");
            return (Criteria) this;
        }

        public Criteria andWalStatusNotLike(String value) {
            addCriterion("wal_status not like", value, "walStatus");
            return (Criteria) this;
        }

        public Criteria andWalStatusIn(List<String> values) {
            addCriterion("wal_status in", values, "walStatus");
            return (Criteria) this;
        }

        public Criteria andWalStatusNotIn(List<String> values) {
            addCriterion("wal_status not in", values, "walStatus");
            return (Criteria) this;
        }

        public Criteria andWalStatusBetween(String value1, String value2) {
            addCriterion("wal_status between", value1, value2, "walStatus");
            return (Criteria) this;
        }

        public Criteria andWalStatusNotBetween(String value1, String value2) {
            addCriterion("wal_status not between", value1, value2, "walStatus");
            return (Criteria) this;
        }

        public Criteria andSafeWalSizeIsNull() {
            addCriterion("safe_wal_size is null");
            return (Criteria) this;
        }

        public Criteria andSafeWalSizeIsNotNull() {
            addCriterion("safe_wal_size is not null");
            return (Criteria) this;
        }

        public Criteria andSafeWalSizeEqualTo(Long value) {
            addCriterion("safe_wal_size =", value, "safeWalSize");
            return (Criteria) this;
        }

        public Criteria andSafeWalSizeNotEqualTo(Long value) {
            addCriterion("safe_wal_size <>", value, "safeWalSize");
            return (Criteria) this;
        }

        public Criteria andSafeWalSizeGreaterThan(Long value) {
            addCriterion("safe_wal_size >", value, "safeWalSize");
            return (Criteria) this;
        }

        public Criteria andSafeWalSizeGreaterThanOrEqualTo(Long value) {
            addCriterion("safe_wal_size >=", value, "safeWalSize");
            return (Criteria) this;
        }

        public Criteria andSafeWalSizeLessThan(Long value) {
            addCriterion("safe_wal_size <", value, "safeWalSize");
            return (Criteria) this;
        }

        public Criteria andSafeWalSizeLessThanOrEqualTo(Long value) {
            addCriterion("safe_wal_size <=", value, "safeWalSize");
            return (Criteria) this;
        }

        public Criteria andSafeWalSizeIn(List<Long> values) {
            addCriterion("safe_wal_size in", values, "safeWalSize");
            return (Criteria) this;
        }

        public Criteria andSafeWalSizeNotIn(List<Long> values) {
            addCriterion("safe_wal_size not in", values, "safeWalSize");
            return (Criteria) this;
        }

        public Criteria andSafeWalSizeBetween(Long value1, Long value2) {
            addCriterion("safe_wal_size between", value1, value2, "safeWalSize");
            return (Criteria) this;
        }

        public Criteria andSafeWalSizeNotBetween(Long value1, Long value2) {
            addCriterion("safe_wal_size not between", value1, value2, "safeWalSize");
            return (Criteria) this;
        }

        public Criteria andTwoPhaseIsNull() {
            addCriterion("two_phase is null");
            return (Criteria) this;
        }

        public Criteria andTwoPhaseIsNotNull() {
            addCriterion("two_phase is not null");
            return (Criteria) this;
        }

        public Criteria andTwoPhaseEqualTo(Boolean value) {
            addCriterion("two_phase =", value, "twoPhase");
            return (Criteria) this;
        }

        public Criteria andTwoPhaseNotEqualTo(Boolean value) {
            addCriterion("two_phase <>", value, "twoPhase");
            return (Criteria) this;
        }

        public Criteria andTwoPhaseGreaterThan(Boolean value) {
            addCriterion("two_phase >", value, "twoPhase");
            return (Criteria) this;
        }

        public Criteria andTwoPhaseGreaterThanOrEqualTo(Boolean value) {
            addCriterion("two_phase >=", value, "twoPhase");
            return (Criteria) this;
        }

        public Criteria andTwoPhaseLessThan(Boolean value) {
            addCriterion("two_phase <", value, "twoPhase");
            return (Criteria) this;
        }

        public Criteria andTwoPhaseLessThanOrEqualTo(Boolean value) {
            addCriterion("two_phase <=", value, "twoPhase");
            return (Criteria) this;
        }

        public Criteria andTwoPhaseIn(List<Boolean> values) {
            addCriterion("two_phase in", values, "twoPhase");
            return (Criteria) this;
        }

        public Criteria andTwoPhaseNotIn(List<Boolean> values) {
            addCriterion("two_phase not in", values, "twoPhase");
            return (Criteria) this;
        }

        public Criteria andTwoPhaseBetween(Boolean value1, Boolean value2) {
            addCriterion("two_phase between", value1, value2, "twoPhase");
            return (Criteria) this;
        }

        public Criteria andTwoPhaseNotBetween(Boolean value1, Boolean value2) {
            addCriterion("two_phase not between", value1, value2, "twoPhase");
            return (Criteria) this;
        }

        public Criteria andTwoPhaseAtIsNull() {
            addCriterion("two_phase_at is null");
            return (Criteria) this;
        }

        public Criteria andTwoPhaseAtIsNotNull() {
            addCriterion("two_phase_at is not null");
            return (Criteria) this;
        }

        public Criteria andTwoPhaseAtEqualTo(Object value) {
            addCriterion("two_phase_at =", value, "twoPhaseAt");
            return (Criteria) this;
        }

        public Criteria andTwoPhaseAtNotEqualTo(Object value) {
            addCriterion("two_phase_at <>", value, "twoPhaseAt");
            return (Criteria) this;
        }

        public Criteria andTwoPhaseAtGreaterThan(Object value) {
            addCriterion("two_phase_at >", value, "twoPhaseAt");
            return (Criteria) this;
        }

        public Criteria andTwoPhaseAtGreaterThanOrEqualTo(Object value) {
            addCriterion("two_phase_at >=", value, "twoPhaseAt");
            return (Criteria) this;
        }

        public Criteria andTwoPhaseAtLessThan(Object value) {
            addCriterion("two_phase_at <", value, "twoPhaseAt");
            return (Criteria) this;
        }

        public Criteria andTwoPhaseAtLessThanOrEqualTo(Object value) {
            addCriterion("two_phase_at <=", value, "twoPhaseAt");
            return (Criteria) this;
        }

        public Criteria andTwoPhaseAtIn(List<Object> values) {
            addCriterion("two_phase_at in", values, "twoPhaseAt");
            return (Criteria) this;
        }

        public Criteria andTwoPhaseAtNotIn(List<Object> values) {
            addCriterion("two_phase_at not in", values, "twoPhaseAt");
            return (Criteria) this;
        }

        public Criteria andTwoPhaseAtBetween(Object value1, Object value2) {
            addCriterion("two_phase_at between", value1, value2, "twoPhaseAt");
            return (Criteria) this;
        }

        public Criteria andTwoPhaseAtNotBetween(Object value1, Object value2) {
            addCriterion("two_phase_at not between", value1, value2, "twoPhaseAt");
            return (Criteria) this;
        }

        public Criteria andInactiveSinceIsNull() {
            addCriterion("inactive_since is null");
            return (Criteria) this;
        }

        public Criteria andInactiveSinceIsNotNull() {
            addCriterion("inactive_since is not null");
            return (Criteria) this;
        }

        public Criteria andInactiveSinceEqualTo(Date value) {
            addCriterion("inactive_since =", value, "inactiveSince");
            return (Criteria) this;
        }

        public Criteria andInactiveSinceNotEqualTo(Date value) {
            addCriterion("inactive_since <>", value, "inactiveSince");
            return (Criteria) this;
        }

        public Criteria andInactiveSinceGreaterThan(Date value) {
            addCriterion("inactive_since >", value, "inactiveSince");
            return (Criteria) this;
        }

        public Criteria andInactiveSinceGreaterThanOrEqualTo(Date value) {
            addCriterion("inactive_since >=", value, "inactiveSince");
            return (Criteria) this;
        }

        public Criteria andInactiveSinceLessThan(Date value) {
            addCriterion("inactive_since <", value, "inactiveSince");
            return (Criteria) this;
        }

        public Criteria andInactiveSinceLessThanOrEqualTo(Date value) {
            addCriterion("inactive_since <=", value, "inactiveSince");
            return (Criteria) this;
        }

        public Criteria andInactiveSinceIn(List<Date> values) {
            addCriterion("inactive_since in", values, "inactiveSince");
            return (Criteria) this;
        }

        public Criteria andInactiveSinceNotIn(List<Date> values) {
            addCriterion("inactive_since not in", values, "inactiveSince");
            return (Criteria) this;
        }

        public Criteria andInactiveSinceBetween(Date value1, Date value2) {
            addCriterion("inactive_since between", value1, value2, "inactiveSince");
            return (Criteria) this;
        }

        public Criteria andInactiveSinceNotBetween(Date value1, Date value2) {
            addCriterion("inactive_since not between", value1, value2, "inactiveSince");
            return (Criteria) this;
        }

        public Criteria andConflictingIsNull() {
            addCriterion("conflicting is null");
            return (Criteria) this;
        }

        public Criteria andConflictingIsNotNull() {
            addCriterion("conflicting is not null");
            return (Criteria) this;
        }

        public Criteria andConflictingEqualTo(Boolean value) {
            addCriterion("conflicting =", value, "conflicting");
            return (Criteria) this;
        }

        public Criteria andConflictingNotEqualTo(Boolean value) {
            addCriterion("conflicting <>", value, "conflicting");
            return (Criteria) this;
        }

        public Criteria andConflictingGreaterThan(Boolean value) {
            addCriterion("conflicting >", value, "conflicting");
            return (Criteria) this;
        }

        public Criteria andConflictingGreaterThanOrEqualTo(Boolean value) {
            addCriterion("conflicting >=", value, "conflicting");
            return (Criteria) this;
        }

        public Criteria andConflictingLessThan(Boolean value) {
            addCriterion("conflicting <", value, "conflicting");
            return (Criteria) this;
        }

        public Criteria andConflictingLessThanOrEqualTo(Boolean value) {
            addCriterion("conflicting <=", value, "conflicting");
            return (Criteria) this;
        }

        public Criteria andConflictingIn(List<Boolean> values) {
            addCriterion("conflicting in", values, "conflicting");
            return (Criteria) this;
        }

        public Criteria andConflictingNotIn(List<Boolean> values) {
            addCriterion("conflicting not in", values, "conflicting");
            return (Criteria) this;
        }

        public Criteria andConflictingBetween(Boolean value1, Boolean value2) {
            addCriterion("conflicting between", value1, value2, "conflicting");
            return (Criteria) this;
        }

        public Criteria andConflictingNotBetween(Boolean value1, Boolean value2) {
            addCriterion("conflicting not between", value1, value2, "conflicting");
            return (Criteria) this;
        }

        public Criteria andInvalidationReasonIsNull() {
            addCriterion("invalidation_reason is null");
            return (Criteria) this;
        }

        public Criteria andInvalidationReasonIsNotNull() {
            addCriterion("invalidation_reason is not null");
            return (Criteria) this;
        }

        public Criteria andInvalidationReasonEqualTo(String value) {
            addCriterion("invalidation_reason =", value, "invalidationReason");
            return (Criteria) this;
        }

        public Criteria andInvalidationReasonNotEqualTo(String value) {
            addCriterion("invalidation_reason <>", value, "invalidationReason");
            return (Criteria) this;
        }

        public Criteria andInvalidationReasonGreaterThan(String value) {
            addCriterion("invalidation_reason >", value, "invalidationReason");
            return (Criteria) this;
        }

        public Criteria andInvalidationReasonGreaterThanOrEqualTo(String value) {
            addCriterion("invalidation_reason >=", value, "invalidationReason");
            return (Criteria) this;
        }

        public Criteria andInvalidationReasonLessThan(String value) {
            addCriterion("invalidation_reason <", value, "invalidationReason");
            return (Criteria) this;
        }

        public Criteria andInvalidationReasonLessThanOrEqualTo(String value) {
            addCriterion("invalidation_reason <=", value, "invalidationReason");
            return (Criteria) this;
        }

        public Criteria andInvalidationReasonLike(String value) {
            addCriterion("invalidation_reason like", value, "invalidationReason");
            return (Criteria) this;
        }

        public Criteria andInvalidationReasonNotLike(String value) {
            addCriterion("invalidation_reason not like", value, "invalidationReason");
            return (Criteria) this;
        }

        public Criteria andInvalidationReasonIn(List<String> values) {
            addCriterion("invalidation_reason in", values, "invalidationReason");
            return (Criteria) this;
        }

        public Criteria andInvalidationReasonNotIn(List<String> values) {
            addCriterion("invalidation_reason not in", values, "invalidationReason");
            return (Criteria) this;
        }

        public Criteria andInvalidationReasonBetween(String value1, String value2) {
            addCriterion("invalidation_reason between", value1, value2, "invalidationReason");
            return (Criteria) this;
        }

        public Criteria andInvalidationReasonNotBetween(String value1, String value2) {
            addCriterion("invalidation_reason not between", value1, value2, "invalidationReason");
            return (Criteria) this;
        }

        public Criteria andFailoverIsNull() {
            addCriterion("failover is null");
            return (Criteria) this;
        }

        public Criteria andFailoverIsNotNull() {
            addCriterion("failover is not null");
            return (Criteria) this;
        }

        public Criteria andFailoverEqualTo(Boolean value) {
            addCriterion("failover =", value, "failover");
            return (Criteria) this;
        }

        public Criteria andFailoverNotEqualTo(Boolean value) {
            addCriterion("failover <>", value, "failover");
            return (Criteria) this;
        }

        public Criteria andFailoverGreaterThan(Boolean value) {
            addCriterion("failover >", value, "failover");
            return (Criteria) this;
        }

        public Criteria andFailoverGreaterThanOrEqualTo(Boolean value) {
            addCriterion("failover >=", value, "failover");
            return (Criteria) this;
        }

        public Criteria andFailoverLessThan(Boolean value) {
            addCriterion("failover <", value, "failover");
            return (Criteria) this;
        }

        public Criteria andFailoverLessThanOrEqualTo(Boolean value) {
            addCriterion("failover <=", value, "failover");
            return (Criteria) this;
        }

        public Criteria andFailoverIn(List<Boolean> values) {
            addCriterion("failover in", values, "failover");
            return (Criteria) this;
        }

        public Criteria andFailoverNotIn(List<Boolean> values) {
            addCriterion("failover not in", values, "failover");
            return (Criteria) this;
        }

        public Criteria andFailoverBetween(Boolean value1, Boolean value2) {
            addCriterion("failover between", value1, value2, "failover");
            return (Criteria) this;
        }

        public Criteria andFailoverNotBetween(Boolean value1, Boolean value2) {
            addCriterion("failover not between", value1, value2, "failover");
            return (Criteria) this;
        }

        public Criteria andSyncedIsNull() {
            addCriterion("synced is null");
            return (Criteria) this;
        }

        public Criteria andSyncedIsNotNull() {
            addCriterion("synced is not null");
            return (Criteria) this;
        }

        public Criteria andSyncedEqualTo(Boolean value) {
            addCriterion("synced =", value, "synced");
            return (Criteria) this;
        }

        public Criteria andSyncedNotEqualTo(Boolean value) {
            addCriterion("synced <>", value, "synced");
            return (Criteria) this;
        }

        public Criteria andSyncedGreaterThan(Boolean value) {
            addCriterion("synced >", value, "synced");
            return (Criteria) this;
        }

        public Criteria andSyncedGreaterThanOrEqualTo(Boolean value) {
            addCriterion("synced >=", value, "synced");
            return (Criteria) this;
        }

        public Criteria andSyncedLessThan(Boolean value) {
            addCriterion("synced <", value, "synced");
            return (Criteria) this;
        }

        public Criteria andSyncedLessThanOrEqualTo(Boolean value) {
            addCriterion("synced <=", value, "synced");
            return (Criteria) this;
        }

        public Criteria andSyncedIn(List<Boolean> values) {
            addCriterion("synced in", values, "synced");
            return (Criteria) this;
        }

        public Criteria andSyncedNotIn(List<Boolean> values) {
            addCriterion("synced not in", values, "synced");
            return (Criteria) this;
        }

        public Criteria andSyncedBetween(Boolean value1, Boolean value2) {
            addCriterion("synced between", value1, value2, "synced");
            return (Criteria) this;
        }

        public Criteria andSyncedNotBetween(Boolean value1, Boolean value2) {
            addCriterion("synced not between", value1, value2, "synced");
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