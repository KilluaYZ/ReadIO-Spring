package com.pool.readio.readiombg.model;

import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;

public class ViewRoutineUsage implements Serializable {
    private Object tableCatalog;

    private Object tableSchema;

    private Object tableName;

    private Object specificCatalog;

    private Object specificSchema;

    private Object specificName;

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
        sb.append(", tableCatalog=").append(tableCatalog);
        sb.append(", tableSchema=").append(tableSchema);
        sb.append(", tableName=").append(tableName);
        sb.append(", specificCatalog=").append(specificCatalog);
        sb.append(", specificSchema=").append(specificSchema);
        sb.append(", specificName=").append(specificName);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}