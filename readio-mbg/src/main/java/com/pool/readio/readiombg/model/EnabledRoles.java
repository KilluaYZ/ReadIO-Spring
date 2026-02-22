package com.pool.readio.readiombg.model;

import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;

public class EnabledRoles implements Serializable {
    private Object roleName;

    private static final long serialVersionUID = 1L;

    public Object getRoleName() {
        return roleName;
    }

    public void setRoleName(Object roleName) {
        this.roleName = roleName;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", roleName=").append(roleName);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}