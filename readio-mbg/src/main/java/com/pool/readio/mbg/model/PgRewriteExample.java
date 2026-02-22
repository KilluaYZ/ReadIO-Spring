package com.pool.readio.mbg.model;

import java.util.ArrayList;
import java.util.List;

public class PgRewriteExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PgRewriteExample() {
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

        public Criteria andRulenameIsNull() {
            addCriterion("rulename is null");
            return (Criteria) this;
        }

        public Criteria andRulenameIsNotNull() {
            addCriterion("rulename is not null");
            return (Criteria) this;
        }

        public Criteria andRulenameEqualTo(String value) {
            addCriterion("rulename =", value, "rulename");
            return (Criteria) this;
        }

        public Criteria andRulenameNotEqualTo(String value) {
            addCriterion("rulename <>", value, "rulename");
            return (Criteria) this;
        }

        public Criteria andRulenameGreaterThan(String value) {
            addCriterion("rulename >", value, "rulename");
            return (Criteria) this;
        }

        public Criteria andRulenameGreaterThanOrEqualTo(String value) {
            addCriterion("rulename >=", value, "rulename");
            return (Criteria) this;
        }

        public Criteria andRulenameLessThan(String value) {
            addCriterion("rulename <", value, "rulename");
            return (Criteria) this;
        }

        public Criteria andRulenameLessThanOrEqualTo(String value) {
            addCriterion("rulename <=", value, "rulename");
            return (Criteria) this;
        }

        public Criteria andRulenameLike(String value) {
            addCriterion("rulename like", value, "rulename");
            return (Criteria) this;
        }

        public Criteria andRulenameNotLike(String value) {
            addCriterion("rulename not like", value, "rulename");
            return (Criteria) this;
        }

        public Criteria andRulenameIn(List<String> values) {
            addCriterion("rulename in", values, "rulename");
            return (Criteria) this;
        }

        public Criteria andRulenameNotIn(List<String> values) {
            addCriterion("rulename not in", values, "rulename");
            return (Criteria) this;
        }

        public Criteria andRulenameBetween(String value1, String value2) {
            addCriterion("rulename between", value1, value2, "rulename");
            return (Criteria) this;
        }

        public Criteria andRulenameNotBetween(String value1, String value2) {
            addCriterion("rulename not between", value1, value2, "rulename");
            return (Criteria) this;
        }

        public Criteria andEvClassIsNull() {
            addCriterion("ev_class is null");
            return (Criteria) this;
        }

        public Criteria andEvClassIsNotNull() {
            addCriterion("ev_class is not null");
            return (Criteria) this;
        }

        public Criteria andEvClassEqualTo(Long value) {
            addCriterion("ev_class =", value, "evClass");
            return (Criteria) this;
        }

        public Criteria andEvClassNotEqualTo(Long value) {
            addCriterion("ev_class <>", value, "evClass");
            return (Criteria) this;
        }

        public Criteria andEvClassGreaterThan(Long value) {
            addCriterion("ev_class >", value, "evClass");
            return (Criteria) this;
        }

        public Criteria andEvClassGreaterThanOrEqualTo(Long value) {
            addCriterion("ev_class >=", value, "evClass");
            return (Criteria) this;
        }

        public Criteria andEvClassLessThan(Long value) {
            addCriterion("ev_class <", value, "evClass");
            return (Criteria) this;
        }

        public Criteria andEvClassLessThanOrEqualTo(Long value) {
            addCriterion("ev_class <=", value, "evClass");
            return (Criteria) this;
        }

        public Criteria andEvClassIn(List<Long> values) {
            addCriterion("ev_class in", values, "evClass");
            return (Criteria) this;
        }

        public Criteria andEvClassNotIn(List<Long> values) {
            addCriterion("ev_class not in", values, "evClass");
            return (Criteria) this;
        }

        public Criteria andEvClassBetween(Long value1, Long value2) {
            addCriterion("ev_class between", value1, value2, "evClass");
            return (Criteria) this;
        }

        public Criteria andEvClassNotBetween(Long value1, Long value2) {
            addCriterion("ev_class not between", value1, value2, "evClass");
            return (Criteria) this;
        }

        public Criteria andEvTypeIsNull() {
            addCriterion("ev_type is null");
            return (Criteria) this;
        }

        public Criteria andEvTypeIsNotNull() {
            addCriterion("ev_type is not null");
            return (Criteria) this;
        }

        public Criteria andEvTypeEqualTo(String value) {
            addCriterion("ev_type =", value, "evType");
            return (Criteria) this;
        }

        public Criteria andEvTypeNotEqualTo(String value) {
            addCriterion("ev_type <>", value, "evType");
            return (Criteria) this;
        }

