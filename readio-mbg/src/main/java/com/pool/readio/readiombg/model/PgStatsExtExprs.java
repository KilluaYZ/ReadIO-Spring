package com.pool.readio.readiombg.model;

import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;

public class PgStatsExtExprs implements Serializable {
    private String schemaname;

    private String tablename;

    private String statisticsSchemaname;

    private String statisticsName;

    private String statisticsOwner;

    private String expr;

    private Boolean inherited;

    private Float nullFrac;

    private Integer avgWidth;

    private Float nDistinct;

    private Object mostCommonVals;

    private Object mostCommonFreqs;

    private Object histogramBounds;

    private Float correlation;

    private Object mostCommonElems;

    private Object mostCommonElemFreqs;

    private Object elemCountHistogram;

    private static final long serialVersionUID = 1L;

    public String getSchemaname() {
        return schemaname;
    }

    public void setSchemaname(String schemaname) {
        this.schemaname = schemaname;
    }

    public String getTablename() {
        return tablename;
    }

    public void setTablename(String tablename) {
        this.tablename = tablename;
    }

    public String getStatisticsSchemaname() {
        return statisticsSchemaname;
    }

    public void setStatisticsSchemaname(String statisticsSchemaname) {
        this.statisticsSchemaname = statisticsSchemaname;
    }

    public String getStatisticsName() {
        return statisticsName;
    }

    public void setStatisticsName(String statisticsName) {
        this.statisticsName = statisticsName;
    }

    public String getStatisticsOwner() {
        return statisticsOwner;
    }

    public void setStatisticsOwner(String statisticsOwner) {
        this.statisticsOwner = statisticsOwner;
    }

    public String getExpr() {
        return expr;
    }

    public void setExpr(String expr) {
        this.expr = expr;
    }

    public Boolean getInherited() {
        return inherited;
    }

    public void setInherited(Boolean inherited) {
        this.inherited = inherited;
    }

    public Float getNullFrac() {
        return nullFrac;
    }

    public void setNullFrac(Float nullFrac) {
        this.nullFrac = nullFrac;
    }

    public Integer getAvgWidth() {
        return avgWidth;
    }

    public void setAvgWidth(Integer avgWidth) {
        this.avgWidth = avgWidth;
    }

    public Float getnDistinct() {
        return nDistinct;
    }

    public void setnDistinct(Float nDistinct) {
        this.nDistinct = nDistinct;
    }

    public Object getMostCommonVals() {
        return mostCommonVals;
    }

    public void setMostCommonVals(Object mostCommonVals) {
        this.mostCommonVals = mostCommonVals;
    }

    public Object getMostCommonFreqs() {
        return mostCommonFreqs;
    }

    public void setMostCommonFreqs(Object mostCommonFreqs) {
        this.mostCommonFreqs = mostCommonFreqs;
    }

    public Object getHistogramBounds() {
        return histogramBounds;
    }

    public void setHistogramBounds(Object histogramBounds) {
        this.histogramBounds = histogramBounds;
    }

    public Float getCorrelation() {
        return correlation;
    }

    public void setCorrelation(Float correlation) {
        this.correlation = correlation;
    }

    public Object getMostCommonElems() {
        return mostCommonElems;
    }

    public void setMostCommonElems(Object mostCommonElems) {
        this.mostCommonElems = mostCommonElems;
    }

    public Object getMostCommonElemFreqs() {
        return mostCommonElemFreqs;
    }

    public void setMostCommonElemFreqs(Object mostCommonElemFreqs) {
        this.mostCommonElemFreqs = mostCommonElemFreqs;
    }

    public Object getElemCountHistogram() {
        return elemCountHistogram;
    }

    public void setElemCountHistogram(Object elemCountHistogram) {
        this.elemCountHistogram = elemCountHistogram;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", schemaname=").append(schemaname);
        sb.append(", tablename=").append(tablename);
        sb.append(", statisticsSchemaname=").append(statisticsSchemaname);
        sb.append(", statisticsName=").append(statisticsName);
        sb.append(", statisticsOwner=").append(statisticsOwner);
        sb.append(", expr=").append(expr);
        sb.append(", inherited=").append(inherited);
        sb.append(", nullFrac=").append(nullFrac);
        sb.append(", avgWidth=").append(avgWidth);
        sb.append(", nDistinct=").append(nDistinct);
        sb.append(", mostCommonVals=").append(mostCommonVals);
        sb.append(", mostCommonFreqs=").append(mostCommonFreqs);
        sb.append(", histogramBounds=").append(histogramBounds);
        sb.append(", correlation=").append(correlation);
        sb.append(", mostCommonElems=").append(mostCommonElems);
        sb.append(", mostCommonElemFreqs=").append(mostCommonElemFreqs);
        sb.append(", elemCountHistogram=").append(elemCountHistogram);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}