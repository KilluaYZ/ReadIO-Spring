package com.pool.readio.mbg.model;

import java.io.Serializable;

public class ReferentialConstraints implements Serializable {
    private Object constraintCatalog;

    private Object constraintSchema;

    private Object constraintName;

    private Object uniqueConstraintCatalog;

    private Object uniqueConstraintSchema;

    private Object uniqueConstraintName;

    private Object matchOption;

    private Object updateRule;

    private Object deleteRule;

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

    public Object getUniqueConstraintCatalog() {
        return uniqueConstraintCatalog;
    }

    public void setUniqueConstraintCatalog(Object uniqueConstraintCatalog) {
        this.uniqueConstraintCatalog = uniqueConstraintCatalog;
    }

    public Object getUniqueConstraintSchema() {
        return uniqueConstraintSchema;
    }

    public void setUniqueConstraintSchema(Object uniqueConstraintSchema) {
        this.uniqueConstraintSchema = uniqueConstraintSchema;
    }

    public Object getUniqueConstraintName() {
        return uniqueConstraintName;
    }

    public void setUniqueConstraintName(Object uniqueConstraintName) {
        this.uniqueConstraintName = uniqueConstraintName;
    }

    public Object getMatchOption() {
        return matchOption;
    }

    public void setMatchOption(Object matchOption) {
        this.matchOption = matchOption;
    }

    public Object getUpdateRule() {
        return updateRule;
    }

    public void setUpdateRule(Object updateRule) {
        this.updateRule = updateRule;
    }

    public Object getDeleteRule() {
        return deleteRule;
    }

    public void setDeleteRule(Object deleteRule) {
        this.deleteRule = deleteRule;
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
        sb.append(", uniqueConstraintCatalog=").append(uniqueConstraintCatalog);
        sb.append(", uniqueConstraintSchema=").append(uniqueConstraintSchema);
        sb.append(", uniqueConstraintName=").append(uniqueConstraintName);
        sb.append(", matchOption=").append(matchOption);
        sb.append(", updateRule=").append(updateRule);
        sb.append(", deleteRule=").append(deleteRule);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}