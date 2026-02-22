package com.pool.readio.readiombg.model;

import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;

public class PgCollation implements Serializable {
    private Long oid;

    private String collname;

    private Long collnamespace;

    private Long collowner;

    private String collprovider;

    private Boolean collisdeterministic;

    private Integer collencoding;

    private String collcollate;

    private String collctype;

    private String colllocale;

    private String collicurules;

    private String collversion;

    private static final long serialVersionUID = 1L;

    public Long getOid() {
        return oid;
    }

    public void setOid(Long oid) {
        this.oid = oid;
    }

    public String getCollname() {
        return collname;
    }

    public void setCollname(String collname) {
        this.collname = collname;
    }

    public Long getCollnamespace() {
        return collnamespace;
    }

    public void setCollnamespace(Long collnamespace) {
        this.collnamespace = collnamespace;
    }

    public Long getCollowner() {
        return collowner;
    }

    public void setCollowner(Long collowner) {
        this.collowner = collowner;
    }

    public String getCollprovider() {
        return collprovider;
    }

    public void setCollprovider(String collprovider) {
        this.collprovider = collprovider;
    }

    public Boolean getCollisdeterministic() {
        return collisdeterministic;
    }

    public void setCollisdeterministic(Boolean collisdeterministic) {
        this.collisdeterministic = collisdeterministic;
    }

    public Integer getCollencoding() {
        return collencoding;
    }

    public void setCollencoding(Integer collencoding) {
        this.collencoding = collencoding;
    }

    public String getCollcollate() {
        return collcollate;
    }

    public void setCollcollate(String collcollate) {
        this.collcollate = collcollate;
    }

    public String getCollctype() {
        return collctype;
    }

    public void setCollctype(String collctype) {
        this.collctype = collctype;
    }

    public String getColllocale() {
        return colllocale;
    }

    public void setColllocale(String colllocale) {
        this.colllocale = colllocale;
    }

    public String getCollicurules() {
        return collicurules;
    }

    public void setCollicurules(String collicurules) {
        this.collicurules = collicurules;
    }

    public String getCollversion() {
        return collversion;
    }

    public void setCollversion(String collversion) {
        this.collversion = collversion;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", oid=").append(oid);
        sb.append(", collname=").append(collname);
        sb.append(", collnamespace=").append(collnamespace);
        sb.append(", collowner=").append(collowner);
        sb.append(", collprovider=").append(collprovider);
        sb.append(", collisdeterministic=").append(collisdeterministic);
        sb.append(", collencoding=").append(collencoding);
        sb.append(", collcollate=").append(collcollate);
        sb.append(", collctype=").append(collctype);
        sb.append(", colllocale=").append(colllocale);
        sb.append(", collicurules=").append(collicurules);
        sb.append(", collversion=").append(collversion);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}