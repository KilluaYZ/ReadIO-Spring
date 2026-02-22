package com.pool.readio.readiombg.model;

import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;

public class PgSequence implements Serializable {
    private Long seqrelid;

    private Long seqtypid;

    private Long seqstart;

    private Long seqincrement;

    private Long seqmax;

    private Long seqmin;

    private Long seqcache;

    private Boolean seqcycle;

    private static final long serialVersionUID = 1L;

    public Long getSeqrelid() {
        return seqrelid;
    }

    public void setSeqrelid(Long seqrelid) {
        this.seqrelid = seqrelid;
    }

    public Long getSeqtypid() {
        return seqtypid;
    }

    public void setSeqtypid(Long seqtypid) {
        this.seqtypid = seqtypid;
    }

    public Long getSeqstart() {
        return seqstart;
    }

    public void setSeqstart(Long seqstart) {
        this.seqstart = seqstart;
    }

    public Long getSeqincrement() {
        return seqincrement;
    }

    public void setSeqincrement(Long seqincrement) {
        this.seqincrement = seqincrement;
    }

    public Long getSeqmax() {
        return seqmax;
    }

    public void setSeqmax(Long seqmax) {
        this.seqmax = seqmax;
    }

    public Long getSeqmin() {
        return seqmin;
    }

    public void setSeqmin(Long seqmin) {
        this.seqmin = seqmin;
    }

    public Long getSeqcache() {
        return seqcache;
    }

    public void setSeqcache(Long seqcache) {
        this.seqcache = seqcache;
    }

    public Boolean getSeqcycle() {
        return seqcycle;
    }

    public void setSeqcycle(Boolean seqcycle) {
        this.seqcycle = seqcycle;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", seqrelid=").append(seqrelid);
        sb.append(", seqtypid=").append(seqtypid);
        sb.append(", seqstart=").append(seqstart);
        sb.append(", seqincrement=").append(seqincrement);
        sb.append(", seqmax=").append(seqmax);
        sb.append(", seqmin=").append(seqmin);
        sb.append(", seqcache=").append(seqcache);
        sb.append(", seqcycle=").append(seqcycle);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}