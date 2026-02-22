package com.pool.readio.mbg.model;

import java.io.Serializable;

public class PgTablespace implements Serializable {
    private Long oid;

    private String spcname;

    private Long spcowner;

    private Object spcacl;

    private Object spcoptions;

    private static final long serialVersionUID = 1L;

    public Long getOid() {
        return oid;
    }

    public void setOid(Long oid) {
        this.oid = oid;
    }

    public String getSpcname() {
        return spcname;
    }

    public void setSpcname(String spcname) {
        this.spcname = spcname;
    }

    public Long getSpcowner() {
        return spcowner;
    }

    public void setSpcowner(Long spcowner) {
        this.spcowner = spcowner;
    }

    public Object getSpcacl() {
        return spcacl;
    }

    public void setSpcacl(Object spcacl) {
        this.spcacl = spcacl;
    }

    public Object getSpcoptions() {
        return spcoptions;
    }

    public void setSpcoptions(Object spcoptions) {
        this.spcoptions = spcoptions;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", oid=").append(oid);
        sb.append(", spcname=").append(spcname);
        sb.append(", spcowner=").append(spcowner);
        sb.append(", spcacl=").append(spcacl);
        sb.append(", spcoptions=").append(spcoptions);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}