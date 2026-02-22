package com.pool.readio.readiombg.model;

import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;

public class CollationCharacterSetApplicability implements Serializable {
    private Object collationCatalog;

    private Object collationSchema;

    private Object collationName;

    private Object characterSetCatalog;

    private Object characterSetSchema;

    private Object characterSetName;

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

    public Object getCharacterSetCatalog() {
        return characterSetCatalog;
    }

    public void setCharacterSetCatalog(Object characterSetCatalog) {
        this.characterSetCatalog = characterSetCatalog;
    }

    public Object getCharacterSetSchema() {
        return characterSetSchema;
    }

    public void setCharacterSetSchema(Object characterSetSchema) {
        this.characterSetSchema = characterSetSchema;
    }

    public Object getCharacterSetName() {
        return characterSetName;
    }

    public void setCharacterSetName(Object characterSetName) {
        this.characterSetName = characterSetName;
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
        sb.append(", characterSetCatalog=").append(characterSetCatalog);
        sb.append(", characterSetSchema=").append(characterSetSchema);
        sb.append(", characterSetName=").append(characterSetName);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}