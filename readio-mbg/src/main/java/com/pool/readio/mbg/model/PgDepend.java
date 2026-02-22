package com.pool.readio.mbg.model;

import java.io.Serializable;

public class PgDepend implements Serializable {
    private Long classid;

    private Long objid;

    private Integer objsubid;

    private Long refclassid;

    private Long refobjid;

    private Integer refobjsubid;

    private String deptype;

    private static final long serialVersionUID = 1L;

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

    public Integer getRefobjsubid() {
        return refobjsubid;
    }

    public void setRefobjsubid(Integer refobjsubid) {
        this.refobjsubid = refobjsubid;
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
        sb.append(", classid=").append(classid);
        sb.append(", objid=").append(objid);
        sb.append(", objsubid=").append(objsubid);
        sb.append(", refclassid=").append(refclassid);
        sb.append(", refobjid=").append(refobjid);
        sb.append(", refobjsubid=").append(refobjsubid);
        sb.append(", deptype=").append(deptype);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}