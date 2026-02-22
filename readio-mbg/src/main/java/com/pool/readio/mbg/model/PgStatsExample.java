package com.pool.readio.mbg.model;

import java.util.ArrayList;
import java.util.List;

public class PgStatsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PgStatsExample() {
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

        public Criteria andTablenameIsNull() {
            addCriterion("tablename is null");
            return (Criteria) this;
        }

        public Criteria andTablenameIsNotNull() {
            addCriterion("tablename is not null");
            return (Criteria) this;
        }

        public Criteria andTablenameEqualTo(String value) {
            addCriterion("tablename =", value, "tablename");
            return (Criteria) this;
        }

        public Criteria andTablenameNotEqualTo(String value) {
            addCriterion("tablename <>", value, "tablename");
            return (Criteria) this;
        }

        public Criteria andTablenameGreaterThan(String value) {
            addCriterion("tablename >", value, "tablename");
            return (Criteria) this;
        }

        public Criteria andTablenameGreaterThanOrEqualTo(String value) {
            addCriterion("tablename >=", value, "tablename");
            return (Criteria) this;
        }

        public Criteria andTablenameLessThan(String value) {
            addCriterion("tablename <", value, "tablename");
            return (Criteria) this;
        }

        public Criteria andTablenameLessThanOrEqualTo(String value) {
            addCriterion("tablename <=", value, "tablename");
            return (Criteria) this;
        }

        public Criteria andTablenameLike(String value) {
            addCriterion("tablename like", value, "tablename");
            return (Criteria) this;
        }

        public Criteria andTablenameNotLike(String value) {
            addCriterion("tablename not like", value, "tablename");
            return (Criteria) this;
        }

        public Criteria andTablenameIn(List<String> values) {
            addCriterion("tablename in", values, "tablename");
            return (Criteria) this;
        }

        public Criteria andTablenameNotIn(List<String> values) {
            addCriterion("tablename not in", values, "tablename");
            return (Criteria) this;
        }

        public Criteria andTablenameBetween(String value1, String value2) {
            addCriterion("tablename between", value1, value2, "tablename");
            return (Criteria) this;
        }

        public Criteria andTablenameNotBetween(String value1, String value2) {
            addCriterion("tablename not between", value1, value2, "tablename");
            return (Criteria) this;
        }

        public Criteria andAttnameIsNull() {
            addCriterion("attname is null");
            return (Criteria) this;
        }

        public Criteria andAttnameIsNotNull() {
            addCriterion("attname is not null");
            return (Criteria) this;
        }

        public Criteria andAttnameEqualTo(String value) {
            addCriterion("attname =", value, "attname");
            return (Criteria) this;
        }

        public Criteria andAttnameNotEqualTo(String value) {
            addCriterion("attname <>", value, "attname");
            return (Criteria) this;
        }

        public Criteria andAttnameGreaterThan(String value) {
            addCriterion("attname >", value, "attname");
            return (Criteria) this;
        }

        public Criteria andAttnameGreaterThanOrEqualTo(String value) {
            addCriterion("attname >=", value, "attname");
            return (Criteria) this;
        }

        public Criteria andAttnameLessThan(String value) {
            addCriterion("attname <", value, "attname");
            return (Criteria) this;
        }

        public Criteria andAttnameLessThanOrEqualTo(String value) {
            addCriterion("attname <=", value, "attname");
            return (Criteria) this;
        }

        public Criteria andAttnameLike(String value) {
            addCriterion("attname like", value, "attname");
            return (Criteria) this;
        }

        public Criteria andAttnameNotLike(String value) {
            addCriterion("attname not like", value, "attname");
            return (Criteria) this;
        }

        public Criteria andAttnameIn(List<String> values) {
            addCriterion("attname in", values, "attname");
            return (Criteria) this;
        }

        public Criteria andAttnameNotIn(List<String> values) {
            addCriterion("attname not in", values, "attname");
            return (Criteria) this;
        }

        public Criteria andAttnameBetween(String value1, String value2) {
            addCriterion("attname between", value1, value2, "attname");
            return (Criteria) this;
        }

        public Criteria andAttnameNotBetween(String value1, String value2) {
            addCriterion("attname not between", value1, value2, "attname");
            return (Criteria) this;
        }

