package com.pool.readio.admin.service;

import com.pool.readio.admin.dto.CmsPostDetail;
import com.pool.readio.mbg.model.CmsPost;

import java.util.List;

/**
 * 帖子管理 Service，对应 cms_post
 */
public interface CmsPostService {

    List<CmsPost> listAll();

    /**
     * 分页获取帖子列表
     *
     * @param pageNum  页码，从 1 开始
     * @param pageSize 每页条数
     * @return 当前页帖子列表（PageHelper 会包装分页信息）
     */
    List<CmsPost> list(Integer pageNum, Integer pageSize);

    CmsPost getById(Integer id);

    /**
     * 按 ID 获取帖子详情，包含按 order 排序的内容块列表
     */
    CmsPostDetail getDetailById(Integer id);

    int create(CmsPost record);

    int updateById(Integer id, CmsPost record);

    int deleteById(Integer id);
}
