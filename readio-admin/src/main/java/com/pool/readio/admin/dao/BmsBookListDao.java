package com.pool.readio.admin.dao;

import com.pool.readio.admin.dto.BmsBookListQueryParam;
import com.pool.readio.mbg.model.BmsBookList;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 书单自定义查询 Dao（按名称/是否隐藏等条件查询与批量操作）
 * 基础 CRUD 请使用 {@link com.pool.readio.mbg.mapper.BmsBookListMapper}。
 */
public interface BmsBookListDao {

    /**
     * 条件查询书单列表（支持名称、简介、是否隐藏、创建时间），按创建时间倒序
     */
    List<BmsBookList> getList(@Param("queryParam") BmsBookListQueryParam queryParam);

    /**
     * 按条件统计书单数量（用于分页）
     */
    long countByCondition(@Param("queryParam") BmsBookListQueryParam queryParam);

    /**
     * 按主键 ID 获取书单
     */
    BmsBookList getById(@Param("id") Integer id);

    /**
     * 按名称精确查询（若业务上书单名称唯一）
     */
    BmsBookList getByName(@Param("name") String name);

    /**
     * 按主键 ID 列表批量查询书单
     */
    List<BmsBookList> listByIds(@Param("ids") List<Integer> ids);

    /**
     * 查询未隐藏的书单列表（按创建时间倒序，用于前台展示）
     */
    List<BmsBookList> listVisible();

    /**
     * 按主键 ID 列表批量删除
     */
    int deleteByIds(@Param("ids") List<Integer> ids);
}
