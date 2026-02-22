package com.pool.readio.mbg.model;

import java.io.Serializable;

public class PgForeignTables implements Serializable {
    private Object foreignTableCatalog;

    private Object foreignTableSchema;

    private Object foreignTableName;

    private Object ftoptions;

    private Object foreignServerCatalog;

    private Object foreignServerName;

    private Object authorizationIdentifier;

    private static final long serialVersionUID = 1L;

    public Object getForeignTableCatalog() {
        return foreignTableCatalog;
    }

    public void setForeignTableCatalog(Object foreignTableCatalog) {
        this.foreignTableCatalog = foreignTableCatalog;
    }

    public Object getForeignTableSchema() {
        return foreignTableSchema;
    }

    public void setForeignTableSchema(Object foreignTableSchema) {
        this.foreignTableSchema = foreignTableSchema;
    }

    public Object getForeignTableName() {
        return foreignTableName;
    }

    public void setForeignTableName(Object foreignTableName) {
        this.foreignTableName = foreignTableName;
    }

    public Object getFtoptions() {
        return ftoptions;
    }

    public void setFtoptions(Object ftoptions) {
        this.ftoptions = ftoptions;
    }

    public Object getForeignServerCatalog() {
        return foreignServerCatalog;
    }

    public void setForeignServerCatalog(Object foreignServerCatalog) {
        this.foreignServerCatalog = foreignServerCatalog;
    }

    public Object getForeignServerName() {
        return foreignServerName;
    }

    public void setForeignServerName(Object foreignServerName) {
        this.foreignServerName = foreignServerName;
    }

    public Object getAuthorizationIdentifier() {
        return authorizationIdentifier;
    }

    public void setAuthorizationIdentifier(Object authorizationIdentifier) {
        this.authorizationIdentifier = authorizationIdentifier;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", foreignTableCatalog=").append(foreignTableCatalog);
        sb.append(", foreignTableSchema=").append(foreignTableSchema);
        sb.append(", foreignTableName=").append(foreignTableName);
        sb.append(", ftoptions=").append(ftoptions);
        sb.append(", foreignServerCatalog=").append(foreignServerCatalog);
        sb.append(", foreignServerName=").append(foreignServerName);
        sb.append(", authorizationIdentifier=").append(authorizationIdentifier);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}