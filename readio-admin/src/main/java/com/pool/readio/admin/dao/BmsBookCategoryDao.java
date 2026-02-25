package com.pool.readio.admin.dao;

import com.pool.readio.admin.dto.BmsBookCategoryQueryParam;
import com.pool.readio.mbg.model.BmsBookCategory;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 书籍分类自定义查询 Dao（按名称/代表字母等条件查询与批量操作）
 * 基础 CRUD 请使用 {@link com.pool.readio.mbg.mapper.BmsBookCategoryMapper}。
 */
public interface BmsBookCategoryDao {

    /**
     * 条件查询分类列表（支持名称、代表字母、创建时间），按创建时间倒序
     */
    List<BmsBookCategory> getList(@Param("queryParam") BmsBookCategoryQueryParam queryParam);

    /**
     * 按条件统计分类数量（用于分页）
     */
    long countByCondition(@Param("queryParam") BmsBookCategoryQueryParam queryParam);

    /**
     * 按主键 ID 获取分类
     */
    BmsBookCategory getById(@Param("id") Integer id);

    /**
     * 按代表字母精确查询（若业务上 key 唯一）
     */
    BmsBookCategory getByKey(@Param("key") String key);

    /**
     * 按主键 ID 列表批量查询分类
     */
    List<BmsBookCategory> listByIds(@Param("ids") List<Integer> ids);

    /**
     * 按主键 ID 列表批量删除
     */
    int deleteByIds(@Param("ids") List<Integer> ids);
}
