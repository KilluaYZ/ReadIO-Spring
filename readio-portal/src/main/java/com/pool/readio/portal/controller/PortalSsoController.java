package com.pool.readio.portal.controller;
import com.pool.readio.common.api.CommonResult;
import com.pool.readio.mbg.model.UmsMember;
import com.pool.readio.portal.service.PortalMemberAuthService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * Portal：给统一认证中心 readio-auth 调用的 SSO 登录入口。
 * 对齐 readio-auth 的 Feign：POST /sso/login (form/query params)。
 */
@RestController
@Tag(name = "Portal-SSO", description = "业务层-SSO 登录（供 readio-auth 调用）")
@RequestMapping("/sso")
public class PortalSsoController {

    @Autowired
    private PortalMemberAuthService portalMemberAuthService;

    // 登录/token 颁发统一由 OAuth2 + Gateway 处理，此处只保留用户校验逻辑（如后续需要可扩展）
    @Operation(summary = "SSO 登录（已迁移到 OAuth2，接口保留占位）")
    @PostMapping("/login")
    public CommonResult<Map<String, String>> login(@RequestParam("username") String username,
                                                   @RequestParam("password") String password) {
        UmsMember member = portalMemberAuthService.getEnabledMemberByUsername(username);
        if (member == null || !portalMemberAuthService.verifyPassword(password, member.getPassword())) {
            return CommonResult.validateFailed("用户名或密码错误");
        }
        Map<String, String> resp = new HashMap<>();
        resp.put("message", "登录由 OAuth2 + Gateway 统一处理，Portal 不再直接签发 token");
        return CommonResult.success(resp);
    }
}

