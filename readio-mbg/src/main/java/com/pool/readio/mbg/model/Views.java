package com.pool.readio.mbg.model;

import java.io.Serializable;

public class Views implements Serializable {
    private Object tableCatalog;

    private Object tableSchema;

    private Object tableName;

    private Object viewDefinition;

    private Object checkOption;

    private Object isUpdatable;

    private Object isInsertableInto;

    private Object isTriggerUpdatable;

    private Object isTriggerDeletable;

    private Object isTriggerInsertableInto;

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

    public Object getViewDefinition() {
        return viewDefinition;
    }

    public void setViewDefinition(Object viewDefinition) {
        this.viewDefinition = viewDefinition;
    }

    public Object getCheckOption() {
        return checkOption;
    }

    public void setCheckOption(Object checkOption) {
        this.checkOption = checkOption;
    }

    public Object getIsUpdatable() {
        return isUpdatable;
    }

    public void setIsUpdatable(Object isUpdatable) {
        this.isUpdatable = isUpdatable;
    }

    public Object getIsInsertableInto() {
        return isInsertableInto;
    }

    public void setIsInsertableInto(Object isInsertableInto) {
        this.isInsertableInto = isInsertableInto;
    }

    public Object getIsTriggerUpdatable() {
        return isTriggerUpdatable;
    }

    public void setIsTriggerUpdatable(Object isTriggerUpdatable) {
        this.isTriggerUpdatable = isTriggerUpdatable;
    }

    public Object getIsTriggerDeletable() {
        return isTriggerDeletable;
    }

    public void setIsTriggerDeletable(Object isTriggerDeletable) {
        this.isTriggerDeletable = isTriggerDeletable;
    }

    public Object getIsTriggerInsertableInto() {
        return isTriggerInsertableInto;
    }

    public void setIsTriggerInsertableInto(Object isTriggerInsertableInto) {
        this.isTriggerInsertableInto = isTriggerInsertableInto;
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
        sb.append(", viewDefinition=").append(viewDefinition);
        sb.append(", checkOption=").append(checkOption);
        sb.append(", isUpdatable=").append(isUpdatable);
        sb.append(", isInsertableInto=").append(isInsertableInto);
        sb.append(", isTriggerUpdatable=").append(isTriggerUpdatable);
        sb.append(", isTriggerDeletable=").append(isTriggerDeletable);
        sb.append(", isTriggerInsertableInto=").append(isTriggerInsertableInto);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}