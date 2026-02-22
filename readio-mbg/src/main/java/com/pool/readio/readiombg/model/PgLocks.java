package com.pool.readio.readiombg.model;

import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;
import java.util.Date;

public class PgLocks implements Serializable {
    private String locktype;

    private Long database;

    private Long relation;

    private Integer page;

    private Short tuple;

    private String virtualxid;

    private Object transactionid;

    private Long classid;

    private Long objid;

    private Short objsubid;

    private String virtualtransaction;

    private Integer pid;

    private String mode;

    private Boolean granted;

    private Boolean fastpath;

    private Date waitstart;

    private static final long serialVersionUID = 1L;

    public String getLocktype() {
        return locktype;
    }

    public void setLocktype(String locktype) {
        this.locktype = locktype;
    }

    public Long getDatabase() {
        return database;
    }

    public void setDatabase(Long database) {
        this.database = database;
    }

    public Long getRelation() {
        return relation;
    }

    public void setRelation(Long relation) {
        this.relation = relation;
    }

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public Short getTuple() {
        return tuple;
    }

    public void setTuple(Short tuple) {
        this.tuple = tuple;
    }

    public String getVirtualxid() {
        return virtualxid;
    }

    public void setVirtualxid(String virtualxid) {
        this.virtualxid = virtualxid;
    }

    public Object getTransactionid() {
        return transactionid;
    }

    public void setTransactionid(Object transactionid) {
        this.transactionid = transactionid;
    }

    public Long getClassid() {
        return classid;
    }

    public void setClassid(Long classid) {
        this.classid = classid;
    }

    public Long getObjid() {
        return objid;
    }

    public void setObjid(Long objid) {
        this.objid = objid;
    }

    public Short getObjsubid() {
        return objsubid;
    }

    public void setObjsubid(Short objsubid) {
        this.objsubid = objsubid;
    }

    public String getVirtualtransaction() {
        return virtualtransaction;
    }

    public void setVirtualtransaction(String virtualtransaction) {
        this.virtualtransaction = virtualtransaction;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public String getMode() {
        return mode;
    }

    public void setMode(String mode) {
        this.mode = mode;
    }

    public Boolean getGranted() {
        return granted;
    }

    public void setGranted(Boolean granted) {
        this.granted = granted;
    }

    public Boolean getFastpath() {
        return fastpath;
    }

    public void setFastpath(Boolean fastpath) {
        this.fastpath = fastpath;
    }

    public Date getWaitstart() {
        return waitstart;
    }

    public void setWaitstart(Date waitstart) {
        this.waitstart = waitstart;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", locktype=").append(locktype);
        sb.append(", database=").append(database);
        sb.append(", relation=").append(relation);
        sb.append(", page=").append(page);
        sb.append(", tuple=").append(tuple);
        sb.append(", virtualxid=").append(virtualxid);
        sb.append(", transactionid=").append(transactionid);
        sb.append(", classid=").append(classid);
        sb.append(", objid=").append(objid);
        sb.append(", objsubid=").append(objsubid);
        sb.append(", virtualtransaction=").append(virtualtransaction);
        sb.append(", pid=").append(pid);
        sb.append(", mode=").append(mode);
        sb.append(", granted=").append(granted);
        sb.append(", fastpath=").append(fastpath);
        sb.append(", waitstart=").append(waitstart);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}