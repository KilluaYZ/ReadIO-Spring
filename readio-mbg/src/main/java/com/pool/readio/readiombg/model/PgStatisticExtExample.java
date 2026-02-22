package com.pool.readio.readiombg.model;

import java.util.ArrayList;
import java.util.List;

public class PgStatisticExtExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PgStatisticExtExample() {
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

        public Criteria andOidIsNull() {
            addCriterion("oid is null");
            return (Criteria) this;
        }

        public Criteria andOidIsNotNull() {
            addCriterion("oid is not null");
            return (Criteria) this;
        }

        public Criteria andOidEqualTo(Long value) {
            addCriterion("oid =", value, "oid");
            return (Criteria) this;
        }

        public Criteria andOidNotEqualTo(Long value) {
            addCriterion("oid <>", value, "oid");
            return (Criteria) this;
        }

        public Criteria andOidGreaterThan(Long value) {
            addCriterion("oid >", value, "oid");
            return (Criteria) this;
        }

        public Criteria andOidGreaterThanOrEqualTo(Long value) {
            addCriterion("oid >=", value, "oid");
            return (Criteria) this;
        }

        public Criteria andOidLessThan(Long value) {
            addCriterion("oid <", value, "oid");
            return (Criteria) this;
        }

        public Criteria andOidLessThanOrEqualTo(Long value) {
            addCriterion("oid <=", value, "oid");
            return (Criteria) this;
        }

        public Criteria andOidIn(List<Long> values) {
            addCriterion("oid in", values, "oid");
            return (Criteria) this;
        }

        public Criteria andOidNotIn(List<Long> values) {
            addCriterion("oid not in", values, "oid");
            return (Criteria) this;
        }

        public Criteria andOidBetween(Long value1, Long value2) {
            addCriterion("oid between", value1, value2, "oid");
            return (Criteria) this;
        }

        public Criteria andOidNotBetween(Long value1, Long value2) {
            addCriterion("oid not between", value1, value2, "oid");
            return (Criteria) this;
        }

        public Criteria andStxrelidIsNull() {
            addCriterion("stxrelid is null");
            return (Criteria) this;
        }

        public Criteria andStxrelidIsNotNull() {
            addCriterion("stxrelid is not null");
            return (Criteria) this;
        }

        public Criteria andStxrelidEqualTo(Long value) {
            addCriterion("stxrelid =", value, "stxrelid");
            return (Criteria) this;
        }

        public Criteria andStxrelidNotEqualTo(Long value) {
            addCriterion("stxrelid <>", value, "stxrelid");
            return (Criteria) this;
        }

        public Criteria andStxrelidGreaterThan(Long value) {
            addCriterion("stxrelid >", value, "stxrelid");
            return (Criteria) this;
        }

        public Criteria andStxrelidGreaterThanOrEqualTo(Long value) {
            addCriterion("stxrelid >=", value, "stxrelid");
            return (Criteria) this;
        }

        public Criteria andStxrelidLessThan(Long value) {
            addCriterion("stxrelid <", value, "stxrelid");
            return (Criteria) this;
        }

        public Criteria andStxrelidLessThanOrEqualTo(Long value) {
            addCriterion("stxrelid <=", value, "stxrelid");
            return (Criteria) this;
        }

        public Criteria andStxrelidIn(List<Long> values) {
            addCriterion("stxrelid in", values, "stxrelid");
            return (Criteria) this;
        }

        public Criteria andStxrelidNotIn(List<Long> values) {
            addCriterion("stxrelid not in", values, "stxrelid");
            return (Criteria) this;
        }

        public Criteria andStxrelidBetween(Long value1, Long value2) {
            addCriterion("stxrelid between", value1, value2, "stxrelid");
            return (Criteria) this;
        }

        public Criteria andStxrelidNotBetween(Long value1, Long value2) {
            addCriterion("stxrelid not between", value1, value2, "stxrelid");
            return (Criteria) this;
        }

        public Criteria andStxnameIsNull() {
            addCriterion("stxname is null");
            return (Criteria) this;
        }

        public Criteria andStxnameIsNotNull() {
            addCriterion("stxname is not null");
            return (Criteria) this;
        }

        public Criteria andStxnameEqualTo(String value) {
            addCriterion("stxname =", value, "stxname");
            return (Criteria) this;
        }

