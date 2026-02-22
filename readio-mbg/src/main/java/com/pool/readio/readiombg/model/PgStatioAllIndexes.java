package com.pool.readio.readiombg.model;

import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;

public class PgStatioAllIndexes implements Serializable {
    private Long relid;

    private Long indexrelid;

    private String schemaname;

    private String relname;

    private String indexrelname;

    private Long idxBlksRead;

    private Long idxBlksHit;

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
        sb.append(", idxBlksRead=").append(idxBlksRead);
        sb.append(", idxBlksHit=").append(idxBlksHit);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}