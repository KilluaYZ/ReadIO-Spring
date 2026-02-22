package com.pool.readio.mbg.model;

import java.util.ArrayList;
import java.util.List;

public class PgSubscriptionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PgSubscriptionExample() {
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

        public Criteria andSubdbidIsNull() {
            addCriterion("subdbid is null");
            return (Criteria) this;
        }

        public Criteria andSubdbidIsNotNull() {
            addCriterion("subdbid is not null");
            return (Criteria) this;
        }

        public Criteria andSubdbidEqualTo(Long value) {
            addCriterion("subdbid =", value, "subdbid");
            return (Criteria) this;
        }

        public Criteria andSubdbidNotEqualTo(Long value) {
            addCriterion("subdbid <>", value, "subdbid");
            return (Criteria) this;
        }

        public Criteria andSubdbidGreaterThan(Long value) {
            addCriterion("subdbid >", value, "subdbid");
            return (Criteria) this;
        }

        public Criteria andSubdbidGreaterThanOrEqualTo(Long value) {
            addCriterion("subdbid >=", value, "subdbid");
            return (Criteria) this;
        }

        public Criteria andSubdbidLessThan(Long value) {
            addCriterion("subdbid <", value, "subdbid");
            return (Criteria) this;
        }

        public Criteria andSubdbidLessThanOrEqualTo(Long value) {
            addCriterion("subdbid <=", value, "subdbid");
            return (Criteria) this;
        }

        public Criteria andSubdbidIn(List<Long> values) {
            addCriterion("subdbid in", values, "subdbid");
            return (Criteria) this;
        }

        public Criteria andSubdbidNotIn(List<Long> values) {
            addCriterion("subdbid not in", values, "subdbid");
            return (Criteria) this;
        }

        public Criteria andSubdbidBetween(Long value1, Long value2) {
            addCriterion("subdbid between", value1, value2, "subdbid");
            return (Criteria) this;
        }

        public Criteria andSubdbidNotBetween(Long value1, Long value2) {
            addCriterion("subdbid not between", value1, value2, "subdbid");
            return (Criteria) this;
        }

        public Criteria andSubskiplsnIsNull() {
            addCriterion("subskiplsn is null");
            return (Criteria) this;
        }

        public Criteria andSubskiplsnIsNotNull() {
            addCriterion("subskiplsn is not null");
            return (Criteria) this;
        }

        public Criteria andSubskiplsnEqualTo(Object value) {
            addCriterion("subskiplsn =", value, "subskiplsn");
            return (Criteria) this;
        }

        public Criteria andSubskiplsnNotEqualTo(Object value) {
            addCriterion("subskiplsn <>", value, "subskiplsn");
            return (Criteria) this;
        }

        public Criteria andSubskiplsnGreaterThan(Object value) {
            addCriterion("subskiplsn >", value, "subskiplsn");
            return (Criteria) this;
        }

        public Criteria andSubskiplsnGreaterThanOrEqualTo(Object value) {
            addCriterion("subskiplsn >=", value, "subskiplsn");
            return (Criteria) this;
        }

        public Criteria andSubskiplsnLessThan(Object value) {
            addCriterion("subskiplsn <", value, "subskiplsn");
            return (Criteria) this;
        }

        public Criteria andSubskiplsnLessThanOrEqualTo(Object value) {
            addCriterion("subskiplsn <=", value, "subskiplsn");
            return (Criteria) this;
        }

        public Criteria andSubskiplsnIn(List<Object> values) {
            addCriterion("subskiplsn in", values, "subskiplsn");
            return (Criteria) this;
        }

        public Criteria andSubskiplsnNotIn(List<Object> values) {
            addCriterion("subskiplsn not in", values, "subskiplsn");
            return (Criteria) this;
        }

        public Criteria andSubskiplsnBetween(Object value1, Object value2) {
            addCriterion("subskiplsn between", value1, value2, "subskiplsn");
            return (Criteria) this;
        }

        public Criteria andSubskiplsnNotBetween(Object value1, Object value2) {
            addCriterion("subskiplsn not between", value1, value2, "subskiplsn");
            return (Criteria) this;
        }

        public Criteria andSubnameIsNull() {
            addCriterion("subname is null");
            return (Criteria) this;
        }

        public Criteria andSubnameIsNotNull() {
            addCriterion("subname is not null");
            return (Criteria) this;
        }