        public Criteria andEvTypeGreaterThan(String value) {
            addCriterion("ev_type >", value, "evType");
            return (Criteria) this;
        }

        public Criteria andEvTypeGreaterThanOrEqualTo(String value) {
            addCriterion("ev_type >=", value, "evType");
            return (Criteria) this;
        }

        public Criteria andEvTypeLessThan(String value) {
            addCriterion("ev_type <", value, "evType");
            return (Criteria) this;
        }

        public Criteria andEvTypeLessThanOrEqualTo(String value) {
            addCriterion("ev_type <=", value, "evType");
            return (Criteria) this;
        }

        public Criteria andEvTypeLike(String value) {
            addCriterion("ev_type like", value, "evType");
            return (Criteria) this;
        }

        public Criteria andEvTypeNotLike(String value) {
            addCriterion("ev_type not like", value, "evType");
            return (Criteria) this;
        }

        public Criteria andEvTypeIn(List<String> values) {
            addCriterion("ev_type in", values, "evType");
            return (Criteria) this;
        }

        public Criteria andEvTypeNotIn(List<String> values) {
            addCriterion("ev_type not in", values, "evType");
            return (Criteria) this;
        }

        public Criteria andEvTypeBetween(String value1, String value2) {
            addCriterion("ev_type between", value1, value2, "evType");
            return (Criteria) this;
        }

        public Criteria andEvTypeNotBetween(String value1, String value2) {
            addCriterion("ev_type not between", value1, value2, "evType");
            return (Criteria) this;
        }

        public Criteria andEvEnabledIsNull() {
            addCriterion("ev_enabled is null");
            return (Criteria) this;
        }

        public Criteria andEvEnabledIsNotNull() {
            addCriterion("ev_enabled is not null");
            return (Criteria) this;
        }

        public Criteria andEvEnabledEqualTo(String value) {
            addCriterion("ev_enabled =", value, "evEnabled");
            return (Criteria) this;
        }

        public Criteria andEvEnabledNotEqualTo(String value) {
            addCriterion("ev_enabled <>", value, "evEnabled");
            return (Criteria) this;
        }

        public Criteria andEvEnabledGreaterThan(String value) {
            addCriterion("ev_enabled >", value, "evEnabled");
            return (Criteria) this;
        }

        public Criteria andEvEnabledGreaterThanOrEqualTo(String value) {
            addCriterion("ev_enabled >=", value, "evEnabled");
            return (Criteria) this;
        }

        public Criteria andEvEnabledLessThan(String value) {
            addCriterion("ev_enabled <", value, "evEnabled");
            return (Criteria) this;
        }

        public Criteria andEvEnabledLessThanOrEqualTo(String value) {
            addCriterion("ev_enabled <=", value, "evEnabled");
            return (Criteria) this;
        }

        public Criteria andEvEnabledLike(String value) {
            addCriterion("ev_enabled like", value, "evEnabled");
            return (Criteria) this;
        }

        public Criteria andEvEnabledNotLike(String value) {
            addCriterion("ev_enabled not like", value, "evEnabled");
            return (Criteria) this;
        }

        public Criteria andEvEnabledIn(List<String> values) {
            addCriterion("ev_enabled in", values, "evEnabled");
            return (Criteria) this;
        }

        public Criteria andEvEnabledNotIn(List<String> values) {
            addCriterion("ev_enabled not in", values, "evEnabled");
            return (Criteria) this;
        }

        public Criteria andEvEnabledBetween(String value1, String value2) {
            addCriterion("ev_enabled between", value1, value2, "evEnabled");
            return (Criteria) this;
        }

        public Criteria andEvEnabledNotBetween(String value1, String value2) {
            addCriterion("ev_enabled not between", value1, value2, "evEnabled");
            return (Criteria) this;
        }

        public Criteria andIsInsteadIsNull() {
            addCriterion("is_instead is null");
            return (Criteria) this;
        }

        public Criteria andIsInsteadIsNotNull() {
            addCriterion("is_instead is not null");
            return (Criteria) this;
        }

        public Criteria andIsInsteadEqualTo(Boolean value) {
            addCriterion("is_instead =", value, "isInstead");
            return (Criteria) this;
        }

        public Criteria andIsInsteadNotEqualTo(Boolean value) {
            addCriterion("is_instead <>", value, "isInstead");
            return (Criteria) this;
        }

        public Criteria andIsInsteadGreaterThan(Boolean value) {
            addCriterion("is_instead >", value, "isInstead");
            return (Criteria) this;
        }

