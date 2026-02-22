package com.pool.readio.mbg.model;

import java.io.Serializable;

public class PgTransform implements Serializable {
    private Long oid;

    private Long trftype;

    private Long trflang;

    private Object trffromsql;

    private Object trftosql;

    private static final long serialVersionUID = 1L;

    public Long getOid() {
        return oid;
    }

    public void setOid(Long oid) {
        this.oid = oid;
    }

    public Long getTrftype() {
        return trftype;
    }

    public void setTrftype(Long trftype) {
        this.trftype = trftype;
    }

    public Long getTrflang() {
        return trflang;
    }

    public void setTrflang(Long trflang) {
        this.trflang = trflang;
    }

    public Object getTrffromsql() {
        return trffromsql;
    }

    public void setTrffromsql(Object trffromsql) {
        this.trffromsql = trffromsql;
    }

    public Object getTrftosql() {
        return trftosql;
    }

    public void setTrftosql(Object trftosql) {
        this.trftosql = trftosql;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", oid=").append(oid);
        sb.append(", trftype=").append(trftype);
        sb.append(", trflang=").append(trflang);
        sb.append(", trffromsql=").append(trffromsql);
        sb.append(", trftosql=").append(trftosql);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}