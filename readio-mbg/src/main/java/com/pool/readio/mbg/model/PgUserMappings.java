package com.pool.readio.mbg.model;

import java.io.Serializable;

public class PgUserMappings implements Serializable {
    private Long umid;

    private Long srvid;

    private String srvname;

    private Long umuser;

    private String usename;

    private Object umoptions;

    private static final long serialVersionUID = 1L;

    public Long getUmid() {
        return umid;
    }

    public void setUmid(Long umid) {
        this.umid = umid;
    }

    public Long getSrvid() {
        return srvid;
    }

    public void setSrvid(Long srvid) {
        this.srvid = srvid;
    }

    public String getSrvname() {
        return srvname;
    }

    public void setSrvname(String srvname) {
        this.srvname = srvname;
    }

    public Long getUmuser() {
        return umuser;
    }

    public void setUmuser(Long umuser) {
        this.umuser = umuser;
    }

    public String getUsename() {
        return usename;
    }

    public void setUsename(String usename) {
        this.usename = usename;
    }

    public Object getUmoptions() {
        return umoptions;
    }

    public void setUmoptions(Object umoptions) {
        this.umoptions = umoptions;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", umid=").append(umid);
        sb.append(", srvid=").append(srvid);
        sb.append(", srvname=").append(srvname);
        sb.append(", umuser=").append(umuser);
        sb.append(", usename=").append(usename);
        sb.append(", umoptions=").append(umoptions);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}