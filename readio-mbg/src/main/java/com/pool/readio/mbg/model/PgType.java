package com.pool.readio.mbg.model;

import java.io.Serializable;

public class PgType implements Serializable {
    private Long oid;

    private String typname;

    private Long typnamespace;

    private Long typowner;

    private Short typlen;

    private Boolean typbyval;

    private String typtype;

    private String typcategory;

    private Boolean typispreferred;

    private Boolean typisdefined;

    private String typdelim;

    private Long typrelid;

    private Object typsubscript;

    private Long typelem;

    private Long typarray;

    private Object typinput;

    private Object typoutput;

    private Object typreceive;

    private Object typsend;

    private Object typmodin;

    private Object typmodout;

    private Object typanalyze;

    private String typalign;

    private String typstorage;

    private Boolean typnotnull;

    private Long typbasetype;

    private Integer typtypmod;

    private Integer typndims;

    private Long typcollation;

    private Object typdefaultbin;

    private String typdefault;

    private Object typacl;

    private static final long serialVersionUID = 1L;

    public Long getOid() {
        return oid;
    }

    public void setOid(Long oid) {
        this.oid = oid;
    }

    public String getTypname() {
        return typname;
    }

    public void setTypname(String typname) {
        this.typname = typname;
    }

    public Long getTypnamespace() {
        return typnamespace;
    }

    public void setTypnamespace(Long typnamespace) {
        this.typnamespace = typnamespace;
    }

    public Long getTypowner() {
        return typowner;
    }

    public void setTypowner(Long typowner) {
        this.typowner = typowner;
    }

    public Short getTyplen() {
        return typlen;
    }

    public void setTyplen(Short typlen) {
        this.typlen = typlen;
    }

    public Boolean getTypbyval() {
        return typbyval;
    }

    public void setTypbyval(Boolean typbyval) {
        this.typbyval = typbyval;
    }

    public String getTyptype() {
        return typtype;
    }

    public void setTyptype(String typtype) {
        this.typtype = typtype;
    }

    public String getTypcategory() {
        return typcategory;
    }

    public void setTypcategory(String typcategory) {
        this.typcategory = typcategory;
    }

    public Boolean getTypispreferred() {
        return typispreferred;
    }

    public void setTypispreferred(Boolean typispreferred) {
        this.typispreferred = typispreferred;
    }

    public Boolean getTypisdefined() {
        return typisdefined;
    }

    public void setTypisdefined(Boolean typisdefined) {
        this.typisdefined = typisdefined;
    }

    public String getTypdelim() {
        return typdelim;
    }

    public void setTypdelim(String typdelim) {
        this.typdelim = typdelim;
    }

    public Long getTyprelid() {
        return typrelid;
    }

    public void setTyprelid(Long typrelid) {
        this.typrelid = typrelid;
    }

    public Object getTypsubscript() {
        return typsubscript;
    }

    public void setTypsubscript(Object typsubscript) {
        this.typsubscript = typsubscript;
    }

    public Long getTypelem() {
        return typelem;
    }

    public void setTypelem(Long typelem) {
        this.typelem = typelem;
    }

    public Long getTyparray() {
        return typarray;
    }

    public void setTyparray(Long typarray) {
        this.typarray = typarray;
    }

    public Object getTypinput() {
        return typinput;
    }

    public void setTypinput(Object typinput) {
        this.typinput = typinput;
    }

    public Object getTypoutput() {
        return typoutput;
    }

    public void setTypoutput(Object typoutput) {
        this.typoutput = typoutput;
    }

    public Object getTypreceive() {
        return typreceive;
    }

    public void setTypreceive(Object typreceive) {
        this.typreceive = typreceive;
    }

    public Object getTypsend() {
        return typsend;
    }

    public void setTypsend(Object typsend) {
        this.typsend = typsend;
    }

    public Object getTypmodin() {
        return typmodin;
    }

    public void setTypmodin(Object typmodin) {
        this.typmodin = typmodin;
    }

    public Object getTypmodout() {
        return typmodout;
    }

    public void setTypmodout(Object typmodout) {
        this.typmodout = typmodout;
    }

    public Object getTypanalyze() {
        return typanalyze;
    }

    public void setTypanalyze(Object typanalyze) {
        this.typanalyze = typanalyze;
    }

    public String getTypalign() {
        return typalign;
    }

    public void setTypalign(String typalign) {
        this.typalign = typalign;
    }

    public String getTypstorage() {
        return typstorage;
    }

    public void setTypstorage(String typstorage) {
        this.typstorage = typstorage;
    }

    public Boolean getTypnotnull() {
        return typnotnull;
    }

    public void setTypnotnull(Boolean typnotnull) {
        this.typnotnull = typnotnull;
    }

    public Long getTypbasetype() {
        return typbasetype;
    }

    public void setTypbasetype(Long typbasetype) {
        this.typbasetype = typbasetype;
    }

    public Integer getTyptypmod() {
        return typtypmod;
    }

    public void setTyptypmod(Integer typtypmod) {
        this.typtypmod = typtypmod;
    }

    public Integer getTypndims() {
        return typndims;
    }

    public void setTypndims(Integer typndims) {
        this.typndims = typndims;
    }

    public Long getTypcollation() {
        return typcollation;
    }

    public void setTypcollation(Long typcollation) {
        this.typcollation = typcollation;
    }

    public Object getTypdefaultbin() {
        return typdefaultbin;
    }

    public void setTypdefaultbin(Object typdefaultbin) {
        this.typdefaultbin = typdefaultbin;
    }

    public String getTypdefault() {
        return typdefault;
    }

    public void setTypdefault(String typdefault) {
        this.typdefault = typdefault;
    }

    public Object getTypacl() {
        return typacl;
    }

    public void setTypacl(Object typacl) {
        this.typacl = typacl;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", oid=").append(oid);
        sb.append(", typname=").append(typname);
        sb.append(", typnamespace=").append(typnamespace);
        sb.append(", typowner=").append(typowner);
        sb.append(", typlen=").append(typlen);
        sb.append(", typbyval=").append(typbyval);
        sb.append(", typtype=").append(typtype);
        sb.append(", typcategory=").append(typcategory);
        sb.append(", typispreferred=").append(typispreferred);
        sb.append(", typisdefined=").append(typisdefined);
        sb.append(", typdelim=").append(typdelim);
        sb.append(", typrelid=").append(typrelid);
        sb.append(", typsubscript=").append(typsubscript);
        sb.append(", typelem=").append(typelem);
        sb.append(", typarray=").append(typarray);
        sb.append(", typinput=").append(typinput);
        sb.append(", typoutput=").append(typoutput);
        sb.append(", typreceive=").append(typreceive);
        sb.append(", typsend=").append(typsend);
        sb.append(", typmodin=").append(typmodin);
        sb.append(", typmodout=").append(typmodout);
        sb.append(", typanalyze=").append(typanalyze);
        sb.append(", typalign=").append(typalign);
        sb.append(", typstorage=").append(typstorage);
        sb.append(", typnotnull=").append(typnotnull);
        sb.append(", typbasetype=").append(typbasetype);
        sb.append(", typtypmod=").append(typtypmod);
        sb.append(", typndims=").append(typndims);
        sb.append(", typcollation=").append(typcollation);
        sb.append(", typdefaultbin=").append(typdefaultbin);
        sb.append(", typdefault=").append(typdefault);
        sb.append(", typacl=").append(typacl);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}