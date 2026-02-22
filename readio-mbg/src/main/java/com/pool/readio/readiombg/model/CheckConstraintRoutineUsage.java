package com.pool.readio.readiombg.model;

import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;

public class CheckConstraintRoutineUsage implements Serializable {
    private Object constraintCatalog;

    private Object constraintSchema;

    private Object constraintName;

    private Object specificCatalog;

    private Object specificSchema;

    private Object specificName;

    private static final long serialVersionUID = 1L;

    public Object getConstraintCatalog() {
        return constraintCatalog;
    }

    public void setConstraintCatalog(Object constraintCatalog) {
        this.constraintCatalog = constraintCatalog;
    }

    public Object getConstraintSchema() {
        return constraintSchema;
    }

    public void setConstraintSchema(Object constraintSchema) {
        this.constraintSchema = constraintSchema;
    }

    public Object getConstraintName() {
        return constraintName;
    }

    public void setConstraintName(Object constraintName) {
        this.constraintName = constraintName;
    }

    public Object getSpecificCatalog() {
        return specificCatalog;
    }

    public void setSpecificCatalog(Object specificCatalog) {
        this.specificCatalog = specificCatalog;
    }

    public Object getSpecificSchema() {
        return specificSchema;
    }

    public void setSpecificSchema(Object specificSchema) {
        this.specificSchema = specificSchema;
    }

    public Object getSpecificName() {
        return specificName;
    }

    public void setSpecificName(Object specificName) {
        this.specificName = specificName;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", constraintCatalog=").append(constraintCatalog);
        sb.append(", constraintSchema=").append(constraintSchema);
        sb.append(", constraintName=").append(constraintName);
        sb.append(", specificCatalog=").append(specificCatalog);
        sb.append(", specificSchema=").append(specificSchema);
        sb.append(", specificName=").append(specificName);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}