package com.pool.readio.admin.dao;

import com.pool.readio.admin.dto.BmsAuthorQueryParam;
import com.pool.readio.mbg.model.BmsAuthor;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 作者自定义查询 Dao（按名称/简介关键字、创建时间等条件查询与批量操作）
 * 基础 CRUD 请使用 {@link com.pool.readio.mbg.mapper.BmsAuthorMapper}。
 */
public interface BmsAuthorDao {

    /**
     * 条件查询作者列表（支持名称、简介关键字、创建时间前缀，按创建时间倒序）
     */
    List<BmsAuthor> getList(@Param("queryParam") BmsAuthorQueryParam queryParam);

    /**
     * 按条件统计作者数量（用于分页）
     */
    long countByCondition(@Param("queryParam") BmsAuthorQueryParam queryParam);

    /**
     * 按主键 ID 获取作者
     */
    BmsAuthor getById(@Param("id") Integer id);

    /**
     * 按名称精确查询（若业务上名称唯一时可使用）
     */
    BmsAuthor getByName(@Param("name") String name);

    /**
     * 按主键 ID 列表批量查询作者
     */
    List<BmsAuthor> listByIds(@Param("ids") List<Integer> ids);

    /**
     * 按主键 ID 列表批量删除
     */
    int deleteByIds(@Param("ids") List<Integer> ids);
}
