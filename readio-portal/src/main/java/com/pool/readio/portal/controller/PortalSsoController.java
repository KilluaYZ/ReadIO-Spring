package com.pool.readio.portal.controller;

import cn.dev33.satoken.stp.SaTokenInfo;
import cn.dev33.satoken.stp.StpUtil;
import com.pool.readio.common.api.CommonResult;
import com.pool.readio.common.constant.AuthConstant;
import com.pool.readio.common.dto.UserDto;
import com.pool.readio.mbg.model.UmsMember;
import com.pool.readio.portal.service.PortalMemberAuthService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
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

    @Value("${sa-token.token-prefix:Bearer}")
    private String tokenPrefix;

    @Operation(summary = "SSO 登录：返回 token")
    @PostMapping("/login")
    public CommonResult<Map<String, String>> login(@RequestParam("username") String username,
                                                   @RequestParam("password") String password) {
        UmsMember member = portalMemberAuthService.getEnabledMemberByUsername(username);
        if (member == null) {
            return CommonResult.validateFailed("找不到该用户或账号已被禁用");
        }
        if (!portalMemberAuthService.verifyPassword(password, member.getPassword())) {
            return CommonResult.validateFailed("用户名或密码错误");
        }

        StpUtil.login(member.getId());
        UserDto userDto = UserDto.builder()
                .id(member.getId() != null ? member.getId().longValue() : null)
                .username(member.getUsername())
                .clientId(AuthConstant.PORTAL_CLIENT_ID)
                .permissionList(java.util.Collections.emptyList())
                .build();
        StpUtil.getSession().set(AuthConstant.STP_MEMBER_INFO, userDto);

        SaTokenInfo tokenInfo = StpUtil.getTokenInfo();
        Map<String, String> tokenMap = new HashMap<>();
        tokenMap.put("token", tokenInfo.getTokenValue());
        tokenMap.put("tokenHead", tokenPrefix + " ");
        return CommonResult.success(tokenMap);
    }
}

