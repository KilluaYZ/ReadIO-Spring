package com.pool.readio.mbg.model;

import java.io.Serializable;

public class PgStatProgressVacuum implements Serializable {
    private Integer pid;

    private Long datid;

    private String datname;

    private Long relid;

    private String phase;

    private Long heapBlksTotal;

    private Long heapBlksScanned;

    private Long heapBlksVacuumed;

    private Long indexVacuumCount;

    private Long maxDeadTupleBytes;

    private Long deadTupleBytes;

    private Long numDeadItemIds;

    private Long indexesTotal;

    private Long indexesProcessed;

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

    public Long getHeapBlksTotal() {
        return heapBlksTotal;
    }

    public void setHeapBlksTotal(Long heapBlksTotal) {
        this.heapBlksTotal = heapBlksTotal;
    }

    public Long getHeapBlksScanned() {
        return heapBlksScanned;
    }

    public void setHeapBlksScanned(Long heapBlksScanned) {
        this.heapBlksScanned = heapBlksScanned;
    }

    public Long getHeapBlksVacuumed() {
        return heapBlksVacuumed;
    }

    public void setHeapBlksVacuumed(Long heapBlksVacuumed) {
        this.heapBlksVacuumed = heapBlksVacuumed;
    }

    public Long getIndexVacuumCount() {
        return indexVacuumCount;
    }

    public void setIndexVacuumCount(Long indexVacuumCount) {
        this.indexVacuumCount = indexVacuumCount;
    }

    public Long getMaxDeadTupleBytes() {
        return maxDeadTupleBytes;
    }

    public void setMaxDeadTupleBytes(Long maxDeadTupleBytes) {
        this.maxDeadTupleBytes = maxDeadTupleBytes;
    }

    public Long getDeadTupleBytes() {
        return deadTupleBytes;
    }

    public void setDeadTupleBytes(Long deadTupleBytes) {
        this.deadTupleBytes = deadTupleBytes;
    }

    public Long getNumDeadItemIds() {
        return numDeadItemIds;
    }

    public void setNumDeadItemIds(Long numDeadItemIds) {
        this.numDeadItemIds = numDeadItemIds;
    }

    public Long getIndexesTotal() {
        return indexesTotal;
    }

    public void setIndexesTotal(Long indexesTotal) {
        this.indexesTotal = indexesTotal;
    }

    public Long getIndexesProcessed() {
        return indexesProcessed;
    }

    public void setIndexesProcessed(Long indexesProcessed) {
        this.indexesProcessed = indexesProcessed;
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
        sb.append(", heapBlksTotal=").append(heapBlksTotal);
        sb.append(", heapBlksScanned=").append(heapBlksScanned);
        sb.append(", heapBlksVacuumed=").append(heapBlksVacuumed);
        sb.append(", indexVacuumCount=").append(indexVacuumCount);
        sb.append(", maxDeadTupleBytes=").append(maxDeadTupleBytes);
        sb.append(", deadTupleBytes=").append(deadTupleBytes);
        sb.append(", numDeadItemIds=").append(numDeadItemIds);
        sb.append(", indexesTotal=").append(indexesTotal);
        sb.append(", indexesProcessed=").append(indexesProcessed);
        sb.append(", delayTime=").append(delayTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}