        public Criteria andStxnameNotEqualTo(String value) {
            addCriterion("stxname <>", value, "stxname");
            return (Criteria) this;
        }

        public Criteria andStxnameGreaterThan(String value) {
            addCriterion("stxname >", value, "stxname");
            return (Criteria) this;
        }

        public Criteria andStxnameGreaterThanOrEqualTo(String value) {
            addCriterion("stxname >=", value, "stxname");
            return (Criteria) this;
        }

        public Criteria andStxnameLessThan(String value) {
            addCriterion("stxname <", value, "stxname");
            return (Criteria) this;
        }

        public Criteria andStxnameLessThanOrEqualTo(String value) {
            addCriterion("stxname <=", value, "stxname");
            return (Criteria) this;
        }

        public Criteria andStxnameLike(String value) {
            addCriterion("stxname like", value, "stxname");
            return (Criteria) this;
        }

        public Criteria andStxnameNotLike(String value) {
            addCriterion("stxname not like", value, "stxname");
            return (Criteria) this;
        }

        public Criteria andStxnameIn(List<String> values) {
            addCriterion("stxname in", values, "stxname");
            return (Criteria) this;
        }

        public Criteria andStxnameNotIn(List<String> values) {
            addCriterion("stxname not in", values, "stxname");
            return (Criteria) this;
        }

        public Criteria andStxnameBetween(String value1, String value2) {
            addCriterion("stxname between", value1, value2, "stxname");
            return (Criteria) this;
        }

        public Criteria andStxnameNotBetween(String value1, String value2) {
            addCriterion("stxname not between", value1, value2, "stxname");
            return (Criteria) this;
        }

        public Criteria andStxnamespaceIsNull() {
            addCriterion("stxnamespace is null");
            return (Criteria) this;
        }

        public Criteria andStxnamespaceIsNotNull() {
            addCriterion("stxnamespace is not null");
            return (Criteria) this;
        }

        public Criteria andStxnamespaceEqualTo(Long value) {
            addCriterion("stxnamespace =", value, "stxnamespace");
            return (Criteria) this;
        }

        public Criteria andStxnamespaceNotEqualTo(Long value) {
            addCriterion("stxnamespace <>", value, "stxnamespace");
            return (Criteria) this;
        }

        public Criteria andStxnamespaceGreaterThan(Long value) {
            addCriterion("stxnamespace >", value, "stxnamespace");
            return (Criteria) this;
        }

        public Criteria andStxnamespaceGreaterThanOrEqualTo(Long value) {
            addCriterion("stxnamespace >=", value, "stxnamespace");
            return (Criteria) this;
        }

        public Criteria andStxnamespaceLessThan(Long value) {
            addCriterion("stxnamespace <", value, "stxnamespace");
            return (Criteria) this;
        }

        public Criteria andStxnamespaceLessThanOrEqualTo(Long value) {
            addCriterion("stxnamespace <=", value, "stxnamespace");
            return (Criteria) this;
        }

        public Criteria andStxnamespaceIn(List<Long> values) {
            addCriterion("stxnamespace in", values, "stxnamespace");
            return (Criteria) this;
        }

        public Criteria andStxnamespaceNotIn(List<Long> values) {
            addCriterion("stxnamespace not in", values, "stxnamespace");
            return (Criteria) this;
        }

        public Criteria andStxnamespaceBetween(Long value1, Long value2) {
            addCriterion("stxnamespace between", value1, value2, "stxnamespace");
            return (Criteria) this;
        }

        public Criteria andStxnamespaceNotBetween(Long value1, Long value2) {
            addCriterion("stxnamespace not between", value1, value2, "stxnamespace");
            return (Criteria) this;
        }

        public Criteria andStxownerIsNull() {
            addCriterion("stxowner is null");
            return (Criteria) this;
        }

        public Criteria andStxownerIsNotNull() {
            addCriterion("stxowner is not null");
            return (Criteria) this;
        }

        public Criteria andStxownerEqualTo(Long value) {
            addCriterion("stxowner =", value, "stxowner");
            return (Criteria) this;
        }

        public Criteria andStxownerNotEqualTo(Long value) {
            addCriterion("stxowner <>", value, "stxowner");
            return (Criteria) this;
        }

        public Criteria andStxownerGreaterThan(Long value) {
            addCriterion("stxowner >", value, "stxowner");
            return (Criteria) this;
        }

