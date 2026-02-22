package com.pool.readio.mbg.model;

import java.io.Serializable;

public class PgStats implements Serializable {
    private String schemaname;

    private String tablename;

    private String attname;

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

    private Object rangeLengthHistogram;

    private Float rangeEmptyFrac;

    private Object rangeBoundsHistogram;

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

    public String getAttname() {
        return attname;
    }

    public void setAttname(String attname) {
        this.attname = attname;
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

    public Object getRangeLengthHistogram() {
        return rangeLengthHistogram;
    }

    public void setRangeLengthHistogram(Object rangeLengthHistogram) {
        this.rangeLengthHistogram = rangeLengthHistogram;
    }

    public Float getRangeEmptyFrac() {
        return rangeEmptyFrac;
    }

    public void setRangeEmptyFrac(Float rangeEmptyFrac) {
        this.rangeEmptyFrac = rangeEmptyFrac;
    }

    public Object getRangeBoundsHistogram() {
        return rangeBoundsHistogram;
    }

    public void setRangeBoundsHistogram(Object rangeBoundsHistogram) {
        this.rangeBoundsHistogram = rangeBoundsHistogram;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", schemaname=").append(schemaname);
        sb.append(", tablename=").append(tablename);
        sb.append(", attname=").append(attname);
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
        sb.append(", rangeLengthHistogram=").append(rangeLengthHistogram);
        sb.append(", rangeEmptyFrac=").append(rangeEmptyFrac);
        sb.append(", rangeBoundsHistogram=").append(rangeBoundsHistogram);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}