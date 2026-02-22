package com.pool.readio.mbg.model;

import java.io.Serializable;

public class PgForeignServer implements Serializable {
    private Long oid;

    private String srvname;

    private Long srvowner;

    private Long srvfdw;

    private String srvtype;

    private String srvversion;

    private Object srvacl;

    private Object srvoptions;

    private static final long serialVersionUID = 1L;

    public Long getOid() {
        return oid;
    }

    public void setOid(Long oid) {
        this.oid = oid;
    }

    public String getSrvname() {
        return srvname;
    }

    public void setSrvname(String srvname) {
        this.srvname = srvname;
    }

    public Long getSrvowner() {
        return srvowner;
    }

    public void setSrvowner(Long srvowner) {
        this.srvowner = srvowner;
    }

    public Long getSrvfdw() {
        return srvfdw;
    }

    public void setSrvfdw(Long srvfdw) {
        this.srvfdw = srvfdw;
    }

    public String getSrvtype() {
        return srvtype;
    }

    public void setSrvtype(String srvtype) {
        this.srvtype = srvtype;
    }

    public String getSrvversion() {
        return srvversion;
    }

    public void setSrvversion(String srvversion) {
        this.srvversion = srvversion;
    }

    public Object getSrvacl() {
        return srvacl;
    }

    public void setSrvacl(Object srvacl) {
        this.srvacl = srvacl;
    }

    public Object getSrvoptions() {
        return srvoptions;
    }

    public void setSrvoptions(Object srvoptions) {
        this.srvoptions = srvoptions;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", oid=").append(oid);
        sb.append(", srvname=").append(srvname);
        sb.append(", srvowner=").append(srvowner);
        sb.append(", srvfdw=").append(srvfdw);
        sb.append(", srvtype=").append(srvtype);
        sb.append(", srvversion=").append(srvversion);
        sb.append(", srvacl=").append(srvacl);
        sb.append(", srvoptions=").append(srvoptions);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}