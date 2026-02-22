package com.pool.readio.mbg.model;

import java.io.Serializable;

public class PgTsDict implements Serializable {
    private Long oid;

    private String dictname;

    private Long dictnamespace;

    private Long dictowner;

    private Long dicttemplate;

    private String dictinitoption;

    private static final long serialVersionUID = 1L;

    public Long getOid() {
        return oid;
    }

    public void setOid(Long oid) {
        this.oid = oid;
    }

    public String getDictname() {
        return dictname;
    }

    public void setDictname(String dictname) {
        this.dictname = dictname;
    }

    public Long getDictnamespace() {
        return dictnamespace;
    }

    public void setDictnamespace(Long dictnamespace) {
        this.dictnamespace = dictnamespace;
    }

    public Long getDictowner() {
        return dictowner;
    }

    public void setDictowner(Long dictowner) {
        this.dictowner = dictowner;
    }

    public Long getDicttemplate() {
        return dicttemplate;
    }

    public void setDicttemplate(Long dicttemplate) {
        this.dicttemplate = dicttemplate;
    }

    public String getDictinitoption() {
        return dictinitoption;
    }

    public void setDictinitoption(String dictinitoption) {
        this.dictinitoption = dictinitoption;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", oid=").append(oid);
        sb.append(", dictname=").append(dictname);
        sb.append(", dictnamespace=").append(dictnamespace);
        sb.append(", dictowner=").append(dictowner);
        sb.append(", dicttemplate=").append(dicttemplate);
        sb.append(", dictinitoption=").append(dictinitoption);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}