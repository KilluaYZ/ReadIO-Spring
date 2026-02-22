package com.pool.readio.readiombg.model;

import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;

public class PgStatProgressAnalyze implements Serializable {
    private Integer pid;

    private Long datid;

    private String datname;

    private Long relid;

    private String phase;

    private Long sampleBlksTotal;

    private Long sampleBlksScanned;

    private Long extStatsTotal;

    private Long extStatsComputed;

    private Long childTablesTotal;

    private Long childTablesDone;

    private Long currentChildTableRelid;

    private Double delayTime;

    private static final long serialVersionUID = 1L;

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public Long getDatid() {
        return datid;
    }

    public void setDatid(Long datid) {
        this.datid = datid;
    }

    public String getDatname() {
        return datname;
    }

    public void setDatname(String datname) {
        this.datname = datname;
    }

    public Long getRelid() {
        return relid;
    }

    public void setRelid(Long relid) {
        this.relid = relid;
    }

    public String getPhase() {
        return phase;
    }

    public void setPhase(String phase) {
        this.phase = phase;
    }

    public Long getSampleBlksTotal() {
        return sampleBlksTotal;
    }

    public void setSampleBlksTotal(Long sampleBlksTotal) {
        this.sampleBlksTotal = sampleBlksTotal;
    }

    public Long getSampleBlksScanned() {
        return sampleBlksScanned;
    }

    public void setSampleBlksScanned(Long sampleBlksScanned) {
        this.sampleBlksScanned = sampleBlksScanned;
    }

    public Long getExtStatsTotal() {
        return extStatsTotal;
    }

    public void setExtStatsTotal(Long extStatsTotal) {
        this.extStatsTotal = extStatsTotal;
    }

    public Long getExtStatsComputed() {
        return extStatsComputed;
    }

    public void setExtStatsComputed(Long extStatsComputed) {
        this.extStatsComputed = extStatsComputed;
    }

    public Long getChildTablesTotal() {
        return childTablesTotal;
    }

    public void setChildTablesTotal(Long childTablesTotal) {
        this.childTablesTotal = childTablesTotal;
    }

    public Long getChildTablesDone() {
        return childTablesDone;
    }

    public void setChildTablesDone(Long childTablesDone) {
        this.childTablesDone = childTablesDone;
    }

    public Long getCurrentChildTableRelid() {
        return currentChildTableRelid;
    }

    public void setCurrentChildTableRelid(Long currentChildTableRelid) {
        this.currentChildTableRelid = currentChildTableRelid;
    }

    public Double getDelayTime() {
        return delayTime;
    }

    public void setDelayTime(Double delayTime) {
        this.delayTime = delayTime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", pid=").append(pid);
        sb.append(", datid=").append(datid);
        sb.append(", datname=").append(datname);
        sb.append(", relid=").append(relid);
        sb.append(", phase=").append(phase);
        sb.append(", sampleBlksTotal=").append(sampleBlksTotal);
        sb.append(", sampleBlksScanned=").append(sampleBlksScanned);
        sb.append(", extStatsTotal=").append(extStatsTotal);
        sb.append(", extStatsComputed=").append(extStatsComputed);
        sb.append(", childTablesTotal=").append(childTablesTotal);
        sb.append(", childTablesDone=").append(childTablesDone);
        sb.append(", currentChildTableRelid=").append(currentChildTableRelid);
        sb.append(", delayTime=").append(delayTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}