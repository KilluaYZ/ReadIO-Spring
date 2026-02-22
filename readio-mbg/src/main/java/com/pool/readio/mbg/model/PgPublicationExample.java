package com.pool.readio.mbg.model;

import java.util.ArrayList;
import java.util.List;

public class PgPublicationExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PgPublicationExample() {
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

        public Criteria andPubnameIsNull() {
            addCriterion("pubname is null");
            return (Criteria) this;
        }

        public Criteria andPubnameIsNotNull() {
            addCriterion("pubname is not null");
            return (Criteria) this;
        }

        public Criteria andPubnameEqualTo(String value) {
            addCriterion("pubname =", value, "pubname");
            return (Criteria) this;
        }

        public Criteria andPubnameNotEqualTo(String value) {
            addCriterion("pubname <>", value, "pubname");
            return (Criteria) this;
        }

        public Criteria andPubnameGreaterThan(String value) {
            addCriterion("pubname >", value, "pubname");
            return (Criteria) this;
        }

        public Criteria andPubnameGreaterThanOrEqualTo(String value) {
            addCriterion("pubname >=", value, "pubname");
            return (Criteria) this;
        }

        public Criteria andPubnameLessThan(String value) {
            addCriterion("pubname <", value, "pubname");
            return (Criteria) this;
        }

        public Criteria andPubnameLessThanOrEqualTo(String value) {
            addCriterion("pubname <=", value, "pubname");
            return (Criteria) this;
        }

        public Criteria andPubnameLike(String value) {
            addCriterion("pubname like", value, "pubname");
            return (Criteria) this;
        }

        public Criteria andPubnameNotLike(String value) {
            addCriterion("pubname not like", value, "pubname");
            return (Criteria) this;
        }

        public Criteria andPubnameIn(List<String> values) {
            addCriterion("pubname in", values, "pubname");
            return (Criteria) this;
        }

        public Criteria andPubnameNotIn(List<String> values) {
            addCriterion("pubname not in", values, "pubname");
            return (Criteria) this;
        }

        public Criteria andPubnameBetween(String value1, String value2) {
            addCriterion("pubname between", value1, value2, "pubname");
            return (Criteria) this;
        }

        public Criteria andPubnameNotBetween(String value1, String value2) {
            addCriterion("pubname not between", value1, value2, "pubname");
            return (Criteria) this;
        }

        public Criteria andPubownerIsNull() {
            addCriterion("pubowner is null");
            return (Criteria) this;
        }

        public Criteria andPubownerIsNotNull() {
            addCriterion("pubowner is not null");
            return (Criteria) this;
        }

        public Criteria andPubownerEqualTo(Long value) {
            addCriterion("pubowner =", value, "pubowner");
            return (Criteria) this;
        }

        public Criteria andPubownerNotEqualTo(Long value) {
            addCriterion("pubowner <>", value, "pubowner");
            return (Criteria) this;
        }

        public Criteria andPubownerGreaterThan(Long value) {
            addCriterion("pubowner >", value, "pubowner");
            return (Criteria) this;
        }

        public Criteria andPubownerGreaterThanOrEqualTo(Long value) {
            addCriterion("pubowner >=", value, "pubowner");
            return (Criteria) this;
        }

        public Criteria andPubownerLessThan(Long value) {
            addCriterion("pubowner <", value, "pubowner");
            return (Criteria) this;
        }

        public Criteria andPubownerLessThanOrEqualTo(Long value) {
            addCriterion("pubowner <=", value, "pubowner");
            return (Criteria) this;
        }

        public Criteria andPubownerIn(List<Long> values) {
            addCriterion("pubowner in", values, "pubowner");
            return (Criteria) this;
        }

        public Criteria andPubownerNotIn(List<Long> values) {
            addCriterion("pubowner not in", values, "pubowner");
            return (Criteria) this;
        }

        public Criteria andPubownerBetween(Long value1, Long value2) {
            addCriterion("pubowner between", value1, value2, "pubowner");
            return (Criteria) this;
        }

        public Criteria andPubownerNotBetween(Long value1, Long value2) {
            addCriterion("pubowner not between", value1, value2, "pubowner");
            return (Criteria) this;
        }

        public Criteria andPuballtablesIsNull() {
            addCriterion("puballtables is null");
            return (Criteria) this;
        }

        public Criteria andPuballtablesIsNotNull() {
            addCriterion("puballtables is not null");
            return (Criteria) this;
        }

        public Criteria andPuballtablesEqualTo(Boolean value) {
            addCriterion("puballtables =", value, "puballtables");
            return (Criteria) this;
        }

