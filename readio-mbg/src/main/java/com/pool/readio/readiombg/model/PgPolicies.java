package com.pool.readio.readiombg.model;

import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;

public class PgPolicies implements Serializable {
    private String schemaname;

    private String tablename;

    private String policyname;

    private String permissive;

    private Object roles;

    private String cmd;

    private String qual;

    private String withCheck;

    private static final long serialVersionUID = 1L;

    public String getSchemaname() {
        return schemaname;
    }

    public void setSchemaname(String schemaname) {
        this.schemaname = schemaname;
    }

    public String getTablename() {
        return tablename;
    }

    public void setTablename(String tablename) {
        this.tablename = tablename;
    }

    public String getPolicyname() {
        return policyname;
    }

    public void setPolicyname(String policyname) {
        this.policyname = policyname;
    }

    public String getPermissive() {
        return permissive;
    }

    public void setPermissive(String permissive) {
        this.permissive = permissive;
    }

    public Object getRoles() {
        return roles;
    }

    public void setRoles(Object roles) {
        this.roles = roles;
    }

    public String getCmd() {
        return cmd;
    }

    public void setCmd(String cmd) {
        this.cmd = cmd;
    }

    public String getQual() {
        return qual;
    }

    public void setQual(String qual) {
        this.qual = qual;
    }

    public String getWithCheck() {
        return withCheck;
    }

    public void setWithCheck(String withCheck) {
        this.withCheck = withCheck;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", schemaname=").append(schemaname);
        sb.append(", tablename=").append(tablename);
        sb.append(", policyname=").append(policyname);
        sb.append(", permissive=").append(permissive);
        sb.append(", roles=").append(roles);
        sb.append(", cmd=").append(cmd);
        sb.append(", qual=").append(qual);
        sb.append(", withCheck=").append(withCheck);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}