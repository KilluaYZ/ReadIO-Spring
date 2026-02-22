package com.pool.readio.readiombg.model;

import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;

public class ForeignDataWrappers implements Serializable {
    private Object foreignDataWrapperCatalog;

    private Object foreignDataWrapperName;

    private Object authorizationIdentifier;

    private Object libraryName;

    private Object foreignDataWrapperLanguage;

    private static final long serialVersionUID = 1L;

    public Object getForeignDataWrapperCatalog() {
        return foreignDataWrapperCatalog;
    }

    public void setForeignDataWrapperCatalog(Object foreignDataWrapperCatalog) {
        this.foreignDataWrapperCatalog = foreignDataWrapperCatalog;
    }

    public Object getForeignDataWrapperName() {
        return foreignDataWrapperName;
    }

    public void setForeignDataWrapperName(Object foreignDataWrapperName) {
        this.foreignDataWrapperName = foreignDataWrapperName;
    }

    public Object getAuthorizationIdentifier() {
        return authorizationIdentifier;
    }

    public void setAuthorizationIdentifier(Object authorizationIdentifier) {
        this.authorizationIdentifier = authorizationIdentifier;
    }

    public Object getLibraryName() {
        return libraryName;
    }

    public void setLibraryName(Object libraryName) {
        this.libraryName = libraryName;
    }

    public Object getForeignDataWrapperLanguage() {
        return foreignDataWrapperLanguage;
    }

    public void setForeignDataWrapperLanguage(Object foreignDataWrapperLanguage) {
        this.foreignDataWrapperLanguage = foreignDataWrapperLanguage;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", foreignDataWrapperCatalog=").append(foreignDataWrapperCatalog);
        sb.append(", foreignDataWrapperName=").append(foreignDataWrapperName);
        sb.append(", authorizationIdentifier=").append(authorizationIdentifier);
        sb.append(", libraryName=").append(libraryName);
        sb.append(", foreignDataWrapperLanguage=").append(foreignDataWrapperLanguage);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}