        public Criteria andIsInsteadGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_instead >=", value, "isInstead");
            return (Criteria) this;
        }

        public Criteria andIsInsteadLessThan(Boolean value) {
            addCriterion("is_instead <", value, "isInstead");
            return (Criteria) this;
        }

        public Criteria andIsInsteadLessThanOrEqualTo(Boolean value) {
            addCriterion("is_instead <=", value, "isInstead");
            return (Criteria) this;
        }

        public Criteria andIsInsteadIn(List<Boolean> values) {
            addCriterion("is_instead in", values, "isInstead");
            return (Criteria) this;
        }

        public Criteria andIsInsteadNotIn(List<Boolean> values) {
            addCriterion("is_instead not in", values, "isInstead");
            return (Criteria) this;
        }

        public Criteria andIsInsteadBetween(Boolean value1, Boolean value2) {
            addCriterion("is_instead between", value1, value2, "isInstead");
            return (Criteria) this;
        }

        public Criteria andIsInsteadNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_instead not between", value1, value2, "isInstead");
            return (Criteria) this;
        }

        public Criteria andEvQualIsNull() {
            addCriterion("ev_qual is null");
            return (Criteria) this;
        }

        public Criteria andEvQualIsNotNull() {
            addCriterion("ev_qual is not null");
            return (Criteria) this;
        }

        public Criteria andEvQualEqualTo(Object value) {
            addCriterion("ev_qual =", value, "evQual");
            return (Criteria) this;
        }

        public Criteria andEvQualNotEqualTo(Object value) {
            addCriterion("ev_qual <>", value, "evQual");
            return (Criteria) this;
        }

        public Criteria andEvQualGreaterThan(Object value) {
            addCriterion("ev_qual >", value, "evQual");
            return (Criteria) this;
        }

        public Criteria andEvQualGreaterThanOrEqualTo(Object value) {
            addCriterion("ev_qual >=", value, "evQual");
            return (Criteria) this;
        }

        public Criteria andEvQualLessThan(Object value) {
            addCriterion("ev_qual <", value, "evQual");
            return (Criteria) this;
        }

        public Criteria andEvQualLessThanOrEqualTo(Object value) {
            addCriterion("ev_qual <=", value, "evQual");
            return (Criteria) this;
        }

        public Criteria andEvQualIn(List<Object> values) {
            addCriterion("ev_qual in", values, "evQual");
            return (Criteria) this;
        }

        public Criteria andEvQualNotIn(List<Object> values) {
            addCriterion("ev_qual not in", values, "evQual");
            return (Criteria) this;
        }

        public Criteria andEvQualBetween(Object value1, Object value2) {
            addCriterion("ev_qual between", value1, value2, "evQual");
            return (Criteria) this;
        }

        public Criteria andEvQualNotBetween(Object value1, Object value2) {
            addCriterion("ev_qual not between", value1, value2, "evQual");
            return (Criteria) this;
        }

        public Criteria andEvActionIsNull() {
            addCriterion("ev_action is null");
            return (Criteria) this;
        }

        public Criteria andEvActionIsNotNull() {
            addCriterion("ev_action is not null");
            return (Criteria) this;
        }

        public Criteria andEvActionEqualTo(Object value) {
            addCriterion("ev_action =", value, "evAction");
            return (Criteria) this;
        }

        public Criteria andEvActionNotEqualTo(Object value) {
            addCriterion("ev_action <>", value, "evAction");
            return (Criteria) this;
        }

        public Criteria andEvActionGreaterThan(Object value) {
            addCriterion("ev_action >", value, "evAction");
            return (Criteria) this;
        }

        public Criteria andEvActionGreaterThanOrEqualTo(Object value) {
            addCriterion("ev_action >=", value, "evAction");
            return (Criteria) this;
        }

        public Criteria andEvActionLessThan(Object value) {
            addCriterion("ev_action <", value, "evAction");
            return (Criteria) this;
        }

        public Criteria andEvActionLessThanOrEqualTo(Object value) {
            addCriterion("ev_action <=", value, "evAction");
            return (Criteria) this;
        }

        public Criteria andEvActionIn(List<Object> values) {
            addCriterion("ev_action in", values, "evAction");
            return (Criteria) this;
        }

        public Criteria andEvActionNotIn(List<Object> values) {
            addCriterion("ev_action not in", values, "evAction");
            return (Criteria) this;
        }

        public Criteria andEvActionBetween(Object value1, Object value2) {
            addCriterion("ev_action between", value1, value2, "evAction");
            return (Criteria) this;
        }

        public Criteria andEvActionNotBetween(Object value1, Object value2) {
            addCriterion("ev_action not between", value1, value2, "evAction");
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