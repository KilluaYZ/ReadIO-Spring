package com.pool.readio.mbg.model;

import java.io.Serializable;
import java.util.Date;

public class PgStatBgwriter implements Serializable {
    private Long buffersClean;

    private Long maxwrittenClean;

    private Long buffersAlloc;

    private Date statsReset;

    private static final long serialVersionUID = 1L;

    public Long getBuffersClean() {
        return buffersClean;
    }

    public void setBuffersClean(Long buffersClean) {
        this.buffersClean = buffersClean;
    }

    public Long getMaxwrittenClean() {
        return maxwrittenClean;
    }

    public void setMaxwrittenClean(Long maxwrittenClean) {
        this.maxwrittenClean = maxwrittenClean;
    }

    public Long getBuffersAlloc() {
        return buffersAlloc;
    }

    public void setBuffersAlloc(Long buffersAlloc) {
        this.buffersAlloc = buffersAlloc;
    }

    public Date getStatsReset() {
        return statsReset;
    }

    public void setStatsReset(Date statsReset) {
        this.statsReset = statsReset;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", buffersClean=").append(buffersClean);
        sb.append(", maxwrittenClean=").append(maxwrittenClean);
        sb.append(", buffersAlloc=").append(buffersAlloc);
        sb.append(", statsReset=").append(statsReset);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}