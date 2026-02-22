package com.pool.readio.mbg.model;

import java.io.Serializable;

public class ColumnDomainUsage implements Serializable {
    private Object domainCatalog;

    private Object domainSchema;

    private Object domainName;

    private Object tableCatalog;

    private Object tableSchema;

    private Object tableName;

    private Object columnName;

    private static final long serialVersionUID = 1L;

    public Object getDomainCatalog() {
        return domainCatalog;
    }

    public void setDomainCatalog(Object domainCatalog) {
        this.domainCatalog = domainCatalog;
    }

    public Object getDomainSchema() {
        return domainSchema;
    }

    public void setDomainSchema(Object domainSchema) {
        this.domainSchema = domainSchema;
    }

    public Object getDomainName() {
        return domainName;
    }

    public void setDomainName(Object domainName) {
        this.domainName = domainName;
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
        sb.append(", domainCatalog=").append(domainCatalog);
        sb.append(", domainSchema=").append(domainSchema);
        sb.append(", domainName=").append(domainName);
        sb.append(", tableCatalog=").append(tableCatalog);
        sb.append(", tableSchema=").append(tableSchema);
        sb.append(", tableName=").append(tableName);
        sb.append(", columnName=").append(columnName);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}