        public Criteria andSubnameEqualTo(String value) {
            addCriterion("subname =", value, "subname");
            return (Criteria) this;
        }

        public Criteria andSubnameNotEqualTo(String value) {
            addCriterion("subname <>", value, "subname");
            return (Criteria) this;
        }

        public Criteria andSubnameGreaterThan(String value) {
            addCriterion("subname >", value, "subname");
            return (Criteria) this;
        }

        public Criteria andSubnameGreaterThanOrEqualTo(String value) {
            addCriterion("subname >=", value, "subname");
            return (Criteria) this;
        }

        public Criteria andSubnameLessThan(String value) {
            addCriterion("subname <", value, "subname");
            return (Criteria) this;
        }

        public Criteria andSubnameLessThanOrEqualTo(String value) {
            addCriterion("subname <=", value, "subname");
            return (Criteria) this;
        }

        public Criteria andSubnameLike(String value) {
            addCriterion("subname like", value, "subname");
            return (Criteria) this;
        }

        public Criteria andSubnameNotLike(String value) {
            addCriterion("subname not like", value, "subname");
            return (Criteria) this;
        }

        public Criteria andSubnameIn(List<String> values) {
            addCriterion("subname in", values, "subname");
            return (Criteria) this;
        }

        public Criteria andSubnameNotIn(List<String> values) {
            addCriterion("subname not in", values, "subname");
            return (Criteria) this;
        }

        public Criteria andSubnameBetween(String value1, String value2) {
            addCriterion("subname between", value1, value2, "subname");
            return (Criteria) this;
        }

        public Criteria andSubnameNotBetween(String value1, String value2) {
            addCriterion("subname not between", value1, value2, "subname");
            return (Criteria) this;
        }

        public Criteria andSubownerIsNull() {
            addCriterion("subowner is null");
            return (Criteria) this;
        }

        public Criteria andSubownerIsNotNull() {
            addCriterion("subowner is not null");
            return (Criteria) this;
        }

        public Criteria andSubownerEqualTo(Long value) {
            addCriterion("subowner =", value, "subowner");
            return (Criteria) this;
        }

        public Criteria andSubownerNotEqualTo(Long value) {
            addCriterion("subowner <>", value, "subowner");
            return (Criteria) this;
        }

        public Criteria andSubownerGreaterThan(Long value) {
            addCriterion("subowner >", value, "subowner");
            return (Criteria) this;
        }

        public Criteria andSubownerGreaterThanOrEqualTo(Long value) {
            addCriterion("subowner >=", value, "subowner");
            return (Criteria) this;
        }

        public Criteria andSubownerLessThan(Long value) {
            addCriterion("subowner <", value, "subowner");
            return (Criteria) this;
        }

        public Criteria andSubownerLessThanOrEqualTo(Long value) {
            addCriterion("subowner <=", value, "subowner");
            return (Criteria) this;
        }

        public Criteria andSubownerIn(List<Long> values) {
            addCriterion("subowner in", values, "subowner");
            return (Criteria) this;
        }

        public Criteria andSubownerNotIn(List<Long> values) {
            addCriterion("subowner not in", values, "subowner");
            return (Criteria) this;
        }

        public Criteria andSubownerBetween(Long value1, Long value2) {
            addCriterion("subowner between", value1, value2, "subowner");
            return (Criteria) this;
        }

        public Criteria andSubownerNotBetween(Long value1, Long value2) {
            addCriterion("subowner not between", value1, value2, "subowner");
            return (Criteria) this;
        }

        public Criteria andSubenabledIsNull() {
            addCriterion("subenabled is null");
            return (Criteria) this;
        }

        public Criteria andSubenabledIsNotNull() {
            addCriterion("subenabled is not null");
            return (Criteria) this;
        }

        public Criteria andSubenabledEqualTo(Boolean value) {
            addCriterion("subenabled =", value, "subenabled");
            return (Criteria) this;
        }

        public Criteria andSubenabledNotEqualTo(Boolean value) {
            addCriterion("subenabled <>", value, "subenabled");
            return (Criteria) this;
        }

        public Criteria andSubenabledGreaterThan(Boolean value) {
            addCriterion("subenabled >", value, "subenabled");
            return (Criteria) this;
        }

        public Criteria andSubenabledGreaterThanOrEqualTo(Boolean value) {
            addCriterion("subenabled >=", value, "subenabled");
            return (Criteria) this;
        }

        public Criteria andSubenabledLessThan(Boolean value) {
            addCriterion("subenabled <", value, "subenabled");
            return (Criteria) this;
        }

