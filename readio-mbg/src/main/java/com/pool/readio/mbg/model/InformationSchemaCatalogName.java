package com.pool.readio.mbg.model;

import java.io.Serializable;

public class InformationSchemaCatalogName implements Serializable {
    private Object catalogName;

    private static final long serialVersionUID = 1L;

    public Object getCatalogName() {
        return catalogName;
    }

    public void setCatalogName(Object catalogName) {
        this.catalogName = catalogName;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", catalogName=").append(catalogName);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}