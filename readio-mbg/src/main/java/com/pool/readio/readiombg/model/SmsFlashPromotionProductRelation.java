package com.pool.readio.readiombg.model;

import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;
import java.util.Date;

public class SmsFlashPromotionProductRelation implements Serializable {
    private Integer id;

    @Schema(title = "限时购ID")
    private Integer flashPromotionId;

    @Schema(title = "限时购会话ID")
    private Integer flashPromotionSessionId;

    @Schema(title = "参与限时购的商品ID")
    private Integer productId;

    @Schema(title = "限时购商品价格")
    private Short flashPromotionPrice;

    @Schema(title = "限时购商品数量：-1表示无限制")
    private Integer flashPromotionCount;

    @Schema(title = "每人限时购商品数量限制： -1表示无限制")
    private Integer flashPromotionLimit;

    private Date createTime;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getFlashPromotionId() {
        return flashPromotionId;
    }

    public void setFlashPromotionId(Integer flashPromotionId) {
        this.flashPromotionId = flashPromotionId;
    }

    public Integer getFlashPromotionSessionId() {
        return flashPromotionSessionId;
    }

    public void setFlashPromotionSessionId(Integer flashPromotionSessionId) {
        this.flashPromotionSessionId = flashPromotionSessionId;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public Short getFlashPromotionPrice() {
        return flashPromotionPrice;
    }

    public void setFlashPromotionPrice(Short flashPromotionPrice) {
        this.flashPromotionPrice = flashPromotionPrice;
    }

    public Integer getFlashPromotionCount() {
        return flashPromotionCount;
    }

    public void setFlashPromotionCount(Integer flashPromotionCount) {
        this.flashPromotionCount = flashPromotionCount;
    }

    public Integer getFlashPromotionLimit() {
        return flashPromotionLimit;
    }

    public void setFlashPromotionLimit(Integer flashPromotionLimit) {
        this.flashPromotionLimit = flashPromotionLimit;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", flashPromotionId=").append(flashPromotionId);
        sb.append(", flashPromotionSessionId=").append(flashPromotionSessionId);
        sb.append(", productId=").append(productId);
        sb.append(", flashPromotionPrice=").append(flashPromotionPrice);
        sb.append(", flashPromotionCount=").append(flashPromotionCount);
        sb.append(", flashPromotionLimit=").append(flashPromotionLimit);
        sb.append(", createTime=").append(createTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}