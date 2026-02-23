package com.pool.readio.auth.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.pool.readio.auth.domain.UmsAdminLoginParam;
import com.pool.readio.auth.service.UmsAdminService;
import com.pool.readio.auth.service.UmsMemberService;
import com.pool.readio.common.api.CommonResult;
import com.pool.readio.common.constant.AuthConstant;

/**
 * 统一认证授权接口
 */

@Controller
@Tag(name = "AuthController", description = "统一认证授权接口")
@RequestMapping("/auth")
public class AuthController {

    @Autowired
    private UmsAdminService adminService;

    @Autowired
    private UmsMemberService memberService;

    @Operation(summary = "登陆之后返回token")
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult login(
            @RequestParam String clientId,
            @RequestParam String username,
            @RequestParam String password
    ) {
        if(AuthConstant.ADMIN_CLIENT_ID.equals(clientId)) {
            UmsAdminLoginParam loginParam = new UmsAdminLoginParam();
            loginParam.setUsername(username);
            loginParam.setPassword(password);
            return adminService.login(loginParam);
        } else if(AuthConstant.PORTAL_CLIENT_ID.equals(clientId)) {
            return memberService.login(username, password);
        } else {
            return CommonResult.failed("clientId不正确");
        }
    }
}
