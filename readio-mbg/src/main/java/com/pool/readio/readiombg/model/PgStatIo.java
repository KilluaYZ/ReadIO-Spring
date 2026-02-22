package com.pool.readio.readiombg.model;

import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;
import java.util.Date;

public class PgStatIo implements Serializable {
    private String backendType;

    private String object;

    private String context;

    private Long reads;

    private Short readBytes;

    private Double readTime;

    private Long writes;

    private Short writeBytes;

    private Double writeTime;

    private Long writebacks;

    private Double writebackTime;

    private Long extends;

    private Short extendBytes;

    private Double extendTime;

    private Long hits;

    private Long evictions;

    private Long reuses;

    private Long fsyncs;

    private Double fsyncTime;

    private Date statsReset;

    private static final long serialVersionUID = 1L;

    public String getBackendType() {
        return backendType;
    }

    public void setBackendType(String backendType) {
        this.backendType = backendType;
    }

    public String getObject() {
        return object;
    }

    public void setObject(String object) {
        this.object = object;
    }

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }

    public Long getReads() {
        return reads;
    }

    public void setReads(Long reads) {
        this.reads = reads;
    }

    public Short getReadBytes() {
        return readBytes;
    }

    public void setReadBytes(Short readBytes) {
        this.readBytes = readBytes;
    }

    public Double getReadTime() {
        return readTime;
    }

    public void setReadTime(Double readTime) {
        this.readTime = readTime;
    }

    public Long getWrites() {
        return writes;
    }

    public void setWrites(Long writes) {
        this.writes = writes;
    }

    public Short getWriteBytes() {
        return writeBytes;
    }

    public void setWriteBytes(Short writeBytes) {
        this.writeBytes = writeBytes;
    }

    public Double getWriteTime() {
        return writeTime;
    }

    public void setWriteTime(Double writeTime) {
        this.writeTime = writeTime;
    }

    public Long getWritebacks() {
        return writebacks;
    }

    public void setWritebacks(Long writebacks) {
        this.writebacks = writebacks;
    }

    public Double getWritebackTime() {
        return writebackTime;
    }

    public void setWritebackTime(Double writebackTime) {
        this.writebackTime = writebackTime;
    }

    public Long getExtends() {
        return extends;
    }

    public void setExtends(Long extends) {
        this.extends = extends;
    }

    public Short getExtendBytes() {
        return extendBytes;
    }

    public void setExtendBytes(Short extendBytes) {
        this.extendBytes = extendBytes;
    }

    public Double getExtendTime() {
        return extendTime;
    }

    public void setExtendTime(Double extendTime) {
        this.extendTime = extendTime;
    }

    public Long getHits() {
        return hits;
    }

    public void setHits(Long hits) {
        this.hits = hits;
    }

    public Long getEvictions() {
        return evictions;
    }

    public void setEvictions(Long evictions) {
        this.evictions = evictions;
    }

    public Long getReuses() {
        return reuses;
    }

    public void setReuses(Long reuses) {
        this.reuses = reuses;
    }

    public Long getFsyncs() {
        return fsyncs;
    }

    public void setFsyncs(Long fsyncs) {
        this.fsyncs = fsyncs;
    }

    public Double getFsyncTime() {
        return fsyncTime;
    }

    public void setFsyncTime(Double fsyncTime) {
        this.fsyncTime = fsyncTime;
    }

    public Date getStatsReset() {
        return statsReset;
    }

    public void setStatsReset(Date statsReset) {
        this.statsReset = statsReset;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", backendType=").append(backendType);
        sb.append(", object=").append(object);
        sb.append(", context=").append(context);
        sb.append(", reads=").append(reads);
        sb.append(", readBytes=").append(readBytes);
        sb.append(", readTime=").append(readTime);
        sb.append(", writes=").append(writes);
        sb.append(", writeBytes=").append(writeBytes);
        sb.append(", writeTime=").append(writeTime);
        sb.append(", writebacks=").append(writebacks);
        sb.append(", writebackTime=").append(writebackTime);
        sb.append(", extends=").append(extends);
        sb.append(", extendBytes=").append(extendBytes);
        sb.append(", extendTime=").append(extendTime);
        sb.append(", hits=").append(hits);
        sb.append(", evictions=").append(evictions);
        sb.append(", reuses=").append(reuses);
        sb.append(", fsyncs=").append(fsyncs);
        sb.append(", fsyncTime=").append(fsyncTime);
        sb.append(", statsReset=").append(statsReset);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}