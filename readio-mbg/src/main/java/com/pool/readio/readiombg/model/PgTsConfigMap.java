package com.pool.readio.readiombg.model;

import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;

public class PgTsConfigMap implements Serializable {
    private Long mapcfg;

    private Integer maptokentype;

    private Integer mapseqno;

    private Long mapdict;

    private static final long serialVersionUID = 1L;

    public Long getMapcfg() {
        return mapcfg;
    }

    public void setMapcfg(Long mapcfg) {
        this.mapcfg = mapcfg;
    }

    public Integer getMaptokentype() {
        return maptokentype;
    }

    public void setMaptokentype(Integer maptokentype) {
        this.maptokentype = maptokentype;
    }

    public Integer getMapseqno() {
        return mapseqno;
    }

    public void setMapseqno(Integer mapseqno) {
        this.mapseqno = mapseqno;
    }

    public Long getMapdict() {
        return mapdict;
    }

    public void setMapdict(Long mapdict) {
        this.mapdict = mapdict;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", mapcfg=").append(mapcfg);
        sb.append(", maptokentype=").append(maptokentype);
        sb.append(", mapseqno=").append(mapseqno);
        sb.append(", mapdict=").append(mapdict);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}