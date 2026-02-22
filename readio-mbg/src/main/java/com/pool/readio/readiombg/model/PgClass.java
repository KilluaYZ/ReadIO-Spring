package com.pool.readio.readiombg.model;

import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;

public class PgClass implements Serializable {
    private Long oid;

    private String relname;

    private Long relnamespace;

    private Long reltype;

    private Long reloftype;

    private Long relowner;

    private Long relam;

    private Long relfilenode;

    private Long reltablespace;

    private Integer relpages;

    private Float reltuples;

    private Integer relallvisible;

    private Integer relallfrozen;

    private Long reltoastrelid;

    private Boolean relhasindex;

    private Boolean relisshared;

    private String relpersistence;

    private String relkind;

    private Short relnatts;

    private Short relchecks;

    private Boolean relhasrules;

    private Boolean relhastriggers;

    private Boolean relhassubclass;

    private Boolean relrowsecurity;

    private Boolean relforcerowsecurity;

    private Boolean relispopulated;

    private String relreplident;

    private Boolean relispartition;

    private Long relrewrite;

    private Object relfrozenxid;

    private Object relminmxid;

    private Object relacl;

    private Object reloptions;

    private Object relpartbound;

    private static final long serialVersionUID = 1L;

    public Long getOid() {
        return oid;
    }

    public void setOid(Long oid) {
        this.oid = oid;
    }

    public String getRelname() {
        return relname;
    }

    public void setRelname(String relname) {
        this.relname = relname;
    }

    public Long getRelnamespace() {
        return relnamespace;
    }

    public void setRelnamespace(Long relnamespace) {
        this.relnamespace = relnamespace;
    }

    public Long getReltype() {
        return reltype;
    }

    public void setReltype(Long reltype) {
        this.reltype = reltype;
    }

    public Long getReloftype() {
        return reloftype;
    }

    public void setReloftype(Long reloftype) {
        this.reloftype = reloftype;
    }

    public Long getRelowner() {
        return relowner;
    }

    public void setRelowner(Long relowner) {
        this.relowner = relowner;
    }

    public Long getRelam() {
        return relam;
    }

    public void setRelam(Long relam) {
        this.relam = relam;
    }

    public Long getRelfilenode() {
        return relfilenode;
    }

    public void setRelfilenode(Long relfilenode) {
        this.relfilenode = relfilenode;
    }

    public Long getReltablespace() {
        return reltablespace;
    }

    public void setReltablespace(Long reltablespace) {
        this.reltablespace = reltablespace;
    }

    public Integer getRelpages() {
        return relpages;
    }

    public void setRelpages(Integer relpages) {
        this.relpages = relpages;
    }

    public Float getReltuples() {
        return reltuples;
    }

    public void setReltuples(Float reltuples) {
        this.reltuples = reltuples;
    }

    public Integer getRelallvisible() {
        return relallvisible;
    }

    public void setRelallvisible(Integer relallvisible) {
        this.relallvisible = relallvisible;
    }

    public Integer getRelallfrozen() {
        return relallfrozen;
    }

    public void setRelallfrozen(Integer relallfrozen) {
        this.relallfrozen = relallfrozen;
    }

    public Long getReltoastrelid() {
        return reltoastrelid;
    }

    public void setReltoastrelid(Long reltoastrelid) {
        this.reltoastrelid = reltoastrelid;
    }

    public Boolean getRelhasindex() {
        return relhasindex;
    }

    public void setRelhasindex(Boolean relhasindex) {
        this.relhasindex = relhasindex;
    }

    public Boolean getRelisshared() {
        return relisshared;
    }

    public void setRelisshared(Boolean relisshared) {
        this.relisshared = relisshared;
    }

    public String getRelpersistence() {
        return relpersistence;
    }

    public void setRelpersistence(String relpersistence) {
        this.relpersistence = relpersistence;
    }

    public String getRelkind() {
        return relkind;
    }

    public void setRelkind(String relkind) {
        this.relkind = relkind;
    }

    public Short getRelnatts() {
        return relnatts;
    }

    public void setRelnatts(Short relnatts) {
        this.relnatts = relnatts;
    }

    public Short getRelchecks() {
        return relchecks;
    }

    public void setRelchecks(Short relchecks) {
        this.relchecks = relchecks;
    }

