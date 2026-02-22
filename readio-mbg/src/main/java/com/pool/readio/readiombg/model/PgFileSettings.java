package com.pool.readio.readiombg.model;

import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;

public class PgFileSettings implements Serializable {
    private String sourcefile;

    private Integer sourceline;

    private Integer seqno;

    private String name;

    private String setting;

    private Boolean applied;

    private String error;

    private static final long serialVersionUID = 1L;

    public String getSourcefile() {
        return sourcefile;
    }

    public void setSourcefile(String sourcefile) {
        this.sourcefile = sourcefile;
    }

    public Integer getSourceline() {
        return sourceline;
    }

    public void setSourceline(Integer sourceline) {
        this.sourceline = sourceline;
    }

    public Integer getSeqno() {
        return seqno;
    }

    public void setSeqno(Integer seqno) {
        this.seqno = seqno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSetting() {
        return setting;
    }

    public void setSetting(String setting) {
        this.setting = setting;
    }

    public Boolean getApplied() {
        return applied;
    }

    public void setApplied(Boolean applied) {
        this.applied = applied;
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
        sb.append(", sourcefile=").append(sourcefile);
        sb.append(", sourceline=").append(sourceline);
        sb.append(", seqno=").append(seqno);
        sb.append(", name=").append(name);
        sb.append(", setting=").append(setting);
        sb.append(", applied=").append(applied);
        sb.append(", error=").append(error);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}