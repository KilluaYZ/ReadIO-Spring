package com.pool.readio.readiombg.model;

import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;

public class ConstraintColumnUsage implements Serializable {
    private Object tableCatalog;

    private Object tableSchema;

    private Object tableName;

    private Object columnName;

    private Object constraintCatalog;

    private Object constraintSchema;

    private Object constraintName;

    private static final long serialVersionUID = 1L;

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

    public Object getColumnName() {
        return columnName;
    }

    public void setColumnName(Object columnName) {
        this.columnName = columnName;
    }

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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", tableCatalog=").append(tableCatalog);
        sb.append(", tableSchema=").append(tableSchema);
        sb.append(", tableName=").append(tableName);
        sb.append(", columnName=").append(columnName);
        sb.append(", constraintCatalog=").append(constraintCatalog);
        sb.append(", constraintSchema=").append(constraintSchema);
        sb.append(", constraintName=").append(constraintName);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}