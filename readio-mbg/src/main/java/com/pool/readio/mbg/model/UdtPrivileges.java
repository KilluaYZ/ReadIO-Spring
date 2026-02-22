package com.pool.readio.mbg.model;

import java.io.Serializable;

public class UdtPrivileges implements Serializable {
    private Object grantor;

    private Object grantee;

    private Object udtCatalog;

    private Object udtSchema;

    private Object udtName;

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
        sb.append(", udtCatalog=").append(udtCatalog);
        sb.append(", udtSchema=").append(udtSchema);
        sb.append(", udtName=").append(udtName);
        sb.append(", privilegeType=").append(privilegeType);
        sb.append(", isGrantable=").append(isGrantable);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}