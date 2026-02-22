package com.pool.readio.readiombg.model;

import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;

public class PgInherits implements Serializable {
    private Long inhrelid;

    private Integer inhseqno;

    private Long inhparent;

    private Boolean inhdetachpending;

    private static final long serialVersionUID = 1L;

    public Long getInhrelid() {
        return inhrelid;
    }

    public void setInhrelid(Long inhrelid) {
        this.inhrelid = inhrelid;
    }

    public Integer getInhseqno() {
        return inhseqno;
    }

    public void setInhseqno(Integer inhseqno) {
        this.inhseqno = inhseqno;
    }

    public Long getInhparent() {
        return inhparent;
    }

    public void setInhparent(Long inhparent) {
        this.inhparent = inhparent;
    }

    public Boolean getInhdetachpending() {
        return inhdetachpending;
    }

    public void setInhdetachpending(Boolean inhdetachpending) {
        this.inhdetachpending = inhdetachpending;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", inhrelid=").append(inhrelid);
        sb.append(", inhseqno=").append(inhseqno);
        sb.append(", inhparent=").append(inhparent);
        sb.append(", inhdetachpending=").append(inhdetachpending);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}