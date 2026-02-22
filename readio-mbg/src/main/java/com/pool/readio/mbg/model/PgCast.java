package com.pool.readio.mbg.model;

import java.io.Serializable;

public class PgCast implements Serializable {
    private Long oid;

    private Long castsource;

    private Long casttarget;

    private Long castfunc;

    private String castcontext;

    private String castmethod;

    private static final long serialVersionUID = 1L;

    public Long getOid() {
        return oid;
    }

    public void setOid(Long oid) {
        this.oid = oid;
    }

    public Long getCastsource() {
        return castsource;
    }

    public void setCastsource(Long castsource) {
        this.castsource = castsource;
    }

    public Long getCasttarget() {
        return casttarget;
    }

    public void setCasttarget(Long casttarget) {
        this.casttarget = casttarget;
    }

    public Long getCastfunc() {
        return castfunc;
    }

    public void setCastfunc(Long castfunc) {
        this.castfunc = castfunc;
    }

    public String getCastcontext() {
        return castcontext;
    }

    public void setCastcontext(String castcontext) {
        this.castcontext = castcontext;
    }

    public String getCastmethod() {
        return castmethod;
    }

    public void setCastmethod(String castmethod) {
        this.castmethod = castmethod;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", oid=").append(oid);
        sb.append(", castsource=").append(castsource);
        sb.append(", casttarget=").append(casttarget);
        sb.append(", castfunc=").append(castfunc);
        sb.append(", castcontext=").append(castcontext);
        sb.append(", castmethod=").append(castmethod);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}