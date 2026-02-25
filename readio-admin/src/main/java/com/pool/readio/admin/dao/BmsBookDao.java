package com.pool.readio.admin.dao;

import com.pool.readio.admin.dto.BmsBookQueryParam;
import com.pool.readio.mbg.model.BmsBook;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 书籍自定义查询 Dao（按名称/作者/分类/ISBN 等条件查询与批量操作）
 * 基础 CRUD 请使用 {@link com.pool.readio.mbg.mapper.BmsBookMapper}。
 */
public interface BmsBookDao {

    /**
     * 条件查询书籍列表（支持名称、简介、作者、分类、出版社、ISBN、语言、创建时间），按创建时间倒序
     */
    List<BmsBook> getList(@Param("queryParam") BmsBookQueryParam queryParam);

    /**
     * 按条件统计书籍数量（用于分页）
     */
    long countByCondition(@Param("queryParam") BmsBookQueryParam queryParam);

    /**
     * 按主键 ID 获取书籍
     */
    BmsBook getById(@Param("id") Integer id);

    /**
     * 按 ISBN 精确查询（若业务上 ISBN 唯一）
     */
    BmsBook getByIsbn(@Param("isbn") String isbn);

    /**
     * 按主键 ID 列表批量查询书籍
     */
    List<BmsBook> listByIds(@Param("ids") List<Integer> ids);

    /**
     * 按作者 ID 查询书籍列表（按创建时间倒序）
     */
    List<BmsBook> listByAuthorId(@Param("authorId") Integer authorId);

    /**
     * 按书籍分类 ID 查询书籍列表（按创建时间倒序）
     */
    List<BmsBook> listByBookCategoryId(@Param("bookCategoryId") Integer bookCategoryId);

    /**
     * 按出版社 ID 查询书籍列表（按创建时间倒序）
     */
    List<BmsBook> listByPublisherId(@Param("publisherId") Integer publisherId);

    /**
     * 按主键 ID 列表批量删除
     */
    int deleteByIds(@Param("ids") List<Integer> ids);
}
