package com.pool.readio.admin.service.impl;

import com.github.pagehelper.PageHelper;
import com.pool.readio.admin.dao.CmsPostDao;
import com.pool.readio.admin.dto.CmsPostContentBlockParam;
import com.pool.readio.admin.dto.CmsPostDetail;
import com.pool.readio.admin.dto.CmsMemberPreferPostStatusResult;
import com.pool.readio.admin.service.CmsPostService;
import com.pool.readio.mbg.mapper.CmsPostContentBlockMapper;
import com.pool.readio.mbg.mapper.CmsPostMapper;
import com.pool.readio.mbg.mapper.CmsMemberPreferPostRelationMapper;
import com.pool.readio.mbg.mapper.UmsMemberMapper;
import com.pool.readio.mbg.model.CmsPost;
import com.pool.readio.mbg.model.CmsPostContentBlock;
import com.pool.readio.mbg.model.CmsPostContentBlockExample;
import com.pool.readio.mbg.model.CmsPostExample;
import com.pool.readio.mbg.model.CmsMemberPreferPostRelation;
import com.pool.readio.mbg.model.CmsMemberPreferPostRelationExample;
import com.pool.readio.mbg.model.UmsMember;
import com.pool.readio.mbg.model.UmsMemberExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import com.pool.readio.mbg.model.CmsPostTagExample;
import com.pool.readio.mbg.model.CmsPostTag;
import com.pool.readio.mbg.mapper.CmsPostTagMapper;
import com.pool.readio.mbg.mapper.CmsPostTagRelationMapper;
import com.pool.readio.mbg.model.CmsPostTagRelation;
import com.pool.readio.mbg.model.CmsPostTagRelationExample;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


@Service
public class CmsPostServiceImpl implements CmsPostService {

    @Autowired
    private CmsPostMapper cmsPostMapper;

    @Autowired
    private CmsPostDao cmsPostDao;

    @Autowired
    private CmsPostContentBlockMapper cmsPostContentBlockMapper;

    @Autowired
    private CmsPostTagMapper cmsPostTagMapper;

    @Autowired
    private CmsPostTagRelationMapper cmsPostTagRelationMapper;

    @Autowired
    private CmsMemberPreferPostRelationMapper cmsMemberPreferPostRelationMapper;

    @Autowired
    private UmsMemberMapper umsMemberMapper;

    @Override
    public List<CmsPost> listAll() {
        return cmsPostMapper.selectByExample(new CmsPostExample());
    }

    @Override
    public List<CmsPost> list(Integer pageNum, Integer pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        return cmsPostMapper.selectByExample(new CmsPostExample());
    }

    @Override
    public CmsPost getById(Integer id) {
        return cmsPostMapper.selectByPrimaryKey(id);
    }

    @Override
    public CmsPostDetail getDetailById(Integer id) {
        return cmsPostDao.getDetail(id);
    }

    @Override
    public Integer addContentBlock(Integer postId, CmsPostContentBlockParam param) {
        if (postId == null || param == null || !StringUtils.hasText(param.getContent())) {
            return null;
        }
        if (cmsPostMapper.selectByPrimaryKey(postId) == null) {
            return null;
        }
        CmsPostContentBlock block = new CmsPostContentBlock();
        block.setPostId(postId);
        block.setType(param.getType() != null ? param.getType() : 0);
        block.setContent(param.getContent().trim());
        cmsPostContentBlockMapper.insertSelective(block);
        return block.getId();
    }

    @Override
    public int deleteContentBlocksByPostId(Integer postId) {
        if (postId == null) {
            return 0;
        }
        CmsPostContentBlockExample example = new CmsPostContentBlockExample();
        example.createCriteria().andPostIdEqualTo(postId);
        return cmsPostContentBlockMapper.deleteByExample(example);
    }

    @Override
    public int create(CmsPost record) {
        return cmsPostMapper.insertSelective(record);
    }

