package com.pool.readio.mbg.model;

import java.io.Serializable;

public class PgAm implements Serializable {
    private Long oid;

    private String amname;

    private Object amhandler;

    private String amtype;

    private static final long serialVersionUID = 1L;

    public Long getOid() {
        return oid;
    }

    public void setOid(Long oid) {
        this.oid = oid;
    }

    public String getAmname() {
        return amname;
    }

    public void setAmname(String amname) {
        this.amname = amname;
    }

    public Object getAmhandler() {
        return amhandler;
    }

    public void setAmhandler(Object amhandler) {
        this.amhandler = amhandler;
    }

    public String getAmtype() {
        return amtype;
    }

    public void setAmtype(String amtype) {
        this.amtype = amtype;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", oid=").append(oid);
        sb.append(", amname=").append(amname);
        sb.append(", amhandler=").append(amhandler);
        sb.append(", amtype=").append(amtype);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}