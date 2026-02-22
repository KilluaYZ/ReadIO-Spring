package com.pool.readio.readiombg.model;

import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;

public class DomainUdtUsage implements Serializable {
    private Object udtCatalog;

    private Object udtSchema;

    private Object udtName;

    private Object domainCatalog;

    private Object domainSchema;

    private Object domainName;

    private static final long serialVersionUID = 1L;

    public Object getUdtCatalog() {
        return udtCatalog;
    }

    public void setUdtCatalog(Object udtCatalog) {
        this.udtCatalog = udtCatalog;
    }

    public Object getUdtSchema() {
        return udtSchema;
    }

    public void setUdtSchema(Object udtSchema) {
        this.udtSchema = udtSchema;
    }

    public Object getUdtName() {
        return udtName;
    }

    public void setUdtName(Object udtName) {
        this.udtName = udtName;
    }

    public Object getDomainCatalog() {
        return domainCatalog;
    }

    public void setDomainCatalog(Object domainCatalog) {
        this.domainCatalog = domainCatalog;
    }

    public Object getDomainSchema() {
        return domainSchema;
    }

    public void setDomainSchema(Object domainSchema) {
        this.domainSchema = domainSchema;
    }

    public Object getDomainName() {
        return domainName;
    }

    public void setDomainName(Object domainName) {
        this.domainName = domainName;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", udtCatalog=").append(udtCatalog);
        sb.append(", udtSchema=").append(udtSchema);
        sb.append(", udtName=").append(udtName);
        sb.append(", domainCatalog=").append(domainCatalog);
        sb.append(", domainSchema=").append(domainSchema);
        sb.append(", domainName=").append(domainName);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}