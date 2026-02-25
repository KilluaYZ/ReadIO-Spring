package com.pool.readio.admin.dto;

import java.util.List;
import lombok.Getter;
import lombok.Setter;
import io.swagger.v3.oas.annotations.media.Schema;

@Getter
@Setter
public class BmsBookListBookRelationParam {
    @Schema(description = "书单ID")
    private Integer bookListId;
    @Schema(description = "书籍ID列表")
    private List<Integer> bookIds;
}
