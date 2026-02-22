package com.pool.readio.readiombg.model;

import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;

public class Triggers implements Serializable {
    private Object triggerCatalog;

    private Object triggerSchema;

    private Object triggerName;

    private Object eventManipulation;

    private Object eventObjectCatalog;

    private Object eventObjectSchema;

    private Object eventObjectTable;

    private Object actionOrder;

    private Object actionCondition;

    private Object actionStatement;

    private Object actionOrientation;

    private Object actionTiming;

    private Object actionReferenceOldTable;

    private Object actionReferenceNewTable;

    private Object actionReferenceOldRow;

    private Object actionReferenceNewRow;

    private Object created;

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

    public Object getEventManipulation() {
        return eventManipulation;
    }

    public void setEventManipulation(Object eventManipulation) {
        this.eventManipulation = eventManipulation;
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

    public Object getActionOrder() {
        return actionOrder;
    }

    public void setActionOrder(Object actionOrder) {
        this.actionOrder = actionOrder;
    }

    public Object getActionCondition() {
        return actionCondition;
    }

    public void setActionCondition(Object actionCondition) {
        this.actionCondition = actionCondition;
    }

    public Object getActionStatement() {
        return actionStatement;
    }

    public void setActionStatement(Object actionStatement) {
        this.actionStatement = actionStatement;
    }

    public Object getActionOrientation() {
        return actionOrientation;
    }

    public void setActionOrientation(Object actionOrientation) {
        this.actionOrientation = actionOrientation;
    }

    public Object getActionTiming() {
        return actionTiming;
    }

    public void setActionTiming(Object actionTiming) {
        this.actionTiming = actionTiming;
    }

    public Object getActionReferenceOldTable() {
        return actionReferenceOldTable;
    }

    public void setActionReferenceOldTable(Object actionReferenceOldTable) {
        this.actionReferenceOldTable = actionReferenceOldTable;
    }

    public Object getActionReferenceNewTable() {
        return actionReferenceNewTable;
    }

    public void setActionReferenceNewTable(Object actionReferenceNewTable) {
        this.actionReferenceNewTable = actionReferenceNewTable;
    }

    public Object getActionReferenceOldRow() {
        return actionReferenceOldRow;
    }

    public void setActionReferenceOldRow(Object actionReferenceOldRow) {
        this.actionReferenceOldRow = actionReferenceOldRow;
    }

    public Object getActionReferenceNewRow() {
        return actionReferenceNewRow;
    }

    public void setActionReferenceNewRow(Object actionReferenceNewRow) {
        this.actionReferenceNewRow = actionReferenceNewRow;
    }

    public Object getCreated() {
        return created;
    }

    public void setCreated(Object created) {
        this.created = created;
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
        sb.append(", eventManipulation=").append(eventManipulation);
        sb.append(", eventObjectCatalog=").append(eventObjectCatalog);
        sb.append(", eventObjectSchema=").append(eventObjectSchema);
        sb.append(", eventObjectTable=").append(eventObjectTable);
        sb.append(", actionOrder=").append(actionOrder);
        sb.append(", actionCondition=").append(actionCondition);
        sb.append(", actionStatement=").append(actionStatement);
        sb.append(", actionOrientation=").append(actionOrientation);
        sb.append(", actionTiming=").append(actionTiming);
        sb.append(", actionReferenceOldTable=").append(actionReferenceOldTable);
        sb.append(", actionReferenceNewTable=").append(actionReferenceNewTable);
        sb.append(", actionReferenceOldRow=").append(actionReferenceOldRow);
        sb.append(", actionReferenceNewRow=").append(actionReferenceNewRow);
        sb.append(", created=").append(created);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}