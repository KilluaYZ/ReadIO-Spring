package com.pool.readio.readiombg.model;

import java.util.ArrayList;
import java.util.List;

public class PgTimezoneNamesExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PgTimezoneNamesExample() {
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

        public Criteria andAbbrevIsNull() {
            addCriterion("abbrev is null");
            return (Criteria) this;
        }

        public Criteria andAbbrevIsNotNull() {
            addCriterion("abbrev is not null");
            return (Criteria) this;
        }

        public Criteria andAbbrevEqualTo(String value) {
            addCriterion("abbrev =", value, "abbrev");
            return (Criteria) this;
        }

        public Criteria andAbbrevNotEqualTo(String value) {
            addCriterion("abbrev <>", value, "abbrev");
            return (Criteria) this;
        }

        public Criteria andAbbrevGreaterThan(String value) {
            addCriterion("abbrev >", value, "abbrev");
            return (Criteria) this;
        }

        public Criteria andAbbrevGreaterThanOrEqualTo(String value) {
            addCriterion("abbrev >=", value, "abbrev");
            return (Criteria) this;
        }

        public Criteria andAbbrevLessThan(String value) {
            addCriterion("abbrev <", value, "abbrev");
            return (Criteria) this;
        }

        public Criteria andAbbrevLessThanOrEqualTo(String value) {
            addCriterion("abbrev <=", value, "abbrev");
            return (Criteria) this;
        }

        public Criteria andAbbrevLike(String value) {
            addCriterion("abbrev like", value, "abbrev");
            return (Criteria) this;
        }

        public Criteria andAbbrevNotLike(String value) {
            addCriterion("abbrev not like", value, "abbrev");
            return (Criteria) this;
        }

        public Criteria andAbbrevIn(List<String> values) {
            addCriterion("abbrev in", values, "abbrev");
            return (Criteria) this;
        }

        public Criteria andAbbrevNotIn(List<String> values) {
            addCriterion("abbrev not in", values, "abbrev");
            return (Criteria) this;
        }

        public Criteria andAbbrevBetween(String value1, String value2) {
            addCriterion("abbrev between", value1, value2, "abbrev");
            return (Criteria) this;
        }

        public Criteria andAbbrevNotBetween(String value1, String value2) {
            addCriterion("abbrev not between", value1, value2, "abbrev");
            return (Criteria) this;
        }

        public Criteria andUtcOffsetIsNull() {
            addCriterion("utc_offset is null");
            return (Criteria) this;
        }

        public Criteria andUtcOffsetIsNotNull() {
            addCriterion("utc_offset is not null");
            return (Criteria) this;
        }

        public Criteria andUtcOffsetEqualTo(Object value) {
            addCriterion("utc_offset =", value, "utcOffset");
            return (Criteria) this;
        }

        public Criteria andUtcOffsetNotEqualTo(Object value) {
            addCriterion("utc_offset <>", value, "utcOffset");
            return (Criteria) this;
        }

        public Criteria andUtcOffsetGreaterThan(Object value) {
            addCriterion("utc_offset >", value, "utcOffset");
            return (Criteria) this;
        }

        public Criteria andUtcOffsetGreaterThanOrEqualTo(Object value) {
            addCriterion("utc_offset >=", value, "utcOffset");
            return (Criteria) this;
        }

        public Criteria andUtcOffsetLessThan(Object value) {
            addCriterion("utc_offset <", value, "utcOffset");
            return (Criteria) this;
        }

        public Criteria andUtcOffsetLessThanOrEqualTo(Object value) {
            addCriterion("utc_offset <=", value, "utcOffset");
            return (Criteria) this;
        }

        public Criteria andUtcOffsetIn(List<Object> values) {
            addCriterion("utc_offset in", values, "utcOffset");
            return (Criteria) this;
        }

        public Criteria andUtcOffsetNotIn(List<Object> values) {
            addCriterion("utc_offset not in", values, "utcOffset");
            return (Criteria) this;
        }

        public Criteria andUtcOffsetBetween(Object value1, Object value2) {
            addCriterion("utc_offset between", value1, value2, "utcOffset");
            return (Criteria) this;
        }

        public Criteria andUtcOffsetNotBetween(Object value1, Object value2) {
            addCriterion("utc_offset not between", value1, value2, "utcOffset");
            return (Criteria) this;
        }

        public Criteria andIsDstIsNull() {
            addCriterion("is_dst is null");
            return (Criteria) this;
        }

        public Criteria andIsDstIsNotNull() {
            addCriterion("is_dst is not null");
            return (Criteria) this;
        }

        public Criteria andIsDstEqualTo(Boolean value) {
            addCriterion("is_dst =", value, "isDst");
            return (Criteria) this;
        }

        public Criteria andIsDstNotEqualTo(Boolean value) {
            addCriterion("is_dst <>", value, "isDst");
            return (Criteria) this;
        }

        public Criteria andIsDstGreaterThan(Boolean value) {
            addCriterion("is_dst >", value, "isDst");
            return (Criteria) this;
        }

        public Criteria andIsDstGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_dst >=", value, "isDst");
            return (Criteria) this;
        }

        public Criteria andIsDstLessThan(Boolean value) {
            addCriterion("is_dst <", value, "isDst");
            return (Criteria) this;
        }

        public Criteria andIsDstLessThanOrEqualTo(Boolean value) {
            addCriterion("is_dst <=", value, "isDst");
            return (Criteria) this;
        }

        public Criteria andIsDstIn(List<Boolean> values) {
            addCriterion("is_dst in", values, "isDst");
            return (Criteria) this;
        }

        public Criteria andIsDstNotIn(List<Boolean> values) {
            addCriterion("is_dst not in", values, "isDst");
            return (Criteria) this;
        }

        public Criteria andIsDstBetween(Boolean value1, Boolean value2) {
            addCriterion("is_dst between", value1, value2, "isDst");
            return (Criteria) this;
        }

        public Criteria andIsDstNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_dst not between", value1, value2, "isDst");
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