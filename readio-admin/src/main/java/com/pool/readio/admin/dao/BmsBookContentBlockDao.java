package com.pool.readio.admin.dao;

import com.pool.readio.admin.dto.BmsBookContentBlockQueryParam;
import com.pool.readio.mbg.model.BmsBookContentBlock;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 书籍内容块自定义查询 Dao（按书籍/章节/类型等条件查询与批量操作）
 * 基础 CRUD 请使用 {@link com.pool.readio.mbg.mapper.BmsBookContentBlockMapper}。
 */
public interface BmsBookContentBlockDao {

    /**
     * 条件查询内容块列表（支持书籍、章节、脚注、类型、内容关键字），按 order 升序
     */
    List<BmsBookContentBlock> getList(@Param("queryParam") BmsBookContentBlockQueryParam queryParam);

    /**
     * 按条件统计内容块数量（用于分页）
     */
    long countByCondition(@Param("queryParam") BmsBookContentBlockQueryParam queryParam);

    /**
     * 按主键 ID 获取内容块
     */
    BmsBookContentBlock getById(@Param("id") Integer id);

    /**
     * 按书籍 ID 查询内容块列表（按 order 升序）
     */
    List<BmsBookContentBlock> listByBookId(@Param("bookId") Integer bookId);

    /**
     * 按章节 ID 查询内容块列表（按 order 升序）
     */
    List<BmsBookContentBlock> listByChapterId(@Param("chapterId") Integer chapterId);

    /**
     * 按脚注 ID 查询内容块列表（按 order 升序）
     */
    List<BmsBookContentBlock> listByFootnoteId(@Param("footnoteId") Integer footnoteId);

    /**
     * 按主键 ID 列表批量查询
     */
    List<BmsBookContentBlock> listByIds(@Param("ids") List<Integer> ids);

    /**
     * 按主键 ID 列表批量删除
     */
    int deleteByIds(@Param("ids") List<Integer> ids);
}
