package com.pool.readio.mbg.model;

import java.io.Serializable;

public class PgTsTemplate implements Serializable {
    private Long oid;

    private String tmplname;

    private Long tmplnamespace;

    private Object tmplinit;

    private Object tmpllexize;

    private static final long serialVersionUID = 1L;

    public Long getOid() {
        return oid;
    }

    public void setOid(Long oid) {
        this.oid = oid;
    }

    public String getTmplname() {
        return tmplname;
    }

    public void setTmplname(String tmplname) {
        this.tmplname = tmplname;
    }

    public Long getTmplnamespace() {
        return tmplnamespace;
    }

    public void setTmplnamespace(Long tmplnamespace) {
        this.tmplnamespace = tmplnamespace;
    }

    public Object getTmplinit() {
        return tmplinit;
    }

    public void setTmplinit(Object tmplinit) {
        this.tmplinit = tmplinit;
    }

    public Object getTmpllexize() {
        return tmpllexize;
    }

    public void setTmpllexize(Object tmpllexize) {
        this.tmpllexize = tmpllexize;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", oid=").append(oid);
        sb.append(", tmplname=").append(tmplname);
        sb.append(", tmplnamespace=").append(tmplnamespace);
        sb.append(", tmplinit=").append(tmplinit);
        sb.append(", tmpllexize=").append(tmpllexize);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}