package com.pool.readio.readiombg.model;

import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;

public class PgShdepend implements Serializable {
    private Long dbid;

    private Long classid;

    private Long objid;

    private Integer objsubid;

    private Long refclassid;

    private Long refobjid;

    private String deptype;

    private static final long serialVersionUID = 1L;

    public Long getDbid() {
        return dbid;
    }

    public void setDbid(Long dbid) {
        this.dbid = dbid;
    }

    public Long getClassid() {
        return classid;
    }

    public void setClassid(Long classid) {
        this.classid = classid;
    }

    public Long getObjid() {
        return objid;
    }

    public void setObjid(Long objid) {
        this.objid = objid;
    }

    public Integer getObjsubid() {
        return objsubid;
    }

    public void setObjsubid(Integer objsubid) {
        this.objsubid = objsubid;
    }

    public Long getRefclassid() {
        return refclassid;
    }

    public void setRefclassid(Long refclassid) {
        this.refclassid = refclassid;
    }

    public Long getRefobjid() {
        return refobjid;
    }

    public void setRefobjid(Long refobjid) {
        this.refobjid = refobjid;
    }

    public String getDeptype() {
        return deptype;
    }

    public void setDeptype(String deptype) {
        this.deptype = deptype;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", dbid=").append(dbid);
        sb.append(", classid=").append(classid);
        sb.append(", objid=").append(objid);
        sb.append(", objsubid=").append(objsubid);
        sb.append(", refclassid=").append(refclassid);
        sb.append(", refobjid=").append(refobjid);
        sb.append(", deptype=").append(deptype);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}