        public Criteria andInheritedIsNull() {
            addCriterion("inherited is null");
            return (Criteria) this;
        }

        public Criteria andInheritedIsNotNull() {
            addCriterion("inherited is not null");
            return (Criteria) this;
        }

        public Criteria andInheritedEqualTo(Boolean value) {
            addCriterion("inherited =", value, "inherited");
            return (Criteria) this;
        }

        public Criteria andInheritedNotEqualTo(Boolean value) {
            addCriterion("inherited <>", value, "inherited");
            return (Criteria) this;
        }

        public Criteria andInheritedGreaterThan(Boolean value) {
            addCriterion("inherited >", value, "inherited");
            return (Criteria) this;
        }

        public Criteria andInheritedGreaterThanOrEqualTo(Boolean value) {
            addCriterion("inherited >=", value, "inherited");
            return (Criteria) this;
        }

        public Criteria andInheritedLessThan(Boolean value) {
            addCriterion("inherited <", value, "inherited");
            return (Criteria) this;
        }

        public Criteria andInheritedLessThanOrEqualTo(Boolean value) {
            addCriterion("inherited <=", value, "inherited");
            return (Criteria) this;
        }

        public Criteria andInheritedIn(List<Boolean> values) {
            addCriterion("inherited in", values, "inherited");
            return (Criteria) this;
        }

        public Criteria andInheritedNotIn(List<Boolean> values) {
            addCriterion("inherited not in", values, "inherited");
            return (Criteria) this;
        }

        public Criteria andInheritedBetween(Boolean value1, Boolean value2) {
            addCriterion("inherited between", value1, value2, "inherited");
            return (Criteria) this;
        }

        public Criteria andInheritedNotBetween(Boolean value1, Boolean value2) {
            addCriterion("inherited not between", value1, value2, "inherited");
            return (Criteria) this;
        }

        public Criteria andNullFracIsNull() {
            addCriterion("null_frac is null");
            return (Criteria) this;
        }

        public Criteria andNullFracIsNotNull() {
            addCriterion("null_frac is not null");
            return (Criteria) this;
        }

        public Criteria andNullFracEqualTo(Float value) {
            addCriterion("null_frac =", value, "nullFrac");
            return (Criteria) this;
        }

        public Criteria andNullFracNotEqualTo(Float value) {
            addCriterion("null_frac <>", value, "nullFrac");
            return (Criteria) this;
        }

        public Criteria andNullFracGreaterThan(Float value) {
            addCriterion("null_frac >", value, "nullFrac");
            return (Criteria) this;
        }

        public Criteria andNullFracGreaterThanOrEqualTo(Float value) {
            addCriterion("null_frac >=", value, "nullFrac");
            return (Criteria) this;
        }

        public Criteria andNullFracLessThan(Float value) {
            addCriterion("null_frac <", value, "nullFrac");
            return (Criteria) this;
        }

        public Criteria andNullFracLessThanOrEqualTo(Float value) {
            addCriterion("null_frac <=", value, "nullFrac");
            return (Criteria) this;
        }

        public Criteria andNullFracIn(List<Float> values) {
            addCriterion("null_frac in", values, "nullFrac");
            return (Criteria) this;
        }

        public Criteria andNullFracNotIn(List<Float> values) {
            addCriterion("null_frac not in", values, "nullFrac");
            return (Criteria) this;
        }

        public Criteria andNullFracBetween(Float value1, Float value2) {
            addCriterion("null_frac between", value1, value2, "nullFrac");
            return (Criteria) this;
        }

        public Criteria andNullFracNotBetween(Float value1, Float value2) {
            addCriterion("null_frac not between", value1, value2, "nullFrac");
            return (Criteria) this;
        }

        public Criteria andAvgWidthIsNull() {
            addCriterion("avg_width is null");
            return (Criteria) this;
        }

        public Criteria andAvgWidthIsNotNull() {
            addCriterion("avg_width is not null");
            return (Criteria) this;
        }

        public Criteria andAvgWidthEqualTo(Integer value) {
            addCriterion("avg_width =", value, "avgWidth");
            return (Criteria) this;
        }

