package com.pool.readio.readiombg.model;

import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;

public class PgForeignServers implements Serializable {
    private Long oid;

    private Object srvoptions;

    private Object foreignServerCatalog;

    private Object foreignServerName;

    private Object foreignDataWrapperCatalog;

    private Object foreignDataWrapperName;

    private Object foreignServerType;

    private Object foreignServerVersion;

    private Object authorizationIdentifier;

    private static final long serialVersionUID = 1L;

    public Long getOid() {
        return oid;
    }

    public void setOid(Long oid) {
        this.oid = oid;
    }

    public Object getSrvoptions() {
        return srvoptions;
    }

    public void setSrvoptions(Object srvoptions) {
        this.srvoptions = srvoptions;
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

    public Object getForeignServerType() {
        return foreignServerType;
    }

    public void setForeignServerType(Object foreignServerType) {
        this.foreignServerType = foreignServerType;
    }

    public Object getForeignServerVersion() {
        return foreignServerVersion;
    }

    public void setForeignServerVersion(Object foreignServerVersion) {
        this.foreignServerVersion = foreignServerVersion;
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
        sb.append(", oid=").append(oid);
        sb.append(", srvoptions=").append(srvoptions);
        sb.append(", foreignServerCatalog=").append(foreignServerCatalog);
        sb.append(", foreignServerName=").append(foreignServerName);
        sb.append(", foreignDataWrapperCatalog=").append(foreignDataWrapperCatalog);
        sb.append(", foreignDataWrapperName=").append(foreignDataWrapperName);
        sb.append(", foreignServerType=").append(foreignServerType);
        sb.append(", foreignServerVersion=").append(foreignServerVersion);
        sb.append(", authorizationIdentifier=").append(authorizationIdentifier);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}