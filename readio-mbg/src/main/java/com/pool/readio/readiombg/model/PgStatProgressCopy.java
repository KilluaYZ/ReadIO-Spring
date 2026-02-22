package com.pool.readio.readiombg.model;

import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;

public class PgStatProgressCopy implements Serializable {
    private Integer pid;

    private Long datid;

    private String datname;

    private Long relid;

    private String command;

    private String type;

    private Long bytesProcessed;

    private Long bytesTotal;

    private Long tuplesProcessed;

    private Long tuplesExcluded;

    private Long tuplesSkipped;

    private static final long serialVersionUID = 1L;

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public Long getDatid() {
        return datid;
    }

    public void setDatid(Long datid) {
        this.datid = datid;
    }

    public String getDatname() {
        return datname;
    }

    public void setDatname(String datname) {
        this.datname = datname;
    }

    public Long getRelid() {
        return relid;
    }

    public void setRelid(Long relid) {
        this.relid = relid;
    }

    public String getCommand() {
        return command;
    }

    public void setCommand(String command) {
        this.command = command;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Long getBytesProcessed() {
        return bytesProcessed;
    }

    public void setBytesProcessed(Long bytesProcessed) {
        this.bytesProcessed = bytesProcessed;
    }

    public Long getBytesTotal() {
        return bytesTotal;
    }

    public void setBytesTotal(Long bytesTotal) {
        this.bytesTotal = bytesTotal;
    }

    public Long getTuplesProcessed() {
        return tuplesProcessed;
    }

    public void setTuplesProcessed(Long tuplesProcessed) {
        this.tuplesProcessed = tuplesProcessed;
    }

    public Long getTuplesExcluded() {
        return tuplesExcluded;
    }

    public void setTuplesExcluded(Long tuplesExcluded) {
        this.tuplesExcluded = tuplesExcluded;
    }

    public Long getTuplesSkipped() {
        return tuplesSkipped;
    }

    public void setTuplesSkipped(Long tuplesSkipped) {
        this.tuplesSkipped = tuplesSkipped;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", pid=").append(pid);
        sb.append(", datid=").append(datid);
        sb.append(", datname=").append(datname);
        sb.append(", relid=").append(relid);
        sb.append(", command=").append(command);
        sb.append(", type=").append(type);
        sb.append(", bytesProcessed=").append(bytesProcessed);
        sb.append(", bytesTotal=").append(bytesTotal);
        sb.append(", tuplesProcessed=").append(tuplesProcessed);
        sb.append(", tuplesExcluded=").append(tuplesExcluded);
        sb.append(", tuplesSkipped=").append(tuplesSkipped);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}