package com.pool.readio.mbg.model;

import java.util.ArrayList;
import java.util.List;

public class CharacterSetsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CharacterSetsExample() {
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

        public Criteria andCharacterSetCatalogIsNull() {
            addCriterion("character_set_catalog is null");
            return (Criteria) this;
        }

        public Criteria andCharacterSetCatalogIsNotNull() {
            addCriterion("character_set_catalog is not null");
            return (Criteria) this;
        }

        public Criteria andCharacterSetCatalogEqualTo(Object value) {
            addCriterion("character_set_catalog =", value, "characterSetCatalog");
            return (Criteria) this;
        }

        public Criteria andCharacterSetCatalogNotEqualTo(Object value) {
            addCriterion("character_set_catalog <>", value, "characterSetCatalog");
            return (Criteria) this;
        }

        public Criteria andCharacterSetCatalogGreaterThan(Object value) {
            addCriterion("character_set_catalog >", value, "characterSetCatalog");
            return (Criteria) this;
        }

        public Criteria andCharacterSetCatalogGreaterThanOrEqualTo(Object value) {
            addCriterion("character_set_catalog >=", value, "characterSetCatalog");
            return (Criteria) this;
        }

        public Criteria andCharacterSetCatalogLessThan(Object value) {
            addCriterion("character_set_catalog <", value, "characterSetCatalog");
            return (Criteria) this;
        }

        public Criteria andCharacterSetCatalogLessThanOrEqualTo(Object value) {
            addCriterion("character_set_catalog <=", value, "characterSetCatalog");
            return (Criteria) this;
        }

        public Criteria andCharacterSetCatalogIn(List<Object> values) {
            addCriterion("character_set_catalog in", values, "characterSetCatalog");
            return (Criteria) this;
        }

        public Criteria andCharacterSetCatalogNotIn(List<Object> values) {
            addCriterion("character_set_catalog not in", values, "characterSetCatalog");
            return (Criteria) this;
        }

        public Criteria andCharacterSetCatalogBetween(Object value1, Object value2) {
            addCriterion("character_set_catalog between", value1, value2, "characterSetCatalog");
            return (Criteria) this;
        }

        public Criteria andCharacterSetCatalogNotBetween(Object value1, Object value2) {
            addCriterion("character_set_catalog not between", value1, value2, "characterSetCatalog");
            return (Criteria) this;
        }

        public Criteria andCharacterSetSchemaIsNull() {
            addCriterion("character_set_schema is null");
            return (Criteria) this;
        }

        public Criteria andCharacterSetSchemaIsNotNull() {
            addCriterion("character_set_schema is not null");
            return (Criteria) this;
        }

        public Criteria andCharacterSetSchemaEqualTo(Object value) {
            addCriterion("character_set_schema =", value, "characterSetSchema");
            return (Criteria) this;
        }

        public Criteria andCharacterSetSchemaNotEqualTo(Object value) {
            addCriterion("character_set_schema <>", value, "characterSetSchema");
            return (Criteria) this;
        }

        public Criteria andCharacterSetSchemaGreaterThan(Object value) {
            addCriterion("character_set_schema >", value, "characterSetSchema");
            return (Criteria) this;
        }

        public Criteria andCharacterSetSchemaGreaterThanOrEqualTo(Object value) {
            addCriterion("character_set_schema >=", value, "characterSetSchema");
            return (Criteria) this;
        }

        public Criteria andCharacterSetSchemaLessThan(Object value) {
            addCriterion("character_set_schema <", value, "characterSetSchema");
            return (Criteria) this;
        }

        public Criteria andCharacterSetSchemaLessThanOrEqualTo(Object value) {
            addCriterion("character_set_schema <=", value, "characterSetSchema");
            return (Criteria) this;
        }

        public Criteria andCharacterSetSchemaIn(List<Object> values) {
            addCriterion("character_set_schema in", values, "characterSetSchema");
            return (Criteria) this;
        }

        public Criteria andCharacterSetSchemaNotIn(List<Object> values) {
            addCriterion("character_set_schema not in", values, "characterSetSchema");
            return (Criteria) this;
        }

        public Criteria andCharacterSetSchemaBetween(Object value1, Object value2) {
            addCriterion("character_set_schema between", value1, value2, "characterSetSchema");
            return (Criteria) this;
        }

