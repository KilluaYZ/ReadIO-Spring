package com.pool.readio.admin.controller;

import com.pool.readio.common.api.CommonPage;
import com.pool.readio.common.api.CommonResult;
import com.pool.readio.mbg.model.UmsMenu;
import com.pool.readio.mbg.model.UmsPermission;
import com.pool.readio.mbg.model.UmsResource;
import com.pool.readio.mbg.model.UmsRole;
import com.pool.readio.admin.service.UmsRoleService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 后台用户角色管理 Controller
 * 对应数据表 ums_role
 */
@RestController
@Tag(name = "UmsRoleController", description = "后台用户角色管理")
@RequestMapping("/role")
public class UmsRoleController {

    @Autowired
    private UmsRoleService roleService;

    @Operation(summary = "获取所有角色")
    @GetMapping("/listAll")
    public CommonResult<List<UmsRole>> listAll() {
        List<UmsRole> list = roleService.list();
        return CommonResult.success(list);
    }

    @Operation(summary = "分页条件查询角色列表")
    @GetMapping("/list")
    public CommonResult<CommonPage<UmsRole>> list(
            @RequestParam(value = "keyword", required = false) String keyword,
            @RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum,
            @RequestParam(value = "pageSize", defaultValue = "10") Integer pageSize) {
        List<UmsRole> list = roleService.list(keyword, pageNum, pageSize);
        return CommonResult.success(CommonPage.restPage(list));
    }

    @Operation(summary = "根据ID获取角色")
    @GetMapping("/{id}")
    public CommonResult<UmsRole> getById(@PathVariable Integer id) {
        UmsRole item = roleService.getById(id);
        return item != null ? CommonResult.success(item) : CommonResult.failed("角色不存在");
    }

    @Operation(summary = "新增角色")
    @PostMapping("/create")
    public CommonResult<Integer> create(@RequestBody UmsRole role) {
        int n = roleService.create(role);
        return n > 0 ? CommonResult.success(role.getId()) : CommonResult.failed("新增失败");
    }

    @Operation(summary = "更新角色")
    @PostMapping("/update/{id}")
    public CommonResult<Void> update(@PathVariable Integer id, @RequestBody UmsRole role) {
        int n = roleService.update(id, role);
        return n > 0 ? CommonResult.success(null) : CommonResult.failed("更新失败");
    }

    @Operation(summary = "修改角色状态")
    @PostMapping("/updateStatus/{id}")
    public CommonResult<Void> updateStatus(@PathVariable Integer id,
                                           @RequestParam(value = "status") Integer status) {
        UmsRole umsRole = new UmsRole();
        umsRole.setStatus(status != null && status != 0);
        int n = roleService.update(id, umsRole);
        return n > 0 ? CommonResult.success(null) : CommonResult.failed("更新失败");
    }

    @Operation(summary = "删除角色")
    @PostMapping("/delete/{id}")
    public CommonResult<Void> delete(@PathVariable Integer id) {
        int n = roleService.deleteById(id);
        return n > 0 ? CommonResult.success(null) : CommonResult.failed("删除失败");
    }

    @Operation(summary = "批量删除角色")
    @PostMapping("/delete/batch")
    public CommonResult<Integer> deleteBatch(@RequestBody List<Integer> ids) {
        if (ids == null || ids.isEmpty()) {
            return CommonResult.failed("请选择要删除的角色");
        }
        int n = roleService.deleteByIds(ids);
        return n > 0 ? CommonResult.success(n) : CommonResult.failed("删除失败");
    }

    @Operation(summary = "获取角色可访问的菜单（查）")
    @GetMapping("/listMenu/{roleId}")
    public CommonResult<List<UmsMenu>> listMenu(@PathVariable Integer roleId) {
        List<UmsMenu> list = roleService.listMenu(roleId);
        return CommonResult.success(list);
    }

    @Operation(summary = "设置角色可访问的菜单（改：全量覆盖）")
    @PostMapping("/allocMenu")
    public CommonResult<Void> allocMenu(@RequestParam Integer roleId,
                                        @RequestBody List<Integer> menuIds) {
        if (menuIds == null) {
            return CommonResult.failed("菜单ID列表不能为空");
        }
        int n = roleService.allocMenu(roleId, menuIds);
        return n >= 0 ? CommonResult.success(null) : CommonResult.failed("分配失败");
    }

    @Operation(summary = "为角色增加可访问的菜单（增）")
    @PostMapping("/{roleId}/menu")
    public CommonResult<Integer> addMenusToRole(@PathVariable Integer roleId,
                                                @RequestBody List<Integer> menuIds) {
        if (menuIds == null || menuIds.isEmpty()) {
            return CommonResult.failed("菜单ID列表不能为空");
        }
        int n = roleService.addMenusToRole(roleId, menuIds);
        return n >= 0 ? CommonResult.success(n) : CommonResult.failed("添加失败");
    }

