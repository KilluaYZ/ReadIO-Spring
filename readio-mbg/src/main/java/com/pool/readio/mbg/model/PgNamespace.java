package com.pool.readio.mbg.model;

import java.io.Serializable;

public class PgNamespace implements Serializable {
    private Long oid;

    private String nspname;

    private Long nspowner;

    private Object nspacl;

    private static final long serialVersionUID = 1L;

    public Long getOid() {
        return oid;
    }

    public void setOid(Long oid) {
        this.oid = oid;
    }

    public String getNspname() {
        return nspname;
    }

    public void setNspname(String nspname) {
        this.nspname = nspname;
    }

    public Long getNspowner() {
        return nspowner;
    }

    public void setNspowner(Long nspowner) {
        this.nspowner = nspowner;
    }

    public Object getNspacl() {
        return nspacl;
    }

    public void setNspacl(Object nspacl) {
        this.nspacl = nspacl;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", oid=").append(oid);
        sb.append(", nspname=").append(nspname);
        sb.append(", nspowner=").append(nspowner);
        sb.append(", nspacl=").append(nspacl);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}