package com.pool.readio.mbg.model;

import java.util.ArrayList;
import java.util.List;

public class PgBackendMemoryContextsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PgBackendMemoryContextsExample() {
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

        public Criteria andIdentIsNull() {
            addCriterion("ident is null");
            return (Criteria) this;
        }

        public Criteria andIdentIsNotNull() {
            addCriterion("ident is not null");
            return (Criteria) this;
        }

        public Criteria andIdentEqualTo(String value) {
            addCriterion("ident =", value, "ident");
            return (Criteria) this;
        }

        public Criteria andIdentNotEqualTo(String value) {
            addCriterion("ident <>", value, "ident");
            return (Criteria) this;
        }

        public Criteria andIdentGreaterThan(String value) {
            addCriterion("ident >", value, "ident");
            return (Criteria) this;
        }

        public Criteria andIdentGreaterThanOrEqualTo(String value) {
            addCriterion("ident >=", value, "ident");
            return (Criteria) this;
        }

        public Criteria andIdentLessThan(String value) {
            addCriterion("ident <", value, "ident");
            return (Criteria) this;
        }

        public Criteria andIdentLessThanOrEqualTo(String value) {
            addCriterion("ident <=", value, "ident");
            return (Criteria) this;
        }

        public Criteria andIdentLike(String value) {
            addCriterion("ident like", value, "ident");
            return (Criteria) this;
        }

        public Criteria andIdentNotLike(String value) {
            addCriterion("ident not like", value, "ident");
            return (Criteria) this;
        }

        public Criteria andIdentIn(List<String> values) {
            addCriterion("ident in", values, "ident");
            return (Criteria) this;
        }

        public Criteria andIdentNotIn(List<String> values) {
            addCriterion("ident not in", values, "ident");
            return (Criteria) this;
        }

        public Criteria andIdentBetween(String value1, String value2) {
            addCriterion("ident between", value1, value2, "ident");
            return (Criteria) this;
        }