        public Criteria andStxownerGreaterThanOrEqualTo(Long value) {
            addCriterion("stxowner >=", value, "stxowner");
            return (Criteria) this;
        }

        public Criteria andStxownerLessThan(Long value) {
            addCriterion("stxowner <", value, "stxowner");
            return (Criteria) this;
        }

        public Criteria andStxownerLessThanOrEqualTo(Long value) {
            addCriterion("stxowner <=", value, "stxowner");
            return (Criteria) this;
        }

        public Criteria andStxownerIn(List<Long> values) {
            addCriterion("stxowner in", values, "stxowner");
            return (Criteria) this;
        }

        public Criteria andStxownerNotIn(List<Long> values) {
            addCriterion("stxowner not in", values, "stxowner");
            return (Criteria) this;
        }

        public Criteria andStxownerBetween(Long value1, Long value2) {
            addCriterion("stxowner between", value1, value2, "stxowner");
            return (Criteria) this;
        }

        public Criteria andStxownerNotBetween(Long value1, Long value2) {
            addCriterion("stxowner not between", value1, value2, "stxowner");
            return (Criteria) this;
        }

        public Criteria andStxkeysIsNull() {
            addCriterion("stxkeys is null");
            return (Criteria) this;
        }

        public Criteria andStxkeysIsNotNull() {
            addCriterion("stxkeys is not null");
            return (Criteria) this;
        }

        public Criteria andStxkeysEqualTo(Object value) {
            addCriterion("stxkeys =", value, "stxkeys");
            return (Criteria) this;
        }

        public Criteria andStxkeysNotEqualTo(Object value) {
            addCriterion("stxkeys <>", value, "stxkeys");
            return (Criteria) this;
        }

        public Criteria andStxkeysGreaterThan(Object value) {
            addCriterion("stxkeys >", value, "stxkeys");
            return (Criteria) this;
        }

        public Criteria andStxkeysGreaterThanOrEqualTo(Object value) {
            addCriterion("stxkeys >=", value, "stxkeys");
            return (Criteria) this;
        }

        public Criteria andStxkeysLessThan(Object value) {
            addCriterion("stxkeys <", value, "stxkeys");
            return (Criteria) this;
        }

        public Criteria andStxkeysLessThanOrEqualTo(Object value) {
            addCriterion("stxkeys <=", value, "stxkeys");
            return (Criteria) this;
        }

        public Criteria andStxkeysIn(List<Object> values) {
            addCriterion("stxkeys in", values, "stxkeys");
            return (Criteria) this;
        }

        public Criteria andStxkeysNotIn(List<Object> values) {
            addCriterion("stxkeys not in", values, "stxkeys");
            return (Criteria) this;
        }

        public Criteria andStxkeysBetween(Object value1, Object value2) {
            addCriterion("stxkeys between", value1, value2, "stxkeys");
            return (Criteria) this;
        }

        public Criteria andStxkeysNotBetween(Object value1, Object value2) {
            addCriterion("stxkeys not between", value1, value2, "stxkeys");
            return (Criteria) this;
        }

        public Criteria andStxstattargetIsNull() {
            addCriterion("stxstattarget is null");
            return (Criteria) this;
        }

        public Criteria andStxstattargetIsNotNull() {
            addCriterion("stxstattarget is not null");
            return (Criteria) this;
        }

        public Criteria andStxstattargetEqualTo(Short value) {
            addCriterion("stxstattarget =", value, "stxstattarget");
            return (Criteria) this;
        }

        public Criteria andStxstattargetNotEqualTo(Short value) {
            addCriterion("stxstattarget <>", value, "stxstattarget");
            return (Criteria) this;
        }

        public Criteria andStxstattargetGreaterThan(Short value) {
            addCriterion("stxstattarget >", value, "stxstattarget");
            return (Criteria) this;
        }

        public Criteria andStxstattargetGreaterThanOrEqualTo(Short value) {
            addCriterion("stxstattarget >=", value, "stxstattarget");
            return (Criteria) this;
        }

        public Criteria andStxstattargetLessThan(Short value) {
            addCriterion("stxstattarget <", value, "stxstattarget");
            return (Criteria) this;
        }

        public Criteria andStxstattargetLessThanOrEqualTo(Short value) {
            addCriterion("stxstattarget <=", value, "stxstattarget");
            return (Criteria) this;
        }

