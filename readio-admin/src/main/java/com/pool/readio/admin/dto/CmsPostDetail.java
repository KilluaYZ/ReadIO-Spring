package com.pool.readio.admin.dto;

import com.pool.readio.mbg.model.CmsPost;
import com.pool.readio.mbg.model.CmsPostContentBlock;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

/**
 * 帖子详情：帖子元信息 + 按 order 排序的内容块列表
 */
@Getter
@Setter
@Schema(description = "帖子详情（含帖子元信息与内容块列表）")
public class CmsPostDetail {

    @Schema(description = "帖子元信息：id、memberId、visible、createTime、updateTime、publishTime、title、ip、address")
    private CmsPost post;

    @Schema(description = "帖子内容块列表，按 order 升序")
    private List<CmsPostContentBlock> contentBlocks = new ArrayList<>();
}
