package com.pool.readio.admin.dao;

import com.pool.readio.admin.dto.BmsBookFootnoteQueryParam;
import com.pool.readio.mbg.model.BmsBookFootnote;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 书籍脚注自定义查询 Dao（按书籍/章节/类型等条件查询与批量操作）
 * 基础 CRUD 请使用 {@link com.pool.readio.mbg.mapper.BmsBookFootnoteMapper}。
 */
public interface BmsBookFootnoteDao {

    /**
     * 条件查询脚注列表（支持书籍、章节、类型、内容、创建时间），按 order 升序、创建时间倒序
     */
    List<BmsBookFootnote> getList(@Param("queryParam") BmsBookFootnoteQueryParam queryParam);

    /**
     * 按条件统计脚注数量（用于分页）
     */
    long countByCondition(@Param("queryParam") BmsBookFootnoteQueryParam queryParam);

    /**
     * 按主键 ID 获取脚注
     */
    BmsBookFootnote getById(@Param("id") Integer id);

    /**
     * 按书籍 ID 查询脚注列表（按 order 升序）
     */
    List<BmsBookFootnote> listByBookId(@Param("bookId") Integer bookId);

    /**
     * 按章节 ID 查询脚注列表（按 order 升序）
     */
    List<BmsBookFootnote> listByChapterId(@Param("chapterId") Integer chapterId);

    /**
     * 按主键 ID 列表批量查询
     */
    List<BmsBookFootnote> listByIds(@Param("ids") List<Integer> ids);

    /**
     * 按主键 ID 列表批量删除
     */
    int deleteByIds(@Param("ids") List<Integer> ids);
}
