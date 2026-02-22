package com.pool.readio.readiombg.model;

import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;

public class CheckConstraints implements Serializable {
    private Object constraintCatalog;

    private Object constraintSchema;

    private Object constraintName;

    private Object checkClause;

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

    public Object getCheckClause() {
        return checkClause;
    }

    public void setCheckClause(Object checkClause) {
        this.checkClause = checkClause;
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
        sb.append(", checkClause=").append(checkClause);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}