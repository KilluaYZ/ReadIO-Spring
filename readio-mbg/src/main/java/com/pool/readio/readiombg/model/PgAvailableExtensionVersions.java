package com.pool.readio.readiombg.model;

import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;

public class PgAvailableExtensionVersions implements Serializable {
    private String name;

    private String version;

    private Boolean installed;

    private Boolean superuser;

    private Boolean trusted;

    private Boolean relocatable;

    private String schema;

    private Object requires;

    private String comment;

    private static final long serialVersionUID = 1L;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public Boolean getInstalled() {
        return installed;
    }

    public void setInstalled(Boolean installed) {
        this.installed = installed;
    }

    public Boolean getSuperuser() {
        return superuser;
    }

    public void setSuperuser(Boolean superuser) {
        this.superuser = superuser;
    }

    public Boolean getTrusted() {
        return trusted;
    }

    public void setTrusted(Boolean trusted) {
        this.trusted = trusted;
    }

    public Boolean getRelocatable() {
        return relocatable;
    }

    public void setRelocatable(Boolean relocatable) {
        this.relocatable = relocatable;
    }

    public String getSchema() {
        return schema;
    }

    public void setSchema(String schema) {
        this.schema = schema;
    }

    public Object getRequires() {
        return requires;
    }

    public void setRequires(Object requires) {
        this.requires = requires;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", name=").append(name);
        sb.append(", version=").append(version);
        sb.append(", installed=").append(installed);
        sb.append(", superuser=").append(superuser);
        sb.append(", trusted=").append(trusted);
        sb.append(", relocatable=").append(relocatable);
        sb.append(", schema=").append(schema);
        sb.append(", requires=").append(requires);
        sb.append(", comment=").append(comment);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}