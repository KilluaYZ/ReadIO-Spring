package com.pool.readio.readiombg.model;

import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;

public class PgIndex implements Serializable {
    private Long indexrelid;

    private Long indrelid;

    private Short indnatts;

    private Short indnkeyatts;

    private Boolean indisunique;

    private Boolean indnullsnotdistinct;

    private Boolean indisprimary;

    private Boolean indisexclusion;

    private Boolean indimmediate;

    private Boolean indisclustered;

    private Boolean indisvalid;

    private Boolean indcheckxmin;

    private Boolean indisready;

    private Boolean indislive;

    private Boolean indisreplident;

    private Object indkey;

    private Object indcollation;

    private Object indclass;

    private Object indoption;

    private Object indexprs;

    private Object indpred;

    private static final long serialVersionUID = 1L;

    public Long getIndexrelid() {
        return indexrelid;
    }

    public void setIndexrelid(Long indexrelid) {
        this.indexrelid = indexrelid;
    }

    public Long getIndrelid() {
        return indrelid;
    }

    public void setIndrelid(Long indrelid) {
        this.indrelid = indrelid;
    }

    public Short getIndnatts() {
        return indnatts;
    }

    public void setIndnatts(Short indnatts) {
        this.indnatts = indnatts;
    }

    public Short getIndnkeyatts() {
        return indnkeyatts;
    }

    public void setIndnkeyatts(Short indnkeyatts) {
        this.indnkeyatts = indnkeyatts;
    }

    public Boolean getIndisunique() {
        return indisunique;
    }

    public void setIndisunique(Boolean indisunique) {
        this.indisunique = indisunique;
    }

    public Boolean getIndnullsnotdistinct() {
        return indnullsnotdistinct;
    }

    public void setIndnullsnotdistinct(Boolean indnullsnotdistinct) {
        this.indnullsnotdistinct = indnullsnotdistinct;
    }

    public Boolean getIndisprimary() {
        return indisprimary;
    }

    public void setIndisprimary(Boolean indisprimary) {
        this.indisprimary = indisprimary;
    }

    public Boolean getIndisexclusion() {
        return indisexclusion;
    }

    public void setIndisexclusion(Boolean indisexclusion) {
        this.indisexclusion = indisexclusion;
    }

    public Boolean getIndimmediate() {
        return indimmediate;
    }

    public void setIndimmediate(Boolean indimmediate) {
        this.indimmediate = indimmediate;
    }

    public Boolean getIndisclustered() {
        return indisclustered;
    }

    public void setIndisclustered(Boolean indisclustered) {
        this.indisclustered = indisclustered;
    }

    public Boolean getIndisvalid() {
        return indisvalid;
    }

    public void setIndisvalid(Boolean indisvalid) {
        this.indisvalid = indisvalid;
    }

    public Boolean getIndcheckxmin() {
        return indcheckxmin;
    }

    public void setIndcheckxmin(Boolean indcheckxmin) {
        this.indcheckxmin = indcheckxmin;
    }

    public Boolean getIndisready() {
        return indisready;
    }

    public void setIndisready(Boolean indisready) {
        this.indisready = indisready;
    }

    public Boolean getIndislive() {
        return indislive;
    }

    public void setIndislive(Boolean indislive) {
        this.indislive = indislive;
    }

    public Boolean getIndisreplident() {
        return indisreplident;
    }

    public void setIndisreplident(Boolean indisreplident) {
        this.indisreplident = indisreplident;
    }

    public Object getIndkey() {
        return indkey;
    }

    public void setIndkey(Object indkey) {
        this.indkey = indkey;
    }

    public Object getIndcollation() {
        return indcollation;
    }

    public void setIndcollation(Object indcollation) {
        this.indcollation = indcollation;
    }

    public Object getIndclass() {
        return indclass;
    }

    public void setIndclass(Object indclass) {
        this.indclass = indclass;
    }

    public Object getIndoption() {
        return indoption;
    }

    public void setIndoption(Object indoption) {
        this.indoption = indoption;
    }

    public Object getIndexprs() {
        return indexprs;
    }

    public void setIndexprs(Object indexprs) {
        this.indexprs = indexprs;
    }

    public Object getIndpred() {
        return indpred;
    }

    public void setIndpred(Object indpred) {
        this.indpred = indpred;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", indexrelid=").append(indexrelid);
        sb.append(", indrelid=").append(indrelid);
        sb.append(", indnatts=").append(indnatts);
        sb.append(", indnkeyatts=").append(indnkeyatts);
        sb.append(", indisunique=").append(indisunique);
        sb.append(", indnullsnotdistinct=").append(indnullsnotdistinct);
        sb.append(", indisprimary=").append(indisprimary);
        sb.append(", indisexclusion=").append(indisexclusion);
        sb.append(", indimmediate=").append(indimmediate);
        sb.append(", indisclustered=").append(indisclustered);
        sb.append(", indisvalid=").append(indisvalid);
        sb.append(", indcheckxmin=").append(indcheckxmin);
        sb.append(", indisready=").append(indisready);
        sb.append(", indislive=").append(indislive);
        sb.append(", indisreplident=").append(indisreplident);
        sb.append(", indkey=").append(indkey);
        sb.append(", indcollation=").append(indcollation);
        sb.append(", indclass=").append(indclass);
        sb.append(", indoption=").append(indoption);
        sb.append(", indexprs=").append(indexprs);
        sb.append(", indpred=").append(indpred);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}