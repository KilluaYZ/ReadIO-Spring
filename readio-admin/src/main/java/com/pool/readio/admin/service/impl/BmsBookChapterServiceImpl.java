package com.pool.readio.admin.service.impl;

import com.github.pagehelper.PageHelper;
import com.pool.readio.admin.dto.BmsBookChapterQueryParam;
import com.pool.readio.admin.service.BmsBookChapterService;
import com.pool.readio.mbg.mapper.BmsBookChapterMapper;
import com.pool.readio.mbg.model.BmsBookChapter;
import com.pool.readio.mbg.model.BmsBookChapterExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import java.util.List;

@Service
public class BmsBookChapterServiceImpl implements BmsBookChapterService {

    @Autowired
    private BmsBookChapterMapper bmsBookChapterMapper;

    @Override
    public List<BmsBookChapter> listAll() {
        return bmsBookChapterMapper.selectByExample(new BmsBookChapterExample());
    }

    @Override
    public List<BmsBookChapter> list(BmsBookChapterQueryParam queryParam, Integer pageNum, Integer pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        BmsBookChapterExample example = new BmsBookChapterExample();
        example.setOrderByClause("\"order\" ASC, id DESC");
        BmsBookChapterExample.Criteria criteria = example.createCriteria();
        if (queryParam != null) {
            if (queryParam.getBookId() != null) {
                criteria.andBookIdEqualTo(queryParam.getBookId());
            }
            if (StringUtils.hasText(queryParam.getNameKeyword())) {
                criteria.andNameLike("%" + queryParam.getNameKeyword().trim() + "%");
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
        return bmsBookChapterMapper.selectByExample(example);
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
    public BmsBookChapter getById(Integer id) {
        return bmsBookChapterMapper.selectByPrimaryKey(id);
    }

    @Override
    public int create(BmsBookChapter record) {
        return bmsBookChapterMapper.insertSelective(record);
    }

    @Override
    public int updateById(Integer id, BmsBookChapter record) {
        record.setId(id);
        return bmsBookChapterMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int deleteById(Integer id) {
        return bmsBookChapterMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int deleteByIds(List<Integer> ids) {
        if (ids == null || ids.isEmpty()) {
            return 0;
        }
        BmsBookChapterExample example = new BmsBookChapterExample();
        example.createCriteria().andIdIn(ids);
        return bmsBookChapterMapper.deleteByExample(example);
    }
}
