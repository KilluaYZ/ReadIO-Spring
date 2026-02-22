package com.pool.readio.mbg.model;

import java.io.Serializable;

public class Schemata implements Serializable {
    private Object catalogName;

    private Object schemaName;

    private Object schemaOwner;

    private Object defaultCharacterSetCatalog;

    private Object defaultCharacterSetSchema;

    private Object defaultCharacterSetName;

    private Object sqlPath;

    private static final long serialVersionUID = 1L;

    public Object getCatalogName() {
        return catalogName;
    }

    public void setCatalogName(Object catalogName) {
        this.catalogName = catalogName;
    }

    public Object getSchemaName() {
        return schemaName;
    }

    public void setSchemaName(Object schemaName) {
        this.schemaName = schemaName;
    }

    public Object getSchemaOwner() {
        return schemaOwner;
    }

    public void setSchemaOwner(Object schemaOwner) {
        this.schemaOwner = schemaOwner;
    }

    public Object getDefaultCharacterSetCatalog() {
        return defaultCharacterSetCatalog;
    }

    public void setDefaultCharacterSetCatalog(Object defaultCharacterSetCatalog) {
        this.defaultCharacterSetCatalog = defaultCharacterSetCatalog;
    }

    public Object getDefaultCharacterSetSchema() {
        return defaultCharacterSetSchema;
    }

    public void setDefaultCharacterSetSchema(Object defaultCharacterSetSchema) {
        this.defaultCharacterSetSchema = defaultCharacterSetSchema;
    }

    public Object getDefaultCharacterSetName() {
        return defaultCharacterSetName;
    }

    public void setDefaultCharacterSetName(Object defaultCharacterSetName) {
        this.defaultCharacterSetName = defaultCharacterSetName;
    }

    public Object getSqlPath() {
        return sqlPath;
    }

    public void setSqlPath(Object sqlPath) {
        this.sqlPath = sqlPath;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", catalogName=").append(catalogName);
        sb.append(", schemaName=").append(schemaName);
        sb.append(", schemaOwner=").append(schemaOwner);
        sb.append(", defaultCharacterSetCatalog=").append(defaultCharacterSetCatalog);
        sb.append(", defaultCharacterSetSchema=").append(defaultCharacterSetSchema);
        sb.append(", defaultCharacterSetName=").append(defaultCharacterSetName);
        sb.append(", sqlPath=").append(sqlPath);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}