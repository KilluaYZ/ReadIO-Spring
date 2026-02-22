package com.pool.readio.mbg.model;

import java.io.Serializable;

public class DataTypePrivileges implements Serializable {
    private Object objectCatalog;

    private Object objectSchema;

    private Object objectName;

    private Object objectType;

    private Object dtdIdentifier;

    private static final long serialVersionUID = 1L;

    public Object getObjectCatalog() {
        return objectCatalog;
    }

    public void setObjectCatalog(Object objectCatalog) {
        this.objectCatalog = objectCatalog;
    }

    public Object getObjectSchema() {
        return objectSchema;
    }

    public void setObjectSchema(Object objectSchema) {
        this.objectSchema = objectSchema;
    }

    public Object getObjectName() {
        return objectName;
    }

    public void setObjectName(Object objectName) {
        this.objectName = objectName;
    }

    public Object getObjectType() {
        return objectType;
    }

    public void setObjectType(Object objectType) {
        this.objectType = objectType;
    }

    public Object getDtdIdentifier() {
        return dtdIdentifier;
    }

    public void setDtdIdentifier(Object dtdIdentifier) {
        this.dtdIdentifier = dtdIdentifier;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", objectCatalog=").append(objectCatalog);
        sb.append(", objectSchema=").append(objectSchema);
        sb.append(", objectName=").append(objectName);
        sb.append(", objectType=").append(objectType);
        sb.append(", dtdIdentifier=").append(dtdIdentifier);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}