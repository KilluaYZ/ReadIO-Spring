package com.pool.readio.readiombg.model;

import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;

public class PgStatsExt implements Serializable {
    private String schemaname;

    private String tablename;

    private String statisticsSchemaname;

    private String statisticsName;

    private String statisticsOwner;

    private Object attnames;

    private Object exprs;

    private Object kinds;

    private Boolean inherited;

    private Object nDistinct;

    private Object dependencies;

    private Object mostCommonVals;

    private Object mostCommonValNulls;

    private Object mostCommonFreqs;

    private Object mostCommonBaseFreqs;

    private static final long serialVersionUID = 1L;

    public String getSchemaname() {
        return schemaname;
    }

    public void setSchemaname(String schemaname) {
        this.schemaname = schemaname;
    }

    public String getTablename() {
        return tablename;
    }

    public void setTablename(String tablename) {
        this.tablename = tablename;
    }

    public String getStatisticsSchemaname() {
        return statisticsSchemaname;
    }

    public void setStatisticsSchemaname(String statisticsSchemaname) {
        this.statisticsSchemaname = statisticsSchemaname;
    }

    public String getStatisticsName() {
        return statisticsName;
    }

    public void setStatisticsName(String statisticsName) {
        this.statisticsName = statisticsName;
    }

    public String getStatisticsOwner() {
        return statisticsOwner;
    }

    public void setStatisticsOwner(String statisticsOwner) {
        this.statisticsOwner = statisticsOwner;
    }

    public Object getAttnames() {
        return attnames;
    }

    public void setAttnames(Object attnames) {
        this.attnames = attnames;
    }

    public Object getExprs() {
        return exprs;
    }

    public void setExprs(Object exprs) {
        this.exprs = exprs;
    }

    public Object getKinds() {
        return kinds;
    }

    public void setKinds(Object kinds) {
        this.kinds = kinds;
    }

    public Boolean getInherited() {
        return inherited;
    }

    public void setInherited(Boolean inherited) {
        this.inherited = inherited;
    }

    public Object getnDistinct() {
        return nDistinct;
    }

    public void setnDistinct(Object nDistinct) {
        this.nDistinct = nDistinct;
    }

    public Object getDependencies() {
        return dependencies;
    }

    public void setDependencies(Object dependencies) {
        this.dependencies = dependencies;
    }

    public Object getMostCommonVals() {
        return mostCommonVals;
    }

    public void setMostCommonVals(Object mostCommonVals) {
        this.mostCommonVals = mostCommonVals;
    }

    public Object getMostCommonValNulls() {
        return mostCommonValNulls;
    }

    public void setMostCommonValNulls(Object mostCommonValNulls) {
        this.mostCommonValNulls = mostCommonValNulls;
    }

    public Object getMostCommonFreqs() {
        return mostCommonFreqs;
    }

    public void setMostCommonFreqs(Object mostCommonFreqs) {
        this.mostCommonFreqs = mostCommonFreqs;
    }

    public Object getMostCommonBaseFreqs() {
        return mostCommonBaseFreqs;
    }

    public void setMostCommonBaseFreqs(Object mostCommonBaseFreqs) {
        this.mostCommonBaseFreqs = mostCommonBaseFreqs;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", schemaname=").append(schemaname);
        sb.append(", tablename=").append(tablename);
        sb.append(", statisticsSchemaname=").append(statisticsSchemaname);
        sb.append(", statisticsName=").append(statisticsName);
        sb.append(", statisticsOwner=").append(statisticsOwner);
        sb.append(", attnames=").append(attnames);
        sb.append(", exprs=").append(exprs);
        sb.append(", kinds=").append(kinds);
        sb.append(", inherited=").append(inherited);
        sb.append(", nDistinct=").append(nDistinct);
        sb.append(", dependencies=").append(dependencies);
        sb.append(", mostCommonVals=").append(mostCommonVals);
        sb.append(", mostCommonValNulls=").append(mostCommonValNulls);
        sb.append(", mostCommonFreqs=").append(mostCommonFreqs);
        sb.append(", mostCommonBaseFreqs=").append(mostCommonBaseFreqs);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}