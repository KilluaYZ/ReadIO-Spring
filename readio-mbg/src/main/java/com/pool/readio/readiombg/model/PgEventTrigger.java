package com.pool.readio.readiombg.model;

import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;

public class PgEventTrigger implements Serializable {
    private Long oid;

    private String evtname;

    private String evtevent;

    private Long evtowner;

    private Long evtfoid;

    private String evtenabled;

    private Object evttags;

    private static final long serialVersionUID = 1L;

    public Long getOid() {
        return oid;
    }

    public void setOid(Long oid) {
        this.oid = oid;
    }

    public String getEvtname() {
        return evtname;
    }

    public void setEvtname(String evtname) {
        this.evtname = evtname;
    }

    public String getEvtevent() {
        return evtevent;
    }

    public void setEvtevent(String evtevent) {
        this.evtevent = evtevent;
    }

    public Long getEvtowner() {
        return evtowner;
    }

    public void setEvtowner(Long evtowner) {
        this.evtowner = evtowner;
    }

    public Long getEvtfoid() {
        return evtfoid;
    }

    public void setEvtfoid(Long evtfoid) {
        this.evtfoid = evtfoid;
    }

    public String getEvtenabled() {
        return evtenabled;
    }

    public void setEvtenabled(String evtenabled) {
        this.evtenabled = evtenabled;
    }

    public Object getEvttags() {
        return evttags;
    }

    public void setEvttags(Object evttags) {
        this.evttags = evttags;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", oid=").append(oid);
        sb.append(", evtname=").append(evtname);
        sb.append(", evtevent=").append(evtevent);
        sb.append(", evtowner=").append(evtowner);
        sb.append(", evtfoid=").append(evtfoid);
        sb.append(", evtenabled=").append(evtenabled);
        sb.append(", evttags=").append(evttags);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}