        public Criteria andSubenabledLessThanOrEqualTo(Boolean value) {
            addCriterion("subenabled <=", value, "subenabled");
            return (Criteria) this;
        }

        public Criteria andSubenabledIn(List<Boolean> values) {
            addCriterion("subenabled in", values, "subenabled");
            return (Criteria) this;
        }

        public Criteria andSubenabledNotIn(List<Boolean> values) {
            addCriterion("subenabled not in", values, "subenabled");
            return (Criteria) this;
        }

        public Criteria andSubenabledBetween(Boolean value1, Boolean value2) {
            addCriterion("subenabled between", value1, value2, "subenabled");
            return (Criteria) this;
        }

        public Criteria andSubenabledNotBetween(Boolean value1, Boolean value2) {
            addCriterion("subenabled not between", value1, value2, "subenabled");
            return (Criteria) this;
        }

        public Criteria andSubbinaryIsNull() {
            addCriterion("subbinary is null");
            return (Criteria) this;
        }

        public Criteria andSubbinaryIsNotNull() {
            addCriterion("subbinary is not null");
            return (Criteria) this;
        }

        public Criteria andSubbinaryEqualTo(Boolean value) {
            addCriterion("subbinary =", value, "subbinary");
            return (Criteria) this;
        }

        public Criteria andSubbinaryNotEqualTo(Boolean value) {
            addCriterion("subbinary <>", value, "subbinary");
            return (Criteria) this;
        }

        public Criteria andSubbinaryGreaterThan(Boolean value) {
            addCriterion("subbinary >", value, "subbinary");
            return (Criteria) this;
        }

        public Criteria andSubbinaryGreaterThanOrEqualTo(Boolean value) {
            addCriterion("subbinary >=", value, "subbinary");
            return (Criteria) this;
        }

        public Criteria andSubbinaryLessThan(Boolean value) {
            addCriterion("subbinary <", value, "subbinary");
            return (Criteria) this;
        }

        public Criteria andSubbinaryLessThanOrEqualTo(Boolean value) {
            addCriterion("subbinary <=", value, "subbinary");
            return (Criteria) this;
        }

        public Criteria andSubbinaryIn(List<Boolean> values) {
            addCriterion("subbinary in", values, "subbinary");
            return (Criteria) this;
        }

        public Criteria andSubbinaryNotIn(List<Boolean> values) {
            addCriterion("subbinary not in", values, "subbinary");
            return (Criteria) this;
        }

        public Criteria andSubbinaryBetween(Boolean value1, Boolean value2) {
            addCriterion("subbinary between", value1, value2, "subbinary");
            return (Criteria) this;
        }

        public Criteria andSubbinaryNotBetween(Boolean value1, Boolean value2) {
            addCriterion("subbinary not between", value1, value2, "subbinary");
            return (Criteria) this;
        }

        public Criteria andSubstreamIsNull() {
            addCriterion("substream is null");
            return (Criteria) this;
        }

        public Criteria andSubstreamIsNotNull() {
            addCriterion("substream is not null");
            return (Criteria) this;
        }

        public Criteria andSubstreamEqualTo(String value) {
            addCriterion("substream =", value, "substream");
            return (Criteria) this;
        }

        public Criteria andSubstreamNotEqualTo(String value) {
            addCriterion("substream <>", value, "substream");
            return (Criteria) this;
        }

        public Criteria andSubstreamGreaterThan(String value) {
            addCriterion("substream >", value, "substream");
            return (Criteria) this;
        }

        public Criteria andSubstreamGreaterThanOrEqualTo(String value) {
            addCriterion("substream >=", value, "substream");
            return (Criteria) this;
        }

        public Criteria andSubstreamLessThan(String value) {
            addCriterion("substream <", value, "substream");
            return (Criteria) this;
        }

        public Criteria andSubstreamLessThanOrEqualTo(String value) {
            addCriterion("substream <=", value, "substream");
            return (Criteria) this;
        }

        public Criteria andSubstreamLike(String value) {
            addCriterion("substream like", value, "substream");
            return (Criteria) this;
        }

        public Criteria andSubstreamNotLike(String value) {
            addCriterion("substream not like", value, "substream");
            return (Criteria) this;
        }

        public Criteria andSubstreamIn(List<String> values) {
            addCriterion("substream in", values, "substream");
            return (Criteria) this;
        }

