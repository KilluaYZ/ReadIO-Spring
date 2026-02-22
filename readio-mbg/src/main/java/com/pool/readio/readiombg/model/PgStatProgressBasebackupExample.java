package com.pool.readio.readiombg.model;

import java.util.ArrayList;
import java.util.List;

public class PgStatProgressBasebackupExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PgStatProgressBasebackupExample() {
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

        public Criteria andBackupTotalIsNull() {
            addCriterion("backup_total is null");
            return (Criteria) this;
        }

        public Criteria andBackupTotalIsNotNull() {
            addCriterion("backup_total is not null");
            return (Criteria) this;
        }

        public Criteria andBackupTotalEqualTo(Long value) {
            addCriterion("backup_total =", value, "backupTotal");
            return (Criteria) this;
        }

        public Criteria andBackupTotalNotEqualTo(Long value) {
            addCriterion("backup_total <>", value, "backupTotal");
            return (Criteria) this;
        }

        public Criteria andBackupTotalGreaterThan(Long value) {
            addCriterion("backup_total >", value, "backupTotal");
            return (Criteria) this;
        }

        public Criteria andBackupTotalGreaterThanOrEqualTo(Long value) {
            addCriterion("backup_total >=", value, "backupTotal");
            return (Criteria) this;
        }

        public Criteria andBackupTotalLessThan(Long value) {
            addCriterion("backup_total <", value, "backupTotal");
            return (Criteria) this;
        }

        public Criteria andBackupTotalLessThanOrEqualTo(Long value) {
            addCriterion("backup_total <=", value, "backupTotal");
            return (Criteria) this;
        }

        public Criteria andBackupTotalIn(List<Long> values) {
            addCriterion("backup_total in", values, "backupTotal");
            return (Criteria) this;
        }

        public Criteria andBackupTotalNotIn(List<Long> values) {
            addCriterion("backup_total not in", values, "backupTotal");
            return (Criteria) this;
        }

        public Criteria andBackupTotalBetween(Long value1, Long value2) {
            addCriterion("backup_total between", value1, value2, "backupTotal");
            return (Criteria) this;
        }

        public Criteria andBackupTotalNotBetween(Long value1, Long value2) {
            addCriterion("backup_total not between", value1, value2, "backupTotal");
            return (Criteria) this;
        }

        public Criteria andBackupStreamedIsNull() {
            addCriterion("backup_streamed is null");
            return (Criteria) this;
        }

        public Criteria andBackupStreamedIsNotNull() {
            addCriterion("backup_streamed is not null");
            return (Criteria) this;
        }

        public Criteria andBackupStreamedEqualTo(Long value) {
            addCriterion("backup_streamed =", value, "backupStreamed");
            return (Criteria) this;
        }

        public Criteria andBackupStreamedNotEqualTo(Long value) {
            addCriterion("backup_streamed <>", value, "backupStreamed");
            return (Criteria) this;
        }

        public Criteria andBackupStreamedGreaterThan(Long value) {
            addCriterion("backup_streamed >", value, "backupStreamed");
            return (Criteria) this;
        }

        public Criteria andBackupStreamedGreaterThanOrEqualTo(Long value) {
            addCriterion("backup_streamed >=", value, "backupStreamed");
            return (Criteria) this;
        }

        public Criteria andBackupStreamedLessThan(Long value) {
            addCriterion("backup_streamed <", value, "backupStreamed");
            return (Criteria) this;
        }

        public Criteria andBackupStreamedLessThanOrEqualTo(Long value) {
            addCriterion("backup_streamed <=", value, "backupStreamed");
            return (Criteria) this;
        }

        public Criteria andBackupStreamedIn(List<Long> values) {
            addCriterion("backup_streamed in", values, "backupStreamed");
            return (Criteria) this;
        }

        public Criteria andBackupStreamedNotIn(List<Long> values) {
            addCriterion("backup_streamed not in", values, "backupStreamed");
            return (Criteria) this;
        }

        public Criteria andBackupStreamedBetween(Long value1, Long value2) {
            addCriterion("backup_streamed between", value1, value2, "backupStreamed");
            return (Criteria) this;
        }

        public Criteria andBackupStreamedNotBetween(Long value1, Long value2) {
            addCriterion("backup_streamed not between", value1, value2, "backupStreamed");
            return (Criteria) this;
        }

