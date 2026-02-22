package com.pool.readio.readiombg.model;

import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;

public class PgAttrdef implements Serializable {
    private Long oid;

    private Long adrelid;

    private Short adnum;

    private Object adbin;

    private static final long serialVersionUID = 1L;

    public Long getOid() {
        return oid;
    }

    public void setOid(Long oid) {
        this.oid = oid;
    }

    public Long getAdrelid() {
        return adrelid;
    }

    public void setAdrelid(Long adrelid) {
        this.adrelid = adrelid;
    }

    public Short getAdnum() {
        return adnum;
    }

    public void setAdnum(Short adnum) {
        this.adnum = adnum;
    }

    public Object getAdbin() {
        return adbin;
    }

    public void setAdbin(Object adbin) {
        this.adbin = adbin;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", oid=").append(oid);
        sb.append(", adrelid=").append(adrelid);
        sb.append(", adnum=").append(adnum);
        sb.append(", adbin=").append(adbin);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}