package com.pool.readio.mbg.model;

import java.util.ArrayList;
import java.util.List;

public class PgUserMappingsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PgUserMappingsExample() {
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

        public Criteria andUmidIsNull() {
            addCriterion("umid is null");
            return (Criteria) this;
        }

        public Criteria andUmidIsNotNull() {
            addCriterion("umid is not null");
            return (Criteria) this;
        }

        public Criteria andUmidEqualTo(Long value) {
            addCriterion("umid =", value, "umid");
            return (Criteria) this;
        }

        public Criteria andUmidNotEqualTo(Long value) {
            addCriterion("umid <>", value, "umid");
            return (Criteria) this;
        }

        public Criteria andUmidGreaterThan(Long value) {
            addCriterion("umid >", value, "umid");
            return (Criteria) this;
        }

        public Criteria andUmidGreaterThanOrEqualTo(Long value) {
            addCriterion("umid >=", value, "umid");
            return (Criteria) this;
        }

        public Criteria andUmidLessThan(Long value) {
            addCriterion("umid <", value, "umid");
            return (Criteria) this;
        }

        public Criteria andUmidLessThanOrEqualTo(Long value) {
            addCriterion("umid <=", value, "umid");
            return (Criteria) this;
        }

        public Criteria andUmidIn(List<Long> values) {
            addCriterion("umid in", values, "umid");
            return (Criteria) this;
        }

        public Criteria andUmidNotIn(List<Long> values) {
            addCriterion("umid not in", values, "umid");
            return (Criteria) this;
        }

        public Criteria andUmidBetween(Long value1, Long value2) {
            addCriterion("umid between", value1, value2, "umid");
            return (Criteria) this;
        }

        public Criteria andUmidNotBetween(Long value1, Long value2) {
            addCriterion("umid not between", value1, value2, "umid");
            return (Criteria) this;
        }

        public Criteria andSrvidIsNull() {
            addCriterion("srvid is null");
            return (Criteria) this;
        }

        public Criteria andSrvidIsNotNull() {
            addCriterion("srvid is not null");
            return (Criteria) this;
        }

        public Criteria andSrvidEqualTo(Long value) {
            addCriterion("srvid =", value, "srvid");
            return (Criteria) this;
        }

        public Criteria andSrvidNotEqualTo(Long value) {
            addCriterion("srvid <>", value, "srvid");
            return (Criteria) this;
        }

        public Criteria andSrvidGreaterThan(Long value) {
            addCriterion("srvid >", value, "srvid");
            return (Criteria) this;
        }

        public Criteria andSrvidGreaterThanOrEqualTo(Long value) {
            addCriterion("srvid >=", value, "srvid");
            return (Criteria) this;
        }

        public Criteria andSrvidLessThan(Long value) {
            addCriterion("srvid <", value, "srvid");
            return (Criteria) this;
        }

        public Criteria andSrvidLessThanOrEqualTo(Long value) {
            addCriterion("srvid <=", value, "srvid");
            return (Criteria) this;
        }

        public Criteria andSrvidIn(List<Long> values) {
            addCriterion("srvid in", values, "srvid");
            return (Criteria) this;
        }

        public Criteria andSrvidNotIn(List<Long> values) {
            addCriterion("srvid not in", values, "srvid");
            return (Criteria) this;
        }

        public Criteria andSrvidBetween(Long value1, Long value2) {
            addCriterion("srvid between", value1, value2, "srvid");
            return (Criteria) this;
        }

        public Criteria andSrvidNotBetween(Long value1, Long value2) {
            addCriterion("srvid not between", value1, value2, "srvid");
            return (Criteria) this;
        }

        public Criteria andSrvnameIsNull() {
            addCriterion("srvname is null");
            return (Criteria) this;
        }

        public Criteria andSrvnameIsNotNull() {
            addCriterion("srvname is not null");
            return (Criteria) this;
        }

        public Criteria andSrvnameEqualTo(String value) {
            addCriterion("srvname =", value, "srvname");
            return (Criteria) this;
        }

        public Criteria andSrvnameNotEqualTo(String value) {
            addCriterion("srvname <>", value, "srvname");
            return (Criteria) this;
        }

        public Criteria andSrvnameGreaterThan(String value) {
            addCriterion("srvname >", value, "srvname");
            return (Criteria) this;
        }

        public Criteria andSrvnameGreaterThanOrEqualTo(String value) {
            addCriterion("srvname >=", value, "srvname");
            return (Criteria) this;
        }

        public Criteria andSrvnameLessThan(String value) {
            addCriterion("srvname <", value, "srvname");
            return (Criteria) this;
        }

        public Criteria andSrvnameLessThanOrEqualTo(String value) {
            addCriterion("srvname <=", value, "srvname");
            return (Criteria) this;
        }

        public Criteria andSrvnameLike(String value) {
            addCriterion("srvname like", value, "srvname");
            return (Criteria) this;
        }

        public Criteria andSrvnameNotLike(String value) {
            addCriterion("srvname not like", value, "srvname");
            return (Criteria) this;
        }

        public Criteria andSrvnameIn(List<String> values) {
            addCriterion("srvname in", values, "srvname");
            return (Criteria) this;
        }

        public Criteria andSrvnameNotIn(List<String> values) {
            addCriterion("srvname not in", values, "srvname");
            return (Criteria) this;
        }

        public Criteria andSrvnameBetween(String value1, String value2) {
            addCriterion("srvname between", value1, value2, "srvname");
            return (Criteria) this;
        }

        public Criteria andSrvnameNotBetween(String value1, String value2) {
            addCriterion("srvname not between", value1, value2, "srvname");
            return (Criteria) this;
        }

