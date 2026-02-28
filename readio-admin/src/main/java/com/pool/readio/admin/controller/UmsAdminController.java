package com.pool.readio.admin.controller;

import cn.dev33.satoken.stp.SaTokenInfo;
import cn.hutool.core.collection.CollUtil;
import com.pool.readio.common.api.CommonPage;
import com.pool.readio.common.api.CommonResult;
import com.pool.readio.admin.dto.UmsAdminLoginParam;
import com.pool.readio.admin.dto.UmsAdminParam;
import com.pool.readio.admin.dto.UpdateAdminPasswordParam;
import com.pool.readio.mbg.model.UmsAdmin;
import com.pool.readio.mbg.model.UmsRole;
import com.pool.readio.admin.service.UmsAdminService;
import com.pool.readio.admin.service.UmsRoleService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * 后台用户管理
 * Created by macro on 2018/4/26.
 */
@Controller
@Tag(name = "UmsAdminController", description = "后台用户管理")
@RequestMapping("/admin")
public class UmsAdminController {
    @Autowired
    private UmsAdminService adminService;
    @Autowired
    private UmsRoleService roleService;
    @Value("${sa-token.token-prefix}")
    private String tokenHead;

    @Operation(summary = "用户注册")
    @PostMapping("/register")
    @ResponseBody
    public CommonResult<UmsAdmin> register(@Validated @RequestBody UmsAdminParam umsAdminParam) {
        UmsAdmin umsAdmin = adminService.register(umsAdminParam);
        return umsAdmin != null ? CommonResult.success(umsAdmin) : CommonResult.failed("注册失败");
    }

    @Operation(summary = "登录以后返回token")
    @PostMapping("/login")
    @ResponseBody
    public CommonResult<Map<String, String>> login(@Validated @RequestBody UmsAdminLoginParam umsAdminLoginParam) {
        SaTokenInfo saTokenInfo = adminService.login(umsAdminLoginParam.getUsername(), umsAdminLoginParam.getPassword());
        if (saTokenInfo == null) {
            return CommonResult.validateFailed("用户名或密码错误");
        }
        Map<String, String> tokenMap = new HashMap<>();
        tokenMap.put("token", saTokenInfo.getTokenValue());
        tokenMap.put("tokenHead", tokenHead + " ");
        return CommonResult.success(tokenMap);
    }

    @Operation(summary = "获取当前登录用户信息")
    @GetMapping("/info")
    @ResponseBody
    public CommonResult<Map<String, Object>> getAdminInfo() {
        UmsAdmin umsAdmin = adminService.getCurrentAdmin();
        if (umsAdmin == null) {
            return CommonResult.validateFailed("未登录或登录已过期");
        }
        Map<String, Object> data = new HashMap<>();
        data.put("username", umsAdmin.getUsername());
        data.put("menus", roleService.getMenuList(umsAdmin.getId().longValue()));
        data.put("icon", umsAdmin.getIcon());
        List<UmsRole> roleList = adminService.getRoleList(umsAdmin.getId().longValue());
        if (CollUtil.isNotEmpty(roleList)) {
            List<String> roles = roleList.stream().map(UmsRole::getName).collect(Collectors.toList());
            data.put("roles", roles);
        }
        return CommonResult.success(data);
    }

    @Operation(summary = "登出功能")
    @PostMapping("/logout")
    @ResponseBody
    public CommonResult<Void> logout() {
        adminService.logout();
        return CommonResult.success(null);
    }

    @Operation(summary = "根据用户名或姓名分页获取用户列表")
    @GetMapping("/list")
    @ResponseBody
    public CommonResult<CommonPage<UmsAdmin>> list(@RequestParam(value = "keyword", required = false) String keyword,
                                                   @RequestParam(value = "pageSize", defaultValue = "5") Integer pageSize,
                                                   @RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum) {
        List<UmsAdmin> adminList = adminService.list(keyword, pageSize, pageNum);
        return CommonResult.success(CommonPage.restPage(adminList));
    }

