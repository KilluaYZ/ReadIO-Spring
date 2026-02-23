package com.pool.readio.auth.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import com.pool.readio.common.api.CommonResult;
import com.pool.readio.auth.domain.UmsAdminLoginParam;


/**
 * 后台用户服务远程调用Service
 */
@FeignClient("readio-admin")
public interface UmsAdminService {

    @PostMapping("/admin/login")
    CommonResult<?> login(@RequestBody UmsAdminLoginParam umsAdminLoginParam);
}
