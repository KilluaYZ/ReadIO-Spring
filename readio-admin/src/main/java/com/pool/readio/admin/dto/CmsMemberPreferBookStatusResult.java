package com.pool.readio.admin.dto;

import io.swagger.v3.oas.annotations.media.Schema;

/**
 * 某用户对某本书的喜好状态
 */
@Schema(description = "某用户对某本书的喜好状态")
public class CmsMemberPreferBookStatusResult {

    @Schema(description = "是否喜欢")
    private Boolean liked;

    @Schema(description = "是否收藏")
    private Boolean favorited;

    @Schema(description = "是否不喜欢")
    private Boolean disliked;

    public Boolean getLiked() {
        return liked;
    }

    public void setLiked(Boolean liked) {
        this.liked = liked;
    }

    public Boolean getFavorited() {
        return favorited;
    }

    public void setFavorited(Boolean favorited) {
        this.favorited = favorited;
    }

    public Boolean getDisliked() {
        return disliked;
    }

    public void setDisliked(Boolean disliked) {
        this.disliked = disliked;
    }
}

