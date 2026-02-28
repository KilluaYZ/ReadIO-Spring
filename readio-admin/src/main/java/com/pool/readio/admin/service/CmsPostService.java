package com.pool.readio.admin.service;

import com.pool.readio.admin.dto.CmsPostContentBlockParam;
import com.pool.readio.admin.dto.CmsPostDetail;
import com.pool.readio.admin.dto.CmsMemberPreferPostStatusResult;
import com.pool.readio.mbg.model.CmsPost;
import com.pool.readio.mbg.model.UmsMember;

import java.util.List;

/**
 * 帖子管理 Service，对应 cms_post
 */
public interface CmsPostService {

    List<CmsPost> listAll();

    /**
     * 分页获取帖子列表
     *
     * @param pageNum  页码，从 1 开始
     * @param pageSize 每页条数
     * @return 当前页帖子列表（PageHelper 会包装分页信息）
     */
    List<CmsPost> list(Integer pageNum, Integer pageSize);

    CmsPost getById(Integer id);

    /**
     * 按 ID 获取帖子详情，包含按 order 排序的内容块列表
     */
    CmsPostDetail getDetailById(Integer id);

    /**
     * 向指定帖子追加一个内容块（如一段文本），类型默认为 0（文本）
     *
     * @param postId 帖子 ID
     * @param param  内容块参数（content 必填，type 可选默认 0）
     * @return 新内容块 ID，帖子不存在或 content 为空时返回 null
     */
    Integer addContentBlock(Integer postId, CmsPostContentBlockParam param);

    /**
     * 删除指定帖子的全部内容块
     *
     * @param postId 帖子 ID
     * @return 删除的条数，帖子不存在返回 0
     */
    int deleteContentBlocksByPostId(Integer postId);

    int create(CmsPost record);

    int updateById(Integer id, CmsPost record);

    int deleteById(Integer id);

    /* 帖子标签 */
    int createTag(Integer PostId, List<String> tagNames);

    int deleteTag(Integer PostId, List<String> tagNames);

    List<String> getTagNames(Integer PostId); // 获取帖子标签名称列表

    List<CmsPost> getPostsByTagNames(String tagNames); // 根据标签名称列表获取帖子列表

    // ---------------- 用户喜好（喜欢/收藏/不喜欢）相关 ----------------

    int addMemberPrefer(Integer memberId, Integer postId, Integer type);

    int removeMemberPrefer(Integer memberId, Integer postId, Integer type);

    long countMemberPreferByPost(Integer postId, Integer type);

    List<UmsMember> listMembersByPostAndPreferType(Integer postId, Integer type);

    List<CmsPost> listPostsByMemberAndPreferType(Integer memberId, Integer type);

    CmsMemberPreferPostStatusResult getMemberPreferStatus(Integer memberId, Integer postId);
}
