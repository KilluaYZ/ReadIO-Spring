package com.pool.readio.readiombg.model;

import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;

public class RoleUsageGrants implements Serializable {
    private Object grantor;

    private Object grantee;

    private Object objectCatalog;

    private Object objectSchema;

    private Object objectName;

    private Object objectType;

    private Object privilegeType;

    private Object isGrantable;

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

    public Object getObjectCatalog() {
        return objectCatalog;
    }

    public void setObjectCatalog(Object objectCatalog) {
        this.objectCatalog = objectCatalog;
    }

    public Object getObjectSchema() {
        return objectSchema;
    }

    public void setObjectSchema(Object objectSchema) {
        this.objectSchema = objectSchema;
    }

    public Object getObjectName() {
        return objectName;
    }

    public void setObjectName(Object objectName) {
        this.objectName = objectName;
    }

    public Object getObjectType() {
        return objectType;
    }

    public void setObjectType(Object objectType) {
        this.objectType = objectType;
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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", grantor=").append(grantor);
        sb.append(", grantee=").append(grantee);
        sb.append(", objectCatalog=").append(objectCatalog);
        sb.append(", objectSchema=").append(objectSchema);
        sb.append(", objectName=").append(objectName);
        sb.append(", objectType=").append(objectType);
        sb.append(", privilegeType=").append(privilegeType);
        sb.append(", isGrantable=").append(isGrantable);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}