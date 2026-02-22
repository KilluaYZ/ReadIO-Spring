package com.pool.readio.mbg.model;

import java.io.Serializable;

public class TriggeredUpdateColumns implements Serializable {
    private Object triggerCatalog;

    private Object triggerSchema;

    private Object triggerName;

    private Object eventObjectCatalog;

    private Object eventObjectSchema;

    private Object eventObjectTable;

    private Object eventObjectColumn;

    private static final long serialVersionUID = 1L;

    public Object getTriggerCatalog() {
        return triggerCatalog;
    }

    public void setTriggerCatalog(Object triggerCatalog) {
        this.triggerCatalog = triggerCatalog;
    }

    public Object getTriggerSchema() {
        return triggerSchema;
    }

    public void setTriggerSchema(Object triggerSchema) {
        this.triggerSchema = triggerSchema;
    }

    public Object getTriggerName() {
        return triggerName;
    }

    public void setTriggerName(Object triggerName) {
        this.triggerName = triggerName;
    }

    public Object getEventObjectCatalog() {
        return eventObjectCatalog;
    }

    public void setEventObjectCatalog(Object eventObjectCatalog) {
        this.eventObjectCatalog = eventObjectCatalog;
    }

    public Object getEventObjectSchema() {
        return eventObjectSchema;
    }

    public void setEventObjectSchema(Object eventObjectSchema) {
        this.eventObjectSchema = eventObjectSchema;
    }

    public Object getEventObjectTable() {
        return eventObjectTable;
    }

    public void setEventObjectTable(Object eventObjectTable) {
        this.eventObjectTable = eventObjectTable;
    }

    public Object getEventObjectColumn() {
        return eventObjectColumn;
    }

    public void setEventObjectColumn(Object eventObjectColumn) {
        this.eventObjectColumn = eventObjectColumn;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", triggerCatalog=").append(triggerCatalog);
        sb.append(", triggerSchema=").append(triggerSchema);
        sb.append(", triggerName=").append(triggerName);
        sb.append(", eventObjectCatalog=").append(eventObjectCatalog);
        sb.append(", eventObjectSchema=").append(eventObjectSchema);
        sb.append(", eventObjectTable=").append(eventObjectTable);
        sb.append(", eventObjectColumn=").append(eventObjectColumn);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}