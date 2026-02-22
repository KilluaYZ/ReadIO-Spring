package com.pool.readio.mbg.model;

import java.util.ArrayList;
import java.util.List;

public class SqlImplementationInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SqlImplementationInfoExample() {
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

        public Criteria andImplementationInfoIdIsNull() {
            addCriterion("implementation_info_id is null");
            return (Criteria) this;
        }

        public Criteria andImplementationInfoIdIsNotNull() {
            addCriterion("implementation_info_id is not null");
            return (Criteria) this;
        }

        public Criteria andImplementationInfoIdEqualTo(Object value) {
            addCriterion("implementation_info_id =", value, "implementationInfoId");
            return (Criteria) this;
        }

        public Criteria andImplementationInfoIdNotEqualTo(Object value) {
            addCriterion("implementation_info_id <>", value, "implementationInfoId");
            return (Criteria) this;
        }

        public Criteria andImplementationInfoIdGreaterThan(Object value) {
            addCriterion("implementation_info_id >", value, "implementationInfoId");
            return (Criteria) this;
        }

        public Criteria andImplementationInfoIdGreaterThanOrEqualTo(Object value) {
            addCriterion("implementation_info_id >=", value, "implementationInfoId");
            return (Criteria) this;
        }

        public Criteria andImplementationInfoIdLessThan(Object value) {
            addCriterion("implementation_info_id <", value, "implementationInfoId");
            return (Criteria) this;
        }

        public Criteria andImplementationInfoIdLessThanOrEqualTo(Object value) {
            addCriterion("implementation_info_id <=", value, "implementationInfoId");
            return (Criteria) this;
        }

        public Criteria andImplementationInfoIdIn(List<Object> values) {
            addCriterion("implementation_info_id in", values, "implementationInfoId");
            return (Criteria) this;
        }

        public Criteria andImplementationInfoIdNotIn(List<Object> values) {
            addCriterion("implementation_info_id not in", values, "implementationInfoId");
            return (Criteria) this;
        }

        public Criteria andImplementationInfoIdBetween(Object value1, Object value2) {
            addCriterion("implementation_info_id between", value1, value2, "implementationInfoId");
            return (Criteria) this;
        }

        public Criteria andImplementationInfoIdNotBetween(Object value1, Object value2) {
            addCriterion("implementation_info_id not between", value1, value2, "implementationInfoId");
            return (Criteria) this;
        }

        public Criteria andImplementationInfoNameIsNull() {
            addCriterion("implementation_info_name is null");
            return (Criteria) this;
        }

        public Criteria andImplementationInfoNameIsNotNull() {
            addCriterion("implementation_info_name is not null");
            return (Criteria) this;
        }

        public Criteria andImplementationInfoNameEqualTo(Object value) {
            addCriterion("implementation_info_name =", value, "implementationInfoName");
            return (Criteria) this;
        }

        public Criteria andImplementationInfoNameNotEqualTo(Object value) {
            addCriterion("implementation_info_name <>", value, "implementationInfoName");
            return (Criteria) this;
        }

        public Criteria andImplementationInfoNameGreaterThan(Object value) {
            addCriterion("implementation_info_name >", value, "implementationInfoName");
            return (Criteria) this;
        }

        public Criteria andImplementationInfoNameGreaterThanOrEqualTo(Object value) {
            addCriterion("implementation_info_name >=", value, "implementationInfoName");
            return (Criteria) this;
        }

        public Criteria andImplementationInfoNameLessThan(Object value) {
            addCriterion("implementation_info_name <", value, "implementationInfoName");
            return (Criteria) this;
        }

        public Criteria andImplementationInfoNameLessThanOrEqualTo(Object value) {
            addCriterion("implementation_info_name <=", value, "implementationInfoName");
            return (Criteria) this;
        }

        public Criteria andImplementationInfoNameIn(List<Object> values) {
            addCriterion("implementation_info_name in", values, "implementationInfoName");
            return (Criteria) this;
        }

        public Criteria andImplementationInfoNameNotIn(List<Object> values) {
            addCriterion("implementation_info_name not in", values, "implementationInfoName");
            return (Criteria) this;
        }

        public Criteria andImplementationInfoNameBetween(Object value1, Object value2) {
            addCriterion("implementation_info_name between", value1, value2, "implementationInfoName");
            return (Criteria) this;
        }

        public Criteria andImplementationInfoNameNotBetween(Object value1, Object value2) {
            addCriterion("implementation_info_name not between", value1, value2, "implementationInfoName");
            return (Criteria) this;
        }

        public Criteria andIntegerValueIsNull() {
            addCriterion("integer_value is null");
            return (Criteria) this;
        }

