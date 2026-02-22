package com.pool.readio.mbg.model;

import java.io.Serializable;

public class PgProc implements Serializable {
    private Long oid;

    private String proname;

    private Long pronamespace;

    private Long proowner;

    private Long prolang;

    private Float procost;

    private Float prorows;

    private Long provariadic;

    private Object prosupport;

    private String prokind;

    private Boolean prosecdef;

    private Boolean proleakproof;

    private Boolean proisstrict;

    private Boolean proretset;

    private String provolatile;

    private String proparallel;

    private Short pronargs;

    private Short pronargdefaults;

    private Long prorettype;

    private Object proargtypes;

    private Object proallargtypes;

    private Object proargmodes;

    private Object proargnames;

    private Object proargdefaults;

    private Object protrftypes;

    private String prosrc;

    private String probin;

    private Object prosqlbody;

    private Object proconfig;

    private Object proacl;

    private static final long serialVersionUID = 1L;

    public Long getOid() {
        return oid;
    }

    public void setOid(Long oid) {
        this.oid = oid;
    }

    public String getProname() {
        return proname;
    }

    public void setProname(String proname) {
        this.proname = proname;
    }

    public Long getPronamespace() {
        return pronamespace;
    }

    public void setPronamespace(Long pronamespace) {
        this.pronamespace = pronamespace;
    }

    public Long getProowner() {
        return proowner;
    }

    public void setProowner(Long proowner) {
        this.proowner = proowner;
    }

    public Long getProlang() {
        return prolang;
    }

    public void setProlang(Long prolang) {
        this.prolang = prolang;
    }

    public Float getProcost() {
        return procost;
    }

    public void setProcost(Float procost) {
        this.procost = procost;
    }

    public Float getProrows() {
        return prorows;
    }

    public void setProrows(Float prorows) {
        this.prorows = prorows;
    }

    public Long getProvariadic() {
        return provariadic;
    }

    public void setProvariadic(Long provariadic) {
        this.provariadic = provariadic;
    }

    public Object getProsupport() {
        return prosupport;
    }

    public void setProsupport(Object prosupport) {
        this.prosupport = prosupport;
    }

    public String getProkind() {
        return prokind;
    }

    public void setProkind(String prokind) {
        this.prokind = prokind;
    }

    public Boolean getProsecdef() {
        return prosecdef;
    }

    public void setProsecdef(Boolean prosecdef) {
        this.prosecdef = prosecdef;
    }

    public Boolean getProleakproof() {
        return proleakproof;
    }

    public void setProleakproof(Boolean proleakproof) {
        this.proleakproof = proleakproof;
    }

    public Boolean getProisstrict() {
        return proisstrict;
    }

    public void setProisstrict(Boolean proisstrict) {
        this.proisstrict = proisstrict;
    }

    public Boolean getProretset() {
        return proretset;
    }

    public void setProretset(Boolean proretset) {
        this.proretset = proretset;
    }

    public String getProvolatile() {
        return provolatile;
    }

    public void setProvolatile(String provolatile) {
        this.provolatile = provolatile;
    }

    public String getProparallel() {
        return proparallel;
    }

    public void setProparallel(String proparallel) {
        this.proparallel = proparallel;
    }

    public Short getPronargs() {
        return pronargs;
    }

    public void setPronargs(Short pronargs) {
        this.pronargs = pronargs;
    }

    public Short getPronargdefaults() {
        return pronargdefaults;
    }

    public void setPronargdefaults(Short pronargdefaults) {
        this.pronargdefaults = pronargdefaults;
    }

    public Long getProrettype() {
        return prorettype;
    }

    public void setProrettype(Long prorettype) {
        this.prorettype = prorettype;
    }

    public Object getProargtypes() {
        return proargtypes;
    }

    public void setProargtypes(Object proargtypes) {
        this.proargtypes = proargtypes;
    }

    public Object getProallargtypes() {
        return proallargtypes;
    }

    public void setProallargtypes(Object proallargtypes) {
        this.proallargtypes = proallargtypes;
    }

    public Object getProargmodes() {
        return proargmodes;
    }

    public void setProargmodes(Object proargmodes) {
        this.proargmodes = proargmodes;
    }

    public Object getProargnames() {
        return proargnames;
    }

    public void setProargnames(Object proargnames) {
        this.proargnames = proargnames;
    }

    public Object getProargdefaults() {
        return proargdefaults;
    }

    public void setProargdefaults(Object proargdefaults) {
        this.proargdefaults = proargdefaults;
    }

    public Object getProtrftypes() {
        return protrftypes;
    }

    public void setProtrftypes(Object protrftypes) {
        this.protrftypes = protrftypes;
    }

    public String getProsrc() {
        return prosrc;
    }

    public void setProsrc(String prosrc) {
        this.prosrc = prosrc;
    }

    public String getProbin() {
        return probin;
    }

    public void setProbin(String probin) {
        this.probin = probin;
    }

    public Object getProsqlbody() {
        return prosqlbody;
    }

    public void setProsqlbody(Object prosqlbody) {
        this.prosqlbody = prosqlbody;
    }

    public Object getProconfig() {
        return proconfig;
    }

    public void setProconfig(Object proconfig) {
        this.proconfig = proconfig;
    }

    public Object getProacl() {
        return proacl;
    }

    public void setProacl(Object proacl) {
        this.proacl = proacl;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", oid=").append(oid);
        sb.append(", proname=").append(proname);
        sb.append(", pronamespace=").append(pronamespace);
        sb.append(", proowner=").append(proowner);
        sb.append(", prolang=").append(prolang);
        sb.append(", procost=").append(procost);
        sb.append(", prorows=").append(prorows);
        sb.append(", provariadic=").append(provariadic);
        sb.append(", prosupport=").append(prosupport);
        sb.append(", prokind=").append(prokind);
        sb.append(", prosecdef=").append(prosecdef);
        sb.append(", proleakproof=").append(proleakproof);
        sb.append(", proisstrict=").append(proisstrict);
        sb.append(", proretset=").append(proretset);
        sb.append(", provolatile=").append(provolatile);
        sb.append(", proparallel=").append(proparallel);
        sb.append(", pronargs=").append(pronargs);
        sb.append(", pronargdefaults=").append(pronargdefaults);
        sb.append(", prorettype=").append(prorettype);
        sb.append(", proargtypes=").append(proargtypes);
        sb.append(", proallargtypes=").append(proallargtypes);
        sb.append(", proargmodes=").append(proargmodes);
        sb.append(", proargnames=").append(proargnames);
        sb.append(", proargdefaults=").append(proargdefaults);
        sb.append(", protrftypes=").append(protrftypes);
        sb.append(", prosrc=").append(prosrc);
        sb.append(", probin=").append(probin);
        sb.append(", prosqlbody=").append(prosqlbody);
        sb.append(", proconfig=").append(proconfig);
        sb.append(", proacl=").append(proacl);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}