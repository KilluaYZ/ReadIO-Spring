package com.pool.readio.admin.service;

import com.pool.readio.mbg.model.UmsMenu;
import com.pool.readio.mbg.model.UmsPermission;
import com.pool.readio.mbg.model.UmsResource;
import com.pool.readio.mbg.model.UmsRole;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * 后台角色管理 Service，对应 ums_role
 */
public interface UmsRoleService {
    /**
     * 添加角色
     */
    int create(UmsRole role);

    /**
     * 修改角色信息
     */
    int update(Integer id, UmsRole role);

    /**
     * 根据ID获取角色
     */
    UmsRole getById(Integer id);

    /**
     * 删除角色
     */
    int deleteById(Integer id);

    /**
     * 批量删除角色
     */
    int deleteByIds(List<Integer> ids);

    /**
     * 获取所有角色列表
     */
    List<UmsRole> list();

    /**
     * 分页条件查询角色列表
     */
    List<UmsRole> list(String keyword, Integer pageNum, Integer pageSize);

    /**
     * 根据管理员ID获取对应菜单
     */
    List<UmsMenu> getMenuList(Long adminId);

    /**
     * 获取角色相关菜单（查）
     */
    List<UmsMenu> listMenu(Integer roleId);

    /**
     * 给角色分配菜单（改：全量覆盖）
     */
    @Transactional
    int allocMenu(Integer roleId, List<Integer> menuIds);

    /**
     * 为角色增加可访问的菜单（增：在现有基础上追加，已存在则跳过）
     */
    @Transactional
    int addMenusToRole(Integer roleId, List<Integer> menuIds);

    /**
     * 从角色移除可访问的菜单（删）
     */
    @Transactional
    int removeMenusFromRole(Integer roleId, List<Integer> menuIds);

    /**
     * 获取角色相关权限（查）
     */
    List<UmsPermission> listPermission(Integer roleId);

    /**
     * 给角色分配权限（改：全量覆盖）
     */
    @Transactional
    int allocPermission(Integer roleId, List<Integer> permissionIds);

    /**
     * 为角色增加权限（增：在现有基础上追加，已存在则跳过）
     */
    @Transactional
    int addPermissionsToRole(Integer roleId, List<Integer> permissionIds);

    /**
     * 从角色移除权限（删）
     */
    @Transactional
    int removePermissionsFromRole(Integer roleId, List<Integer> permissionIds);

    /**
     * 获取角色可访问的资源（查）
     */
    List<UmsResource> listResource(Integer roleId);

    /**
     * 给角色分配可访问的资源（改：全量覆盖）
     */
    @Transactional
    int allocResource(Integer roleId, List<Integer> resourceIds);

    /**
     * 为角色增加可访问的资源（增：在现有基础上追加，已存在则跳过）
     */
    @Transactional
    int addResourcesToRole(Integer roleId, List<Integer> resourceIds);

    /**
     * 从角色移除可访问的资源（删）
     */
    @Transactional
    int removeResourcesFromRole(Integer roleId, List<Integer> resourceIds);
}
