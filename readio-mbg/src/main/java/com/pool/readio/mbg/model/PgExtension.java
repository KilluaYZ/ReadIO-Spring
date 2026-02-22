package com.pool.readio.mbg.model;

import java.io.Serializable;

public class PgExtension implements Serializable {
    private Long oid;

    private String extname;

    private Long extowner;

    private Long extnamespace;

    private Boolean extrelocatable;

    private String extversion;

    private Object extconfig;

    private Object extcondition;

    private static final long serialVersionUID = 1L;

    public Long getOid() {
        return oid;
    }

    public void setOid(Long oid) {
        this.oid = oid;
    }

    public String getExtname() {
        return extname;
    }

    public void setExtname(String extname) {
        this.extname = extname;
    }

    public Long getExtowner() {
        return extowner;
    }

    public void setExtowner(Long extowner) {
        this.extowner = extowner;
    }

    public Long getExtnamespace() {
        return extnamespace;
    }

    public void setExtnamespace(Long extnamespace) {
        this.extnamespace = extnamespace;
    }

    public Boolean getExtrelocatable() {
        return extrelocatable;
    }

    public void setExtrelocatable(Boolean extrelocatable) {
        this.extrelocatable = extrelocatable;
    }

    public String getExtversion() {
        return extversion;
    }

    public void setExtversion(String extversion) {
        this.extversion = extversion;
    }

    public Object getExtconfig() {
        return extconfig;
    }

    public void setExtconfig(Object extconfig) {
        this.extconfig = extconfig;
    }

    public Object getExtcondition() {
        return extcondition;
    }

    public void setExtcondition(Object extcondition) {
        this.extcondition = extcondition;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", oid=").append(oid);
        sb.append(", extname=").append(extname);
        sb.append(", extowner=").append(extowner);
        sb.append(", extnamespace=").append(extnamespace);
        sb.append(", extrelocatable=").append(extrelocatable);
        sb.append(", extversion=").append(extversion);
        sb.append(", extconfig=").append(extconfig);
        sb.append(", extcondition=").append(extcondition);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}