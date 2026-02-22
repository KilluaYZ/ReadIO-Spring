package com.pool.readio.mbg.model;

import java.io.Serializable;

public class PgShmemAllocations implements Serializable {
    private String name;

    private Long off;

    private Long size;

    private Long allocatedSize;

    private static final long serialVersionUID = 1L;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getOff() {
        return off;
    }

    public void setOff(Long off) {
        this.off = off;
    }

    public Long getSize() {
        return size;
    }

    public void setSize(Long size) {
        this.size = size;
    }

    public Long getAllocatedSize() {
        return allocatedSize;
    }

    public void setAllocatedSize(Long allocatedSize) {
        this.allocatedSize = allocatedSize;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", name=").append(name);
        sb.append(", off=").append(off);
        sb.append(", size=").append(size);
        sb.append(", allocatedSize=").append(allocatedSize);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}