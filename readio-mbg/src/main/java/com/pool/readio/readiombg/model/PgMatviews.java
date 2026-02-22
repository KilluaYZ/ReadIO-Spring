package com.pool.readio.readiombg.model;

import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;

public class PgMatviews implements Serializable {
    private String schemaname;

    private String matviewname;

    private String matviewowner;

    private String tablespace;

    private Boolean hasindexes;

    private Boolean ispopulated;

    private String definition;

    private static final long serialVersionUID = 1L;

    public String getSchemaname() {
        return schemaname;
    }

    public void setSchemaname(String schemaname) {
        this.schemaname = schemaname;
    }

    public String getMatviewname() {
        return matviewname;
    }

    public void setMatviewname(String matviewname) {
        this.matviewname = matviewname;
    }

    public String getMatviewowner() {
        return matviewowner;
    }

    public void setMatviewowner(String matviewowner) {
        this.matviewowner = matviewowner;
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

    public Boolean getIspopulated() {
        return ispopulated;
    }

    public void setIspopulated(Boolean ispopulated) {
        this.ispopulated = ispopulated;
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
        sb.append(", matviewname=").append(matviewname);
        sb.append(", matviewowner=").append(matviewowner);
        sb.append(", tablespace=").append(tablespace);
        sb.append(", hasindexes=").append(hasindexes);
        sb.append(", ispopulated=").append(ispopulated);
        sb.append(", definition=").append(definition);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}