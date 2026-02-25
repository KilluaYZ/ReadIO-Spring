package com.pool.readio.admin.service.impl;

import com.github.pagehelper.PageHelper;
import com.pool.readio.admin.dto.BmsBookCategoryQueryParam;
import com.pool.readio.admin.service.BmsBookCategoryService;
import com.pool.readio.mbg.mapper.BmsBookCategoryMapper;
import com.pool.readio.mbg.model.BmsBookCategory;
import com.pool.readio.mbg.model.BmsBookCategoryExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import java.util.List;

@Service
public class BmsBookCategoryServiceImpl implements BmsBookCategoryService {

    @Autowired
    private BmsBookCategoryMapper bmsBookCategoryMapper;

    @Override
    public List<BmsBookCategory> listAll() {
        return bmsBookCategoryMapper.selectByExample(new BmsBookCategoryExample());
    }

    @Override
    public List<BmsBookCategory> list(BmsBookCategoryQueryParam queryParam, Integer pageNum, Integer pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        BmsBookCategoryExample example = new BmsBookCategoryExample();
        example.setOrderByClause("id DESC");
        BmsBookCategoryExample.Criteria criteria = example.createCriteria();
        if (queryParam != null) {
            if (StringUtils.hasText(queryParam.getNameKeyword())) {
                criteria.andNameLike("%" + queryParam.getNameKeyword().trim() + "%");
            }
            if (StringUtils.hasText(queryParam.getKeyKeyword())) {
                criteria.andKeyLike("%" + queryParam.getKeyKeyword().trim() + "%");
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
        return bmsBookCategoryMapper.selectByExample(example);
    }

    private Date[] parseCreateTimePrefix(String prefix) {
        if (prefix == null || prefix.isEmpty()) {
            return null;
        }
        try {
            LocalDate start;
            LocalDate end;
            if (prefix.length() == 4) {
                start = LocalDate.of(Integer.parseInt(prefix), 1, 1);
                end = start.plusYears(1);
            } else if (prefix.length() == 7) {
                int y = Integer.parseInt(prefix.substring(0, 4));
                int m = Integer.parseInt(prefix.substring(5, 7));
                start = LocalDate.of(y, m, 1);
                end = start.plusMonths(1);
            } else if (prefix.length() >= 10) {
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
    public BmsBookCategory getById(Integer id) {
        return bmsBookCategoryMapper.selectByPrimaryKey(id);
    }

    @Override
    public int create(BmsBookCategory record) {
        return bmsBookCategoryMapper.insertSelective(record);
    }

    @Override
    public int updateById(Integer id, BmsBookCategory record) {
        record.setId(id);
        return bmsBookCategoryMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int deleteById(Integer id) {
        return bmsBookCategoryMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int deleteByIds(List<Integer> ids) {
        if (ids == null || ids.isEmpty()) {
            return 0;
        }
        BmsBookCategoryExample example = new BmsBookCategoryExample();
        example.createCriteria().andIdIn(ids);
        return bmsBookCategoryMapper.deleteByExample(example);
    }
}