        public Criteria andSubstreamNotIn(List<String> values) {
            addCriterion("substream not in", values, "substream");
            return (Criteria) this;
        }

        public Criteria andSubstreamBetween(String value1, String value2) {
            addCriterion("substream between", value1, value2, "substream");
            return (Criteria) this;
        }

        public Criteria andSubstreamNotBetween(String value1, String value2) {
            addCriterion("substream not between", value1, value2, "substream");
            return (Criteria) this;
        }

        public Criteria andSubtwophasestateIsNull() {
            addCriterion("subtwophasestate is null");
            return (Criteria) this;
        }

        public Criteria andSubtwophasestateIsNotNull() {
            addCriterion("subtwophasestate is not null");
            return (Criteria) this;
        }

        public Criteria andSubtwophasestateEqualTo(String value) {
            addCriterion("subtwophasestate =", value, "subtwophasestate");
            return (Criteria) this;
        }

        public Criteria andSubtwophasestateNotEqualTo(String value) {
            addCriterion("subtwophasestate <>", value, "subtwophasestate");
            return (Criteria) this;
        }

        public Criteria andSubtwophasestateGreaterThan(String value) {
            addCriterion("subtwophasestate >", value, "subtwophasestate");
            return (Criteria) this;
        }

        public Criteria andSubtwophasestateGreaterThanOrEqualTo(String value) {
            addCriterion("subtwophasestate >=", value, "subtwophasestate");
            return (Criteria) this;
        }

        public Criteria andSubtwophasestateLessThan(String value) {
            addCriterion("subtwophasestate <", value, "subtwophasestate");
            return (Criteria) this;
        }

        public Criteria andSubtwophasestateLessThanOrEqualTo(String value) {
            addCriterion("subtwophasestate <=", value, "subtwophasestate");
            return (Criteria) this;
        }

        public Criteria andSubtwophasestateLike(String value) {
            addCriterion("subtwophasestate like", value, "subtwophasestate");
            return (Criteria) this;
        }

        public Criteria andSubtwophasestateNotLike(String value) {
            addCriterion("subtwophasestate not like", value, "subtwophasestate");
            return (Criteria) this;
        }

        public Criteria andSubtwophasestateIn(List<String> values) {
            addCriterion("subtwophasestate in", values, "subtwophasestate");
            return (Criteria) this;
        }

        public Criteria andSubtwophasestateNotIn(List<String> values) {
            addCriterion("subtwophasestate not in", values, "subtwophasestate");
            return (Criteria) this;
        }

        public Criteria andSubtwophasestateBetween(String value1, String value2) {
            addCriterion("subtwophasestate between", value1, value2, "subtwophasestate");
            return (Criteria) this;
        }

        public Criteria andSubtwophasestateNotBetween(String value1, String value2) {
            addCriterion("subtwophasestate not between", value1, value2, "subtwophasestate");
            return (Criteria) this;
        }

        public Criteria andSubdisableonerrIsNull() {
            addCriterion("subdisableonerr is null");
            return (Criteria) this;
        }

        public Criteria andSubdisableonerrIsNotNull() {
            addCriterion("subdisableonerr is not null");
            return (Criteria) this;
        }

        public Criteria andSubdisableonerrEqualTo(Boolean value) {
            addCriterion("subdisableonerr =", value, "subdisableonerr");
            return (Criteria) this;
        }

        public Criteria andSubdisableonerrNotEqualTo(Boolean value) {
            addCriterion("subdisableonerr <>", value, "subdisableonerr");
            return (Criteria) this;
        }

        public Criteria andSubdisableonerrGreaterThan(Boolean value) {
            addCriterion("subdisableonerr >", value, "subdisableonerr");
            return (Criteria) this;
        }

        public Criteria andSubdisableonerrGreaterThanOrEqualTo(Boolean value) {
            addCriterion("subdisableonerr >=", value, "subdisableonerr");
            return (Criteria) this;
        }

        public Criteria andSubdisableonerrLessThan(Boolean value) {
            addCriterion("subdisableonerr <", value, "subdisableonerr");
            return (Criteria) this;
        }

        public Criteria andSubdisableonerrLessThanOrEqualTo(Boolean value) {
            addCriterion("subdisableonerr <=", value, "subdisableonerr");
            return (Criteria) this;
        }

        public Criteria andSubdisableonerrIn(List<Boolean> values) {
            addCriterion("subdisableonerr in", values, "subdisableonerr");
            return (Criteria) this;
        }

