package com.pool.readio.readiombg.model;

import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;

public class PgAuthMembers implements Serializable {
    private Long oid;

    private Long roleid;

    private Long member;

    private Long grantor;

    private Boolean adminOption;

    private Boolean inheritOption;

    private Boolean setOption;

    private static final long serialVersionUID = 1L;

    public Long getOid() {
        return oid;
    }

    public void setOid(Long oid) {
        this.oid = oid;
    }

    public Long getRoleid() {
        return roleid;
    }

    public void setRoleid(Long roleid) {
        this.roleid = roleid;
    }

    public Long getMember() {
        return member;
    }

    public void setMember(Long member) {
        this.member = member;
    }

    public Long getGrantor() {
        return grantor;
    }

    public void setGrantor(Long grantor) {
        this.grantor = grantor;
    }

    public Boolean getAdminOption() {
        return adminOption;
    }

    public void setAdminOption(Boolean adminOption) {
        this.adminOption = adminOption;
    }

    public Boolean getInheritOption() {
        return inheritOption;
    }

    public void setInheritOption(Boolean inheritOption) {
        this.inheritOption = inheritOption;
    }

    public Boolean getSetOption() {
        return setOption;
    }

    public void setSetOption(Boolean setOption) {
        this.setOption = setOption;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", oid=").append(oid);
        sb.append(", roleid=").append(roleid);
        sb.append(", member=").append(member);
        sb.append(", grantor=").append(grantor);
        sb.append(", adminOption=").append(adminOption);
        sb.append(", inheritOption=").append(inheritOption);
        sb.append(", setOption=").append(setOption);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}