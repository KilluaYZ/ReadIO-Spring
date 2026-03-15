package com.pool.readio.admin.service.impl;
import cn.hutool.core.collection.CollUtil;
import cn.hutool.core.util.StrUtil;
import cn.hutool.crypto.digest.BCrypt;
import com.github.pagehelper.PageHelper;
import com.pool.readio.common.constant.AuthConstant;
import com.pool.readio.common.dto.UserDto;
import com.pool.readio.common.exception.Asserts;
import com.pool.readio.admin.dao.UmsAdminRoleRelationDao;
import com.pool.readio.admin.dto.UmsAdminParam;
import com.pool.readio.admin.dto.UpdateAdminPasswordParam;
import com.pool.readio.mbg.mapper.UmsAdminLoginLogMapper;
import com.pool.readio.mbg.mapper.UmsAdminMapper;
import com.pool.readio.mbg.mapper.UmsAdminRoleRelationMapper;
import com.pool.readio.mbg.model.*;
import com.pool.readio.admin.service.UmsAdminService;
import jakarta.servlet.http.HttpServletRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;
import org.springframework.util.StringUtils;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * UmsAdminService实现类
 * Created by macro on 2018/4/26.
 */
@Service
public class UmsAdminServiceImpl implements UmsAdminService {
    private static final Logger LOGGER = LoggerFactory.getLogger(UmsAdminServiceImpl.class);

    private final UmsAdminMapper adminMapper;
    private final UmsAdminRoleRelationMapper adminRoleRelationMapper;
    private final UmsAdminRoleRelationDao adminRoleRelationDao;
    private final UmsAdminLoginLogMapper loginLogMapper;

    public UmsAdminServiceImpl(UmsAdminMapper adminMapper,
                               UmsAdminRoleRelationMapper adminRoleRelationMapper,
                               UmsAdminRoleRelationDao adminRoleRelationDao,
                               UmsAdminLoginLogMapper loginLogMapper) {
        this.adminMapper = adminMapper;
        this.adminRoleRelationMapper = adminRoleRelationMapper;
        this.adminRoleRelationDao = adminRoleRelationDao;
        this.loginLogMapper = loginLogMapper;
    }

    @Override
    @Cacheable(cacheNames = "umsAdminByUsername", key = "#username")
    public UmsAdmin getAdminByUsername(String username) {
        UmsAdminExample example = new UmsAdminExample();
        example.createCriteria().andUsernameEqualTo(username);
        List<UmsAdmin> adminList = adminMapper.selectByExample(example);
        if (adminList != null && adminList.size() > 0) {
            return adminList.get(0);
        }
        return null;
    }

    @Override
    public UmsAdmin register(UmsAdminParam umsAdminParam) {
        UmsAdmin umsAdmin = new UmsAdmin();
        BeanUtils.copyProperties(umsAdminParam, umsAdmin);
        umsAdmin.setCreateTime(new Date());
        umsAdmin.setStatus(true);
        //查询是否有相同用户名的用户
        UmsAdminExample example = new UmsAdminExample();
        example.createCriteria().andUsernameEqualTo(umsAdmin.getUsername());
        List<UmsAdmin> umsAdminList = adminMapper.selectByExample(example);
        if (!umsAdminList.isEmpty()) {
            return null;
        }
        //将密码进行加密操作
        String encodePassword = BCrypt.hashpw(umsAdmin.getPassword());
        umsAdmin.setPassword(encodePassword);
        adminMapper.insert(umsAdmin);
        return umsAdmin;
    }

    // 登录逻辑由 OAuth2 + Gateway 统一处理，此处不再负责发放 token

    /**
     * 添加登录记录到 ums_admin_login_log
     */
    private void insertLoginLog(UmsAdmin admin) {
        if (admin == null) return;
        UmsAdminLoginLog loginLog = new UmsAdminLoginLog();
        loginLog.setAdminId(admin.getId());
        loginLog.setCreateTime(new Date());
        ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        if (attributes != null) {
            HttpServletRequest request = attributes.getRequest();
            if (request != null) {
                loginLog.setIp(request.getRemoteAddr());
                String userAgent = request.getHeader("User-Agent");
                if (StrUtil.isNotEmpty(userAgent)) {
                    loginLog.setUserAgent(userAgent);
                }
            }
        }
        loginLogMapper.insert(loginLog);
    }

    /**
     * 根据用户名修改登录时间
     */
    private void updateLoginTimeByUsername(String username) {
        UmsAdmin record = new UmsAdmin();
        record.setLoginTime(new Date());
        UmsAdminExample example = new UmsAdminExample();
        example.createCriteria().andUsernameEqualTo(username);
        adminMapper.updateByExampleSelective(record, example);
    }

    @Override
    @Cacheable(cacheNames = "umsAdmin", key = "#id")
    public UmsAdmin getItem(Long id) {
        return adminMapper.selectByPrimaryKey(id.intValue());
    }

    @Override
    public List<UmsAdmin> list(String keyword, Integer pageSize, Integer pageNum) {
        PageHelper.startPage(pageNum, pageSize);
        UmsAdminExample example = new UmsAdminExample();
        UmsAdminExample.Criteria criteria = example.createCriteria();
        if (!StringUtils.isEmpty(keyword)) {
            criteria.andUsernameLike("%" + keyword + "%");
            example.or(example.createCriteria().andNicknameLike("%" + keyword + "%"));
        }
        return adminMapper.selectByExample(example);
    }