    public Boolean getRelhasrules() {
        return relhasrules;
    }

    public void setRelhasrules(Boolean relhasrules) {
        this.relhasrules = relhasrules;
    }

    public Boolean getRelhastriggers() {
        return relhastriggers;
    }

    public void setRelhastriggers(Boolean relhastriggers) {
        this.relhastriggers = relhastriggers;
    }

    public Boolean getRelhassubclass() {
        return relhassubclass;
    }

    public void setRelhassubclass(Boolean relhassubclass) {
        this.relhassubclass = relhassubclass;
    }

    public Boolean getRelrowsecurity() {
        return relrowsecurity;
    }

    public void setRelrowsecurity(Boolean relrowsecurity) {
        this.relrowsecurity = relrowsecurity;
    }

    public Boolean getRelforcerowsecurity() {
        return relforcerowsecurity;
    }

    public void setRelforcerowsecurity(Boolean relforcerowsecurity) {
        this.relforcerowsecurity = relforcerowsecurity;
    }

    public Boolean getRelispopulated() {
        return relispopulated;
    }

    public void setRelispopulated(Boolean relispopulated) {
        this.relispopulated = relispopulated;
    }

    public String getRelreplident() {
        return relreplident;
    }

    public void setRelreplident(String relreplident) {
        this.relreplident = relreplident;
    }

    public Boolean getRelispartition() {
        return relispartition;
    }

    public void setRelispartition(Boolean relispartition) {
        this.relispartition = relispartition;
    }

    public Long getRelrewrite() {
        return relrewrite;
    }

    public void setRelrewrite(Long relrewrite) {
        this.relrewrite = relrewrite;
    }

    public Object getRelfrozenxid() {
        return relfrozenxid;
    }

    public void setRelfrozenxid(Object relfrozenxid) {
        this.relfrozenxid = relfrozenxid;
    }

    public Object getRelminmxid() {
        return relminmxid;
    }

    public void setRelminmxid(Object relminmxid) {
        this.relminmxid = relminmxid;
    }

    public Object getRelacl() {
        return relacl;
    }

    public void setRelacl(Object relacl) {
        this.relacl = relacl;
    }

    public Object getReloptions() {
        return reloptions;
    }

    public void setReloptions(Object reloptions) {
        this.reloptions = reloptions;
    }

    public Object getRelpartbound() {
        return relpartbound;
    }

    public void setRelpartbound(Object relpartbound) {
        this.relpartbound = relpartbound;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", oid=").append(oid);
        sb.append(", relname=").append(relname);
        sb.append(", relnamespace=").append(relnamespace);
        sb.append(", reltype=").append(reltype);
        sb.append(", reloftype=").append(reloftype);
        sb.append(", relowner=").append(relowner);
        sb.append(", relam=").append(relam);
        sb.append(", relfilenode=").append(relfilenode);
        sb.append(", reltablespace=").append(reltablespace);
        sb.append(", relpages=").append(relpages);
        sb.append(", reltuples=").append(reltuples);
        sb.append(", relallvisible=").append(relallvisible);
        sb.append(", relallfrozen=").append(relallfrozen);
        sb.append(", reltoastrelid=").append(reltoastrelid);
        sb.append(", relhasindex=").append(relhasindex);
        sb.append(", relisshared=").append(relisshared);
        sb.append(", relpersistence=").append(relpersistence);
        sb.append(", relkind=").append(relkind);
        sb.append(", relnatts=").append(relnatts);
        sb.append(", relchecks=").append(relchecks);
        sb.append(", relhasrules=").append(relhasrules);
        sb.append(", relhastriggers=").append(relhastriggers);
        sb.append(", relhassubclass=").append(relhassubclass);
        sb.append(", relrowsecurity=").append(relrowsecurity);
        sb.append(", relforcerowsecurity=").append(relforcerowsecurity);
        sb.append(", relispopulated=").append(relispopulated);
        sb.append(", relreplident=").append(relreplident);
        sb.append(", relispartition=").append(relispartition);
        sb.append(", relrewrite=").append(relrewrite);
        sb.append(", relfrozenxid=").append(relfrozenxid);
        sb.append(", relminmxid=").append(relminmxid);
        sb.append(", relacl=").append(relacl);
        sb.append(", reloptions=").append(reloptions);
        sb.append(", relpartbound=").append(relpartbound);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}