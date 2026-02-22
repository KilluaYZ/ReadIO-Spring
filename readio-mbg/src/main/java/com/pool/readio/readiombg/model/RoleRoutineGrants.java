package com.pool.readio.readiombg.model;

import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;

public class RoleRoutineGrants implements Serializable {
    private Object grantor;

    private Object grantee;

    private Object specificCatalog;

    private Object specificSchema;

    private Object specificName;

    private Object routineCatalog;

    private Object routineSchema;

    private Object routineName;

    private Object privilegeType;

    private Object isGrantable;

    private static final long serialVersionUID = 1L;

    public Object getGrantor() {
        return grantor;
    }

    public void setGrantor(Object grantor) {
        this.grantor = grantor;
    }

    public Object getGrantee() {
        return grantee;
    }

    public void setGrantee(Object grantee) {
        this.grantee = grantee;
    }

    public Object getSpecificCatalog() {
        return specificCatalog;
    }

    public void setSpecificCatalog(Object specificCatalog) {
        this.specificCatalog = specificCatalog;
    }

    public Object getSpecificSchema() {
        return specificSchema;
    }

    public void setSpecificSchema(Object specificSchema) {
        this.specificSchema = specificSchema;
    }

    public Object getSpecificName() {
        return specificName;
    }

    public void setSpecificName(Object specificName) {
        this.specificName = specificName;
    }

    public Object getRoutineCatalog() {
        return routineCatalog;
    }

    public void setRoutineCatalog(Object routineCatalog) {
        this.routineCatalog = routineCatalog;
    }

    public Object getRoutineSchema() {
        return routineSchema;
    }

    public void setRoutineSchema(Object routineSchema) {
        this.routineSchema = routineSchema;
    }

    public Object getRoutineName() {
        return routineName;
    }

    public void setRoutineName(Object routineName) {
        this.routineName = routineName;
    }

    public Object getPrivilegeType() {
        return privilegeType;
    }

    public void setPrivilegeType(Object privilegeType) {
        this.privilegeType = privilegeType;
    }

    public Object getIsGrantable() {
        return isGrantable;
    }

    public void setIsGrantable(Object isGrantable) {
        this.isGrantable = isGrantable;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", grantor=").append(grantor);
        sb.append(", grantee=").append(grantee);
        sb.append(", specificCatalog=").append(specificCatalog);
        sb.append(", specificSchema=").append(specificSchema);
        sb.append(", specificName=").append(specificName);
        sb.append(", routineCatalog=").append(routineCatalog);
        sb.append(", routineSchema=").append(routineSchema);
        sb.append(", routineName=").append(routineName);
        sb.append(", privilegeType=").append(privilegeType);
        sb.append(", isGrantable=").append(isGrantable);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}