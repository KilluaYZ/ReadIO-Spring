package com.pool.readio.mbg.model;

import java.io.Serializable;

public class PgReplicationOrigin implements Serializable {
    private Long roident;

    private String roname;

    private static final long serialVersionUID = 1L;

    public Long getRoident() {
        return roident;
    }

    public void setRoident(Long roident) {
        this.roident = roident;
    }

    public String getRoname() {
        return roname;
    }

    public void setRoname(String roname) {
        this.roname = roname;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", roident=").append(roident);
        sb.append(", roname=").append(roname);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}