        public Criteria andStxstattargetIn(List<Short> values) {
            addCriterion("stxstattarget in", values, "stxstattarget");
            return (Criteria) this;
        }

        public Criteria andStxstattargetNotIn(List<Short> values) {
            addCriterion("stxstattarget not in", values, "stxstattarget");
            return (Criteria) this;
        }

        public Criteria andStxstattargetBetween(Short value1, Short value2) {
            addCriterion("stxstattarget between", value1, value2, "stxstattarget");
            return (Criteria) this;
        }

        public Criteria andStxstattargetNotBetween(Short value1, Short value2) {
            addCriterion("stxstattarget not between", value1, value2, "stxstattarget");
            return (Criteria) this;
        }

        public Criteria andStxkindIsNull() {
            addCriterion("stxkind is null");
            return (Criteria) this;
        }

        public Criteria andStxkindIsNotNull() {
            addCriterion("stxkind is not null");
            return (Criteria) this;
        }

        public Criteria andStxkindEqualTo(Object value) {
            addCriterion("stxkind =", value, "stxkind");
            return (Criteria) this;
        }

        public Criteria andStxkindNotEqualTo(Object value) {
            addCriterion("stxkind <>", value, "stxkind");
            return (Criteria) this;
        }

        public Criteria andStxkindGreaterThan(Object value) {
            addCriterion("stxkind >", value, "stxkind");
            return (Criteria) this;
        }

        public Criteria andStxkindGreaterThanOrEqualTo(Object value) {
            addCriterion("stxkind >=", value, "stxkind");
            return (Criteria) this;
        }

        public Criteria andStxkindLessThan(Object value) {
            addCriterion("stxkind <", value, "stxkind");
            return (Criteria) this;
        }

        public Criteria andStxkindLessThanOrEqualTo(Object value) {
            addCriterion("stxkind <=", value, "stxkind");
            return (Criteria) this;
        }

        public Criteria andStxkindIn(List<Object> values) {
            addCriterion("stxkind in", values, "stxkind");
            return (Criteria) this;
        }

        public Criteria andStxkindNotIn(List<Object> values) {
            addCriterion("stxkind not in", values, "stxkind");
            return (Criteria) this;
        }

        public Criteria andStxkindBetween(Object value1, Object value2) {
            addCriterion("stxkind between", value1, value2, "stxkind");
            return (Criteria) this;
        }

        public Criteria andStxkindNotBetween(Object value1, Object value2) {
            addCriterion("stxkind not between", value1, value2, "stxkind");
            return (Criteria) this;
        }

        public Criteria andStxexprsIsNull() {
            addCriterion("stxexprs is null");
            return (Criteria) this;
        }

        public Criteria andStxexprsIsNotNull() {
            addCriterion("stxexprs is not null");
            return (Criteria) this;
        }

        public Criteria andStxexprsEqualTo(Object value) {
            addCriterion("stxexprs =", value, "stxexprs");
            return (Criteria) this;
        }

        public Criteria andStxexprsNotEqualTo(Object value) {
            addCriterion("stxexprs <>", value, "stxexprs");
            return (Criteria) this;
        }

        public Criteria andStxexprsGreaterThan(Object value) {
            addCriterion("stxexprs >", value, "stxexprs");
            return (Criteria) this;
        }

        public Criteria andStxexprsGreaterThanOrEqualTo(Object value) {
            addCriterion("stxexprs >=", value, "stxexprs");
            return (Criteria) this;
        }

        public Criteria andStxexprsLessThan(Object value) {
            addCriterion("stxexprs <", value, "stxexprs");
            return (Criteria) this;
        }

        public Criteria andStxexprsLessThanOrEqualTo(Object value) {
            addCriterion("stxexprs <=", value, "stxexprs");
            return (Criteria) this;
        }

        public Criteria andStxexprsIn(List<Object> values) {
            addCriterion("stxexprs in", values, "stxexprs");
            return (Criteria) this;
        }

        public Criteria andStxexprsNotIn(List<Object> values) {
            addCriterion("stxexprs not in", values, "stxexprs");
            return (Criteria) this;
        }

        public Criteria andStxexprsBetween(Object value1, Object value2) {
            addCriterion("stxexprs between", value1, value2, "stxexprs");
            return (Criteria) this;
        }

        public Criteria andStxexprsNotBetween(Object value1, Object value2) {
            addCriterion("stxexprs not between", value1, value2, "stxexprs");
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