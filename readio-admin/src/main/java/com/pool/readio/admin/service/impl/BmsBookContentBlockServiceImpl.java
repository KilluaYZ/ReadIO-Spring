package com.pool.readio.admin.service.impl;

import com.github.pagehelper.PageHelper;
import com.pool.readio.admin.dto.BmsBookChapterWithBlocksDto;
import com.pool.readio.admin.dto.BmsBookContentBlockQueryParam;
import com.pool.readio.admin.service.BmsBookContentBlockService;
import com.pool.readio.admin.service.BmsBookChapterService;
import com.pool.readio.mbg.mapper.BmsBookContentBlockMapper;
import com.pool.readio.mbg.model.BmsBookChapter;
import com.pool.readio.mbg.model.BmsBookContentBlock;
import com.pool.readio.mbg.model.BmsBookContentBlockExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

@Service
public class BmsBookContentBlockServiceImpl implements BmsBookContentBlockService {

    @Autowired
    private BmsBookContentBlockMapper bmsBookContentBlockMapper;

    @Autowired
    private BmsBookChapterService bmsBookChapterService;

    @Override
    public List<BmsBookContentBlock> listAll() {
        return bmsBookContentBlockMapper.selectByExample(new BmsBookContentBlockExample());
    }

    @Override
    public List<BmsBookContentBlock> listByChapterId(Integer chapterId) {
        if (chapterId == null) {
            return List.of();
        }
        BmsBookContentBlockExample example = new BmsBookContentBlockExample();
        example.createCriteria().andChapterIdEqualTo(chapterId);
        example.setOrderByClause("order_id ASC, id ASC");
        return bmsBookContentBlockMapper.selectByExample(example);
    }

    @Override
    public List<BmsBookChapterWithBlocksDto> listChaptersWithBlocksByBookId(Integer bookId) {
        if (bookId == null) {
            return List.of();
        }
        List<BmsBookChapter> chapters = bmsBookChapterService.listByBookId(bookId);
        List<BmsBookChapterWithBlocksDto> result = new ArrayList<>(chapters.size());
        for (BmsBookChapter chapter : chapters) {
            BmsBookChapterWithBlocksDto dto = new BmsBookChapterWithBlocksDto();
            dto.setChapter(chapter);
            dto.setContentBlocks(listByChapterId(chapter.getId()));
            result.add(dto);
        }
        return result;
    }

    @Override
    public List<BmsBookContentBlock> list(BmsBookContentBlockQueryParam queryParam, Integer pageNum, Integer pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        BmsBookContentBlockExample example = new BmsBookContentBlockExample();
        example.setOrderByClause("order_id ASC, id DESC");
        BmsBookContentBlockExample.Criteria criteria = example.createCriteria();
        if (queryParam != null) {
            if (queryParam.getBookId() != null) {
                criteria.andBookIdEqualTo(queryParam.getBookId());
            }
            if (queryParam.getChapterId() != null) {
                criteria.andChapterIdEqualTo(queryParam.getChapterId());
            }
            if (queryParam.getFootnoteId() != null) {
                criteria.andFootnoteIdEqualTo(queryParam.getFootnoteId());
            }
            if (queryParam.getType() != null) {
                criteria.andTypeEqualTo(queryParam.getType());
            }
            if (StringUtils.hasText(queryParam.getContentKeyword())) {
                criteria.andContentLike("%" + queryParam.getContentKeyword().trim() + "%");
            }
        }
        return bmsBookContentBlockMapper.selectByExample(example);
    }

    @Override
    public BmsBookContentBlock getById(Integer id) {
        return bmsBookContentBlockMapper.selectByPrimaryKey(id);
    }

    @Override
    public int create(BmsBookContentBlock record) {
        return bmsBookContentBlockMapper.insertSelective(record);
    }

    @Override
    public int updateById(Integer id, BmsBookContentBlock record) {
        record.setId(id);
        return bmsBookContentBlockMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int deleteById(Integer id) {
        return bmsBookContentBlockMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int deleteByIds(List<Integer> ids) {
        if (ids == null || ids.isEmpty()) {
            return 0;
        }
        BmsBookContentBlockExample example = new BmsBookContentBlockExample();
        example.createCriteria().andIdIn(ids);
        return bmsBookContentBlockMapper.deleteByExample(example);
    }
}
