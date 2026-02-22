package com.pool.readio.mbg.model;

import java.io.Serializable;

public class PgLargeobjectMetadata implements Serializable {
    private Long oid;

    private Long lomowner;

    private Object lomacl;

    private static final long serialVersionUID = 1L;

    public Long getOid() {
        return oid;
    }

    public void setOid(Long oid) {
        this.oid = oid;
    }

    public Long getLomowner() {
        return lomowner;
    }

    public void setLomowner(Long lomowner) {
        this.lomowner = lomowner;
    }

    public Object getLomacl() {
        return lomacl;
    }

    public void setLomacl(Object lomacl) {
        this.lomacl = lomacl;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", oid=").append(oid);
        sb.append(", lomowner=").append(lomowner);
        sb.append(", lomacl=").append(lomacl);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}