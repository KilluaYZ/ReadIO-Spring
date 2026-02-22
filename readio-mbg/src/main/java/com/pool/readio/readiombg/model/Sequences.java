package com.pool.readio.readiombg.model;

import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;

public class Sequences implements Serializable {
    private Object sequenceCatalog;

    private Object sequenceSchema;

    private Object sequenceName;

    private Object dataType;

    private Object numericPrecision;

    private Object numericPrecisionRadix;

    private Object numericScale;

    private Object startValue;

    private Object minimumValue;

    private Object maximumValue;

    private Object increment;

    private Object cycleOption;

    private static final long serialVersionUID = 1L;

    public Object getSequenceCatalog() {
        return sequenceCatalog;
    }

    public void setSequenceCatalog(Object sequenceCatalog) {
        this.sequenceCatalog = sequenceCatalog;
    }

    public Object getSequenceSchema() {
        return sequenceSchema;
    }

    public void setSequenceSchema(Object sequenceSchema) {
        this.sequenceSchema = sequenceSchema;
    }

    public Object getSequenceName() {
        return sequenceName;
    }

    public void setSequenceName(Object sequenceName) {
        this.sequenceName = sequenceName;
    }

    public Object getDataType() {
        return dataType;
    }

    public void setDataType(Object dataType) {
        this.dataType = dataType;
    }

    public Object getNumericPrecision() {
        return numericPrecision;
    }

    public void setNumericPrecision(Object numericPrecision) {
        this.numericPrecision = numericPrecision;
    }

    public Object getNumericPrecisionRadix() {
        return numericPrecisionRadix;
    }

    public void setNumericPrecisionRadix(Object numericPrecisionRadix) {
        this.numericPrecisionRadix = numericPrecisionRadix;
    }

    public Object getNumericScale() {
        return numericScale;
    }

    public void setNumericScale(Object numericScale) {
        this.numericScale = numericScale;
    }

    public Object getStartValue() {
        return startValue;
    }

    public void setStartValue(Object startValue) {
        this.startValue = startValue;
    }

    public Object getMinimumValue() {
        return minimumValue;
    }

    public void setMinimumValue(Object minimumValue) {
        this.minimumValue = minimumValue;
    }

    public Object getMaximumValue() {
        return maximumValue;
    }

    public void setMaximumValue(Object maximumValue) {
        this.maximumValue = maximumValue;
    }

    public Object getIncrement() {
        return increment;
    }

    public void setIncrement(Object increment) {
        this.increment = increment;
    }

    public Object getCycleOption() {
        return cycleOption;
    }

    public void setCycleOption(Object cycleOption) {
        this.cycleOption = cycleOption;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", sequenceCatalog=").append(sequenceCatalog);
        sb.append(", sequenceSchema=").append(sequenceSchema);
        sb.append(", sequenceName=").append(sequenceName);
        sb.append(", dataType=").append(dataType);
        sb.append(", numericPrecision=").append(numericPrecision);
        sb.append(", numericPrecisionRadix=").append(numericPrecisionRadix);
        sb.append(", numericScale=").append(numericScale);
        sb.append(", startValue=").append(startValue);
        sb.append(", minimumValue=").append(minimumValue);
        sb.append(", maximumValue=").append(maximumValue);
        sb.append(", increment=").append(increment);
        sb.append(", cycleOption=").append(cycleOption);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}