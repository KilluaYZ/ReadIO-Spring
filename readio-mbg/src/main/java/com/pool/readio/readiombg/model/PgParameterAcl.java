package com.pool.readio.readiombg.model;

import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;

public class PgParameterAcl implements Serializable {
    private Long oid;

    private String parname;

    private Object paracl;

    private static final long serialVersionUID = 1L;

    public Long getOid() {
        return oid;
    }

    public void setOid(Long oid) {
        this.oid = oid;
    }

    public String getParname() {
        return parname;
    }

    public void setParname(String parname) {
        this.parname = parname;
    }

    public Object getParacl() {
        return paracl;
    }

    public void setParacl(Object paracl) {
        this.paracl = paracl;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", oid=").append(oid);
        sb.append(", parname=").append(parname);
        sb.append(", paracl=").append(paracl);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}