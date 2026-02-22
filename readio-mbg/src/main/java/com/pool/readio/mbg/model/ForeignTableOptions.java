package com.pool.readio.mbg.model;

import java.io.Serializable;

public class ForeignTableOptions implements Serializable {
    private Object foreignTableCatalog;

    private Object foreignTableSchema;

    private Object foreignTableName;

    private Object optionName;

    private Object optionValue;

    private static final long serialVersionUID = 1L;

    public Object getForeignTableCatalog() {
        return foreignTableCatalog;
    }

    public void setForeignTableCatalog(Object foreignTableCatalog) {
        this.foreignTableCatalog = foreignTableCatalog;
    }

    public Object getForeignTableSchema() {
        return foreignTableSchema;
    }

    public void setForeignTableSchema(Object foreignTableSchema) {
        this.foreignTableSchema = foreignTableSchema;
    }

    public Object getForeignTableName() {
        return foreignTableName;
    }

    public void setForeignTableName(Object foreignTableName) {
        this.foreignTableName = foreignTableName;
    }

    public Object getOptionName() {
        return optionName;
    }

    public void setOptionName(Object optionName) {
        this.optionName = optionName;
    }

    public Object getOptionValue() {
        return optionValue;
    }

    public void setOptionValue(Object optionValue) {
        this.optionValue = optionValue;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", foreignTableCatalog=").append(foreignTableCatalog);
        sb.append(", foreignTableSchema=").append(foreignTableSchema);
        sb.append(", foreignTableName=").append(foreignTableName);
        sb.append(", optionName=").append(optionName);
        sb.append(", optionValue=").append(optionValue);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}