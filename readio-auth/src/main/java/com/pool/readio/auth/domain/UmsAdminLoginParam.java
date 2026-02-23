package com.pool.readio.auth.domain;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotEmpty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import io.swagger.v3.oas.annotations.media.Schema.RequiredMode;

/**
 * 用户登陆参数
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class UmsAdminLoginParam {

    @NotEmpty
    @Schema(title = "用户名", requiredMode = RequiredMode.REQUIRED)
    private String username;

    @NotEmpty
    @Schema(title = "密码", requiredMode = RequiredMode.REQUIRED)
    private String password;
}
