package com.pool.readio.readiombg.model;

import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;

public class PgStatSsl implements Serializable {
    private Integer pid;

    private Boolean ssl;

    private String version;

    private String cipher;

    private Integer bits;

    private String clientDn;

    private Short clientSerial;

    private String issuerDn;

    private static final long serialVersionUID = 1L;

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public Boolean getSsl() {
        return ssl;
    }

    public void setSsl(Boolean ssl) {
        this.ssl = ssl;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getCipher() {
        return cipher;
    }

    public void setCipher(String cipher) {
        this.cipher = cipher;
    }

    public Integer getBits() {
        return bits;
    }

    public void setBits(Integer bits) {
        this.bits = bits;
    }

    public String getClientDn() {
        return clientDn;
    }

    public void setClientDn(String clientDn) {
        this.clientDn = clientDn;
    }

    public Short getClientSerial() {
        return clientSerial;
    }

    public void setClientSerial(Short clientSerial) {
        this.clientSerial = clientSerial;
    }

    public String getIssuerDn() {
        return issuerDn;
    }

    public void setIssuerDn(String issuerDn) {
        this.issuerDn = issuerDn;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", pid=").append(pid);
        sb.append(", ssl=").append(ssl);
        sb.append(", version=").append(version);
        sb.append(", cipher=").append(cipher);
        sb.append(", bits=").append(bits);
        sb.append(", clientDn=").append(clientDn);
        sb.append(", clientSerial=").append(clientSerial);
        sb.append(", issuerDn=").append(issuerDn);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}