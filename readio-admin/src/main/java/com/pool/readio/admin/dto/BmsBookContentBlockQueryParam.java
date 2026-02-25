package com.pool.readio.admin.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;

/**
 * 书籍内容块查询参数（用于列表条件、分页统计等）
 */
@Getter
@Setter
public class BmsBookContentBlockQueryParam {
    @Schema(description = "书籍ID")
    private Integer bookId;
    @Schema(description = "章节ID")
    private Integer chapterId;
    @Schema(description = "脚注ID")
    private Integer footnoteId;
    @Schema(description = "内容块类型：0->文本；1->图片；2->图书超链接；3->作者超链接；4->脚注超链接；5->概念知识超链接")
    private Integer type;
    @Schema(description = "内容关键字（模糊匹配 content）")
    private String contentKeyword;
}
