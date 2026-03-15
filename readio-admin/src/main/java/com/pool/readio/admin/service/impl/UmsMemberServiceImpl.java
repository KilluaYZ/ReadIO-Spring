package com.pool.readio.admin.service.impl;

import com.github.pagehelper.PageHelper;
import com.pool.readio.admin.dto.MemberBookReadPermissionDto;
import com.pool.readio.admin.dto.MemberIntegrationGrowthDto;
import com.pool.readio.admin.dto.UmsMemberVipStatusDto;
import com.pool.readio.admin.service.UmsMemberService;
import com.pool.readio.mbg.mapper.UmsMemberMapper;
import com.pool.readio.mbg.mapper.UmsMemberOwnBookRelationMapper;
import com.pool.readio.mbg.mapper.UmsMemberVipRelationMapper;
import com.pool.readio.mbg.model.UmsMember;
import com.pool.readio.mbg.model.UmsMemberExample;
import com.pool.readio.mbg.model.UmsMemberOwnBookRelation;
import com.pool.readio.mbg.model.UmsMemberOwnBookRelationExample;
import com.pool.readio.mbg.model.UmsMemberVipRelation;
import com.pool.readio.mbg.model.UmsMemberVipRelationExample;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

import static com.pool.readio.admin.dto.MemberBookReadPermissionDto.*;

@Service
public class UmsMemberServiceImpl implements UmsMemberService {

    private final UmsMemberMapper umsMemberMapper;
    private final UmsMemberOwnBookRelationMapper ownBookRelationMapper;
    private final UmsMemberVipRelationMapper vipRelationMapper;

    public UmsMemberServiceImpl(UmsMemberMapper umsMemberMapper,
                                UmsMemberOwnBookRelationMapper ownBookRelationMapper,
                                UmsMemberVipRelationMapper vipRelationMapper) {
        this.umsMemberMapper = umsMemberMapper;
        this.ownBookRelationMapper = ownBookRelationMapper;
        this.vipRelationMapper = vipRelationMapper;
    }

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

    @Override
    public List<UmsMemberOwnBookRelation> getOwnedBookRelations(Integer memberId) {
        if (memberId == null) {
            return List.of();
        }
        UmsMemberOwnBookRelationExample example = new UmsMemberOwnBookRelationExample();
        example.createCriteria().andMemberIdEqualTo(memberId);
        example.setOrderByClause("create_time DESC");
        return ownBookRelationMapper.selectByExample(example);
    }

    @Override
    public UmsMemberVipStatusDto getVipStatus(Integer memberId) {
        UmsMemberVipStatusDto dto = new UmsMemberVipStatusDto();
        dto.setIsVip(false);
        dto.setExpireTime(null);
        dto.setRemainingDays(null);
        if (memberId == null) {
            return dto;
        }
        UmsMemberVipRelationExample example = new UmsMemberVipRelationExample();
        example.createCriteria().andMemberIdEqualTo(memberId);
        List<UmsMemberVipRelation> list = vipRelationMapper.selectByExample(example);
        if (list == null || list.isEmpty()) {
            return dto;
        }
        Date now = new Date();
        Date maxExpire = null;
        for (UmsMemberVipRelation r : list) {
            Integer duration = r.getDuration();
            if (duration == null || duration == -1) {
                // 永久
                dto.setIsVip(true);
                dto.setExpireTime(null);
                dto.setRemainingDays(-1);
                return dto;
            }
            Date createTime = r.getCreateTime();
            if (createTime == null) continue;
            Calendar cal = Calendar.getInstance();
            cal.setTime(createTime);
            cal.add(Calendar.DAY_OF_MONTH, duration);
            Date expire = cal.getTime();
            if (maxExpire == null || expire.after(maxExpire)) {
                maxExpire = expire;
            }
        }
        if (maxExpire != null && maxExpire.after(now)) {
            dto.setIsVip(true);
            dto.setExpireTime(maxExpire);
            long days = (maxExpire.getTime() - now.getTime()) / (24 * 60 * 60 * 1000);
            dto.setRemainingDays((int) days);
        } else if (maxExpire != null) {
            dto.setExpireTime(maxExpire);
            dto.setRemainingDays(0);
        }
        return dto;
    }

