package com.pool.readio.mbg.model;

import java.io.Serializable;
import java.util.Date;

public class PgStatWal implements Serializable {
    private Long walRecords;

    private Long walFpi;

    private Short walBytes;

    private Long walBuffersFull;

    private Date statsReset;

    private static final long serialVersionUID = 1L;

    public Long getWalRecords() {
        return walRecords;
    }

    public void setWalRecords(Long walRecords) {
        this.walRecords = walRecords;
    }

    public Long getWalFpi() {
        return walFpi;
    }

    public void setWalFpi(Long walFpi) {
        this.walFpi = walFpi;
    }

    public Short getWalBytes() {
        return walBytes;
    }

    public void setWalBytes(Short walBytes) {
        this.walBytes = walBytes;
    }

    public Long getWalBuffersFull() {
        return walBuffersFull;
    }

    public void setWalBuffersFull(Long walBuffersFull) {
        this.walBuffersFull = walBuffersFull;
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
        sb.append(", walRecords=").append(walRecords);
        sb.append(", walFpi=").append(walFpi);
        sb.append(", walBytes=").append(walBytes);
        sb.append(", walBuffersFull=").append(walBuffersFull);
        sb.append(", statsReset=").append(statsReset);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}