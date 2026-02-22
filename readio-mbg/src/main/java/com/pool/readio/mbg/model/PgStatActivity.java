package com.pool.readio.mbg.model;

import java.io.Serializable;
import java.util.Date;

public class PgStatActivity implements Serializable {
    private Long datid;

    private String datname;

    private Integer pid;

    private Integer leaderPid;

    private Long usesysid;

    private String usename;

    private String applicationName;

    private Object clientAddr;

    private String clientHostname;

    private Integer clientPort;

    private Date backendStart;

    private Date xactStart;

    private Date queryStart;

    private Date stateChange;

    private String waitEventType;

    private String waitEvent;

    private String state;

    private Object backendXid;

    private Object backendXmin;

    private Long queryId;

    private String query;

    private String backendType;

    private static final long serialVersionUID = 1L;

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

    public Date getXactStart() {
        return xactStart;
    }

    public void setXactStart(Date xactStart) {
        this.xactStart = xactStart;
    }

    public Date getQueryStart() {
        return queryStart;
    }

    public void setQueryStart(Date queryStart) {
        this.queryStart = queryStart;
    }

    public Date getStateChange() {
        return stateChange;
    }

    public void setStateChange(Date stateChange) {
        this.stateChange = stateChange;
    }

    public String getWaitEventType() {
        return waitEventType;
    }

    public void setWaitEventType(String waitEventType) {
        this.waitEventType = waitEventType;
    }

    public String getWaitEvent() {
        return waitEvent;
    }

    public void setWaitEvent(String waitEvent) {
        this.waitEvent = waitEvent;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Object getBackendXid() {
        return backendXid;
    }

    public void setBackendXid(Object backendXid) {
        this.backendXid = backendXid;
    }

    public Object getBackendXmin() {
        return backendXmin;
    }

    public void setBackendXmin(Object backendXmin) {
        this.backendXmin = backendXmin;
    }

    public Long getQueryId() {
        return queryId;
    }

    public void setQueryId(Long queryId) {
        this.queryId = queryId;
    }

    public String getQuery() {
        return query;
    }

    public void setQuery(String query) {
        this.query = query;
    }

    public String getBackendType() {
        return backendType;
    }

    public void setBackendType(String backendType) {
        this.backendType = backendType;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", datid=").append(datid);
        sb.append(", datname=").append(datname);
        sb.append(", pid=").append(pid);
        sb.append(", leaderPid=").append(leaderPid);
        sb.append(", usesysid=").append(usesysid);
        sb.append(", usename=").append(usename);
        sb.append(", applicationName=").append(applicationName);
        sb.append(", clientAddr=").append(clientAddr);
        sb.append(", clientHostname=").append(clientHostname);
        sb.append(", clientPort=").append(clientPort);
        sb.append(", backendStart=").append(backendStart);
        sb.append(", xactStart=").append(xactStart);
        sb.append(", queryStart=").append(queryStart);
        sb.append(", stateChange=").append(stateChange);
        sb.append(", waitEventType=").append(waitEventType);
        sb.append(", waitEvent=").append(waitEvent);
        sb.append(", state=").append(state);
        sb.append(", backendXid=").append(backendXid);
        sb.append(", backendXmin=").append(backendXmin);
        sb.append(", queryId=").append(queryId);
        sb.append(", query=").append(query);
        sb.append(", backendType=").append(backendType);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}