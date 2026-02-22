package com.pool.readio.mbg.model;

import java.io.Serializable;

public class PgStatProgressCluster implements Serializable {
    private Integer pid;

    private Long datid;

    private String datname;

    private Long relid;

    private String command;

    private String phase;

    private Long clusterIndexRelid;

    private Long heapTuplesScanned;

    private Long heapTuplesWritten;

    private Long heapBlksTotal;

    private Long heapBlksScanned;

    private Long indexRebuildCount;

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

    public String getCommand() {
        return command;
    }

    public void setCommand(String command) {
        this.command = command;
    }

    public String getPhase() {
        return phase;
    }

    public void setPhase(String phase) {
        this.phase = phase;
    }

    public Long getClusterIndexRelid() {
        return clusterIndexRelid;
    }

    public void setClusterIndexRelid(Long clusterIndexRelid) {
        this.clusterIndexRelid = clusterIndexRelid;
    }

    public Long getHeapTuplesScanned() {
        return heapTuplesScanned;
    }

    public void setHeapTuplesScanned(Long heapTuplesScanned) {
        this.heapTuplesScanned = heapTuplesScanned;
    }

    public Long getHeapTuplesWritten() {
        return heapTuplesWritten;
    }

    public void setHeapTuplesWritten(Long heapTuplesWritten) {
        this.heapTuplesWritten = heapTuplesWritten;
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

    public Long getIndexRebuildCount() {
        return indexRebuildCount;
    }

    public void setIndexRebuildCount(Long indexRebuildCount) {
        this.indexRebuildCount = indexRebuildCount;
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
        sb.append(", command=").append(command);
        sb.append(", phase=").append(phase);
        sb.append(", clusterIndexRelid=").append(clusterIndexRelid);
        sb.append(", heapTuplesScanned=").append(heapTuplesScanned);
        sb.append(", heapTuplesWritten=").append(heapTuplesWritten);
        sb.append(", heapBlksTotal=").append(heapBlksTotal);
        sb.append(", heapBlksScanned=").append(heapBlksScanned);
        sb.append(", indexRebuildCount=").append(indexRebuildCount);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}