package com.pool.readio.readiombg.model;

import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;

public class Transforms implements Serializable {
    private Object udtCatalog;

    private Object udtSchema;

    private Object udtName;

    private Object specificCatalog;

    private Object specificSchema;

    private Object specificName;

    private Object groupName;

    private Object transformType;

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

    public Object getSpecificCatalog() {
        return specificCatalog;
    }

    public void setSpecificCatalog(Object specificCatalog) {
        this.specificCatalog = specificCatalog;
    }

    public Object getSpecificSchema() {
        return specificSchema;
    }

    public void setSpecificSchema(Object specificSchema) {
        this.specificSchema = specificSchema;
    }

    public Object getSpecificName() {
        return specificName;
    }

    public void setSpecificName(Object specificName) {
        this.specificName = specificName;
    }

    public Object getGroupName() {
        return groupName;
    }

    public void setGroupName(Object groupName) {
        this.groupName = groupName;
    }

    public Object getTransformType() {
        return transformType;
    }

    public void setTransformType(Object transformType) {
        this.transformType = transformType;
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
        sb.append(", specificCatalog=").append(specificCatalog);
        sb.append(", specificSchema=").append(specificSchema);
        sb.append(", specificName=").append(specificName);
        sb.append(", groupName=").append(groupName);
        sb.append(", transformType=").append(transformType);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}