package com.pool.readio.admin.dto;


import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;
import java.util.List;

@Getter
@Setter 
public class BmsPostTagsParam {
    @Schema(title = "帖子ID")
    private Integer postId;

    @Schema(title = "标签名称列表")
    private List<String> names;
}
