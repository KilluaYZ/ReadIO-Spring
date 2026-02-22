package com.pool.readio.mbg.model;

import java.io.Serializable;

public class PgStatisticExt implements Serializable {
    private Long oid;

    private Long stxrelid;

    private String stxname;

    private Long stxnamespace;

    private Long stxowner;

    private Object stxkeys;

    private Short stxstattarget;

    private Object stxkind;

    private Object stxexprs;

    private static final long serialVersionUID = 1L;

    public Long getOid() {
        return oid;
    }

    public void setOid(Long oid) {
        this.oid = oid;
    }

    public Long getStxrelid() {
        return stxrelid;
    }

    public void setStxrelid(Long stxrelid) {
        this.stxrelid = stxrelid;
    }

    public String getStxname() {
        return stxname;
    }

    public void setStxname(String stxname) {
        this.stxname = stxname;
    }

    public Long getStxnamespace() {
        return stxnamespace;
    }

    public void setStxnamespace(Long stxnamespace) {
        this.stxnamespace = stxnamespace;
    }

    public Long getStxowner() {
        return stxowner;
    }

    public void setStxowner(Long stxowner) {
        this.stxowner = stxowner;
    }

    public Object getStxkeys() {
        return stxkeys;
    }

    public void setStxkeys(Object stxkeys) {
        this.stxkeys = stxkeys;
    }

    public Short getStxstattarget() {
        return stxstattarget;
    }

    public void setStxstattarget(Short stxstattarget) {
        this.stxstattarget = stxstattarget;
    }

    public Object getStxkind() {
        return stxkind;
    }

    public void setStxkind(Object stxkind) {
        this.stxkind = stxkind;
    }

    public Object getStxexprs() {
        return stxexprs;
    }

    public void setStxexprs(Object stxexprs) {
        this.stxexprs = stxexprs;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", oid=").append(oid);
        sb.append(", stxrelid=").append(stxrelid);
        sb.append(", stxname=").append(stxname);
        sb.append(", stxnamespace=").append(stxnamespace);
        sb.append(", stxowner=").append(stxowner);
        sb.append(", stxkeys=").append(stxkeys);
        sb.append(", stxstattarget=").append(stxstattarget);
        sb.append(", stxkind=").append(stxkind);
        sb.append(", stxexprs=").append(stxexprs);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}