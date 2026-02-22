package com.pool.readio.mbg.model;

import java.io.Serializable;

public class PgUserMapping implements Serializable {
    private Long oid;

    private Long umuser;

    private Long umserver;

    private Object umoptions;

    private static final long serialVersionUID = 1L;

    public Long getOid() {
        return oid;
    }

    public void setOid(Long oid) {
        this.oid = oid;
    }

    public Long getUmuser() {
        return umuser;
    }

    public void setUmuser(Long umuser) {
        this.umuser = umuser;
    }

    public Long getUmserver() {
        return umserver;
    }

    public void setUmserver(Long umserver) {
        this.umserver = umserver;
    }

    public Object getUmoptions() {
        return umoptions;
    }

    public void setUmoptions(Object umoptions) {
        this.umoptions = umoptions;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", oid=").append(oid);
        sb.append(", umuser=").append(umuser);
        sb.append(", umserver=").append(umserver);
        sb.append(", umoptions=").append(umoptions);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}