package com.pool.readio.mbg.model;

import java.io.Serializable;

public class PgPartitionedTable implements Serializable {
    private Long partrelid;

    private String partstrat;

    private Short partnatts;

    private Long partdefid;

    private Object partattrs;

    private Object partclass;

    private Object partcollation;

    private Object partexprs;

    private static final long serialVersionUID = 1L;

    public Long getPartrelid() {
        return partrelid;
    }

    public void setPartrelid(Long partrelid) {
        this.partrelid = partrelid;
    }

    public String getPartstrat() {
        return partstrat;
    }

    public void setPartstrat(String partstrat) {
        this.partstrat = partstrat;
    }

    public Short getPartnatts() {
        return partnatts;
    }

    public void setPartnatts(Short partnatts) {
        this.partnatts = partnatts;
    }

    public Long getPartdefid() {
        return partdefid;
    }

    public void setPartdefid(Long partdefid) {
        this.partdefid = partdefid;
    }

    public Object getPartattrs() {
        return partattrs;
    }

    public void setPartattrs(Object partattrs) {
        this.partattrs = partattrs;
    }

    public Object getPartclass() {
        return partclass;
    }

    public void setPartclass(Object partclass) {
        this.partclass = partclass;
    }

    public Object getPartcollation() {
        return partcollation;
    }

    public void setPartcollation(Object partcollation) {
        this.partcollation = partcollation;
    }

    public Object getPartexprs() {
        return partexprs;
    }

    public void setPartexprs(Object partexprs) {
        this.partexprs = partexprs;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", partrelid=").append(partrelid);
        sb.append(", partstrat=").append(partstrat);
        sb.append(", partnatts=").append(partnatts);
        sb.append(", partdefid=").append(partdefid);
        sb.append(", partattrs=").append(partattrs);
        sb.append(", partclass=").append(partclass);
        sb.append(", partcollation=").append(partcollation);
        sb.append(", partexprs=").append(partexprs);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}