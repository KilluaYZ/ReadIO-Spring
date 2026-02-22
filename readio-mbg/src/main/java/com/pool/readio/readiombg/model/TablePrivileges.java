package com.pool.readio.readiombg.model;

import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;

public class TablePrivileges implements Serializable {
    private Object grantor;

    private Object grantee;

    private Object tableCatalog;

    private Object tableSchema;

    private Object tableName;

    private Object privilegeType;

    private Object isGrantable;

    private Object withHierarchy;

    private static final long serialVersionUID = 1L;

    public Object getGrantor() {
        return grantor;
    }

    public void setGrantor(Object grantor) {
        this.grantor = grantor;
    }

    public Object getGrantee() {
        return grantee;
    }

    public void setGrantee(Object grantee) {
        this.grantee = grantee;
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

    public Object getPrivilegeType() {
        return privilegeType;
    }

    public void setPrivilegeType(Object privilegeType) {
        this.privilegeType = privilegeType;
    }

    public Object getIsGrantable() {
        return isGrantable;
    }

    public void setIsGrantable(Object isGrantable) {
        this.isGrantable = isGrantable;
    }

    public Object getWithHierarchy() {
        return withHierarchy;
    }

    public void setWithHierarchy(Object withHierarchy) {
        this.withHierarchy = withHierarchy;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", grantor=").append(grantor);
        sb.append(", grantee=").append(grantee);
        sb.append(", tableCatalog=").append(tableCatalog);
        sb.append(", tableSchema=").append(tableSchema);
        sb.append(", tableName=").append(tableName);
        sb.append(", privilegeType=").append(privilegeType);
        sb.append(", isGrantable=").append(isGrantable);
        sb.append(", withHierarchy=").append(withHierarchy);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}