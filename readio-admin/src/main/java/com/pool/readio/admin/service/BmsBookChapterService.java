package com.pool.readio.admin.service;

import com.pool.readio.admin.dto.BmsBookChapterQueryParam;
import com.pool.readio.mbg.model.BmsBookChapter;

import java.util.List;

/**
 * 书籍章节管理 Service，对应 bms_book_chapter
 */
public interface BmsBookChapterService {

    List<BmsBookChapter> listAll();

    /**
     * 分页条件查询书籍章节列表
     */
    List<BmsBookChapter> list(BmsBookChapterQueryParam queryParam, Integer pageNum, Integer pageSize);

    BmsBookChapter getById(Integer id);

    int create(BmsBookChapter record);

    int updateById(Integer id, BmsBookChapter record);

    int deleteById(Integer id);

    /**
     * 批量删除书籍章节
     */
    int deleteByIds(List<Integer> ids);
}
