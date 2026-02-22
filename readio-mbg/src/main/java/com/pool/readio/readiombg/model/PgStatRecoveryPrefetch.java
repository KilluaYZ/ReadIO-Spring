package com.pool.readio.readiombg.model;

import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;
import java.util.Date;

public class PgStatRecoveryPrefetch implements Serializable {
    private Date statsReset;

    private Long prefetch;

    private Long hit;

    private Long skipInit;

    private Long skipNew;

    private Long skipFpw;

    private Long skipRep;

    private Integer walDistance;

    private Integer blockDistance;

    private Integer ioDepth;

    private static final long serialVersionUID = 1L;

    public Date getStatsReset() {
        return statsReset;
    }

    public void setStatsReset(Date statsReset) {
        this.statsReset = statsReset;
    }

    public Long getPrefetch() {
        return prefetch;
    }

    public void setPrefetch(Long prefetch) {
        this.prefetch = prefetch;
    }

    public Long getHit() {
        return hit;
    }

    public void setHit(Long hit) {
        this.hit = hit;
    }

    public Long getSkipInit() {
        return skipInit;
    }

    public void setSkipInit(Long skipInit) {
        this.skipInit = skipInit;
    }

    public Long getSkipNew() {
        return skipNew;
    }

    public void setSkipNew(Long skipNew) {
        this.skipNew = skipNew;
    }

    public Long getSkipFpw() {
        return skipFpw;
    }

    public void setSkipFpw(Long skipFpw) {
        this.skipFpw = skipFpw;
    }

    public Long getSkipRep() {
        return skipRep;
    }

    public void setSkipRep(Long skipRep) {
        this.skipRep = skipRep;
    }

    public Integer getWalDistance() {
        return walDistance;
    }

    public void setWalDistance(Integer walDistance) {
        this.walDistance = walDistance;
    }

    public Integer getBlockDistance() {
        return blockDistance;
    }

    public void setBlockDistance(Integer blockDistance) {
        this.blockDistance = blockDistance;
    }

    public Integer getIoDepth() {
        return ioDepth;
    }

    public void setIoDepth(Integer ioDepth) {
        this.ioDepth = ioDepth;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", statsReset=").append(statsReset);
        sb.append(", prefetch=").append(prefetch);
        sb.append(", hit=").append(hit);
        sb.append(", skipInit=").append(skipInit);
        sb.append(", skipNew=").append(skipNew);
        sb.append(", skipFpw=").append(skipFpw);
        sb.append(", skipRep=").append(skipRep);
        sb.append(", walDistance=").append(walDistance);
        sb.append(", blockDistance=").append(blockDistance);
        sb.append(", ioDepth=").append(ioDepth);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}