        public Criteria andSubdisableonerrNotIn(List<Boolean> values) {
            addCriterion("subdisableonerr not in", values, "subdisableonerr");
            return (Criteria) this;
        }

        public Criteria andSubdisableonerrBetween(Boolean value1, Boolean value2) {
            addCriterion("subdisableonerr between", value1, value2, "subdisableonerr");
            return (Criteria) this;
        }

        public Criteria andSubdisableonerrNotBetween(Boolean value1, Boolean value2) {
            addCriterion("subdisableonerr not between", value1, value2, "subdisableonerr");
            return (Criteria) this;
        }

        public Criteria andSubpasswordrequiredIsNull() {
            addCriterion("subpasswordrequired is null");
            return (Criteria) this;
        }

        public Criteria andSubpasswordrequiredIsNotNull() {
            addCriterion("subpasswordrequired is not null");
            return (Criteria) this;
        }

        public Criteria andSubpasswordrequiredEqualTo(Boolean value) {
            addCriterion("subpasswordrequired =", value, "subpasswordrequired");
            return (Criteria) this;
        }

        public Criteria andSubpasswordrequiredNotEqualTo(Boolean value) {
            addCriterion("subpasswordrequired <>", value, "subpasswordrequired");
            return (Criteria) this;
        }

        public Criteria andSubpasswordrequiredGreaterThan(Boolean value) {
            addCriterion("subpasswordrequired >", value, "subpasswordrequired");
            return (Criteria) this;
        }

        public Criteria andSubpasswordrequiredGreaterThanOrEqualTo(Boolean value) {
            addCriterion("subpasswordrequired >=", value, "subpasswordrequired");
            return (Criteria) this;
        }

        public Criteria andSubpasswordrequiredLessThan(Boolean value) {
            addCriterion("subpasswordrequired <", value, "subpasswordrequired");
            return (Criteria) this;
        }

        public Criteria andSubpasswordrequiredLessThanOrEqualTo(Boolean value) {
            addCriterion("subpasswordrequired <=", value, "subpasswordrequired");
            return (Criteria) this;
        }

        public Criteria andSubpasswordrequiredIn(List<Boolean> values) {
            addCriterion("subpasswordrequired in", values, "subpasswordrequired");
            return (Criteria) this;
        }

        public Criteria andSubpasswordrequiredNotIn(List<Boolean> values) {
            addCriterion("subpasswordrequired not in", values, "subpasswordrequired");
            return (Criteria) this;
        }

        public Criteria andSubpasswordrequiredBetween(Boolean value1, Boolean value2) {
            addCriterion("subpasswordrequired between", value1, value2, "subpasswordrequired");
            return (Criteria) this;
        }

        public Criteria andSubpasswordrequiredNotBetween(Boolean value1, Boolean value2) {
            addCriterion("subpasswordrequired not between", value1, value2, "subpasswordrequired");
            return (Criteria) this;
        }

        public Criteria andSubrunasownerIsNull() {
            addCriterion("subrunasowner is null");
            return (Criteria) this;
        }

        public Criteria andSubrunasownerIsNotNull() {
            addCriterion("subrunasowner is not null");
            return (Criteria) this;
        }

        public Criteria andSubrunasownerEqualTo(Boolean value) {
            addCriterion("subrunasowner =", value, "subrunasowner");
            return (Criteria) this;
        }

        public Criteria andSubrunasownerNotEqualTo(Boolean value) {
            addCriterion("subrunasowner <>", value, "subrunasowner");
            return (Criteria) this;
        }

        public Criteria andSubrunasownerGreaterThan(Boolean value) {
            addCriterion("subrunasowner >", value, "subrunasowner");
            return (Criteria) this;
        }

        public Criteria andSubrunasownerGreaterThanOrEqualTo(Boolean value) {
            addCriterion("subrunasowner >=", value, "subrunasowner");
            return (Criteria) this;
        }

        public Criteria andSubrunasownerLessThan(Boolean value) {
            addCriterion("subrunasowner <", value, "subrunasowner");
            return (Criteria) this;
        }

        public Criteria andSubrunasownerLessThanOrEqualTo(Boolean value) {
            addCriterion("subrunasowner <=", value, "subrunasowner");
            return (Criteria) this;
        }

        public Criteria andSubrunasownerIn(List<Boolean> values) {
            addCriterion("subrunasowner in", values, "subrunasowner");
            return (Criteria) this;
        }

