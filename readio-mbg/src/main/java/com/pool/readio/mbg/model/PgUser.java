package com.pool.readio.mbg.model;

import java.io.Serializable;
import java.util.Date;

public class PgUser implements Serializable {
    private String usename;

    private Long usesysid;

    private Boolean usecreatedb;

    private Boolean usesuper;

    private Boolean userepl;

    private Boolean usebypassrls;

    private String passwd;

    private Date valuntil;

    private Object useconfig;

    private static final long serialVersionUID = 1L;

    public String getUsename() {
        return usename;
    }

    public void setUsename(String usename) {
        this.usename = usename;
    }

    public Long getUsesysid() {
        return usesysid;
    }

    public void setUsesysid(Long usesysid) {
        this.usesysid = usesysid;
    }

    public Boolean getUsecreatedb() {
        return usecreatedb;
    }

    public void setUsecreatedb(Boolean usecreatedb) {
        this.usecreatedb = usecreatedb;
    }

    public Boolean getUsesuper() {
        return usesuper;
    }

    public void setUsesuper(Boolean usesuper) {
        this.usesuper = usesuper;
    }

    public Boolean getUserepl() {
        return userepl;
    }

    public void setUserepl(Boolean userepl) {
        this.userepl = userepl;
    }

    public Boolean getUsebypassrls() {
        return usebypassrls;
    }

    public void setUsebypassrls(Boolean usebypassrls) {
        this.usebypassrls = usebypassrls;
    }

    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }

    public Date getValuntil() {
        return valuntil;
    }

    public void setValuntil(Date valuntil) {
        this.valuntil = valuntil;
    }

    public Object getUseconfig() {
        return useconfig;
    }

    public void setUseconfig(Object useconfig) {
        this.useconfig = useconfig;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", usename=").append(usename);
        sb.append(", usesysid=").append(usesysid);
        sb.append(", usecreatedb=").append(usecreatedb);
        sb.append(", usesuper=").append(usesuper);
        sb.append(", userepl=").append(userepl);
        sb.append(", usebypassrls=").append(usebypassrls);
        sb.append(", passwd=").append(passwd);
        sb.append(", valuntil=").append(valuntil);
        sb.append(", useconfig=").append(useconfig);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}