package com.pool.readio.admin.dto;

import io.swagger.v3.oas.annotations.media.Schema;

/**
 * 一言用户喜好统计结果
 */
@Schema(description = "一言用户喜好统计结果")
public class CmsMemberPreferOneWordCountResult {

    @Schema(description = "喜欢人数")
    private Long likeCount;

    @Schema(description = "收藏人数")
    private Long favoriteCount;

    @Schema(description = "不喜欢人数")
    private Long dislikeCount;

    public Long getLikeCount() {
        return likeCount;
    }

    public void setLikeCount(Long likeCount) {
        this.likeCount = likeCount;
    }

    public Long getFavoriteCount() {
        return favoriteCount;
    }

    public void setFavoriteCount(Long favoriteCount) {
        this.favoriteCount = favoriteCount;
    }

    public Long getDislikeCount() {
        return dislikeCount;
    }

    public void setDislikeCount(Long dislikeCount) {
        this.dislikeCount = dislikeCount;
    }
}
