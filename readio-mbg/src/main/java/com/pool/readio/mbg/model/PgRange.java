package com.pool.readio.mbg.model;

import java.io.Serializable;

public class PgRange implements Serializable {
    private Long rngtypid;

    private Long rngsubtype;

    private Long rngmultitypid;

    private Long rngcollation;

    private Long rngsubopc;

    private Object rngcanonical;

    private Object rngsubdiff;

    private static final long serialVersionUID = 1L;

    public Long getRngtypid() {
        return rngtypid;
    }

    public void setRngtypid(Long rngtypid) {
        this.rngtypid = rngtypid;
    }

    public Long getRngsubtype() {
        return rngsubtype;
    }

    public void setRngsubtype(Long rngsubtype) {
        this.rngsubtype = rngsubtype;
    }

    public Long getRngmultitypid() {
        return rngmultitypid;
    }

    public void setRngmultitypid(Long rngmultitypid) {
        this.rngmultitypid = rngmultitypid;
    }

    public Long getRngcollation() {
        return rngcollation;
    }

    public void setRngcollation(Long rngcollation) {
        this.rngcollation = rngcollation;
    }

    public Long getRngsubopc() {
        return rngsubopc;
    }

    public void setRngsubopc(Long rngsubopc) {
        this.rngsubopc = rngsubopc;
    }

    public Object getRngcanonical() {
        return rngcanonical;
    }

    public void setRngcanonical(Object rngcanonical) {
        this.rngcanonical = rngcanonical;
    }

    public Object getRngsubdiff() {
        return rngsubdiff;
    }

    public void setRngsubdiff(Object rngsubdiff) {
        this.rngsubdiff = rngsubdiff;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", rngtypid=").append(rngtypid);
        sb.append(", rngsubtype=").append(rngsubtype);
        sb.append(", rngmultitypid=").append(rngmultitypid);
        sb.append(", rngcollation=").append(rngcollation);
        sb.append(", rngsubopc=").append(rngsubopc);
        sb.append(", rngcanonical=").append(rngcanonical);
        sb.append(", rngsubdiff=").append(rngsubdiff);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}