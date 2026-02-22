package com.pool.readio.readiombg.model;

import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;

public class RoutineColumnUsage implements Serializable {
    private Object specificCatalog;

    private Object specificSchema;

    private Object specificName;

    private Object routineCatalog;

    private Object routineSchema;

    private Object routineName;

    private Object tableCatalog;

    private Object tableSchema;

    private Object tableName;

    private Object columnName;

    private static final long serialVersionUID = 1L;

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

    public Object getRoutineCatalog() {
        return routineCatalog;
    }

    public void setRoutineCatalog(Object routineCatalog) {
        this.routineCatalog = routineCatalog;
    }

    public Object getRoutineSchema() {
        return routineSchema;
    }

    public void setRoutineSchema(Object routineSchema) {
        this.routineSchema = routineSchema;
    }

    public Object getRoutineName() {
        return routineName;
    }

    public void setRoutineName(Object routineName) {
        this.routineName = routineName;
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
        sb.append(", specificCatalog=").append(specificCatalog);
        sb.append(", specificSchema=").append(specificSchema);
        sb.append(", specificName=").append(specificName);
        sb.append(", routineCatalog=").append(routineCatalog);
        sb.append(", routineSchema=").append(routineSchema);
        sb.append(", routineName=").append(routineName);
        sb.append(", tableCatalog=").append(tableCatalog);
        sb.append(", tableSchema=").append(tableSchema);
        sb.append(", tableName=").append(tableName);
        sb.append(", columnName=").append(columnName);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}