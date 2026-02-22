package com.pool.readio.mbg.model;

import java.io.Serializable;

public class PgPublicationRel implements Serializable {
    private Long oid;

    private Long prpubid;

    private Long prrelid;

    private Object prqual;

    private Object prattrs;

    private static final long serialVersionUID = 1L;

    public Long getOid() {
        return oid;
    }

    public void setOid(Long oid) {
        this.oid = oid;
    }

    public Long getPrpubid() {
        return prpubid;
    }

    public void setPrpubid(Long prpubid) {
        this.prpubid = prpubid;
    }

    public Long getPrrelid() {
        return prrelid;
    }

    public void setPrrelid(Long prrelid) {
        this.prrelid = prrelid;
    }

    public Object getPrqual() {
        return prqual;
    }

    public void setPrqual(Object prqual) {
        this.prqual = prqual;
    }

    public Object getPrattrs() {
        return prattrs;
    }

    public void setPrattrs(Object prattrs) {
        this.prattrs = prattrs;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", oid=").append(oid);
        sb.append(", prpubid=").append(prpubid);
        sb.append(", prrelid=").append(prrelid);
        sb.append(", prqual=").append(prqual);
        sb.append(", prattrs=").append(prattrs);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}