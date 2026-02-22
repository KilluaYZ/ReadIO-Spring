package com.pool.readio.readiombg.model;

import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;
import java.util.Date;

public class PgAuthid implements Serializable {
    private Long oid;

    private String rolname;

    private Boolean rolsuper;

    private Boolean rolinherit;

    private Boolean rolcreaterole;

    private Boolean rolcreatedb;

    private Boolean rolcanlogin;

    private Boolean rolreplication;

    private Boolean rolbypassrls;

    private Integer rolconnlimit;

    private String rolpassword;

    private Date rolvaliduntil;

    private static final long serialVersionUID = 1L;

    public Long getOid() {
        return oid;
    }

    public void setOid(Long oid) {
        this.oid = oid;
    }

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

    public Boolean getRolbypassrls() {
        return rolbypassrls;
    }

    public void setRolbypassrls(Boolean rolbypassrls) {
        this.rolbypassrls = rolbypassrls;
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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", oid=").append(oid);
        sb.append(", rolname=").append(rolname);
        sb.append(", rolsuper=").append(rolsuper);
        sb.append(", rolinherit=").append(rolinherit);
        sb.append(", rolcreaterole=").append(rolcreaterole);
        sb.append(", rolcreatedb=").append(rolcreatedb);
        sb.append(", rolcanlogin=").append(rolcanlogin);
        sb.append(", rolreplication=").append(rolreplication);
        sb.append(", rolbypassrls=").append(rolbypassrls);
        sb.append(", rolconnlimit=").append(rolconnlimit);
        sb.append(", rolpassword=").append(rolpassword);
        sb.append(", rolvaliduntil=").append(rolvaliduntil);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}