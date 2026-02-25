package com.pool.readio.admin.dao;

import com.pool.readio.mbg.model.BmsBookSelectContent;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 选中段落（划线）自定义查询：按书籍、用户+书籍等条件
 */
public interface BmsBookSelectContentDao {

    /**
     * 查询某本书下所有用户的划线（任意一条 item 的 block 属于该书即计入）
     */
    List<BmsBookSelectContent> listByBookId(@Param("bookId") Integer bookId);

    /**
     * 查询某用户在某本书上的划线
     */
    List<BmsBookSelectContent> listByMemberIdAndBookId(@Param("memberId") Integer memberId, @Param("bookId") Integer bookId);
}