        public Criteria andPuballtablesNotEqualTo(Boolean value) {
            addCriterion("puballtables <>", value, "puballtables");
            return (Criteria) this;
        }

        public Criteria andPuballtablesGreaterThan(Boolean value) {
            addCriterion("puballtables >", value, "puballtables");
            return (Criteria) this;
        }

        public Criteria andPuballtablesGreaterThanOrEqualTo(Boolean value) {
            addCriterion("puballtables >=", value, "puballtables");
            return (Criteria) this;
        }

        public Criteria andPuballtablesLessThan(Boolean value) {
            addCriterion("puballtables <", value, "puballtables");
            return (Criteria) this;
        }

        public Criteria andPuballtablesLessThanOrEqualTo(Boolean value) {
            addCriterion("puballtables <=", value, "puballtables");
            return (Criteria) this;
        }

        public Criteria andPuballtablesIn(List<Boolean> values) {
            addCriterion("puballtables in", values, "puballtables");
            return (Criteria) this;
        }

        public Criteria andPuballtablesNotIn(List<Boolean> values) {
            addCriterion("puballtables not in", values, "puballtables");
            return (Criteria) this;
        }

        public Criteria andPuballtablesBetween(Boolean value1, Boolean value2) {
            addCriterion("puballtables between", value1, value2, "puballtables");
            return (Criteria) this;
        }

        public Criteria andPuballtablesNotBetween(Boolean value1, Boolean value2) {
            addCriterion("puballtables not between", value1, value2, "puballtables");
            return (Criteria) this;
        }

        public Criteria andPubinsertIsNull() {
            addCriterion("pubinsert is null");
            return (Criteria) this;
        }

        public Criteria andPubinsertIsNotNull() {
            addCriterion("pubinsert is not null");
            return (Criteria) this;
        }

        public Criteria andPubinsertEqualTo(Boolean value) {
            addCriterion("pubinsert =", value, "pubinsert");
            return (Criteria) this;
        }

        public Criteria andPubinsertNotEqualTo(Boolean value) {
            addCriterion("pubinsert <>", value, "pubinsert");
            return (Criteria) this;
        }

        public Criteria andPubinsertGreaterThan(Boolean value) {
            addCriterion("pubinsert >", value, "pubinsert");
            return (Criteria) this;
        }

        public Criteria andPubinsertGreaterThanOrEqualTo(Boolean value) {
            addCriterion("pubinsert >=", value, "pubinsert");
            return (Criteria) this;
        }

        public Criteria andPubinsertLessThan(Boolean value) {
            addCriterion("pubinsert <", value, "pubinsert");
            return (Criteria) this;
        }

        public Criteria andPubinsertLessThanOrEqualTo(Boolean value) {
            addCriterion("pubinsert <=", value, "pubinsert");
            return (Criteria) this;
        }

        public Criteria andPubinsertIn(List<Boolean> values) {
            addCriterion("pubinsert in", values, "pubinsert");
            return (Criteria) this;
        }

        public Criteria andPubinsertNotIn(List<Boolean> values) {
            addCriterion("pubinsert not in", values, "pubinsert");
            return (Criteria) this;
        }

        public Criteria andPubinsertBetween(Boolean value1, Boolean value2) {
            addCriterion("pubinsert between", value1, value2, "pubinsert");
            return (Criteria) this;
        }

        public Criteria andPubinsertNotBetween(Boolean value1, Boolean value2) {
            addCriterion("pubinsert not between", value1, value2, "pubinsert");
            return (Criteria) this;
        }

        public Criteria andPubupdateIsNull() {
            addCriterion("pubupdate is null");
            return (Criteria) this;
        }

        public Criteria andPubupdateIsNotNull() {
            addCriterion("pubupdate is not null");
            return (Criteria) this;
        }

        public Criteria andPubupdateEqualTo(Boolean value) {
            addCriterion("pubupdate =", value, "pubupdate");
            return (Criteria) this;
        }

        public Criteria andPubupdateNotEqualTo(Boolean value) {
            addCriterion("pubupdate <>", value, "pubupdate");
            return (Criteria) this;
        }

        public Criteria andPubupdateGreaterThan(Boolean value) {
            addCriterion("pubupdate >", value, "pubupdate");
            return (Criteria) this;
        }

        public Criteria andPubupdateGreaterThanOrEqualTo(Boolean value) {
            addCriterion("pubupdate >=", value, "pubupdate");
            return (Criteria) this;
        }

        public Criteria andPubupdateLessThan(Boolean value) {
            addCriterion("pubupdate <", value, "pubupdate");
            return (Criteria) this;
        }

