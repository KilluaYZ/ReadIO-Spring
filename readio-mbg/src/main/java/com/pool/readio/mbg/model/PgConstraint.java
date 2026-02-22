package com.pool.readio.mbg.model;

import java.io.Serializable;

public class PgConstraint implements Serializable {
    private Long oid;

    private String conname;

    private Long connamespace;

    private String contype;

    private Boolean condeferrable;

    private Boolean condeferred;

    private Boolean conenforced;

    private Boolean convalidated;

    private Long conrelid;

    private Long contypid;

    private Long conindid;

    private Long conparentid;

    private Long confrelid;

    private String confupdtype;

    private String confdeltype;

    private String confmatchtype;

    private Boolean conislocal;

    private Short coninhcount;

    private Boolean connoinherit;

    private Boolean conperiod;

    private Object conkey;

    private Object confkey;

    private Object conpfeqop;

    private Object conppeqop;

    private Object conffeqop;

    private Object confdelsetcols;

    private Object conexclop;

    private Object conbin;

    private static final long serialVersionUID = 1L;

    public Long getOid() {
        return oid;
    }

    public void setOid(Long oid) {
        this.oid = oid;
    }

    public String getConname() {
        return conname;
    }

    public void setConname(String conname) {
        this.conname = conname;
    }

    public Long getConnamespace() {
        return connamespace;
    }

    public void setConnamespace(Long connamespace) {
        this.connamespace = connamespace;
    }

    public String getContype() {
        return contype;
    }

    public void setContype(String contype) {
        this.contype = contype;
    }

    public Boolean getCondeferrable() {
        return condeferrable;
    }

    public void setCondeferrable(Boolean condeferrable) {
        this.condeferrable = condeferrable;
    }

    public Boolean getCondeferred() {
        return condeferred;
    }

    public void setCondeferred(Boolean condeferred) {
        this.condeferred = condeferred;
    }

    public Boolean getConenforced() {
        return conenforced;
    }

    public void setConenforced(Boolean conenforced) {
        this.conenforced = conenforced;
    }

    public Boolean getConvalidated() {
        return convalidated;
    }

    public void setConvalidated(Boolean convalidated) {
        this.convalidated = convalidated;
    }

    public Long getConrelid() {
        return conrelid;
    }

    public void setConrelid(Long conrelid) {
        this.conrelid = conrelid;
    }

    public Long getContypid() {
        return contypid;
    }

    public void setContypid(Long contypid) {
        this.contypid = contypid;
    }

    public Long getConindid() {
        return conindid;
    }

    public void setConindid(Long conindid) {
        this.conindid = conindid;
    }

    public Long getConparentid() {
        return conparentid;
    }

    public void setConparentid(Long conparentid) {
        this.conparentid = conparentid;
    }

    public Long getConfrelid() {
        return confrelid;
    }

    public void setConfrelid(Long confrelid) {
        this.confrelid = confrelid;
    }

    public String getConfupdtype() {
        return confupdtype;
    }

    public void setConfupdtype(String confupdtype) {
        this.confupdtype = confupdtype;
    }

    public String getConfdeltype() {
        return confdeltype;
    }

    public void setConfdeltype(String confdeltype) {
        this.confdeltype = confdeltype;
    }

    public String getConfmatchtype() {
        return confmatchtype;
    }

    public void setConfmatchtype(String confmatchtype) {
        this.confmatchtype = confmatchtype;
    }

    public Boolean getConislocal() {
        return conislocal;
    }

    public void setConislocal(Boolean conislocal) {
        this.conislocal = conislocal;
    }

    public Short getConinhcount() {
        return coninhcount;
    }

    public void setConinhcount(Short coninhcount) {
        this.coninhcount = coninhcount;
    }

    public Boolean getConnoinherit() {
        return connoinherit;
    }

    public void setConnoinherit(Boolean connoinherit) {
        this.connoinherit = connoinherit;
    }

    public Boolean getConperiod() {
        return conperiod;
    }

    public void setConperiod(Boolean conperiod) {
        this.conperiod = conperiod;
    }

    public Object getConkey() {
        return conkey;
    }

    public void setConkey(Object conkey) {
        this.conkey = conkey;
    }

    public Object getConfkey() {
        return confkey;
    }

    public void setConfkey(Object confkey) {
        this.confkey = confkey;
    }

    public Object getConpfeqop() {
        return conpfeqop;
    }

    public void setConpfeqop(Object conpfeqop) {
        this.conpfeqop = conpfeqop;
    }

    public Object getConppeqop() {
        return conppeqop;
    }

    public void setConppeqop(Object conppeqop) {
        this.conppeqop = conppeqop;
    }

    public Object getConffeqop() {
        return conffeqop;
    }

    public void setConffeqop(Object conffeqop) {
        this.conffeqop = conffeqop;
    }

    public Object getConfdelsetcols() {
        return confdelsetcols;
    }

    public void setConfdelsetcols(Object confdelsetcols) {
        this.confdelsetcols = confdelsetcols;
    }

    public Object getConexclop() {
        return conexclop;
    }

    public void setConexclop(Object conexclop) {
        this.conexclop = conexclop;
    }

    public Object getConbin() {
        return conbin;
    }

    public void setConbin(Object conbin) {
        this.conbin = conbin;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", oid=").append(oid);
        sb.append(", conname=").append(conname);
        sb.append(", connamespace=").append(connamespace);
        sb.append(", contype=").append(contype);
        sb.append(", condeferrable=").append(condeferrable);
        sb.append(", condeferred=").append(condeferred);
        sb.append(", conenforced=").append(conenforced);
        sb.append(", convalidated=").append(convalidated);
        sb.append(", conrelid=").append(conrelid);
        sb.append(", contypid=").append(contypid);
        sb.append(", conindid=").append(conindid);
        sb.append(", conparentid=").append(conparentid);
        sb.append(", confrelid=").append(confrelid);
        sb.append(", confupdtype=").append(confupdtype);
        sb.append(", confdeltype=").append(confdeltype);
        sb.append(", confmatchtype=").append(confmatchtype);
        sb.append(", conislocal=").append(conislocal);
        sb.append(", coninhcount=").append(coninhcount);
        sb.append(", connoinherit=").append(connoinherit);
        sb.append(", conperiod=").append(conperiod);
        sb.append(", conkey=").append(conkey);
        sb.append(", confkey=").append(confkey);
        sb.append(", conpfeqop=").append(conpfeqop);
        sb.append(", conppeqop=").append(conppeqop);
        sb.append(", conffeqop=").append(conffeqop);
        sb.append(", confdelsetcols=").append(confdelsetcols);
        sb.append(", conexclop=").append(conexclop);
        sb.append(", conbin=").append(conbin);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}