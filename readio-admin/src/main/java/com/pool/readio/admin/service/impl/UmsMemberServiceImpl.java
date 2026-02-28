package com.pool.readio.admin.service.impl;

import com.github.pagehelper.PageHelper;
import com.pool.readio.admin.service.UmsMemberService;
import com.pool.readio.mbg.mapper.UmsMemberMapper;
import com.pool.readio.mbg.model.UmsMember;
import com.pool.readio.mbg.model.UmsMemberExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.List;

@Service
public class UmsMemberServiceImpl implements UmsMemberService {

    @Autowired
    private UmsMemberMapper umsMemberMapper;

    @Override
    public List<UmsMember> listAll() {
        return umsMemberMapper.selectByExample(new UmsMemberExample());
    }

    @Override
    public List<UmsMember> list(String keyword, Integer pageSize, Integer pageNum) {
        PageHelper.startPage(pageNum != null ? pageNum : 1, pageSize != null ? pageSize : 10);
        UmsMemberExample example = new UmsMemberExample();
        if (StringUtils.hasText(keyword)) {
            UmsMemberExample.Criteria c1 = example.createCriteria();
            c1.andUsernameLike("%" + keyword + "%");
            UmsMemberExample.Criteria c2 = example.or();
            c2.andNicknameLike("%" + keyword + "%");
        }
        example.setOrderByClause("create_time DESC");
        return umsMemberMapper.selectByExample(example);
    }

    @Override
    public UmsMember getById(Integer id) {
        return umsMemberMapper.selectByPrimaryKey(id);
    }

    @Override
    public int create(UmsMember record) {
        return umsMemberMapper.insertSelective(record);
    }

    @Override
    public int updateById(Integer id, UmsMember record) {
        record.setId(id);
        return umsMemberMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int deleteById(Integer id) {
        return umsMemberMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int updateStatus(Integer id, Integer status) {
        UmsMember record = new UmsMember();
        record.setId(id);
        record.setStatus(status != null && status != 0);
        return umsMemberMapper.updateByPrimaryKeySelective(record);
    }
}