        public Criteria andCharacterSetSchemaNotBetween(Object value1, Object value2) {
            addCriterion("character_set_schema not between", value1, value2, "characterSetSchema");
            return (Criteria) this;
        }

        public Criteria andCharacterSetNameIsNull() {
            addCriterion("character_set_name is null");
            return (Criteria) this;
        }

        public Criteria andCharacterSetNameIsNotNull() {
            addCriterion("character_set_name is not null");
            return (Criteria) this;
        }

        public Criteria andCharacterSetNameEqualTo(Object value) {
            addCriterion("character_set_name =", value, "characterSetName");
            return (Criteria) this;
        }

        public Criteria andCharacterSetNameNotEqualTo(Object value) {
            addCriterion("character_set_name <>", value, "characterSetName");
            return (Criteria) this;
        }

        public Criteria andCharacterSetNameGreaterThan(Object value) {
            addCriterion("character_set_name >", value, "characterSetName");
            return (Criteria) this;
        }

        public Criteria andCharacterSetNameGreaterThanOrEqualTo(Object value) {
            addCriterion("character_set_name >=", value, "characterSetName");
            return (Criteria) this;
        }

        public Criteria andCharacterSetNameLessThan(Object value) {
            addCriterion("character_set_name <", value, "characterSetName");
            return (Criteria) this;
        }

        public Criteria andCharacterSetNameLessThanOrEqualTo(Object value) {
            addCriterion("character_set_name <=", value, "characterSetName");
            return (Criteria) this;
        }

        public Criteria andCharacterSetNameIn(List<Object> values) {
            addCriterion("character_set_name in", values, "characterSetName");
            return (Criteria) this;
        }

        public Criteria andCharacterSetNameNotIn(List<Object> values) {
            addCriterion("character_set_name not in", values, "characterSetName");
            return (Criteria) this;
        }

        public Criteria andCharacterSetNameBetween(Object value1, Object value2) {
            addCriterion("character_set_name between", value1, value2, "characterSetName");
            return (Criteria) this;
        }

        public Criteria andCharacterSetNameNotBetween(Object value1, Object value2) {
            addCriterion("character_set_name not between", value1, value2, "characterSetName");
            return (Criteria) this;
        }

        public Criteria andCharacterRepertoireIsNull() {
            addCriterion("character_repertoire is null");
            return (Criteria) this;
        }

        public Criteria andCharacterRepertoireIsNotNull() {
            addCriterion("character_repertoire is not null");
            return (Criteria) this;
        }

        public Criteria andCharacterRepertoireEqualTo(Object value) {
            addCriterion("character_repertoire =", value, "characterRepertoire");
            return (Criteria) this;
        }

        public Criteria andCharacterRepertoireNotEqualTo(Object value) {
            addCriterion("character_repertoire <>", value, "characterRepertoire");
            return (Criteria) this;
        }

        public Criteria andCharacterRepertoireGreaterThan(Object value) {
            addCriterion("character_repertoire >", value, "characterRepertoire");
            return (Criteria) this;
        }

        public Criteria andCharacterRepertoireGreaterThanOrEqualTo(Object value) {
            addCriterion("character_repertoire >=", value, "characterRepertoire");
            return (Criteria) this;
        }

        public Criteria andCharacterRepertoireLessThan(Object value) {
            addCriterion("character_repertoire <", value, "characterRepertoire");
            return (Criteria) this;
        }

        public Criteria andCharacterRepertoireLessThanOrEqualTo(Object value) {
            addCriterion("character_repertoire <=", value, "characterRepertoire");
            return (Criteria) this;
        }

        public Criteria andCharacterRepertoireIn(List<Object> values) {
            addCriterion("character_repertoire in", values, "characterRepertoire");
            return (Criteria) this;
        }

        public Criteria andCharacterRepertoireNotIn(List<Object> values) {
            addCriterion("character_repertoire not in", values, "characterRepertoire");
            return (Criteria) this;
        }

        public Criteria andCharacterRepertoireBetween(Object value1, Object value2) {
            addCriterion("character_repertoire between", value1, value2, "characterRepertoire");
            return (Criteria) this;
        }

        public Criteria andCharacterRepertoireNotBetween(Object value1, Object value2) {
            addCriterion("character_repertoire not between", value1, value2, "characterRepertoire");
            return (Criteria) this;
        }

