package com.pool.readio.mbg.model;

import java.io.Serializable;

public class PgStatProgressBasebackup implements Serializable {
    private Integer pid;

    private String phase;

    private Long backupTotal;

    private Long backupStreamed;

    private Long tablespacesTotal;

    private Long tablespacesStreamed;

    private static final long serialVersionUID = 1L;

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public String getPhase() {
        return phase;
    }

    public void setPhase(String phase) {
        this.phase = phase;
    }

    public Long getBackupTotal() {
        return backupTotal;
    }

    public void setBackupTotal(Long backupTotal) {
        this.backupTotal = backupTotal;
    }

    public Long getBackupStreamed() {
        return backupStreamed;
    }

    public void setBackupStreamed(Long backupStreamed) {
        this.backupStreamed = backupStreamed;
    }

    public Long getTablespacesTotal() {
        return tablespacesTotal;
    }

    public void setTablespacesTotal(Long tablespacesTotal) {
        this.tablespacesTotal = tablespacesTotal;
    }

    public Long getTablespacesStreamed() {
        return tablespacesStreamed;
    }

    public void setTablespacesStreamed(Long tablespacesStreamed) {
        this.tablespacesStreamed = tablespacesStreamed;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", pid=").append(pid);
        sb.append(", phase=").append(phase);
        sb.append(", backupTotal=").append(backupTotal);
        sb.append(", backupStreamed=").append(backupStreamed);
        sb.append(", tablespacesTotal=").append(tablespacesTotal);
        sb.append(", tablespacesStreamed=").append(tablespacesStreamed);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}