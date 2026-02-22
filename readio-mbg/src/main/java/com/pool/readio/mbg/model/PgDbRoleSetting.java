package com.pool.readio.mbg.model;

import java.io.Serializable;

public class PgDbRoleSetting implements Serializable {
    private Long setdatabase;

    private Long setrole;

    private Object setconfig;

    private static final long serialVersionUID = 1L;

    public Long getSetdatabase() {
        return setdatabase;
    }

    public void setSetdatabase(Long setdatabase) {
        this.setdatabase = setdatabase;
    }

    public Long getSetrole() {
        return setrole;
    }

    public void setSetrole(Long setrole) {
        this.setrole = setrole;
    }

    public Object getSetconfig() {
        return setconfig;
    }

    public void setSetconfig(Object setconfig) {
        this.setconfig = setconfig;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", setdatabase=").append(setdatabase);
        sb.append(", setrole=").append(setrole);
        sb.append(", setconfig=").append(setconfig);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}