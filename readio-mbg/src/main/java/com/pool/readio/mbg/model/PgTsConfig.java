package com.pool.readio.mbg.model;

import java.io.Serializable;

public class PgTsConfig implements Serializable {
    private Long oid;

    private String cfgname;

    private Long cfgnamespace;

    private Long cfgowner;

    private Long cfgparser;

    private static final long serialVersionUID = 1L;

    public Long getOid() {
        return oid;
    }

    public void setOid(Long oid) {
        this.oid = oid;
    }

    public String getCfgname() {
        return cfgname;
    }

    public void setCfgname(String cfgname) {
        this.cfgname = cfgname;
    }

    public Long getCfgnamespace() {
        return cfgnamespace;
    }

    public void setCfgnamespace(Long cfgnamespace) {
        this.cfgnamespace = cfgnamespace;
    }

    public Long getCfgowner() {
        return cfgowner;
    }

    public void setCfgowner(Long cfgowner) {
        this.cfgowner = cfgowner;
    }

    public Long getCfgparser() {
        return cfgparser;
    }

    public void setCfgparser(Long cfgparser) {
        this.cfgparser = cfgparser;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", oid=").append(oid);
        sb.append(", cfgname=").append(cfgname);
        sb.append(", cfgnamespace=").append(cfgnamespace);
        sb.append(", cfgowner=").append(cfgowner);
        sb.append(", cfgparser=").append(cfgparser);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}