package com.pool.readio.readiombg.model;

import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;

public class PgSubscription implements Serializable {
    private Long oid;

    private Long subdbid;

    private Object subskiplsn;

    private String subname;

    private Long subowner;

    private Boolean subenabled;

    private Boolean subbinary;

    private String substream;

    private String subtwophasestate;

    private Boolean subdisableonerr;

    private Boolean subpasswordrequired;

    private Boolean subrunasowner;

    private Boolean subfailover;

    private String subconninfo;

    private String subslotname;

    private String subsynccommit;

    private Object subpublications;

    private String suborigin;

    private static final long serialVersionUID = 1L;

    public Long getOid() {
        return oid;
    }

    public void setOid(Long oid) {
        this.oid = oid;
    }

    public Long getSubdbid() {
        return subdbid;
    }

    public void setSubdbid(Long subdbid) {
        this.subdbid = subdbid;
    }

    public Object getSubskiplsn() {
        return subskiplsn;
    }

    public void setSubskiplsn(Object subskiplsn) {
        this.subskiplsn = subskiplsn;
    }

    public String getSubname() {
        return subname;
    }

    public void setSubname(String subname) {
        this.subname = subname;
    }

    public Long getSubowner() {
        return subowner;
    }

    public void setSubowner(Long subowner) {
        this.subowner = subowner;
    }

    public Boolean getSubenabled() {
        return subenabled;
    }

    public void setSubenabled(Boolean subenabled) {
        this.subenabled = subenabled;
    }

    public Boolean getSubbinary() {
        return subbinary;
    }

    public void setSubbinary(Boolean subbinary) {
        this.subbinary = subbinary;
    }

    public String getSubstream() {
        return substream;
    }

    public void setSubstream(String substream) {
        this.substream = substream;
    }

    public String getSubtwophasestate() {
        return subtwophasestate;
    }

    public void setSubtwophasestate(String subtwophasestate) {
        this.subtwophasestate = subtwophasestate;
    }

    public Boolean getSubdisableonerr() {
        return subdisableonerr;
    }

    public void setSubdisableonerr(Boolean subdisableonerr) {
        this.subdisableonerr = subdisableonerr;
    }

    public Boolean getSubpasswordrequired() {
        return subpasswordrequired;
    }

    public void setSubpasswordrequired(Boolean subpasswordrequired) {
        this.subpasswordrequired = subpasswordrequired;
    }

    public Boolean getSubrunasowner() {
        return subrunasowner;
    }

    public void setSubrunasowner(Boolean subrunasowner) {
        this.subrunasowner = subrunasowner;
    }

    public Boolean getSubfailover() {
        return subfailover;
    }

    public void setSubfailover(Boolean subfailover) {
        this.subfailover = subfailover;
    }

    public String getSubconninfo() {
        return subconninfo;
    }

    public void setSubconninfo(String subconninfo) {
        this.subconninfo = subconninfo;
    }

    public String getSubslotname() {
        return subslotname;
    }

    public void setSubslotname(String subslotname) {
        this.subslotname = subslotname;
    }

    public String getSubsynccommit() {
        return subsynccommit;
    }

    public void setSubsynccommit(String subsynccommit) {
        this.subsynccommit = subsynccommit;
    }

    public Object getSubpublications() {
        return subpublications;
    }

    public void setSubpublications(Object subpublications) {
        this.subpublications = subpublications;
    }

    public String getSuborigin() {
        return suborigin;
    }

    public void setSuborigin(String suborigin) {
        this.suborigin = suborigin;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", oid=").append(oid);
        sb.append(", subdbid=").append(subdbid);
        sb.append(", subskiplsn=").append(subskiplsn);
        sb.append(", subname=").append(subname);
        sb.append(", subowner=").append(subowner);
        sb.append(", subenabled=").append(subenabled);
        sb.append(", subbinary=").append(subbinary);
        sb.append(", substream=").append(substream);
        sb.append(", subtwophasestate=").append(subtwophasestate);
        sb.append(", subdisableonerr=").append(subdisableonerr);
        sb.append(", subpasswordrequired=").append(subpasswordrequired);
        sb.append(", subrunasowner=").append(subrunasowner);
        sb.append(", subfailover=").append(subfailover);
        sb.append(", subconninfo=").append(subconninfo);
        sb.append(", subslotname=").append(subslotname);
        sb.append(", subsynccommit=").append(subsynccommit);
        sb.append(", subpublications=").append(subpublications);
        sb.append(", suborigin=").append(suborigin);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}