package com.pool.readio.admin.dto;

import io.swagger.v3.oas.annotations.media.Schema;

import java.util.Date;

/**
 * 会员 VIP 状态（用于后台展示）
 */
@Schema(description = "会员VIP状态")
public class UmsMemberVipStatusDto {

    @Schema(description = "是否为有效VIP（未过期或永久）")
    private Boolean isVip;

    @Schema(description = "VIP 到期时间，永久或未开通时为 null")
    private Date expireTime;

    @Schema(description = "剩余有效天数，-1 表示永久，null 表示非 VIP")
    private Integer remainingDays;

    public Boolean getIsVip() {
        return isVip;
    }

    public void setIsVip(Boolean isVip) {
        this.isVip = isVip;
    }

    public Date getExpireTime() {
        return expireTime;
    }

    public void setExpireTime(Date expireTime) {
        this.expireTime = expireTime;
    }

    public Integer getRemainingDays() {
        return remainingDays;
    }

    public void setRemainingDays(Integer remainingDays) {
        this.remainingDays = remainingDays;
    }
}
