package com.pool.readio.readiombg.model;

import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;

public class CharacterSets implements Serializable {
    private Object characterSetCatalog;

    private Object characterSetSchema;

    private Object characterSetName;

    private Object characterRepertoire;

    private Object formOfUse;

    private Object defaultCollateCatalog;

    private Object defaultCollateSchema;

    private Object defaultCollateName;

    private static final long serialVersionUID = 1L;

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

    public Object getCharacterRepertoire() {
        return characterRepertoire;
    }

    public void setCharacterRepertoire(Object characterRepertoire) {
        this.characterRepertoire = characterRepertoire;
    }

    public Object getFormOfUse() {
        return formOfUse;
    }

    public void setFormOfUse(Object formOfUse) {
        this.formOfUse = formOfUse;
    }

    public Object getDefaultCollateCatalog() {
        return defaultCollateCatalog;
    }

    public void setDefaultCollateCatalog(Object defaultCollateCatalog) {
        this.defaultCollateCatalog = defaultCollateCatalog;
    }

    public Object getDefaultCollateSchema() {
        return defaultCollateSchema;
    }

    public void setDefaultCollateSchema(Object defaultCollateSchema) {
        this.defaultCollateSchema = defaultCollateSchema;
    }

    public Object getDefaultCollateName() {
        return defaultCollateName;
    }

    public void setDefaultCollateName(Object defaultCollateName) {
        this.defaultCollateName = defaultCollateName;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", characterSetCatalog=").append(characterSetCatalog);
        sb.append(", characterSetSchema=").append(characterSetSchema);
        sb.append(", characterSetName=").append(characterSetName);
        sb.append(", characterRepertoire=").append(characterRepertoire);
        sb.append(", formOfUse=").append(formOfUse);
        sb.append(", defaultCollateCatalog=").append(defaultCollateCatalog);
        sb.append(", defaultCollateSchema=").append(defaultCollateSchema);
        sb.append(", defaultCollateName=").append(defaultCollateName);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}