package com.pool.readio.readiombg.model;

import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;
import java.util.Date;

public class PgCursors implements Serializable {
    private String name;

    private String statement;

    private Boolean isHoldable;

    private Boolean isBinary;

    private Boolean isScrollable;

    private Date creationTime;

    private static final long serialVersionUID = 1L;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStatement() {
        return statement;
    }

    public void setStatement(String statement) {
        this.statement = statement;
    }

    public Boolean getIsHoldable() {
        return isHoldable;
    }

    public void setIsHoldable(Boolean isHoldable) {
        this.isHoldable = isHoldable;
    }

    public Boolean getIsBinary() {
        return isBinary;
    }

    public void setIsBinary(Boolean isBinary) {
        this.isBinary = isBinary;
    }

    public Boolean getIsScrollable() {
        return isScrollable;
    }

    public void setIsScrollable(Boolean isScrollable) {
        this.isScrollable = isScrollable;
    }

    public Date getCreationTime() {
        return creationTime;
    }

    public void setCreationTime(Date creationTime) {
        this.creationTime = creationTime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", name=").append(name);
        sb.append(", statement=").append(statement);
        sb.append(", isHoldable=").append(isHoldable);
        sb.append(", isBinary=").append(isBinary);
        sb.append(", isScrollable=").append(isScrollable);
        sb.append(", creationTime=").append(creationTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}