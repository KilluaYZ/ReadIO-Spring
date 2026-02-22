package com.pool.readio.readiombg.model;

import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;

public class PgStatDatabaseConflicts implements Serializable {
    private Long datid;

    private String datname;

    private Long conflTablespace;

    private Long conflLock;

    private Long conflSnapshot;

    private Long conflBufferpin;

    private Long conflDeadlock;

    private Long conflActiveLogicalslot;

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

    public Long getConflTablespace() {
        return conflTablespace;
    }

    public void setConflTablespace(Long conflTablespace) {
        this.conflTablespace = conflTablespace;
    }

    public Long getConflLock() {
        return conflLock;
    }

    public void setConflLock(Long conflLock) {
        this.conflLock = conflLock;
    }

    public Long getConflSnapshot() {
        return conflSnapshot;
    }

    public void setConflSnapshot(Long conflSnapshot) {
        this.conflSnapshot = conflSnapshot;
    }

    public Long getConflBufferpin() {
        return conflBufferpin;
    }

    public void setConflBufferpin(Long conflBufferpin) {
        this.conflBufferpin = conflBufferpin;
    }

    public Long getConflDeadlock() {
        return conflDeadlock;
    }

    public void setConflDeadlock(Long conflDeadlock) {
        this.conflDeadlock = conflDeadlock;
    }

    public Long getConflActiveLogicalslot() {
        return conflActiveLogicalslot;
    }

    public void setConflActiveLogicalslot(Long conflActiveLogicalslot) {
        this.conflActiveLogicalslot = conflActiveLogicalslot;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", datid=").append(datid);
        sb.append(", datname=").append(datname);
        sb.append(", conflTablespace=").append(conflTablespace);
        sb.append(", conflLock=").append(conflLock);
        sb.append(", conflSnapshot=").append(conflSnapshot);
        sb.append(", conflBufferpin=").append(conflBufferpin);
        sb.append(", conflDeadlock=").append(conflDeadlock);
        sb.append(", conflActiveLogicalslot=").append(conflActiveLogicalslot);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}