        public Criteria andFormOfUseIsNull() {
            addCriterion("form_of_use is null");
            return (Criteria) this;
        }

        public Criteria andFormOfUseIsNotNull() {
            addCriterion("form_of_use is not null");
            return (Criteria) this;
        }

        public Criteria andFormOfUseEqualTo(Object value) {
            addCriterion("form_of_use =", value, "formOfUse");
            return (Criteria) this;
        }

        public Criteria andFormOfUseNotEqualTo(Object value) {
            addCriterion("form_of_use <>", value, "formOfUse");
            return (Criteria) this;
        }

        public Criteria andFormOfUseGreaterThan(Object value) {
            addCriterion("form_of_use >", value, "formOfUse");
            return (Criteria) this;
        }

        public Criteria andFormOfUseGreaterThanOrEqualTo(Object value) {
            addCriterion("form_of_use >=", value, "formOfUse");
            return (Criteria) this;
        }

        public Criteria andFormOfUseLessThan(Object value) {
            addCriterion("form_of_use <", value, "formOfUse");
            return (Criteria) this;
        }

        public Criteria andFormOfUseLessThanOrEqualTo(Object value) {
            addCriterion("form_of_use <=", value, "formOfUse");
            return (Criteria) this;
        }

        public Criteria andFormOfUseIn(List<Object> values) {
            addCriterion("form_of_use in", values, "formOfUse");
            return (Criteria) this;
        }

        public Criteria andFormOfUseNotIn(List<Object> values) {
            addCriterion("form_of_use not in", values, "formOfUse");
            return (Criteria) this;
        }

        public Criteria andFormOfUseBetween(Object value1, Object value2) {
            addCriterion("form_of_use between", value1, value2, "formOfUse");
            return (Criteria) this;
        }

        public Criteria andFormOfUseNotBetween(Object value1, Object value2) {
            addCriterion("form_of_use not between", value1, value2, "formOfUse");
            return (Criteria) this;
        }

        public Criteria andDefaultCollateCatalogIsNull() {
            addCriterion("default_collate_catalog is null");
            return (Criteria) this;
        }

        public Criteria andDefaultCollateCatalogIsNotNull() {
            addCriterion("default_collate_catalog is not null");
            return (Criteria) this;
        }

        public Criteria andDefaultCollateCatalogEqualTo(Object value) {
            addCriterion("default_collate_catalog =", value, "defaultCollateCatalog");
            return (Criteria) this;
        }

        public Criteria andDefaultCollateCatalogNotEqualTo(Object value) {
            addCriterion("default_collate_catalog <>", value, "defaultCollateCatalog");
            return (Criteria) this;
        }

        public Criteria andDefaultCollateCatalogGreaterThan(Object value) {
            addCriterion("default_collate_catalog >", value, "defaultCollateCatalog");
            return (Criteria) this;
        }

        public Criteria andDefaultCollateCatalogGreaterThanOrEqualTo(Object value) {
            addCriterion("default_collate_catalog >=", value, "defaultCollateCatalog");
            return (Criteria) this;
        }

        public Criteria andDefaultCollateCatalogLessThan(Object value) {
            addCriterion("default_collate_catalog <", value, "defaultCollateCatalog");
            return (Criteria) this;
        }

        public Criteria andDefaultCollateCatalogLessThanOrEqualTo(Object value) {
            addCriterion("default_collate_catalog <=", value, "defaultCollateCatalog");
            return (Criteria) this;
        }

        public Criteria andDefaultCollateCatalogIn(List<Object> values) {
            addCriterion("default_collate_catalog in", values, "defaultCollateCatalog");
            return (Criteria) this;
        }

        public Criteria andDefaultCollateCatalogNotIn(List<Object> values) {
            addCriterion("default_collate_catalog not in", values, "defaultCollateCatalog");
            return (Criteria) this;
        }

        public Criteria andDefaultCollateCatalogBetween(Object value1, Object value2) {
            addCriterion("default_collate_catalog between", value1, value2, "defaultCollateCatalog");
            return (Criteria) this;
        }

        public Criteria andDefaultCollateCatalogNotBetween(Object value1, Object value2) {
            addCriterion("default_collate_catalog not between", value1, value2, "defaultCollateCatalog");
            return (Criteria) this;
        }

