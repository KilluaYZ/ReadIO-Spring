package com.pool.readio.readiombg.model;

import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;

public class PgForeignDataWrapper implements Serializable {
    private Long oid;

    private String fdwname;

    private Long fdwowner;

    private Long fdwhandler;

    private Long fdwvalidator;

    private Object fdwacl;

    private Object fdwoptions;

    private static final long serialVersionUID = 1L;

    public Long getOid() {
        return oid;
    }

    public void setOid(Long oid) {
        this.oid = oid;
    }

    public String getFdwname() {
        return fdwname;
    }

    public void setFdwname(String fdwname) {
        this.fdwname = fdwname;
    }

    public Long getFdwowner() {
        return fdwowner;
    }

    public void setFdwowner(Long fdwowner) {
        this.fdwowner = fdwowner;
    }

    public Long getFdwhandler() {
        return fdwhandler;
    }

    public void setFdwhandler(Long fdwhandler) {
        this.fdwhandler = fdwhandler;
    }

    public Long getFdwvalidator() {
        return fdwvalidator;
    }

    public void setFdwvalidator(Long fdwvalidator) {
        this.fdwvalidator = fdwvalidator;
    }

    public Object getFdwacl() {
        return fdwacl;
    }

    public void setFdwacl(Object fdwacl) {
        this.fdwacl = fdwacl;
    }

    public Object getFdwoptions() {
        return fdwoptions;
    }

    public void setFdwoptions(Object fdwoptions) {
        this.fdwoptions = fdwoptions;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", oid=").append(oid);
        sb.append(", fdwname=").append(fdwname);
        sb.append(", fdwowner=").append(fdwowner);
        sb.append(", fdwhandler=").append(fdwhandler);
        sb.append(", fdwvalidator=").append(fdwvalidator);
        sb.append(", fdwacl=").append(fdwacl);
        sb.append(", fdwoptions=").append(fdwoptions);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}