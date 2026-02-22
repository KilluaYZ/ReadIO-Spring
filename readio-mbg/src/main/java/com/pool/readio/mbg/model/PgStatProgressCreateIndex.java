package com.pool.readio.mbg.model;

import java.io.Serializable;

public class PgStatProgressCreateIndex implements Serializable {
    private Integer pid;

    private Long datid;

    private String datname;

    private Long relid;

    private Long indexRelid;

    private String command;

    private String phase;

    private Long lockersTotal;

    private Long lockersDone;

    private Long currentLockerPid;

    private Long blocksTotal;

    private Long blocksDone;

    private Long tuplesTotal;

    private Long tuplesDone;

    private Long partitionsTotal;

    private Long partitionsDone;

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

    public Long getIndexRelid() {
        return indexRelid;
    }

    public void setIndexRelid(Long indexRelid) {
        this.indexRelid = indexRelid;
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

    public Long getLockersTotal() {
        return lockersTotal;
    }

    public void setLockersTotal(Long lockersTotal) {
        this.lockersTotal = lockersTotal;
    }

    public Long getLockersDone() {
        return lockersDone;
    }

    public void setLockersDone(Long lockersDone) {
        this.lockersDone = lockersDone;
    }

    public Long getCurrentLockerPid() {
        return currentLockerPid;
    }

    public void setCurrentLockerPid(Long currentLockerPid) {
        this.currentLockerPid = currentLockerPid;
    }

    public Long getBlocksTotal() {
        return blocksTotal;
    }

    public void setBlocksTotal(Long blocksTotal) {
        this.blocksTotal = blocksTotal;
    }

    public Long getBlocksDone() {
        return blocksDone;
    }

    public void setBlocksDone(Long blocksDone) {
        this.blocksDone = blocksDone;
    }

    public Long getTuplesTotal() {
        return tuplesTotal;
    }

    public void setTuplesTotal(Long tuplesTotal) {
        this.tuplesTotal = tuplesTotal;
    }

    public Long getTuplesDone() {
        return tuplesDone;
    }

    public void setTuplesDone(Long tuplesDone) {
        this.tuplesDone = tuplesDone;
    }

    public Long getPartitionsTotal() {
        return partitionsTotal;
    }

    public void setPartitionsTotal(Long partitionsTotal) {
        this.partitionsTotal = partitionsTotal;
    }

    public Long getPartitionsDone() {
        return partitionsDone;
    }

    public void setPartitionsDone(Long partitionsDone) {
        this.partitionsDone = partitionsDone;
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
        sb.append(", indexRelid=").append(indexRelid);
        sb.append(", command=").append(command);
        sb.append(", phase=").append(phase);
        sb.append(", lockersTotal=").append(lockersTotal);
        sb.append(", lockersDone=").append(lockersDone);
        sb.append(", currentLockerPid=").append(currentLockerPid);
        sb.append(", blocksTotal=").append(blocksTotal);
        sb.append(", blocksDone=").append(blocksDone);
        sb.append(", tuplesTotal=").append(tuplesTotal);
        sb.append(", tuplesDone=").append(tuplesDone);
        sb.append(", partitionsTotal=").append(partitionsTotal);
        sb.append(", partitionsDone=").append(partitionsDone);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}