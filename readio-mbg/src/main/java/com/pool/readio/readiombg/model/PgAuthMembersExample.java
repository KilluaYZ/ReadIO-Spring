package com.pool.readio.readiombg.model;

import java.util.ArrayList;
import java.util.List;

public class PgAuthMembersExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PgAuthMembersExample() {
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

        public Criteria andRoleidIsNull() {
            addCriterion("roleid is null");
            return (Criteria) this;
        }

        public Criteria andRoleidIsNotNull() {
            addCriterion("roleid is not null");
            return (Criteria) this;
        }

        public Criteria andRoleidEqualTo(Long value) {
            addCriterion("roleid =", value, "roleid");
            return (Criteria) this;
        }

        public Criteria andRoleidNotEqualTo(Long value) {
            addCriterion("roleid <>", value, "roleid");
            return (Criteria) this;
        }

        public Criteria andRoleidGreaterThan(Long value) {
            addCriterion("roleid >", value, "roleid");
            return (Criteria) this;
        }

        public Criteria andRoleidGreaterThanOrEqualTo(Long value) {
            addCriterion("roleid >=", value, "roleid");
            return (Criteria) this;
        }

        public Criteria andRoleidLessThan(Long value) {
            addCriterion("roleid <", value, "roleid");
            return (Criteria) this;
        }

        public Criteria andRoleidLessThanOrEqualTo(Long value) {
            addCriterion("roleid <=", value, "roleid");
            return (Criteria) this;
        }

        public Criteria andRoleidIn(List<Long> values) {
            addCriterion("roleid in", values, "roleid");
            return (Criteria) this;
        }

        public Criteria andRoleidNotIn(List<Long> values) {
            addCriterion("roleid not in", values, "roleid");
            return (Criteria) this;
        }

        public Criteria andRoleidBetween(Long value1, Long value2) {
            addCriterion("roleid between", value1, value2, "roleid");
            return (Criteria) this;
        }

        public Criteria andRoleidNotBetween(Long value1, Long value2) {
            addCriterion("roleid not between", value1, value2, "roleid");
            return (Criteria) this;
        }

        public Criteria andMemberIsNull() {
            addCriterion("member is null");
            return (Criteria) this;
        }

        public Criteria andMemberIsNotNull() {
            addCriterion("member is not null");
            return (Criteria) this;
        }

        public Criteria andMemberEqualTo(Long value) {
            addCriterion("member =", value, "member");
            return (Criteria) this;
        }

        public Criteria andMemberNotEqualTo(Long value) {
            addCriterion("member <>", value, "member");
            return (Criteria) this;
        }

        public Criteria andMemberGreaterThan(Long value) {
            addCriterion("member >", value, "member");
            return (Criteria) this;
        }

        public Criteria andMemberGreaterThanOrEqualTo(Long value) {
            addCriterion("member >=", value, "member");
            return (Criteria) this;
        }

        public Criteria andMemberLessThan(Long value) {
            addCriterion("member <", value, "member");
            return (Criteria) this;
        }

        public Criteria andMemberLessThanOrEqualTo(Long value) {
            addCriterion("member <=", value, "member");
            return (Criteria) this;
        }

        public Criteria andMemberIn(List<Long> values) {
            addCriterion("member in", values, "member");
            return (Criteria) this;
        }

        public Criteria andMemberNotIn(List<Long> values) {
            addCriterion("member not in", values, "member");
            return (Criteria) this;
        }

        public Criteria andMemberBetween(Long value1, Long value2) {
            addCriterion("member between", value1, value2, "member");
            return (Criteria) this;
        }

        public Criteria andMemberNotBetween(Long value1, Long value2) {
            addCriterion("member not between", value1, value2, "member");
            return (Criteria) this;
        }

        public Criteria andGrantorIsNull() {
            addCriterion("grantor is null");
            return (Criteria) this;
        }

        public Criteria andGrantorIsNotNull() {
            addCriterion("grantor is not null");
            return (Criteria) this;
        }

        public Criteria andGrantorEqualTo(Long value) {
            addCriterion("grantor =", value, "grantor");
            return (Criteria) this;
        }

        public Criteria andGrantorNotEqualTo(Long value) {
            addCriterion("grantor <>", value, "grantor");
            return (Criteria) this;
        }

        public Criteria andGrantorGreaterThan(Long value) {
            addCriterion("grantor >", value, "grantor");
            return (Criteria) this;
        }

        public Criteria andGrantorGreaterThanOrEqualTo(Long value) {
            addCriterion("grantor >=", value, "grantor");
            return (Criteria) this;
        }

        public Criteria andGrantorLessThan(Long value) {
            addCriterion("grantor <", value, "grantor");
            return (Criteria) this;
        }

        public Criteria andGrantorLessThanOrEqualTo(Long value) {
            addCriterion("grantor <=", value, "grantor");
            return (Criteria) this;
        }

        public Criteria andGrantorIn(List<Long> values) {
            addCriterion("grantor in", values, "grantor");
            return (Criteria) this;
        }

        public Criteria andGrantorNotIn(List<Long> values) {
            addCriterion("grantor not in", values, "grantor");
            return (Criteria) this;
        }

        public Criteria andGrantorBetween(Long value1, Long value2) {
            addCriterion("grantor between", value1, value2, "grantor");
            return (Criteria) this;
        }

        public Criteria andGrantorNotBetween(Long value1, Long value2) {
            addCriterion("grantor not between", value1, value2, "grantor");
            return (Criteria) this;
        }

        public Criteria andAdminOptionIsNull() {
            addCriterion("admin_option is null");
            return (Criteria) this;
        }

