package com.pool.readio.mbg.model;

import java.io.Serializable;

public class PgPublication implements Serializable {
    private Long oid;

    private String pubname;

    private Long pubowner;

    private Boolean puballtables;

    private Boolean pubinsert;

    private Boolean pubupdate;

    private Boolean pubdelete;

    private Boolean pubtruncate;

    private Boolean pubviaroot;

    private String pubgencols;

    private static final long serialVersionUID = 1L;

    public Long getOid() {
        return oid;
    }

    public void setOid(Long oid) {
        this.oid = oid;
    }

    public String getPubname() {
        return pubname;
    }

    public void setPubname(String pubname) {
        this.pubname = pubname;
    }

    public Long getPubowner() {
        return pubowner;
    }

    public void setPubowner(Long pubowner) {
        this.pubowner = pubowner;
    }

    public Boolean getPuballtables() {
        return puballtables;
    }

    public void setPuballtables(Boolean puballtables) {
        this.puballtables = puballtables;
    }

    public Boolean getPubinsert() {
        return pubinsert;
    }

    public void setPubinsert(Boolean pubinsert) {
        this.pubinsert = pubinsert;
    }

    public Boolean getPubupdate() {
        return pubupdate;
    }

    public void setPubupdate(Boolean pubupdate) {
        this.pubupdate = pubupdate;
    }

    public Boolean getPubdelete() {
        return pubdelete;
    }

    public void setPubdelete(Boolean pubdelete) {
        this.pubdelete = pubdelete;
    }

    public Boolean getPubtruncate() {
        return pubtruncate;
    }

    public void setPubtruncate(Boolean pubtruncate) {
        this.pubtruncate = pubtruncate;
    }

    public Boolean getPubviaroot() {
        return pubviaroot;
    }

    public void setPubviaroot(Boolean pubviaroot) {
        this.pubviaroot = pubviaroot;
    }

    public String getPubgencols() {
        return pubgencols;
    }

    public void setPubgencols(String pubgencols) {
        this.pubgencols = pubgencols;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", oid=").append(oid);
        sb.append(", pubname=").append(pubname);
        sb.append(", pubowner=").append(pubowner);
        sb.append(", puballtables=").append(puballtables);
        sb.append(", pubinsert=").append(pubinsert);
        sb.append(", pubupdate=").append(pubupdate);
        sb.append(", pubdelete=").append(pubdelete);
        sb.append(", pubtruncate=").append(pubtruncate);
        sb.append(", pubviaroot=").append(pubviaroot);
        sb.append(", pubgencols=").append(pubgencols);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}