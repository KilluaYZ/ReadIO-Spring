package com.pool.readio.readiombg.model;

import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;
import java.util.Date;

public class PgStatDatabase implements Serializable {
    private Long datid;

    private String datname;

    private Integer numbackends;

    private Long xactCommit;

    private Long xactRollback;

    private Long blksRead;

    private Long blksHit;

    private Long tupReturned;

    private Long tupFetched;

    private Long tupInserted;

    private Long tupUpdated;

    private Long tupDeleted;

    private Long conflicts;

    private Long tempFiles;

    private Long tempBytes;

    private Long deadlocks;

    private Long checksumFailures;

    private Date checksumLastFailure;

    private Double blkReadTime;

    private Double blkWriteTime;

    private Double sessionTime;

    private Double activeTime;

    private Double idleInTransactionTime;

    private Long sessions;

    private Long sessionsAbandoned;

    private Long sessionsFatal;

    private Long sessionsKilled;

    private Long parallelWorkersToLaunch;

    private Long parallelWorkersLaunched;

    private Date statsReset;

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

    public Integer getNumbackends() {
        return numbackends;
    }

    public void setNumbackends(Integer numbackends) {
        this.numbackends = numbackends;
    }

    public Long getXactCommit() {
        return xactCommit;
    }

    public void setXactCommit(Long xactCommit) {
        this.xactCommit = xactCommit;
    }

    public Long getXactRollback() {
        return xactRollback;
    }

    public void setXactRollback(Long xactRollback) {
        this.xactRollback = xactRollback;
    }

    public Long getBlksRead() {
        return blksRead;
    }

    public void setBlksRead(Long blksRead) {
        this.blksRead = blksRead;
    }

    public Long getBlksHit() {
        return blksHit;
    }

    public void setBlksHit(Long blksHit) {
        this.blksHit = blksHit;
    }

    public Long getTupReturned() {
        return tupReturned;
    }

    public void setTupReturned(Long tupReturned) {
        this.tupReturned = tupReturned;
    }

    public Long getTupFetched() {
        return tupFetched;
    }

    public void setTupFetched(Long tupFetched) {
        this.tupFetched = tupFetched;
    }

    public Long getTupInserted() {
        return tupInserted;
    }

    public void setTupInserted(Long tupInserted) {
        this.tupInserted = tupInserted;
    }

    public Long getTupUpdated() {
        return tupUpdated;
    }

    public void setTupUpdated(Long tupUpdated) {
        this.tupUpdated = tupUpdated;
    }

    public Long getTupDeleted() {
        return tupDeleted;
    }

    public void setTupDeleted(Long tupDeleted) {
        this.tupDeleted = tupDeleted;
    }

    public Long getConflicts() {
        return conflicts;
    }

    public void setConflicts(Long conflicts) {
        this.conflicts = conflicts;
    }

    public Long getTempFiles() {
        return tempFiles;
    }

    public void setTempFiles(Long tempFiles) {
        this.tempFiles = tempFiles;
    }

    public Long getTempBytes() {
        return tempBytes;
    }

    public void setTempBytes(Long tempBytes) {
        this.tempBytes = tempBytes;
    }

    public Long getDeadlocks() {
        return deadlocks;
    }

    public void setDeadlocks(Long deadlocks) {
        this.deadlocks = deadlocks;
    }

    public Long getChecksumFailures() {
        return checksumFailures;
    }

    public void setChecksumFailures(Long checksumFailures) {
        this.checksumFailures = checksumFailures;
    }

    public Date getChecksumLastFailure() {
        return checksumLastFailure;
    }

    public void setChecksumLastFailure(Date checksumLastFailure) {
        this.checksumLastFailure = checksumLastFailure;
    }

    public Double getBlkReadTime() {
        return blkReadTime;
    }

    public void setBlkReadTime(Double blkReadTime) {
        this.blkReadTime = blkReadTime;
    }

