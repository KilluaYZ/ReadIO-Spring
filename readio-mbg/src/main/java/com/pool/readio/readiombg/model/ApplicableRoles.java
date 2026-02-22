package com.pool.readio.readiombg.model;

import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;

public class ApplicableRoles implements Serializable {
    private Object grantee;

    private Object roleName;

    private Object isGrantable;

    private static final long serialVersionUID = 1L;

    public Object getGrantee() {
        return grantee;
    }

    public void setGrantee(Object grantee) {
        this.grantee = grantee;
    }

    public Object getRoleName() {
        return roleName;
    }

    public void setRoleName(Object roleName) {
        this.roleName = roleName;
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
        sb.append(", grantee=").append(grantee);
        sb.append(", roleName=").append(roleName);
        sb.append(", isGrantable=").append(isGrantable);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}