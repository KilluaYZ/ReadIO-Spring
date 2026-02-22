package com.pool.readio.readiombg.model;

import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;

public class PgTrigger implements Serializable {
    private Long oid;

    private Long tgrelid;

    private Long tgparentid;

    private String tgname;

    private Long tgfoid;

    private Short tgtype;

    private String tgenabled;

    private Boolean tgisinternal;

    private Long tgconstrrelid;

    private Long tgconstrindid;

    private Long tgconstraint;

    private Boolean tgdeferrable;

    private Boolean tginitdeferred;

    private Short tgnargs;

    private Object tgattr;

    private Object tgqual;

    private String tgoldtable;

    private String tgnewtable;

    private byte[] tgargs;

    private static final long serialVersionUID = 1L;

    public Long getOid() {
        return oid;
    }

    public void setOid(Long oid) {
        this.oid = oid;
    }

    public Long getTgrelid() {
        return tgrelid;
    }

    public void setTgrelid(Long tgrelid) {
        this.tgrelid = tgrelid;
    }

    public Long getTgparentid() {
        return tgparentid;
    }

    public void setTgparentid(Long tgparentid) {
        this.tgparentid = tgparentid;
    }

    public String getTgname() {
        return tgname;
    }

    public void setTgname(String tgname) {
        this.tgname = tgname;
    }

    public Long getTgfoid() {
        return tgfoid;
    }

    public void setTgfoid(Long tgfoid) {
        this.tgfoid = tgfoid;
    }

    public Short getTgtype() {
        return tgtype;
    }

    public void setTgtype(Short tgtype) {
        this.tgtype = tgtype;
    }

    public String getTgenabled() {
        return tgenabled;
    }

    public void setTgenabled(String tgenabled) {
        this.tgenabled = tgenabled;
    }

    public Boolean getTgisinternal() {
        return tgisinternal;
    }

    public void setTgisinternal(Boolean tgisinternal) {
        this.tgisinternal = tgisinternal;
    }

    public Long getTgconstrrelid() {
        return tgconstrrelid;
    }

    public void setTgconstrrelid(Long tgconstrrelid) {
        this.tgconstrrelid = tgconstrrelid;
    }

    public Long getTgconstrindid() {
        return tgconstrindid;
    }

    public void setTgconstrindid(Long tgconstrindid) {
        this.tgconstrindid = tgconstrindid;
    }

    public Long getTgconstraint() {
        return tgconstraint;
    }

    public void setTgconstraint(Long tgconstraint) {
        this.tgconstraint = tgconstraint;
    }

    public Boolean getTgdeferrable() {
        return tgdeferrable;
    }

    public void setTgdeferrable(Boolean tgdeferrable) {
        this.tgdeferrable = tgdeferrable;
    }

    public Boolean getTginitdeferred() {
        return tginitdeferred;
    }

    public void setTginitdeferred(Boolean tginitdeferred) {
        this.tginitdeferred = tginitdeferred;
    }

    public Short getTgnargs() {
        return tgnargs;
    }

    public void setTgnargs(Short tgnargs) {
        this.tgnargs = tgnargs;
    }

    public Object getTgattr() {
        return tgattr;
    }

    public void setTgattr(Object tgattr) {
        this.tgattr = tgattr;
    }

    public Object getTgqual() {
        return tgqual;
    }

    public void setTgqual(Object tgqual) {
        this.tgqual = tgqual;
    }

    public String getTgoldtable() {
        return tgoldtable;
    }

    public void setTgoldtable(String tgoldtable) {
        this.tgoldtable = tgoldtable;
    }

    public String getTgnewtable() {
        return tgnewtable;
    }

    public void setTgnewtable(String tgnewtable) {
        this.tgnewtable = tgnewtable;
    }

    public byte[] getTgargs() {
        return tgargs;
    }

    public void setTgargs(byte[] tgargs) {
        this.tgargs = tgargs;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", oid=").append(oid);
        sb.append(", tgrelid=").append(tgrelid);
        sb.append(", tgparentid=").append(tgparentid);
        sb.append(", tgname=").append(tgname);
        sb.append(", tgfoid=").append(tgfoid);
        sb.append(", tgtype=").append(tgtype);
        sb.append(", tgenabled=").append(tgenabled);
        sb.append(", tgisinternal=").append(tgisinternal);
        sb.append(", tgconstrrelid=").append(tgconstrrelid);
        sb.append(", tgconstrindid=").append(tgconstrindid);
        sb.append(", tgconstraint=").append(tgconstraint);
        sb.append(", tgdeferrable=").append(tgdeferrable);
        sb.append(", tginitdeferred=").append(tginitdeferred);
        sb.append(", tgnargs=").append(tgnargs);
        sb.append(", tgattr=").append(tgattr);
        sb.append(", tgqual=").append(tgqual);
        sb.append(", tgoldtable=").append(tgoldtable);
        sb.append(", tgnewtable=").append(tgnewtable);
        sb.append(", tgargs=").append(tgargs);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}