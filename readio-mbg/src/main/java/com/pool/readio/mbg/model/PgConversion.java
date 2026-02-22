package com.pool.readio.mbg.model;

import java.io.Serializable;

public class PgConversion implements Serializable {
    private Long oid;

    private String conname;

    private Long connamespace;

    private Long conowner;

    private Integer conforencoding;

    private Integer contoencoding;

    private Object conproc;

    private Boolean condefault;

    private static final long serialVersionUID = 1L;

    public Long getOid() {
        return oid;
    }

    public void setOid(Long oid) {
        this.oid = oid;
    }

    public String getConname() {
        return conname;
    }

    public void setConname(String conname) {
        this.conname = conname;
    }

    public Long getConnamespace() {
        return connamespace;
    }

    public void setConnamespace(Long connamespace) {
        this.connamespace = connamespace;
    }

    public Long getConowner() {
        return conowner;
    }

    public void setConowner(Long conowner) {
        this.conowner = conowner;
    }

    public Integer getConforencoding() {
        return conforencoding;
    }

    public void setConforencoding(Integer conforencoding) {
        this.conforencoding = conforencoding;
    }

    public Integer getContoencoding() {
        return contoencoding;
    }

    public void setContoencoding(Integer contoencoding) {
        this.contoencoding = contoencoding;
    }

    public Object getConproc() {
        return conproc;
    }

    public void setConproc(Object conproc) {
        this.conproc = conproc;
    }

    public Boolean getCondefault() {
        return condefault;
    }

    public void setCondefault(Boolean condefault) {
        this.condefault = condefault;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", oid=").append(oid);
        sb.append(", conname=").append(conname);
        sb.append(", connamespace=").append(connamespace);
        sb.append(", conowner=").append(conowner);
        sb.append(", conforencoding=").append(conforencoding);
        sb.append(", contoencoding=").append(contoencoding);
        sb.append(", conproc=").append(conproc);
        sb.append(", condefault=").append(condefault);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}