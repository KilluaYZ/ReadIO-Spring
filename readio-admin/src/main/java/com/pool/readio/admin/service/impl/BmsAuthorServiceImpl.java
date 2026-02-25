package com.pool.readio.admin.service.impl;

import com.pool.readio.admin.dto.BmsAuthorQueryParam;
import com.pool.readio.admin.service.BmsAuthorService;
import com.pool.readio.mbg.mapper.BmsAuthorMapper;
import com.pool.readio.mbg.model.BmsAuthor;
import com.pool.readio.mbg.model.BmsAuthorExample;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import java.util.List;

@Service
public class BmsAuthorServiceImpl implements BmsAuthorService {

    @Autowired
    private BmsAuthorMapper bmsAuthorMapper;

    @Override
    public List<BmsAuthor> listAll() {
        return bmsAuthorMapper.selectByExample(new BmsAuthorExample());
    }

    @Override
    public List<BmsAuthor> list(BmsAuthorQueryParam queryParam, Integer pageNum, Integer pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        BmsAuthorExample example = new BmsAuthorExample();
        example.setOrderByClause("id DESC");
        BmsAuthorExample.Criteria criteria = example.createCriteria();
        if (queryParam != null) {
            if (StringUtils.hasText(queryParam.getNameKeyword())) {
                criteria.andNameLike("%" + queryParam.getNameKeyword().trim() + "%");
            }
            if (StringUtils.hasText(queryParam.getDescriptionKeyword())) {
                criteria.andDescriptionLike("%" + queryParam.getDescriptionKeyword().trim() + "%");
            }
            if (StringUtils.hasText(queryParam.getCreateTime())) {
                String prefix = queryParam.getCreateTime().trim();
                Date[] range = parseCreateTimePrefix(prefix);
                if (range != null) {
                    criteria.andCreateTimeGreaterThanOrEqualTo(range[0]);
                    criteria.andCreateTimeLessThan(range[1]);
                }
            }
        }
        return bmsAuthorMapper.selectByExample(example);
    }

    /**
     * 解析创建时间前缀为 [起始时间, 结束时间)，如 2024-01 -> 该月范围
     */
    private Date[] parseCreateTimePrefix(String prefix) {
        if (prefix == null || prefix.isEmpty()) {
            return null;
        }
        try {
            LocalDate start;
            LocalDate end;
            if (prefix.length() == 4) {
                // yyyy
                start = LocalDate.of(Integer.parseInt(prefix), 1, 1);
                end = start.plusYears(1);
            } else if (prefix.length() == 7) {
                // yyyy-MM
                int y = Integer.parseInt(prefix.substring(0, 4));
                int m = Integer.parseInt(prefix.substring(5, 7));
                start = LocalDate.of(y, m, 1);
                end = start.plusMonths(1);
            } else if (prefix.length() >= 10) {
                // yyyy-MM-dd
                start = LocalDate.parse(prefix.substring(0, 10));
                end = start.plusDays(1);
            } else {
                return null;
            }
            ZoneId zone = ZoneId.systemDefault();
            return new Date[]{
                    Date.from(start.atStartOfDay(zone).toInstant()),
                    Date.from(end.atStartOfDay(zone).toInstant())
            };
        } catch (Exception e) {
            return null;
        }
    }

    @Override
    public BmsAuthor getById(Integer id) {
        return bmsAuthorMapper.selectByPrimaryKey(id);
    }

    @Override
    public int create(BmsAuthor record) {
        return bmsAuthorMapper.insertSelective(record);
    }

    @Override
    public int updateById(Integer id, BmsAuthor record) {
        record.setId(id);
        return bmsAuthorMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int deleteById(Integer id) {
        return bmsAuthorMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int deleteByIds(List<Integer> ids) {
        if (ids == null || ids.isEmpty()) {
            return 0;
        }
        BmsAuthorExample example = new BmsAuthorExample();
        example.createCriteria().andIdIn(ids);
        return bmsAuthorMapper.deleteByExample(example);
    }
}
