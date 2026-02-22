package com.pool.readio.mbg.model;

import java.util.ArrayList;
import java.util.List;

public class PgFileSettingsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PgFileSettingsExample() {
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

        public Criteria andSourcefileIsNull() {
            addCriterion("sourcefile is null");
            return (Criteria) this;
        }

        public Criteria andSourcefileIsNotNull() {
            addCriterion("sourcefile is not null");
            return (Criteria) this;
        }

        public Criteria andSourcefileEqualTo(String value) {
            addCriterion("sourcefile =", value, "sourcefile");
            return (Criteria) this;
        }

        public Criteria andSourcefileNotEqualTo(String value) {
            addCriterion("sourcefile <>", value, "sourcefile");
            return (Criteria) this;
        }

        public Criteria andSourcefileGreaterThan(String value) {
            addCriterion("sourcefile >", value, "sourcefile");
            return (Criteria) this;
        }

        public Criteria andSourcefileGreaterThanOrEqualTo(String value) {
            addCriterion("sourcefile >=", value, "sourcefile");
            return (Criteria) this;
        }

        public Criteria andSourcefileLessThan(String value) {
            addCriterion("sourcefile <", value, "sourcefile");
            return (Criteria) this;
        }

        public Criteria andSourcefileLessThanOrEqualTo(String value) {
            addCriterion("sourcefile <=", value, "sourcefile");
            return (Criteria) this;
        }

        public Criteria andSourcefileLike(String value) {
            addCriterion("sourcefile like", value, "sourcefile");
            return (Criteria) this;
        }

        public Criteria andSourcefileNotLike(String value) {
            addCriterion("sourcefile not like", value, "sourcefile");
            return (Criteria) this;
        }

        public Criteria andSourcefileIn(List<String> values) {
            addCriterion("sourcefile in", values, "sourcefile");
            return (Criteria) this;
        }

        public Criteria andSourcefileNotIn(List<String> values) {
            addCriterion("sourcefile not in", values, "sourcefile");
            return (Criteria) this;
        }

        public Criteria andSourcefileBetween(String value1, String value2) {
            addCriterion("sourcefile between", value1, value2, "sourcefile");
            return (Criteria) this;
        }

        public Criteria andSourcefileNotBetween(String value1, String value2) {
            addCriterion("sourcefile not between", value1, value2, "sourcefile");
            return (Criteria) this;
        }

        public Criteria andSourcelineIsNull() {
            addCriterion("sourceline is null");
            return (Criteria) this;
        }

        public Criteria andSourcelineIsNotNull() {
            addCriterion("sourceline is not null");
            return (Criteria) this;
        }

        public Criteria andSourcelineEqualTo(Integer value) {
            addCriterion("sourceline =", value, "sourceline");
            return (Criteria) this;
        }

        public Criteria andSourcelineNotEqualTo(Integer value) {
            addCriterion("sourceline <>", value, "sourceline");
            return (Criteria) this;
        }

        public Criteria andSourcelineGreaterThan(Integer value) {
            addCriterion("sourceline >", value, "sourceline");
            return (Criteria) this;
        }

        public Criteria andSourcelineGreaterThanOrEqualTo(Integer value) {
            addCriterion("sourceline >=", value, "sourceline");
            return (Criteria) this;
        }

        public Criteria andSourcelineLessThan(Integer value) {
            addCriterion("sourceline <", value, "sourceline");
            return (Criteria) this;
        }

        public Criteria andSourcelineLessThanOrEqualTo(Integer value) {
            addCriterion("sourceline <=", value, "sourceline");
            return (Criteria) this;
        }

        public Criteria andSourcelineIn(List<Integer> values) {
            addCriterion("sourceline in", values, "sourceline");
            return (Criteria) this;
        }

        public Criteria andSourcelineNotIn(List<Integer> values) {
            addCriterion("sourceline not in", values, "sourceline");
            return (Criteria) this;
        }

        public Criteria andSourcelineBetween(Integer value1, Integer value2) {
            addCriterion("sourceline between", value1, value2, "sourceline");
            return (Criteria) this;
        }

        public Criteria andSourcelineNotBetween(Integer value1, Integer value2) {
            addCriterion("sourceline not between", value1, value2, "sourceline");
            return (Criteria) this;
        }

        public Criteria andSeqnoIsNull() {
            addCriterion("seqno is null");
            return (Criteria) this;
        }

        public Criteria andSeqnoIsNotNull() {
            addCriterion("seqno is not null");
            return (Criteria) this;
        }

        public Criteria andSeqnoEqualTo(Integer value) {
            addCriterion("seqno =", value, "seqno");
            return (Criteria) this;
        }

        public Criteria andSeqnoNotEqualTo(Integer value) {
            addCriterion("seqno <>", value, "seqno");
            return (Criteria) this;
        }

        public Criteria andSeqnoGreaterThan(Integer value) {
            addCriterion("seqno >", value, "seqno");
            return (Criteria) this;
        }

        public Criteria andSeqnoGreaterThanOrEqualTo(Integer value) {
            addCriterion("seqno >=", value, "seqno");
            return (Criteria) this;
        }

        public Criteria andSeqnoLessThan(Integer value) {
            addCriterion("seqno <", value, "seqno");
            return (Criteria) this;
        }

        public Criteria andSeqnoLessThanOrEqualTo(Integer value) {
            addCriterion("seqno <=", value, "seqno");
            return (Criteria) this;
        }

        public Criteria andSeqnoIn(List<Integer> values) {
            addCriterion("seqno in", values, "seqno");
            return (Criteria) this;
        }

        public Criteria andSeqnoNotIn(List<Integer> values) {
            addCriterion("seqno not in", values, "seqno");
            return (Criteria) this;
        }

