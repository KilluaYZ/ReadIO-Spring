package com.pool.readio.admin.dto;

import com.pool.readio.mbg.model.BmsBookChapter;
import com.pool.readio.mbg.model.BmsBookContentBlock;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.List;

/**
 * 书籍章节及其内容块（用于按书籍ID获取章节树）
 */
@Schema(description = "书籍章节及其内容块")
public class BmsBookChapterWithBlocksDto {

    @Schema(description = "章节信息")
    private BmsBookChapter chapter;

    @Schema(description = "该章节下的内容块列表，按顺序排列")
    private List<BmsBookContentBlock> contentBlocks;

    public BmsBookChapter getChapter() {
        return chapter;
    }

    public void setChapter(BmsBookChapter chapter) {
        this.chapter = chapter;
    }

    public List<BmsBookContentBlock> getContentBlocks() {
        return contentBlocks;
    }

    public void setContentBlocks(List<BmsBookContentBlock> contentBlocks) {
        this.contentBlocks = contentBlocks;
    }
}
