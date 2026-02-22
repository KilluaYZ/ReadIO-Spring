package com.pool.readio.readiombg.model;

import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;

public class DomainConstraints implements Serializable {
    private Object constraintCatalog;

    private Object constraintSchema;

    private Object constraintName;

    private Object domainCatalog;

    private Object domainSchema;

    private Object domainName;

    private Object isDeferrable;

    private Object initiallyDeferred;

    private static final long serialVersionUID = 1L;

    public Object getConstraintCatalog() {
        return constraintCatalog;
    }

    public void setConstraintCatalog(Object constraintCatalog) {
        this.constraintCatalog = constraintCatalog;
    }

    public Object getConstraintSchema() {
        return constraintSchema;
    }

    public void setConstraintSchema(Object constraintSchema) {
        this.constraintSchema = constraintSchema;
    }

    public Object getConstraintName() {
        return constraintName;
    }

    public void setConstraintName(Object constraintName) {
        this.constraintName = constraintName;
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

    public Object getIsDeferrable() {
        return isDeferrable;
    }

    public void setIsDeferrable(Object isDeferrable) {
        this.isDeferrable = isDeferrable;
    }

    public Object getInitiallyDeferred() {
        return initiallyDeferred;
    }

    public void setInitiallyDeferred(Object initiallyDeferred) {
        this.initiallyDeferred = initiallyDeferred;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", constraintCatalog=").append(constraintCatalog);
        sb.append(", constraintSchema=").append(constraintSchema);
        sb.append(", constraintName=").append(constraintName);
        sb.append(", domainCatalog=").append(domainCatalog);
        sb.append(", domainSchema=").append(domainSchema);
        sb.append(", domainName=").append(domainName);
        sb.append(", isDeferrable=").append(isDeferrable);
        sb.append(", initiallyDeferred=").append(initiallyDeferred);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}