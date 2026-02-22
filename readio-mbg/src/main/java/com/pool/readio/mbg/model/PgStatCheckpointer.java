package com.pool.readio.mbg.model;

import java.io.Serializable;
import java.util.Date;

public class PgStatCheckpointer implements Serializable {
    private Long numTimed;

    private Long numRequested;

    private Long numDone;

    private Long restartpointsTimed;

    private Long restartpointsReq;

    private Long restartpointsDone;

    private Double writeTime;

    private Double syncTime;

    private Long buffersWritten;

    private Long slruWritten;

    private Date statsReset;

    private static final long serialVersionUID = 1L;

    public Long getNumTimed() {
        return numTimed;
    }

    public void setNumTimed(Long numTimed) {
        this.numTimed = numTimed;
    }

    public Long getNumRequested() {
        return numRequested;
    }

    public void setNumRequested(Long numRequested) {
        this.numRequested = numRequested;
    }

    public Long getNumDone() {
        return numDone;
    }

    public void setNumDone(Long numDone) {
        this.numDone = numDone;
    }

    public Long getRestartpointsTimed() {
        return restartpointsTimed;
    }

    public void setRestartpointsTimed(Long restartpointsTimed) {
        this.restartpointsTimed = restartpointsTimed;
    }

    public Long getRestartpointsReq() {
        return restartpointsReq;
    }

    public void setRestartpointsReq(Long restartpointsReq) {
        this.restartpointsReq = restartpointsReq;
    }

    public Long getRestartpointsDone() {
        return restartpointsDone;
    }

    public void setRestartpointsDone(Long restartpointsDone) {
        this.restartpointsDone = restartpointsDone;
    }

    public Double getWriteTime() {
        return writeTime;
    }

    public void setWriteTime(Double writeTime) {
        this.writeTime = writeTime;
    }

    public Double getSyncTime() {
        return syncTime;
    }

    public void setSyncTime(Double syncTime) {
        this.syncTime = syncTime;
    }

    public Long getBuffersWritten() {
        return buffersWritten;
    }

    public void setBuffersWritten(Long buffersWritten) {
        this.buffersWritten = buffersWritten;
    }

    public Long getSlruWritten() {
        return slruWritten;
    }

    public void setSlruWritten(Long slruWritten) {
        this.slruWritten = slruWritten;
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
        sb.append(", numTimed=").append(numTimed);
        sb.append(", numRequested=").append(numRequested);
        sb.append(", numDone=").append(numDone);
        sb.append(", restartpointsTimed=").append(restartpointsTimed);
        sb.append(", restartpointsReq=").append(restartpointsReq);
        sb.append(", restartpointsDone=").append(restartpointsDone);
        sb.append(", writeTime=").append(writeTime);
        sb.append(", syncTime=").append(syncTime);
        sb.append(", buffersWritten=").append(buffersWritten);
        sb.append(", slruWritten=").append(slruWritten);
        sb.append(", statsReset=").append(statsReset);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}