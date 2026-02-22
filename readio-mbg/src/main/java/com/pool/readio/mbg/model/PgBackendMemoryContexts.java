package com.pool.readio.mbg.model;

import java.io.Serializable;

public class PgBackendMemoryContexts implements Serializable {
    private String name;

    private String ident;

    private String type;

    private Integer level;

    private Object path;

    private Long totalBytes;

    private Long totalNblocks;

    private Long freeBytes;

    private Long freeChunks;

    private Long usedBytes;

    private static final long serialVersionUID = 1L;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIdent() {
        return ident;
    }

    public void setIdent(String ident) {
        this.ident = ident;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public Object getPath() {
        return path;
    }

    public void setPath(Object path) {
        this.path = path;
    }

    public Long getTotalBytes() {
        return totalBytes;
    }

    public void setTotalBytes(Long totalBytes) {
        this.totalBytes = totalBytes;
    }

    public Long getTotalNblocks() {
        return totalNblocks;
    }

    public void setTotalNblocks(Long totalNblocks) {
        this.totalNblocks = totalNblocks;
    }

    public Long getFreeBytes() {
        return freeBytes;
    }

    public void setFreeBytes(Long freeBytes) {
        this.freeBytes = freeBytes;
    }

    public Long getFreeChunks() {
        return freeChunks;
    }

    public void setFreeChunks(Long freeChunks) {
        this.freeChunks = freeChunks;
    }

    public Long getUsedBytes() {
        return usedBytes;
    }

    public void setUsedBytes(Long usedBytes) {
        this.usedBytes = usedBytes;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", name=").append(name);
        sb.append(", ident=").append(ident);
        sb.append(", type=").append(type);
        sb.append(", level=").append(level);
        sb.append(", path=").append(path);
        sb.append(", totalBytes=").append(totalBytes);
        sb.append(", totalNblocks=").append(totalNblocks);
        sb.append(", freeBytes=").append(freeBytes);
        sb.append(", freeChunks=").append(freeChunks);
        sb.append(", usedBytes=").append(usedBytes);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}