package com.pool.readio.readiombg.model;

import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;

public class PgAmproc implements Serializable {
    private Long oid;

    private Long amprocfamily;

    private Long amproclefttype;

    private Long amprocrighttype;

    private Short amprocnum;

    private Object amproc;

    private static final long serialVersionUID = 1L;

    public Long getOid() {
        return oid;
    }

    public void setOid(Long oid) {
        this.oid = oid;
    }

    public Long getAmprocfamily() {
        return amprocfamily;
    }

    public void setAmprocfamily(Long amprocfamily) {
        this.amprocfamily = amprocfamily;
    }

    public Long getAmproclefttype() {
        return amproclefttype;
    }

    public void setAmproclefttype(Long amproclefttype) {
        this.amproclefttype = amproclefttype;
    }

    public Long getAmprocrighttype() {
        return amprocrighttype;
    }

    public void setAmprocrighttype(Long amprocrighttype) {
        this.amprocrighttype = amprocrighttype;
    }

    public Short getAmprocnum() {
        return amprocnum;
    }

    public void setAmprocnum(Short amprocnum) {
        this.amprocnum = amprocnum;
    }

    public Object getAmproc() {
        return amproc;
    }

    public void setAmproc(Object amproc) {
        this.amproc = amproc;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", oid=").append(oid);
        sb.append(", amprocfamily=").append(amprocfamily);
        sb.append(", amproclefttype=").append(amproclefttype);
        sb.append(", amprocrighttype=").append(amprocrighttype);
        sb.append(", amprocnum=").append(amprocnum);
        sb.append(", amproc=").append(amproc);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}