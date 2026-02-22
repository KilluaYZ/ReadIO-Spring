package com.pool.readio.mbg.model;

import java.util.ArrayList;
import java.util.List;

public class PgHbaFileRulesExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PgHbaFileRulesExample() {
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

        public Criteria andRuleNumberIsNull() {
            addCriterion("rule_number is null");
            return (Criteria) this;
        }

        public Criteria andRuleNumberIsNotNull() {
            addCriterion("rule_number is not null");
            return (Criteria) this;
        }

        public Criteria andRuleNumberEqualTo(Integer value) {
            addCriterion("rule_number =", value, "ruleNumber");
            return (Criteria) this;
        }

        public Criteria andRuleNumberNotEqualTo(Integer value) {
            addCriterion("rule_number <>", value, "ruleNumber");
            return (Criteria) this;
        }

        public Criteria andRuleNumberGreaterThan(Integer value) {
            addCriterion("rule_number >", value, "ruleNumber");
            return (Criteria) this;
        }

        public Criteria andRuleNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("rule_number >=", value, "ruleNumber");
            return (Criteria) this;
        }

        public Criteria andRuleNumberLessThan(Integer value) {
            addCriterion("rule_number <", value, "ruleNumber");
            return (Criteria) this;
        }

        public Criteria andRuleNumberLessThanOrEqualTo(Integer value) {
            addCriterion("rule_number <=", value, "ruleNumber");
            return (Criteria) this;
        }

        public Criteria andRuleNumberIn(List<Integer> values) {
            addCriterion("rule_number in", values, "ruleNumber");
            return (Criteria) this;
        }

        public Criteria andRuleNumberNotIn(List<Integer> values) {
            addCriterion("rule_number not in", values, "ruleNumber");
            return (Criteria) this;
        }

        public Criteria andRuleNumberBetween(Integer value1, Integer value2) {
            addCriterion("rule_number between", value1, value2, "ruleNumber");
            return (Criteria) this;
        }

        public Criteria andRuleNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("rule_number not between", value1, value2, "ruleNumber");
            return (Criteria) this;
        }

        public Criteria andFileNameIsNull() {
            addCriterion("file_name is null");
            return (Criteria) this;
        }

        public Criteria andFileNameIsNotNull() {
            addCriterion("file_name is not null");
            return (Criteria) this;
        }

        public Criteria andFileNameEqualTo(String value) {
            addCriterion("file_name =", value, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameNotEqualTo(String value) {
            addCriterion("file_name <>", value, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameGreaterThan(String value) {
            addCriterion("file_name >", value, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameGreaterThanOrEqualTo(String value) {
            addCriterion("file_name >=", value, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameLessThan(String value) {
            addCriterion("file_name <", value, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameLessThanOrEqualTo(String value) {
            addCriterion("file_name <=", value, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameLike(String value) {
            addCriterion("file_name like", value, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameNotLike(String value) {
            addCriterion("file_name not like", value, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameIn(List<String> values) {
            addCriterion("file_name in", values, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameNotIn(List<String> values) {
            addCriterion("file_name not in", values, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameBetween(String value1, String value2) {
            addCriterion("file_name between", value1, value2, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameNotBetween(String value1, String value2) {
            addCriterion("file_name not between", value1, value2, "fileName");
            return (Criteria) this;
        }

        public Criteria andLineNumberIsNull() {
            addCriterion("line_number is null");
            return (Criteria) this;
        }

        public Criteria andLineNumberIsNotNull() {
            addCriterion("line_number is not null");
            return (Criteria) this;
        }

        public Criteria andLineNumberEqualTo(Integer value) {
            addCriterion("line_number =", value, "lineNumber");
            return (Criteria) this;
        }

        public Criteria andLineNumberNotEqualTo(Integer value) {
            addCriterion("line_number <>", value, "lineNumber");
            return (Criteria) this;
        }

        public Criteria andLineNumberGreaterThan(Integer value) {
            addCriterion("line_number >", value, "lineNumber");
            return (Criteria) this;
        }

        public Criteria andLineNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("line_number >=", value, "lineNumber");
            return (Criteria) this;
        }

        public Criteria andLineNumberLessThan(Integer value) {
            addCriterion("line_number <", value, "lineNumber");
            return (Criteria) this;
        }

        public Criteria andLineNumberLessThanOrEqualTo(Integer value) {
            addCriterion("line_number <=", value, "lineNumber");
            return (Criteria) this;
        }

        public Criteria andLineNumberIn(List<Integer> values) {
            addCriterion("line_number in", values, "lineNumber");
            return (Criteria) this;
        }

        public Criteria andLineNumberNotIn(List<Integer> values) {
            addCriterion("line_number not in", values, "lineNumber");
            return (Criteria) this;
        }

        public Criteria andLineNumberBetween(Integer value1, Integer value2) {
            addCriterion("line_number between", value1, value2, "lineNumber");
            return (Criteria) this;
        }

        public Criteria andLineNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("line_number not between", value1, value2, "lineNumber");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("type is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("type is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(String value) {
            addCriterion("type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(String value) {
            addCriterion("type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(String value) {
            addCriterion("type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(String value) {
            addCriterion("type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(String value) {
            addCriterion("type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(String value) {
            addCriterion("type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLike(String value) {
            addCriterion("type like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotLike(String value) {
            addCriterion("type not like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<String> values) {
            addCriterion("type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<String> values) {
            addCriterion("type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(String value1, String value2) {
            addCriterion("type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(String value1, String value2) {
            addCriterion("type not between", value1, value2, "type");
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

        public Criteria andDatabaseEqualTo(Object value) {
            addCriterion("database =", value, "database");
            return (Criteria) this;
        }

        public Criteria andDatabaseNotEqualTo(Object value) {
            addCriterion("database <>", value, "database");
            return (Criteria) this;
        }

        public Criteria andDatabaseGreaterThan(Object value) {
            addCriterion("database >", value, "database");
            return (Criteria) this;
        }

        public Criteria andDatabaseGreaterThanOrEqualTo(Object value) {
            addCriterion("database >=", value, "database");
            return (Criteria) this;
        }

        public Criteria andDatabaseLessThan(Object value) {
            addCriterion("database <", value, "database");
            return (Criteria) this;
        }

        public Criteria andDatabaseLessThanOrEqualTo(Object value) {
            addCriterion("database <=", value, "database");
            return (Criteria) this;
        }

        public Criteria andDatabaseIn(List<Object> values) {
            addCriterion("database in", values, "database");
            return (Criteria) this;
        }

        public Criteria andDatabaseNotIn(List<Object> values) {
            addCriterion("database not in", values, "database");
            return (Criteria) this;
        }

        public Criteria andDatabaseBetween(Object value1, Object value2) {
            addCriterion("database between", value1, value2, "database");
            return (Criteria) this;
        }

        public Criteria andDatabaseNotBetween(Object value1, Object value2) {
            addCriterion("database not between", value1, value2, "database");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNull() {
            addCriterion("user_name is null");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNotNull() {
            addCriterion("user_name is not null");
            return (Criteria) this;
        }

        public Criteria andUserNameEqualTo(Object value) {
            addCriterion("user_name =", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotEqualTo(Object value) {
            addCriterion("user_name <>", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThan(Object value) {
            addCriterion("user_name >", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThanOrEqualTo(Object value) {
            addCriterion("user_name >=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThan(Object value) {
            addCriterion("user_name <", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThanOrEqualTo(Object value) {
            addCriterion("user_name <=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameIn(List<Object> values) {
            addCriterion("user_name in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotIn(List<Object> values) {
            addCriterion("user_name not in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameBetween(Object value1, Object value2) {
            addCriterion("user_name between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotBetween(Object value1, Object value2) {
            addCriterion("user_name not between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andAddressIsNull() {
            addCriterion("address is null");
            return (Criteria) this;
        }

        public Criteria andAddressIsNotNull() {
            addCriterion("address is not null");
            return (Criteria) this;
        }

        public Criteria andAddressEqualTo(String value) {
            addCriterion("address =", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotEqualTo(String value) {
            addCriterion("address <>", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThan(String value) {
            addCriterion("address >", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThanOrEqualTo(String value) {
            addCriterion("address >=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThan(String value) {
            addCriterion("address <", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThanOrEqualTo(String value) {
            addCriterion("address <=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLike(String value) {
            addCriterion("address like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotLike(String value) {
            addCriterion("address not like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressIn(List<String> values) {
            addCriterion("address in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotIn(List<String> values) {
            addCriterion("address not in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressBetween(String value1, String value2) {
            addCriterion("address between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotBetween(String value1, String value2) {
            addCriterion("address not between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andNetmaskIsNull() {
            addCriterion("netmask is null");
            return (Criteria) this;
        }

        public Criteria andNetmaskIsNotNull() {
            addCriterion("netmask is not null");
            return (Criteria) this;
        }

        public Criteria andNetmaskEqualTo(String value) {
            addCriterion("netmask =", value, "netmask");
            return (Criteria) this;
        }

        public Criteria andNetmaskNotEqualTo(String value) {
            addCriterion("netmask <>", value, "netmask");
            return (Criteria) this;
        }

        public Criteria andNetmaskGreaterThan(String value) {
            addCriterion("netmask >", value, "netmask");
            return (Criteria) this;
        }

        public Criteria andNetmaskGreaterThanOrEqualTo(String value) {
            addCriterion("netmask >=", value, "netmask");
            return (Criteria) this;
        }

        public Criteria andNetmaskLessThan(String value) {
            addCriterion("netmask <", value, "netmask");
            return (Criteria) this;
        }

        public Criteria andNetmaskLessThanOrEqualTo(String value) {
            addCriterion("netmask <=", value, "netmask");
            return (Criteria) this;
        }

        public Criteria andNetmaskLike(String value) {
            addCriterion("netmask like", value, "netmask");
            return (Criteria) this;
        }

        public Criteria andNetmaskNotLike(String value) {
            addCriterion("netmask not like", value, "netmask");
            return (Criteria) this;
        }

        public Criteria andNetmaskIn(List<String> values) {
            addCriterion("netmask in", values, "netmask");
            return (Criteria) this;
        }

        public Criteria andNetmaskNotIn(List<String> values) {
            addCriterion("netmask not in", values, "netmask");
            return (Criteria) this;
        }

        public Criteria andNetmaskBetween(String value1, String value2) {
            addCriterion("netmask between", value1, value2, "netmask");
            return (Criteria) this;
        }

        public Criteria andNetmaskNotBetween(String value1, String value2) {
            addCriterion("netmask not between", value1, value2, "netmask");
            return (Criteria) this;
        }

        public Criteria andAuthMethodIsNull() {
            addCriterion("auth_method is null");
            return (Criteria) this;
        }

        public Criteria andAuthMethodIsNotNull() {
            addCriterion("auth_method is not null");
            return (Criteria) this;
        }

        public Criteria andAuthMethodEqualTo(String value) {
            addCriterion("auth_method =", value, "authMethod");
            return (Criteria) this;
        }

        public Criteria andAuthMethodNotEqualTo(String value) {
            addCriterion("auth_method <>", value, "authMethod");
            return (Criteria) this;
        }

        public Criteria andAuthMethodGreaterThan(String value) {
            addCriterion("auth_method >", value, "authMethod");
            return (Criteria) this;
        }

        public Criteria andAuthMethodGreaterThanOrEqualTo(String value) {
            addCriterion("auth_method >=", value, "authMethod");
            return (Criteria) this;
        }

        public Criteria andAuthMethodLessThan(String value) {
            addCriterion("auth_method <", value, "authMethod");
            return (Criteria) this;
        }

        public Criteria andAuthMethodLessThanOrEqualTo(String value) {
            addCriterion("auth_method <=", value, "authMethod");
            return (Criteria) this;
        }

        public Criteria andAuthMethodLike(String value) {
            addCriterion("auth_method like", value, "authMethod");
            return (Criteria) this;
        }

        public Criteria andAuthMethodNotLike(String value) {
            addCriterion("auth_method not like", value, "authMethod");
            return (Criteria) this;
        }

        public Criteria andAuthMethodIn(List<String> values) {
            addCriterion("auth_method in", values, "authMethod");
            return (Criteria) this;
        }

        public Criteria andAuthMethodNotIn(List<String> values) {
            addCriterion("auth_method not in", values, "authMethod");
            return (Criteria) this;
        }

        public Criteria andAuthMethodBetween(String value1, String value2) {
            addCriterion("auth_method between", value1, value2, "authMethod");
            return (Criteria) this;
        }

        public Criteria andAuthMethodNotBetween(String value1, String value2) {
            addCriterion("auth_method not between", value1, value2, "authMethod");
            return (Criteria) this;
        }

        public Criteria andOptionsIsNull() {
            addCriterion("options is null");
            return (Criteria) this;
        }

        public Criteria andOptionsIsNotNull() {
            addCriterion("options is not null");
            return (Criteria) this;
        }

        public Criteria andOptionsEqualTo(Object value) {
            addCriterion("options =", value, "options");
            return (Criteria) this;
        }

        public Criteria andOptionsNotEqualTo(Object value) {
            addCriterion("options <>", value, "options");
            return (Criteria) this;
        }

        public Criteria andOptionsGreaterThan(Object value) {
            addCriterion("options >", value, "options");
            return (Criteria) this;
        }

        public Criteria andOptionsGreaterThanOrEqualTo(Object value) {
            addCriterion("options >=", value, "options");
            return (Criteria) this;
        }

        public Criteria andOptionsLessThan(Object value) {
            addCriterion("options <", value, "options");
            return (Criteria) this;
        }

        public Criteria andOptionsLessThanOrEqualTo(Object value) {
            addCriterion("options <=", value, "options");
            return (Criteria) this;
        }

        public Criteria andOptionsIn(List<Object> values) {
            addCriterion("options in", values, "options");
            return (Criteria) this;
        }

        public Criteria andOptionsNotIn(List<Object> values) {
            addCriterion("options not in", values, "options");
            return (Criteria) this;
        }

        public Criteria andOptionsBetween(Object value1, Object value2) {
            addCriterion("options between", value1, value2, "options");
            return (Criteria) this;
        }

        public Criteria andOptionsNotBetween(Object value1, Object value2) {
            addCriterion("options not between", value1, value2, "options");
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