package com.pool.readio.mbg.model;

import java.io.Serializable;
import java.util.Date;

public class PgStatAllTables implements Serializable {
    private Long relid;

    private String schemaname;

    private String relname;

    private Long seqScan;

    private Date lastSeqScan;

    private Long seqTupRead;

    private Long idxScan;

    private Date lastIdxScan;

    private Long idxTupFetch;

    private Long nTupIns;

    private Long nTupUpd;

    private Long nTupDel;

    private Long nTupHotUpd;

    private Long nTupNewpageUpd;

    private Long nLiveTup;

    private Long nDeadTup;

    private Long nModSinceAnalyze;

    private Long nInsSinceVacuum;

    private Date lastVacuum;

    private Date lastAutovacuum;

    private Date lastAnalyze;

    private Date lastAutoanalyze;

    private Long vacuumCount;

    private Long autovacuumCount;

    private Long analyzeCount;

    private Long autoanalyzeCount;

    private Double totalVacuumTime;

    private Double totalAutovacuumTime;

    private Double totalAnalyzeTime;

    private Double totalAutoanalyzeTime;

    private static final long serialVersionUID = 1L;

    public Long getRelid() {
        return relid;
    }

    public void setRelid(Long relid) {
        this.relid = relid;
    }

    public String getSchemaname() {
        return schemaname;
    }

    public void setSchemaname(String schemaname) {
        this.schemaname = schemaname;
    }

    public String getRelname() {
        return relname;
    }

    public void setRelname(String relname) {
        this.relname = relname;
    }

    public Long getSeqScan() {
        return seqScan;
    }

    public void setSeqScan(Long seqScan) {
        this.seqScan = seqScan;
    }

    public Date getLastSeqScan() {
        return lastSeqScan;
    }

    public void setLastSeqScan(Date lastSeqScan) {
        this.lastSeqScan = lastSeqScan;
    }

    public Long getSeqTupRead() {
        return seqTupRead;
    }

    public void setSeqTupRead(Long seqTupRead) {
        this.seqTupRead = seqTupRead;
    }

    public Long getIdxScan() {
        return idxScan;
    }

    public void setIdxScan(Long idxScan) {
        this.idxScan = idxScan;
    }

    public Date getLastIdxScan() {
        return lastIdxScan;
    }

    public void setLastIdxScan(Date lastIdxScan) {
        this.lastIdxScan = lastIdxScan;
    }

    public Long getIdxTupFetch() {
        return idxTupFetch;
    }

    public void setIdxTupFetch(Long idxTupFetch) {
        this.idxTupFetch = idxTupFetch;
    }

    public Long getnTupIns() {
        return nTupIns;
    }

    public void setnTupIns(Long nTupIns) {
        this.nTupIns = nTupIns;
    }

    public Long getnTupUpd() {
        return nTupUpd;
    }

    public void setnTupUpd(Long nTupUpd) {
        this.nTupUpd = nTupUpd;
    }

    public Long getnTupDel() {
        return nTupDel;
    }

    public void setnTupDel(Long nTupDel) {
        this.nTupDel = nTupDel;
    }

    public Long getnTupHotUpd() {
        return nTupHotUpd;
    }

    public void setnTupHotUpd(Long nTupHotUpd) {
        this.nTupHotUpd = nTupHotUpd;
    }

    public Long getnTupNewpageUpd() {
        return nTupNewpageUpd;
    }

    public void setnTupNewpageUpd(Long nTupNewpageUpd) {
        this.nTupNewpageUpd = nTupNewpageUpd;
    }

    public Long getnLiveTup() {
        return nLiveTup;
    }

    public void setnLiveTup(Long nLiveTup) {
        this.nLiveTup = nLiveTup;
    }

    public Long getnDeadTup() {
        return nDeadTup;
    }

    public void setnDeadTup(Long nDeadTup) {
        this.nDeadTup = nDeadTup;
    }

    public Long getnModSinceAnalyze() {
        return nModSinceAnalyze;
    }

    public void setnModSinceAnalyze(Long nModSinceAnalyze) {
        this.nModSinceAnalyze = nModSinceAnalyze;
    }

    public Long getnInsSinceVacuum() {
        return nInsSinceVacuum;
    }

    public void setnInsSinceVacuum(Long nInsSinceVacuum) {
        this.nInsSinceVacuum = nInsSinceVacuum;
    }

    public Date getLastVacuum() {
        return lastVacuum;
    }

