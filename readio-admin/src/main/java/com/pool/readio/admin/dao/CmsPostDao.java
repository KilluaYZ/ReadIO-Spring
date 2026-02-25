package com.pool.readio.admin.dao;

import com.pool.readio.admin.dto.CmsPostDetail;
import org.apache.ibatis.annotations.Param;

/**
 * 帖子自定义查询 Dao（详情含内容块等）
 * 基础 CRUD 使用 {@link com.pool.readio.mbg.mapper.CmsPostMapper}。
 */
public interface CmsPostDao {

    /**
     * 按主键获取帖子详情，包含按 order 升序排列的内容块列表
     */
    CmsPostDetail getDetail(@Param("id") Integer id);
}