        public Criteria andAvgWidthNotEqualTo(Integer value) {
            addCriterion("avg_width <>", value, "avgWidth");
            return (Criteria) this;
        }

        public Criteria andAvgWidthGreaterThan(Integer value) {
            addCriterion("avg_width >", value, "avgWidth");
            return (Criteria) this;
        }

        public Criteria andAvgWidthGreaterThanOrEqualTo(Integer value) {
            addCriterion("avg_width >=", value, "avgWidth");
            return (Criteria) this;
        }

        public Criteria andAvgWidthLessThan(Integer value) {
            addCriterion("avg_width <", value, "avgWidth");
            return (Criteria) this;
        }

        public Criteria andAvgWidthLessThanOrEqualTo(Integer value) {
            addCriterion("avg_width <=", value, "avgWidth");
            return (Criteria) this;
        }

        public Criteria andAvgWidthIn(List<Integer> values) {
            addCriterion("avg_width in", values, "avgWidth");
            return (Criteria) this;
        }

        public Criteria andAvgWidthNotIn(List<Integer> values) {
            addCriterion("avg_width not in", values, "avgWidth");
            return (Criteria) this;
        }

        public Criteria andAvgWidthBetween(Integer value1, Integer value2) {
            addCriterion("avg_width between", value1, value2, "avgWidth");
            return (Criteria) this;
        }

        public Criteria andAvgWidthNotBetween(Integer value1, Integer value2) {
            addCriterion("avg_width not between", value1, value2, "avgWidth");
            return (Criteria) this;
        }

        public Criteria andNDistinctIsNull() {
            addCriterion("n_distinct is null");
            return (Criteria) this;
        }

        public Criteria andNDistinctIsNotNull() {
            addCriterion("n_distinct is not null");
            return (Criteria) this;
        }

        public Criteria andNDistinctEqualTo(Float value) {
            addCriterion("n_distinct =", value, "nDistinct");
            return (Criteria) this;
        }

        public Criteria andNDistinctNotEqualTo(Float value) {
            addCriterion("n_distinct <>", value, "nDistinct");
            return (Criteria) this;
        }

        public Criteria andNDistinctGreaterThan(Float value) {
            addCriterion("n_distinct >", value, "nDistinct");
            return (Criteria) this;
        }

        public Criteria andNDistinctGreaterThanOrEqualTo(Float value) {
            addCriterion("n_distinct >=", value, "nDistinct");
            return (Criteria) this;
        }

        public Criteria andNDistinctLessThan(Float value) {
            addCriterion("n_distinct <", value, "nDistinct");
            return (Criteria) this;
        }

        public Criteria andNDistinctLessThanOrEqualTo(Float value) {
            addCriterion("n_distinct <=", value, "nDistinct");
            return (Criteria) this;
        }

        public Criteria andNDistinctIn(List<Float> values) {
            addCriterion("n_distinct in", values, "nDistinct");
            return (Criteria) this;
        }

        public Criteria andNDistinctNotIn(List<Float> values) {
            addCriterion("n_distinct not in", values, "nDistinct");
            return (Criteria) this;
        }

        public Criteria andNDistinctBetween(Float value1, Float value2) {
            addCriterion("n_distinct between", value1, value2, "nDistinct");
            return (Criteria) this;
        }

        public Criteria andNDistinctNotBetween(Float value1, Float value2) {
            addCriterion("n_distinct not between", value1, value2, "nDistinct");
            return (Criteria) this;
        }

        public Criteria andMostCommonValsIsNull() {
            addCriterion("most_common_vals is null");
            return (Criteria) this;
        }

        public Criteria andMostCommonValsIsNotNull() {
            addCriterion("most_common_vals is not null");
            return (Criteria) this;
        }

        public Criteria andMostCommonValsEqualTo(Object value) {
            addCriterion("most_common_vals =", value, "mostCommonVals");
            return (Criteria) this;
        }

        public Criteria andMostCommonValsNotEqualTo(Object value) {
            addCriterion("most_common_vals <>", value, "mostCommonVals");
            return (Criteria) this;
        }

        public Criteria andMostCommonValsGreaterThan(Object value) {
            addCriterion("most_common_vals >", value, "mostCommonVals");
            return (Criteria) this;
        }

