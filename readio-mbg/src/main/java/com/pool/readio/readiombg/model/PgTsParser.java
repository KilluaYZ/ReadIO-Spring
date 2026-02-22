package com.pool.readio.readiombg.model;

import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;

public class PgTsParser implements Serializable {
    private Long oid;

    private String prsname;

    private Long prsnamespace;

    private Object prsstart;

    private Object prstoken;

    private Object prsend;

    private Object prsheadline;

    private Object prslextype;

    private static final long serialVersionUID = 1L;

    public Long getOid() {
        return oid;
    }

    public void setOid(Long oid) {
        this.oid = oid;
    }

    public String getPrsname() {
        return prsname;
    }

    public void setPrsname(String prsname) {
        this.prsname = prsname;
    }

    public Long getPrsnamespace() {
        return prsnamespace;
    }

    public void setPrsnamespace(Long prsnamespace) {
        this.prsnamespace = prsnamespace;
    }

    public Object getPrsstart() {
        return prsstart;
    }

    public void setPrsstart(Object prsstart) {
        this.prsstart = prsstart;
    }

    public Object getPrstoken() {
        return prstoken;
    }

    public void setPrstoken(Object prstoken) {
        this.prstoken = prstoken;
    }

    public Object getPrsend() {
        return prsend;
    }

    public void setPrsend(Object prsend) {
        this.prsend = prsend;
    }

    public Object getPrsheadline() {
        return prsheadline;
    }

    public void setPrsheadline(Object prsheadline) {
        this.prsheadline = prsheadline;
    }

    public Object getPrslextype() {
        return prslextype;
    }

    public void setPrslextype(Object prslextype) {
        this.prslextype = prslextype;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", oid=").append(oid);
        sb.append(", prsname=").append(prsname);
        sb.append(", prsnamespace=").append(prsnamespace);
        sb.append(", prsstart=").append(prsstart);
        sb.append(", prstoken=").append(prstoken);
        sb.append(", prsend=").append(prsend);
        sb.append(", prsheadline=").append(prsheadline);
        sb.append(", prslextype=").append(prslextype);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}