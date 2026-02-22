package com.pool.readio.readiombg.model;

import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;

public class PgGroup implements Serializable {
    private String groname;

    private Long grosysid;

    private Object grolist;

    private static final long serialVersionUID = 1L;

    public String getGroname() {
        return groname;
    }

    public void setGroname(String groname) {
        this.groname = groname;
    }

    public Long getGrosysid() {
        return grosysid;
    }

    public void setGrosysid(Long grosysid) {
        this.grosysid = grosysid;
    }

    public Object getGrolist() {
        return grolist;
    }

    public void setGrolist(Object grolist) {
        this.grolist = grolist;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", groname=").append(groname);
        sb.append(", grosysid=").append(grosysid);
        sb.append(", grolist=").append(grolist);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}