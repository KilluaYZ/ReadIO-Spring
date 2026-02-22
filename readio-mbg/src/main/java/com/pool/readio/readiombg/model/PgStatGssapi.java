package com.pool.readio.readiombg.model;

import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;

public class PgStatGssapi implements Serializable {
    private Integer pid;

    private Boolean gssAuthenticated;

    private String principal;

    private Boolean encrypted;

    private Boolean credentialsDelegated;

    private static final long serialVersionUID = 1L;

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public Boolean getGssAuthenticated() {
        return gssAuthenticated;
    }

    public void setGssAuthenticated(Boolean gssAuthenticated) {
        this.gssAuthenticated = gssAuthenticated;
    }

    public String getPrincipal() {
        return principal;
    }

    public void setPrincipal(String principal) {
        this.principal = principal;
    }

    public Boolean getEncrypted() {
        return encrypted;
    }

    public void setEncrypted(Boolean encrypted) {
        this.encrypted = encrypted;
    }

    public Boolean getCredentialsDelegated() {
        return credentialsDelegated;
    }

    public void setCredentialsDelegated(Boolean credentialsDelegated) {
        this.credentialsDelegated = credentialsDelegated;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", pid=").append(pid);
        sb.append(", gssAuthenticated=").append(gssAuthenticated);
        sb.append(", principal=").append(principal);
        sb.append(", encrypted=").append(encrypted);
        sb.append(", credentialsDelegated=").append(credentialsDelegated);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}