    @Override
    public int updateById(Integer id, CmsPost record) {
        record.setId(id);
        return cmsPostMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int deleteById(Integer id) {
        return cmsPostMapper.deleteByPrimaryKey(id);
    }

    @Override 
    public int createTag(Integer PostId, List<String> tagNames) {
        if (PostId == null || tagNames == null || tagNames.isEmpty())
            return 0;
        if (cmsPostMapper.selectByPrimaryKey(PostId) == null)
            return 0;

        // 检查一下tag是否存在，如果不存在就创建一个新的
        for (String tagName : tagNames) {
            CmsPostTagExample example = new CmsPostTagExample();
            example.createCriteria().andNameEqualTo(tagName);
            List<CmsPostTag> tags = cmsPostTagMapper.selectByExample(example);
            if (tags.isEmpty()) {
                CmsPostTag tag = new CmsPostTag();
                tag.setName(tagName);
                cmsPostTagMapper.insertSelective(tag);
            }
        }
        
        // 创建帖子标签关系（使用已存在的 tag id）
        for (String tagName : tagNames) {
            CmsPostTagExample ex = new CmsPostTagExample();
            ex.createCriteria().andNameEqualTo(tagName);
            List<CmsPostTag> tags = cmsPostTagMapper.selectByExample(ex);
            if (tags.isEmpty()) continue;
            CmsPostTag tag = tags.get(0);
            CmsPostTagRelation tagRelation = new CmsPostTagRelation();
            tagRelation.setPostId(PostId);
            tagRelation.setTagId(tag.getId());
            cmsPostTagRelationMapper.insertSelective(tagRelation);
        }

        return tagNames.size();
    }

    @Override
    public int deleteTag(Integer PostId, List<String> tagNames) {
        if (PostId == null || tagNames == null || tagNames.isEmpty())
            return 0;
        if (cmsPostMapper.selectByPrimaryKey(PostId) == null)
            return 0;
        int deleted = 0;
        for (String tagName : tagNames) {
            CmsPostTagExample tagEx = new CmsPostTagExample();
            tagEx.createCriteria().andNameEqualTo(tagName);
            List<CmsPostTag> tags = cmsPostTagMapper.selectByExample(tagEx);
            for (CmsPostTag tag : tags) {
                CmsPostTagRelationExample relEx = new CmsPostTagRelationExample();
                relEx.createCriteria().andPostIdEqualTo(PostId).andTagIdEqualTo(tag.getId());
                deleted += cmsPostTagRelationMapper.deleteByExample(relEx);
            }
        }
        return deleted;
    }

    @Override
    public List<String> getTagNames(Integer PostId) {
        if (PostId == null)
            return new ArrayList<>();
        if (cmsPostMapper.selectByPrimaryKey(PostId) == null)
            return new ArrayList<>();
        CmsPostTagRelationExample relEx = new CmsPostTagRelationExample();
        relEx.createCriteria().andPostIdEqualTo(PostId);
        List<CmsPostTagRelation> relations = cmsPostTagRelationMapper.selectByExample(relEx);
        List<String> names = new ArrayList<>();
        for (CmsPostTagRelation rel : relations) {
            CmsPostTag tag = cmsPostTagMapper.selectByPrimaryKey(rel.getTagId());
            if (tag != null && tag.getName() != null)
                names.add(tag.getName());
        }
        return names;
    }

    @Override
    public List<CmsPost> getPostsByTagNames(String tagName) {
        if (tagName == null || !StringUtils.hasText(tagName))
            return new ArrayList<>();
        CmsPostTagExample tagEx = new CmsPostTagExample();
        tagEx.createCriteria().andNameEqualTo(tagName.trim());
        List<CmsPostTag> tags = cmsPostTagMapper.selectByExample(tagEx);
        if (tags.isEmpty())
            return new ArrayList<>();
        List<Integer> tagIds = tags.stream().map(CmsPostTag::getId).collect(Collectors.toList());
        List<Integer> postIds = new ArrayList<>();
        for (Integer tagId : tagIds) {
            CmsPostTagRelationExample relEx = new CmsPostTagRelationExample();
            relEx.createCriteria().andTagIdEqualTo(tagId);
            List<CmsPostTagRelation> relations = cmsPostTagRelationMapper.selectByExample(relEx);
            for (CmsPostTagRelation rel : relations) {
                if (!postIds.contains(rel.getPostId()))
                    postIds.add(rel.getPostId());
            }
        }
        List<CmsPost> posts = new ArrayList<>();
        for (Integer postId : postIds) {
            CmsPost post = cmsPostMapper.selectByPrimaryKey(postId);
            if (post != null)
                posts.add(post);
        }
        return posts;
    }

    // ---------------- 用户喜好（喜欢/收藏/不喜欢）相关 ----------------

    @Override
    public int addMemberPrefer(Integer memberId, Integer postId, Integer type) {
        if (memberId == null || postId == null || type == null) {
            return 0;
        }
        CmsMemberPreferPostRelationExample ex = new CmsMemberPreferPostRelationExample();
        ex.createCriteria()
                .andMemberIdEqualTo(memberId)
                .andPostIdEqualTo(postId)
                .andTypeEqualTo(type);
        cmsMemberPreferPostRelationMapper.deleteByExample(ex);

        CmsMemberPreferPostRelation rel = new CmsMemberPreferPostRelation();
        rel.setMemberId(memberId);
        rel.setPostId(postId);
        rel.setType(type);
        return cmsMemberPreferPostRelationMapper.insertSelective(rel);
    }

    @Override
    public int removeMemberPrefer(Integer memberId, Integer postId, Integer type) {
        if (memberId == null || postId == null || type == null) {
            return 0;
        }
        CmsMemberPreferPostRelationExample ex = new CmsMemberPreferPostRelationExample();
        ex.createCriteria()
                .andMemberIdEqualTo(memberId)
                .andPostIdEqualTo(postId)
                .andTypeEqualTo(type);
        return cmsMemberPreferPostRelationMapper.deleteByExample(ex);
    }

    @Override
    public long countMemberPreferByPost(Integer postId, Integer type) {
        if (postId == null || type == null) {
            return 0L;
        }
        CmsMemberPreferPostRelationExample ex = new CmsMemberPreferPostRelationExample();
        ex.createCriteria()
                .andPostIdEqualTo(postId)
                .andTypeEqualTo(type);
        return cmsMemberPreferPostRelationMapper.countByExample(ex);
    }

    @Override
    public List<UmsMember> listMembersByPostAndPreferType(Integer postId, Integer type) {
        if (postId == null || type == null) {
            return new ArrayList<>();
        }
        CmsMemberPreferPostRelationExample ex = new CmsMemberPreferPostRelationExample();
        ex.setOrderByClause("create_time ASC");
        ex.createCriteria()
                .andPostIdEqualTo(postId)
                .andTypeEqualTo(type);
        List<CmsMemberPreferPostRelation> relations = cmsMemberPreferPostRelationMapper.selectByExample(ex);
        List<Integer> memberIds = relations.stream()
                .map(CmsMemberPreferPostRelation::getMemberId)
                .collect(Collectors.toList());
        if (memberIds.isEmpty()) {
            return new ArrayList<>();
        }
        UmsMemberExample memberExample = new UmsMemberExample();
        memberExample.createCriteria().andIdIn(memberIds);
        List<UmsMember> members = umsMemberMapper.selectByExample(memberExample);
        Map<Integer, UmsMember> idToMember = new LinkedHashMap<>();
        for (UmsMember m : members) {
            idToMember.put(m.getId(), m);
        }
        List<UmsMember> result = new ArrayList<>();
        for (Integer id : memberIds) {
            if (idToMember.containsKey(id)) {
                result.add(idToMember.get(id));
            }
        }
        return result;
    }

    @Override
    public List<CmsPost> listPostsByMemberAndPreferType(Integer memberId, Integer type) {
        if (memberId == null || type == null) {
            return new ArrayList<>();
        }
        CmsMemberPreferPostRelationExample ex = new CmsMemberPreferPostRelationExample();
        ex.setOrderByClause("create_time ASC");
        ex.createCriteria()
                .andMemberIdEqualTo(memberId)
                .andTypeEqualTo(type);
        List<CmsMemberPreferPostRelation> relations = cmsMemberPreferPostRelationMapper.selectByExample(ex);
        List<Integer> postIds = relations.stream()
                .map(CmsMemberPreferPostRelation::getPostId)
                .collect(Collectors.toList());
        if (postIds.isEmpty()) {
            return new ArrayList<>();
        }
        CmsPostExample postExample = new CmsPostExample();
        postExample.createCriteria().andIdIn(postIds);
        List<CmsPost> posts = cmsPostMapper.selectByExample(postExample);
        Map<Integer, CmsPost> idToPost = new LinkedHashMap<>();
        for (CmsPost p : posts) {
            idToPost.put(p.getId(), p);
        }
        List<CmsPost> result = new ArrayList<>();
        for (Integer id : postIds) {
            if (idToPost.containsKey(id)) {
                result.add(idToPost.get(id));
            }
        }
        return result;
    }

    @Override
    public CmsMemberPreferPostStatusResult getMemberPreferStatus(Integer memberId, Integer postId) {
        CmsMemberPreferPostStatusResult status = new CmsMemberPreferPostStatusResult();
        if (memberId == null || postId == null) {
            status.setLiked(false);
            status.setFavorited(false);
            status.setDisliked(false);
            return status;
        }
        CmsMemberPreferPostRelationExample ex = new CmsMemberPreferPostRelationExample();
        ex.createCriteria()
                .andMemberIdEqualTo(memberId)
                .andPostIdEqualTo(postId);
        List<CmsMemberPreferPostRelation> relations = cmsMemberPreferPostRelationMapper.selectByExample(ex);
        boolean liked = false;
        boolean favorited = false;
        boolean disliked = false;
        for (CmsMemberPreferPostRelation rel : relations) {
            if (rel.getType() == null) {
                continue;
            }
            if (rel.getType() == 0) {
                liked = true;
            } else if (rel.getType() == 1) {
                favorited = true;
            } else if (rel.getType() == 2) {
                disliked = true;
            }
        }
        status.setLiked(liked);
        status.setFavorited(favorited);
        status.setDisliked(disliked);
        return status;
    }
}
