package com.pool.readio.admin.service;

import com.pool.readio.admin.dto.CmsMemberPreferCommentStatusResult;
import com.pool.readio.mbg.model.CmsComment;
import com.pool.readio.mbg.model.UmsMember;

import java.util.List;

/**
 * 评论管理 Service，对应 cms_comment
 * type: 0->帖子评论；1->回复评论；2->书籍评论；3->选中段落评论
 */
public interface CmsCommentService {

    List<CmsComment> listAll();

    /** 分页条件查询，可选 type、memberId、bookId、postId、selectId、commentId、contentKeyword */
    List<CmsComment> list(Integer type, Integer memberId, Integer bookId, Integer postId,
                           Integer selectId, Integer commentId, String contentKeyword,
                           Integer pageNum, Integer pageSize);

    CmsComment getById(Integer id);

    /** 按帖子ID查询评论（全部） */
    List<CmsComment> listByPostId(Integer postId);

    /** 按帖子ID分页查询 */
    List<CmsComment> listByPostIdPage(Integer postId, Integer pageNum, Integer pageSize);

    /** 按书籍ID查询评论（全部） */
    List<CmsComment> listByBookId(Integer bookId);

    /** 按书籍ID分页查询 */
    List<CmsComment> listByBookIdPage(Integer bookId, Integer pageNum, Integer pageSize);

    /** 按选中段落ID查询评论（全部） */
    List<CmsComment> listBySelectId(Integer selectId);

    /** 按选中段落ID分页查询 */
    List<CmsComment> listBySelectIdPage(Integer selectId, Integer pageNum, Integer pageSize);

    /** 查询某条评论的回复（全部） */
    List<CmsComment> listRepliesByCommentId(Integer commentId);

    /** 分页查询某条评论的回复 */
    List<CmsComment> listRepliesByCommentIdPage(Integer commentId, Integer pageNum, Integer pageSize);

    int create(CmsComment record);

    int updateById(Integer id, CmsComment record);

    int deleteById(Integer id);

    int deleteByIds(List<Integer> ids);

    // ---------------- 用户喜好（喜欢/收藏/不喜欢）相关 ----------------

    /**
     * 增加用户对评论的喜好关系
     *
     * @param memberId  用户ID
     * @param commentId 评论ID
     * @param type      喜好类型：0->喜欢；1->收藏；2->不喜欢
     */
    int addMemberPrefer(Integer memberId, Integer commentId, Integer type);

    /**
     * 删除用户对评论的喜好关系
     */
    int removeMemberPrefer(Integer memberId, Integer commentId, Integer type);

    /**
     * 统计某评论在指定喜好类型下的用户数量
     */
    long countMemberPreferByComment(Integer commentId, Integer type);

    /**
     * 获取某评论在指定喜好类型下的用户列表
     */
    List<UmsMember> listMembersByCommentAndPreferType(Integer commentId, Integer type);

    /**
     * 获取某个用户在指定喜好类型下的评论列表
     */
    List<CmsComment> listCommentsByMemberAndPreferType(Integer memberId, Integer type);

    /**
     * 获取某个用户对指定评论的喜好状态
     *
     * @param memberId  用户ID
     * @param commentId 评论ID
     * @return 包含是否喜欢/收藏/不喜欢的状态
     */
    CmsMemberPreferCommentStatusResult getMemberPreferStatus(Integer memberId, Integer commentId);
}