    public Double getBlkWriteTime() {
        return blkWriteTime;
    }

    public void setBlkWriteTime(Double blkWriteTime) {
        this.blkWriteTime = blkWriteTime;
    }

    public Double getSessionTime() {
        return sessionTime;
    }

    public void setSessionTime(Double sessionTime) {
        this.sessionTime = sessionTime;
    }

    public Double getActiveTime() {
        return activeTime;
    }

    public void setActiveTime(Double activeTime) {
        this.activeTime = activeTime;
    }

    public Double getIdleInTransactionTime() {
        return idleInTransactionTime;
    }

    public void setIdleInTransactionTime(Double idleInTransactionTime) {
        this.idleInTransactionTime = idleInTransactionTime;
    }

    public Long getSessions() {
        return sessions;
    }

    public void setSessions(Long sessions) {
        this.sessions = sessions;
    }

    public Long getSessionsAbandoned() {
        return sessionsAbandoned;
    }

    public void setSessionsAbandoned(Long sessionsAbandoned) {
        this.sessionsAbandoned = sessionsAbandoned;
    }

    public Long getSessionsFatal() {
        return sessionsFatal;
    }

    public void setSessionsFatal(Long sessionsFatal) {
        this.sessionsFatal = sessionsFatal;
    }

    public Long getSessionsKilled() {
        return sessionsKilled;
    }

    public void setSessionsKilled(Long sessionsKilled) {
        this.sessionsKilled = sessionsKilled;
    }

    public Long getParallelWorkersToLaunch() {
        return parallelWorkersToLaunch;
    }

    public void setParallelWorkersToLaunch(Long parallelWorkersToLaunch) {
        this.parallelWorkersToLaunch = parallelWorkersToLaunch;
    }

    public Long getParallelWorkersLaunched() {
        return parallelWorkersLaunched;
    }

    public void setParallelWorkersLaunched(Long parallelWorkersLaunched) {
        this.parallelWorkersLaunched = parallelWorkersLaunched;
    }

    public Date getStatsReset() {
        return statsReset;
    }

    public void setStatsReset(Date statsReset) {
        this.statsReset = statsReset;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", datid=").append(datid);
        sb.append(", datname=").append(datname);
        sb.append(", numbackends=").append(numbackends);
        sb.append(", xactCommit=").append(xactCommit);
        sb.append(", xactRollback=").append(xactRollback);
        sb.append(", blksRead=").append(blksRead);
        sb.append(", blksHit=").append(blksHit);
        sb.append(", tupReturned=").append(tupReturned);
        sb.append(", tupFetched=").append(tupFetched);
        sb.append(", tupInserted=").append(tupInserted);
        sb.append(", tupUpdated=").append(tupUpdated);
        sb.append(", tupDeleted=").append(tupDeleted);
        sb.append(", conflicts=").append(conflicts);
        sb.append(", tempFiles=").append(tempFiles);
        sb.append(", tempBytes=").append(tempBytes);
        sb.append(", deadlocks=").append(deadlocks);
        sb.append(", checksumFailures=").append(checksumFailures);
        sb.append(", checksumLastFailure=").append(checksumLastFailure);
        sb.append(", blkReadTime=").append(blkReadTime);
        sb.append(", blkWriteTime=").append(blkWriteTime);
        sb.append(", sessionTime=").append(sessionTime);
        sb.append(", activeTime=").append(activeTime);
        sb.append(", idleInTransactionTime=").append(idleInTransactionTime);
        sb.append(", sessions=").append(sessions);
        sb.append(", sessionsAbandoned=").append(sessionsAbandoned);
        sb.append(", sessionsFatal=").append(sessionsFatal);
        sb.append(", sessionsKilled=").append(sessionsKilled);
        sb.append(", parallelWorkersToLaunch=").append(parallelWorkersToLaunch);
        sb.append(", parallelWorkersLaunched=").append(parallelWorkersLaunched);
        sb.append(", statsReset=").append(statsReset);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}