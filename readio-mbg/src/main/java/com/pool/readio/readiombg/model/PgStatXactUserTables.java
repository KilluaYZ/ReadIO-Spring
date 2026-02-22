package com.pool.readio.readiombg.model;

import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;

public class PgStatXactUserTables implements Serializable {
    private Long relid;

    private String schemaname;

    private String relname;

    private Long seqScan;

    private Long seqTupRead;

    private Long idxScan;

    private Long idxTupFetch;

    private Long nTupIns;

    private Long nTupUpd;

    private Long nTupDel;

    private Long nTupHotUpd;

    private Long nTupNewpageUpd;

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
        sb.append(", seqTupRead=").append(seqTupRead);
        sb.append(", idxScan=").append(idxScan);
        sb.append(", idxTupFetch=").append(idxTupFetch);
        sb.append(", nTupIns=").append(nTupIns);
        sb.append(", nTupUpd=").append(nTupUpd);
        sb.append(", nTupDel=").append(nTupDel);
        sb.append(", nTupHotUpd=").append(nTupHotUpd);
        sb.append(", nTupNewpageUpd=").append(nTupNewpageUpd);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}