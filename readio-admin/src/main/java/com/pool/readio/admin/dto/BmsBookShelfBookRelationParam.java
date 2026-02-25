package com.pool.readio.admin.dto;

import io.swagger.v3.oas.annotations.media.Schema;

import java.util.List;

@Schema(description = "书架与书籍关联参数")
public class BmsBookShelfBookRelationParam {
    @Schema(description = "书架ID", requiredMode = Schema.RequiredMode.REQUIRED)
    private Integer bookShelfId;
    @Schema(description = "书籍ID列表", requiredMode = Schema.RequiredMode.REQUIRED)
    private List<Integer> bookIds;

    public Integer getBookShelfId() {
        return bookShelfId;
    }

    public void setBookShelfId(Integer bookShelfId) {
        this.bookShelfId = bookShelfId;
    }

    public List<Integer> getBookIds() {
        return bookIds;
    }

    public void setBookIds(List<Integer> bookIds) {
        this.bookIds = bookIds;
    }
}
