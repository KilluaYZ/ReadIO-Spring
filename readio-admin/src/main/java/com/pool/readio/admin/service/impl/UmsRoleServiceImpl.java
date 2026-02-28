package com.pool.readio.admin.service.impl;

import com.github.pagehelper.PageHelper;
import com.pool.readio.admin.dao.UmsRoleDao;
import com.pool.readio.mbg.mapper.UmsPermissionMapper;
import com.pool.readio.mbg.mapper.UmsRoleMapper;
import com.pool.readio.mbg.mapper.UmsRoleMenuRelationMapper;
import com.pool.readio.mbg.mapper.UmsRolePermissionRelationMapper;
import com.pool.readio.mbg.mapper.UmsRoleResourceRelationMapper;
import com.pool.readio.mbg.model.*;
import com.pool.readio.admin.service.UmsResourceService;
import com.pool.readio.admin.service.UmsRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.Date;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * 后台角色管理Service实现类
 * Created by macro on 2018/9/30.
 */
@Service
public class UmsRoleServiceImpl implements UmsRoleService {
    @Autowired
    private UmsRoleMapper roleMapper;
    @Autowired
    private UmsRoleMenuRelationMapper roleMenuRelationMapper;
    @Autowired
    private UmsRolePermissionRelationMapper rolePermissionRelationMapper;
    @Autowired
    private UmsRoleResourceRelationMapper roleResourceRelationMapper;
    @Autowired
    private UmsPermissionMapper permissionMapper;
    @Autowired
    private UmsRoleDao roleDao;
    @Autowired
    private UmsResourceService resourceService;
    @Override
    public int create(UmsRole role) {
        role.setCreateTime(new Date());
        role.setAdminCount(0);
        role.setSort(0);
        return roleMapper.insert(role);
    }

    @Override
    public int update(Integer id, UmsRole role) {
        role.setId(id);
        return roleMapper.updateByPrimaryKeySelective(role);
    }

    @Override
    public UmsRole getById(Integer id) {
        return roleMapper.selectByPrimaryKey(id);
    }

    @Override
    public int deleteById(Integer id) {
        int count = roleMapper.deleteByPrimaryKey(id);
        if (count > 0) {
            resourceService.initPathResourceMap();
        }
        return count;
    }

    @Override
    public int deleteByIds(List<Integer> ids) {
        if (ids == null || ids.isEmpty()) {
            return 0;
        }
        UmsRoleExample example = new UmsRoleExample();
        example.createCriteria().andIdIn(ids);
        int count = roleMapper.deleteByExample(example);
        if (count > 0) {
            resourceService.initPathResourceMap();
        }
        return count;
    }

    @Override
    public List<UmsRole> list() {
        return roleMapper.selectByExample(new UmsRoleExample());
    }

    @Override
    public List<UmsRole> list(String keyword, Integer pageNum, Integer pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        UmsRoleExample example = new UmsRoleExample();
        if (StringUtils.hasText(keyword)) {
            example.createCriteria().andNameLike("%" + keyword + "%");
        }
        return roleMapper.selectByExample(example);
    }

    @Override
    public List<UmsMenu> getMenuList(Long adminId) {
        return roleDao.getMenuList(adminId);
    }

    @Override
    public List<UmsMenu> listMenu(Integer roleId) {
        return roleDao.getMenuListByRoleId(roleId != null ? roleId.longValue() : null);
    }

    @Override
    public List<UmsResource> listResource(Integer roleId) {
        return roleDao.getResourceListByRoleId(roleId != null ? roleId.longValue() : null);
    }

    @Override
    public int allocMenu(Integer roleId, List<Integer> menuIds) {
        if (roleId == null || menuIds == null) {
            return 0;
        }
        UmsRoleMenuRelationExample example = new UmsRoleMenuRelationExample();
        example.createCriteria().andRoleIdEqualTo(roleId);
        roleMenuRelationMapper.deleteByExample(example);
        for (Integer menuId : menuIds) {
            UmsRoleMenuRelation relation = new UmsRoleMenuRelation();
            relation.setRoleId(roleId);
            relation.setMenuId(menuId);
            roleMenuRelationMapper.insert(relation);
        }
        return menuIds.size();
    }

    @Override
    public int addMenusToRole(Integer roleId, List<Integer> menuIds) {
        if (roleId == null || menuIds == null || menuIds.isEmpty()) {
            return 0;
        }
        UmsRoleMenuRelationExample example = new UmsRoleMenuRelationExample();
        example.createCriteria().andRoleIdEqualTo(roleId).andMenuIdIn(menuIds);
        List<UmsRoleMenuRelation> existing = roleMenuRelationMapper.selectByExample(example);
        Set<Integer> existingMenuIds = existing.stream()
                .map(UmsRoleMenuRelation::getMenuId)
                .collect(Collectors.toSet());
        int added = 0;
        for (Integer menuId : menuIds) {
            if (existingMenuIds.contains(menuId)) {
                continue;
            }
            UmsRoleMenuRelation relation = new UmsRoleMenuRelation();
            relation.setRoleId(roleId);
            relation.setMenuId(menuId);
            roleMenuRelationMapper.insert(relation);
            existingMenuIds.add(menuId);
            added++;
        }
        return added;
    }

    @Override
    public int removeMenusFromRole(Integer roleId, List<Integer> menuIds) {
        if (roleId == null || menuIds == null || menuIds.isEmpty()) {
            return 0;
        }
        UmsRoleMenuRelationExample example = new UmsRoleMenuRelationExample();
        example.createCriteria().andRoleIdEqualTo(roleId).andMenuIdIn(menuIds);
        return roleMenuRelationMapper.deleteByExample(example);
    }

