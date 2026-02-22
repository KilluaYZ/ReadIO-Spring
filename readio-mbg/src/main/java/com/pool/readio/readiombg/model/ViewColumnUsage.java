package com.pool.readio.readiombg.model;

import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;

public class ViewColumnUsage implements Serializable {
    private Object viewCatalog;

    private Object viewSchema;

    private Object viewName;

    private Object tableCatalog;

    private Object tableSchema;

    private Object tableName;

    private Object columnName;

    private static final long serialVersionUID = 1L;

    public Object getViewCatalog() {
        return viewCatalog;
    }

    public void setViewCatalog(Object viewCatalog) {
        this.viewCatalog = viewCatalog;
    }

    public Object getViewSchema() {
        return viewSchema;
    }

    public void setViewSchema(Object viewSchema) {
        this.viewSchema = viewSchema;
    }

    public Object getViewName() {
        return viewName;
    }

    public void setViewName(Object viewName) {
        this.viewName = viewName;
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
        sb.append(", viewCatalog=").append(viewCatalog);
        sb.append(", viewSchema=").append(viewSchema);
        sb.append(", viewName=").append(viewName);
        sb.append(", tableCatalog=").append(tableCatalog);
        sb.append(", tableSchema=").append(tableSchema);
        sb.append(", tableName=").append(tableName);
        sb.append(", columnName=").append(columnName);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}