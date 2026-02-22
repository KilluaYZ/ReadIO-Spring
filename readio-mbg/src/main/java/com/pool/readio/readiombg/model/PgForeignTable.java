package com.pool.readio.readiombg.model;

import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;

public class PgForeignTable implements Serializable {
    private Long ftrelid;

    private Long ftserver;

    private Object ftoptions;

    private static final long serialVersionUID = 1L;

    public Long getFtrelid() {
        return ftrelid;
    }

    public void setFtrelid(Long ftrelid) {
        this.ftrelid = ftrelid;
    }

    public Long getFtserver() {
        return ftserver;
    }

    public void setFtserver(Long ftserver) {
        this.ftserver = ftserver;
    }

    public Object getFtoptions() {
        return ftoptions;
    }

    public void setFtoptions(Object ftoptions) {
        this.ftoptions = ftoptions;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", ftrelid=").append(ftrelid);
        sb.append(", ftserver=").append(ftserver);
        sb.append(", ftoptions=").append(ftoptions);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}