    public void setLastVacuum(Date lastVacuum) {
        this.lastVacuum = lastVacuum;
    }

    public Date getLastAutovacuum() {
        return lastAutovacuum;
    }

    public void setLastAutovacuum(Date lastAutovacuum) {
        this.lastAutovacuum = lastAutovacuum;
    }

    public Date getLastAnalyze() {
        return lastAnalyze;
    }

    public void setLastAnalyze(Date lastAnalyze) {
        this.lastAnalyze = lastAnalyze;
    }

    public Date getLastAutoanalyze() {
        return lastAutoanalyze;
    }

    public void setLastAutoanalyze(Date lastAutoanalyze) {
        this.lastAutoanalyze = lastAutoanalyze;
    }

    public Long getVacuumCount() {
        return vacuumCount;
    }

    public void setVacuumCount(Long vacuumCount) {
        this.vacuumCount = vacuumCount;
    }

    public Long getAutovacuumCount() {
        return autovacuumCount;
    }

    public void setAutovacuumCount(Long autovacuumCount) {
        this.autovacuumCount = autovacuumCount;
    }

    public Long getAnalyzeCount() {
        return analyzeCount;
    }

    public void setAnalyzeCount(Long analyzeCount) {
        this.analyzeCount = analyzeCount;
    }

    public Long getAutoanalyzeCount() {
        return autoanalyzeCount;
    }

    public void setAutoanalyzeCount(Long autoanalyzeCount) {
        this.autoanalyzeCount = autoanalyzeCount;
    }

    public Double getTotalVacuumTime() {
        return totalVacuumTime;
    }

    public void setTotalVacuumTime(Double totalVacuumTime) {
        this.totalVacuumTime = totalVacuumTime;
    }

    public Double getTotalAutovacuumTime() {
        return totalAutovacuumTime;
    }

    public void setTotalAutovacuumTime(Double totalAutovacuumTime) {
        this.totalAutovacuumTime = totalAutovacuumTime;
    }

    public Double getTotalAnalyzeTime() {
        return totalAnalyzeTime;
    }

    public void setTotalAnalyzeTime(Double totalAnalyzeTime) {
        this.totalAnalyzeTime = totalAnalyzeTime;
    }

    public Double getTotalAutoanalyzeTime() {
        return totalAutoanalyzeTime;
    }

    public void setTotalAutoanalyzeTime(Double totalAutoanalyzeTime) {
        this.totalAutoanalyzeTime = totalAutoanalyzeTime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", relid=").append(relid);
        sb.append(", schemaname=").append(schemaname);
        sb.append(", relname=").append(relname);
        sb.append(", seqScan=").append(seqScan);
        sb.append(", lastSeqScan=").append(lastSeqScan);
        sb.append(", seqTupRead=").append(seqTupRead);
        sb.append(", idxScan=").append(idxScan);
        sb.append(", lastIdxScan=").append(lastIdxScan);
        sb.append(", idxTupFetch=").append(idxTupFetch);
        sb.append(", nTupIns=").append(nTupIns);
        sb.append(", nTupUpd=").append(nTupUpd);
        sb.append(", nTupDel=").append(nTupDel);
        sb.append(", nTupHotUpd=").append(nTupHotUpd);
        sb.append(", nTupNewpageUpd=").append(nTupNewpageUpd);
        sb.append(", nLiveTup=").append(nLiveTup);
        sb.append(", nDeadTup=").append(nDeadTup);
        sb.append(", nModSinceAnalyze=").append(nModSinceAnalyze);
        sb.append(", nInsSinceVacuum=").append(nInsSinceVacuum);
        sb.append(", lastVacuum=").append(lastVacuum);
        sb.append(", lastAutovacuum=").append(lastAutovacuum);
        sb.append(", lastAnalyze=").append(lastAnalyze);
        sb.append(", lastAutoanalyze=").append(lastAutoanalyze);
        sb.append(", vacuumCount=").append(vacuumCount);
        sb.append(", autovacuumCount=").append(autovacuumCount);
        sb.append(", analyzeCount=").append(analyzeCount);
        sb.append(", autoanalyzeCount=").append(autoanalyzeCount);
        sb.append(", totalVacuumTime=").append(totalVacuumTime);
        sb.append(", totalAutovacuumTime=").append(totalAutovacuumTime);
        sb.append(", totalAnalyzeTime=").append(totalAnalyzeTime);
        sb.append(", totalAutoanalyzeTime=").append(totalAutoanalyzeTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}