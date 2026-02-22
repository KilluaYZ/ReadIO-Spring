package com.pool.readio.readiombg.model;

import java.util.ArrayList;
import java.util.List;

public class PgInitPrivsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PgInitPrivsExample() {
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

        public Criteria andObjoidIsNull() {
            addCriterion("objoid is null");
            return (Criteria) this;
        }

        public Criteria andObjoidIsNotNull() {
            addCriterion("objoid is not null");
            return (Criteria) this;
        }

        public Criteria andObjoidEqualTo(Long value) {
            addCriterion("objoid =", value, "objoid");
            return (Criteria) this;
        }

        public Criteria andObjoidNotEqualTo(Long value) {
            addCriterion("objoid <>", value, "objoid");
            return (Criteria) this;
        }

        public Criteria andObjoidGreaterThan(Long value) {
            addCriterion("objoid >", value, "objoid");
            return (Criteria) this;
        }

        public Criteria andObjoidGreaterThanOrEqualTo(Long value) {
            addCriterion("objoid >=", value, "objoid");
            return (Criteria) this;
        }

        public Criteria andObjoidLessThan(Long value) {
            addCriterion("objoid <", value, "objoid");
            return (Criteria) this;
        }

        public Criteria andObjoidLessThanOrEqualTo(Long value) {
            addCriterion("objoid <=", value, "objoid");
            return (Criteria) this;
        }

        public Criteria andObjoidIn(List<Long> values) {
            addCriterion("objoid in", values, "objoid");
            return (Criteria) this;
        }

        public Criteria andObjoidNotIn(List<Long> values) {
            addCriterion("objoid not in", values, "objoid");
            return (Criteria) this;
        }

        public Criteria andObjoidBetween(Long value1, Long value2) {
            addCriterion("objoid between", value1, value2, "objoid");
            return (Criteria) this;
        }

        public Criteria andObjoidNotBetween(Long value1, Long value2) {
            addCriterion("objoid not between", value1, value2, "objoid");
            return (Criteria) this;
        }

        public Criteria andClassoidIsNull() {
            addCriterion("classoid is null");
            return (Criteria) this;
        }

        public Criteria andClassoidIsNotNull() {
            addCriterion("classoid is not null");
            return (Criteria) this;
        }

        public Criteria andClassoidEqualTo(Long value) {
            addCriterion("classoid =", value, "classoid");
            return (Criteria) this;
        }

        public Criteria andClassoidNotEqualTo(Long value) {
            addCriterion("classoid <>", value, "classoid");
            return (Criteria) this;
        }

        public Criteria andClassoidGreaterThan(Long value) {
            addCriterion("classoid >", value, "classoid");
            return (Criteria) this;
        }

        public Criteria andClassoidGreaterThanOrEqualTo(Long value) {
            addCriterion("classoid >=", value, "classoid");
            return (Criteria) this;
        }

        public Criteria andClassoidLessThan(Long value) {
            addCriterion("classoid <", value, "classoid");
            return (Criteria) this;
        }

        public Criteria andClassoidLessThanOrEqualTo(Long value) {
            addCriterion("classoid <=", value, "classoid");
            return (Criteria) this;
        }

        public Criteria andClassoidIn(List<Long> values) {
            addCriterion("classoid in", values, "classoid");
            return (Criteria) this;
        }

        public Criteria andClassoidNotIn(List<Long> values) {
            addCriterion("classoid not in", values, "classoid");
            return (Criteria) this;
        }

        public Criteria andClassoidBetween(Long value1, Long value2) {
            addCriterion("classoid between", value1, value2, "classoid");
            return (Criteria) this;
        }

        public Criteria andClassoidNotBetween(Long value1, Long value2) {
            addCriterion("classoid not between", value1, value2, "classoid");
            return (Criteria) this;
        }

        public Criteria andObjsubidIsNull() {
            addCriterion("objsubid is null");
            return (Criteria) this;
        }

        public Criteria andObjsubidIsNotNull() {
            addCriterion("objsubid is not null");
            return (Criteria) this;
        }

        public Criteria andObjsubidEqualTo(Integer value) {
            addCriterion("objsubid =", value, "objsubid");
            return (Criteria) this;
        }

        public Criteria andObjsubidNotEqualTo(Integer value) {
            addCriterion("objsubid <>", value, "objsubid");
            return (Criteria) this;
        }

        public Criteria andObjsubidGreaterThan(Integer value) {
            addCriterion("objsubid >", value, "objsubid");
            return (Criteria) this;
        }

        public Criteria andObjsubidGreaterThanOrEqualTo(Integer value) {
            addCriterion("objsubid >=", value, "objsubid");
            return (Criteria) this;
        }

        public Criteria andObjsubidLessThan(Integer value) {
            addCriterion("objsubid <", value, "objsubid");
            return (Criteria) this;
        }