    @Operation(summary = "从角色移除可访问的菜单（删）")
    @PostMapping("/{roleId}/menu/remove")
    public CommonResult<Integer> removeMenusFromRole(@PathVariable Integer roleId,
                                                     @RequestBody List<Integer> menuIds) {
        if (menuIds == null || menuIds.isEmpty()) {
            return CommonResult.failed("菜单ID列表不能为空");
        }
        int n = roleService.removeMenusFromRole(roleId, menuIds);
        return n >= 0 ? CommonResult.success(n) : CommonResult.failed("移除失败");
    }

    @Operation(summary = "获取角色拥有的权限（查）")
    @GetMapping("/listPermission/{roleId}")
    public CommonResult<List<UmsPermission>> listPermission(@PathVariable Integer roleId) {
        List<UmsPermission> list = roleService.listPermission(roleId);
        return CommonResult.success(list);
    }

    @Operation(summary = "设置角色拥有的权限（改：全量覆盖）")
    @PostMapping("/allocPermission")
    public CommonResult<Void> allocPermission(@RequestParam Integer roleId,
                                              @RequestBody List<Integer> permissionIds) {
        if (permissionIds == null) {
            return CommonResult.failed("权限ID列表不能为空");
        }
        int n = roleService.allocPermission(roleId, permissionIds);
        return n >= 0 ? CommonResult.success(null) : CommonResult.failed("分配失败");
    }

    @Operation(summary = "为角色增加权限（增）")
    @PostMapping("/{roleId}/permission")
    public CommonResult<Integer> addPermissionsToRole(@PathVariable Integer roleId,
                                                    @RequestBody List<Integer> permissionIds) {
        if (permissionIds == null || permissionIds.isEmpty()) {
            return CommonResult.failed("权限ID列表不能为空");
        }
        int n = roleService.addPermissionsToRole(roleId, permissionIds);
        return n >= 0 ? CommonResult.success(n) : CommonResult.failed("添加失败");
    }

    @Operation(summary = "从角色移除权限（删）")
    @PostMapping("/{roleId}/permission/remove")
    public CommonResult<Integer> removePermissionsFromRole(@PathVariable Integer roleId,
                                                          @RequestBody List<Integer> permissionIds) {
        if (permissionIds == null || permissionIds.isEmpty()) {
            return CommonResult.failed("权限ID列表不能为空");
        }
        int n = roleService.removePermissionsFromRole(roleId, permissionIds);
        return n >= 0 ? CommonResult.success(n) : CommonResult.failed("移除失败");
    }

    @Operation(summary = "获取角色可访问的资源（查）")
    @GetMapping("/listResource/{roleId}")
    public CommonResult<List<UmsResource>> listResource(@PathVariable Integer roleId) {
        List<UmsResource> list = roleService.listResource(roleId);
        return CommonResult.success(list);
    }

    @Operation(summary = "设置角色可访问的资源（改：全量覆盖）")
    @PostMapping("/allocResource")
    public CommonResult<Void> allocResource(@RequestParam Integer roleId,
                                           @RequestBody List<Integer> resourceIds) {
        if (resourceIds == null) {
            return CommonResult.failed("资源ID列表不能为空");
        }
        int n = roleService.allocResource(roleId, resourceIds);
        return n >= 0 ? CommonResult.success(null) : CommonResult.failed("分配失败");
    }

    @Operation(summary = "为角色增加可访问的资源（增）")
    @PostMapping("/{roleId}/resource")
    public CommonResult<Integer> addResourcesToRole(@PathVariable Integer roleId,
                                                   @RequestBody List<Integer> resourceIds) {
        if (resourceIds == null || resourceIds.isEmpty()) {
            return CommonResult.failed("资源ID列表不能为空");
        }
        int n = roleService.addResourcesToRole(roleId, resourceIds);
        return n >= 0 ? CommonResult.success(n) : CommonResult.failed("添加失败");
    }

    @Operation(summary = "从角色移除可访问的资源（删）")
    @PostMapping("/{roleId}/resource/remove")
    public CommonResult<Integer> removeResourcesFromRole(@PathVariable Integer roleId,
                                                         @RequestBody List<Integer> resourceIds) {
        if (resourceIds == null || resourceIds.isEmpty()) {
            return CommonResult.failed("资源ID列表不能为空");
        }
        int n = roleService.removeResourcesFromRole(roleId, resourceIds);
        return n >= 0 ? CommonResult.success(n) : CommonResult.failed("移除失败");
    }
}
