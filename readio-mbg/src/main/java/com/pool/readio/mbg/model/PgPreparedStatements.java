package com.pool.readio.mbg.model;

import java.io.Serializable;
import java.util.Date;

public class PgPreparedStatements implements Serializable {
    private String name;

    private String statement;

    private Date prepareTime;

    private Object parameterTypes;

    private Object resultTypes;

    private Boolean fromSql;

    private Long genericPlans;

    private Long customPlans;

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

    public Date getPrepareTime() {
        return prepareTime;
    }

    public void setPrepareTime(Date prepareTime) {
        this.prepareTime = prepareTime;
    }

    public Object getParameterTypes() {
        return parameterTypes;
    }

    public void setParameterTypes(Object parameterTypes) {
        this.parameterTypes = parameterTypes;
    }

    public Object getResultTypes() {
        return resultTypes;
    }

    public void setResultTypes(Object resultTypes) {
        this.resultTypes = resultTypes;
    }

    public Boolean getFromSql() {
        return fromSql;
    }

    public void setFromSql(Boolean fromSql) {
        this.fromSql = fromSql;
    }

    public Long getGenericPlans() {
        return genericPlans;
    }

    public void setGenericPlans(Long genericPlans) {
        this.genericPlans = genericPlans;
    }

    public Long getCustomPlans() {
        return customPlans;
    }

    public void setCustomPlans(Long customPlans) {
        this.customPlans = customPlans;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", name=").append(name);
        sb.append(", statement=").append(statement);
        sb.append(", prepareTime=").append(prepareTime);
        sb.append(", parameterTypes=").append(parameterTypes);
        sb.append(", resultTypes=").append(resultTypes);
        sb.append(", fromSql=").append(fromSql);
        sb.append(", genericPlans=").append(genericPlans);
        sb.append(", customPlans=").append(customPlans);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}