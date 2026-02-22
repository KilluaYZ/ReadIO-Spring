package com.pool.readio.mbg.model;

import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;
import java.util.Date;

public class PmsProduct implements Serializable {
    private Integer id;

    @Schema(title = "商品名称")
    private String name;

    @Schema(title = "商品类型ID")
    private Integer productCategoryId;

    @Schema(title = "书籍ID")
    private Integer bookId;

    @Schema(title = "书籍章节ID")
    private Integer chapterId;

    @Schema(title = "会员时长（天）")
    private Integer vipDuration;

    @Schema(title = "创建时间")
    private Date createTime;

    @Schema(title = "价格")
    private Short price;

    @Schema(title = "是否隐藏")
    private Boolean hidden;

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

    public Integer getProductCategoryId() {
        return productCategoryId;
    }

    public void setProductCategoryId(Integer productCategoryId) {
        this.productCategoryId = productCategoryId;
    }

    public Integer getBookId() {
        return bookId;
    }

    public void setBookId(Integer bookId) {
        this.bookId = bookId;
    }

    public Integer getChapterId() {
        return chapterId;
    }

    public void setChapterId(Integer chapterId) {
        this.chapterId = chapterId;
    }

    public Integer getVipDuration() {
        return vipDuration;
    }

    public void setVipDuration(Integer vipDuration) {
        this.vipDuration = vipDuration;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Short getPrice() {
        return price;
    }

    public void setPrice(Short price) {
        this.price = price;
    }

    public Boolean getHidden() {
        return hidden;
    }

    public void setHidden(Boolean hidden) {
        this.hidden = hidden;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", productCategoryId=").append(productCategoryId);
        sb.append(", bookId=").append(bookId);
        sb.append(", chapterId=").append(chapterId);
        sb.append(", vipDuration=").append(vipDuration);
        sb.append(", createTime=").append(createTime);
        sb.append(", price=").append(price);
        sb.append(", hidden=").append(hidden);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}