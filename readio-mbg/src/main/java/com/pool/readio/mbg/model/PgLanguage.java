package com.pool.readio.mbg.model;

import java.io.Serializable;

public class PgLanguage implements Serializable {
    private Long oid;

    private String lanname;

    private Long lanowner;

    private Boolean lanispl;

    private Boolean lanpltrusted;

    private Long lanplcallfoid;

    private Long laninline;

    private Long lanvalidator;

    private Object lanacl;

    private static final long serialVersionUID = 1L;

    public Long getOid() {
        return oid;
    }

    public void setOid(Long oid) {
        this.oid = oid;
    }

    public String getLanname() {
        return lanname;
    }

    public void setLanname(String lanname) {
        this.lanname = lanname;
    }

    public Long getLanowner() {
        return lanowner;
    }

    public void setLanowner(Long lanowner) {
        this.lanowner = lanowner;
    }

    public Boolean getLanispl() {
        return lanispl;
    }

    public void setLanispl(Boolean lanispl) {
        this.lanispl = lanispl;
    }

    public Boolean getLanpltrusted() {
        return lanpltrusted;
    }

    public void setLanpltrusted(Boolean lanpltrusted) {
        this.lanpltrusted = lanpltrusted;
    }

    public Long getLanplcallfoid() {
        return lanplcallfoid;
    }

    public void setLanplcallfoid(Long lanplcallfoid) {
        this.lanplcallfoid = lanplcallfoid;
    }

    public Long getLaninline() {
        return laninline;
    }

    public void setLaninline(Long laninline) {
        this.laninline = laninline;
    }

    public Long getLanvalidator() {
        return lanvalidator;
    }

    public void setLanvalidator(Long lanvalidator) {
        this.lanvalidator = lanvalidator;
    }

    public Object getLanacl() {
        return lanacl;
    }

    public void setLanacl(Object lanacl) {
        this.lanacl = lanacl;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", oid=").append(oid);
        sb.append(", lanname=").append(lanname);
        sb.append(", lanowner=").append(lanowner);
        sb.append(", lanispl=").append(lanispl);
        sb.append(", lanpltrusted=").append(lanpltrusted);
        sb.append(", lanplcallfoid=").append(lanplcallfoid);
        sb.append(", laninline=").append(laninline);
        sb.append(", lanvalidator=").append(lanvalidator);
        sb.append(", lanacl=").append(lanacl);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}