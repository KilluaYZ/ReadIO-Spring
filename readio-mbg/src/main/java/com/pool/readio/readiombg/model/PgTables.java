package com.pool.readio.readiombg.model;

import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;

public class PgTables implements Serializable {
    private String schemaname;

    private String tablename;

    private String tableowner;

    private String tablespace;

    private Boolean hasindexes;

    private Boolean hasrules;

    private Boolean hastriggers;

    private Boolean rowsecurity;

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

    public String getTableowner() {
        return tableowner;
    }

    public void setTableowner(String tableowner) {
        this.tableowner = tableowner;
    }

    public String getTablespace() {
        return tablespace;
    }

    public void setTablespace(String tablespace) {
        this.tablespace = tablespace;
    }

    public Boolean getHasindexes() {
        return hasindexes;
    }

    public void setHasindexes(Boolean hasindexes) {
        this.hasindexes = hasindexes;
    }

    public Boolean getHasrules() {
        return hasrules;
    }

    public void setHasrules(Boolean hasrules) {
        this.hasrules = hasrules;
    }

    public Boolean getHastriggers() {
        return hastriggers;
    }

    public void setHastriggers(Boolean hastriggers) {
        this.hastriggers = hastriggers;
    }

    public Boolean getRowsecurity() {
        return rowsecurity;
    }

    public void setRowsecurity(Boolean rowsecurity) {
        this.rowsecurity = rowsecurity;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", schemaname=").append(schemaname);
        sb.append(", tablename=").append(tablename);
        sb.append(", tableowner=").append(tableowner);
        sb.append(", tablespace=").append(tablespace);
        sb.append(", hasindexes=").append(hasindexes);
        sb.append(", hasrules=").append(hasrules);
        sb.append(", hastriggers=").append(hastriggers);
        sb.append(", rowsecurity=").append(rowsecurity);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}