package com.pool.readio.admin.service;

import com.pool.readio.admin.dto.BmsAuthorQueryParam;
import com.pool.readio.mbg.model.BmsAuthor;

import java.util.List;

/**
 * 作者管理 Service，对应 bms_author
 */
public interface BmsAuthorService {

    List<BmsAuthor> listAll();

    /**
     * 分页条件查询作者列表
     */
    List<BmsAuthor> list(BmsAuthorQueryParam queryParam, Integer pageNum, Integer pageSize);

    BmsAuthor getById(Integer id);

    int create(BmsAuthor record);

    int updateById(Integer id, BmsAuthor record);

    int deleteById(Integer id);

    /**
     * 批量删除作者
     */
    int deleteByIds(List<Integer> ids);
}
