package com.pool.readio.mbg.model;

import java.io.Serializable;
import java.util.Date;

public class PgStatArchiver implements Serializable {
    private Long archivedCount;

    private String lastArchivedWal;

    private Date lastArchivedTime;

    private Long failedCount;

    private String lastFailedWal;

    private Date lastFailedTime;

    private Date statsReset;

    private static final long serialVersionUID = 1L;

    public Long getArchivedCount() {
        return archivedCount;
    }

    public void setArchivedCount(Long archivedCount) {
        this.archivedCount = archivedCount;
    }

    public String getLastArchivedWal() {
        return lastArchivedWal;
    }

    public void setLastArchivedWal(String lastArchivedWal) {
        this.lastArchivedWal = lastArchivedWal;
    }

    public Date getLastArchivedTime() {
        return lastArchivedTime;
    }

    public void setLastArchivedTime(Date lastArchivedTime) {
        this.lastArchivedTime = lastArchivedTime;
    }

    public Long getFailedCount() {
        return failedCount;
    }

    public void setFailedCount(Long failedCount) {
        this.failedCount = failedCount;
    }

    public String getLastFailedWal() {
        return lastFailedWal;
    }

    public void setLastFailedWal(String lastFailedWal) {
        this.lastFailedWal = lastFailedWal;
    }

    public Date getLastFailedTime() {
        return lastFailedTime;
    }

    public void setLastFailedTime(Date lastFailedTime) {
        this.lastFailedTime = lastFailedTime;
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
        sb.append(", archivedCount=").append(archivedCount);
        sb.append(", lastArchivedWal=").append(lastArchivedWal);
        sb.append(", lastArchivedTime=").append(lastArchivedTime);
        sb.append(", failedCount=").append(failedCount);
        sb.append(", lastFailedWal=").append(lastFailedWal);
        sb.append(", lastFailedTime=").append(lastFailedTime);
        sb.append(", statsReset=").append(statsReset);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}