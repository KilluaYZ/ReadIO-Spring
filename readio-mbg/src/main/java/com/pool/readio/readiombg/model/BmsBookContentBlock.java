package com.pool.readio.readiombg.model;

import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;

public class BmsBookContentBlock implements Serializable {
    private Integer id;

    private Integer chapterId;

    private Integer footnoteId;

    private Integer bookId;

    @Schema(title = "内容块类型：0->文本；1->图片；2->图书超链接；3->作者超链接；4->脚注超链接；5->概念知识超链接")
    private Integer type;

    @Schema(title = "内容块顺序")
    private Integer order;

    @Schema(title = "内容块内容")
    private String content;

    private String image;

    @Schema(title = "是否需要换行")
    private Boolean newline;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getChapterId() {
        return chapterId;
    }

    public void setChapterId(Integer chapterId) {
        this.chapterId = chapterId;
    }

    public Integer getFootnoteId() {
        return footnoteId;
    }

    public void setFootnoteId(Integer footnoteId) {
        this.footnoteId = footnoteId;
    }

    public Integer getBookId() {
        return bookId;
    }

    public void setBookId(Integer bookId) {
        this.bookId = bookId;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getOrder() {
        return order;
    }

    public void setOrder(Integer order) {
        this.order = order;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Boolean getNewline() {
        return newline;
    }

    public void setNewline(Boolean newline) {
        this.newline = newline;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", chapterId=").append(chapterId);
        sb.append(", footnoteId=").append(footnoteId);
        sb.append(", bookId=").append(bookId);
        sb.append(", type=").append(type);
        sb.append(", order=").append(order);
        sb.append(", content=").append(content);
        sb.append(", image=").append(image);
        sb.append(", newline=").append(newline);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}