        public Criteria andSeqnoBetween(Integer value1, Integer value2) {
            addCriterion("seqno between", value1, value2, "seqno");
            return (Criteria) this;
        }

        public Criteria andSeqnoNotBetween(Integer value1, Integer value2) {
            addCriterion("seqno not between", value1, value2, "seqno");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andSettingIsNull() {
            addCriterion("setting is null");
            return (Criteria) this;
        }

        public Criteria andSettingIsNotNull() {
            addCriterion("setting is not null");
            return (Criteria) this;
        }

        public Criteria andSettingEqualTo(String value) {
            addCriterion("setting =", value, "setting");
            return (Criteria) this;
        }

        public Criteria andSettingNotEqualTo(String value) {
            addCriterion("setting <>", value, "setting");
            return (Criteria) this;
        }

        public Criteria andSettingGreaterThan(String value) {
            addCriterion("setting >", value, "setting");
            return (Criteria) this;
        }

        public Criteria andSettingGreaterThanOrEqualTo(String value) {
            addCriterion("setting >=", value, "setting");
            return (Criteria) this;
        }

        public Criteria andSettingLessThan(String value) {
            addCriterion("setting <", value, "setting");
            return (Criteria) this;
        }

        public Criteria andSettingLessThanOrEqualTo(String value) {
            addCriterion("setting <=", value, "setting");
            return (Criteria) this;
        }

        public Criteria andSettingLike(String value) {
            addCriterion("setting like", value, "setting");
            return (Criteria) this;
        }

        public Criteria andSettingNotLike(String value) {
            addCriterion("setting not like", value, "setting");
            return (Criteria) this;
        }

        public Criteria andSettingIn(List<String> values) {
            addCriterion("setting in", values, "setting");
            return (Criteria) this;
        }

        public Criteria andSettingNotIn(List<String> values) {
            addCriterion("setting not in", values, "setting");
            return (Criteria) this;
        }

        public Criteria andSettingBetween(String value1, String value2) {
            addCriterion("setting between", value1, value2, "setting");
            return (Criteria) this;
        }

        public Criteria andSettingNotBetween(String value1, String value2) {
            addCriterion("setting not between", value1, value2, "setting");
            return (Criteria) this;
        }

        public Criteria andAppliedIsNull() {
            addCriterion("applied is null");
            return (Criteria) this;
        }

        public Criteria andAppliedIsNotNull() {
            addCriterion("applied is not null");
            return (Criteria) this;
        }

        public Criteria andAppliedEqualTo(Boolean value) {
            addCriterion("applied =", value, "applied");
            return (Criteria) this;
        }

        public Criteria andAppliedNotEqualTo(Boolean value) {
            addCriterion("applied <>", value, "applied");
            return (Criteria) this;
        }

        public Criteria andAppliedGreaterThan(Boolean value) {
            addCriterion("applied >", value, "applied");
            return (Criteria) this;
        }

        public Criteria andAppliedGreaterThanOrEqualTo(Boolean value) {
            addCriterion("applied >=", value, "applied");
            return (Criteria) this;
        }

        public Criteria andAppliedLessThan(Boolean value) {
            addCriterion("applied <", value, "applied");
            return (Criteria) this;
        }

        public Criteria andAppliedLessThanOrEqualTo(Boolean value) {
            addCriterion("applied <=", value, "applied");
            return (Criteria) this;
        }

        public Criteria andAppliedIn(List<Boolean> values) {
            addCriterion("applied in", values, "applied");
            return (Criteria) this;
        }

        public Criteria andAppliedNotIn(List<Boolean> values) {
            addCriterion("applied not in", values, "applied");
            return (Criteria) this;
        }

        public Criteria andAppliedBetween(Boolean value1, Boolean value2) {
            addCriterion("applied between", value1, value2, "applied");
            return (Criteria) this;
        }

        public Criteria andAppliedNotBetween(Boolean value1, Boolean value2) {
            addCriterion("applied not between", value1, value2, "applied");
            return (Criteria) this;
        }

        public Criteria andErrorIsNull() {
            addCriterion("error is null");
            return (Criteria) this;
        }

        public Criteria andErrorIsNotNull() {
            addCriterion("error is not null");
            return (Criteria) this;
        }

        public Criteria andErrorEqualTo(String value) {
            addCriterion("error =", value, "error");
            return (Criteria) this;
        }

        public Criteria andErrorNotEqualTo(String value) {
            addCriterion("error <>", value, "error");
            return (Criteria) this;
        }

        public Criteria andErrorGreaterThan(String value) {
            addCriterion("error >", value, "error");
            return (Criteria) this;
        }

        public Criteria andErrorGreaterThanOrEqualTo(String value) {
            addCriterion("error >=", value, "error");
            return (Criteria) this;
        }

        public Criteria andErrorLessThan(String value) {
            addCriterion("error <", value, "error");
            return (Criteria) this;
        }

        public Criteria andErrorLessThanOrEqualTo(String value) {
            addCriterion("error <=", value, "error");
            return (Criteria) this;
        }

        public Criteria andErrorLike(String value) {
            addCriterion("error like", value, "error");
            return (Criteria) this;
        }

        public Criteria andErrorNotLike(String value) {
            addCriterion("error not like", value, "error");
            return (Criteria) this;
        }

        public Criteria andErrorIn(List<String> values) {
            addCriterion("error in", values, "error");
            return (Criteria) this;
        }

        public Criteria andErrorNotIn(List<String> values) {
            addCriterion("error not in", values, "error");
            return (Criteria) this;
        }

        public Criteria andErrorBetween(String value1, String value2) {
            addCriterion("error between", value1, value2, "error");
            return (Criteria) this;
        }

        public Criteria andErrorNotBetween(String value1, String value2) {
            addCriterion("error not between", value1, value2, "error");
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