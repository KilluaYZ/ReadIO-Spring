package com.pool.readio.auth.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.pool.readio.common.api.CommonResult;

/**
 * 前台会员服务远程调用Service
 */
@FeignClient("readio-portal")
public interface UmsMemberService {

    @PostMapping("/sso/login")
    CommonResult<?> login(@RequestParam("username") String username, @RequestParam("password") String password);
}
