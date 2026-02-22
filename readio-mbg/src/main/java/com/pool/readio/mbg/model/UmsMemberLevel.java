package com.pool.readio.mbg.model;

import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;

public class UmsMemberLevel implements Serializable {
    private Integer id;

    @Schema(title = "等级名称")
    private String name;

    @Schema(title = "该级别所需成长点数")
    private Integer growthPoint;

    @Schema(title = "是否为默认等级：0->不是；1->是")
    private Boolean defaultStatus;

    @Schema(title = "每次评论获取的成长值")
    private Integer commentGrowthPoint;

    @Schema(title = "是否有签到特权")
    private Boolean priviledgeSignIn;

    @Schema(title = "是否有评论获奖励特权")
    private Boolean priviledgeComment;

    @Schema(title = "是否有专享活动特权")
    private Boolean priviledgePromotion;

    @Schema(title = "是否有会员价格特权")
    private Boolean priviledgeMemberPrice;

    @Schema(title = "是否有生日特权")
    private Boolean priviledgeBirthday;

    @Schema(title = "备注")
    private String note;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getGrowthPoint() {
        return growthPoint;
    }

    public void setGrowthPoint(Integer growthPoint) {
        this.growthPoint = growthPoint;
    }

    public Boolean getDefaultStatus() {
        return defaultStatus;
    }

    public void setDefaultStatus(Boolean defaultStatus) {
        this.defaultStatus = defaultStatus;
    }

    public Integer getCommentGrowthPoint() {
        return commentGrowthPoint;
    }

    public void setCommentGrowthPoint(Integer commentGrowthPoint) {
        this.commentGrowthPoint = commentGrowthPoint;
    }

    public Boolean getPriviledgeSignIn() {
        return priviledgeSignIn;
    }

    public void setPriviledgeSignIn(Boolean priviledgeSignIn) {
        this.priviledgeSignIn = priviledgeSignIn;
    }

    public Boolean getPriviledgeComment() {
        return priviledgeComment;
    }

    public void setPriviledgeComment(Boolean priviledgeComment) {
        this.priviledgeComment = priviledgeComment;
    }

    public Boolean getPriviledgePromotion() {
        return priviledgePromotion;
    }

    public void setPriviledgePromotion(Boolean priviledgePromotion) {
        this.priviledgePromotion = priviledgePromotion;
    }

    public Boolean getPriviledgeMemberPrice() {
        return priviledgeMemberPrice;
    }

    public void setPriviledgeMemberPrice(Boolean priviledgeMemberPrice) {
        this.priviledgeMemberPrice = priviledgeMemberPrice;
    }

    public Boolean getPriviledgeBirthday() {
        return priviledgeBirthday;
    }

    public void setPriviledgeBirthday(Boolean priviledgeBirthday) {
        this.priviledgeBirthday = priviledgeBirthday;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", growthPoint=").append(growthPoint);
        sb.append(", defaultStatus=").append(defaultStatus);
        sb.append(", commentGrowthPoint=").append(commentGrowthPoint);
        sb.append(", priviledgeSignIn=").append(priviledgeSignIn);
        sb.append(", priviledgeComment=").append(priviledgeComment);
        sb.append(", priviledgePromotion=").append(priviledgePromotion);
        sb.append(", priviledgeMemberPrice=").append(priviledgeMemberPrice);
        sb.append(", priviledgeBirthday=").append(priviledgeBirthday);
        sb.append(", note=").append(note);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}