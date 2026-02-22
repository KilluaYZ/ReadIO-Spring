package com.pool.readio.mbg.model;

import java.io.Serializable;

public class PgStatUserFunctions implements Serializable {
    private Long funcid;

    private String schemaname;

    private String funcname;

    private Long calls;

    private Double totalTime;

    private Double selfTime;

    private static final long serialVersionUID = 1L;

    public Long getFuncid() {
        return funcid;
    }

    public void setFuncid(Long funcid) {
        this.funcid = funcid;
    }

    public String getSchemaname() {
        return schemaname;
    }

    public void setSchemaname(String schemaname) {
        this.schemaname = schemaname;
    }

    public String getFuncname() {
        return funcname;
    }

    public void setFuncname(String funcname) {
        this.funcname = funcname;
    }

    public Long getCalls() {
        return calls;
    }

    public void setCalls(Long calls) {
        this.calls = calls;
    }

    public Double getTotalTime() {
        return totalTime;
    }

    public void setTotalTime(Double totalTime) {
        this.totalTime = totalTime;
    }

    public Double getSelfTime() {
        return selfTime;
    }

    public void setSelfTime(Double selfTime) {
        this.selfTime = selfTime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", funcid=").append(funcid);
        sb.append(", schemaname=").append(schemaname);
        sb.append(", funcname=").append(funcname);
        sb.append(", calls=").append(calls);
        sb.append(", totalTime=").append(totalTime);
        sb.append(", selfTime=").append(selfTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}