        public Criteria andSubrunasownerNotIn(List<Boolean> values) {
            addCriterion("subrunasowner not in", values, "subrunasowner");
            return (Criteria) this;
        }

        public Criteria andSubrunasownerBetween(Boolean value1, Boolean value2) {
            addCriterion("subrunasowner between", value1, value2, "subrunasowner");
            return (Criteria) this;
        }

        public Criteria andSubrunasownerNotBetween(Boolean value1, Boolean value2) {
            addCriterion("subrunasowner not between", value1, value2, "subrunasowner");
            return (Criteria) this;
        }

        public Criteria andSubfailoverIsNull() {
            addCriterion("subfailover is null");
            return (Criteria) this;
        }

        public Criteria andSubfailoverIsNotNull() {
            addCriterion("subfailover is not null");
            return (Criteria) this;
        }

        public Criteria andSubfailoverEqualTo(Boolean value) {
            addCriterion("subfailover =", value, "subfailover");
            return (Criteria) this;
        }

        public Criteria andSubfailoverNotEqualTo(Boolean value) {
            addCriterion("subfailover <>", value, "subfailover");
            return (Criteria) this;
        }

        public Criteria andSubfailoverGreaterThan(Boolean value) {
            addCriterion("subfailover >", value, "subfailover");
            return (Criteria) this;
        }

        public Criteria andSubfailoverGreaterThanOrEqualTo(Boolean value) {
            addCriterion("subfailover >=", value, "subfailover");
            return (Criteria) this;
        }

        public Criteria andSubfailoverLessThan(Boolean value) {
            addCriterion("subfailover <", value, "subfailover");
            return (Criteria) this;
        }

        public Criteria andSubfailoverLessThanOrEqualTo(Boolean value) {
            addCriterion("subfailover <=", value, "subfailover");
            return (Criteria) this;
        }

        public Criteria andSubfailoverIn(List<Boolean> values) {
            addCriterion("subfailover in", values, "subfailover");
            return (Criteria) this;
        }

        public Criteria andSubfailoverNotIn(List<Boolean> values) {
            addCriterion("subfailover not in", values, "subfailover");
            return (Criteria) this;
        }

        public Criteria andSubfailoverBetween(Boolean value1, Boolean value2) {
            addCriterion("subfailover between", value1, value2, "subfailover");
            return (Criteria) this;
        }

        public Criteria andSubfailoverNotBetween(Boolean value1, Boolean value2) {
            addCriterion("subfailover not between", value1, value2, "subfailover");
            return (Criteria) this;
        }

        public Criteria andSubconninfoIsNull() {
            addCriterion("subconninfo is null");
            return (Criteria) this;
        }

        public Criteria andSubconninfoIsNotNull() {
            addCriterion("subconninfo is not null");
            return (Criteria) this;
        }

        public Criteria andSubconninfoEqualTo(String value) {
            addCriterion("subconninfo =", value, "subconninfo");
            return (Criteria) this;
        }

        public Criteria andSubconninfoNotEqualTo(String value) {
            addCriterion("subconninfo <>", value, "subconninfo");
            return (Criteria) this;
        }

        public Criteria andSubconninfoGreaterThan(String value) {
            addCriterion("subconninfo >", value, "subconninfo");
            return (Criteria) this;
        }

        public Criteria andSubconninfoGreaterThanOrEqualTo(String value) {
            addCriterion("subconninfo >=", value, "subconninfo");
            return (Criteria) this;
        }

        public Criteria andSubconninfoLessThan(String value) {
            addCriterion("subconninfo <", value, "subconninfo");
            return (Criteria) this;
        }

        public Criteria andSubconninfoLessThanOrEqualTo(String value) {
            addCriterion("subconninfo <=", value, "subconninfo");
            return (Criteria) this;
        }

        public Criteria andSubconninfoLike(String value) {
            addCriterion("subconninfo like", value, "subconninfo");
            return (Criteria) this;
        }

        public Criteria andSubconninfoNotLike(String value) {
            addCriterion("subconninfo not like", value, "subconninfo");
            return (Criteria) this;
        }

        public Criteria andSubconninfoIn(List<String> values) {
            addCriterion("subconninfo in", values, "subconninfo");
            return (Criteria) this;
        }

        public Criteria andSubconninfoNotIn(List<String> values) {
            addCriterion("subconninfo not in", values, "subconninfo");
            return (Criteria) this;
        }

