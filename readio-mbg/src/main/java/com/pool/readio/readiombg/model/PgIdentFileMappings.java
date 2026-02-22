package com.pool.readio.readiombg.model;

import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;

public class PgIdentFileMappings implements Serializable {
    private Integer mapNumber;

    private String fileName;

    private Integer lineNumber;

    private String mapName;

    private String sysName;

    private String pgUsername;

    private String error;

    private static final long serialVersionUID = 1L;

    public Integer getMapNumber() {
        return mapNumber;
    }

    public void setMapNumber(Integer mapNumber) {
        this.mapNumber = mapNumber;
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

    public String getMapName() {
        return mapName;
    }

    public void setMapName(String mapName) {
        this.mapName = mapName;
    }

    public String getSysName() {
        return sysName;
    }

    public void setSysName(String sysName) {
        this.sysName = sysName;
    }

    public String getPgUsername() {
        return pgUsername;
    }

    public void setPgUsername(String pgUsername) {
        this.pgUsername = pgUsername;
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
        sb.append(", mapNumber=").append(mapNumber);
        sb.append(", fileName=").append(fileName);
        sb.append(", lineNumber=").append(lineNumber);
        sb.append(", mapName=").append(mapName);
        sb.append(", sysName=").append(sysName);
        sb.append(", pgUsername=").append(pgUsername);
        sb.append(", error=").append(error);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}