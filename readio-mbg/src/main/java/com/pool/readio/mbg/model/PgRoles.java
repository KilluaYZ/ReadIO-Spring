package com.pool.readio.mbg.model;

import java.io.Serializable;
import java.util.Date;

public class PgRoles implements Serializable {
    private String rolname;

    private Boolean rolsuper;

    private Boolean rolinherit;

    private Boolean rolcreaterole;

    private Boolean rolcreatedb;

    private Boolean rolcanlogin;

    private Boolean rolreplication;

    private Integer rolconnlimit;

    private String rolpassword;

    private Date rolvaliduntil;

    private Boolean rolbypassrls;

    private Object rolconfig;

    private Long oid;

    private static final long serialVersionUID = 1L;

    public String getRolname() {
        return rolname;
    }

    public void setRolname(String rolname) {
        this.rolname = rolname;
    }

    public Boolean getRolsuper() {
        return rolsuper;
    }

    public void setRolsuper(Boolean rolsuper) {
        this.rolsuper = rolsuper;
    }

    public Boolean getRolinherit() {
        return rolinherit;
    }

    public void setRolinherit(Boolean rolinherit) {
        this.rolinherit = rolinherit;
    }

    public Boolean getRolcreaterole() {
        return rolcreaterole;
    }

    public void setRolcreaterole(Boolean rolcreaterole) {
        this.rolcreaterole = rolcreaterole;
    }

    public Boolean getRolcreatedb() {
        return rolcreatedb;
    }

    public void setRolcreatedb(Boolean rolcreatedb) {
        this.rolcreatedb = rolcreatedb;
    }

    public Boolean getRolcanlogin() {
        return rolcanlogin;
    }

    public void setRolcanlogin(Boolean rolcanlogin) {
        this.rolcanlogin = rolcanlogin;
    }

    public Boolean getRolreplication() {
        return rolreplication;
    }

    public void setRolreplication(Boolean rolreplication) {
        this.rolreplication = rolreplication;
    }

    public Integer getRolconnlimit() {
        return rolconnlimit;
    }

    public void setRolconnlimit(Integer rolconnlimit) {
        this.rolconnlimit = rolconnlimit;
    }

    public String getRolpassword() {
        return rolpassword;
    }

    public void setRolpassword(String rolpassword) {
        this.rolpassword = rolpassword;
    }

    public Date getRolvaliduntil() {
        return rolvaliduntil;
    }

    public void setRolvaliduntil(Date rolvaliduntil) {
        this.rolvaliduntil = rolvaliduntil;
    }

    public Boolean getRolbypassrls() {
        return rolbypassrls;
    }

    public void setRolbypassrls(Boolean rolbypassrls) {
        this.rolbypassrls = rolbypassrls;
    }

    public Object getRolconfig() {
        return rolconfig;
    }

    public void setRolconfig(Object rolconfig) {
        this.rolconfig = rolconfig;
    }

    public Long getOid() {
        return oid;
    }

    public void setOid(Long oid) {
        this.oid = oid;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", rolname=").append(rolname);
        sb.append(", rolsuper=").append(rolsuper);
        sb.append(", rolinherit=").append(rolinherit);
        sb.append(", rolcreaterole=").append(rolcreaterole);
        sb.append(", rolcreatedb=").append(rolcreatedb);
        sb.append(", rolcanlogin=").append(rolcanlogin);
        sb.append(", rolreplication=").append(rolreplication);
        sb.append(", rolconnlimit=").append(rolconnlimit);
        sb.append(", rolpassword=").append(rolpassword);
        sb.append(", rolvaliduntil=").append(rolvaliduntil);
        sb.append(", rolbypassrls=").append(rolbypassrls);
        sb.append(", rolconfig=").append(rolconfig);
        sb.append(", oid=").append(oid);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}