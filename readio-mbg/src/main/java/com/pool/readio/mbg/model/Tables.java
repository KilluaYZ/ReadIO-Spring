package com.pool.readio.mbg.model;

import java.io.Serializable;

public class Tables implements Serializable {
    private Object tableCatalog;

    private Object tableSchema;

    private Object tableName;

    private Object tableType;

    private Object selfReferencingColumnName;

    private Object referenceGeneration;

    private Object userDefinedTypeCatalog;

    private Object userDefinedTypeSchema;

    private Object userDefinedTypeName;

    private Object isInsertableInto;

    private Object isTyped;

    private Object commitAction;

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

    public Object getTableType() {
        return tableType;
    }

    public void setTableType(Object tableType) {
        this.tableType = tableType;
    }

    public Object getSelfReferencingColumnName() {
        return selfReferencingColumnName;
    }

    public void setSelfReferencingColumnName(Object selfReferencingColumnName) {
        this.selfReferencingColumnName = selfReferencingColumnName;
    }

    public Object getReferenceGeneration() {
        return referenceGeneration;
    }

    public void setReferenceGeneration(Object referenceGeneration) {
        this.referenceGeneration = referenceGeneration;
    }

    public Object getUserDefinedTypeCatalog() {
        return userDefinedTypeCatalog;
    }

    public void setUserDefinedTypeCatalog(Object userDefinedTypeCatalog) {
        this.userDefinedTypeCatalog = userDefinedTypeCatalog;
    }

    public Object getUserDefinedTypeSchema() {
        return userDefinedTypeSchema;
    }

    public void setUserDefinedTypeSchema(Object userDefinedTypeSchema) {
        this.userDefinedTypeSchema = userDefinedTypeSchema;
    }

    public Object getUserDefinedTypeName() {
        return userDefinedTypeName;
    }

    public void setUserDefinedTypeName(Object userDefinedTypeName) {
        this.userDefinedTypeName = userDefinedTypeName;
    }

    public Object getIsInsertableInto() {
        return isInsertableInto;
    }

    public void setIsInsertableInto(Object isInsertableInto) {
        this.isInsertableInto = isInsertableInto;
    }

    public Object getIsTyped() {
        return isTyped;
    }

    public void setIsTyped(Object isTyped) {
        this.isTyped = isTyped;
    }

    public Object getCommitAction() {
        return commitAction;
    }

    public void setCommitAction(Object commitAction) {
        this.commitAction = commitAction;
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
        sb.append(", tableType=").append(tableType);
        sb.append(", selfReferencingColumnName=").append(selfReferencingColumnName);
        sb.append(", referenceGeneration=").append(referenceGeneration);
        sb.append(", userDefinedTypeCatalog=").append(userDefinedTypeCatalog);
        sb.append(", userDefinedTypeSchema=").append(userDefinedTypeSchema);
        sb.append(", userDefinedTypeName=").append(userDefinedTypeName);
        sb.append(", isInsertableInto=").append(isInsertableInto);
        sb.append(", isTyped=").append(isTyped);
        sb.append(", commitAction=").append(commitAction);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}