package com.pool.readio.mbg.model;

import java.io.Serializable;

public class PgAmop implements Serializable {
    private Long oid;

    private Long amopfamily;

    private Long amoplefttype;

    private Long amoprighttype;

    private Short amopstrategy;

    private String amoppurpose;

    private Long amopopr;

    private Long amopmethod;

    private Long amopsortfamily;

    private static final long serialVersionUID = 1L;

    public Long getOid() {
        return oid;
    }

    public void setOid(Long oid) {
        this.oid = oid;
    }

    public Long getAmopfamily() {
        return amopfamily;
    }

    public void setAmopfamily(Long amopfamily) {
        this.amopfamily = amopfamily;
    }

    public Long getAmoplefttype() {
        return amoplefttype;
    }

    public void setAmoplefttype(Long amoplefttype) {
        this.amoplefttype = amoplefttype;
    }

    public Long getAmoprighttype() {
        return amoprighttype;
    }

    public void setAmoprighttype(Long amoprighttype) {
        this.amoprighttype = amoprighttype;
    }

    public Short getAmopstrategy() {
        return amopstrategy;
    }

    public void setAmopstrategy(Short amopstrategy) {
        this.amopstrategy = amopstrategy;
    }

    public String getAmoppurpose() {
        return amoppurpose;
    }

    public void setAmoppurpose(String amoppurpose) {
        this.amoppurpose = amoppurpose;
    }

    public Long getAmopopr() {
        return amopopr;
    }

    public void setAmopopr(Long amopopr) {
        this.amopopr = amopopr;
    }

    public Long getAmopmethod() {
        return amopmethod;
    }

    public void setAmopmethod(Long amopmethod) {
        this.amopmethod = amopmethod;
    }

    public Long getAmopsortfamily() {
        return amopsortfamily;
    }

    public void setAmopsortfamily(Long amopsortfamily) {
        this.amopsortfamily = amopsortfamily;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", oid=").append(oid);
        sb.append(", amopfamily=").append(amopfamily);
        sb.append(", amoplefttype=").append(amoplefttype);
        sb.append(", amoprighttype=").append(amoprighttype);
        sb.append(", amopstrategy=").append(amopstrategy);
        sb.append(", amoppurpose=").append(amoppurpose);
        sb.append(", amopopr=").append(amopopr);
        sb.append(", amopmethod=").append(amopmethod);
        sb.append(", amopsortfamily=").append(amopsortfamily);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}