        public Criteria andMostCommonValsGreaterThanOrEqualTo(Object value) {
            addCriterion("most_common_vals >=", value, "mostCommonVals");
            return (Criteria) this;
        }

        public Criteria andMostCommonValsLessThan(Object value) {
            addCriterion("most_common_vals <", value, "mostCommonVals");
            return (Criteria) this;
        }

        public Criteria andMostCommonValsLessThanOrEqualTo(Object value) {
            addCriterion("most_common_vals <=", value, "mostCommonVals");
            return (Criteria) this;
        }

        public Criteria andMostCommonValsIn(List<Object> values) {
            addCriterion("most_common_vals in", values, "mostCommonVals");
            return (Criteria) this;
        }

        public Criteria andMostCommonValsNotIn(List<Object> values) {
            addCriterion("most_common_vals not in", values, "mostCommonVals");
            return (Criteria) this;
        }

        public Criteria andMostCommonValsBetween(Object value1, Object value2) {
            addCriterion("most_common_vals between", value1, value2, "mostCommonVals");
            return (Criteria) this;
        }

        public Criteria andMostCommonValsNotBetween(Object value1, Object value2) {
            addCriterion("most_common_vals not between", value1, value2, "mostCommonVals");
            return (Criteria) this;
        }

        public Criteria andMostCommonFreqsIsNull() {
            addCriterion("most_common_freqs is null");
            return (Criteria) this;
        }

        public Criteria andMostCommonFreqsIsNotNull() {
            addCriterion("most_common_freqs is not null");
            return (Criteria) this;
        }

        public Criteria andMostCommonFreqsEqualTo(Object value) {
            addCriterion("most_common_freqs =", value, "mostCommonFreqs");
            return (Criteria) this;
        }

        public Criteria andMostCommonFreqsNotEqualTo(Object value) {
            addCriterion("most_common_freqs <>", value, "mostCommonFreqs");
            return (Criteria) this;
        }

        public Criteria andMostCommonFreqsGreaterThan(Object value) {
            addCriterion("most_common_freqs >", value, "mostCommonFreqs");
            return (Criteria) this;
        }

        public Criteria andMostCommonFreqsGreaterThanOrEqualTo(Object value) {
            addCriterion("most_common_freqs >=", value, "mostCommonFreqs");
            return (Criteria) this;
        }

        public Criteria andMostCommonFreqsLessThan(Object value) {
            addCriterion("most_common_freqs <", value, "mostCommonFreqs");
            return (Criteria) this;
        }

        public Criteria andMostCommonFreqsLessThanOrEqualTo(Object value) {
            addCriterion("most_common_freqs <=", value, "mostCommonFreqs");
            return (Criteria) this;
        }

        public Criteria andMostCommonFreqsIn(List<Object> values) {
            addCriterion("most_common_freqs in", values, "mostCommonFreqs");
            return (Criteria) this;
        }

        public Criteria andMostCommonFreqsNotIn(List<Object> values) {
            addCriterion("most_common_freqs not in", values, "mostCommonFreqs");
            return (Criteria) this;
        }

        public Criteria andMostCommonFreqsBetween(Object value1, Object value2) {
            addCriterion("most_common_freqs between", value1, value2, "mostCommonFreqs");
            return (Criteria) this;
        }

        public Criteria andMostCommonFreqsNotBetween(Object value1, Object value2) {
            addCriterion("most_common_freqs not between", value1, value2, "mostCommonFreqs");
            return (Criteria) this;
        }

        public Criteria andHistogramBoundsIsNull() {
            addCriterion("histogram_bounds is null");
            return (Criteria) this;
        }

        public Criteria andHistogramBoundsIsNotNull() {
            addCriterion("histogram_bounds is not null");
            return (Criteria) this;
        }

        public Criteria andHistogramBoundsEqualTo(Object value) {
            addCriterion("histogram_bounds =", value, "histogramBounds");
            return (Criteria) this;
        }

        public Criteria andHistogramBoundsNotEqualTo(Object value) {
            addCriterion("histogram_bounds <>", value, "histogramBounds");
            return (Criteria) this;
        }

