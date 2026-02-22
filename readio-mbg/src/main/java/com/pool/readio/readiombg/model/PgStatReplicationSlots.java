package com.pool.readio.readiombg.model;

import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;
import java.util.Date;

public class PgStatReplicationSlots implements Serializable {
    private String slotName;

    private Long spillTxns;

    private Long spillCount;

    private Long spillBytes;

    private Long streamTxns;

    private Long streamCount;

    private Long streamBytes;

    private Long totalTxns;

    private Long totalBytes;

    private Date statsReset;

    private static final long serialVersionUID = 1L;

    public String getSlotName() {
        return slotName;
    }

    public void setSlotName(String slotName) {
        this.slotName = slotName;
    }

    public Long getSpillTxns() {
        return spillTxns;
    }

    public void setSpillTxns(Long spillTxns) {
        this.spillTxns = spillTxns;
    }

    public Long getSpillCount() {
        return spillCount;
    }

    public void setSpillCount(Long spillCount) {
        this.spillCount = spillCount;
    }

    public Long getSpillBytes() {
        return spillBytes;
    }

    public void setSpillBytes(Long spillBytes) {
        this.spillBytes = spillBytes;
    }

    public Long getStreamTxns() {
        return streamTxns;
    }

    public void setStreamTxns(Long streamTxns) {
        this.streamTxns = streamTxns;
    }

    public Long getStreamCount() {
        return streamCount;
    }

    public void setStreamCount(Long streamCount) {
        this.streamCount = streamCount;
    }

    public Long getStreamBytes() {
        return streamBytes;
    }

    public void setStreamBytes(Long streamBytes) {
        this.streamBytes = streamBytes;
    }

    public Long getTotalTxns() {
        return totalTxns;
    }

    public void setTotalTxns(Long totalTxns) {
        this.totalTxns = totalTxns;
    }

    public Long getTotalBytes() {
        return totalBytes;
    }

    public void setTotalBytes(Long totalBytes) {
        this.totalBytes = totalBytes;
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
        sb.append(", slotName=").append(slotName);
        sb.append(", spillTxns=").append(spillTxns);
        sb.append(", spillCount=").append(spillCount);
        sb.append(", spillBytes=").append(spillBytes);
        sb.append(", streamTxns=").append(streamTxns);
        sb.append(", streamCount=").append(streamCount);
        sb.append(", streamBytes=").append(streamBytes);
        sb.append(", totalTxns=").append(totalTxns);
        sb.append(", totalBytes=").append(totalBytes);
        sb.append(", statsReset=").append(statsReset);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}