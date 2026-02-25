package com.pool.readio.admin.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class BmsBookListMemberRelationParam {
    @Schema(description = "书单ID")
    private Integer bookListId;
    @Schema(description = "成员ID列表")
    private List<Integer> memberIds;
}
