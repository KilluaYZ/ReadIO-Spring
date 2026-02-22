package com.pool.readio.readiombg.model;

import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;

public class PgStatisticExtData implements Serializable {
    private Long stxoid;

    private Boolean stxdinherit;

    private Object stxdndistinct;

    private Object stxddependencies;

    private Object stxdmcv;

    private Object stxdexpr;

    private static final long serialVersionUID = 1L;

    public Long getStxoid() {
        return stxoid;
    }

    public void setStxoid(Long stxoid) {
        this.stxoid = stxoid;
    }

    public Boolean getStxdinherit() {
        return stxdinherit;
    }

    public void setStxdinherit(Boolean stxdinherit) {
        this.stxdinherit = stxdinherit;
    }

    public Object getStxdndistinct() {
        return stxdndistinct;
    }

    public void setStxdndistinct(Object stxdndistinct) {
        this.stxdndistinct = stxdndistinct;
    }

    public Object getStxddependencies() {
        return stxddependencies;
    }

    public void setStxddependencies(Object stxddependencies) {
        this.stxddependencies = stxddependencies;
    }

    public Object getStxdmcv() {
        return stxdmcv;
    }

    public void setStxdmcv(Object stxdmcv) {
        this.stxdmcv = stxdmcv;
    }

    public Object getStxdexpr() {
        return stxdexpr;
    }

    public void setStxdexpr(Object stxdexpr) {
        this.stxdexpr = stxdexpr;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", stxoid=").append(stxoid);
        sb.append(", stxdinherit=").append(stxdinherit);
        sb.append(", stxdndistinct=").append(stxdndistinct);
        sb.append(", stxddependencies=").append(stxddependencies);
        sb.append(", stxdmcv=").append(stxdmcv);
        sb.append(", stxdexpr=").append(stxdexpr);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}