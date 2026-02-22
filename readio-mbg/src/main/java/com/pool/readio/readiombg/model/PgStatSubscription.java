package com.pool.readio.readiombg.model;

import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;
import java.util.Date;

public class PgStatSubscription implements Serializable {
    private Long subid;

    private String subname;

    private String workerType;

    private Integer pid;

    private Integer leaderPid;

    private Long relid;

    private Object receivedLsn;

    private Date lastMsgSendTime;

    private Date lastMsgReceiptTime;

    private Object latestEndLsn;

    private Date latestEndTime;

    private static final long serialVersionUID = 1L;

    public Long getSubid() {
        return subid;
    }

    public void setSubid(Long subid) {
        this.subid = subid;
    }

    public String getSubname() {
        return subname;
    }

    public void setSubname(String subname) {
        this.subname = subname;
    }

    public String getWorkerType() {
        return workerType;
    }

    public void setWorkerType(String workerType) {
        this.workerType = workerType;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public Integer getLeaderPid() {
        return leaderPid;
    }

    public void setLeaderPid(Integer leaderPid) {
        this.leaderPid = leaderPid;
    }

    public Long getRelid() {
        return relid;
    }

    public void setRelid(Long relid) {
        this.relid = relid;
    }

    public Object getReceivedLsn() {
        return receivedLsn;
    }

    public void setReceivedLsn(Object receivedLsn) {
        this.receivedLsn = receivedLsn;
    }

    public Date getLastMsgSendTime() {
        return lastMsgSendTime;
    }

    public void setLastMsgSendTime(Date lastMsgSendTime) {
        this.lastMsgSendTime = lastMsgSendTime;
    }

    public Date getLastMsgReceiptTime() {
        return lastMsgReceiptTime;
    }

    public void setLastMsgReceiptTime(Date lastMsgReceiptTime) {
        this.lastMsgReceiptTime = lastMsgReceiptTime;
    }

    public Object getLatestEndLsn() {
        return latestEndLsn;
    }

    public void setLatestEndLsn(Object latestEndLsn) {
        this.latestEndLsn = latestEndLsn;
    }

    public Date getLatestEndTime() {
        return latestEndTime;
    }

    public void setLatestEndTime(Date latestEndTime) {
        this.latestEndTime = latestEndTime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", subid=").append(subid);
        sb.append(", subname=").append(subname);
        sb.append(", workerType=").append(workerType);
        sb.append(", pid=").append(pid);
        sb.append(", leaderPid=").append(leaderPid);
        sb.append(", relid=").append(relid);
        sb.append(", receivedLsn=").append(receivedLsn);
        sb.append(", lastMsgSendTime=").append(lastMsgSendTime);
        sb.append(", lastMsgReceiptTime=").append(lastMsgReceiptTime);
        sb.append(", latestEndLsn=").append(latestEndLsn);
        sb.append(", latestEndTime=").append(latestEndTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}