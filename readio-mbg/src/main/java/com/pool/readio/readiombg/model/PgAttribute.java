package com.pool.readio.readiombg.model;

import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;

public class PgAttribute implements Serializable {
    private Long attrelid;

    private Short attnum;

    private String attname;

    private Long atttypid;

    private Short attlen;

    private Integer atttypmod;

    private Short attndims;

    private Boolean attbyval;

    private String attalign;

    private String attstorage;

    private String attcompression;

    private Boolean attnotnull;

    private Boolean atthasdef;

    private Boolean atthasmissing;

    private String attidentity;

    private String attgenerated;

    private Boolean attisdropped;

    private Boolean attislocal;

    private Short attinhcount;

    private Long attcollation;

    private Short attstattarget;

    private Object attacl;

    private Object attoptions;

    private Object attfdwoptions;

    private Object attmissingval;

    private static final long serialVersionUID = 1L;

    public Long getAttrelid() {
        return attrelid;
    }

    public void setAttrelid(Long attrelid) {
        this.attrelid = attrelid;
    }

    public Short getAttnum() {
        return attnum;
    }

    public void setAttnum(Short attnum) {
        this.attnum = attnum;
    }

    public String getAttname() {
        return attname;
    }

    public void setAttname(String attname) {
        this.attname = attname;
    }

    public Long getAtttypid() {
        return atttypid;
    }

    public void setAtttypid(Long atttypid) {
        this.atttypid = atttypid;
    }

    public Short getAttlen() {
        return attlen;
    }

    public void setAttlen(Short attlen) {
        this.attlen = attlen;
    }

    public Integer getAtttypmod() {
        return atttypmod;
    }

    public void setAtttypmod(Integer atttypmod) {
        this.atttypmod = atttypmod;
    }

    public Short getAttndims() {
        return attndims;
    }

    public void setAttndims(Short attndims) {
        this.attndims = attndims;
    }

    public Boolean getAttbyval() {
        return attbyval;
    }

    public void setAttbyval(Boolean attbyval) {
        this.attbyval = attbyval;
    }

    public String getAttalign() {
        return attalign;
    }

    public void setAttalign(String attalign) {
        this.attalign = attalign;
    }

    public String getAttstorage() {
        return attstorage;
    }

    public void setAttstorage(String attstorage) {
        this.attstorage = attstorage;
    }

    public String getAttcompression() {
        return attcompression;
    }

    public void setAttcompression(String attcompression) {
        this.attcompression = attcompression;
    }

    public Boolean getAttnotnull() {
        return attnotnull;
    }

    public void setAttnotnull(Boolean attnotnull) {
        this.attnotnull = attnotnull;
    }

    public Boolean getAtthasdef() {
        return atthasdef;
    }

    public void setAtthasdef(Boolean atthasdef) {
        this.atthasdef = atthasdef;
    }

    public Boolean getAtthasmissing() {
        return atthasmissing;
    }

    public void setAtthasmissing(Boolean atthasmissing) {
        this.atthasmissing = atthasmissing;
    }

    public String getAttidentity() {
        return attidentity;
    }

    public void setAttidentity(String attidentity) {
        this.attidentity = attidentity;
    }

    public String getAttgenerated() {
        return attgenerated;
    }

    public void setAttgenerated(String attgenerated) {
        this.attgenerated = attgenerated;
    }

    public Boolean getAttisdropped() {
        return attisdropped;
    }

    public void setAttisdropped(Boolean attisdropped) {
        this.attisdropped = attisdropped;
    }

    public Boolean getAttislocal() {
        return attislocal;
    }

    public void setAttislocal(Boolean attislocal) {
        this.attislocal = attislocal;
    }

    public Short getAttinhcount() {
        return attinhcount;
    }

    public void setAttinhcount(Short attinhcount) {
        this.attinhcount = attinhcount;
    }

    public Long getAttcollation() {
        return attcollation;
    }

    public void setAttcollation(Long attcollation) {
        this.attcollation = attcollation;
    }

    public Short getAttstattarget() {
        return attstattarget;
    }

    public void setAttstattarget(Short attstattarget) {
        this.attstattarget = attstattarget;
    }

    public Object getAttacl() {
        return attacl;
    }

    public void setAttacl(Object attacl) {
        this.attacl = attacl;
    }

    public Object getAttoptions() {
        return attoptions;
    }

    public void setAttoptions(Object attoptions) {
        this.attoptions = attoptions;
    }

    public Object getAttfdwoptions() {
        return attfdwoptions;
    }

    public void setAttfdwoptions(Object attfdwoptions) {
        this.attfdwoptions = attfdwoptions;
    }

    public Object getAttmissingval() {
        return attmissingval;
    }

    public void setAttmissingval(Object attmissingval) {
        this.attmissingval = attmissingval;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", attrelid=").append(attrelid);
        sb.append(", attnum=").append(attnum);
        sb.append(", attname=").append(attname);
        sb.append(", atttypid=").append(atttypid);
        sb.append(", attlen=").append(attlen);
        sb.append(", atttypmod=").append(atttypmod);
        sb.append(", attndims=").append(attndims);
        sb.append(", attbyval=").append(attbyval);
        sb.append(", attalign=").append(attalign);
        sb.append(", attstorage=").append(attstorage);
        sb.append(", attcompression=").append(attcompression);
        sb.append(", attnotnull=").append(attnotnull);
        sb.append(", atthasdef=").append(atthasdef);
        sb.append(", atthasmissing=").append(atthasmissing);
        sb.append(", attidentity=").append(attidentity);
        sb.append(", attgenerated=").append(attgenerated);
        sb.append(", attisdropped=").append(attisdropped);
        sb.append(", attislocal=").append(attislocal);
        sb.append(", attinhcount=").append(attinhcount);
        sb.append(", attcollation=").append(attcollation);
        sb.append(", attstattarget=").append(attstattarget);
        sb.append(", attacl=").append(attacl);
        sb.append(", attoptions=").append(attoptions);
        sb.append(", attfdwoptions=").append(attfdwoptions);
        sb.append(", attmissingval=").append(attmissingval);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}