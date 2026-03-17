package com.pool.readio.search.sync;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.time.Instant;

@Entity
@Table(name = "search_sync_state")
public class SyncState {

    @Id
    private String id;

    private Instant lastSyncTime;

    public SyncState() {
    }

    public SyncState(String id, Instant lastSyncTime) {
        this.id = id;
        this.lastSyncTime = lastSyncTime;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Instant getLastSyncTime() {
        return lastSyncTime;
    }

    public void setLastSyncTime(Instant lastSyncTime) {
        this.lastSyncTime = lastSyncTime;
    }
}