    @Operation(summary = "获取指定用户信息")
    @GetMapping("/{id}")
    @ResponseBody
    public CommonResult<UmsAdmin> getItem(@PathVariable Long id) {
        UmsAdmin admin = adminService.getItem(id);
        if (admin == null) {
            return CommonResult.failed("用户不存在");
        }
        return CommonResult.success(admin);
    }

    @Operation(summary = "修改指定用户信息")
    @PostMapping("/update/{id}")
    @ResponseBody
    public CommonResult<Integer> update(@PathVariable Long id, @RequestBody UmsAdmin admin) {
        int count = adminService.update(id, admin);
        return count > 0 ? CommonResult.success(count) : CommonResult.failed("更新失败");
    }

    @Operation(summary = "修改指定用户密码")
    @PostMapping("/updatePassword")
    @ResponseBody
    public CommonResult<Integer> updatePassword(@RequestBody UpdateAdminPasswordParam updatePasswordParam) {
        int status = adminService.updatePassword(updatePasswordParam);
        if (status > 0) {
            return CommonResult.success(status);
        }
        if (status == -1) {
            return CommonResult.failed("提交参数不合法");
        }
        if (status == -2) {
            return CommonResult.failed("找不到该用户");
        }
        if (status == -3) {
            return CommonResult.failed("旧密码错误");
        }
        return CommonResult.failed("修改失败");
    }

    @Operation(summary = "删除指定用户信息")
    @PostMapping("/delete/{id}")
    @ResponseBody
    public CommonResult<Integer> delete(@PathVariable Long id) {
        int count = adminService.delete(id);
        return count > 0 ? CommonResult.success(count) : CommonResult.failed("删除失败");
    }

    @Operation(summary = "修改帐号状态")
    @PostMapping("/updateStatus/{id}")
    @ResponseBody
    public CommonResult<Integer> updateStatus(@PathVariable Long id, @RequestParam("status") Integer status) {
        UmsAdmin umsAdmin = new UmsAdmin();
        umsAdmin.setStatus(status != null && status != 0);
        int count = adminService.update(id, umsAdmin);
        return count > 0 ? CommonResult.success(count) : CommonResult.failed("更新失败");
    }

    @Operation(summary = "获取指定用户拥有的角色（查）")
    @GetMapping("/role/{adminId}")
    @ResponseBody
    public CommonResult<List<UmsRole>> getRoleList(@PathVariable Long adminId) {
        List<UmsRole> roleList = adminService.getRoleList(adminId);
        return CommonResult.success(roleList);
    }

    @Operation(summary = "设置用户拥有的角色（改：全量覆盖）")
    @PostMapping("/role/update")
    @ResponseBody
    public CommonResult<Integer> updateRole(@RequestParam("adminId") Long adminId,
                                            @RequestParam(value = "roleIds", required = false) List<Long> roleIds) {
        int count = adminService.updateRole(adminId, roleIds != null ? roleIds : List.of());
        return count >= 0 ? CommonResult.success(count) : CommonResult.failed("分配角色失败");
    }

    @Operation(summary = "为用户增加角色（增）")
    @PostMapping("/{adminId}/role")
    @ResponseBody
    public CommonResult<Integer> addRolesToAdmin(@PathVariable Long adminId,
                                                 @RequestBody List<Long> roleIds) {
        if (roleIds == null || roleIds.isEmpty()) {
            return CommonResult.failed("角色ID列表不能为空");
        }
        int n = adminService.addRolesToAdmin(adminId, roleIds);
        return n >= 0 ? CommonResult.success(n) : CommonResult.failed("添加失败");
    }

    @Operation(summary = "从用户移除角色（删）")
    @PostMapping("/{adminId}/role/remove")
    @ResponseBody
    public CommonResult<Integer> removeRolesFromAdmin(@PathVariable Long adminId,
                                                      @RequestBody List<Long> roleIds) {
        if (roleIds == null || roleIds.isEmpty()) {
            return CommonResult.failed("角色ID列表不能为空");
        }
        int n = adminService.removeRolesFromAdmin(adminId, roleIds);
        return n >= 0 ? CommonResult.success(n) : CommonResult.failed("移除失败");
    }
}
