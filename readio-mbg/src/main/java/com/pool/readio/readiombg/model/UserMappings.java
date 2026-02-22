package com.pool.readio.readiombg.model;

import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;

public class UserMappings implements Serializable {
    private Object authorizationIdentifier;

    private Object foreignServerCatalog;

    private Object foreignServerName;

    private static final long serialVersionUID = 1L;

    public Object getAuthorizationIdentifier() {
        return authorizationIdentifier;
    }

    public void setAuthorizationIdentifier(Object authorizationIdentifier) {
        this.authorizationIdentifier = authorizationIdentifier;
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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", authorizationIdentifier=").append(authorizationIdentifier);
        sb.append(", foreignServerCatalog=").append(foreignServerCatalog);
        sb.append(", foreignServerName=").append(foreignServerName);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}