        public Criteria andObjsubidLessThanOrEqualTo(Integer value) {
            addCriterion("objsubid <=", value, "objsubid");
            return (Criteria) this;
        }

        public Criteria andObjsubidIn(List<Integer> values) {
            addCriterion("objsubid in", values, "objsubid");
            return (Criteria) this;
        }

        public Criteria andObjsubidNotIn(List<Integer> values) {
            addCriterion("objsubid not in", values, "objsubid");
            return (Criteria) this;
        }

        public Criteria andObjsubidBetween(Integer value1, Integer value2) {
            addCriterion("objsubid between", value1, value2, "objsubid");
            return (Criteria) this;
        }

        public Criteria andObjsubidNotBetween(Integer value1, Integer value2) {
            addCriterion("objsubid not between", value1, value2, "objsubid");
            return (Criteria) this;
        }

        public Criteria andPrivtypeIsNull() {
            addCriterion("privtype is null");
            return (Criteria) this;
        }

        public Criteria andPrivtypeIsNotNull() {
            addCriterion("privtype is not null");
            return (Criteria) this;
        }

        public Criteria andPrivtypeEqualTo(String value) {
            addCriterion("privtype =", value, "privtype");
            return (Criteria) this;
        }

        public Criteria andPrivtypeNotEqualTo(String value) {
            addCriterion("privtype <>", value, "privtype");
            return (Criteria) this;
        }

        public Criteria andPrivtypeGreaterThan(String value) {
            addCriterion("privtype >", value, "privtype");
            return (Criteria) this;
        }

        public Criteria andPrivtypeGreaterThanOrEqualTo(String value) {
            addCriterion("privtype >=", value, "privtype");
            return (Criteria) this;
        }

        public Criteria andPrivtypeLessThan(String value) {
            addCriterion("privtype <", value, "privtype");
            return (Criteria) this;
        }

        public Criteria andPrivtypeLessThanOrEqualTo(String value) {
            addCriterion("privtype <=", value, "privtype");
            return (Criteria) this;
        }

        public Criteria andPrivtypeLike(String value) {
            addCriterion("privtype like", value, "privtype");
            return (Criteria) this;
        }

        public Criteria andPrivtypeNotLike(String value) {
            addCriterion("privtype not like", value, "privtype");
            return (Criteria) this;
        }

        public Criteria andPrivtypeIn(List<String> values) {
            addCriterion("privtype in", values, "privtype");
            return (Criteria) this;
        }

        public Criteria andPrivtypeNotIn(List<String> values) {
            addCriterion("privtype not in", values, "privtype");
            return (Criteria) this;
        }

        public Criteria andPrivtypeBetween(String value1, String value2) {
            addCriterion("privtype between", value1, value2, "privtype");
            return (Criteria) this;
        }

        public Criteria andPrivtypeNotBetween(String value1, String value2) {
            addCriterion("privtype not between", value1, value2, "privtype");
            return (Criteria) this;
        }

        public Criteria andInitprivsIsNull() {
            addCriterion("initprivs is null");
            return (Criteria) this;
        }

        public Criteria andInitprivsIsNotNull() {
            addCriterion("initprivs is not null");
            return (Criteria) this;
        }

        public Criteria andInitprivsEqualTo(Object value) {
            addCriterion("initprivs =", value, "initprivs");
            return (Criteria) this;
        }

        public Criteria andInitprivsNotEqualTo(Object value) {
            addCriterion("initprivs <>", value, "initprivs");
            return (Criteria) this;
        }

        public Criteria andInitprivsGreaterThan(Object value) {
            addCriterion("initprivs >", value, "initprivs");
            return (Criteria) this;
        }

        public Criteria andInitprivsGreaterThanOrEqualTo(Object value) {
            addCriterion("initprivs >=", value, "initprivs");
            return (Criteria) this;
        }

        public Criteria andInitprivsLessThan(Object value) {
            addCriterion("initprivs <", value, "initprivs");
            return (Criteria) this;
        }

        public Criteria andInitprivsLessThanOrEqualTo(Object value) {
            addCriterion("initprivs <=", value, "initprivs");
            return (Criteria) this;
        }

        public Criteria andInitprivsIn(List<Object> values) {
            addCriterion("initprivs in", values, "initprivs");
            return (Criteria) this;
        }

        public Criteria andInitprivsNotIn(List<Object> values) {
            addCriterion("initprivs not in", values, "initprivs");
            return (Criteria) this;
        }

        public Criteria andInitprivsBetween(Object value1, Object value2) {
            addCriterion("initprivs between", value1, value2, "initprivs");
            return (Criteria) this;
        }

        public Criteria andInitprivsNotBetween(Object value1, Object value2) {
            addCriterion("initprivs not between", value1, value2, "initprivs");
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