        public Criteria andDefaultCollateSchemaIsNull() {
            addCriterion("default_collate_schema is null");
            return (Criteria) this;
        }

        public Criteria andDefaultCollateSchemaIsNotNull() {
            addCriterion("default_collate_schema is not null");
            return (Criteria) this;
        }

        public Criteria andDefaultCollateSchemaEqualTo(Object value) {
            addCriterion("default_collate_schema =", value, "defaultCollateSchema");
            return (Criteria) this;
        }

        public Criteria andDefaultCollateSchemaNotEqualTo(Object value) {
            addCriterion("default_collate_schema <>", value, "defaultCollateSchema");
            return (Criteria) this;
        }

        public Criteria andDefaultCollateSchemaGreaterThan(Object value) {
            addCriterion("default_collate_schema >", value, "defaultCollateSchema");
            return (Criteria) this;
        }

        public Criteria andDefaultCollateSchemaGreaterThanOrEqualTo(Object value) {
            addCriterion("default_collate_schema >=", value, "defaultCollateSchema");
            return (Criteria) this;
        }

        public Criteria andDefaultCollateSchemaLessThan(Object value) {
            addCriterion("default_collate_schema <", value, "defaultCollateSchema");
            return (Criteria) this;
        }

        public Criteria andDefaultCollateSchemaLessThanOrEqualTo(Object value) {
            addCriterion("default_collate_schema <=", value, "defaultCollateSchema");
            return (Criteria) this;
        }

        public Criteria andDefaultCollateSchemaIn(List<Object> values) {
            addCriterion("default_collate_schema in", values, "defaultCollateSchema");
            return (Criteria) this;
        }

        public Criteria andDefaultCollateSchemaNotIn(List<Object> values) {
            addCriterion("default_collate_schema not in", values, "defaultCollateSchema");
            return (Criteria) this;
        }

        public Criteria andDefaultCollateSchemaBetween(Object value1, Object value2) {
            addCriterion("default_collate_schema between", value1, value2, "defaultCollateSchema");
            return (Criteria) this;
        }

        public Criteria andDefaultCollateSchemaNotBetween(Object value1, Object value2) {
            addCriterion("default_collate_schema not between", value1, value2, "defaultCollateSchema");
            return (Criteria) this;
        }

        public Criteria andDefaultCollateNameIsNull() {
            addCriterion("default_collate_name is null");
            return (Criteria) this;
        }

        public Criteria andDefaultCollateNameIsNotNull() {
            addCriterion("default_collate_name is not null");
            return (Criteria) this;
        }

        public Criteria andDefaultCollateNameEqualTo(Object value) {
            addCriterion("default_collate_name =", value, "defaultCollateName");
            return (Criteria) this;
        }

        public Criteria andDefaultCollateNameNotEqualTo(Object value) {
            addCriterion("default_collate_name <>", value, "defaultCollateName");
            return (Criteria) this;
        }

        public Criteria andDefaultCollateNameGreaterThan(Object value) {
            addCriterion("default_collate_name >", value, "defaultCollateName");
            return (Criteria) this;
        }

        public Criteria andDefaultCollateNameGreaterThanOrEqualTo(Object value) {
            addCriterion("default_collate_name >=", value, "defaultCollateName");
            return (Criteria) this;
        }

        public Criteria andDefaultCollateNameLessThan(Object value) {
            addCriterion("default_collate_name <", value, "defaultCollateName");
            return (Criteria) this;
        }

        public Criteria andDefaultCollateNameLessThanOrEqualTo(Object value) {
            addCriterion("default_collate_name <=", value, "defaultCollateName");
            return (Criteria) this;
        }

        public Criteria andDefaultCollateNameIn(List<Object> values) {
            addCriterion("default_collate_name in", values, "defaultCollateName");
            return (Criteria) this;
        }

        public Criteria andDefaultCollateNameNotIn(List<Object> values) {
            addCriterion("default_collate_name not in", values, "defaultCollateName");
            return (Criteria) this;
        }

        public Criteria andDefaultCollateNameBetween(Object value1, Object value2) {
            addCriterion("default_collate_name between", value1, value2, "defaultCollateName");
            return (Criteria) this;
        }

        public Criteria andDefaultCollateNameNotBetween(Object value1, Object value2) {
            addCriterion("default_collate_name not between", value1, value2, "defaultCollateName");
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