        public Criteria andIdentNotBetween(String value1, String value2) {
            addCriterion("ident not between", value1, value2, "ident");
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

        public Criteria andLevelIsNull() {
            addCriterion("level is null");
            return (Criteria) this;
        }

        public Criteria andLevelIsNotNull() {
            addCriterion("level is not null");
            return (Criteria) this;
        }

        public Criteria andLevelEqualTo(Integer value) {
            addCriterion("level =", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelNotEqualTo(Integer value) {
            addCriterion("level <>", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelGreaterThan(Integer value) {
            addCriterion("level >", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelGreaterThanOrEqualTo(Integer value) {
            addCriterion("level >=", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelLessThan(Integer value) {
            addCriterion("level <", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelLessThanOrEqualTo(Integer value) {
            addCriterion("level <=", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelIn(List<Integer> values) {
            addCriterion("level in", values, "level");
            return (Criteria) this;
        }

        public Criteria andLevelNotIn(List<Integer> values) {
            addCriterion("level not in", values, "level");
            return (Criteria) this;
        }

        public Criteria andLevelBetween(Integer value1, Integer value2) {
            addCriterion("level between", value1, value2, "level");
            return (Criteria) this;
        }

        public Criteria andLevelNotBetween(Integer value1, Integer value2) {
            addCriterion("level not between", value1, value2, "level");
            return (Criteria) this;
        }

        public Criteria andPathIsNull() {
            addCriterion("path is null");
            return (Criteria) this;
        }

        public Criteria andPathIsNotNull() {
            addCriterion("path is not null");
            return (Criteria) this;
        }

        public Criteria andPathEqualTo(Object value) {
            addCriterion("path =", value, "path");
            return (Criteria) this;
        }

        public Criteria andPathNotEqualTo(Object value) {
            addCriterion("path <>", value, "path");
            return (Criteria) this;
        }

        public Criteria andPathGreaterThan(Object value) {
            addCriterion("path >", value, "path");
            return (Criteria) this;
        }

        public Criteria andPathGreaterThanOrEqualTo(Object value) {
            addCriterion("path >=", value, "path");
            return (Criteria) this;
        }

        public Criteria andPathLessThan(Object value) {
            addCriterion("path <", value, "path");
            return (Criteria) this;
        }

        public Criteria andPathLessThanOrEqualTo(Object value) {
            addCriterion("path <=", value, "path");
            return (Criteria) this;
        }

        public Criteria andPathIn(List<Object> values) {
            addCriterion("path in", values, "path");
            return (Criteria) this;
        }

        public Criteria andPathNotIn(List<Object> values) {
            addCriterion("path not in", values, "path");
            return (Criteria) this;
        }

        public Criteria andPathBetween(Object value1, Object value2) {
            addCriterion("path between", value1, value2, "path");
            return (Criteria) this;
        }

        public Criteria andPathNotBetween(Object value1, Object value2) {
            addCriterion("path not between", value1, value2, "path");
            return (Criteria) this;
        }

        public Criteria andTotalBytesIsNull() {
            addCriterion("total_bytes is null");
            return (Criteria) this;
        }

        public Criteria andTotalBytesIsNotNull() {
            addCriterion("total_bytes is not null");
            return (Criteria) this;
        }

        public Criteria andTotalBytesEqualTo(Long value) {
            addCriterion("total_bytes =", value, "totalBytes");
            return (Criteria) this;
        }

        public Criteria andTotalBytesNotEqualTo(Long value) {
            addCriterion("total_bytes <>", value, "totalBytes");
            return (Criteria) this;
        }

        public Criteria andTotalBytesGreaterThan(Long value) {
            addCriterion("total_bytes >", value, "totalBytes");
            return (Criteria) this;
        }

        public Criteria andTotalBytesGreaterThanOrEqualTo(Long value) {
            addCriterion("total_bytes >=", value, "totalBytes");
            return (Criteria) this;
        }

        public Criteria andTotalBytesLessThan(Long value) {
            addCriterion("total_bytes <", value, "totalBytes");
            return (Criteria) this;
        }

        public Criteria andTotalBytesLessThanOrEqualTo(Long value) {
            addCriterion("total_bytes <=", value, "totalBytes");
            return (Criteria) this;
        }

        public Criteria andTotalBytesIn(List<Long> values) {
            addCriterion("total_bytes in", values, "totalBytes");
            return (Criteria) this;
        }

        public Criteria andTotalBytesNotIn(List<Long> values) {
            addCriterion("total_bytes not in", values, "totalBytes");
            return (Criteria) this;
        }

        public Criteria andTotalBytesBetween(Long value1, Long value2) {
            addCriterion("total_bytes between", value1, value2, "totalBytes");
            return (Criteria) this;
        }

        public Criteria andTotalBytesNotBetween(Long value1, Long value2) {
            addCriterion("total_bytes not between", value1, value2, "totalBytes");
            return (Criteria) this;
        }

        public Criteria andTotalNblocksIsNull() {
            addCriterion("total_nblocks is null");
            return (Criteria) this;
        }

        public Criteria andTotalNblocksIsNotNull() {
            addCriterion("total_nblocks is not null");
            return (Criteria) this;
        }

        public Criteria andTotalNblocksEqualTo(Long value) {
            addCriterion("total_nblocks =", value, "totalNblocks");
            return (Criteria) this;
        }

        public Criteria andTotalNblocksNotEqualTo(Long value) {
            addCriterion("total_nblocks <>", value, "totalNblocks");
            return (Criteria) this;
        }

        public Criteria andTotalNblocksGreaterThan(Long value) {
            addCriterion("total_nblocks >", value, "totalNblocks");
            return (Criteria) this;
        }

        public Criteria andTotalNblocksGreaterThanOrEqualTo(Long value) {
            addCriterion("total_nblocks >=", value, "totalNblocks");
            return (Criteria) this;
        }

        public Criteria andTotalNblocksLessThan(Long value) {
            addCriterion("total_nblocks <", value, "totalNblocks");
            return (Criteria) this;
        }

        public Criteria andTotalNblocksLessThanOrEqualTo(Long value) {
            addCriterion("total_nblocks <=", value, "totalNblocks");
            return (Criteria) this;
        }

        public Criteria andTotalNblocksIn(List<Long> values) {
            addCriterion("total_nblocks in", values, "totalNblocks");
            return (Criteria) this;
        }

        public Criteria andTotalNblocksNotIn(List<Long> values) {
            addCriterion("total_nblocks not in", values, "totalNblocks");
            return (Criteria) this;
        }

        public Criteria andTotalNblocksBetween(Long value1, Long value2) {
            addCriterion("total_nblocks between", value1, value2, "totalNblocks");
            return (Criteria) this;
        }

        public Criteria andTotalNblocksNotBetween(Long value1, Long value2) {
            addCriterion("total_nblocks not between", value1, value2, "totalNblocks");
            return (Criteria) this;
        }

        public Criteria andFreeBytesIsNull() {
            addCriterion("free_bytes is null");
            return (Criteria) this;
        }

        public Criteria andFreeBytesIsNotNull() {
            addCriterion("free_bytes is not null");
            return (Criteria) this;
        }

        public Criteria andFreeBytesEqualTo(Long value) {
            addCriterion("free_bytes =", value, "freeBytes");
            return (Criteria) this;
        }

        public Criteria andFreeBytesNotEqualTo(Long value) {
            addCriterion("free_bytes <>", value, "freeBytes");
            return (Criteria) this;
        }

        public Criteria andFreeBytesGreaterThan(Long value) {
            addCriterion("free_bytes >", value, "freeBytes");
            return (Criteria) this;
        }

        public Criteria andFreeBytesGreaterThanOrEqualTo(Long value) {
            addCriterion("free_bytes >=", value, "freeBytes");
            return (Criteria) this;
        }

        public Criteria andFreeBytesLessThan(Long value) {
            addCriterion("free_bytes <", value, "freeBytes");
            return (Criteria) this;
        }

        public Criteria andFreeBytesLessThanOrEqualTo(Long value) {
            addCriterion("free_bytes <=", value, "freeBytes");
            return (Criteria) this;
        }

        public Criteria andFreeBytesIn(List<Long> values) {
            addCriterion("free_bytes in", values, "freeBytes");
            return (Criteria) this;
        }

        public Criteria andFreeBytesNotIn(List<Long> values) {
            addCriterion("free_bytes not in", values, "freeBytes");
            return (Criteria) this;
        }

        public Criteria andFreeBytesBetween(Long value1, Long value2) {
            addCriterion("free_bytes between", value1, value2, "freeBytes");
            return (Criteria) this;
        }

        public Criteria andFreeBytesNotBetween(Long value1, Long value2) {
            addCriterion("free_bytes not between", value1, value2, "freeBytes");
            return (Criteria) this;
        }

        public Criteria andFreeChunksIsNull() {
            addCriterion("free_chunks is null");
            return (Criteria) this;
        }

        public Criteria andFreeChunksIsNotNull() {
            addCriterion("free_chunks is not null");
            return (Criteria) this;
        }

        public Criteria andFreeChunksEqualTo(Long value) {
            addCriterion("free_chunks =", value, "freeChunks");
            return (Criteria) this;
        }

        public Criteria andFreeChunksNotEqualTo(Long value) {
            addCriterion("free_chunks <>", value, "freeChunks");
            return (Criteria) this;
        }

        public Criteria andFreeChunksGreaterThan(Long value) {
            addCriterion("free_chunks >", value, "freeChunks");
            return (Criteria) this;
        }

        public Criteria andFreeChunksGreaterThanOrEqualTo(Long value) {
            addCriterion("free_chunks >=", value, "freeChunks");
            return (Criteria) this;
        }

        public Criteria andFreeChunksLessThan(Long value) {
            addCriterion("free_chunks <", value, "freeChunks");
            return (Criteria) this;
        }

        public Criteria andFreeChunksLessThanOrEqualTo(Long value) {
            addCriterion("free_chunks <=", value, "freeChunks");
            return (Criteria) this;
        }

        public Criteria andFreeChunksIn(List<Long> values) {
            addCriterion("free_chunks in", values, "freeChunks");
            return (Criteria) this;
        }

        public Criteria andFreeChunksNotIn(List<Long> values) {
            addCriterion("free_chunks not in", values, "freeChunks");
            return (Criteria) this;
        }

        public Criteria andFreeChunksBetween(Long value1, Long value2) {
            addCriterion("free_chunks between", value1, value2, "freeChunks");
            return (Criteria) this;
        }

        public Criteria andFreeChunksNotBetween(Long value1, Long value2) {
            addCriterion("free_chunks not between", value1, value2, "freeChunks");
            return (Criteria) this;
        }

        public Criteria andUsedBytesIsNull() {
            addCriterion("used_bytes is null");
            return (Criteria) this;
        }

        public Criteria andUsedBytesIsNotNull() {
            addCriterion("used_bytes is not null");
            return (Criteria) this;
        }

        public Criteria andUsedBytesEqualTo(Long value) {
            addCriterion("used_bytes =", value, "usedBytes");
            return (Criteria) this;
        }

        public Criteria andUsedBytesNotEqualTo(Long value) {
            addCriterion("used_bytes <>", value, "usedBytes");
            return (Criteria) this;
        }

        public Criteria andUsedBytesGreaterThan(Long value) {
            addCriterion("used_bytes >", value, "usedBytes");
            return (Criteria) this;
        }

        public Criteria andUsedBytesGreaterThanOrEqualTo(Long value) {
            addCriterion("used_bytes >=", value, "usedBytes");
            return (Criteria) this;
        }

        public Criteria andUsedBytesLessThan(Long value) {
            addCriterion("used_bytes <", value, "usedBytes");
            return (Criteria) this;
        }

        public Criteria andUsedBytesLessThanOrEqualTo(Long value) {
            addCriterion("used_bytes <=", value, "usedBytes");
            return (Criteria) this;
        }

        public Criteria andUsedBytesIn(List<Long> values) {
            addCriterion("used_bytes in", values, "usedBytes");
            return (Criteria) this;
        }

        public Criteria andUsedBytesNotIn(List<Long> values) {
            addCriterion("used_bytes not in", values, "usedBytes");
            return (Criteria) this;
        }

        public Criteria andUsedBytesBetween(Long value1, Long value2) {
            addCriterion("used_bytes between", value1, value2, "usedBytes");
            return (Criteria) this;
        }

        public Criteria andUsedBytesNotBetween(Long value1, Long value2) {
            addCriterion("used_bytes not between", value1, value2, "usedBytes");
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