    @Override
    public List<UmsPermission> listPermission(Integer roleId) {
        if (roleId == null) {
            return List.of();
        }
        UmsRolePermissionRelationExample example = new UmsRolePermissionRelationExample();
        example.createCriteria().andRoleIdEqualTo(roleId);
        List<UmsRolePermissionRelation> relations = rolePermissionRelationMapper.selectByExample(example);
        List<Integer> permissionIds = relations.stream()
                .map(UmsRolePermissionRelation::getPermissionId)
                .distinct()
                .collect(Collectors.toList());
        if (permissionIds.isEmpty()) {
            return List.of();
        }
        UmsPermissionExample permExample = new UmsPermissionExample();
        permExample.createCriteria().andIdIn(permissionIds);
        permExample.setOrderByClause("sort ASC, id ASC");
        return permissionMapper.selectByExample(permExample);
    }

    @Override
    public int allocPermission(Integer roleId, List<Integer> permissionIds) {
        if (roleId == null || permissionIds == null) {
            return 0;
        }
        UmsRolePermissionRelationExample example = new UmsRolePermissionRelationExample();
        example.createCriteria().andRoleIdEqualTo(roleId);
        rolePermissionRelationMapper.deleteByExample(example);
        for (Integer permissionId : permissionIds) {
            UmsRolePermissionRelation relation = new UmsRolePermissionRelation();
            relation.setRoleId(roleId);
            relation.setPermissionId(permissionId);
            rolePermissionRelationMapper.insert(relation);
        }
        return permissionIds.size();
    }

    @Override
    public int addPermissionsToRole(Integer roleId, List<Integer> permissionIds) {
        if (roleId == null || permissionIds == null || permissionIds.isEmpty()) {
            return 0;
        }
        UmsRolePermissionRelationExample example = new UmsRolePermissionRelationExample();
        example.createCriteria().andRoleIdEqualTo(roleId).andPermissionIdIn(permissionIds);
        List<UmsRolePermissionRelation> existing = rolePermissionRelationMapper.selectByExample(example);
        Set<Integer> existingPermissionIds = existing.stream()
                .map(UmsRolePermissionRelation::getPermissionId)
                .collect(Collectors.toSet());
        int added = 0;
        for (Integer permissionId : permissionIds) {
            if (existingPermissionIds.contains(permissionId)) {
                continue;
            }
            UmsRolePermissionRelation relation = new UmsRolePermissionRelation();
            relation.setRoleId(roleId);
            relation.setPermissionId(permissionId);
            rolePermissionRelationMapper.insert(relation);
            existingPermissionIds.add(permissionId);
            added++;
        }
        return added;
    }

    @Override
    public int removePermissionsFromRole(Integer roleId, List<Integer> permissionIds) {
        if (roleId == null || permissionIds == null || permissionIds.isEmpty()) {
            return 0;
        }
        UmsRolePermissionRelationExample example = new UmsRolePermissionRelationExample();
        example.createCriteria().andRoleIdEqualTo(roleId).andPermissionIdIn(permissionIds);
        return rolePermissionRelationMapper.deleteByExample(example);
    }

    @Override
    public int allocResource(Integer roleId, List<Integer> resourceIds) {
        if (roleId == null || resourceIds == null) {
            return 0;
        }
        UmsRoleResourceRelationExample example = new UmsRoleResourceRelationExample();
        example.createCriteria().andRoleIdEqualTo(roleId);
        roleResourceRelationMapper.deleteByExample(example);
        for (Integer resourceId : resourceIds) {
            UmsRoleResourceRelation relation = new UmsRoleResourceRelation();
            relation.setRoleId(roleId);
            relation.setResourceId(resourceId);
            roleResourceRelationMapper.insert(relation);
        }
        resourceService.initPathResourceMap();
        return resourceIds.size();
    }

    @Override
    public int addResourcesToRole(Integer roleId, List<Integer> resourceIds) {
        if (roleId == null || resourceIds == null || resourceIds.isEmpty()) {
            return 0;
        }
        UmsRoleResourceRelationExample example = new UmsRoleResourceRelationExample();
        example.createCriteria().andRoleIdEqualTo(roleId).andResourceIdIn(resourceIds);
        List<UmsRoleResourceRelation> existing = roleResourceRelationMapper.selectByExample(example);
        Set<Integer> existingResourceIds = existing.stream()
                .map(UmsRoleResourceRelation::getResourceId)
                .collect(Collectors.toSet());
        int added = 0;
        for (Integer resourceId : resourceIds) {
            if (existingResourceIds.contains(resourceId)) {
                continue;
            }
            UmsRoleResourceRelation relation = new UmsRoleResourceRelation();
            relation.setRoleId(roleId);
            relation.setResourceId(resourceId);
            roleResourceRelationMapper.insert(relation);
            existingResourceIds.add(resourceId);
            added++;
        }
        if (added > 0) {
            resourceService.initPathResourceMap();
        }
        return added;
    }

    @Override
    public int removeResourcesFromRole(Integer roleId, List<Integer> resourceIds) {
        if (roleId == null || resourceIds == null || resourceIds.isEmpty()) {
            return 0;
        }
        UmsRoleResourceRelationExample example = new UmsRoleResourceRelationExample();
        example.createCriteria().andRoleIdEqualTo(roleId).andResourceIdIn(resourceIds);
        int count = roleResourceRelationMapper.deleteByExample(example);
        if (count > 0) {
            resourceService.initPathResourceMap();
        }
        return count;
    }
}