        public Criteria andAdminOptionIsNotNull() {
            addCriterion("admin_option is not null");
            return (Criteria) this;
        }

        public Criteria andAdminOptionEqualTo(Boolean value) {
            addCriterion("admin_option =", value, "adminOption");
            return (Criteria) this;
        }

        public Criteria andAdminOptionNotEqualTo(Boolean value) {
            addCriterion("admin_option <>", value, "adminOption");
            return (Criteria) this;
        }

        public Criteria andAdminOptionGreaterThan(Boolean value) {
            addCriterion("admin_option >", value, "adminOption");
            return (Criteria) this;
        }

        public Criteria andAdminOptionGreaterThanOrEqualTo(Boolean value) {
            addCriterion("admin_option >=", value, "adminOption");
            return (Criteria) this;
        }

        public Criteria andAdminOptionLessThan(Boolean value) {
            addCriterion("admin_option <", value, "adminOption");
            return (Criteria) this;
        }

        public Criteria andAdminOptionLessThanOrEqualTo(Boolean value) {
            addCriterion("admin_option <=", value, "adminOption");
            return (Criteria) this;
        }

        public Criteria andAdminOptionIn(List<Boolean> values) {
            addCriterion("admin_option in", values, "adminOption");
            return (Criteria) this;
        }

        public Criteria andAdminOptionNotIn(List<Boolean> values) {
            addCriterion("admin_option not in", values, "adminOption");
            return (Criteria) this;
        }

        public Criteria andAdminOptionBetween(Boolean value1, Boolean value2) {
            addCriterion("admin_option between", value1, value2, "adminOption");
            return (Criteria) this;
        }

        public Criteria andAdminOptionNotBetween(Boolean value1, Boolean value2) {
            addCriterion("admin_option not between", value1, value2, "adminOption");
            return (Criteria) this;
        }

        public Criteria andInheritOptionIsNull() {
            addCriterion("inherit_option is null");
            return (Criteria) this;
        }

        public Criteria andInheritOptionIsNotNull() {
            addCriterion("inherit_option is not null");
            return (Criteria) this;
        }

        public Criteria andInheritOptionEqualTo(Boolean value) {
            addCriterion("inherit_option =", value, "inheritOption");
            return (Criteria) this;
        }

        public Criteria andInheritOptionNotEqualTo(Boolean value) {
            addCriterion("inherit_option <>", value, "inheritOption");
            return (Criteria) this;
        }

        public Criteria andInheritOptionGreaterThan(Boolean value) {
            addCriterion("inherit_option >", value, "inheritOption");
            return (Criteria) this;
        }

        public Criteria andInheritOptionGreaterThanOrEqualTo(Boolean value) {
            addCriterion("inherit_option >=", value, "inheritOption");
            return (Criteria) this;
        }

        public Criteria andInheritOptionLessThan(Boolean value) {
            addCriterion("inherit_option <", value, "inheritOption");
            return (Criteria) this;
        }

        public Criteria andInheritOptionLessThanOrEqualTo(Boolean value) {
            addCriterion("inherit_option <=", value, "inheritOption");
            return (Criteria) this;
        }

        public Criteria andInheritOptionIn(List<Boolean> values) {
            addCriterion("inherit_option in", values, "inheritOption");
            return (Criteria) this;
        }

        public Criteria andInheritOptionNotIn(List<Boolean> values) {
            addCriterion("inherit_option not in", values, "inheritOption");
            return (Criteria) this;
        }

        public Criteria andInheritOptionBetween(Boolean value1, Boolean value2) {
            addCriterion("inherit_option between", value1, value2, "inheritOption");
            return (Criteria) this;
        }

        public Criteria andInheritOptionNotBetween(Boolean value1, Boolean value2) {
            addCriterion("inherit_option not between", value1, value2, "inheritOption");
            return (Criteria) this;
        }

        public Criteria andSetOptionIsNull() {
            addCriterion("set_option is null");
            return (Criteria) this;
        }

        public Criteria andSetOptionIsNotNull() {
            addCriterion("set_option is not null");
            return (Criteria) this;
        }

        public Criteria andSetOptionEqualTo(Boolean value) {
            addCriterion("set_option =", value, "setOption");
            return (Criteria) this;
        }

        public Criteria andSetOptionNotEqualTo(Boolean value) {
            addCriterion("set_option <>", value, "setOption");
            return (Criteria) this;
        }

        public Criteria andSetOptionGreaterThan(Boolean value) {
            addCriterion("set_option >", value, "setOption");
            return (Criteria) this;
        }

        public Criteria andSetOptionGreaterThanOrEqualTo(Boolean value) {
            addCriterion("set_option >=", value, "setOption");
            return (Criteria) this;
        }

        public Criteria andSetOptionLessThan(Boolean value) {
            addCriterion("set_option <", value, "setOption");
            return (Criteria) this;
        }

        public Criteria andSetOptionLessThanOrEqualTo(Boolean value) {
            addCriterion("set_option <=", value, "setOption");
            return (Criteria) this;
        }

        public Criteria andSetOptionIn(List<Boolean> values) {
            addCriterion("set_option in", values, "setOption");
            return (Criteria) this;
        }

        public Criteria andSetOptionNotIn(List<Boolean> values) {
            addCriterion("set_option not in", values, "setOption");
            return (Criteria) this;
        }

        public Criteria andSetOptionBetween(Boolean value1, Boolean value2) {
            addCriterion("set_option between", value1, value2, "setOption");
            return (Criteria) this;
        }

        public Criteria andSetOptionNotBetween(Boolean value1, Boolean value2) {
            addCriterion("set_option not between", value1, value2, "setOption");
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