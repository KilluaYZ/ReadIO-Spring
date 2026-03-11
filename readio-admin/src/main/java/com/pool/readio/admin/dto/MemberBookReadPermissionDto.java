package com.pool.readio.admin.dto;

import io.swagger.v3.oas.annotations.media.Schema;

/**
 * 会员对某本书的阅读权限校验结果
 */
@Schema(description = "会员对某本书的阅读权限校验结果")
public class MemberBookReadPermissionDto {

    @Schema(description = "是否有权阅读（已购且在有效期内，或为有效 VIP）")
    private Boolean canRead;

    @Schema(description = "权限来源：OWNED-已购书；VIP-会员权益；NONE-无权限")
    private String source;

    @Schema(description = "说明，如无权限时的提示")
    private String message;

    public Boolean getCanRead() {
        return canRead;
    }

    public void setCanRead(Boolean canRead) {
        this.canRead = canRead;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public static final String SOURCE_OWNED = "OWNED";
    public static final String SOURCE_VIP = "VIP";
    public static final String SOURCE_NONE = "NONE";
}
