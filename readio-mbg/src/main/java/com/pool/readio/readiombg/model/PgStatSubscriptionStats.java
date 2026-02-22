package com.pool.readio.readiombg.model;

import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;
import java.util.Date;

public class PgStatSubscriptionStats implements Serializable {
    private Long subid;

    private String subname;

    private Long applyErrorCount;

    private Long syncErrorCount;

    private Long conflInsertExists;

    private Long conflUpdateOriginDiffers;

    private Long conflUpdateExists;

    private Long conflUpdateMissing;

    private Long conflDeleteOriginDiffers;

    private Long conflDeleteMissing;

    private Long conflMultipleUniqueConflicts;

    private Date statsReset;

    private static final long serialVersionUID = 1L;

    public Long getSubid() {
        return subid;
    }

    public void setSubid(Long subid) {
        this.subid = subid;
    }

    public String getSubname() {
        return subname;
    }

    public void setSubname(String subname) {
        this.subname = subname;
    }

    public Long getApplyErrorCount() {
        return applyErrorCount;
    }

    public void setApplyErrorCount(Long applyErrorCount) {
        this.applyErrorCount = applyErrorCount;
    }

    public Long getSyncErrorCount() {
        return syncErrorCount;
    }

    public void setSyncErrorCount(Long syncErrorCount) {
        this.syncErrorCount = syncErrorCount;
    }

    public Long getConflInsertExists() {
        return conflInsertExists;
    }

    public void setConflInsertExists(Long conflInsertExists) {
        this.conflInsertExists = conflInsertExists;
    }

    public Long getConflUpdateOriginDiffers() {
        return conflUpdateOriginDiffers;
    }

    public void setConflUpdateOriginDiffers(Long conflUpdateOriginDiffers) {
        this.conflUpdateOriginDiffers = conflUpdateOriginDiffers;
    }

    public Long getConflUpdateExists() {
        return conflUpdateExists;
    }

    public void setConflUpdateExists(Long conflUpdateExists) {
        this.conflUpdateExists = conflUpdateExists;
    }

    public Long getConflUpdateMissing() {
        return conflUpdateMissing;
    }

    public void setConflUpdateMissing(Long conflUpdateMissing) {
        this.conflUpdateMissing = conflUpdateMissing;
    }

    public Long getConflDeleteOriginDiffers() {
        return conflDeleteOriginDiffers;
    }

    public void setConflDeleteOriginDiffers(Long conflDeleteOriginDiffers) {
        this.conflDeleteOriginDiffers = conflDeleteOriginDiffers;
    }

    public Long getConflDeleteMissing() {
        return conflDeleteMissing;
    }

    public void setConflDeleteMissing(Long conflDeleteMissing) {
        this.conflDeleteMissing = conflDeleteMissing;
    }

    public Long getConflMultipleUniqueConflicts() {
        return conflMultipleUniqueConflicts;
    }

    public void setConflMultipleUniqueConflicts(Long conflMultipleUniqueConflicts) {
        this.conflMultipleUniqueConflicts = conflMultipleUniqueConflicts;
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
        sb.append(", subid=").append(subid);
        sb.append(", subname=").append(subname);
        sb.append(", applyErrorCount=").append(applyErrorCount);
        sb.append(", syncErrorCount=").append(syncErrorCount);
        sb.append(", conflInsertExists=").append(conflInsertExists);
        sb.append(", conflUpdateOriginDiffers=").append(conflUpdateOriginDiffers);
        sb.append(", conflUpdateExists=").append(conflUpdateExists);
        sb.append(", conflUpdateMissing=").append(conflUpdateMissing);
        sb.append(", conflDeleteOriginDiffers=").append(conflDeleteOriginDiffers);
        sb.append(", conflDeleteMissing=").append(conflDeleteMissing);
        sb.append(", conflMultipleUniqueConflicts=").append(conflMultipleUniqueConflicts);
        sb.append(", statsReset=").append(statsReset);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}