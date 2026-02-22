package com.pool.readio.readiombg.model;

import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;

public class PgAios implements Serializable {
    private Integer pid;

    private Integer ioId;

    private Long ioGeneration;

    private String state;

    private String operation;

    private Long off;

    private Long length;

    private String target;

    private Short handleDataLen;

    private Integer rawResult;

    private String result;

    private String targetDesc;

    private Boolean fSync;

    private Boolean fLocalmem;

    private Boolean fBuffered;

    private static final long serialVersionUID = 1L;

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public Integer getIoId() {
        return ioId;
    }

    public void setIoId(Integer ioId) {
        this.ioId = ioId;
    }

    public Long getIoGeneration() {
        return ioGeneration;
    }

    public void setIoGeneration(Long ioGeneration) {
        this.ioGeneration = ioGeneration;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public Long getOff() {
        return off;
    }

    public void setOff(Long off) {
        this.off = off;
    }

    public Long getLength() {
        return length;
    }

    public void setLength(Long length) {
        this.length = length;
    }

    public String getTarget() {
        return target;
    }

    public void setTarget(String target) {
        this.target = target;
    }

    public Short getHandleDataLen() {
        return handleDataLen;
    }

    public void setHandleDataLen(Short handleDataLen) {
        this.handleDataLen = handleDataLen;
    }

    public Integer getRawResult() {
        return rawResult;
    }

    public void setRawResult(Integer rawResult) {
        this.rawResult = rawResult;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public String getTargetDesc() {
        return targetDesc;
    }

    public void setTargetDesc(String targetDesc) {
        this.targetDesc = targetDesc;
    }

    public Boolean getfSync() {
        return fSync;
    }

    public void setfSync(Boolean fSync) {
        this.fSync = fSync;
    }

    public Boolean getfLocalmem() {
        return fLocalmem;
    }

    public void setfLocalmem(Boolean fLocalmem) {
        this.fLocalmem = fLocalmem;
    }

    public Boolean getfBuffered() {
        return fBuffered;
    }

    public void setfBuffered(Boolean fBuffered) {
        this.fBuffered = fBuffered;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", pid=").append(pid);
        sb.append(", ioId=").append(ioId);
        sb.append(", ioGeneration=").append(ioGeneration);
        sb.append(", state=").append(state);
        sb.append(", operation=").append(operation);
        sb.append(", off=").append(off);
        sb.append(", length=").append(length);
        sb.append(", target=").append(target);
        sb.append(", handleDataLen=").append(handleDataLen);
        sb.append(", rawResult=").append(rawResult);
        sb.append(", result=").append(result);
        sb.append(", targetDesc=").append(targetDesc);
        sb.append(", fSync=").append(fSync);
        sb.append(", fLocalmem=").append(fLocalmem);
        sb.append(", fBuffered=").append(fBuffered);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}