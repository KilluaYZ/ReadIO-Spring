package com.pool.readio.mbg.model;

import java.io.Serializable;

public class PgIndexes implements Serializable {
    private String schemaname;

    private String tablename;

    private String indexname;

    private String tablespace;

    private String indexdef;

    private static final long serialVersionUID = 1L;

    public String getSchemaname() {
        return schemaname;
    }

    public void setSchemaname(String schemaname) {
        this.schemaname = schemaname;
    }

    public String getTablename() {
        return tablename;
    }

    public void setTablename(String tablename) {
        this.tablename = tablename;
    }

    public String getIndexname() {
        return indexname;
    }

    public void setIndexname(String indexname) {
        this.indexname = indexname;
    }

    public String getTablespace() {
        return tablespace;
    }

    public void setTablespace(String tablespace) {
        this.tablespace = tablespace;
    }

    public String getIndexdef() {
        return indexdef;
    }

    public void setIndexdef(String indexdef) {
        this.indexdef = indexdef;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", schemaname=").append(schemaname);
        sb.append(", tablename=").append(tablename);
        sb.append(", indexname=").append(indexname);
        sb.append(", tablespace=").append(tablespace);
        sb.append(", indexdef=").append(indexdef);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}