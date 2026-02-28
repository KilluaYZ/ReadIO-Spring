package com.pool.readio.admin.service.impl;

import com.github.pagehelper.PageHelper;
import com.pool.readio.admin.service.SmsFlashPromotionLogService;
import com.pool.readio.mbg.mapper.SmsFlashPromotionLogMapper;
import com.pool.readio.mbg.model.SmsFlashPromotionLog;
import com.pool.readio.mbg.model.SmsFlashPromotionLogExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * 限时购通知记录 Service 实现
 */
@Service
public class SmsFlashPromotionLogServiceImpl implements SmsFlashPromotionLogService {

    @Autowired
    private SmsFlashPromotionLogMapper logMapper;

    @Override
    public int create(SmsFlashPromotionLog log) {
        return logMapper.insertSelective(log);
    }

    @Override
    public int update(Long id, SmsFlashPromotionLog log) {
        if (id == null) {
            return 0;
        }
        log.setId(id.intValue());
        return logMapper.updateByPrimaryKeySelective(log);
    }

    @Override
    public int delete(Long id) {
        if (id == null) {
            return 0;
        }
        return logMapper.deleteByPrimaryKey(id.intValue());
    }

    @Override
    public int delete(List<Long> ids) {
        if (ids == null || ids.isEmpty()) {
            return 0;
        }
        int count = 0;
        for (Long id : ids) {
            if (id != null) {
                count += logMapper.deleteByPrimaryKey(id.intValue());
            }
        }
        return count;
    }

    @Override
    public SmsFlashPromotionLog getItem(Long id) {
        if (id == null) {
            return null;
        }
        return logMapper.selectByPrimaryKey(id.intValue());
    }

    @Override
    public List<SmsFlashPromotionLog> list(Long memberId,
                                           Long productId,
                                           String memberUsername,
                                           String productName,
                                           Integer pageSize,
                                           Integer pageNum) {
        if (pageSize == null || pageSize <= 0) {
            pageSize = 10;
        }
        if (pageNum == null || pageNum <= 0) {
            pageNum = 1;
        }
        PageHelper.startPage(pageNum, pageSize);
        SmsFlashPromotionLogExample example = new SmsFlashPromotionLogExample();
        example.setOrderByClause("create_time DESC");
        SmsFlashPromotionLogExample.Criteria criteria = example.createCriteria();
        if (memberId != null) {
            criteria.andMemberIdEqualTo(memberId.intValue());
        }
        if (productId != null) {
            criteria.andProductIdEqualTo(productId.intValue());
        }
        if (StringUtils.hasText(memberUsername)) {
            criteria.andMemberUsernameLike("%" + memberUsername + "%");
        }
        if (StringUtils.hasText(productName)) {
            criteria.andProductNameLike("%" + productName + "%");
        }
        List<SmsFlashPromotionLog> list = logMapper.selectByExample(example);
        return list != null ? list : new ArrayList<>();
    }
}