        public Criteria andSubconninfoBetween(String value1, String value2) {
            addCriterion("subconninfo between", value1, value2, "subconninfo");
            return (Criteria) this;
        }

        public Criteria andSubconninfoNotBetween(String value1, String value2) {
            addCriterion("subconninfo not between", value1, value2, "subconninfo");
            return (Criteria) this;
        }

        public Criteria andSubslotnameIsNull() {
            addCriterion("subslotname is null");
            return (Criteria) this;
        }

        public Criteria andSubslotnameIsNotNull() {
            addCriterion("subslotname is not null");
            return (Criteria) this;
        }

        public Criteria andSubslotnameEqualTo(String value) {
            addCriterion("subslotname =", value, "subslotname");
            return (Criteria) this;
        }

        public Criteria andSubslotnameNotEqualTo(String value) {
            addCriterion("subslotname <>", value, "subslotname");
            return (Criteria) this;
        }

        public Criteria andSubslotnameGreaterThan(String value) {
            addCriterion("subslotname >", value, "subslotname");
            return (Criteria) this;
        }

        public Criteria andSubslotnameGreaterThanOrEqualTo(String value) {
            addCriterion("subslotname >=", value, "subslotname");
            return (Criteria) this;
        }

        public Criteria andSubslotnameLessThan(String value) {
            addCriterion("subslotname <", value, "subslotname");
            return (Criteria) this;
        }

        public Criteria andSubslotnameLessThanOrEqualTo(String value) {
            addCriterion("subslotname <=", value, "subslotname");
            return (Criteria) this;
        }

        public Criteria andSubslotnameLike(String value) {
            addCriterion("subslotname like", value, "subslotname");
            return (Criteria) this;
        }

        public Criteria andSubslotnameNotLike(String value) {
            addCriterion("subslotname not like", value, "subslotname");
            return (Criteria) this;
        }

        public Criteria andSubslotnameIn(List<String> values) {
            addCriterion("subslotname in", values, "subslotname");
            return (Criteria) this;
        }

        public Criteria andSubslotnameNotIn(List<String> values) {
            addCriterion("subslotname not in", values, "subslotname");
            return (Criteria) this;
        }

        public Criteria andSubslotnameBetween(String value1, String value2) {
            addCriterion("subslotname between", value1, value2, "subslotname");
            return (Criteria) this;
        }

        public Criteria andSubslotnameNotBetween(String value1, String value2) {
            addCriterion("subslotname not between", value1, value2, "subslotname");
            return (Criteria) this;
        }

        public Criteria andSubsynccommitIsNull() {
            addCriterion("subsynccommit is null");
            return (Criteria) this;
        }

        public Criteria andSubsynccommitIsNotNull() {
            addCriterion("subsynccommit is not null");
            return (Criteria) this;
        }

        public Criteria andSubsynccommitEqualTo(String value) {
            addCriterion("subsynccommit =", value, "subsynccommit");
            return (Criteria) this;
        }

        public Criteria andSubsynccommitNotEqualTo(String value) {
            addCriterion("subsynccommit <>", value, "subsynccommit");
            return (Criteria) this;
        }

        public Criteria andSubsynccommitGreaterThan(String value) {
            addCriterion("subsynccommit >", value, "subsynccommit");
            return (Criteria) this;
        }

        public Criteria andSubsynccommitGreaterThanOrEqualTo(String value) {
            addCriterion("subsynccommit >=", value, "subsynccommit");
            return (Criteria) this;
        }

        public Criteria andSubsynccommitLessThan(String value) {
            addCriterion("subsynccommit <", value, "subsynccommit");
            return (Criteria) this;
        }

        public Criteria andSubsynccommitLessThanOrEqualTo(String value) {
            addCriterion("subsynccommit <=", value, "subsynccommit");
            return (Criteria) this;
        }

        public Criteria andSubsynccommitLike(String value) {
            addCriterion("subsynccommit like", value, "subsynccommit");
            return (Criteria) this;
        }

        public Criteria andSubsynccommitNotLike(String value) {
            addCriterion("subsynccommit not like", value, "subsynccommit");
            return (Criteria) this;
        }

        public Criteria andSubsynccommitIn(List<String> values) {
            addCriterion("subsynccommit in", values, "subsynccommit");
            return (Criteria) this;
        }

        public Criteria andSubsynccommitNotIn(List<String> values) {
            addCriterion("subsynccommit not in", values, "subsynccommit");
            return (Criteria) this;
        }

