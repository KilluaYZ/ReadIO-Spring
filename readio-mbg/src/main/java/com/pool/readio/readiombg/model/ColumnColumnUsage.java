package com.pool.readio.readiombg.model;

import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;

public class ColumnColumnUsage implements Serializable {
    private Object tableCatalog;

    private Object tableSchema;

    private Object tableName;

    private Object columnName;

    private Object dependentColumn;

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

    public Object getDependentColumn() {
        return dependentColumn;
    }

    public void setDependentColumn(Object dependentColumn) {
        this.dependentColumn = dependentColumn;
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
        sb.append(", dependentColumn=").append(dependentColumn);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}