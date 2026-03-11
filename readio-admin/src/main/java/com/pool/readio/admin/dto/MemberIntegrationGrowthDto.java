package com.pool.readio.admin.dto;

import io.swagger.v3.oas.annotations.media.Schema;

/**
 * 会员积分与成长值汇总（用于后台统计/查询）
 */
@Schema(description = "会员积分与成长值汇总")
public class MemberIntegrationGrowthDto {

    @Schema(description = "当前积分")
    private Integer integration;

    @Schema(description = "当前成长值")
    private Integer growth;

    @Schema(description = "历史累计获得积分")
    private Integer historyIntegration;

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

    public Integer getHistoryIntegration() {
        return historyIntegration;
    }

    public void setHistoryIntegration(Integer historyIntegration) {
        this.historyIntegration = historyIntegration;
    }
}