    @Override
    @CacheEvict(cacheNames = {"umsAdmin", "umsAdminByUsername"}, allEntries = true)
    public int update(Long id, UmsAdmin admin) {
        admin.setId(id.intValue());
        UmsAdmin rawAdmin = adminMapper.selectByPrimaryKey(id.intValue());
        if(rawAdmin.getPassword().equals(admin.getPassword())){
            //与原加密密码相同的不需要修改
            admin.setPassword(null);
        }else{
            //与原加密密码不同的需要加密修改
            if(StrUtil.isEmpty(admin.getPassword())){
                admin.setPassword(null);
            }else{
                admin.setPassword(BCrypt.hashpw(admin.getPassword()));
            }
        }
        int count = adminMapper.updateByPrimaryKeySelective(admin);
        return count;
    }

    @Override
    @CacheEvict(cacheNames = {"umsAdmin", "umsAdminByUsername"}, allEntries = true)
    public int delete(Long id) {
        int count = adminMapper.deleteByPrimaryKey(id.intValue());
        return count;
    }

    @Override
    public int updateRole(Long adminId, List<Long> roleIds) {
        int count = roleIds == null ? 0 : roleIds.size();
        //先删除原来的关系
        UmsAdminRoleRelationExample adminRoleRelationExample = new UmsAdminRoleRelationExample();
        adminRoleRelationExample.createCriteria().andAdminIdEqualTo(adminId.intValue());
        adminRoleRelationMapper.deleteByExample(adminRoleRelationExample);
        //建立新关系
        if (!CollectionUtils.isEmpty(roleIds)) {
            List<UmsAdminRoleRelation> list = new ArrayList<>();
            for (Long roleId : roleIds) {
                UmsAdminRoleRelation roleRelation = new UmsAdminRoleRelation();
                roleRelation.setAdminId(adminId.intValue());
                roleRelation.setRoleId(roleId.intValue());
                list.add(roleRelation);
            }
            adminRoleRelationDao.insertList(list);
        }
        return count;
    }

    @Override
    public List<UmsRole> getRoleList(Long adminId) {
        return adminRoleRelationDao.getRoleList(adminId);
    }

    @Override
    public int addRolesToAdmin(Long adminId, List<Long> roleIds) {
        if (adminId == null || roleIds == null || roleIds.isEmpty()) {
            return 0;
        }
        int adminIdInt = adminId.intValue();
        List<Integer> roleIdInts = roleIds.stream().map(Long::intValue).collect(Collectors.toList());
        UmsAdminRoleRelationExample example = new UmsAdminRoleRelationExample();
        example.createCriteria().andAdminIdEqualTo(adminIdInt).andRoleIdIn(roleIdInts);
        List<UmsAdminRoleRelation> existing = adminRoleRelationMapper.selectByExample(example);
        Set<Integer> existingRoleIds = existing.stream()
                .map(UmsAdminRoleRelation::getRoleId)
                .collect(Collectors.toSet());
        int added = 0;
        for (Long roleIdLong : roleIds) {
            int roleId = roleIdLong.intValue();
            if (existingRoleIds.contains(roleId)) {
                continue;
            }
            UmsAdminRoleRelation relation = new UmsAdminRoleRelation();
            relation.setAdminId(adminIdInt);
            relation.setRoleId(roleId);
            adminRoleRelationMapper.insert(relation);
            existingRoleIds.add(roleId);
            added++;
        }
        return added;
    }

    @Override
    public int removeRolesFromAdmin(Long adminId, List<Long> roleIds) {
        if (adminId == null || roleIds == null || roleIds.isEmpty()) {
            return 0;
        }
        List<Integer> roleIdInts = roleIds.stream().map(Long::intValue).collect(Collectors.toList());
        UmsAdminRoleRelationExample example = new UmsAdminRoleRelationExample();
        example.createCriteria().andAdminIdEqualTo(adminId.intValue()).andRoleIdIn(roleIdInts);
        return adminRoleRelationMapper.deleteByExample(example);
    }

    @Override
    public List<UmsResource> getResourceList(Long adminId) {
        return adminRoleRelationDao.getResourceList(adminId);
    }

    @Override
    @CacheEvict(cacheNames = {"umsAdmin", "umsAdminByUsername"}, allEntries = true)
    public int updatePassword(UpdateAdminPasswordParam param) {
        if(StrUtil.isEmpty(param.getUsername())
                ||StrUtil.isEmpty(param.getOldPassword())
                ||StrUtil.isEmpty(param.getNewPassword())){
            return -1;
        }
        UmsAdminExample example = new UmsAdminExample();
        example.createCriteria().andUsernameEqualTo(param.getUsername());
        List<UmsAdmin> adminList = adminMapper.selectByExample(example);
        if(CollUtil.isEmpty(adminList)){
            return -2;
        }
        UmsAdmin umsAdmin = adminList.get(0);
        if(!BCrypt.checkpw(param.getOldPassword(),umsAdmin.getPassword())){
            return -3;
        }
        umsAdmin.setPassword(BCrypt.hashpw(param.getNewPassword()));
        adminMapper.updateByPrimaryKey(umsAdmin);
        return 1;
    }

    @Override
    public UmsAdmin getCurrentAdmin() {
        // 后续可根据 JWT 中的用户名/ID 获取当前管理员信息；
        // 目前简单返回 null，表示无会话上下文（依赖上游网关做鉴权）
        return null;
    }

    @Override
    public void logout() {
        // 登出改由 OAuth2 + Gateway 完成，这里留空实现
    }
}
