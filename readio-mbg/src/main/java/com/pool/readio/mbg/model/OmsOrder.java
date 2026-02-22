package com.pool.readio.mbg.model;

import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;
import java.util.Date;

public class OmsOrder implements Serializable {
    private Integer id;

    @Schema(title = "下该订单的用户")
    private Integer memberId;

    @Schema(title = "使用的优惠券ID")
    private Integer couponId;

    @Schema(title = "订单编号")
    private String orderSn;

    @Schema(title = "订单创建时间")
    private Date createTime;

    @Schema(title = "下订单的用户名")
    private String memberUsername;

    @Schema(title = "订单总金额")
    private Short totalAmount;

    @Schema(title = "应付金额（实际支付金额）")
    private Short payAmount;

    @Schema(title = "促销优化金额（促销价、满减、阶梯价）")
    private Short promotionAmount;

    @Schema(title = "积分抵扣金额")
    private Short integrationAmount;

    @Schema(title = "优惠券抵扣金额")
    private Short couponAmount;

    @Schema(title = "支付方式：0->未支付；1->支付宝；2->微信")
    private Integer payType;

    @Schema(title = "订单来源：0->PC订单；1->app订单")
    private Integer sourceType;

    @Schema(title = "订单状态：0->待付款；1->已完成；2->已关闭；3->无效订单")
    private Integer status;

    @Schema(title = "可以获得的积分")
    private Integer integration;

    @Schema(title = "可以获得的成长值")
    private Integer growth;

    @Schema(title = "活动信息")
    private String promotionInfo;

    @Schema(title = "订单备注")
    private String note;

    @Schema(title = "下单时使用的积分")
    private Integer useIntegration;

    @Schema(title = "购买商品ID")
    private Integer productId;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getMemberId() {
        return memberId;
    }

    public void setMemberId(Integer memberId) {
        this.memberId = memberId;
    }

    public Integer getCouponId() {
        return couponId;
    }

    public void setCouponId(Integer couponId) {
        this.couponId = couponId;
    }

    public String getOrderSn() {
        return orderSn;
    }

    public void setOrderSn(String orderSn) {
        this.orderSn = orderSn;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getMemberUsername() {
        return memberUsername;
    }

    public void setMemberUsername(String memberUsername) {
        this.memberUsername = memberUsername;
    }

    public Short getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(Short totalAmount) {
        this.totalAmount = totalAmount;
    }

    public Short getPayAmount() {
        return payAmount;
    }

    public void setPayAmount(Short payAmount) {
        this.payAmount = payAmount;
    }

    public Short getPromotionAmount() {
        return promotionAmount;
    }

    public void setPromotionAmount(Short promotionAmount) {
        this.promotionAmount = promotionAmount;
    }

    public Short getIntegrationAmount() {
        return integrationAmount;
    }

    public void setIntegrationAmount(Short integrationAmount) {
        this.integrationAmount = integrationAmount;
    }

    public Short getCouponAmount() {
        return couponAmount;
    }

    public void setCouponAmount(Short couponAmount) {
        this.couponAmount = couponAmount;
    }

    public Integer getPayType() {
        return payType;
    }

    public void setPayType(Integer payType) {
        this.payType = payType;
    }

    public Integer getSourceType() {
        return sourceType;
    }

    public void setSourceType(Integer sourceType) {
        this.sourceType = sourceType;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getIntegration() {
        return integration;
    }

    public void setIntegration(Integer integration) {
        this.integration = integration;
    }

    public Integer getGrowth() {
        return growth;
    }

    public void setGrowth(Integer growth) {
        this.growth = growth;
    }

    public String getPromotionInfo() {
        return promotionInfo;
    }

    public void setPromotionInfo(String promotionInfo) {
        this.promotionInfo = promotionInfo;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public Integer getUseIntegration() {
        return useIntegration;
    }

    public void setUseIntegration(Integer useIntegration) {
        this.useIntegration = useIntegration;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", memberId=").append(memberId);
        sb.append(", couponId=").append(couponId);
        sb.append(", orderSn=").append(orderSn);
        sb.append(", createTime=").append(createTime);
        sb.append(", memberUsername=").append(memberUsername);
        sb.append(", totalAmount=").append(totalAmount);
        sb.append(", payAmount=").append(payAmount);
        sb.append(", promotionAmount=").append(promotionAmount);
        sb.append(", integrationAmount=").append(integrationAmount);
        sb.append(", couponAmount=").append(couponAmount);
        sb.append(", payType=").append(payType);
        sb.append(", sourceType=").append(sourceType);
        sb.append(", status=").append(status);
        sb.append(", integration=").append(integration);
        sb.append(", growth=").append(growth);
        sb.append(", promotionInfo=").append(promotionInfo);
        sb.append(", note=").append(note);
        sb.append(", useIntegration=").append(useIntegration);
        sb.append(", productId=").append(productId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}