package com.pool.readio.mbg.model;

import java.io.Serializable;

public class PgReplicationOriginStatus implements Serializable {
    private Long localId;

    private String externalId;

    private Object remoteLsn;

    private Object localLsn;

    private static final long serialVersionUID = 1L;

    public Long getLocalId() {
        return localId;
    }

    public void setLocalId(Long localId) {
        this.localId = localId;
    }

    public String getExternalId() {
        return externalId;
    }

    public void setExternalId(String externalId) {
        this.externalId = externalId;
    }

    public Object getRemoteLsn() {
        return remoteLsn;
    }

    public void setRemoteLsn(Object remoteLsn) {
        this.remoteLsn = remoteLsn;
    }

    public Object getLocalLsn() {
        return localLsn;
    }

    public void setLocalLsn(Object localLsn) {
        this.localLsn = localLsn;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", localId=").append(localId);
        sb.append(", externalId=").append(externalId);
        sb.append(", remoteLsn=").append(remoteLsn);
        sb.append(", localLsn=").append(localLsn);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}