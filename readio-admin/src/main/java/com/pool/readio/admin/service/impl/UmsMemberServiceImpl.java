package com.pool.readio.admin.service.impl;

import com.pool.readio.admin.service.UmsMemberService;
import com.pool.readio.mbg.mapper.UmsMemberMapper;
import com.pool.readio.mbg.model.UmsMember;
import com.pool.readio.mbg.model.UmsMemberExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
}
