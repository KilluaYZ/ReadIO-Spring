package com.pool.readio.mbg.model;

import java.io.Serializable;

public class PgSettings implements Serializable {
    private String name;

    private String setting;

    private String unit;

    private String category;

    private String shortDesc;

    private String extraDesc;

    private String context;

    private String vartype;

    private String source;

    private String minVal;

    private String maxVal;

    private Object enumvals;

    private String bootVal;

    private String resetVal;

    private String sourcefile;

    private Integer sourceline;

    private Boolean pendingRestart;

    private static final long serialVersionUID = 1L;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSetting() {
        return setting;
    }

    public void setSetting(String setting) {
        this.setting = setting;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getShortDesc() {
        return shortDesc;
    }

    public void setShortDesc(String shortDesc) {
        this.shortDesc = shortDesc;
    }

    public String getExtraDesc() {
        return extraDesc;
    }

    public void setExtraDesc(String extraDesc) {
        this.extraDesc = extraDesc;
    }

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }

    public String getVartype() {
        return vartype;
    }

    public void setVartype(String vartype) {
        this.vartype = vartype;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getMinVal() {
        return minVal;
    }

    public void setMinVal(String minVal) {
        this.minVal = minVal;
    }

    public String getMaxVal() {
        return maxVal;
    }

    public void setMaxVal(String maxVal) {
        this.maxVal = maxVal;
    }

    public Object getEnumvals() {
        return enumvals;
    }

    public void setEnumvals(Object enumvals) {
        this.enumvals = enumvals;
    }

    public String getBootVal() {
        return bootVal;
    }

    public void setBootVal(String bootVal) {
        this.bootVal = bootVal;
    }

    public String getResetVal() {
        return resetVal;
    }

    public void setResetVal(String resetVal) {
        this.resetVal = resetVal;
    }

    public String getSourcefile() {
        return sourcefile;
    }

    public void setSourcefile(String sourcefile) {
        this.sourcefile = sourcefile;
    }

    public Integer getSourceline() {
        return sourceline;
    }

    public void setSourceline(Integer sourceline) {
        this.sourceline = sourceline;
    }

    public Boolean getPendingRestart() {
        return pendingRestart;
    }

    public void setPendingRestart(Boolean pendingRestart) {
        this.pendingRestart = pendingRestart;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", name=").append(name);
        sb.append(", setting=").append(setting);
        sb.append(", unit=").append(unit);
        sb.append(", category=").append(category);
        sb.append(", shortDesc=").append(shortDesc);
        sb.append(", extraDesc=").append(extraDesc);
        sb.append(", context=").append(context);
        sb.append(", vartype=").append(vartype);
        sb.append(", source=").append(source);
        sb.append(", minVal=").append(minVal);
        sb.append(", maxVal=").append(maxVal);
        sb.append(", enumvals=").append(enumvals);
        sb.append(", bootVal=").append(bootVal);
        sb.append(", resetVal=").append(resetVal);
        sb.append(", sourcefile=").append(sourcefile);
        sb.append(", sourceline=").append(sourceline);
        sb.append(", pendingRestart=").append(pendingRestart);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}