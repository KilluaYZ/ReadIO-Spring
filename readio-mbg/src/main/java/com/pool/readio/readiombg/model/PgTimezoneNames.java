package com.pool.readio.readiombg.model;

import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;

public class PgTimezoneNames implements Serializable {
    private String name;

    private String abbrev;

    private Object utcOffset;

    private Boolean isDst;

    private static final long serialVersionUID = 1L;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAbbrev() {
        return abbrev;
    }

    public void setAbbrev(String abbrev) {
        this.abbrev = abbrev;
    }

    public Object getUtcOffset() {
        return utcOffset;
    }

    public void setUtcOffset(Object utcOffset) {
        this.utcOffset = utcOffset;
    }

    public Boolean getIsDst() {
        return isDst;
    }

    public void setIsDst(Boolean isDst) {
        this.isDst = isDst;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", name=").append(name);
        sb.append(", abbrev=").append(abbrev);
        sb.append(", utcOffset=").append(utcOffset);
        sb.append(", isDst=").append(isDst);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}