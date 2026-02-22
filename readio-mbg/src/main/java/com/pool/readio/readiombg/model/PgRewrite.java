package com.pool.readio.readiombg.model;

import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;

public class PgRewrite implements Serializable {
    private Long oid;

    private String rulename;

    private Long evClass;

    private String evType;

    private String evEnabled;

    private Boolean isInstead;

    private Object evQual;

    private Object evAction;

    private static final long serialVersionUID = 1L;

    public Long getOid() {
        return oid;
    }

    public void setOid(Long oid) {
        this.oid = oid;
    }

    public String getRulename() {
        return rulename;
    }

    public void setRulename(String rulename) {
        this.rulename = rulename;
    }

    public Long getEvClass() {
        return evClass;
    }

    public void setEvClass(Long evClass) {
        this.evClass = evClass;
    }

    public String getEvType() {
        return evType;
    }

    public void setEvType(String evType) {
        this.evType = evType;
    }

    public String getEvEnabled() {
        return evEnabled;
    }

    public void setEvEnabled(String evEnabled) {
        this.evEnabled = evEnabled;
    }

    public Boolean getIsInstead() {
        return isInstead;
    }

    public void setIsInstead(Boolean isInstead) {
        this.isInstead = isInstead;
    }

    public Object getEvQual() {
        return evQual;
    }

    public void setEvQual(Object evQual) {
        this.evQual = evQual;
    }

    public Object getEvAction() {
        return evAction;
    }

    public void setEvAction(Object evAction) {
        this.evAction = evAction;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", oid=").append(oid);
        sb.append(", rulename=").append(rulename);
        sb.append(", evClass=").append(evClass);
        sb.append(", evType=").append(evType);
        sb.append(", evEnabled=").append(evEnabled);
        sb.append(", isInstead=").append(isInstead);
        sb.append(", evQual=").append(evQual);
        sb.append(", evAction=").append(evAction);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}