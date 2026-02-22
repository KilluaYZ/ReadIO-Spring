package com.pool.readio.readiombg.model;

import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;

public class ColumnUdtUsage implements Serializable {
    private Object udtCatalog;

    private Object udtSchema;

    private Object udtName;

    private Object tableCatalog;

    private Object tableSchema;

    private Object tableName;

    private Object columnName;

    private static final long serialVersionUID = 1L;

    public Object getUdtCatalog() {
        return udtCatalog;
    }

    public void setUdtCatalog(Object udtCatalog) {
        this.udtCatalog = udtCatalog;
    }

    public Object getUdtSchema() {
        return udtSchema;
    }

    public void setUdtSchema(Object udtSchema) {
        this.udtSchema = udtSchema;
    }

    public Object getUdtName() {
        return udtName;
    }

    public void setUdtName(Object udtName) {
        this.udtName = udtName;
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

    public Object getColumnName() {
        return columnName;
    }

    public void setColumnName(Object columnName) {
        this.columnName = columnName;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", udtCatalog=").append(udtCatalog);
        sb.append(", udtSchema=").append(udtSchema);
        sb.append(", udtName=").append(udtName);
        sb.append(", tableCatalog=").append(tableCatalog);
        sb.append(", tableSchema=").append(tableSchema);
        sb.append(", tableName=").append(tableName);
        sb.append(", columnName=").append(columnName);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}