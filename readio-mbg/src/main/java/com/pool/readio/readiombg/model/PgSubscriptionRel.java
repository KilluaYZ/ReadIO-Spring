package com.pool.readio.readiombg.model;

import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;

public class PgSubscriptionRel implements Serializable {
    private Long srrelid;

    private Long srsubid;

    private String srsubstate;

    private Object srsublsn;

    private static final long serialVersionUID = 1L;

    public Long getSrrelid() {
        return srrelid;
    }

    public void setSrrelid(Long srrelid) {
        this.srrelid = srrelid;
    }

    public Long getSrsubid() {
        return srsubid;
    }

    public void setSrsubid(Long srsubid) {
        this.srsubid = srsubid;
    }

    public String getSrsubstate() {
        return srsubstate;
    }

    public void setSrsubstate(String srsubstate) {
        this.srsubstate = srsubstate;
    }

    public Object getSrsublsn() {
        return srsublsn;
    }

    public void setSrsublsn(Object srsublsn) {
        this.srsublsn = srsublsn;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", srrelid=").append(srrelid);
        sb.append(", srsubid=").append(srsubid);
        sb.append(", srsubstate=").append(srsubstate);
        sb.append(", srsublsn=").append(srsublsn);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}