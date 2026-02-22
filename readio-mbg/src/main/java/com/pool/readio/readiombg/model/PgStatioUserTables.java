package com.pool.readio.readiombg.model;

import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;

public class PgStatioUserTables implements Serializable {
    private Long relid;

    private String schemaname;

    private String relname;

    private Long heapBlksRead;

    private Long heapBlksHit;

    private Long idxBlksRead;

    private Long idxBlksHit;

    private Long toastBlksRead;

    private Long toastBlksHit;

    private Long tidxBlksRead;

    private Long tidxBlksHit;

    private static final long serialVersionUID = 1L;

    public Long getRelid() {
        return relid;
    }

    public void setRelid(Long relid) {
        this.relid = relid;
    }

    public String getSchemaname() {
        return schemaname;
    }

    public void setSchemaname(String schemaname) {
        this.schemaname = schemaname;
    }

    public String getRelname() {
        return relname;
    }

    public void setRelname(String relname) {
        this.relname = relname;
    }

    public Long getHeapBlksRead() {
        return heapBlksRead;
    }

    public void setHeapBlksRead(Long heapBlksRead) {
        this.heapBlksRead = heapBlksRead;
    }

    public Long getHeapBlksHit() {
        return heapBlksHit;
    }

    public void setHeapBlksHit(Long heapBlksHit) {
        this.heapBlksHit = heapBlksHit;
    }

    public Long getIdxBlksRead() {
        return idxBlksRead;
    }

    public void setIdxBlksRead(Long idxBlksRead) {
        this.idxBlksRead = idxBlksRead;
    }

    public Long getIdxBlksHit() {
        return idxBlksHit;
    }

    public void setIdxBlksHit(Long idxBlksHit) {
        this.idxBlksHit = idxBlksHit;
    }

    public Long getToastBlksRead() {
        return toastBlksRead;
    }

    public void setToastBlksRead(Long toastBlksRead) {
        this.toastBlksRead = toastBlksRead;
    }

    public Long getToastBlksHit() {
        return toastBlksHit;
    }

    public void setToastBlksHit(Long toastBlksHit) {
        this.toastBlksHit = toastBlksHit;
    }

    public Long getTidxBlksRead() {
        return tidxBlksRead;
    }

    public void setTidxBlksRead(Long tidxBlksRead) {
        this.tidxBlksRead = tidxBlksRead;
    }

    public Long getTidxBlksHit() {
        return tidxBlksHit;
    }

    public void setTidxBlksHit(Long tidxBlksHit) {
        this.tidxBlksHit = tidxBlksHit;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", relid=").append(relid);
        sb.append(", schemaname=").append(schemaname);
        sb.append(", relname=").append(relname);
        sb.append(", heapBlksRead=").append(heapBlksRead);
        sb.append(", heapBlksHit=").append(heapBlksHit);
        sb.append(", idxBlksRead=").append(idxBlksRead);
        sb.append(", idxBlksHit=").append(idxBlksHit);
        sb.append(", toastBlksRead=").append(toastBlksRead);
        sb.append(", toastBlksHit=").append(toastBlksHit);
        sb.append(", tidxBlksRead=").append(tidxBlksRead);
        sb.append(", tidxBlksHit=").append(tidxBlksHit);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}