        public Criteria andPubupdateLessThanOrEqualTo(Boolean value) {
            addCriterion("pubupdate <=", value, "pubupdate");
            return (Criteria) this;
        }

        public Criteria andPubupdateIn(List<Boolean> values) {
            addCriterion("pubupdate in", values, "pubupdate");
            return (Criteria) this;
        }

        public Criteria andPubupdateNotIn(List<Boolean> values) {
            addCriterion("pubupdate not in", values, "pubupdate");
            return (Criteria) this;
        }

        public Criteria andPubupdateBetween(Boolean value1, Boolean value2) {
            addCriterion("pubupdate between", value1, value2, "pubupdate");
            return (Criteria) this;
        }

        public Criteria andPubupdateNotBetween(Boolean value1, Boolean value2) {
            addCriterion("pubupdate not between", value1, value2, "pubupdate");
            return (Criteria) this;
        }

        public Criteria andPubdeleteIsNull() {
            addCriterion("pubdelete is null");
            return (Criteria) this;
        }

        public Criteria andPubdeleteIsNotNull() {
            addCriterion("pubdelete is not null");
            return (Criteria) this;
        }

        public Criteria andPubdeleteEqualTo(Boolean value) {
            addCriterion("pubdelete =", value, "pubdelete");
            return (Criteria) this;
        }

        public Criteria andPubdeleteNotEqualTo(Boolean value) {
            addCriterion("pubdelete <>", value, "pubdelete");
            return (Criteria) this;
        }

        public Criteria andPubdeleteGreaterThan(Boolean value) {
            addCriterion("pubdelete >", value, "pubdelete");
            return (Criteria) this;
        }

        public Criteria andPubdeleteGreaterThanOrEqualTo(Boolean value) {
            addCriterion("pubdelete >=", value, "pubdelete");
            return (Criteria) this;
        }

        public Criteria andPubdeleteLessThan(Boolean value) {
            addCriterion("pubdelete <", value, "pubdelete");
            return (Criteria) this;
        }

        public Criteria andPubdeleteLessThanOrEqualTo(Boolean value) {
            addCriterion("pubdelete <=", value, "pubdelete");
            return (Criteria) this;
        }

        public Criteria andPubdeleteIn(List<Boolean> values) {
            addCriterion("pubdelete in", values, "pubdelete");
            return (Criteria) this;
        }

        public Criteria andPubdeleteNotIn(List<Boolean> values) {
            addCriterion("pubdelete not in", values, "pubdelete");
            return (Criteria) this;
        }

        public Criteria andPubdeleteBetween(Boolean value1, Boolean value2) {
            addCriterion("pubdelete between", value1, value2, "pubdelete");
            return (Criteria) this;
        }

        public Criteria andPubdeleteNotBetween(Boolean value1, Boolean value2) {
            addCriterion("pubdelete not between", value1, value2, "pubdelete");
            return (Criteria) this;
        }

        public Criteria andPubtruncateIsNull() {
            addCriterion("pubtruncate is null");
            return (Criteria) this;
        }

        public Criteria andPubtruncateIsNotNull() {
            addCriterion("pubtruncate is not null");
            return (Criteria) this;
        }

        public Criteria andPubtruncateEqualTo(Boolean value) {
            addCriterion("pubtruncate =", value, "pubtruncate");
            return (Criteria) this;
        }

        public Criteria andPubtruncateNotEqualTo(Boolean value) {
            addCriterion("pubtruncate <>", value, "pubtruncate");
            return (Criteria) this;
        }

        public Criteria andPubtruncateGreaterThan(Boolean value) {
            addCriterion("pubtruncate >", value, "pubtruncate");
            return (Criteria) this;
        }

        public Criteria andPubtruncateGreaterThanOrEqualTo(Boolean value) {
            addCriterion("pubtruncate >=", value, "pubtruncate");
            return (Criteria) this;
        }

        public Criteria andPubtruncateLessThan(Boolean value) {
            addCriterion("pubtruncate <", value, "pubtruncate");
            return (Criteria) this;
        }

        public Criteria andPubtruncateLessThanOrEqualTo(Boolean value) {
            addCriterion("pubtruncate <=", value, "pubtruncate");
            return (Criteria) this;
        }

        public Criteria andPubtruncateIn(List<Boolean> values) {
            addCriterion("pubtruncate in", values, "pubtruncate");
            return (Criteria) this;
        }

        public Criteria andPubtruncateNotIn(List<Boolean> values) {
            addCriterion("pubtruncate not in", values, "pubtruncate");
            return (Criteria) this;
        }