        public Criteria andHistogramBoundsGreaterThan(Object value) {
            addCriterion("histogram_bounds >", value, "histogramBounds");
            return (Criteria) this;
        }

        public Criteria andHistogramBoundsGreaterThanOrEqualTo(Object value) {
            addCriterion("histogram_bounds >=", value, "histogramBounds");
            return (Criteria) this;
        }

        public Criteria andHistogramBoundsLessThan(Object value) {
            addCriterion("histogram_bounds <", value, "histogramBounds");
            return (Criteria) this;
        }

        public Criteria andHistogramBoundsLessThanOrEqualTo(Object value) {
            addCriterion("histogram_bounds <=", value, "histogramBounds");
            return (Criteria) this;
        }

        public Criteria andHistogramBoundsIn(List<Object> values) {
            addCriterion("histogram_bounds in", values, "histogramBounds");
            return (Criteria) this;
        }

        public Criteria andHistogramBoundsNotIn(List<Object> values) {
            addCriterion("histogram_bounds not in", values, "histogramBounds");
            return (Criteria) this;
        }

        public Criteria andHistogramBoundsBetween(Object value1, Object value2) {
            addCriterion("histogram_bounds between", value1, value2, "histogramBounds");
            return (Criteria) this;
        }

        public Criteria andHistogramBoundsNotBetween(Object value1, Object value2) {
            addCriterion("histogram_bounds not between", value1, value2, "histogramBounds");
            return (Criteria) this;
        }

        public Criteria andCorrelationIsNull() {
            addCriterion("correlation is null");
            return (Criteria) this;
        }

        public Criteria andCorrelationIsNotNull() {
            addCriterion("correlation is not null");
            return (Criteria) this;
        }

        public Criteria andCorrelationEqualTo(Float value) {
            addCriterion("correlation =", value, "correlation");
            return (Criteria) this;
        }

        public Criteria andCorrelationNotEqualTo(Float value) {
            addCriterion("correlation <>", value, "correlation");
            return (Criteria) this;
        }

        public Criteria andCorrelationGreaterThan(Float value) {
            addCriterion("correlation >", value, "correlation");
            return (Criteria) this;
        }

        public Criteria andCorrelationGreaterThanOrEqualTo(Float value) {
            addCriterion("correlation >=", value, "correlation");
            return (Criteria) this;
        }

        public Criteria andCorrelationLessThan(Float value) {
            addCriterion("correlation <", value, "correlation");
            return (Criteria) this;
        }

        public Criteria andCorrelationLessThanOrEqualTo(Float value) {
            addCriterion("correlation <=", value, "correlation");
            return (Criteria) this;
        }

        public Criteria andCorrelationIn(List<Float> values) {
            addCriterion("correlation in", values, "correlation");
            return (Criteria) this;
        }

        public Criteria andCorrelationNotIn(List<Float> values) {
            addCriterion("correlation not in", values, "correlation");
            return (Criteria) this;
        }

        public Criteria andCorrelationBetween(Float value1, Float value2) {
            addCriterion("correlation between", value1, value2, "correlation");
            return (Criteria) this;
        }

        public Criteria andCorrelationNotBetween(Float value1, Float value2) {
            addCriterion("correlation not between", value1, value2, "correlation");
            return (Criteria) this;
        }

        public Criteria andMostCommonElemsIsNull() {
            addCriterion("most_common_elems is null");
            return (Criteria) this;
        }

        public Criteria andMostCommonElemsIsNotNull() {
            addCriterion("most_common_elems is not null");
            return (Criteria) this;
        }

        public Criteria andMostCommonElemsEqualTo(Object value) {
            addCriterion("most_common_elems =", value, "mostCommonElems");
            return (Criteria) this;
        }

        public Criteria andMostCommonElemsNotEqualTo(Object value) {
            addCriterion("most_common_elems <>", value, "mostCommonElems");
            return (Criteria) this;
        }

        public Criteria andMostCommonElemsGreaterThan(Object value) {
            addCriterion("most_common_elems >", value, "mostCommonElems");
            return (Criteria) this;
        }

        public Criteria andMostCommonElemsGreaterThanOrEqualTo(Object value) {
            addCriterion("most_common_elems >=", value, "mostCommonElems");
            return (Criteria) this;
        }

