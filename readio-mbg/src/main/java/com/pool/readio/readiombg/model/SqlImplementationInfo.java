package com.pool.readio.readiombg.model;

import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;

public class SqlImplementationInfo implements Serializable {
    private Object implementationInfoId;

    private Object implementationInfoName;

    private Object integerValue;

    private Object characterValue;

    private Object comments;

    private static final long serialVersionUID = 1L;

    public Object getImplementationInfoId() {
        return implementationInfoId;
    }

    public void setImplementationInfoId(Object implementationInfoId) {
        this.implementationInfoId = implementationInfoId;
    }

    public Object getImplementationInfoName() {
        return implementationInfoName;
    }

    public void setImplementationInfoName(Object implementationInfoName) {
        this.implementationInfoName = implementationInfoName;
    }

    public Object getIntegerValue() {
        return integerValue;
    }

    public void setIntegerValue(Object integerValue) {
        this.integerValue = integerValue;
    }

    public Object getCharacterValue() {
        return characterValue;
    }

    public void setCharacterValue(Object characterValue) {
        this.characterValue = characterValue;
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
        sb.append(", implementationInfoId=").append(implementationInfoId);
        sb.append(", implementationInfoName=").append(implementationInfoName);
        sb.append(", integerValue=").append(integerValue);
        sb.append(", characterValue=").append(characterValue);
        sb.append(", comments=").append(comments);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}