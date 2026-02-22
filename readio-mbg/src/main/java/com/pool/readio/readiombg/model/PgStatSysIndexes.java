package com.pool.readio.readiombg.model;

import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;
import java.util.Date;

public class PgStatSysIndexes implements Serializable {
    private Long relid;

    private Long indexrelid;

    private String schemaname;

    private String relname;

    private String indexrelname;

    private Long idxScan;

    private Date lastIdxScan;

    private Long idxTupRead;

    private Long idxTupFetch;

    private static final long serialVersionUID = 1L;

    public Long getRelid() {
        return relid;
    }

    public void setRelid(Long relid) {
        this.relid = relid;
    }

    public Long getIndexrelid() {
        return indexrelid;
    }

    public void setIndexrelid(Long indexrelid) {
        this.indexrelid = indexrelid;
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

    public String getIndexrelname() {
        return indexrelname;
    }

    public void setIndexrelname(String indexrelname) {
        this.indexrelname = indexrelname;
    }

    public Long getIdxScan() {
        return idxScan;
    }

    public void setIdxScan(Long idxScan) {
        this.idxScan = idxScan;
    }

    public Date getLastIdxScan() {
        return lastIdxScan;
    }

    public void setLastIdxScan(Date lastIdxScan) {
        this.lastIdxScan = lastIdxScan;
    }

    public Long getIdxTupRead() {
        return idxTupRead;
    }

    public void setIdxTupRead(Long idxTupRead) {
        this.idxTupRead = idxTupRead;
    }

    public Long getIdxTupFetch() {
        return idxTupFetch;
    }

    public void setIdxTupFetch(Long idxTupFetch) {
        this.idxTupFetch = idxTupFetch;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", relid=").append(relid);
        sb.append(", indexrelid=").append(indexrelid);
        sb.append(", schemaname=").append(schemaname);
        sb.append(", relname=").append(relname);
        sb.append(", indexrelname=").append(indexrelname);
        sb.append(", idxScan=").append(idxScan);
        sb.append(", lastIdxScan=").append(lastIdxScan);
        sb.append(", idxTupRead=").append(idxTupRead);
        sb.append(", idxTupFetch=").append(idxTupFetch);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}