package com.pool.readio.readiombg.model;

import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;

public class PgInitPrivs implements Serializable {
    private Long objoid;

    private Long classoid;

    private Integer objsubid;

    private String privtype;

    private Object initprivs;

    private static final long serialVersionUID = 1L;

    public Long getObjoid() {
        return objoid;
    }

    public void setObjoid(Long objoid) {
        this.objoid = objoid;
    }

    public Long getClassoid() {
        return classoid;
    }

    public void setClassoid(Long classoid) {
        this.classoid = classoid;
    }

    public Integer getObjsubid() {
        return objsubid;
    }

    public void setObjsubid(Integer objsubid) {
        this.objsubid = objsubid;
    }

    public String getPrivtype() {
        return privtype;
    }

    public void setPrivtype(String privtype) {
        this.privtype = privtype;
    }

    public Object getInitprivs() {
        return initprivs;
    }

    public void setInitprivs(Object initprivs) {
        this.initprivs = initprivs;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", objoid=").append(objoid);
        sb.append(", classoid=").append(classoid);
        sb.append(", objsubid=").append(objsubid);
        sb.append(", privtype=").append(privtype);
        sb.append(", initprivs=").append(initprivs);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}