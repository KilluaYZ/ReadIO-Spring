package com.pool.readio.admin.controller;

import com.pool.readio.common.api.CommonPage;
import com.pool.readio.common.api.CommonResult;
import com.pool.readio.mbg.model.UmsAdminLoginLog;
import com.pool.readio.admin.service.UmsAdminLoginLogService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 管理员登录日志 Controller
 * 对应表 ums_admin_login_log（id, admin_id, ip, address, user_agent, create_time）
 */
@Controller
@Tag(name = "UmsAdminLoginLogController", description = "管理员登录日志管理")
@RequestMapping("/adminLoginLog")
public class UmsAdminLoginLogController {

    @Autowired
    private UmsAdminLoginLogService loginLogService;

    @Operation(summary = "新增登录日志")
    @PostMapping("/create")
    @ResponseBody
    public CommonResult<Integer> create(@RequestBody UmsAdminLoginLog log) {
        int count = loginLogService.create(log);
        return count > 0 ? CommonResult.success(count) : CommonResult.failed("新增失败");
    }

    @Operation(summary = "更新登录日志")
    @PostMapping("/update/{id}")
    @ResponseBody
    public CommonResult<Integer> update(@PathVariable Long id, @RequestBody UmsAdminLoginLog log) {
        int count = loginLogService.update(id, log);
        return count > 0 ? CommonResult.success(count) : CommonResult.failed("更新失败");
    }

    @Operation(summary = "删除单条登录日志")
    @PostMapping("/delete/{id}")
    @ResponseBody
    public CommonResult<Integer> delete(@PathVariable Long id) {
        int count = loginLogService.delete(id);
        return count > 0 ? CommonResult.success(count) : CommonResult.failed("删除失败");
    }

    @Operation(summary = "批量删除登录日志")
    @PostMapping("/delete/many")
    @ResponseBody
    public CommonResult<Integer> deleteMany(@RequestParam("ids") List<Long> ids) {
        int count = loginLogService.delete(ids);
        return count > 0 ? CommonResult.success(count) : CommonResult.failed("删除失败");
    }

    @Operation(summary = "根据ID获取登录日志详情")
    @GetMapping("/get/{id}")
    @ResponseBody
    public CommonResult<UmsAdminLoginLog> getItem(@PathVariable Long id) {
        UmsAdminLoginLog log = loginLogService.getItem(id);
        if (log == null) {
            return CommonResult.failed("记录不存在");
        }
        return CommonResult.success(log);
    }

    @Operation(summary = "分页查询登录日志")
    @GetMapping("/list")
    @ResponseBody
    public CommonResult<CommonPage<UmsAdminLoginLog>> list(
            @RequestParam(value = "adminId", required = false) Long adminId,
            @RequestParam(value = "ip", required = false) String ip,
            @RequestParam(value = "address", required = false) String address,
            @RequestParam(value = "pageSize", defaultValue = "10") Integer pageSize,
            @RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum) {
        List<UmsAdminLoginLog> list = loginLogService.list(adminId, ip, address, pageSize, pageNum);
        return CommonResult.success(CommonPage.restPage(list));
    }
}
