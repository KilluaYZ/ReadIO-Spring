package com.pool.readio.readiombg.model;

import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;

public class PgDefaultAcl implements Serializable {
    private Long oid;

    private Long defaclrole;

    private Long defaclnamespace;

    private String defaclobjtype;

    private Object defaclacl;

    private static final long serialVersionUID = 1L;

    public Long getOid() {
        return oid;
    }

    public void setOid(Long oid) {
        this.oid = oid;
    }

    public Long getDefaclrole() {
        return defaclrole;
    }

    public void setDefaclrole(Long defaclrole) {
        this.defaclrole = defaclrole;
    }

    public Long getDefaclnamespace() {
        return defaclnamespace;
    }

    public void setDefaclnamespace(Long defaclnamespace) {
        this.defaclnamespace = defaclnamespace;
    }

    public String getDefaclobjtype() {
        return defaclobjtype;
    }

    public void setDefaclobjtype(String defaclobjtype) {
        this.defaclobjtype = defaclobjtype;
    }

    public Object getDefaclacl() {
        return defaclacl;
    }

    public void setDefaclacl(Object defaclacl) {
        this.defaclacl = defaclacl;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", oid=").append(oid);
        sb.append(", defaclrole=").append(defaclrole);
        sb.append(", defaclnamespace=").append(defaclnamespace);
        sb.append(", defaclobjtype=").append(defaclobjtype);
        sb.append(", defaclacl=").append(defaclacl);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}