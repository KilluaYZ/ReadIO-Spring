package com.pool.readio.mbg.model;

import java.io.Serializable;

public class PgPublicationTables implements Serializable {
    private String pubname;

    private String schemaname;

    private String tablename;

    private Object attnames;

    private String rowfilter;

    private static final long serialVersionUID = 1L;

    public String getPubname() {
        return pubname;
    }

    public void setPubname(String pubname) {
        this.pubname = pubname;
    }

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

    public Object getAttnames() {
        return attnames;
    }

    public void setAttnames(Object attnames) {
        this.attnames = attnames;
    }

    public String getRowfilter() {
        return rowfilter;
    }

    public void setRowfilter(String rowfilter) {
        this.rowfilter = rowfilter;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", pubname=").append(pubname);
        sb.append(", schemaname=").append(schemaname);
        sb.append(", tablename=").append(tablename);
        sb.append(", attnames=").append(attnames);
        sb.append(", rowfilter=").append(rowfilter);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}