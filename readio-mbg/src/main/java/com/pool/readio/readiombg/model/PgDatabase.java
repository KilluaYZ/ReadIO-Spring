package com.pool.readio.readiombg.model;

import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;

public class PgDatabase implements Serializable {
    private Long oid;

    private String datname;

    private Long datdba;

    private Integer encoding;

    private String datlocprovider;

    private Boolean datistemplate;

    private Boolean datallowconn;

    private Boolean dathasloginevt;

    private Integer datconnlimit;

    private Object datfrozenxid;

    private Object datminmxid;

    private Long dattablespace;

    private String datcollate;

    private String datctype;

    private String datlocale;

    private String daticurules;

    private String datcollversion;

    private Object datacl;

    private static final long serialVersionUID = 1L;

    public Long getOid() {
        return oid;
    }

    public void setOid(Long oid) {
        this.oid = oid;
    }

    public String getDatname() {
        return datname;
    }

    public void setDatname(String datname) {
        this.datname = datname;
    }

    public Long getDatdba() {
        return datdba;
    }

    public void setDatdba(Long datdba) {
        this.datdba = datdba;
    }

    public Integer getEncoding() {
        return encoding;
    }

    public void setEncoding(Integer encoding) {
        this.encoding = encoding;
    }

    public String getDatlocprovider() {
        return datlocprovider;
    }

    public void setDatlocprovider(String datlocprovider) {
        this.datlocprovider = datlocprovider;
    }

    public Boolean getDatistemplate() {
        return datistemplate;
    }

    public void setDatistemplate(Boolean datistemplate) {
        this.datistemplate = datistemplate;
    }

    public Boolean getDatallowconn() {
        return datallowconn;
    }

    public void setDatallowconn(Boolean datallowconn) {
        this.datallowconn = datallowconn;
    }

    public Boolean getDathasloginevt() {
        return dathasloginevt;
    }

    public void setDathasloginevt(Boolean dathasloginevt) {
        this.dathasloginevt = dathasloginevt;
    }

    public Integer getDatconnlimit() {
        return datconnlimit;
    }

    public void setDatconnlimit(Integer datconnlimit) {
        this.datconnlimit = datconnlimit;
    }

    public Object getDatfrozenxid() {
        return datfrozenxid;
    }

    public void setDatfrozenxid(Object datfrozenxid) {
        this.datfrozenxid = datfrozenxid;
    }

    public Object getDatminmxid() {
        return datminmxid;
    }

    public void setDatminmxid(Object datminmxid) {
        this.datminmxid = datminmxid;
    }

    public Long getDattablespace() {
        return dattablespace;
    }

    public void setDattablespace(Long dattablespace) {
        this.dattablespace = dattablespace;
    }

    public String getDatcollate() {
        return datcollate;
    }

    public void setDatcollate(String datcollate) {
        this.datcollate = datcollate;
    }

    public String getDatctype() {
        return datctype;
    }

    public void setDatctype(String datctype) {
        this.datctype = datctype;
    }

    public String getDatlocale() {
        return datlocale;
    }

    public void setDatlocale(String datlocale) {
        this.datlocale = datlocale;
    }

    public String getDaticurules() {
        return daticurules;
    }

    public void setDaticurules(String daticurules) {
        this.daticurules = daticurules;
    }

    public String getDatcollversion() {
        return datcollversion;
    }

    public void setDatcollversion(String datcollversion) {
        this.datcollversion = datcollversion;
    }

    public Object getDatacl() {
        return datacl;
    }

    public void setDatacl(Object datacl) {
        this.datacl = datacl;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", oid=").append(oid);
        sb.append(", datname=").append(datname);
        sb.append(", datdba=").append(datdba);
        sb.append(", encoding=").append(encoding);
        sb.append(", datlocprovider=").append(datlocprovider);
        sb.append(", datistemplate=").append(datistemplate);
        sb.append(", datallowconn=").append(datallowconn);
        sb.append(", dathasloginevt=").append(dathasloginevt);
        sb.append(", datconnlimit=").append(datconnlimit);
        sb.append(", datfrozenxid=").append(datfrozenxid);
        sb.append(", datminmxid=").append(datminmxid);
        sb.append(", dattablespace=").append(dattablespace);
        sb.append(", datcollate=").append(datcollate);
        sb.append(", datctype=").append(datctype);
        sb.append(", datlocale=").append(datlocale);
        sb.append(", daticurules=").append(daticurules);
        sb.append(", datcollversion=").append(datcollversion);
        sb.append(", datacl=").append(datacl);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}