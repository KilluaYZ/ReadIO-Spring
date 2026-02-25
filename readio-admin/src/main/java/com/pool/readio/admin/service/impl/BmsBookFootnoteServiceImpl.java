package com.pool.readio.admin.service.impl;

import com.github.pagehelper.PageHelper;
import com.pool.readio.admin.dto.BmsBookFootnoteQueryParam;
import com.pool.readio.admin.service.BmsBookFootnoteService;
import com.pool.readio.mbg.mapper.BmsBookFootnoteMapper;
import com.pool.readio.mbg.model.BmsBookFootnote;
import com.pool.readio.mbg.model.BmsBookFootnoteExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import java.util.List;

@Service
public class BmsBookFootnoteServiceImpl implements BmsBookFootnoteService {

    @Autowired
    private BmsBookFootnoteMapper bmsBookFootnoteMapper;

    @Override
    public List<BmsBookFootnote> listAll() {
        return bmsBookFootnoteMapper.selectByExample(new BmsBookFootnoteExample());
    }

    @Override
    public List<BmsBookFootnote> list(BmsBookFootnoteQueryParam queryParam, Integer pageNum, Integer pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        BmsBookFootnoteExample example = new BmsBookFootnoteExample();
        example.setOrderByClause("\"order\" ASC, id DESC");
        BmsBookFootnoteExample.Criteria criteria = example.createCriteria();
        if (queryParam != null) {
            if (queryParam.getBookId() != null) {
                criteria.andBookIdEqualTo(queryParam.getBookId());
            }
            if (queryParam.getChapterId() != null) {
                criteria.andChapterIdEqualTo(queryParam.getChapterId());
            }
            if (queryParam.getType() != null) {
                criteria.andTypeEqualTo(queryParam.getType());
            }
            if (StringUtils.hasText(queryParam.getContentKeyword())) {
                criteria.andContentLike("%" + queryParam.getContentKeyword().trim() + "%");
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
        return bmsBookFootnoteMapper.selectByExample(example);
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
    public BmsBookFootnote getById(Integer id) {
        return bmsBookFootnoteMapper.selectByPrimaryKey(id);
    }

    @Override
    public int create(BmsBookFootnote record) {
        return bmsBookFootnoteMapper.insertSelective(record);
    }

    @Override
    public int updateById(Integer id, BmsBookFootnote record) {
        record.setId(id);
        return bmsBookFootnoteMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int deleteById(Integer id) {
        return bmsBookFootnoteMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int deleteByIds(List<Integer> ids) {
        if (ids == null || ids.isEmpty()) {
            return 0;
        }
        BmsBookFootnoteExample example = new BmsBookFootnoteExample();
        example.createCriteria().andIdIn(ids);
        return bmsBookFootnoteMapper.deleteByExample(example);
    }
}