        public Criteria andMostCommonElemsLessThan(Object value) {
            addCriterion("most_common_elems <", value, "mostCommonElems");
            return (Criteria) this;
        }

        public Criteria andMostCommonElemsLessThanOrEqualTo(Object value) {
            addCriterion("most_common_elems <=", value, "mostCommonElems");
            return (Criteria) this;
        }

        public Criteria andMostCommonElemsIn(List<Object> values) {
            addCriterion("most_common_elems in", values, "mostCommonElems");
            return (Criteria) this;
        }

        public Criteria andMostCommonElemsNotIn(List<Object> values) {
            addCriterion("most_common_elems not in", values, "mostCommonElems");
            return (Criteria) this;
        }

        public Criteria andMostCommonElemsBetween(Object value1, Object value2) {
            addCriterion("most_common_elems between", value1, value2, "mostCommonElems");
            return (Criteria) this;
        }

        public Criteria andMostCommonElemsNotBetween(Object value1, Object value2) {
            addCriterion("most_common_elems not between", value1, value2, "mostCommonElems");
            return (Criteria) this;
        }

        public Criteria andMostCommonElemFreqsIsNull() {
            addCriterion("most_common_elem_freqs is null");
            return (Criteria) this;
        }

        public Criteria andMostCommonElemFreqsIsNotNull() {
            addCriterion("most_common_elem_freqs is not null");
            return (Criteria) this;
        }

        public Criteria andMostCommonElemFreqsEqualTo(Object value) {
            addCriterion("most_common_elem_freqs =", value, "mostCommonElemFreqs");
            return (Criteria) this;
        }

        public Criteria andMostCommonElemFreqsNotEqualTo(Object value) {
            addCriterion("most_common_elem_freqs <>", value, "mostCommonElemFreqs");
            return (Criteria) this;
        }

        public Criteria andMostCommonElemFreqsGreaterThan(Object value) {
            addCriterion("most_common_elem_freqs >", value, "mostCommonElemFreqs");
            return (Criteria) this;
        }

        public Criteria andMostCommonElemFreqsGreaterThanOrEqualTo(Object value) {
            addCriterion("most_common_elem_freqs >=", value, "mostCommonElemFreqs");
            return (Criteria) this;
        }

        public Criteria andMostCommonElemFreqsLessThan(Object value) {
            addCriterion("most_common_elem_freqs <", value, "mostCommonElemFreqs");
            return (Criteria) this;
        }

        public Criteria andMostCommonElemFreqsLessThanOrEqualTo(Object value) {
            addCriterion("most_common_elem_freqs <=", value, "mostCommonElemFreqs");
            return (Criteria) this;
        }

        public Criteria andMostCommonElemFreqsIn(List<Object> values) {
            addCriterion("most_common_elem_freqs in", values, "mostCommonElemFreqs");
            return (Criteria) this;
        }

        public Criteria andMostCommonElemFreqsNotIn(List<Object> values) {
            addCriterion("most_common_elem_freqs not in", values, "mostCommonElemFreqs");
            return (Criteria) this;
        }

        public Criteria andMostCommonElemFreqsBetween(Object value1, Object value2) {
            addCriterion("most_common_elem_freqs between", value1, value2, "mostCommonElemFreqs");
            return (Criteria) this;
        }

        public Criteria andMostCommonElemFreqsNotBetween(Object value1, Object value2) {
            addCriterion("most_common_elem_freqs not between", value1, value2, "mostCommonElemFreqs");
            return (Criteria) this;
        }

        public Criteria andElemCountHistogramIsNull() {
            addCriterion("elem_count_histogram is null");
            return (Criteria) this;
        }

        public Criteria andElemCountHistogramIsNotNull() {
            addCriterion("elem_count_histogram is not null");
            return (Criteria) this;
        }

        public Criteria andElemCountHistogramEqualTo(Object value) {
            addCriterion("elem_count_histogram =", value, "elemCountHistogram");
            return (Criteria) this;
        }

        public Criteria andElemCountHistogramNotEqualTo(Object value) {
            addCriterion("elem_count_histogram <>", value, "elemCountHistogram");
            return (Criteria) this;
        }

