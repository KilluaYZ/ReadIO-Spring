package com.pool.readio.admin.service;

import com.pool.readio.admin.dto.BmsBookChapterWithBlocksDto;
import com.pool.readio.admin.dto.BmsBookContentBlockQueryParam;
import com.pool.readio.mbg.model.BmsBookContentBlock;

import java.util.List;

/**
 * 书籍内容块管理 Service，对应 bms_book_content_block
 */
public interface BmsBookContentBlockService {

    List<BmsBookContentBlock> listAll();

    /**
     * 根据章节ID获取该章节所有内容块，按顺序排列
     */
    List<BmsBookContentBlock> listByChapterId(Integer chapterId);

    /**
     * 根据书籍ID获取该书所有章节（含各章节内容块），章节与内容块均按顺序排列
     */
    List<BmsBookChapterWithBlocksDto> listChaptersWithBlocksByBookId(Integer bookId);

    /**
     * 分页条件查询书籍内容块列表
     */
    List<BmsBookContentBlock> list(BmsBookContentBlockQueryParam queryParam, Integer pageNum, Integer pageSize);

    BmsBookContentBlock getById(Integer id);

    int create(BmsBookContentBlock record);

    int updateById(Integer id, BmsBookContentBlock record);

    int deleteById(Integer id);

    /**
     * 批量删除书籍内容块
     */
    int deleteByIds(List<Integer> ids);
}
