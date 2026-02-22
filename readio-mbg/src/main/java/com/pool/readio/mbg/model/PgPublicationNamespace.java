package com.pool.readio.mbg.model;

import java.io.Serializable;

public class PgPublicationNamespace implements Serializable {
    private Long oid;

    private Long pnpubid;

    private Long pnnspid;

    private static final long serialVersionUID = 1L;

    public Long getOid() {
        return oid;
    }

    public void setOid(Long oid) {
        this.oid = oid;
    }

    public Long getPnpubid() {
        return pnpubid;
    }

    public void setPnpubid(Long pnpubid) {
        this.pnpubid = pnpubid;
    }

    public Long getPnnspid() {
        return pnnspid;
    }

    public void setPnnspid(Long pnnspid) {
        this.pnnspid = pnnspid;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", oid=").append(oid);
        sb.append(", pnpubid=").append(pnpubid);
        sb.append(", pnnspid=").append(pnnspid);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}