        public Criteria andTablespacesTotalIsNull() {
            addCriterion("tablespaces_total is null");
            return (Criteria) this;
        }

        public Criteria andTablespacesTotalIsNotNull() {
            addCriterion("tablespaces_total is not null");
            return (Criteria) this;
        }

        public Criteria andTablespacesTotalEqualTo(Long value) {
            addCriterion("tablespaces_total =", value, "tablespacesTotal");
            return (Criteria) this;
        }

        public Criteria andTablespacesTotalNotEqualTo(Long value) {
            addCriterion("tablespaces_total <>", value, "tablespacesTotal");
            return (Criteria) this;
        }

        public Criteria andTablespacesTotalGreaterThan(Long value) {
            addCriterion("tablespaces_total >", value, "tablespacesTotal");
            return (Criteria) this;
        }

        public Criteria andTablespacesTotalGreaterThanOrEqualTo(Long value) {
            addCriterion("tablespaces_total >=", value, "tablespacesTotal");
            return (Criteria) this;
        }

        public Criteria andTablespacesTotalLessThan(Long value) {
            addCriterion("tablespaces_total <", value, "tablespacesTotal");
            return (Criteria) this;
        }

        public Criteria andTablespacesTotalLessThanOrEqualTo(Long value) {
            addCriterion("tablespaces_total <=", value, "tablespacesTotal");
            return (Criteria) this;
        }

        public Criteria andTablespacesTotalIn(List<Long> values) {
            addCriterion("tablespaces_total in", values, "tablespacesTotal");
            return (Criteria) this;
        }

        public Criteria andTablespacesTotalNotIn(List<Long> values) {
            addCriterion("tablespaces_total not in", values, "tablespacesTotal");
            return (Criteria) this;
        }

        public Criteria andTablespacesTotalBetween(Long value1, Long value2) {
            addCriterion("tablespaces_total between", value1, value2, "tablespacesTotal");
            return (Criteria) this;
        }

        public Criteria andTablespacesTotalNotBetween(Long value1, Long value2) {
            addCriterion("tablespaces_total not between", value1, value2, "tablespacesTotal");
            return (Criteria) this;
        }

        public Criteria andTablespacesStreamedIsNull() {
            addCriterion("tablespaces_streamed is null");
            return (Criteria) this;
        }

        public Criteria andTablespacesStreamedIsNotNull() {
            addCriterion("tablespaces_streamed is not null");
            return (Criteria) this;
        }

        public Criteria andTablespacesStreamedEqualTo(Long value) {
            addCriterion("tablespaces_streamed =", value, "tablespacesStreamed");
            return (Criteria) this;
        }

        public Criteria andTablespacesStreamedNotEqualTo(Long value) {
            addCriterion("tablespaces_streamed <>", value, "tablespacesStreamed");
            return (Criteria) this;
        }

        public Criteria andTablespacesStreamedGreaterThan(Long value) {
            addCriterion("tablespaces_streamed >", value, "tablespacesStreamed");
            return (Criteria) this;
        }

        public Criteria andTablespacesStreamedGreaterThanOrEqualTo(Long value) {
            addCriterion("tablespaces_streamed >=", value, "tablespacesStreamed");
            return (Criteria) this;
        }

        public Criteria andTablespacesStreamedLessThan(Long value) {
            addCriterion("tablespaces_streamed <", value, "tablespacesStreamed");
            return (Criteria) this;
        }

        public Criteria andTablespacesStreamedLessThanOrEqualTo(Long value) {
            addCriterion("tablespaces_streamed <=", value, "tablespacesStreamed");
            return (Criteria) this;
        }

        public Criteria andTablespacesStreamedIn(List<Long> values) {
            addCriterion("tablespaces_streamed in", values, "tablespacesStreamed");
            return (Criteria) this;
        }

        public Criteria andTablespacesStreamedNotIn(List<Long> values) {
            addCriterion("tablespaces_streamed not in", values, "tablespacesStreamed");
            return (Criteria) this;
        }

        public Criteria andTablespacesStreamedBetween(Long value1, Long value2) {
            addCriterion("tablespaces_streamed between", value1, value2, "tablespacesStreamed");
            return (Criteria) this;
        }

        public Criteria andTablespacesStreamedNotBetween(Long value1, Long value2) {
            addCriterion("tablespaces_streamed not between", value1, value2, "tablespacesStreamed");
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