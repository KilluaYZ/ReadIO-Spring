package com.pool.readio.mbg.model;

import java.io.Serializable;

public class SqlSizing implements Serializable {
    private Object sizingId;

    private Object sizingName;

    private Object supportedValue;

    private Object comments;

    private static final long serialVersionUID = 1L;

    public Object getSizingId() {
        return sizingId;
    }

    public void setSizingId(Object sizingId) {
        this.sizingId = sizingId;
    }

    public Object getSizingName() {
        return sizingName;
    }

    public void setSizingName(Object sizingName) {
        this.sizingName = sizingName;
    }

    public Object getSupportedValue() {
        return supportedValue;
    }

    public void setSupportedValue(Object supportedValue) {
        this.supportedValue = supportedValue;
    }

    public Object getComments() {
        return comments;
    }

    public void setComments(Object comments) {
        this.comments = comments;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", sizingId=").append(sizingId);
        sb.append(", sizingName=").append(sizingName);
        sb.append(", supportedValue=").append(supportedValue);
        sb.append(", comments=").append(comments);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}