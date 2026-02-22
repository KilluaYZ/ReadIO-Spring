package com.pool.readio.readiombg.model;

import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;

public class Collations implements Serializable {
    private Object collationCatalog;

    private Object collationSchema;

    private Object collationName;

    private Object padAttribute;

    private static final long serialVersionUID = 1L;

    public Object getCollationCatalog() {
        return collationCatalog;
    }

    public void setCollationCatalog(Object collationCatalog) {
        this.collationCatalog = collationCatalog;
    }

    public Object getCollationSchema() {
        return collationSchema;
    }

    public void setCollationSchema(Object collationSchema) {
        this.collationSchema = collationSchema;
    }

    public Object getCollationName() {
        return collationName;
    }

    public void setCollationName(Object collationName) {
        this.collationName = collationName;
    }

    public Object getPadAttribute() {
        return padAttribute;
    }

    public void setPadAttribute(Object padAttribute) {
        this.padAttribute = padAttribute;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", collationCatalog=").append(collationCatalog);
        sb.append(", collationSchema=").append(collationSchema);
        sb.append(", collationName=").append(collationName);
        sb.append(", padAttribute=").append(padAttribute);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}