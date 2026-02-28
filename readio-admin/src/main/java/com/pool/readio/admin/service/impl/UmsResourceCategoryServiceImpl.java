package com.pool.readio.admin.service.impl;

import com.pool.readio.mbg.mapper.UmsResourceCategoryMapper;
import com.pool.readio.mbg.model.UmsResourceCategory;
import com.pool.readio.mbg.model.UmsResourceCategoryExample;
import com.pool.readio.admin.service.UmsResourceCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * 后台资源分类管理Service实现类
 * Created by macro on 2020/2/5.
 */
@Service
public class UmsResourceCategoryServiceImpl implements UmsResourceCategoryService {
    @Autowired
    private UmsResourceCategoryMapper resourceCategoryMapper;

    @Override
    public List<UmsResourceCategory> listAll() {
        UmsResourceCategoryExample example = new UmsResourceCategoryExample();
        example.setOrderByClause("sort ASC, id ASC");
        return resourceCategoryMapper.selectByExample(example);
    }

    @Override
    public UmsResourceCategory getById(Integer id) {
        return resourceCategoryMapper.selectByPrimaryKey(id);
    }

    @Override
    public int create(UmsResourceCategory umsResourceCategory) {
        umsResourceCategory.setCreateTime(new Date());
        return resourceCategoryMapper.insert(umsResourceCategory);
    }

    @Override
    public int update(Integer id, UmsResourceCategory umsResourceCategory) {
        umsResourceCategory.setId(id);
        return resourceCategoryMapper.updateByPrimaryKeySelective(umsResourceCategory);
    }

    @Override
    public int deleteById(Integer id) {
        return resourceCategoryMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int deleteByIds(List<Integer> ids) {
        if (ids == null || ids.isEmpty()) {
            return 0;
        }
        UmsResourceCategoryExample example = new UmsResourceCategoryExample();
        example.createCriteria().andIdIn(ids);
        return resourceCategoryMapper.deleteByExample(example);
    }
}
