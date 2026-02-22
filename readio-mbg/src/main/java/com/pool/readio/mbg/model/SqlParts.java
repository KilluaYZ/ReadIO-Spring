package com.pool.readio.mbg.model;

import java.io.Serializable;

public class SqlParts implements Serializable {
    private Object featureId;

    private Object featureName;

    private Object isSupported;

    private Object isVerifiedBy;

    private Object comments;

    private static final long serialVersionUID = 1L;

    public Object getFeatureId() {
        return featureId;
    }

    public void setFeatureId(Object featureId) {
        this.featureId = featureId;
    }

    public Object getFeatureName() {
        return featureName;
    }

    public void setFeatureName(Object featureName) {
        this.featureName = featureName;
    }

    public Object getIsSupported() {
        return isSupported;
    }

    public void setIsSupported(Object isSupported) {
        this.isSupported = isSupported;
    }

    public Object getIsVerifiedBy() {
        return isVerifiedBy;
    }

    public void setIsVerifiedBy(Object isVerifiedBy) {
        this.isVerifiedBy = isVerifiedBy;
    }

    public Object getComments() {
        return comments;
    }

    public void setComments(Object comments) {
        this.comments = comments;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", featureId=").append(featureId);
        sb.append(", featureName=").append(featureName);
        sb.append(", isSupported=").append(isSupported);
        sb.append(", isVerifiedBy=").append(isVerifiedBy);
        sb.append(", comments=").append(comments);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}