        public Criteria andElemCountHistogramGreaterThan(Object value) {
            addCriterion("elem_count_histogram >", value, "elemCountHistogram");
            return (Criteria) this;
        }

        public Criteria andElemCountHistogramGreaterThanOrEqualTo(Object value) {
            addCriterion("elem_count_histogram >=", value, "elemCountHistogram");
            return (Criteria) this;
        }

        public Criteria andElemCountHistogramLessThan(Object value) {
            addCriterion("elem_count_histogram <", value, "elemCountHistogram");
            return (Criteria) this;
        }

        public Criteria andElemCountHistogramLessThanOrEqualTo(Object value) {
            addCriterion("elem_count_histogram <=", value, "elemCountHistogram");
            return (Criteria) this;
        }

        public Criteria andElemCountHistogramIn(List<Object> values) {
            addCriterion("elem_count_histogram in", values, "elemCountHistogram");
            return (Criteria) this;
        }

        public Criteria andElemCountHistogramNotIn(List<Object> values) {
            addCriterion("elem_count_histogram not in", values, "elemCountHistogram");
            return (Criteria) this;
        }

        public Criteria andElemCountHistogramBetween(Object value1, Object value2) {
            addCriterion("elem_count_histogram between", value1, value2, "elemCountHistogram");
            return (Criteria) this;
        }

        public Criteria andElemCountHistogramNotBetween(Object value1, Object value2) {
            addCriterion("elem_count_histogram not between", value1, value2, "elemCountHistogram");
            return (Criteria) this;
        }

        public Criteria andRangeLengthHistogramIsNull() {
            addCriterion("range_length_histogram is null");
            return (Criteria) this;
        }

        public Criteria andRangeLengthHistogramIsNotNull() {
            addCriterion("range_length_histogram is not null");
            return (Criteria) this;
        }

        public Criteria andRangeLengthHistogramEqualTo(Object value) {
            addCriterion("range_length_histogram =", value, "rangeLengthHistogram");
            return (Criteria) this;
        }

        public Criteria andRangeLengthHistogramNotEqualTo(Object value) {
            addCriterion("range_length_histogram <>", value, "rangeLengthHistogram");
            return (Criteria) this;
        }

        public Criteria andRangeLengthHistogramGreaterThan(Object value) {
            addCriterion("range_length_histogram >", value, "rangeLengthHistogram");
            return (Criteria) this;
        }

        public Criteria andRangeLengthHistogramGreaterThanOrEqualTo(Object value) {
            addCriterion("range_length_histogram >=", value, "rangeLengthHistogram");
            return (Criteria) this;
        }

        public Criteria andRangeLengthHistogramLessThan(Object value) {
            addCriterion("range_length_histogram <", value, "rangeLengthHistogram");
            return (Criteria) this;
        }

        public Criteria andRangeLengthHistogramLessThanOrEqualTo(Object value) {
            addCriterion("range_length_histogram <=", value, "rangeLengthHistogram");
            return (Criteria) this;
        }

        public Criteria andRangeLengthHistogramIn(List<Object> values) {
            addCriterion("range_length_histogram in", values, "rangeLengthHistogram");
            return (Criteria) this;
        }

        public Criteria andRangeLengthHistogramNotIn(List<Object> values) {
            addCriterion("range_length_histogram not in", values, "rangeLengthHistogram");
            return (Criteria) this;
        }

        public Criteria andRangeLengthHistogramBetween(Object value1, Object value2) {
            addCriterion("range_length_histogram between", value1, value2, "rangeLengthHistogram");
            return (Criteria) this;
        }

        public Criteria andRangeLengthHistogramNotBetween(Object value1, Object value2) {
            addCriterion("range_length_histogram not between", value1, value2, "rangeLengthHistogram");
            return (Criteria) this;
        }

        public Criteria andRangeEmptyFracIsNull() {
            addCriterion("range_empty_frac is null");
            return (Criteria) this;
        }

        public Criteria andRangeEmptyFracIsNotNull() {
            addCriterion("range_empty_frac is not null");
            return (Criteria) this;
        }

        public Criteria andRangeEmptyFracEqualTo(Float value) {
            addCriterion("range_empty_frac =", value, "rangeEmptyFrac");
            return (Criteria) this;
        }

