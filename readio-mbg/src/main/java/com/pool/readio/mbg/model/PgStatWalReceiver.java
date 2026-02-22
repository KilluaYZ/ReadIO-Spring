package com.pool.readio.mbg.model;

import java.io.Serializable;
import java.util.Date;

public class PgStatWalReceiver implements Serializable {
    private Integer pid;

    private String status;

    private Object receiveStartLsn;

    private Integer receiveStartTli;

    private Object writtenLsn;

    private Object flushedLsn;

    private Integer receivedTli;

    private Date lastMsgSendTime;

    private Date lastMsgReceiptTime;

    private Object latestEndLsn;

    private Date latestEndTime;

    private String slotName;

    private String senderHost;

    private Integer senderPort;

    private String conninfo;

    private static final long serialVersionUID = 1L;

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Object getReceiveStartLsn() {
        return receiveStartLsn;
    }

    public void setReceiveStartLsn(Object receiveStartLsn) {
        this.receiveStartLsn = receiveStartLsn;
    }

    public Integer getReceiveStartTli() {
        return receiveStartTli;
    }

    public void setReceiveStartTli(Integer receiveStartTli) {
        this.receiveStartTli = receiveStartTli;
    }

    public Object getWrittenLsn() {
        return writtenLsn;
    }

    public void setWrittenLsn(Object writtenLsn) {
        this.writtenLsn = writtenLsn;
    }

    public Object getFlushedLsn() {
        return flushedLsn;
    }

    public void setFlushedLsn(Object flushedLsn) {
        this.flushedLsn = flushedLsn;
    }

    public Integer getReceivedTli() {
        return receivedTli;
    }

    public void setReceivedTli(Integer receivedTli) {
        this.receivedTli = receivedTli;
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

    public String getSlotName() {
        return slotName;
    }

    public void setSlotName(String slotName) {
        this.slotName = slotName;
    }

    public String getSenderHost() {
        return senderHost;
    }

    public void setSenderHost(String senderHost) {
        this.senderHost = senderHost;
    }

    public Integer getSenderPort() {
        return senderPort;
    }

    public void setSenderPort(Integer senderPort) {
        this.senderPort = senderPort;
    }

    public String getConninfo() {
        return conninfo;
    }

    public void setConninfo(String conninfo) {
        this.conninfo = conninfo;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", pid=").append(pid);
        sb.append(", status=").append(status);
        sb.append(", receiveStartLsn=").append(receiveStartLsn);
        sb.append(", receiveStartTli=").append(receiveStartTli);
        sb.append(", writtenLsn=").append(writtenLsn);
        sb.append(", flushedLsn=").append(flushedLsn);
        sb.append(", receivedTli=").append(receivedTli);
        sb.append(", lastMsgSendTime=").append(lastMsgSendTime);
        sb.append(", lastMsgReceiptTime=").append(lastMsgReceiptTime);
        sb.append(", latestEndLsn=").append(latestEndLsn);
        sb.append(", latestEndTime=").append(latestEndTime);
        sb.append(", slotName=").append(slotName);
        sb.append(", senderHost=").append(senderHost);
        sb.append(", senderPort=").append(senderPort);
        sb.append(", conninfo=").append(conninfo);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}