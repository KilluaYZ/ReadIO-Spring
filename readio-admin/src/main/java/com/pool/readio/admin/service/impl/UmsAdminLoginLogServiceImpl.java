package com.pool.readio.admin.service.impl;

import com.github.pagehelper.PageHelper;
import com.pool.readio.admin.service.UmsAdminLoginLogService;
import com.pool.readio.mbg.mapper.UmsAdminLoginLogMapper;
import com.pool.readio.mbg.model.UmsAdminLoginLog;
import com.pool.readio.mbg.model.UmsAdminLoginLogExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.List;

/**
 * 管理员登录日志 Service 实现
 */
@Service
public class UmsAdminLoginLogServiceImpl implements UmsAdminLoginLogService {

    @Autowired
    private UmsAdminLoginLogMapper loginLogMapper;

    @Override
    public int create(UmsAdminLoginLog log) {
        return loginLogMapper.insertSelective(log);
    }

    @Override
    public int update(Long id, UmsAdminLoginLog log) {
        if (id == null) {
            return 0;
        }
        log.setId(id.intValue());
        return loginLogMapper.updateByPrimaryKeySelective(log);
    }

    @Override
    public int delete(Long id) {
        if (id == null) {
            return 0;
        }
        return loginLogMapper.deleteByPrimaryKey(id.intValue());
    }

    @Override
    public int delete(List<Long> ids) {
        if (ids == null || ids.isEmpty()) {
            return 0;
        }
        int count = 0;
        for (Long id : ids) {
            if (id != null) {
                count += loginLogMapper.deleteByPrimaryKey(id.intValue());
            }
        }
        return count;
    }

    @Override
    public UmsAdminLoginLog getItem(Long id) {
        if (id == null) {
            return null;
        }
        return loginLogMapper.selectByPrimaryKey(id.intValue());
    }

    @Override
    public List<UmsAdminLoginLog> list(Long adminId, String ip, String address, Integer pageSize, Integer pageNum) {
        PageHelper.startPage(pageNum != null ? pageNum : 1, pageSize != null ? pageSize : 10);
        UmsAdminLoginLogExample example = new UmsAdminLoginLogExample();
        UmsAdminLoginLogExample.Criteria criteria = example.createCriteria();
        if (adminId != null) {
            criteria.andAdminIdEqualTo(adminId.intValue());
        }
        if (StringUtils.hasText(ip)) {
            criteria.andIpLike("%" + ip + "%");
        }
        if (StringUtils.hasText(address)) {
            criteria.andAddressLike("%" + address + "%");
        }
        example.setOrderByClause("create_time DESC");
        return loginLogMapper.selectByExample(example);
    }
}
