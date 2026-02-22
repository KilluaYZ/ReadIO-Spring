package com.pool.readio.mbg.model;

import java.io.Serializable;

public class PgStatioAllSequences implements Serializable {
    private Long relid;

    private String schemaname;

    private String relname;

    private Long blksRead;

    private Long blksHit;

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

    public Long getBlksRead() {
        return blksRead;
    }

    public void setBlksRead(Long blksRead) {
        this.blksRead = blksRead;
    }

    public Long getBlksHit() {
        return blksHit;
    }

    public void setBlksHit(Long blksHit) {
        this.blksHit = blksHit;
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
        sb.append(", blksRead=").append(blksRead);
        sb.append(", blksHit=").append(blksHit);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}