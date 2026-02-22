package com.pool.readio.mbg.model;

import java.io.Serializable;

public class TableConstraints implements Serializable {
    private Object constraintCatalog;

    private Object constraintSchema;

    private Object constraintName;

    private Object tableCatalog;

    private Object tableSchema;

    private Object tableName;

    private Object constraintType;

    private Object isDeferrable;

    private Object initiallyDeferred;

    private Object enforced;

    private Object nullsDistinct;

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

    public Object getTableCatalog() {
        return tableCatalog;
    }

    public void setTableCatalog(Object tableCatalog) {
        this.tableCatalog = tableCatalog;
    }

    public Object getTableSchema() {
        return tableSchema;
    }

    public void setTableSchema(Object tableSchema) {
        this.tableSchema = tableSchema;
    }

    public Object getTableName() {
        return tableName;
    }

    public void setTableName(Object tableName) {
        this.tableName = tableName;
    }

    public Object getConstraintType() {
        return constraintType;
    }

    public void setConstraintType(Object constraintType) {
        this.constraintType = constraintType;
    }

    public Object getIsDeferrable() {
        return isDeferrable;
    }

    public void setIsDeferrable(Object isDeferrable) {
        this.isDeferrable = isDeferrable;
    }

    public Object getInitiallyDeferred() {
        return initiallyDeferred;
    }

    public void setInitiallyDeferred(Object initiallyDeferred) {
        this.initiallyDeferred = initiallyDeferred;
    }

    public Object getEnforced() {
        return enforced;
    }

    public void setEnforced(Object enforced) {
        this.enforced = enforced;
    }

    public Object getNullsDistinct() {
        return nullsDistinct;
    }

    public void setNullsDistinct(Object nullsDistinct) {
        this.nullsDistinct = nullsDistinct;
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
        sb.append(", tableCatalog=").append(tableCatalog);
        sb.append(", tableSchema=").append(tableSchema);
        sb.append(", tableName=").append(tableName);
        sb.append(", constraintType=").append(constraintType);
        sb.append(", isDeferrable=").append(isDeferrable);
        sb.append(", initiallyDeferred=").append(initiallyDeferred);
        sb.append(", enforced=").append(enforced);
        sb.append(", nullsDistinct=").append(nullsDistinct);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}