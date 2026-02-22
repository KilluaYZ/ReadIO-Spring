package com.pool.readio.readiombg.model;

import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;
import java.util.Date;

public class PgStatReplication implements Serializable {
    private Integer pid;

    private Long usesysid;

    private String usename;

    private String applicationName;

    private Object clientAddr;

    private String clientHostname;

    private Integer clientPort;

    private Date backendStart;

    private Object backendXmin;

    private String state;

    private Object sentLsn;

    private Object writeLsn;

    private Object flushLsn;

    private Object replayLsn;

    private Object writeLag;

    private Object flushLag;

    private Object replayLag;

    private Integer syncPriority;

    private String syncState;

    private Date replyTime;

    private static final long serialVersionUID = 1L;

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public Long getUsesysid() {
        return usesysid;
    }

    public void setUsesysid(Long usesysid) {
        this.usesysid = usesysid;
    }

    public String getUsename() {
        return usename;
    }

    public void setUsename(String usename) {
        this.usename = usename;
    }

    public String getApplicationName() {
        return applicationName;
    }

    public void setApplicationName(String applicationName) {
        this.applicationName = applicationName;
    }

    public Object getClientAddr() {
        return clientAddr;
    }

    public void setClientAddr(Object clientAddr) {
        this.clientAddr = clientAddr;
    }

    public String getClientHostname() {
        return clientHostname;
    }

    public void setClientHostname(String clientHostname) {
        this.clientHostname = clientHostname;
    }

    public Integer getClientPort() {
        return clientPort;
    }

    public void setClientPort(Integer clientPort) {
        this.clientPort = clientPort;
    }

    public Date getBackendStart() {
        return backendStart;
    }

    public void setBackendStart(Date backendStart) {
        this.backendStart = backendStart;
    }

    public Object getBackendXmin() {
        return backendXmin;
    }

    public void setBackendXmin(Object backendXmin) {
        this.backendXmin = backendXmin;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Object getSentLsn() {
        return sentLsn;
    }

    public void setSentLsn(Object sentLsn) {
        this.sentLsn = sentLsn;
    }

    public Object getWriteLsn() {
        return writeLsn;
    }

    public void setWriteLsn(Object writeLsn) {
        this.writeLsn = writeLsn;
    }

    public Object getFlushLsn() {
        return flushLsn;
    }

    public void setFlushLsn(Object flushLsn) {
        this.flushLsn = flushLsn;
    }

    public Object getReplayLsn() {
        return replayLsn;
    }

    public void setReplayLsn(Object replayLsn) {
        this.replayLsn = replayLsn;
    }

    public Object getWriteLag() {
        return writeLag;
    }

    public void setWriteLag(Object writeLag) {
        this.writeLag = writeLag;
    }

    public Object getFlushLag() {
        return flushLag;
    }

    public void setFlushLag(Object flushLag) {
        this.flushLag = flushLag;
    }

    public Object getReplayLag() {
        return replayLag;
    }

    public void setReplayLag(Object replayLag) {
        this.replayLag = replayLag;
    }

    public Integer getSyncPriority() {
        return syncPriority;
    }

    public void setSyncPriority(Integer syncPriority) {
        this.syncPriority = syncPriority;
    }

    public String getSyncState() {
        return syncState;
    }

    public void setSyncState(String syncState) {
        this.syncState = syncState;
    }

    public Date getReplyTime() {
        return replyTime;
    }

    public void setReplyTime(Date replyTime) {
        this.replyTime = replyTime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", pid=").append(pid);
        sb.append(", usesysid=").append(usesysid);
        sb.append(", usename=").append(usename);
        sb.append(", applicationName=").append(applicationName);
        sb.append(", clientAddr=").append(clientAddr);
        sb.append(", clientHostname=").append(clientHostname);
        sb.append(", clientPort=").append(clientPort);
        sb.append(", backendStart=").append(backendStart);
        sb.append(", backendXmin=").append(backendXmin);
        sb.append(", state=").append(state);
        sb.append(", sentLsn=").append(sentLsn);
        sb.append(", writeLsn=").append(writeLsn);
        sb.append(", flushLsn=").append(flushLsn);
        sb.append(", replayLsn=").append(replayLsn);
        sb.append(", writeLag=").append(writeLag);
        sb.append(", flushLag=").append(flushLag);
        sb.append(", replayLag=").append(replayLag);
        sb.append(", syncPriority=").append(syncPriority);
        sb.append(", syncState=").append(syncState);
        sb.append(", replyTime=").append(replyTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}