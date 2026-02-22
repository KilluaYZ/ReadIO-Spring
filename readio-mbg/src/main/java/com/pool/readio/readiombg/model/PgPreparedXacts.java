package com.pool.readio.readiombg.model;

import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;
import java.util.Date;

public class PgPreparedXacts implements Serializable {
    private Object transaction;

    private String gid;

    private Date prepared;

    private String owner;

    private String database;

    private static final long serialVersionUID = 1L;

    public Object getTransaction() {
        return transaction;
    }

    public void setTransaction(Object transaction) {
        this.transaction = transaction;
    }

    public String getGid() {
        return gid;
    }

    public void setGid(String gid) {
        this.gid = gid;
    }

    public Date getPrepared() {
        return prepared;
    }

    public void setPrepared(Date prepared) {
        this.prepared = prepared;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getDatabase() {
        return database;
    }

    public void setDatabase(String database) {
        this.database = database;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", transaction=").append(transaction);
        sb.append(", gid=").append(gid);
        sb.append(", prepared=").append(prepared);
        sb.append(", owner=").append(owner);
        sb.append(", database=").append(database);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}