package com.pool.readio.mbg.model;

import java.io.Serializable;

public class PgOperator implements Serializable {
    private Long oid;

    private String oprname;

    private Long oprnamespace;

    private Long oprowner;

    private String oprkind;

    private Boolean oprcanmerge;

    private Boolean oprcanhash;

    private Long oprleft;

    private Long oprright;

    private Long oprresult;

    private Long oprcom;

    private Long oprnegate;

    private Object oprcode;

    private Object oprrest;

    private Object oprjoin;

    private static final long serialVersionUID = 1L;

    public Long getOid() {
        return oid;
    }

    public void setOid(Long oid) {
        this.oid = oid;
    }

    public String getOprname() {
        return oprname;
    }

    public void setOprname(String oprname) {
        this.oprname = oprname;
    }

    public Long getOprnamespace() {
        return oprnamespace;
    }

    public void setOprnamespace(Long oprnamespace) {
        this.oprnamespace = oprnamespace;
    }

    public Long getOprowner() {
        return oprowner;
    }

    public void setOprowner(Long oprowner) {
        this.oprowner = oprowner;
    }

    public String getOprkind() {
        return oprkind;
    }

    public void setOprkind(String oprkind) {
        this.oprkind = oprkind;
    }

    public Boolean getOprcanmerge() {
        return oprcanmerge;
    }

    public void setOprcanmerge(Boolean oprcanmerge) {
        this.oprcanmerge = oprcanmerge;
    }

    public Boolean getOprcanhash() {
        return oprcanhash;
    }

    public void setOprcanhash(Boolean oprcanhash) {
        this.oprcanhash = oprcanhash;
    }

    public Long getOprleft() {
        return oprleft;
    }

    public void setOprleft(Long oprleft) {
        this.oprleft = oprleft;
    }

    public Long getOprright() {
        return oprright;
    }

    public void setOprright(Long oprright) {
        this.oprright = oprright;
    }

    public Long getOprresult() {
        return oprresult;
    }

    public void setOprresult(Long oprresult) {
        this.oprresult = oprresult;
    }

    public Long getOprcom() {
        return oprcom;
    }

    public void setOprcom(Long oprcom) {
        this.oprcom = oprcom;
    }

    public Long getOprnegate() {
        return oprnegate;
    }

    public void setOprnegate(Long oprnegate) {
        this.oprnegate = oprnegate;
    }

    public Object getOprcode() {
        return oprcode;
    }

    public void setOprcode(Object oprcode) {
        this.oprcode = oprcode;
    }

    public Object getOprrest() {
        return oprrest;
    }

    public void setOprrest(Object oprrest) {
        this.oprrest = oprrest;
    }

    public Object getOprjoin() {
        return oprjoin;
    }

    public void setOprjoin(Object oprjoin) {
        this.oprjoin = oprjoin;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", oid=").append(oid);
        sb.append(", oprname=").append(oprname);
        sb.append(", oprnamespace=").append(oprnamespace);
        sb.append(", oprowner=").append(oprowner);
        sb.append(", oprkind=").append(oprkind);
        sb.append(", oprcanmerge=").append(oprcanmerge);
        sb.append(", oprcanhash=").append(oprcanhash);
        sb.append(", oprleft=").append(oprleft);
        sb.append(", oprright=").append(oprright);
        sb.append(", oprresult=").append(oprresult);
        sb.append(", oprcom=").append(oprcom);
        sb.append(", oprnegate=").append(oprnegate);
        sb.append(", oprcode=").append(oprcode);
        sb.append(", oprrest=").append(oprrest);
        sb.append(", oprjoin=").append(oprjoin);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}