        public Criteria andIntegerValueIsNotNull() {
            addCriterion("integer_value is not null");
            return (Criteria) this;
        }

        public Criteria andIntegerValueEqualTo(Object value) {
            addCriterion("integer_value =", value, "integerValue");
            return (Criteria) this;
        }

        public Criteria andIntegerValueNotEqualTo(Object value) {
            addCriterion("integer_value <>", value, "integerValue");
            return (Criteria) this;
        }

        public Criteria andIntegerValueGreaterThan(Object value) {
            addCriterion("integer_value >", value, "integerValue");
            return (Criteria) this;
        }

        public Criteria andIntegerValueGreaterThanOrEqualTo(Object value) {
            addCriterion("integer_value >=", value, "integerValue");
            return (Criteria) this;
        }

        public Criteria andIntegerValueLessThan(Object value) {
            addCriterion("integer_value <", value, "integerValue");
            return (Criteria) this;
        }

        public Criteria andIntegerValueLessThanOrEqualTo(Object value) {
            addCriterion("integer_value <=", value, "integerValue");
            return (Criteria) this;
        }

        public Criteria andIntegerValueIn(List<Object> values) {
            addCriterion("integer_value in", values, "integerValue");
            return (Criteria) this;
        }

        public Criteria andIntegerValueNotIn(List<Object> values) {
            addCriterion("integer_value not in", values, "integerValue");
            return (Criteria) this;
        }

        public Criteria andIntegerValueBetween(Object value1, Object value2) {
            addCriterion("integer_value between", value1, value2, "integerValue");
            return (Criteria) this;
        }

        public Criteria andIntegerValueNotBetween(Object value1, Object value2) {
            addCriterion("integer_value not between", value1, value2, "integerValue");
            return (Criteria) this;
        }

        public Criteria andCharacterValueIsNull() {
            addCriterion("character_value is null");
            return (Criteria) this;
        }

        public Criteria andCharacterValueIsNotNull() {
            addCriterion("character_value is not null");
            return (Criteria) this;
        }

        public Criteria andCharacterValueEqualTo(Object value) {
            addCriterion("character_value =", value, "characterValue");
            return (Criteria) this;
        }

        public Criteria andCharacterValueNotEqualTo(Object value) {
            addCriterion("character_value <>", value, "characterValue");
            return (Criteria) this;
        }

        public Criteria andCharacterValueGreaterThan(Object value) {
            addCriterion("character_value >", value, "characterValue");
            return (Criteria) this;
        }

        public Criteria andCharacterValueGreaterThanOrEqualTo(Object value) {
            addCriterion("character_value >=", value, "characterValue");
            return (Criteria) this;
        }

        public Criteria andCharacterValueLessThan(Object value) {
            addCriterion("character_value <", value, "characterValue");
            return (Criteria) this;
        }

        public Criteria andCharacterValueLessThanOrEqualTo(Object value) {
            addCriterion("character_value <=", value, "characterValue");
            return (Criteria) this;
        }

        public Criteria andCharacterValueIn(List<Object> values) {
            addCriterion("character_value in", values, "characterValue");
            return (Criteria) this;
        }

        public Criteria andCharacterValueNotIn(List<Object> values) {
            addCriterion("character_value not in", values, "characterValue");
            return (Criteria) this;
        }

        public Criteria andCharacterValueBetween(Object value1, Object value2) {
            addCriterion("character_value between", value1, value2, "characterValue");
            return (Criteria) this;
        }

        public Criteria andCharacterValueNotBetween(Object value1, Object value2) {
            addCriterion("character_value not between", value1, value2, "characterValue");
            return (Criteria) this;
        }

        public Criteria andCommentsIsNull() {
            addCriterion("comments is null");
            return (Criteria) this;
        }

        public Criteria andCommentsIsNotNull() {
            addCriterion("comments is not null");
            return (Criteria) this;
        }

        public Criteria andCommentsEqualTo(Object value) {
            addCriterion("comments =", value, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsNotEqualTo(Object value) {
            addCriterion("comments <>", value, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsGreaterThan(Object value) {
            addCriterion("comments >", value, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsGreaterThanOrEqualTo(Object value) {
            addCriterion("comments >=", value, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsLessThan(Object value) {
            addCriterion("comments <", value, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsLessThanOrEqualTo(Object value) {
            addCriterion("comments <=", value, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsIn(List<Object> values) {
            addCriterion("comments in", values, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsNotIn(List<Object> values) {
            addCriterion("comments not in", values, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsBetween(Object value1, Object value2) {
            addCriterion("comments between", value1, value2, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsNotBetween(Object value1, Object value2) {
            addCriterion("comments not between", value1, value2, "comments");
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