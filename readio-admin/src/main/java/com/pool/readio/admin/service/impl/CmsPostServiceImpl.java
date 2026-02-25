package com.pool.readio.admin.service.impl;

import com.github.pagehelper.PageHelper;
import com.pool.readio.admin.dao.CmsPostDao;
import com.pool.readio.admin.dto.CmsPostDetail;
import com.pool.readio.admin.service.CmsPostService;
import com.pool.readio.mbg.mapper.CmsPostMapper;
import com.pool.readio.mbg.model.CmsPost;
import com.pool.readio.mbg.model.CmsPostExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CmsPostServiceImpl implements CmsPostService {

    @Autowired
    private CmsPostMapper cmsPostMapper;

    @Autowired
    private CmsPostDao cmsPostDao;

    @Override
    public List<CmsPost> listAll() {
        return cmsPostMapper.selectByExample(new CmsPostExample());
    }

    @Override
    public List<CmsPost> list(Integer pageNum, Integer pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        return cmsPostMapper.selectByExample(new CmsPostExample());
    }

    @Override
    public CmsPost getById(Integer id) {
        return cmsPostMapper.selectByPrimaryKey(id);
    }

    @Override
    public CmsPostDetail getDetailById(Integer id) {
        return cmsPostDao.getDetail(id);
    }

    @Override
    public int create(CmsPost record) {
        return cmsPostMapper.insertSelective(record);
    }

    @Override
    public int updateById(Integer id, CmsPost record) {
        record.setId(id);
        return cmsPostMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int deleteById(Integer id) {
        return cmsPostMapper.deleteByPrimaryKey(id);
    }
}