        public Criteria andRangeEmptyFracNotEqualTo(Float value) {
            addCriterion("range_empty_frac <>", value, "rangeEmptyFrac");
            return (Criteria) this;
        }

        public Criteria andRangeEmptyFracGreaterThan(Float value) {
            addCriterion("range_empty_frac >", value, "rangeEmptyFrac");
            return (Criteria) this;
        }

        public Criteria andRangeEmptyFracGreaterThanOrEqualTo(Float value) {
            addCriterion("range_empty_frac >=", value, "rangeEmptyFrac");
            return (Criteria) this;
        }

        public Criteria andRangeEmptyFracLessThan(Float value) {
            addCriterion("range_empty_frac <", value, "rangeEmptyFrac");
            return (Criteria) this;
        }

        public Criteria andRangeEmptyFracLessThanOrEqualTo(Float value) {
            addCriterion("range_empty_frac <=", value, "rangeEmptyFrac");
            return (Criteria) this;
        }

        public Criteria andRangeEmptyFracIn(List<Float> values) {
            addCriterion("range_empty_frac in", values, "rangeEmptyFrac");
            return (Criteria) this;
        }

        public Criteria andRangeEmptyFracNotIn(List<Float> values) {
            addCriterion("range_empty_frac not in", values, "rangeEmptyFrac");
            return (Criteria) this;
        }

        public Criteria andRangeEmptyFracBetween(Float value1, Float value2) {
            addCriterion("range_empty_frac between", value1, value2, "rangeEmptyFrac");
            return (Criteria) this;
        }

        public Criteria andRangeEmptyFracNotBetween(Float value1, Float value2) {
            addCriterion("range_empty_frac not between", value1, value2, "rangeEmptyFrac");
            return (Criteria) this;
        }

        public Criteria andRangeBoundsHistogramIsNull() {
            addCriterion("range_bounds_histogram is null");
            return (Criteria) this;
        }

        public Criteria andRangeBoundsHistogramIsNotNull() {
            addCriterion("range_bounds_histogram is not null");
            return (Criteria) this;
        }

        public Criteria andRangeBoundsHistogramEqualTo(Object value) {
            addCriterion("range_bounds_histogram =", value, "rangeBoundsHistogram");
            return (Criteria) this;
        }

        public Criteria andRangeBoundsHistogramNotEqualTo(Object value) {
            addCriterion("range_bounds_histogram <>", value, "rangeBoundsHistogram");
            return (Criteria) this;
        }

        public Criteria andRangeBoundsHistogramGreaterThan(Object value) {
            addCriterion("range_bounds_histogram >", value, "rangeBoundsHistogram");
            return (Criteria) this;
        }

        public Criteria andRangeBoundsHistogramGreaterThanOrEqualTo(Object value) {
            addCriterion("range_bounds_histogram >=", value, "rangeBoundsHistogram");
            return (Criteria) this;
        }

        public Criteria andRangeBoundsHistogramLessThan(Object value) {
            addCriterion("range_bounds_histogram <", value, "rangeBoundsHistogram");
            return (Criteria) this;
        }

        public Criteria andRangeBoundsHistogramLessThanOrEqualTo(Object value) {
            addCriterion("range_bounds_histogram <=", value, "rangeBoundsHistogram");
            return (Criteria) this;
        }

        public Criteria andRangeBoundsHistogramIn(List<Object> values) {
            addCriterion("range_bounds_histogram in", values, "rangeBoundsHistogram");
            return (Criteria) this;
        }

        public Criteria andRangeBoundsHistogramNotIn(List<Object> values) {
            addCriterion("range_bounds_histogram not in", values, "rangeBoundsHistogram");
            return (Criteria) this;
        }

        public Criteria andRangeBoundsHistogramBetween(Object value1, Object value2) {
            addCriterion("range_bounds_histogram between", value1, value2, "rangeBoundsHistogram");
            return (Criteria) this;
        }

        public Criteria andRangeBoundsHistogramNotBetween(Object value1, Object value2) {
            addCriterion("range_bounds_histogram not between", value1, value2, "rangeBoundsHistogram");
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