package com.pool.readio.readiombg.model;

import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;

public class PgForeignTableColumns implements Serializable {
    private String nspname;

    private String relname;

    private String attname;

    private Object attfdwoptions;

    private static final long serialVersionUID = 1L;

    public String getNspname() {
        return nspname;
    }

    public void setNspname(String nspname) {
        this.nspname = nspname;
    }

    public String getRelname() {
        return relname;
    }

    public void setRelname(String relname) {
        this.relname = relname;
    }

    public String getAttname() {
        return attname;
    }

    public void setAttname(String attname) {
        this.attname = attname;
    }

    public Object getAttfdwoptions() {
        return attfdwoptions;
    }

    public void setAttfdwoptions(Object attfdwoptions) {
        this.attfdwoptions = attfdwoptions;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", nspname=").append(nspname);
        sb.append(", relname=").append(relname);
        sb.append(", attname=").append(attname);
        sb.append(", attfdwoptions=").append(attfdwoptions);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}