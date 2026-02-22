package com.pool.readio.readiombg.model;

import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;

public class PgHbaFileRules implements Serializable {
    private Integer ruleNumber;

    private String fileName;

    private Integer lineNumber;

    private String type;

    private Object database;

    private Object userName;

    private String address;

    private String netmask;

    private String authMethod;

    private Object options;

    private String error;

    private static final long serialVersionUID = 1L;

    public Integer getRuleNumber() {
        return ruleNumber;
    }

    public void setRuleNumber(Integer ruleNumber) {
        this.ruleNumber = ruleNumber;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public Integer getLineNumber() {
        return lineNumber;
    }

    public void setLineNumber(Integer lineNumber) {
        this.lineNumber = lineNumber;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Object getDatabase() {
        return database;
    }

    public void setDatabase(Object database) {
        this.database = database;
    }

    public Object getUserName() {
        return userName;
    }

    public void setUserName(Object userName) {
        this.userName = userName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getNetmask() {
        return netmask;
    }

    public void setNetmask(String netmask) {
        this.netmask = netmask;
    }

    public String getAuthMethod() {
        return authMethod;
    }

    public void setAuthMethod(String authMethod) {
        this.authMethod = authMethod;
    }

    public Object getOptions() {
        return options;
    }

    public void setOptions(Object options) {
        this.options = options;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", ruleNumber=").append(ruleNumber);
        sb.append(", fileName=").append(fileName);
        sb.append(", lineNumber=").append(lineNumber);
        sb.append(", type=").append(type);
        sb.append(", database=").append(database);
        sb.append(", userName=").append(userName);
        sb.append(", address=").append(address);
        sb.append(", netmask=").append(netmask);
        sb.append(", authMethod=").append(authMethod);
        sb.append(", options=").append(options);
        sb.append(", error=").append(error);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}