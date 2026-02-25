package com.pool.readio.admin.service;

import com.pool.readio.admin.dto.BmsBookCategoryQueryParam;
import com.pool.readio.mbg.model.BmsBookCategory;

import java.util.List;

/**
 * 书籍分类管理 Service，对应 bms_book_category
 */
public interface BmsBookCategoryService {

    List<BmsBookCategory> listAll();

    /**
     * 分页条件查询书籍分类列表
     */
    List<BmsBookCategory> list(BmsBookCategoryQueryParam queryParam, Integer pageNum, Integer pageSize);

    BmsBookCategory getById(Integer id);

    int create(BmsBookCategory record);

    int updateById(Integer id, BmsBookCategory record);

    int deleteById(Integer id);

    /**
     * 批量删除书籍分类
     */
    int deleteByIds(List<Integer> ids);
}
