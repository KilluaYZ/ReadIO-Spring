package com.pool.readio.readiombg.model;

import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;

public class PgAggregate implements Serializable {
    private Object aggfnoid;

    private String aggkind;

    private Short aggnumdirectargs;

    private Object aggtransfn;

    private Object aggfinalfn;

    private Object aggcombinefn;

    private Object aggserialfn;

    private Object aggdeserialfn;

    private Object aggmtransfn;

    private Object aggminvtransfn;

    private Object aggmfinalfn;

    private Boolean aggfinalextra;

    private Boolean aggmfinalextra;

    private String aggfinalmodify;

    private String aggmfinalmodify;

    private Long aggsortop;

    private Long aggtranstype;

    private Integer aggtransspace;

    private Long aggmtranstype;

    private Integer aggmtransspace;

    private String agginitval;

    private String aggminitval;

    private static final long serialVersionUID = 1L;

    public Object getAggfnoid() {
        return aggfnoid;
    }

    public void setAggfnoid(Object aggfnoid) {
        this.aggfnoid = aggfnoid;
    }

    public String getAggkind() {
        return aggkind;
    }

    public void setAggkind(String aggkind) {
        this.aggkind = aggkind;
    }

    public Short getAggnumdirectargs() {
        return aggnumdirectargs;
    }

    public void setAggnumdirectargs(Short aggnumdirectargs) {
        this.aggnumdirectargs = aggnumdirectargs;
    }

    public Object getAggtransfn() {
        return aggtransfn;
    }

    public void setAggtransfn(Object aggtransfn) {
        this.aggtransfn = aggtransfn;
    }

    public Object getAggfinalfn() {
        return aggfinalfn;
    }

    public void setAggfinalfn(Object aggfinalfn) {
        this.aggfinalfn = aggfinalfn;
    }

    public Object getAggcombinefn() {
        return aggcombinefn;
    }

    public void setAggcombinefn(Object aggcombinefn) {
        this.aggcombinefn = aggcombinefn;
    }

    public Object getAggserialfn() {
        return aggserialfn;
    }

    public void setAggserialfn(Object aggserialfn) {
        this.aggserialfn = aggserialfn;
    }

    public Object getAggdeserialfn() {
        return aggdeserialfn;
    }

    public void setAggdeserialfn(Object aggdeserialfn) {
        this.aggdeserialfn = aggdeserialfn;
    }

    public Object getAggmtransfn() {
        return aggmtransfn;
    }

    public void setAggmtransfn(Object aggmtransfn) {
        this.aggmtransfn = aggmtransfn;
    }

    public Object getAggminvtransfn() {
        return aggminvtransfn;
    }

    public void setAggminvtransfn(Object aggminvtransfn) {
        this.aggminvtransfn = aggminvtransfn;
    }

    public Object getAggmfinalfn() {
        return aggmfinalfn;
    }

    public void setAggmfinalfn(Object aggmfinalfn) {
        this.aggmfinalfn = aggmfinalfn;
    }

    public Boolean getAggfinalextra() {
        return aggfinalextra;
    }

    public void setAggfinalextra(Boolean aggfinalextra) {
        this.aggfinalextra = aggfinalextra;
    }

    public Boolean getAggmfinalextra() {
        return aggmfinalextra;
    }

    public void setAggmfinalextra(Boolean aggmfinalextra) {
        this.aggmfinalextra = aggmfinalextra;
    }

    public String getAggfinalmodify() {
        return aggfinalmodify;
    }

    public void setAggfinalmodify(String aggfinalmodify) {
        this.aggfinalmodify = aggfinalmodify;
    }

    public String getAggmfinalmodify() {
        return aggmfinalmodify;
    }

    public void setAggmfinalmodify(String aggmfinalmodify) {
        this.aggmfinalmodify = aggmfinalmodify;
    }

    public Long getAggsortop() {
        return aggsortop;
    }

    public void setAggsortop(Long aggsortop) {
        this.aggsortop = aggsortop;
    }

    public Long getAggtranstype() {
        return aggtranstype;
    }

    public void setAggtranstype(Long aggtranstype) {
        this.aggtranstype = aggtranstype;
    }

    public Integer getAggtransspace() {
        return aggtransspace;
    }

    public void setAggtransspace(Integer aggtransspace) {
        this.aggtransspace = aggtransspace;
    }

    public Long getAggmtranstype() {
        return aggmtranstype;
    }

    public void setAggmtranstype(Long aggmtranstype) {
        this.aggmtranstype = aggmtranstype;
    }

    public Integer getAggmtransspace() {
        return aggmtransspace;
    }

    public void setAggmtransspace(Integer aggmtransspace) {
        this.aggmtransspace = aggmtransspace;
    }

    public String getAgginitval() {
        return agginitval;
    }

    public void setAgginitval(String agginitval) {
        this.agginitval = agginitval;
    }

    public String getAggminitval() {
        return aggminitval;
    }

    public void setAggminitval(String aggminitval) {
        this.aggminitval = aggminitval;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", aggfnoid=").append(aggfnoid);
        sb.append(", aggkind=").append(aggkind);
        sb.append(", aggnumdirectargs=").append(aggnumdirectargs);
        sb.append(", aggtransfn=").append(aggtransfn);
        sb.append(", aggfinalfn=").append(aggfinalfn);
        sb.append(", aggcombinefn=").append(aggcombinefn);
        sb.append(", aggserialfn=").append(aggserialfn);
        sb.append(", aggdeserialfn=").append(aggdeserialfn);
        sb.append(", aggmtransfn=").append(aggmtransfn);
        sb.append(", aggminvtransfn=").append(aggminvtransfn);
        sb.append(", aggmfinalfn=").append(aggmfinalfn);
        sb.append(", aggfinalextra=").append(aggfinalextra);
        sb.append(", aggmfinalextra=").append(aggmfinalextra);
        sb.append(", aggfinalmodify=").append(aggfinalmodify);
        sb.append(", aggmfinalmodify=").append(aggmfinalmodify);
        sb.append(", aggsortop=").append(aggsortop);
        sb.append(", aggtranstype=").append(aggtranstype);
        sb.append(", aggtransspace=").append(aggtransspace);
        sb.append(", aggmtranstype=").append(aggmtranstype);
        sb.append(", aggmtransspace=").append(aggmtransspace);
        sb.append(", agginitval=").append(agginitval);
        sb.append(", aggminitval=").append(aggminitval);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}