    @Override
    public MemberBookReadPermissionDto checkBookReadPermission(Integer memberId, Integer bookId) {
        MemberBookReadPermissionDto dto = new MemberBookReadPermissionDto();
        dto.setCanRead(false);
        dto.setSource(SOURCE_NONE);
        if (memberId == null || bookId == null) {
            dto.setMessage("参数无效");
            return dto;
        }
        // 1. 是否已购且在有效期内
        UmsMemberOwnBookRelationExample ex = new UmsMemberOwnBookRelationExample();
        ex.createCriteria().andMemberIdEqualTo(memberId).andBookIdEqualTo(bookId);
        List<UmsMemberOwnBookRelation> owned = ownBookRelationMapper.selectByExample(ex);
        Date now = new Date();
        for (UmsMemberOwnBookRelation r : owned) {
            Integer duration = r.getDuration();
            if (duration == null || duration == -1) {
                dto.setCanRead(true);
                dto.setSource(SOURCE_OWNED);
                dto.setMessage("已购书籍");
                return dto;
            }
            Date createTime = r.getCreateTime();
            if (createTime != null && duration > 0) {
                Calendar cal = Calendar.getInstance();
                cal.setTime(createTime);
                cal.add(Calendar.DAY_OF_MONTH, duration);
                if (cal.getTime().after(now)) {
                    dto.setCanRead(true);
                    dto.setSource(SOURCE_OWNED);
                    dto.setMessage("已购书籍（有效期内）");
                    return dto;
                }
            }
        }
        // 2. 是否有效 VIP
        UmsMemberVipStatusDto vipStatus = getVipStatus(memberId);
        if (Boolean.TRUE.equals(vipStatus.getIsVip())) {
            dto.setCanRead(true);
            dto.setSource(SOURCE_VIP);
            dto.setMessage("会员权益");
            return dto;
        }
        dto.setMessage("无阅读权限，请购买或开通会员");
        return dto;
    }

    @Override
    public Integer adjustIntegration(Integer memberId, int delta) {
        if (memberId == null) return null;
        UmsMember member = umsMemberMapper.selectByPrimaryKey(memberId);
        if (member == null) return null;
        int current = member.getIntegration() != null ? member.getIntegration() : 0;
        int next = Math.max(0, current + delta);
        UmsMember update = new UmsMember();
        update.setId(memberId);
        update.setIntegration(next);
        if (delta > 0) {
            int history = member.getHistoryIntegration() != null ? member.getHistoryIntegration() : 0;
            update.setHistoryIntegration(history + delta);
        }
        return umsMemberMapper.updateByPrimaryKeySelective(update) > 0 ? next : null;
    }

    @Override
    public Integer adjustGrowth(Integer memberId, int delta) {
        if (memberId == null) return null;
        UmsMember member = umsMemberMapper.selectByPrimaryKey(memberId);
        if (member == null) return null;
        int current = member.getGrowth() != null ? member.getGrowth() : 0;
        int next = Math.max(0, current + delta);
        UmsMember update = new UmsMember();
        update.setId(memberId);
        update.setGrowth(next);
        return umsMemberMapper.updateByPrimaryKeySelective(update) > 0 ? next : null;
    }

    @Override
    public MemberIntegrationGrowthDto getIntegrationGrowth(Integer memberId) {
        MemberIntegrationGrowthDto dto = new MemberIntegrationGrowthDto();
        if (memberId == null) return dto;
        UmsMember member = umsMemberMapper.selectByPrimaryKey(memberId);
        if (member == null) return dto;
        dto.setIntegration(member.getIntegration() != null ? member.getIntegration() : 0);
        dto.setGrowth(member.getGrowth() != null ? member.getGrowth() : 0);
        dto.setHistoryIntegration(member.getHistoryIntegration() != null ? member.getHistoryIntegration() : 0);
        return dto;
    }
}
