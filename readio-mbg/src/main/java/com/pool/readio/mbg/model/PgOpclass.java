package com.pool.readio.mbg.model;

import java.io.Serializable;

public class PgOpclass implements Serializable {
    private Long oid;

    private Long opcmethod;

    private String opcname;

    private Long opcnamespace;

    private Long opcowner;

    private Long opcfamily;

    private Long opcintype;

    private Boolean opcdefault;

    private Long opckeytype;

    private static final long serialVersionUID = 1L;

    public Long getOid() {
        return oid;
    }

    public void setOid(Long oid) {
        this.oid = oid;
    }

    public Long getOpcmethod() {
        return opcmethod;
    }

    public void setOpcmethod(Long opcmethod) {
        this.opcmethod = opcmethod;
    }

    public String getOpcname() {
        return opcname;
    }

    public void setOpcname(String opcname) {
        this.opcname = opcname;
    }

    public Long getOpcnamespace() {
        return opcnamespace;
    }

    public void setOpcnamespace(Long opcnamespace) {
        this.opcnamespace = opcnamespace;
    }

    public Long getOpcowner() {
        return opcowner;
    }

    public void setOpcowner(Long opcowner) {
        this.opcowner = opcowner;
    }

    public Long getOpcfamily() {
        return opcfamily;
    }

    public void setOpcfamily(Long opcfamily) {
        this.opcfamily = opcfamily;
    }

    public Long getOpcintype() {
        return opcintype;
    }

    public void setOpcintype(Long opcintype) {
        this.opcintype = opcintype;
    }

    public Boolean getOpcdefault() {
        return opcdefault;
    }

    public void setOpcdefault(Boolean opcdefault) {
        this.opcdefault = opcdefault;
    }

    public Long getOpckeytype() {
        return opckeytype;
    }

    public void setOpckeytype(Long opckeytype) {
        this.opckeytype = opckeytype;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", oid=").append(oid);
        sb.append(", opcmethod=").append(opcmethod);
        sb.append(", opcname=").append(opcname);
        sb.append(", opcnamespace=").append(opcnamespace);
        sb.append(", opcowner=").append(opcowner);
        sb.append(", opcfamily=").append(opcfamily);
        sb.append(", opcintype=").append(opcintype);
        sb.append(", opcdefault=").append(opcdefault);
        sb.append(", opckeytype=").append(opckeytype);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}