        public Criteria andUmuserIsNull() {
            addCriterion("umuser is null");
            return (Criteria) this;
        }

        public Criteria andUmuserIsNotNull() {
            addCriterion("umuser is not null");
            return (Criteria) this;
        }

        public Criteria andUmuserEqualTo(Long value) {
            addCriterion("umuser =", value, "umuser");
            return (Criteria) this;
        }

        public Criteria andUmuserNotEqualTo(Long value) {
            addCriterion("umuser <>", value, "umuser");
            return (Criteria) this;
        }

        public Criteria andUmuserGreaterThan(Long value) {
            addCriterion("umuser >", value, "umuser");
            return (Criteria) this;
        }

        public Criteria andUmuserGreaterThanOrEqualTo(Long value) {
            addCriterion("umuser >=", value, "umuser");
            return (Criteria) this;
        }

        public Criteria andUmuserLessThan(Long value) {
            addCriterion("umuser <", value, "umuser");
            return (Criteria) this;
        }

        public Criteria andUmuserLessThanOrEqualTo(Long value) {
            addCriterion("umuser <=", value, "umuser");
            return (Criteria) this;
        }

        public Criteria andUmuserIn(List<Long> values) {
            addCriterion("umuser in", values, "umuser");
            return (Criteria) this;
        }

        public Criteria andUmuserNotIn(List<Long> values) {
            addCriterion("umuser not in", values, "umuser");
            return (Criteria) this;
        }

        public Criteria andUmuserBetween(Long value1, Long value2) {
            addCriterion("umuser between", value1, value2, "umuser");
            return (Criteria) this;
        }

        public Criteria andUmuserNotBetween(Long value1, Long value2) {
            addCriterion("umuser not between", value1, value2, "umuser");
            return (Criteria) this;
        }

        public Criteria andUsenameIsNull() {
            addCriterion("usename is null");
            return (Criteria) this;
        }

        public Criteria andUsenameIsNotNull() {
            addCriterion("usename is not null");
            return (Criteria) this;
        }

        public Criteria andUsenameEqualTo(String value) {
            addCriterion("usename =", value, "usename");
            return (Criteria) this;
        }

        public Criteria andUsenameNotEqualTo(String value) {
            addCriterion("usename <>", value, "usename");
            return (Criteria) this;
        }

        public Criteria andUsenameGreaterThan(String value) {
            addCriterion("usename >", value, "usename");
            return (Criteria) this;
        }

        public Criteria andUsenameGreaterThanOrEqualTo(String value) {
            addCriterion("usename >=", value, "usename");
            return (Criteria) this;
        }

        public Criteria andUsenameLessThan(String value) {
            addCriterion("usename <", value, "usename");
            return (Criteria) this;
        }

        public Criteria andUsenameLessThanOrEqualTo(String value) {
            addCriterion("usename <=", value, "usename");
            return (Criteria) this;
        }

        public Criteria andUsenameLike(String value) {
            addCriterion("usename like", value, "usename");
            return (Criteria) this;
        }

        public Criteria andUsenameNotLike(String value) {
            addCriterion("usename not like", value, "usename");
            return (Criteria) this;
        }

        public Criteria andUsenameIn(List<String> values) {
            addCriterion("usename in", values, "usename");
            return (Criteria) this;
        }

        public Criteria andUsenameNotIn(List<String> values) {
            addCriterion("usename not in", values, "usename");
            return (Criteria) this;
        }

        public Criteria andUsenameBetween(String value1, String value2) {
            addCriterion("usename between", value1, value2, "usename");
            return (Criteria) this;
        }

        public Criteria andUsenameNotBetween(String value1, String value2) {
            addCriterion("usename not between", value1, value2, "usename");
            return (Criteria) this;
        }

        public Criteria andUmoptionsIsNull() {
            addCriterion("umoptions is null");
            return (Criteria) this;
        }

        public Criteria andUmoptionsIsNotNull() {
            addCriterion("umoptions is not null");
            return (Criteria) this;
        }

        public Criteria andUmoptionsEqualTo(Object value) {
            addCriterion("umoptions =", value, "umoptions");
            return (Criteria) this;
        }

        public Criteria andUmoptionsNotEqualTo(Object value) {
            addCriterion("umoptions <>", value, "umoptions");
            return (Criteria) this;
        }

        public Criteria andUmoptionsGreaterThan(Object value) {
            addCriterion("umoptions >", value, "umoptions");
            return (Criteria) this;
        }

        public Criteria andUmoptionsGreaterThanOrEqualTo(Object value) {
            addCriterion("umoptions >=", value, "umoptions");
            return (Criteria) this;
        }

        public Criteria andUmoptionsLessThan(Object value) {
            addCriterion("umoptions <", value, "umoptions");
            return (Criteria) this;
        }

        public Criteria andUmoptionsLessThanOrEqualTo(Object value) {
            addCriterion("umoptions <=", value, "umoptions");
            return (Criteria) this;
        }

        public Criteria andUmoptionsIn(List<Object> values) {
            addCriterion("umoptions in", values, "umoptions");
            return (Criteria) this;
        }

        public Criteria andUmoptionsNotIn(List<Object> values) {
            addCriterion("umoptions not in", values, "umoptions");
            return (Criteria) this;
        }

        public Criteria andUmoptionsBetween(Object value1, Object value2) {
            addCriterion("umoptions between", value1, value2, "umoptions");
            return (Criteria) this;
        }

        public Criteria andUmoptionsNotBetween(Object value1, Object value2) {
            addCriterion("umoptions not between", value1, value2, "umoptions");
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