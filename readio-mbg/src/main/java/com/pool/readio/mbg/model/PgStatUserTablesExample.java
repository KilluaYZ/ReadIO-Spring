package com.pool.readio.mbg.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PgStatUserTablesExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PgStatUserTablesExample() {
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

        public Criteria andRelidIsNull() {
            addCriterion("relid is null");
            return (Criteria) this;
        }

        public Criteria andRelidIsNotNull() {
            addCriterion("relid is not null");
            return (Criteria) this;
        }

        public Criteria andRelidEqualTo(Long value) {
            addCriterion("relid =", value, "relid");
            return (Criteria) this;
        }

        public Criteria andRelidNotEqualTo(Long value) {
            addCriterion("relid <>", value, "relid");
            return (Criteria) this;
        }

        public Criteria andRelidGreaterThan(Long value) {
            addCriterion("relid >", value, "relid");
            return (Criteria) this;
        }

        public Criteria andRelidGreaterThanOrEqualTo(Long value) {
            addCriterion("relid >=", value, "relid");
            return (Criteria) this;
        }

        public Criteria andRelidLessThan(Long value) {
            addCriterion("relid <", value, "relid");
            return (Criteria) this;
        }

        public Criteria andRelidLessThanOrEqualTo(Long value) {
            addCriterion("relid <=", value, "relid");
            return (Criteria) this;
        }

        public Criteria andRelidIn(List<Long> values) {
            addCriterion("relid in", values, "relid");
            return (Criteria) this;
        }

        public Criteria andRelidNotIn(List<Long> values) {
            addCriterion("relid not in", values, "relid");
            return (Criteria) this;
        }

        public Criteria andRelidBetween(Long value1, Long value2) {
            addCriterion("relid between", value1, value2, "relid");
            return (Criteria) this;
        }

        public Criteria andRelidNotBetween(Long value1, Long value2) {
            addCriterion("relid not between", value1, value2, "relid");
            return (Criteria) this;
        }

        public Criteria andSchemanameIsNull() {
            addCriterion("schemaname is null");
            return (Criteria) this;
        }

        public Criteria andSchemanameIsNotNull() {
            addCriterion("schemaname is not null");
            return (Criteria) this;
        }

        public Criteria andSchemanameEqualTo(String value) {
            addCriterion("schemaname =", value, "schemaname");
            return (Criteria) this;
        }

        public Criteria andSchemanameNotEqualTo(String value) {
            addCriterion("schemaname <>", value, "schemaname");
            return (Criteria) this;
        }

        public Criteria andSchemanameGreaterThan(String value) {
            addCriterion("schemaname >", value, "schemaname");
            return (Criteria) this;
        }

        public Criteria andSchemanameGreaterThanOrEqualTo(String value) {
            addCriterion("schemaname >=", value, "schemaname");
            return (Criteria) this;
        }

        public Criteria andSchemanameLessThan(String value) {
            addCriterion("schemaname <", value, "schemaname");
            return (Criteria) this;
        }

        public Criteria andSchemanameLessThanOrEqualTo(String value) {
            addCriterion("schemaname <=", value, "schemaname");
            return (Criteria) this;
        }

        public Criteria andSchemanameLike(String value) {
            addCriterion("schemaname like", value, "schemaname");
            return (Criteria) this;
        }

        public Criteria andSchemanameNotLike(String value) {
            addCriterion("schemaname not like", value, "schemaname");
            return (Criteria) this;
        }

        public Criteria andSchemanameIn(List<String> values) {
            addCriterion("schemaname in", values, "schemaname");
            return (Criteria) this;
        }

        public Criteria andSchemanameNotIn(List<String> values) {
            addCriterion("schemaname not in", values, "schemaname");
            return (Criteria) this;
        }

        public Criteria andSchemanameBetween(String value1, String value2) {
            addCriterion("schemaname between", value1, value2, "schemaname");
            return (Criteria) this;
        }

        public Criteria andSchemanameNotBetween(String value1, String value2) {
            addCriterion("schemaname not between", value1, value2, "schemaname");
            return (Criteria) this;
        }

        public Criteria andRelnameIsNull() {
            addCriterion("relname is null");
            return (Criteria) this;
        }

        public Criteria andRelnameIsNotNull() {
            addCriterion("relname is not null");
            return (Criteria) this;
        }

        public Criteria andRelnameEqualTo(String value) {
            addCriterion("relname =", value, "relname");
            return (Criteria) this;
        }

        public Criteria andRelnameNotEqualTo(String value) {
            addCriterion("relname <>", value, "relname");
            return (Criteria) this;
        }

        public Criteria andRelnameGreaterThan(String value) {
            addCriterion("relname >", value, "relname");
            return (Criteria) this;
        }

        public Criteria andRelnameGreaterThanOrEqualTo(String value) {
            addCriterion("relname >=", value, "relname");
            return (Criteria) this;
        }

        public Criteria andRelnameLessThan(String value) {
            addCriterion("relname <", value, "relname");
            return (Criteria) this;
        }

        public Criteria andRelnameLessThanOrEqualTo(String value) {
            addCriterion("relname <=", value, "relname");
            return (Criteria) this;
        }

        public Criteria andRelnameLike(String value) {
            addCriterion("relname like", value, "relname");
            return (Criteria) this;
        }

        public Criteria andRelnameNotLike(String value) {
            addCriterion("relname not like", value, "relname");
            return (Criteria) this;
        }

        public Criteria andRelnameIn(List<String> values) {
            addCriterion("relname in", values, "relname");
            return (Criteria) this;
        }

        public Criteria andRelnameNotIn(List<String> values) {
            addCriterion("relname not in", values, "relname");
            return (Criteria) this;
        }

        public Criteria andRelnameBetween(String value1, String value2) {
            addCriterion("relname between", value1, value2, "relname");
            return (Criteria) this;
        }

        public Criteria andRelnameNotBetween(String value1, String value2) {
            addCriterion("relname not between", value1, value2, "relname");
            return (Criteria) this;
        }

        public Criteria andSeqScanIsNull() {
            addCriterion("seq_scan is null");
            return (Criteria) this;
        }

        public Criteria andSeqScanIsNotNull() {
            addCriterion("seq_scan is not null");
            return (Criteria) this;
        }

        public Criteria andSeqScanEqualTo(Long value) {
            addCriterion("seq_scan =", value, "seqScan");
            return (Criteria) this;
        }

        public Criteria andSeqScanNotEqualTo(Long value) {
            addCriterion("seq_scan <>", value, "seqScan");
            return (Criteria) this;
        }

        public Criteria andSeqScanGreaterThan(Long value) {
            addCriterion("seq_scan >", value, "seqScan");
            return (Criteria) this;
        }

        public Criteria andSeqScanGreaterThanOrEqualTo(Long value) {
            addCriterion("seq_scan >=", value, "seqScan");
            return (Criteria) this;
        }

        public Criteria andSeqScanLessThan(Long value) {
            addCriterion("seq_scan <", value, "seqScan");
            return (Criteria) this;
        }

        public Criteria andSeqScanLessThanOrEqualTo(Long value) {
            addCriterion("seq_scan <=", value, "seqScan");
            return (Criteria) this;
        }

        public Criteria andSeqScanIn(List<Long> values) {
            addCriterion("seq_scan in", values, "seqScan");
            return (Criteria) this;
        }

        public Criteria andSeqScanNotIn(List<Long> values) {
            addCriterion("seq_scan not in", values, "seqScan");
            return (Criteria) this;
        }

        public Criteria andSeqScanBetween(Long value1, Long value2) {
            addCriterion("seq_scan between", value1, value2, "seqScan");
            return (Criteria) this;
        }

        public Criteria andSeqScanNotBetween(Long value1, Long value2) {
            addCriterion("seq_scan not between", value1, value2, "seqScan");
            return (Criteria) this;
        }

        public Criteria andLastSeqScanIsNull() {
            addCriterion("last_seq_scan is null");
            return (Criteria) this;
        }

        public Criteria andLastSeqScanIsNotNull() {
            addCriterion("last_seq_scan is not null");
            return (Criteria) this;
        }

        public Criteria andLastSeqScanEqualTo(Date value) {
            addCriterion("last_seq_scan =", value, "lastSeqScan");
            return (Criteria) this;
        }

        public Criteria andLastSeqScanNotEqualTo(Date value) {
            addCriterion("last_seq_scan <>", value, "lastSeqScan");
            return (Criteria) this;
        }

        public Criteria andLastSeqScanGreaterThan(Date value) {
            addCriterion("last_seq_scan >", value, "lastSeqScan");
            return (Criteria) this;
        }

        public Criteria andLastSeqScanGreaterThanOrEqualTo(Date value) {
            addCriterion("last_seq_scan >=", value, "lastSeqScan");
            return (Criteria) this;
        }

        public Criteria andLastSeqScanLessThan(Date value) {
            addCriterion("last_seq_scan <", value, "lastSeqScan");
            return (Criteria) this;
        }

        public Criteria andLastSeqScanLessThanOrEqualTo(Date value) {
            addCriterion("last_seq_scan <=", value, "lastSeqScan");
            return (Criteria) this;
        }

        public Criteria andLastSeqScanIn(List<Date> values) {
            addCriterion("last_seq_scan in", values, "lastSeqScan");
            return (Criteria) this;
        }

        public Criteria andLastSeqScanNotIn(List<Date> values) {
            addCriterion("last_seq_scan not in", values, "lastSeqScan");
            return (Criteria) this;
        }

        public Criteria andLastSeqScanBetween(Date value1, Date value2) {
            addCriterion("last_seq_scan between", value1, value2, "lastSeqScan");
            return (Criteria) this;
        }

        public Criteria andLastSeqScanNotBetween(Date value1, Date value2) {
            addCriterion("last_seq_scan not between", value1, value2, "lastSeqScan");
            return (Criteria) this;
        }

        public Criteria andSeqTupReadIsNull() {
            addCriterion("seq_tup_read is null");
            return (Criteria) this;
        }

        public Criteria andSeqTupReadIsNotNull() {
            addCriterion("seq_tup_read is not null");
            return (Criteria) this;
        }

        public Criteria andSeqTupReadEqualTo(Long value) {
            addCriterion("seq_tup_read =", value, "seqTupRead");
            return (Criteria) this;
        }

        public Criteria andSeqTupReadNotEqualTo(Long value) {
            addCriterion("seq_tup_read <>", value, "seqTupRead");
            return (Criteria) this;
        }

        public Criteria andSeqTupReadGreaterThan(Long value) {
            addCriterion("seq_tup_read >", value, "seqTupRead");
            return (Criteria) this;
        }

        public Criteria andSeqTupReadGreaterThanOrEqualTo(Long value) {
            addCriterion("seq_tup_read >=", value, "seqTupRead");
            return (Criteria) this;
        }

        public Criteria andSeqTupReadLessThan(Long value) {
            addCriterion("seq_tup_read <", value, "seqTupRead");
            return (Criteria) this;
        }

        public Criteria andSeqTupReadLessThanOrEqualTo(Long value) {
            addCriterion("seq_tup_read <=", value, "seqTupRead");
            return (Criteria) this;
        }

        public Criteria andSeqTupReadIn(List<Long> values) {
            addCriterion("seq_tup_read in", values, "seqTupRead");
            return (Criteria) this;
        }

        public Criteria andSeqTupReadNotIn(List<Long> values) {
            addCriterion("seq_tup_read not in", values, "seqTupRead");
            return (Criteria) this;
        }

        public Criteria andSeqTupReadBetween(Long value1, Long value2) {
            addCriterion("seq_tup_read between", value1, value2, "seqTupRead");
            return (Criteria) this;
        }

        public Criteria andSeqTupReadNotBetween(Long value1, Long value2) {
            addCriterion("seq_tup_read not between", value1, value2, "seqTupRead");
            return (Criteria) this;
        }

        public Criteria andIdxScanIsNull() {
            addCriterion("idx_scan is null");
            return (Criteria) this;
        }

        public Criteria andIdxScanIsNotNull() {
            addCriterion("idx_scan is not null");
            return (Criteria) this;
        }

        public Criteria andIdxScanEqualTo(Long value) {
            addCriterion("idx_scan =", value, "idxScan");
            return (Criteria) this;
        }

        public Criteria andIdxScanNotEqualTo(Long value) {
            addCriterion("idx_scan <>", value, "idxScan");
            return (Criteria) this;
        }

        public Criteria andIdxScanGreaterThan(Long value) {
            addCriterion("idx_scan >", value, "idxScan");
            return (Criteria) this;
        }

        public Criteria andIdxScanGreaterThanOrEqualTo(Long value) {
            addCriterion("idx_scan >=", value, "idxScan");
            return (Criteria) this;
        }

        public Criteria andIdxScanLessThan(Long value) {
            addCriterion("idx_scan <", value, "idxScan");
            return (Criteria) this;
        }

        public Criteria andIdxScanLessThanOrEqualTo(Long value) {
            addCriterion("idx_scan <=", value, "idxScan");
            return (Criteria) this;
        }

        public Criteria andIdxScanIn(List<Long> values) {
            addCriterion("idx_scan in", values, "idxScan");
            return (Criteria) this;
        }

        public Criteria andIdxScanNotIn(List<Long> values) {
            addCriterion("idx_scan not in", values, "idxScan");
            return (Criteria) this;
        }

        public Criteria andIdxScanBetween(Long value1, Long value2) {
            addCriterion("idx_scan between", value1, value2, "idxScan");
            return (Criteria) this;
        }

        public Criteria andIdxScanNotBetween(Long value1, Long value2) {
            addCriterion("idx_scan not between", value1, value2, "idxScan");
            return (Criteria) this;
        }

        public Criteria andLastIdxScanIsNull() {
            addCriterion("last_idx_scan is null");
            return (Criteria) this;
        }

        public Criteria andLastIdxScanIsNotNull() {
            addCriterion("last_idx_scan is not null");
            return (Criteria) this;
        }

        public Criteria andLastIdxScanEqualTo(Date value) {
            addCriterion("last_idx_scan =", value, "lastIdxScan");
            return (Criteria) this;
        }

        public Criteria andLastIdxScanNotEqualTo(Date value) {
            addCriterion("last_idx_scan <>", value, "lastIdxScan");
            return (Criteria) this;
        }

        public Criteria andLastIdxScanGreaterThan(Date value) {
            addCriterion("last_idx_scan >", value, "lastIdxScan");
            return (Criteria) this;
        }

        public Criteria andLastIdxScanGreaterThanOrEqualTo(Date value) {
            addCriterion("last_idx_scan >=", value, "lastIdxScan");
            return (Criteria) this;
        }

        public Criteria andLastIdxScanLessThan(Date value) {
            addCriterion("last_idx_scan <", value, "lastIdxScan");
            return (Criteria) this;
        }

        public Criteria andLastIdxScanLessThanOrEqualTo(Date value) {
            addCriterion("last_idx_scan <=", value, "lastIdxScan");
            return (Criteria) this;
        }

        public Criteria andLastIdxScanIn(List<Date> values) {
            addCriterion("last_idx_scan in", values, "lastIdxScan");
            return (Criteria) this;
        }

        public Criteria andLastIdxScanNotIn(List<Date> values) {
            addCriterion("last_idx_scan not in", values, "lastIdxScan");
            return (Criteria) this;
        }

        public Criteria andLastIdxScanBetween(Date value1, Date value2) {
            addCriterion("last_idx_scan between", value1, value2, "lastIdxScan");
            return (Criteria) this;
        }

        public Criteria andLastIdxScanNotBetween(Date value1, Date value2) {
            addCriterion("last_idx_scan not between", value1, value2, "lastIdxScan");
            return (Criteria) this;
        }

        public Criteria andIdxTupFetchIsNull() {
            addCriterion("idx_tup_fetch is null");
            return (Criteria) this;
        }

        public Criteria andIdxTupFetchIsNotNull() {
            addCriterion("idx_tup_fetch is not null");
            return (Criteria) this;
        }

        public Criteria andIdxTupFetchEqualTo(Long value) {
            addCriterion("idx_tup_fetch =", value, "idxTupFetch");
            return (Criteria) this;
        }

        public Criteria andIdxTupFetchNotEqualTo(Long value) {
            addCriterion("idx_tup_fetch <>", value, "idxTupFetch");
            return (Criteria) this;
        }

        public Criteria andIdxTupFetchGreaterThan(Long value) {
            addCriterion("idx_tup_fetch >", value, "idxTupFetch");
            return (Criteria) this;
        }

        public Criteria andIdxTupFetchGreaterThanOrEqualTo(Long value) {
            addCriterion("idx_tup_fetch >=", value, "idxTupFetch");
            return (Criteria) this;
        }

        public Criteria andIdxTupFetchLessThan(Long value) {
            addCriterion("idx_tup_fetch <", value, "idxTupFetch");
            return (Criteria) this;
        }

        public Criteria andIdxTupFetchLessThanOrEqualTo(Long value) {
            addCriterion("idx_tup_fetch <=", value, "idxTupFetch");
            return (Criteria) this;
        }

        public Criteria andIdxTupFetchIn(List<Long> values) {
            addCriterion("idx_tup_fetch in", values, "idxTupFetch");
            return (Criteria) this;
        }

        public Criteria andIdxTupFetchNotIn(List<Long> values) {
            addCriterion("idx_tup_fetch not in", values, "idxTupFetch");
            return (Criteria) this;
        }

        public Criteria andIdxTupFetchBetween(Long value1, Long value2) {
            addCriterion("idx_tup_fetch between", value1, value2, "idxTupFetch");
            return (Criteria) this;
        }

        public Criteria andIdxTupFetchNotBetween(Long value1, Long value2) {
            addCriterion("idx_tup_fetch not between", value1, value2, "idxTupFetch");
            return (Criteria) this;
        }

        public Criteria andNTupInsIsNull() {
            addCriterion("n_tup_ins is null");
            return (Criteria) this;
        }

        public Criteria andNTupInsIsNotNull() {
            addCriterion("n_tup_ins is not null");
            return (Criteria) this;
        }

        public Criteria andNTupInsEqualTo(Long value) {
            addCriterion("n_tup_ins =", value, "nTupIns");
            return (Criteria) this;
        }

        public Criteria andNTupInsNotEqualTo(Long value) {
            addCriterion("n_tup_ins <>", value, "nTupIns");
            return (Criteria) this;
        }

        public Criteria andNTupInsGreaterThan(Long value) {
            addCriterion("n_tup_ins >", value, "nTupIns");
            return (Criteria) this;
        }

        public Criteria andNTupInsGreaterThanOrEqualTo(Long value) {
            addCriterion("n_tup_ins >=", value, "nTupIns");
            return (Criteria) this;
        }

        public Criteria andNTupInsLessThan(Long value) {
            addCriterion("n_tup_ins <", value, "nTupIns");
            return (Criteria) this;
        }

        public Criteria andNTupInsLessThanOrEqualTo(Long value) {
            addCriterion("n_tup_ins <=", value, "nTupIns");
            return (Criteria) this;
        }

        public Criteria andNTupInsIn(List<Long> values) {
            addCriterion("n_tup_ins in", values, "nTupIns");
            return (Criteria) this;
        }

        public Criteria andNTupInsNotIn(List<Long> values) {
            addCriterion("n_tup_ins not in", values, "nTupIns");
            return (Criteria) this;
        }

        public Criteria andNTupInsBetween(Long value1, Long value2) {
            addCriterion("n_tup_ins between", value1, value2, "nTupIns");
            return (Criteria) this;
        }

        public Criteria andNTupInsNotBetween(Long value1, Long value2) {
            addCriterion("n_tup_ins not between", value1, value2, "nTupIns");
            return (Criteria) this;
        }

        public Criteria andNTupUpdIsNull() {
            addCriterion("n_tup_upd is null");
            return (Criteria) this;
        }

        public Criteria andNTupUpdIsNotNull() {
            addCriterion("n_tup_upd is not null");
            return (Criteria) this;
        }

        public Criteria andNTupUpdEqualTo(Long value) {
            addCriterion("n_tup_upd =", value, "nTupUpd");
            return (Criteria) this;
        }

        public Criteria andNTupUpdNotEqualTo(Long value) {
            addCriterion("n_tup_upd <>", value, "nTupUpd");
            return (Criteria) this;
        }

        public Criteria andNTupUpdGreaterThan(Long value) {
            addCriterion("n_tup_upd >", value, "nTupUpd");
            return (Criteria) this;
        }

        public Criteria andNTupUpdGreaterThanOrEqualTo(Long value) {
            addCriterion("n_tup_upd >=", value, "nTupUpd");
            return (Criteria) this;
        }

        public Criteria andNTupUpdLessThan(Long value) {
            addCriterion("n_tup_upd <", value, "nTupUpd");
            return (Criteria) this;
        }

        public Criteria andNTupUpdLessThanOrEqualTo(Long value) {
            addCriterion("n_tup_upd <=", value, "nTupUpd");
            return (Criteria) this;
        }

        public Criteria andNTupUpdIn(List<Long> values) {
            addCriterion("n_tup_upd in", values, "nTupUpd");
            return (Criteria) this;
        }

        public Criteria andNTupUpdNotIn(List<Long> values) {
            addCriterion("n_tup_upd not in", values, "nTupUpd");
            return (Criteria) this;
        }

        public Criteria andNTupUpdBetween(Long value1, Long value2) {
            addCriterion("n_tup_upd between", value1, value2, "nTupUpd");
            return (Criteria) this;
        }

        public Criteria andNTupUpdNotBetween(Long value1, Long value2) {
            addCriterion("n_tup_upd not between", value1, value2, "nTupUpd");
            return (Criteria) this;
        }

        public Criteria andNTupDelIsNull() {
            addCriterion("n_tup_del is null");
            return (Criteria) this;
        }

        public Criteria andNTupDelIsNotNull() {
            addCriterion("n_tup_del is not null");
            return (Criteria) this;
        }

        public Criteria andNTupDelEqualTo(Long value) {
            addCriterion("n_tup_del =", value, "nTupDel");
            return (Criteria) this;
        }

        public Criteria andNTupDelNotEqualTo(Long value) {
            addCriterion("n_tup_del <>", value, "nTupDel");
            return (Criteria) this;
        }

        public Criteria andNTupDelGreaterThan(Long value) {
            addCriterion("n_tup_del >", value, "nTupDel");
            return (Criteria) this;
        }

        public Criteria andNTupDelGreaterThanOrEqualTo(Long value) {
            addCriterion("n_tup_del >=", value, "nTupDel");
            return (Criteria) this;
        }

        public Criteria andNTupDelLessThan(Long value) {
            addCriterion("n_tup_del <", value, "nTupDel");
            return (Criteria) this;
        }

        public Criteria andNTupDelLessThanOrEqualTo(Long value) {
            addCriterion("n_tup_del <=", value, "nTupDel");
            return (Criteria) this;
        }

        public Criteria andNTupDelIn(List<Long> values) {
            addCriterion("n_tup_del in", values, "nTupDel");
            return (Criteria) this;
        }

        public Criteria andNTupDelNotIn(List<Long> values) {
            addCriterion("n_tup_del not in", values, "nTupDel");
            return (Criteria) this;
        }

        public Criteria andNTupDelBetween(Long value1, Long value2) {
            addCriterion("n_tup_del between", value1, value2, "nTupDel");
            return (Criteria) this;
        }

        public Criteria andNTupDelNotBetween(Long value1, Long value2) {
            addCriterion("n_tup_del not between", value1, value2, "nTupDel");
            return (Criteria) this;
        }

        public Criteria andNTupHotUpdIsNull() {
            addCriterion("n_tup_hot_upd is null");
            return (Criteria) this;
        }

        public Criteria andNTupHotUpdIsNotNull() {
            addCriterion("n_tup_hot_upd is not null");
            return (Criteria) this;
        }

        public Criteria andNTupHotUpdEqualTo(Long value) {
            addCriterion("n_tup_hot_upd =", value, "nTupHotUpd");
            return (Criteria) this;
        }

        public Criteria andNTupHotUpdNotEqualTo(Long value) {
            addCriterion("n_tup_hot_upd <>", value, "nTupHotUpd");
            return (Criteria) this;
        }

        public Criteria andNTupHotUpdGreaterThan(Long value) {
            addCriterion("n_tup_hot_upd >", value, "nTupHotUpd");
            return (Criteria) this;
        }

        public Criteria andNTupHotUpdGreaterThanOrEqualTo(Long value) {
            addCriterion("n_tup_hot_upd >=", value, "nTupHotUpd");
            return (Criteria) this;
        }

        public Criteria andNTupHotUpdLessThan(Long value) {
            addCriterion("n_tup_hot_upd <", value, "nTupHotUpd");
            return (Criteria) this;
        }

        public Criteria andNTupHotUpdLessThanOrEqualTo(Long value) {
            addCriterion("n_tup_hot_upd <=", value, "nTupHotUpd");
            return (Criteria) this;
        }

        public Criteria andNTupHotUpdIn(List<Long> values) {
            addCriterion("n_tup_hot_upd in", values, "nTupHotUpd");
            return (Criteria) this;
        }

        public Criteria andNTupHotUpdNotIn(List<Long> values) {
            addCriterion("n_tup_hot_upd not in", values, "nTupHotUpd");
            return (Criteria) this;
        }

        public Criteria andNTupHotUpdBetween(Long value1, Long value2) {
            addCriterion("n_tup_hot_upd between", value1, value2, "nTupHotUpd");
            return (Criteria) this;
        }

        public Criteria andNTupHotUpdNotBetween(Long value1, Long value2) {
            addCriterion("n_tup_hot_upd not between", value1, value2, "nTupHotUpd");
            return (Criteria) this;
        }

        public Criteria andNTupNewpageUpdIsNull() {
            addCriterion("n_tup_newpage_upd is null");
            return (Criteria) this;
        }

        public Criteria andNTupNewpageUpdIsNotNull() {
            addCriterion("n_tup_newpage_upd is not null");
            return (Criteria) this;
        }

        public Criteria andNTupNewpageUpdEqualTo(Long value) {
            addCriterion("n_tup_newpage_upd =", value, "nTupNewpageUpd");
            return (Criteria) this;
        }

        public Criteria andNTupNewpageUpdNotEqualTo(Long value) {
            addCriterion("n_tup_newpage_upd <>", value, "nTupNewpageUpd");
            return (Criteria) this;
        }

        public Criteria andNTupNewpageUpdGreaterThan(Long value) {
            addCriterion("n_tup_newpage_upd >", value, "nTupNewpageUpd");
            return (Criteria) this;
        }

        public Criteria andNTupNewpageUpdGreaterThanOrEqualTo(Long value) {
            addCriterion("n_tup_newpage_upd >=", value, "nTupNewpageUpd");
            return (Criteria) this;
        }

        public Criteria andNTupNewpageUpdLessThan(Long value) {
            addCriterion("n_tup_newpage_upd <", value, "nTupNewpageUpd");
            return (Criteria) this;
        }

        public Criteria andNTupNewpageUpdLessThanOrEqualTo(Long value) {
            addCriterion("n_tup_newpage_upd <=", value, "nTupNewpageUpd");
            return (Criteria) this;
        }

        public Criteria andNTupNewpageUpdIn(List<Long> values) {
            addCriterion("n_tup_newpage_upd in", values, "nTupNewpageUpd");
            return (Criteria) this;
        }

        public Criteria andNTupNewpageUpdNotIn(List<Long> values) {
            addCriterion("n_tup_newpage_upd not in", values, "nTupNewpageUpd");
            return (Criteria) this;
        }

        public Criteria andNTupNewpageUpdBetween(Long value1, Long value2) {
            addCriterion("n_tup_newpage_upd between", value1, value2, "nTupNewpageUpd");
            return (Criteria) this;
        }

        public Criteria andNTupNewpageUpdNotBetween(Long value1, Long value2) {
            addCriterion("n_tup_newpage_upd not between", value1, value2, "nTupNewpageUpd");
            return (Criteria) this;
        }

        public Criteria andNLiveTupIsNull() {
            addCriterion("n_live_tup is null");
            return (Criteria) this;
        }

        public Criteria andNLiveTupIsNotNull() {
            addCriterion("n_live_tup is not null");
            return (Criteria) this;
        }

        public Criteria andNLiveTupEqualTo(Long value) {
            addCriterion("n_live_tup =", value, "nLiveTup");
            return (Criteria) this;
        }

        public Criteria andNLiveTupNotEqualTo(Long value) {
            addCriterion("n_live_tup <>", value, "nLiveTup");
            return (Criteria) this;
        }

        public Criteria andNLiveTupGreaterThan(Long value) {
            addCriterion("n_live_tup >", value, "nLiveTup");
            return (Criteria) this;
        }

        public Criteria andNLiveTupGreaterThanOrEqualTo(Long value) {
            addCriterion("n_live_tup >=", value, "nLiveTup");
            return (Criteria) this;
        }

        public Criteria andNLiveTupLessThan(Long value) {
            addCriterion("n_live_tup <", value, "nLiveTup");
            return (Criteria) this;
        }

        public Criteria andNLiveTupLessThanOrEqualTo(Long value) {
            addCriterion("n_live_tup <=", value, "nLiveTup");
            return (Criteria) this;
        }

        public Criteria andNLiveTupIn(List<Long> values) {
            addCriterion("n_live_tup in", values, "nLiveTup");
            return (Criteria) this;
        }

        public Criteria andNLiveTupNotIn(List<Long> values) {
            addCriterion("n_live_tup not in", values, "nLiveTup");
            return (Criteria) this;
        }

        public Criteria andNLiveTupBetween(Long value1, Long value2) {
            addCriterion("n_live_tup between", value1, value2, "nLiveTup");
            return (Criteria) this;
        }

        public Criteria andNLiveTupNotBetween(Long value1, Long value2) {
            addCriterion("n_live_tup not between", value1, value2, "nLiveTup");
            return (Criteria) this;
        }

        public Criteria andNDeadTupIsNull() {
            addCriterion("n_dead_tup is null");
            return (Criteria) this;
        }

        public Criteria andNDeadTupIsNotNull() {
            addCriterion("n_dead_tup is not null");
            return (Criteria) this;
        }

        public Criteria andNDeadTupEqualTo(Long value) {
            addCriterion("n_dead_tup =", value, "nDeadTup");
            return (Criteria) this;
        }

        public Criteria andNDeadTupNotEqualTo(Long value) {
            addCriterion("n_dead_tup <>", value, "nDeadTup");
            return (Criteria) this;
        }

        public Criteria andNDeadTupGreaterThan(Long value) {
            addCriterion("n_dead_tup >", value, "nDeadTup");
            return (Criteria) this;
        }

        public Criteria andNDeadTupGreaterThanOrEqualTo(Long value) {
            addCriterion("n_dead_tup >=", value, "nDeadTup");
            return (Criteria) this;
        }

        public Criteria andNDeadTupLessThan(Long value) {
            addCriterion("n_dead_tup <", value, "nDeadTup");
            return (Criteria) this;
        }

        public Criteria andNDeadTupLessThanOrEqualTo(Long value) {
            addCriterion("n_dead_tup <=", value, "nDeadTup");
            return (Criteria) this;
        }

        public Criteria andNDeadTupIn(List<Long> values) {
            addCriterion("n_dead_tup in", values, "nDeadTup");
            return (Criteria) this;
        }

        public Criteria andNDeadTupNotIn(List<Long> values) {
            addCriterion("n_dead_tup not in", values, "nDeadTup");
            return (Criteria) this;
        }

        public Criteria andNDeadTupBetween(Long value1, Long value2) {
            addCriterion("n_dead_tup between", value1, value2, "nDeadTup");
            return (Criteria) this;
        }

        public Criteria andNDeadTupNotBetween(Long value1, Long value2) {
            addCriterion("n_dead_tup not between", value1, value2, "nDeadTup");
            return (Criteria) this;
        }

        public Criteria andNModSinceAnalyzeIsNull() {
            addCriterion("n_mod_since_analyze is null");
            return (Criteria) this;
        }

        public Criteria andNModSinceAnalyzeIsNotNull() {
            addCriterion("n_mod_since_analyze is not null");
            return (Criteria) this;
        }

        public Criteria andNModSinceAnalyzeEqualTo(Long value) {
            addCriterion("n_mod_since_analyze =", value, "nModSinceAnalyze");
            return (Criteria) this;
        }

        public Criteria andNModSinceAnalyzeNotEqualTo(Long value) {
            addCriterion("n_mod_since_analyze <>", value, "nModSinceAnalyze");
            return (Criteria) this;
        }

        public Criteria andNModSinceAnalyzeGreaterThan(Long value) {
            addCriterion("n_mod_since_analyze >", value, "nModSinceAnalyze");
            return (Criteria) this;
        }

        public Criteria andNModSinceAnalyzeGreaterThanOrEqualTo(Long value) {
            addCriterion("n_mod_since_analyze >=", value, "nModSinceAnalyze");
            return (Criteria) this;
        }

        public Criteria andNModSinceAnalyzeLessThan(Long value) {
            addCriterion("n_mod_since_analyze <", value, "nModSinceAnalyze");
            return (Criteria) this;
        }

        public Criteria andNModSinceAnalyzeLessThanOrEqualTo(Long value) {
            addCriterion("n_mod_since_analyze <=", value, "nModSinceAnalyze");
            return (Criteria) this;
        }

        public Criteria andNModSinceAnalyzeIn(List<Long> values) {
            addCriterion("n_mod_since_analyze in", values, "nModSinceAnalyze");
            return (Criteria) this;
        }

        public Criteria andNModSinceAnalyzeNotIn(List<Long> values) {
            addCriterion("n_mod_since_analyze not in", values, "nModSinceAnalyze");
            return (Criteria) this;
        }

        public Criteria andNModSinceAnalyzeBetween(Long value1, Long value2) {
            addCriterion("n_mod_since_analyze between", value1, value2, "nModSinceAnalyze");
            return (Criteria) this;
        }

        public Criteria andNModSinceAnalyzeNotBetween(Long value1, Long value2) {
            addCriterion("n_mod_since_analyze not between", value1, value2, "nModSinceAnalyze");
            return (Criteria) this;
        }

        public Criteria andNInsSinceVacuumIsNull() {
            addCriterion("n_ins_since_vacuum is null");
            return (Criteria) this;
        }

        public Criteria andNInsSinceVacuumIsNotNull() {
            addCriterion("n_ins_since_vacuum is not null");
            return (Criteria) this;
        }

        public Criteria andNInsSinceVacuumEqualTo(Long value) {
            addCriterion("n_ins_since_vacuum =", value, "nInsSinceVacuum");
            return (Criteria) this;
        }

        public Criteria andNInsSinceVacuumNotEqualTo(Long value) {
            addCriterion("n_ins_since_vacuum <>", value, "nInsSinceVacuum");
            return (Criteria) this;
        }

        public Criteria andNInsSinceVacuumGreaterThan(Long value) {
            addCriterion("n_ins_since_vacuum >", value, "nInsSinceVacuum");
            return (Criteria) this;
        }

        public Criteria andNInsSinceVacuumGreaterThanOrEqualTo(Long value) {
            addCriterion("n_ins_since_vacuum >=", value, "nInsSinceVacuum");
            return (Criteria) this;
        }

        public Criteria andNInsSinceVacuumLessThan(Long value) {
            addCriterion("n_ins_since_vacuum <", value, "nInsSinceVacuum");
            return (Criteria) this;
        }

        public Criteria andNInsSinceVacuumLessThanOrEqualTo(Long value) {
            addCriterion("n_ins_since_vacuum <=", value, "nInsSinceVacuum");
            return (Criteria) this;
        }

        public Criteria andNInsSinceVacuumIn(List<Long> values) {
            addCriterion("n_ins_since_vacuum in", values, "nInsSinceVacuum");
            return (Criteria) this;
        }

        public Criteria andNInsSinceVacuumNotIn(List<Long> values) {
            addCriterion("n_ins_since_vacuum not in", values, "nInsSinceVacuum");
            return (Criteria) this;
        }

        public Criteria andNInsSinceVacuumBetween(Long value1, Long value2) {
            addCriterion("n_ins_since_vacuum between", value1, value2, "nInsSinceVacuum");
            return (Criteria) this;
        }

        public Criteria andNInsSinceVacuumNotBetween(Long value1, Long value2) {
            addCriterion("n_ins_since_vacuum not between", value1, value2, "nInsSinceVacuum");
            return (Criteria) this;
        }

        public Criteria andLastVacuumIsNull() {
            addCriterion("last_vacuum is null");
            return (Criteria) this;
        }

        public Criteria andLastVacuumIsNotNull() {
            addCriterion("last_vacuum is not null");
            return (Criteria) this;
        }

        public Criteria andLastVacuumEqualTo(Date value) {
            addCriterion("last_vacuum =", value, "lastVacuum");
            return (Criteria) this;
        }

        public Criteria andLastVacuumNotEqualTo(Date value) {
            addCriterion("last_vacuum <>", value, "lastVacuum");
            return (Criteria) this;
        }

        public Criteria andLastVacuumGreaterThan(Date value) {
            addCriterion("last_vacuum >", value, "lastVacuum");
            return (Criteria) this;
        }

        public Criteria andLastVacuumGreaterThanOrEqualTo(Date value) {
            addCriterion("last_vacuum >=", value, "lastVacuum");
            return (Criteria) this;
        }

        public Criteria andLastVacuumLessThan(Date value) {
            addCriterion("last_vacuum <", value, "lastVacuum");
            return (Criteria) this;
        }

        public Criteria andLastVacuumLessThanOrEqualTo(Date value) {
            addCriterion("last_vacuum <=", value, "lastVacuum");
            return (Criteria) this;
        }

        public Criteria andLastVacuumIn(List<Date> values) {
            addCriterion("last_vacuum in", values, "lastVacuum");
            return (Criteria) this;
        }

        public Criteria andLastVacuumNotIn(List<Date> values) {
            addCriterion("last_vacuum not in", values, "lastVacuum");
            return (Criteria) this;
        }

        public Criteria andLastVacuumBetween(Date value1, Date value2) {
            addCriterion("last_vacuum between", value1, value2, "lastVacuum");
            return (Criteria) this;
        }

        public Criteria andLastVacuumNotBetween(Date value1, Date value2) {
            addCriterion("last_vacuum not between", value1, value2, "lastVacuum");
            return (Criteria) this;
        }

        public Criteria andLastAutovacuumIsNull() {
            addCriterion("last_autovacuum is null");
            return (Criteria) this;
        }

        public Criteria andLastAutovacuumIsNotNull() {
            addCriterion("last_autovacuum is not null");
            return (Criteria) this;
        }

        public Criteria andLastAutovacuumEqualTo(Date value) {
            addCriterion("last_autovacuum =", value, "lastAutovacuum");
            return (Criteria) this;
        }

        public Criteria andLastAutovacuumNotEqualTo(Date value) {
            addCriterion("last_autovacuum <>", value, "lastAutovacuum");
            return (Criteria) this;
        }

        public Criteria andLastAutovacuumGreaterThan(Date value) {
            addCriterion("last_autovacuum >", value, "lastAutovacuum");
            return (Criteria) this;
        }

        public Criteria andLastAutovacuumGreaterThanOrEqualTo(Date value) {
            addCriterion("last_autovacuum >=", value, "lastAutovacuum");
            return (Criteria) this;
        }

        public Criteria andLastAutovacuumLessThan(Date value) {
            addCriterion("last_autovacuum <", value, "lastAutovacuum");
            return (Criteria) this;
        }

        public Criteria andLastAutovacuumLessThanOrEqualTo(Date value) {
            addCriterion("last_autovacuum <=", value, "lastAutovacuum");
            return (Criteria) this;
        }

        public Criteria andLastAutovacuumIn(List<Date> values) {
            addCriterion("last_autovacuum in", values, "lastAutovacuum");
            return (Criteria) this;
        }

        public Criteria andLastAutovacuumNotIn(List<Date> values) {
            addCriterion("last_autovacuum not in", values, "lastAutovacuum");
            return (Criteria) this;
        }

        public Criteria andLastAutovacuumBetween(Date value1, Date value2) {
            addCriterion("last_autovacuum between", value1, value2, "lastAutovacuum");
            return (Criteria) this;
        }

        public Criteria andLastAutovacuumNotBetween(Date value1, Date value2) {
            addCriterion("last_autovacuum not between", value1, value2, "lastAutovacuum");
            return (Criteria) this;
        }

        public Criteria andLastAnalyzeIsNull() {
            addCriterion("last_analyze is null");
            return (Criteria) this;
        }

        public Criteria andLastAnalyzeIsNotNull() {
            addCriterion("last_analyze is not null");
            return (Criteria) this;
        }

        public Criteria andLastAnalyzeEqualTo(Date value) {
            addCriterion("last_analyze =", value, "lastAnalyze");
            return (Criteria) this;
        }

        public Criteria andLastAnalyzeNotEqualTo(Date value) {
            addCriterion("last_analyze <>", value, "lastAnalyze");
            return (Criteria) this;
        }

        public Criteria andLastAnalyzeGreaterThan(Date value) {
            addCriterion("last_analyze >", value, "lastAnalyze");
            return (Criteria) this;
        }

        public Criteria andLastAnalyzeGreaterThanOrEqualTo(Date value) {
            addCriterion("last_analyze >=", value, "lastAnalyze");
            return (Criteria) this;
        }

        public Criteria andLastAnalyzeLessThan(Date value) {
            addCriterion("last_analyze <", value, "lastAnalyze");
            return (Criteria) this;
        }

        public Criteria andLastAnalyzeLessThanOrEqualTo(Date value) {
            addCriterion("last_analyze <=", value, "lastAnalyze");
            return (Criteria) this;
        }

        public Criteria andLastAnalyzeIn(List<Date> values) {
            addCriterion("last_analyze in", values, "lastAnalyze");
            return (Criteria) this;
        }

        public Criteria andLastAnalyzeNotIn(List<Date> values) {
            addCriterion("last_analyze not in", values, "lastAnalyze");
            return (Criteria) this;
        }

        public Criteria andLastAnalyzeBetween(Date value1, Date value2) {
            addCriterion("last_analyze between", value1, value2, "lastAnalyze");
            return (Criteria) this;
        }

        public Criteria andLastAnalyzeNotBetween(Date value1, Date value2) {
            addCriterion("last_analyze not between", value1, value2, "lastAnalyze");
            return (Criteria) this;
        }

        public Criteria andLastAutoanalyzeIsNull() {
            addCriterion("last_autoanalyze is null");
            return (Criteria) this;
        }

        public Criteria andLastAutoanalyzeIsNotNull() {
            addCriterion("last_autoanalyze is not null");
            return (Criteria) this;
        }

        public Criteria andLastAutoanalyzeEqualTo(Date value) {
            addCriterion("last_autoanalyze =", value, "lastAutoanalyze");
            return (Criteria) this;
        }

        public Criteria andLastAutoanalyzeNotEqualTo(Date value) {
            addCriterion("last_autoanalyze <>", value, "lastAutoanalyze");
            return (Criteria) this;
        }

        public Criteria andLastAutoanalyzeGreaterThan(Date value) {
            addCriterion("last_autoanalyze >", value, "lastAutoanalyze");
            return (Criteria) this;
        }

        public Criteria andLastAutoanalyzeGreaterThanOrEqualTo(Date value) {
            addCriterion("last_autoanalyze >=", value, "lastAutoanalyze");
            return (Criteria) this;
        }

        public Criteria andLastAutoanalyzeLessThan(Date value) {
            addCriterion("last_autoanalyze <", value, "lastAutoanalyze");
            return (Criteria) this;
        }

        public Criteria andLastAutoanalyzeLessThanOrEqualTo(Date value) {
            addCriterion("last_autoanalyze <=", value, "lastAutoanalyze");
            return (Criteria) this;
        }

        public Criteria andLastAutoanalyzeIn(List<Date> values) {
            addCriterion("last_autoanalyze in", values, "lastAutoanalyze");
            return (Criteria) this;
        }

        public Criteria andLastAutoanalyzeNotIn(List<Date> values) {
            addCriterion("last_autoanalyze not in", values, "lastAutoanalyze");
            return (Criteria) this;
        }

        public Criteria andLastAutoanalyzeBetween(Date value1, Date value2) {
            addCriterion("last_autoanalyze between", value1, value2, "lastAutoanalyze");
            return (Criteria) this;
        }

        public Criteria andLastAutoanalyzeNotBetween(Date value1, Date value2) {
            addCriterion("last_autoanalyze not between", value1, value2, "lastAutoanalyze");
            return (Criteria) this;
        }

        public Criteria andVacuumCountIsNull() {
            addCriterion("vacuum_count is null");
            return (Criteria) this;
        }

        public Criteria andVacuumCountIsNotNull() {
            addCriterion("vacuum_count is not null");
            return (Criteria) this;
        }

        public Criteria andVacuumCountEqualTo(Long value) {
            addCriterion("vacuum_count =", value, "vacuumCount");
            return (Criteria) this;
        }

        public Criteria andVacuumCountNotEqualTo(Long value) {
            addCriterion("vacuum_count <>", value, "vacuumCount");
            return (Criteria) this;
        }

        public Criteria andVacuumCountGreaterThan(Long value) {
            addCriterion("vacuum_count >", value, "vacuumCount");
            return (Criteria) this;
        }

        public Criteria andVacuumCountGreaterThanOrEqualTo(Long value) {
            addCriterion("vacuum_count >=", value, "vacuumCount");
            return (Criteria) this;
        }

        public Criteria andVacuumCountLessThan(Long value) {
            addCriterion("vacuum_count <", value, "vacuumCount");
            return (Criteria) this;
        }

        public Criteria andVacuumCountLessThanOrEqualTo(Long value) {
            addCriterion("vacuum_count <=", value, "vacuumCount");
            return (Criteria) this;
        }

        public Criteria andVacuumCountIn(List<Long> values) {
            addCriterion("vacuum_count in", values, "vacuumCount");
            return (Criteria) this;
        }

        public Criteria andVacuumCountNotIn(List<Long> values) {
            addCriterion("vacuum_count not in", values, "vacuumCount");
            return (Criteria) this;
        }

        public Criteria andVacuumCountBetween(Long value1, Long value2) {
            addCriterion("vacuum_count between", value1, value2, "vacuumCount");
            return (Criteria) this;
        }

        public Criteria andVacuumCountNotBetween(Long value1, Long value2) {
            addCriterion("vacuum_count not between", value1, value2, "vacuumCount");
            return (Criteria) this;
        }

        public Criteria andAutovacuumCountIsNull() {
            addCriterion("autovacuum_count is null");
            return (Criteria) this;
        }

        public Criteria andAutovacuumCountIsNotNull() {
            addCriterion("autovacuum_count is not null");
            return (Criteria) this;
        }

        public Criteria andAutovacuumCountEqualTo(Long value) {
            addCriterion("autovacuum_count =", value, "autovacuumCount");
            return (Criteria) this;
        }

        public Criteria andAutovacuumCountNotEqualTo(Long value) {
            addCriterion("autovacuum_count <>", value, "autovacuumCount");
            return (Criteria) this;
        }

        public Criteria andAutovacuumCountGreaterThan(Long value) {
            addCriterion("autovacuum_count >", value, "autovacuumCount");
            return (Criteria) this;
        }

        public Criteria andAutovacuumCountGreaterThanOrEqualTo(Long value) {
            addCriterion("autovacuum_count >=", value, "autovacuumCount");
            return (Criteria) this;
        }

        public Criteria andAutovacuumCountLessThan(Long value) {
            addCriterion("autovacuum_count <", value, "autovacuumCount");
            return (Criteria) this;
        }

        public Criteria andAutovacuumCountLessThanOrEqualTo(Long value) {
            addCriterion("autovacuum_count <=", value, "autovacuumCount");
            return (Criteria) this;
        }

        public Criteria andAutovacuumCountIn(List<Long> values) {
            addCriterion("autovacuum_count in", values, "autovacuumCount");
            return (Criteria) this;
        }

        public Criteria andAutovacuumCountNotIn(List<Long> values) {
            addCriterion("autovacuum_count not in", values, "autovacuumCount");
            return (Criteria) this;
        }

        public Criteria andAutovacuumCountBetween(Long value1, Long value2) {
            addCriterion("autovacuum_count between", value1, value2, "autovacuumCount");
            return (Criteria) this;
        }

        public Criteria andAutovacuumCountNotBetween(Long value1, Long value2) {
            addCriterion("autovacuum_count not between", value1, value2, "autovacuumCount");
            return (Criteria) this;
        }

        public Criteria andAnalyzeCountIsNull() {
            addCriterion("analyze_count is null");
            return (Criteria) this;
        }

        public Criteria andAnalyzeCountIsNotNull() {
            addCriterion("analyze_count is not null");
            return (Criteria) this;
        }

        public Criteria andAnalyzeCountEqualTo(Long value) {
            addCriterion("analyze_count =", value, "analyzeCount");
            return (Criteria) this;
        }

        public Criteria andAnalyzeCountNotEqualTo(Long value) {
            addCriterion("analyze_count <>", value, "analyzeCount");
            return (Criteria) this;
        }

        public Criteria andAnalyzeCountGreaterThan(Long value) {
            addCriterion("analyze_count >", value, "analyzeCount");
            return (Criteria) this;
        }

        public Criteria andAnalyzeCountGreaterThanOrEqualTo(Long value) {
            addCriterion("analyze_count >=", value, "analyzeCount");
            return (Criteria) this;
        }

        public Criteria andAnalyzeCountLessThan(Long value) {
            addCriterion("analyze_count <", value, "analyzeCount");
            return (Criteria) this;
        }

        public Criteria andAnalyzeCountLessThanOrEqualTo(Long value) {
            addCriterion("analyze_count <=", value, "analyzeCount");
            return (Criteria) this;
        }

        public Criteria andAnalyzeCountIn(List<Long> values) {
            addCriterion("analyze_count in", values, "analyzeCount");
            return (Criteria) this;
        }

        public Criteria andAnalyzeCountNotIn(List<Long> values) {
            addCriterion("analyze_count not in", values, "analyzeCount");
            return (Criteria) this;
        }

        public Criteria andAnalyzeCountBetween(Long value1, Long value2) {
            addCriterion("analyze_count between", value1, value2, "analyzeCount");
            return (Criteria) this;
        }

        public Criteria andAnalyzeCountNotBetween(Long value1, Long value2) {
            addCriterion("analyze_count not between", value1, value2, "analyzeCount");
            return (Criteria) this;
        }

        public Criteria andAutoanalyzeCountIsNull() {
            addCriterion("autoanalyze_count is null");
            return (Criteria) this;
        }

        public Criteria andAutoanalyzeCountIsNotNull() {
            addCriterion("autoanalyze_count is not null");
            return (Criteria) this;
        }

        public Criteria andAutoanalyzeCountEqualTo(Long value) {
            addCriterion("autoanalyze_count =", value, "autoanalyzeCount");
            return (Criteria) this;
        }

        public Criteria andAutoanalyzeCountNotEqualTo(Long value) {
            addCriterion("autoanalyze_count <>", value, "autoanalyzeCount");
            return (Criteria) this;
        }

        public Criteria andAutoanalyzeCountGreaterThan(Long value) {
            addCriterion("autoanalyze_count >", value, "autoanalyzeCount");
            return (Criteria) this;
        }

        public Criteria andAutoanalyzeCountGreaterThanOrEqualTo(Long value) {
            addCriterion("autoanalyze_count >=", value, "autoanalyzeCount");
            return (Criteria) this;
        }

        public Criteria andAutoanalyzeCountLessThan(Long value) {
            addCriterion("autoanalyze_count <", value, "autoanalyzeCount");
            return (Criteria) this;
        }

        public Criteria andAutoanalyzeCountLessThanOrEqualTo(Long value) {
            addCriterion("autoanalyze_count <=", value, "autoanalyzeCount");
            return (Criteria) this;
        }

        public Criteria andAutoanalyzeCountIn(List<Long> values) {
            addCriterion("autoanalyze_count in", values, "autoanalyzeCount");
            return (Criteria) this;
        }

        public Criteria andAutoanalyzeCountNotIn(List<Long> values) {
            addCriterion("autoanalyze_count not in", values, "autoanalyzeCount");
            return (Criteria) this;
        }

        public Criteria andAutoanalyzeCountBetween(Long value1, Long value2) {
            addCriterion("autoanalyze_count between", value1, value2, "autoanalyzeCount");
            return (Criteria) this;
        }

        public Criteria andAutoanalyzeCountNotBetween(Long value1, Long value2) {
            addCriterion("autoanalyze_count not between", value1, value2, "autoanalyzeCount");
            return (Criteria) this;
        }

        public Criteria andTotalVacuumTimeIsNull() {
            addCriterion("total_vacuum_time is null");
            return (Criteria) this;
        }

        public Criteria andTotalVacuumTimeIsNotNull() {
            addCriterion("total_vacuum_time is not null");
            return (Criteria) this;
        }

        public Criteria andTotalVacuumTimeEqualTo(Double value) {
            addCriterion("total_vacuum_time =", value, "totalVacuumTime");
            return (Criteria) this;
        }

        public Criteria andTotalVacuumTimeNotEqualTo(Double value) {
            addCriterion("total_vacuum_time <>", value, "totalVacuumTime");
            return (Criteria) this;
        }

        public Criteria andTotalVacuumTimeGreaterThan(Double value) {
            addCriterion("total_vacuum_time >", value, "totalVacuumTime");
            return (Criteria) this;
        }

        public Criteria andTotalVacuumTimeGreaterThanOrEqualTo(Double value) {
            addCriterion("total_vacuum_time >=", value, "totalVacuumTime");
            return (Criteria) this;
        }

        public Criteria andTotalVacuumTimeLessThan(Double value) {
            addCriterion("total_vacuum_time <", value, "totalVacuumTime");
            return (Criteria) this;
        }

        public Criteria andTotalVacuumTimeLessThanOrEqualTo(Double value) {
            addCriterion("total_vacuum_time <=", value, "totalVacuumTime");
            return (Criteria) this;
        }

        public Criteria andTotalVacuumTimeIn(List<Double> values) {
            addCriterion("total_vacuum_time in", values, "totalVacuumTime");
            return (Criteria) this;
        }

        public Criteria andTotalVacuumTimeNotIn(List<Double> values) {
            addCriterion("total_vacuum_time not in", values, "totalVacuumTime");
            return (Criteria) this;
        }

        public Criteria andTotalVacuumTimeBetween(Double value1, Double value2) {
            addCriterion("total_vacuum_time between", value1, value2, "totalVacuumTime");
            return (Criteria) this;
        }

        public Criteria andTotalVacuumTimeNotBetween(Double value1, Double value2) {
            addCriterion("total_vacuum_time not between", value1, value2, "totalVacuumTime");
            return (Criteria) this;
        }

        public Criteria andTotalAutovacuumTimeIsNull() {
            addCriterion("total_autovacuum_time is null");
            return (Criteria) this;
        }

        public Criteria andTotalAutovacuumTimeIsNotNull() {
            addCriterion("total_autovacuum_time is not null");
            return (Criteria) this;
        }

        public Criteria andTotalAutovacuumTimeEqualTo(Double value) {
            addCriterion("total_autovacuum_time =", value, "totalAutovacuumTime");
            return (Criteria) this;
        }

        public Criteria andTotalAutovacuumTimeNotEqualTo(Double value) {
            addCriterion("total_autovacuum_time <>", value, "totalAutovacuumTime");
            return (Criteria) this;
        }

        public Criteria andTotalAutovacuumTimeGreaterThan(Double value) {
            addCriterion("total_autovacuum_time >", value, "totalAutovacuumTime");
            return (Criteria) this;
        }

        public Criteria andTotalAutovacuumTimeGreaterThanOrEqualTo(Double value) {
            addCriterion("total_autovacuum_time >=", value, "totalAutovacuumTime");
            return (Criteria) this;
        }

        public Criteria andTotalAutovacuumTimeLessThan(Double value) {
            addCriterion("total_autovacuum_time <", value, "totalAutovacuumTime");
            return (Criteria) this;
        }

        public Criteria andTotalAutovacuumTimeLessThanOrEqualTo(Double value) {
            addCriterion("total_autovacuum_time <=", value, "totalAutovacuumTime");
            return (Criteria) this;
        }

        public Criteria andTotalAutovacuumTimeIn(List<Double> values) {
            addCriterion("total_autovacuum_time in", values, "totalAutovacuumTime");
            return (Criteria) this;
        }

        public Criteria andTotalAutovacuumTimeNotIn(List<Double> values) {
            addCriterion("total_autovacuum_time not in", values, "totalAutovacuumTime");
            return (Criteria) this;
        }

        public Criteria andTotalAutovacuumTimeBetween(Double value1, Double value2) {
            addCriterion("total_autovacuum_time between", value1, value2, "totalAutovacuumTime");
            return (Criteria) this;
        }

        public Criteria andTotalAutovacuumTimeNotBetween(Double value1, Double value2) {
            addCriterion("total_autovacuum_time not between", value1, value2, "totalAutovacuumTime");
            return (Criteria) this;
        }

        public Criteria andTotalAnalyzeTimeIsNull() {
            addCriterion("total_analyze_time is null");
            return (Criteria) this;
        }

        public Criteria andTotalAnalyzeTimeIsNotNull() {
            addCriterion("total_analyze_time is not null");
            return (Criteria) this;
        }

        public Criteria andTotalAnalyzeTimeEqualTo(Double value) {
            addCriterion("total_analyze_time =", value, "totalAnalyzeTime");
            return (Criteria) this;
        }

        public Criteria andTotalAnalyzeTimeNotEqualTo(Double value) {
            addCriterion("total_analyze_time <>", value, "totalAnalyzeTime");
            return (Criteria) this;
        }

        public Criteria andTotalAnalyzeTimeGreaterThan(Double value) {
            addCriterion("total_analyze_time >", value, "totalAnalyzeTime");
            return (Criteria) this;
        }

        public Criteria andTotalAnalyzeTimeGreaterThanOrEqualTo(Double value) {
            addCriterion("total_analyze_time >=", value, "totalAnalyzeTime");
            return (Criteria) this;
        }

        public Criteria andTotalAnalyzeTimeLessThan(Double value) {
            addCriterion("total_analyze_time <", value, "totalAnalyzeTime");
            return (Criteria) this;
        }

        public Criteria andTotalAnalyzeTimeLessThanOrEqualTo(Double value) {
            addCriterion("total_analyze_time <=", value, "totalAnalyzeTime");
            return (Criteria) this;
        }

        public Criteria andTotalAnalyzeTimeIn(List<Double> values) {
            addCriterion("total_analyze_time in", values, "totalAnalyzeTime");
            return (Criteria) this;
        }

        public Criteria andTotalAnalyzeTimeNotIn(List<Double> values) {
            addCriterion("total_analyze_time not in", values, "totalAnalyzeTime");
            return (Criteria) this;
        }

        public Criteria andTotalAnalyzeTimeBetween(Double value1, Double value2) {
            addCriterion("total_analyze_time between", value1, value2, "totalAnalyzeTime");
            return (Criteria) this;
        }

        public Criteria andTotalAnalyzeTimeNotBetween(Double value1, Double value2) {
            addCriterion("total_analyze_time not between", value1, value2, "totalAnalyzeTime");
            return (Criteria) this;
        }

        public Criteria andTotalAutoanalyzeTimeIsNull() {
            addCriterion("total_autoanalyze_time is null");
            return (Criteria) this;
        }

        public Criteria andTotalAutoanalyzeTimeIsNotNull() {
            addCriterion("total_autoanalyze_time is not null");
            return (Criteria) this;
        }

        public Criteria andTotalAutoanalyzeTimeEqualTo(Double value) {
            addCriterion("total_autoanalyze_time =", value, "totalAutoanalyzeTime");
            return (Criteria) this;
        }

        public Criteria andTotalAutoanalyzeTimeNotEqualTo(Double value) {
            addCriterion("total_autoanalyze_time <>", value, "totalAutoanalyzeTime");
            return (Criteria) this;
        }

        public Criteria andTotalAutoanalyzeTimeGreaterThan(Double value) {
            addCriterion("total_autoanalyze_time >", value, "totalAutoanalyzeTime");
            return (Criteria) this;
        }

        public Criteria andTotalAutoanalyzeTimeGreaterThanOrEqualTo(Double value) {
            addCriterion("total_autoanalyze_time >=", value, "totalAutoanalyzeTime");
            return (Criteria) this;
        }

        public Criteria andTotalAutoanalyzeTimeLessThan(Double value) {
            addCriterion("total_autoanalyze_time <", value, "totalAutoanalyzeTime");
            return (Criteria) this;
        }

        public Criteria andTotalAutoanalyzeTimeLessThanOrEqualTo(Double value) {
            addCriterion("total_autoanalyze_time <=", value, "totalAutoanalyzeTime");
            return (Criteria) this;
        }

        public Criteria andTotalAutoanalyzeTimeIn(List<Double> values) {
            addCriterion("total_autoanalyze_time in", values, "totalAutoanalyzeTime");
            return (Criteria) this;
        }

        public Criteria andTotalAutoanalyzeTimeNotIn(List<Double> values) {
            addCriterion("total_autoanalyze_time not in", values, "totalAutoanalyzeTime");
            return (Criteria) this;
        }

        public Criteria andTotalAutoanalyzeTimeBetween(Double value1, Double value2) {
            addCriterion("total_autoanalyze_time between", value1, value2, "totalAutoanalyzeTime");
            return (Criteria) this;
        }

        public Criteria andTotalAutoanalyzeTimeNotBetween(Double value1, Double value2) {
            addCriterion("total_autoanalyze_time not between", value1, value2, "totalAutoanalyzeTime");
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