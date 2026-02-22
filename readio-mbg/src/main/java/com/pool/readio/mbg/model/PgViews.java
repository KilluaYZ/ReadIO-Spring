package com.pool.readio.mbg.model;

import java.io.Serializable;

public class PgViews implements Serializable {
    private String schemaname;

    private String viewname;

    private String viewowner;

    private String definition;

    private static final long serialVersionUID = 1L;

    public String getSchemaname() {
        return schemaname;
    }

    public void setSchemaname(String schemaname) {
        this.schemaname = schemaname;
    }

    public String getViewname() {
        return viewname;
    }

    public void setViewname(String viewname) {
        this.viewname = viewname;
    }

    public String getViewowner() {
        return viewowner;
    }

    public void setViewowner(String viewowner) {
        this.viewowner = viewowner;
    }

    public String getDefinition() {
        return definition;
    }

    public void setDefinition(String definition) {
        this.definition = definition;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", schemaname=").append(schemaname);
        sb.append(", viewname=").append(viewname);
        sb.append(", viewowner=").append(viewowner);
        sb.append(", definition=").append(definition);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}