package com.pool.readio.readiombg.model;

import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;
import java.util.Date;

public class UmsMemberRuleSetting implements Serializable {
    private Integer id;

    @Schema(title = "连续签到天数")
    private Integer continueSignDay;

    @Schema(title = "连续签到赠送数量")
    private Integer continueSignPoint;

    @Schema(title = "每消费多少元获取1个点")
    private Short consumePerPoint;

    @Schema(title = "最低获取点数的订单金额")
    private Short lowOrderAmount;

    @Schema(title = "每笔订单最高获取点数")
    private Integer maxPointPerOrder;

    @Schema(title = "类型：0->积分规则；1->成长值规则")
    private Integer type;

    private Date createTime;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getContinueSignDay() {
        return continueSignDay;
    }

    public void setContinueSignDay(Integer continueSignDay) {
        this.continueSignDay = continueSignDay;
    }

    public Integer getContinueSignPoint() {
        return continueSignPoint;
    }

    public void setContinueSignPoint(Integer continueSignPoint) {
        this.continueSignPoint = continueSignPoint;
    }

    public Short getConsumePerPoint() {
        return consumePerPoint;
    }

    public void setConsumePerPoint(Short consumePerPoint) {
        this.consumePerPoint = consumePerPoint;
    }

    public Short getLowOrderAmount() {
        return lowOrderAmount;
    }

    public void setLowOrderAmount(Short lowOrderAmount) {
        this.lowOrderAmount = lowOrderAmount;
    }

    public Integer getMaxPointPerOrder() {
        return maxPointPerOrder;
    }

    public void setMaxPointPerOrder(Integer maxPointPerOrder) {
        this.maxPointPerOrder = maxPointPerOrder;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
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
        sb.append(", continueSignDay=").append(continueSignDay);
        sb.append(", continueSignPoint=").append(continueSignPoint);
        sb.append(", consumePerPoint=").append(consumePerPoint);
        sb.append(", lowOrderAmount=").append(lowOrderAmount);
        sb.append(", maxPointPerOrder=").append(maxPointPerOrder);
        sb.append(", type=").append(type);
        sb.append(", createTime=").append(createTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}