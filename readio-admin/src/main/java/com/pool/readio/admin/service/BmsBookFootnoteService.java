package com.pool.readio.admin.service;

import com.pool.readio.admin.dto.BmsBookFootnoteQueryParam;
import com.pool.readio.mbg.model.BmsBookFootnote;

import java.util.List;

/**
 * 书籍脚注管理 Service，对应 bms_book_footnote
 */
public interface BmsBookFootnoteService {

    List<BmsBookFootnote> listAll();

    /**
     * 分页条件查询书籍脚注列表
     */
    List<BmsBookFootnote> list(BmsBookFootnoteQueryParam queryParam, Integer pageNum, Integer pageSize);

    BmsBookFootnote getById(Integer id);

    int create(BmsBookFootnote record);

    int updateById(Integer id, BmsBookFootnote record);

    int deleteById(Integer id);

    /**
     * 批量删除书籍脚注
     */
    int deleteByIds(List<Integer> ids);
}
