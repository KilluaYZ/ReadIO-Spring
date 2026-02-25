package com.pool.readio.admin.dao;

import com.pool.readio.admin.dto.BmsBookChapterQueryParam;
import com.pool.readio.mbg.model.BmsBookChapter;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 书籍章节自定义查询 Dao（按书籍、章节名等条件查询与批量操作）
 * 基础 CRUD 请使用 {@link com.pool.readio.mbg.mapper.BmsBookChapterMapper}。
 */
public interface BmsBookChapterDao {

    /**
     * 条件查询章节列表（支持书籍ID、章节名、创建时间），按章节顺序、创建时间排序
     */
    List<BmsBookChapter> getList(@Param("queryParam") BmsBookChapterQueryParam queryParam);

    /**
     * 按条件统计章节数量（用于分页）
     */
    long countByCondition(@Param("queryParam") BmsBookChapterQueryParam queryParam);

    /**
     * 按主键 ID 获取章节
     */
    BmsBookChapter getById(@Param("id") Integer id);

    /**
     * 按书籍 ID 查询章节列表（按 order 升序，保证阅读顺序）
     */
    List<BmsBookChapter> listByBookId(@Param("bookId") Integer bookId);

    /**
     * 按主键 ID 列表批量查询章节
     */
    List<BmsBookChapter> listByIds(@Param("ids") List<Integer> ids);

    /**
     * 按主键 ID 列表批量删除
     */
    int deleteByIds(@Param("ids") List<Integer> ids);
}
