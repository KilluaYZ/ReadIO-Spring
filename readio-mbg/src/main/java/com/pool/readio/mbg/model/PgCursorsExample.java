package com.pool.readio.mbg.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PgCursorsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PgCursorsExample() {
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

        public Criteria andStatementIsNull() {
            addCriterion("statement is null");
            return (Criteria) this;
        }

        public Criteria andStatementIsNotNull() {
            addCriterion("statement is not null");
            return (Criteria) this;
        }

        public Criteria andStatementEqualTo(String value) {
            addCriterion("statement =", value, "statement");
            return (Criteria) this;
        }

        public Criteria andStatementNotEqualTo(String value) {
            addCriterion("statement <>", value, "statement");
            return (Criteria) this;
        }

        public Criteria andStatementGreaterThan(String value) {
            addCriterion("statement >", value, "statement");
            return (Criteria) this;
        }

        public Criteria andStatementGreaterThanOrEqualTo(String value) {
            addCriterion("statement >=", value, "statement");
            return (Criteria) this;
        }

        public Criteria andStatementLessThan(String value) {
            addCriterion("statement <", value, "statement");
            return (Criteria) this;
        }

        public Criteria andStatementLessThanOrEqualTo(String value) {
            addCriterion("statement <=", value, "statement");
            return (Criteria) this;
        }

        public Criteria andStatementLike(String value) {
            addCriterion("statement like", value, "statement");
            return (Criteria) this;
        }

        public Criteria andStatementNotLike(String value) {
            addCriterion("statement not like", value, "statement");
            return (Criteria) this;
        }

        public Criteria andStatementIn(List<String> values) {
            addCriterion("statement in", values, "statement");
            return (Criteria) this;
        }

        public Criteria andStatementNotIn(List<String> values) {
            addCriterion("statement not in", values, "statement");
            return (Criteria) this;
        }

        public Criteria andStatementBetween(String value1, String value2) {
            addCriterion("statement between", value1, value2, "statement");
            return (Criteria) this;
        }

        public Criteria andStatementNotBetween(String value1, String value2) {
            addCriterion("statement not between", value1, value2, "statement");
            return (Criteria) this;
        }

        public Criteria andIsHoldableIsNull() {
            addCriterion("is_holdable is null");
            return (Criteria) this;
        }

        public Criteria andIsHoldableIsNotNull() {
            addCriterion("is_holdable is not null");
            return (Criteria) this;
        }

        public Criteria andIsHoldableEqualTo(Boolean value) {
            addCriterion("is_holdable =", value, "isHoldable");
            return (Criteria) this;
        }

        public Criteria andIsHoldableNotEqualTo(Boolean value) {
            addCriterion("is_holdable <>", value, "isHoldable");
            return (Criteria) this;
        }

        public Criteria andIsHoldableGreaterThan(Boolean value) {
            addCriterion("is_holdable >", value, "isHoldable");
            return (Criteria) this;
        }

        public Criteria andIsHoldableGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_holdable >=", value, "isHoldable");
            return (Criteria) this;
        }

        public Criteria andIsHoldableLessThan(Boolean value) {
            addCriterion("is_holdable <", value, "isHoldable");
            return (Criteria) this;
        }

        public Criteria andIsHoldableLessThanOrEqualTo(Boolean value) {
            addCriterion("is_holdable <=", value, "isHoldable");
            return (Criteria) this;
        }

        public Criteria andIsHoldableIn(List<Boolean> values) {
            addCriterion("is_holdable in", values, "isHoldable");
            return (Criteria) this;
        }

        public Criteria andIsHoldableNotIn(List<Boolean> values) {
            addCriterion("is_holdable not in", values, "isHoldable");
            return (Criteria) this;
        }

        public Criteria andIsHoldableBetween(Boolean value1, Boolean value2) {
            addCriterion("is_holdable between", value1, value2, "isHoldable");
            return (Criteria) this;
        }

        public Criteria andIsHoldableNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_holdable not between", value1, value2, "isHoldable");
            return (Criteria) this;
        }

        public Criteria andIsBinaryIsNull() {
            addCriterion("is_binary is null");
            return (Criteria) this;
        }

        public Criteria andIsBinaryIsNotNull() {
            addCriterion("is_binary is not null");
            return (Criteria) this;
        }

        public Criteria andIsBinaryEqualTo(Boolean value) {
            addCriterion("is_binary =", value, "isBinary");
            return (Criteria) this;
        }

        public Criteria andIsBinaryNotEqualTo(Boolean value) {
            addCriterion("is_binary <>", value, "isBinary");
            return (Criteria) this;
        }

        public Criteria andIsBinaryGreaterThan(Boolean value) {
            addCriterion("is_binary >", value, "isBinary");
            return (Criteria) this;
        }

        public Criteria andIsBinaryGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_binary >=", value, "isBinary");
            return (Criteria) this;
        }

        public Criteria andIsBinaryLessThan(Boolean value) {
            addCriterion("is_binary <", value, "isBinary");
            return (Criteria) this;
        }

        public Criteria andIsBinaryLessThanOrEqualTo(Boolean value) {
            addCriterion("is_binary <=", value, "isBinary");
            return (Criteria) this;
        }

        public Criteria andIsBinaryIn(List<Boolean> values) {
            addCriterion("is_binary in", values, "isBinary");
            return (Criteria) this;
        }

        public Criteria andIsBinaryNotIn(List<Boolean> values) {
            addCriterion("is_binary not in", values, "isBinary");
            return (Criteria) this;
        }

        public Criteria andIsBinaryBetween(Boolean value1, Boolean value2) {
            addCriterion("is_binary between", value1, value2, "isBinary");
            return (Criteria) this;
        }

        public Criteria andIsBinaryNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_binary not between", value1, value2, "isBinary");
            return (Criteria) this;
        }

        public Criteria andIsScrollableIsNull() {
            addCriterion("is_scrollable is null");
            return (Criteria) this;
        }

        public Criteria andIsScrollableIsNotNull() {
            addCriterion("is_scrollable is not null");
            return (Criteria) this;
        }

        public Criteria andIsScrollableEqualTo(Boolean value) {
            addCriterion("is_scrollable =", value, "isScrollable");
            return (Criteria) this;
        }

        public Criteria andIsScrollableNotEqualTo(Boolean value) {
            addCriterion("is_scrollable <>", value, "isScrollable");
            return (Criteria) this;
        }

        public Criteria andIsScrollableGreaterThan(Boolean value) {
            addCriterion("is_scrollable >", value, "isScrollable");
            return (Criteria) this;
        }

        public Criteria andIsScrollableGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_scrollable >=", value, "isScrollable");
            return (Criteria) this;
        }

        public Criteria andIsScrollableLessThan(Boolean value) {
            addCriterion("is_scrollable <", value, "isScrollable");
            return (Criteria) this;
        }

        public Criteria andIsScrollableLessThanOrEqualTo(Boolean value) {
            addCriterion("is_scrollable <=", value, "isScrollable");
            return (Criteria) this;
        }

        public Criteria andIsScrollableIn(List<Boolean> values) {
            addCriterion("is_scrollable in", values, "isScrollable");
            return (Criteria) this;
        }

        public Criteria andIsScrollableNotIn(List<Boolean> values) {
            addCriterion("is_scrollable not in", values, "isScrollable");
            return (Criteria) this;
        }

        public Criteria andIsScrollableBetween(Boolean value1, Boolean value2) {
            addCriterion("is_scrollable between", value1, value2, "isScrollable");
            return (Criteria) this;
        }

        public Criteria andIsScrollableNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_scrollable not between", value1, value2, "isScrollable");
            return (Criteria) this;
        }

        public Criteria andCreationTimeIsNull() {
            addCriterion("creation_time is null");
            return (Criteria) this;
        }

        public Criteria andCreationTimeIsNotNull() {
            addCriterion("creation_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreationTimeEqualTo(Date value) {
            addCriterion("creation_time =", value, "creationTime");
            return (Criteria) this;
        }

        public Criteria andCreationTimeNotEqualTo(Date value) {
            addCriterion("creation_time <>", value, "creationTime");
            return (Criteria) this;
        }

        public Criteria andCreationTimeGreaterThan(Date value) {
            addCriterion("creation_time >", value, "creationTime");
            return (Criteria) this;
        }

        public Criteria andCreationTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("creation_time >=", value, "creationTime");
            return (Criteria) this;
        }

        public Criteria andCreationTimeLessThan(Date value) {
            addCriterion("creation_time <", value, "creationTime");
            return (Criteria) this;
        }

        public Criteria andCreationTimeLessThanOrEqualTo(Date value) {
            addCriterion("creation_time <=", value, "creationTime");
            return (Criteria) this;
        }

        public Criteria andCreationTimeIn(List<Date> values) {
            addCriterion("creation_time in", values, "creationTime");
            return (Criteria) this;
        }

        public Criteria andCreationTimeNotIn(List<Date> values) {
            addCriterion("creation_time not in", values, "creationTime");
            return (Criteria) this;
        }

        public Criteria andCreationTimeBetween(Date value1, Date value2) {
            addCriterion("creation_time between", value1, value2, "creationTime");
            return (Criteria) this;
        }

        public Criteria andCreationTimeNotBetween(Date value1, Date value2) {
            addCriterion("creation_time not between", value1, value2, "creationTime");
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