        public Criteria andSubsynccommitBetween(String value1, String value2) {
            addCriterion("subsynccommit between", value1, value2, "subsynccommit");
            return (Criteria) this;
        }

        public Criteria andSubsynccommitNotBetween(String value1, String value2) {
            addCriterion("subsynccommit not between", value1, value2, "subsynccommit");
            return (Criteria) this;
        }

        public Criteria andSubpublicationsIsNull() {
            addCriterion("subpublications is null");
            return (Criteria) this;
        }

        public Criteria andSubpublicationsIsNotNull() {
            addCriterion("subpublications is not null");
            return (Criteria) this;
        }

        public Criteria andSubpublicationsEqualTo(Object value) {
            addCriterion("subpublications =", value, "subpublications");
            return (Criteria) this;
        }

        public Criteria andSubpublicationsNotEqualTo(Object value) {
            addCriterion("subpublications <>", value, "subpublications");
            return (Criteria) this;
        }

        public Criteria andSubpublicationsGreaterThan(Object value) {
            addCriterion("subpublications >", value, "subpublications");
            return (Criteria) this;
        }

        public Criteria andSubpublicationsGreaterThanOrEqualTo(Object value) {
            addCriterion("subpublications >=", value, "subpublications");
            return (Criteria) this;
        }

        public Criteria andSubpublicationsLessThan(Object value) {
            addCriterion("subpublications <", value, "subpublications");
            return (Criteria) this;
        }

        public Criteria andSubpublicationsLessThanOrEqualTo(Object value) {
            addCriterion("subpublications <=", value, "subpublications");
            return (Criteria) this;
        }

        public Criteria andSubpublicationsIn(List<Object> values) {
            addCriterion("subpublications in", values, "subpublications");
            return (Criteria) this;
        }

        public Criteria andSubpublicationsNotIn(List<Object> values) {
            addCriterion("subpublications not in", values, "subpublications");
            return (Criteria) this;
        }

        public Criteria andSubpublicationsBetween(Object value1, Object value2) {
            addCriterion("subpublications between", value1, value2, "subpublications");
            return (Criteria) this;
        }

        public Criteria andSubpublicationsNotBetween(Object value1, Object value2) {
            addCriterion("subpublications not between", value1, value2, "subpublications");
            return (Criteria) this;
        }

        public Criteria andSuboriginIsNull() {
            addCriterion("suborigin is null");
            return (Criteria) this;
        }

        public Criteria andSuboriginIsNotNull() {
            addCriterion("suborigin is not null");
            return (Criteria) this;
        }

        public Criteria andSuboriginEqualTo(String value) {
            addCriterion("suborigin =", value, "suborigin");
            return (Criteria) this;
        }

        public Criteria andSuboriginNotEqualTo(String value) {
            addCriterion("suborigin <>", value, "suborigin");
            return (Criteria) this;
        }

        public Criteria andSuboriginGreaterThan(String value) {
            addCriterion("suborigin >", value, "suborigin");
            return (Criteria) this;
        }

        public Criteria andSuboriginGreaterThanOrEqualTo(String value) {
            addCriterion("suborigin >=", value, "suborigin");
            return (Criteria) this;
        }

        public Criteria andSuboriginLessThan(String value) {
            addCriterion("suborigin <", value, "suborigin");
            return (Criteria) this;
        }

        public Criteria andSuboriginLessThanOrEqualTo(String value) {
            addCriterion("suborigin <=", value, "suborigin");
            return (Criteria) this;
        }

        public Criteria andSuboriginLike(String value) {
            addCriterion("suborigin like", value, "suborigin");
            return (Criteria) this;
        }

        public Criteria andSuboriginNotLike(String value) {
            addCriterion("suborigin not like", value, "suborigin");
            return (Criteria) this;
        }

        public Criteria andSuboriginIn(List<String> values) {
            addCriterion("suborigin in", values, "suborigin");
            return (Criteria) this;
        }

        public Criteria andSuboriginNotIn(List<String> values) {
            addCriterion("suborigin not in", values, "suborigin");
            return (Criteria) this;
        }

        public Criteria andSuboriginBetween(String value1, String value2) {
            addCriterion("suborigin between", value1, value2, "suborigin");
            return (Criteria) this;
        }

        public Criteria andSuboriginNotBetween(String value1, String value2) {
            addCriterion("suborigin not between", value1, value2, "suborigin");
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