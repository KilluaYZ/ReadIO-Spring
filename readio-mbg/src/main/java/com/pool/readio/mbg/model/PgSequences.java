package com.pool.readio.mbg.model;

import java.io.Serializable;

public class PgSequences implements Serializable {
    private String schemaname;

    private String sequencename;

    private String sequenceowner;

    private Object dataType;

    private Long startValue;

    private Long minValue;

    private Long maxValue;

    private Long incrementBy;

    private Boolean cycle;

    private Long cacheSize;

    private Long lastValue;

    private static final long serialVersionUID = 1L;

    public String getSchemaname() {
        return schemaname;
    }

    public void setSchemaname(String schemaname) {
        this.schemaname = schemaname;
    }

    public String getSequencename() {
        return sequencename;
    }

    public void setSequencename(String sequencename) {
        this.sequencename = sequencename;
    }

    public String getSequenceowner() {
        return sequenceowner;
    }

    public void setSequenceowner(String sequenceowner) {
        this.sequenceowner = sequenceowner;
    }

    public Object getDataType() {
        return dataType;
    }

    public void setDataType(Object dataType) {
        this.dataType = dataType;
    }

    public Long getStartValue() {
        return startValue;
    }

    public void setStartValue(Long startValue) {
        this.startValue = startValue;
    }

    public Long getMinValue() {
        return minValue;
    }

    public void setMinValue(Long minValue) {
        this.minValue = minValue;
    }

    public Long getMaxValue() {
        return maxValue;
    }

    public void setMaxValue(Long maxValue) {
        this.maxValue = maxValue;
    }

    public Long getIncrementBy() {
        return incrementBy;
    }

    public void setIncrementBy(Long incrementBy) {
        this.incrementBy = incrementBy;
    }

    public Boolean getCycle() {
        return cycle;
    }

    public void setCycle(Boolean cycle) {
        this.cycle = cycle;
    }

    public Long getCacheSize() {
        return cacheSize;
    }

    public void setCacheSize(Long cacheSize) {
        this.cacheSize = cacheSize;
    }

    public Long getLastValue() {
        return lastValue;
    }

    public void setLastValue(Long lastValue) {
        this.lastValue = lastValue;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", schemaname=").append(schemaname);
        sb.append(", sequencename=").append(sequencename);
        sb.append(", sequenceowner=").append(sequenceowner);
        sb.append(", dataType=").append(dataType);
        sb.append(", startValue=").append(startValue);
        sb.append(", minValue=").append(minValue);
        sb.append(", maxValue=").append(maxValue);
        sb.append(", incrementBy=").append(incrementBy);
        sb.append(", cycle=").append(cycle);
        sb.append(", cacheSize=").append(cacheSize);
        sb.append(", lastValue=").append(lastValue);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}