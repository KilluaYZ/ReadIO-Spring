package com.pool.readio.readiombg.model;

import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;

public class PgOpfamily implements Serializable {
    private Long oid;

    private Long opfmethod;

    private String opfname;

    private Long opfnamespace;

    private Long opfowner;

    private static final long serialVersionUID = 1L;

    public Long getOid() {
        return oid;
    }

    public void setOid(Long oid) {
        this.oid = oid;
    }

    public Long getOpfmethod() {
        return opfmethod;
    }

    public void setOpfmethod(Long opfmethod) {
        this.opfmethod = opfmethod;
    }

    public String getOpfname() {
        return opfname;
    }

    public void setOpfname(String opfname) {
        this.opfname = opfname;
    }

    public Long getOpfnamespace() {
        return opfnamespace;
    }

    public void setOpfnamespace(Long opfnamespace) {
        this.opfnamespace = opfnamespace;
    }

    public Long getOpfowner() {
        return opfowner;
    }

    public void setOpfowner(Long opfowner) {
        this.opfowner = opfowner;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", oid=").append(oid);
        sb.append(", opfmethod=").append(opfmethod);
        sb.append(", opfname=").append(opfname);
        sb.append(", opfnamespace=").append(opfnamespace);
        sb.append(", opfowner=").append(opfowner);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}