package com.pool.readio.readiombg.model;

import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;

public class ForeignDataWrapperOptions implements Serializable {
    private Object foreignDataWrapperCatalog;

    private Object foreignDataWrapperName;

    private Object optionName;

    private Object optionValue;

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
        sb.append(", foreignDataWrapperCatalog=").append(foreignDataWrapperCatalog);
        sb.append(", foreignDataWrapperName=").append(foreignDataWrapperName);
        sb.append(", optionName=").append(optionName);
        sb.append(", optionValue=").append(optionValue);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}