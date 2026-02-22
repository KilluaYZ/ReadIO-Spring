package com.pool.readio.readiombg.model;

import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;

public class PgPolicy implements Serializable {
    private Long oid;

    private String polname;

    private Long polrelid;

    private String polcmd;

    private Boolean polpermissive;

    private Object polroles;

    private Object polqual;

    private Object polwithcheck;

    private static final long serialVersionUID = 1L;

    public Long getOid() {
        return oid;
    }

    public void setOid(Long oid) {
        this.oid = oid;
    }

    public String getPolname() {
        return polname;
    }

    public void setPolname(String polname) {
        this.polname = polname;
    }

    public Long getPolrelid() {
        return polrelid;
    }

    public void setPolrelid(Long polrelid) {
        this.polrelid = polrelid;
    }

    public String getPolcmd() {
        return polcmd;
    }

    public void setPolcmd(String polcmd) {
        this.polcmd = polcmd;
    }

    public Boolean getPolpermissive() {
        return polpermissive;
    }

    public void setPolpermissive(Boolean polpermissive) {
        this.polpermissive = polpermissive;
    }

    public Object getPolroles() {
        return polroles;
    }

    public void setPolroles(Object polroles) {
        this.polroles = polroles;
    }

    public Object getPolqual() {
        return polqual;
    }

    public void setPolqual(Object polqual) {
        this.polqual = polqual;
    }

    public Object getPolwithcheck() {
        return polwithcheck;
    }

    public void setPolwithcheck(Object polwithcheck) {
        this.polwithcheck = polwithcheck;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", oid=").append(oid);
        sb.append(", polname=").append(polname);
        sb.append(", polrelid=").append(polrelid);
        sb.append(", polcmd=").append(polcmd);
        sb.append(", polpermissive=").append(polpermissive);
        sb.append(", polroles=").append(polroles);
        sb.append(", polqual=").append(polqual);
        sb.append(", polwithcheck=").append(polwithcheck);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}