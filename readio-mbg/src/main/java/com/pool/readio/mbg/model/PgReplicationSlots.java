package com.pool.readio.mbg.model;

import java.io.Serializable;
import java.util.Date;

public class PgReplicationSlots implements Serializable {
    private String slotName;

    private String plugin;

    private String slotType;

    private Long datoid;

    private String database;

    private Boolean temporary;

    private Boolean active;

    private Integer activePid;

    private Object xmin;

    private Object catalogXmin;

    private Object restartLsn;

    private Object confirmedFlushLsn;

    private String walStatus;

    private Long safeWalSize;

    private Boolean twoPhase;

    private Object twoPhaseAt;

    private Date inactiveSince;

    private Boolean conflicting;

    private String invalidationReason;

    private Boolean failover;

    private Boolean synced;

    private static final long serialVersionUID = 1L;

    public String getSlotName() {
        return slotName;
    }

    public void setSlotName(String slotName) {
        this.slotName = slotName;
    }

    public String getPlugin() {
        return plugin;
    }

    public void setPlugin(String plugin) {
        this.plugin = plugin;
    }

    public String getSlotType() {
        return slotType;
    }

    public void setSlotType(String slotType) {
        this.slotType = slotType;
    }

    public Long getDatoid() {
        return datoid;
    }

    public void setDatoid(Long datoid) {
        this.datoid = datoid;
    }

    public String getDatabase() {
        return database;
    }

    public void setDatabase(String database) {
        this.database = database;
    }

    public Boolean getTemporary() {
        return temporary;
    }

    public void setTemporary(Boolean temporary) {
        this.temporary = temporary;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public Integer getActivePid() {
        return activePid;
    }

    public void setActivePid(Integer activePid) {
        this.activePid = activePid;
    }

    public Object getXmin() {
        return xmin;
    }

    public void setXmin(Object xmin) {
        this.xmin = xmin;
    }

    public Object getCatalogXmin() {
        return catalogXmin;
    }

    public void setCatalogXmin(Object catalogXmin) {
        this.catalogXmin = catalogXmin;
    }

    public Object getRestartLsn() {
        return restartLsn;
    }

    public void setRestartLsn(Object restartLsn) {
        this.restartLsn = restartLsn;
    }

    public Object getConfirmedFlushLsn() {
        return confirmedFlushLsn;
    }

    public void setConfirmedFlushLsn(Object confirmedFlushLsn) {
        this.confirmedFlushLsn = confirmedFlushLsn;
    }

    public String getWalStatus() {
        return walStatus;
    }

    public void setWalStatus(String walStatus) {
        this.walStatus = walStatus;
    }

    public Long getSafeWalSize() {
        return safeWalSize;
    }

    public void setSafeWalSize(Long safeWalSize) {
        this.safeWalSize = safeWalSize;
    }

    public Boolean getTwoPhase() {
        return twoPhase;
    }

    public void setTwoPhase(Boolean twoPhase) {
        this.twoPhase = twoPhase;
    }

    public Object getTwoPhaseAt() {
        return twoPhaseAt;
    }

    public void setTwoPhaseAt(Object twoPhaseAt) {
        this.twoPhaseAt = twoPhaseAt;
    }

    public Date getInactiveSince() {
        return inactiveSince;
    }

    public void setInactiveSince(Date inactiveSince) {
        this.inactiveSince = inactiveSince;
    }

    public Boolean getConflicting() {
        return conflicting;
    }

    public void setConflicting(Boolean conflicting) {
        this.conflicting = conflicting;
    }

    public String getInvalidationReason() {
        return invalidationReason;
    }

    public void setInvalidationReason(String invalidationReason) {
        this.invalidationReason = invalidationReason;
    }

    public Boolean getFailover() {
        return failover;
    }

    public void setFailover(Boolean failover) {
        this.failover = failover;
    }

    public Boolean getSynced() {
        return synced;
    }

    public void setSynced(Boolean synced) {
        this.synced = synced;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", slotName=").append(slotName);
        sb.append(", plugin=").append(plugin);
        sb.append(", slotType=").append(slotType);
        sb.append(", datoid=").append(datoid);
        sb.append(", database=").append(database);
        sb.append(", temporary=").append(temporary);
        sb.append(", active=").append(active);
        sb.append(", activePid=").append(activePid);
        sb.append(", xmin=").append(xmin);
        sb.append(", catalogXmin=").append(catalogXmin);
        sb.append(", restartLsn=").append(restartLsn);
        sb.append(", confirmedFlushLsn=").append(confirmedFlushLsn);
        sb.append(", walStatus=").append(walStatus);
        sb.append(", safeWalSize=").append(safeWalSize);
        sb.append(", twoPhase=").append(twoPhase);
        sb.append(", twoPhaseAt=").append(twoPhaseAt);
        sb.append(", inactiveSince=").append(inactiveSince);
        sb.append(", conflicting=").append(conflicting);
        sb.append(", invalidationReason=").append(invalidationReason);
        sb.append(", failover=").append(failover);
        sb.append(", synced=").append(synced);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}