        public Criteria andPubtruncateBetween(Boolean value1, Boolean value2) {
            addCriterion("pubtruncate between", value1, value2, "pubtruncate");
            return (Criteria) this;
        }

        public Criteria andPubtruncateNotBetween(Boolean value1, Boolean value2) {
            addCriterion("pubtruncate not between", value1, value2, "pubtruncate");
            return (Criteria) this;
        }

        public Criteria andPubviarootIsNull() {
            addCriterion("pubviaroot is null");
            return (Criteria) this;
        }

        public Criteria andPubviarootIsNotNull() {
            addCriterion("pubviaroot is not null");
            return (Criteria) this;
        }

        public Criteria andPubviarootEqualTo(Boolean value) {
            addCriterion("pubviaroot =", value, "pubviaroot");
            return (Criteria) this;
        }

        public Criteria andPubviarootNotEqualTo(Boolean value) {
            addCriterion("pubviaroot <>", value, "pubviaroot");
            return (Criteria) this;
        }

        public Criteria andPubviarootGreaterThan(Boolean value) {
            addCriterion("pubviaroot >", value, "pubviaroot");
            return (Criteria) this;
        }

        public Criteria andPubviarootGreaterThanOrEqualTo(Boolean value) {
            addCriterion("pubviaroot >=", value, "pubviaroot");
            return (Criteria) this;
        }

        public Criteria andPubviarootLessThan(Boolean value) {
            addCriterion("pubviaroot <", value, "pubviaroot");
            return (Criteria) this;
        }

        public Criteria andPubviarootLessThanOrEqualTo(Boolean value) {
            addCriterion("pubviaroot <=", value, "pubviaroot");
            return (Criteria) this;
        }

        public Criteria andPubviarootIn(List<Boolean> values) {
            addCriterion("pubviaroot in", values, "pubviaroot");
            return (Criteria) this;
        }

        public Criteria andPubviarootNotIn(List<Boolean> values) {
            addCriterion("pubviaroot not in", values, "pubviaroot");
            return (Criteria) this;
        }

        public Criteria andPubviarootBetween(Boolean value1, Boolean value2) {
            addCriterion("pubviaroot between", value1, value2, "pubviaroot");
            return (Criteria) this;
        }

        public Criteria andPubviarootNotBetween(Boolean value1, Boolean value2) {
            addCriterion("pubviaroot not between", value1, value2, "pubviaroot");
            return (Criteria) this;
        }

        public Criteria andPubgencolsIsNull() {
            addCriterion("pubgencols is null");
            return (Criteria) this;
        }

        public Criteria andPubgencolsIsNotNull() {
            addCriterion("pubgencols is not null");
            return (Criteria) this;
        }

        public Criteria andPubgencolsEqualTo(String value) {
            addCriterion("pubgencols =", value, "pubgencols");
            return (Criteria) this;
        }

        public Criteria andPubgencolsNotEqualTo(String value) {
            addCriterion("pubgencols <>", value, "pubgencols");
            return (Criteria) this;
        }

        public Criteria andPubgencolsGreaterThan(String value) {
            addCriterion("pubgencols >", value, "pubgencols");
            return (Criteria) this;
        }

        public Criteria andPubgencolsGreaterThanOrEqualTo(String value) {
            addCriterion("pubgencols >=", value, "pubgencols");
            return (Criteria) this;
        }

        public Criteria andPubgencolsLessThan(String value) {
            addCriterion("pubgencols <", value, "pubgencols");
            return (Criteria) this;
        }

        public Criteria andPubgencolsLessThanOrEqualTo(String value) {
            addCriterion("pubgencols <=", value, "pubgencols");
            return (Criteria) this;
        }

        public Criteria andPubgencolsLike(String value) {
            addCriterion("pubgencols like", value, "pubgencols");
            return (Criteria) this;
        }

        public Criteria andPubgencolsNotLike(String value) {
            addCriterion("pubgencols not like", value, "pubgencols");
            return (Criteria) this;
        }

        public Criteria andPubgencolsIn(List<String> values) {
            addCriterion("pubgencols in", values, "pubgencols");
            return (Criteria) this;
        }

        public Criteria andPubgencolsNotIn(List<String> values) {
            addCriterion("pubgencols not in", values, "pubgencols");
            return (Criteria) this;
        }

        public Criteria andPubgencolsBetween(String value1, String value2) {
            addCriterion("pubgencols between", value1, value2, "pubgencols");
            return (Criteria) this;
        }

        public Criteria andPubgencolsNotBetween(String value1, String value2) {
            addCriterion("pubgencols not between", value1, value2, "pubgencols");
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