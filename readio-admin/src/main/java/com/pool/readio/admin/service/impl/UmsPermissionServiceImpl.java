package com.pool.readio.admin.service.impl;

import com.github.pagehelper.PageHelper;
import com.pool.readio.admin.dto.UmsPermissionQueryParam;
import com.pool.readio.admin.service.UmsPermissionService;
import com.pool.readio.mbg.mapper.UmsPermissionMapper;
import com.pool.readio.mbg.model.UmsPermission;
import com.pool.readio.mbg.model.UmsPermissionExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.List;

/**
 * 后台用户权限 Service 实现，对应 ums_permission
 */
@Service
public class UmsPermissionServiceImpl implements UmsPermissionService {

    @Autowired
    private UmsPermissionMapper umsPermissionMapper;

    @Override
    public List<UmsPermission> listAll() {
        UmsPermissionExample example = new UmsPermissionExample();
        example.setOrderByClause("sort ASC, id ASC");
        return umsPermissionMapper.selectByExample(example);
    }

    @Override
    public List<UmsPermission> list(UmsPermissionQueryParam queryParam, Integer pageNum, Integer pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        UmsPermissionExample example = new UmsPermissionExample();
        example.setOrderByClause("sort ASC, id ASC");
        UmsPermissionExample.Criteria criteria = example.createCriteria();
        if (queryParam != null) {
            if (StringUtils.hasText(queryParam.getNameKeyword())) {
                criteria.andNameLike("%" + queryParam.getNameKeyword().trim() + "%");
            }
            if (StringUtils.hasText(queryParam.getValueKeyword())) {
                criteria.andValueLike("%" + queryParam.getValueKeyword().trim() + "%");
            }
            if (queryParam.getType() != null) {
                criteria.andTypeEqualTo(queryParam.getType());
            }
            if (queryParam.getStatus() != null) {
                criteria.andStatusEqualTo(queryParam.getStatus());
            }
            if (queryParam.getParentId() != null) {
                criteria.andParentIdEqualTo(queryParam.getParentId());
            }
        }
        return umsPermissionMapper.selectByExample(example);
    }

    @Override
    public UmsPermission getById(Integer id) {
        return umsPermissionMapper.selectByPrimaryKey(id);
    }

    @Override
    public int create(UmsPermission record) {
        return umsPermissionMapper.insertSelective(record);
    }

    @Override
    public int updateById(Integer id, UmsPermission record) {
        record.setId(id);
        return umsPermissionMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int deleteById(Integer id) {
        return umsPermissionMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int deleteByIds(List<Integer> ids) {
        if (ids == null || ids.isEmpty()) {
            return 0;
        }
        UmsPermissionExample example = new UmsPermissionExample();
        example.createCriteria().andIdIn(ids);
        return umsPermissionMapper.deleteByExample(example);
    }
}
