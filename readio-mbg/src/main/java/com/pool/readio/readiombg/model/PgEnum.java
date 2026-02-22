package com.pool.readio.readiombg.model;

import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;

public class PgEnum implements Serializable {
    private Long oid;

    private Long enumtypid;

    private Float enumsortorder;

    private String enumlabel;

    private static final long serialVersionUID = 1L;

    public Long getOid() {
        return oid;
    }

    public void setOid(Long oid) {
        this.oid = oid;
    }

    public Long getEnumtypid() {
        return enumtypid;
    }

    public void setEnumtypid(Long enumtypid) {
        this.enumtypid = enumtypid;
    }

    public Float getEnumsortorder() {
        return enumsortorder;
    }

    public void setEnumsortorder(Float enumsortorder) {
        this.enumsortorder = enumsortorder;
    }

    public String getEnumlabel() {
        return enumlabel;
    }

    public void setEnumlabel(String enumlabel) {
        this.enumlabel = enumlabel;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", oid=").append(oid);
        sb.append(", enumtypid=").append(enumtypid);
        sb.append(", enumsortorder=").append(enumsortorder);
        sb.append(", enumlabel=").append(enumlabel);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}