package com.pool.readio.readiombg.model;

import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;
import java.util.Date;

public class PgStatSlru implements Serializable {
    private String name;

    private Long blksZeroed;

    private Long blksHit;

    private Long blksRead;

    private Long blksWritten;

    private Long blksExists;

    private Long flushes;

    private Long truncates;

    private Date statsReset;

    private static final long serialVersionUID = 1L;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getBlksZeroed() {
        return blksZeroed;
    }

    public void setBlksZeroed(Long blksZeroed) {
        this.blksZeroed = blksZeroed;
    }

    public Long getBlksHit() {
        return blksHit;
    }

    public void setBlksHit(Long blksHit) {
        this.blksHit = blksHit;
    }

    public Long getBlksRead() {
        return blksRead;
    }

    public void setBlksRead(Long blksRead) {
        this.blksRead = blksRead;
    }

    public Long getBlksWritten() {
        return blksWritten;
    }

    public void setBlksWritten(Long blksWritten) {
        this.blksWritten = blksWritten;
    }

    public Long getBlksExists() {
        return blksExists;
    }

    public void setBlksExists(Long blksExists) {
        this.blksExists = blksExists;
    }

    public Long getFlushes() {
        return flushes;
    }

    public void setFlushes(Long flushes) {
        this.flushes = flushes;
    }

    public Long getTruncates() {
        return truncates;
    }

    public void setTruncates(Long truncates) {
        this.truncates = truncates;
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
        sb.append(", name=").append(name);
        sb.append(", blksZeroed=").append(blksZeroed);
        sb.append(", blksHit=").append(blksHit);
        sb.append(", blksRead=").append(blksRead);
        sb.append(", blksWritten=").append(blksWritten);
        sb.append(", blksExists=").append(blksExists);
        sb.append(", flushes=").append(flushes);
        sb.append(", truncates=").append(truncates);
        sb.append(", statsReset=").append(statsReset);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}