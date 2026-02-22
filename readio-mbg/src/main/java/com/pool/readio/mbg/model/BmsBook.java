package com.pool.readio.mbg.model;

import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;
import java.util.Date;

public class BmsBook implements Serializable {
    private Integer id;

    @Schema(title = "书籍类型ID")
    private Integer bookCategoryId;

    @Schema(title = "作者ID")
    private Integer authorId;

    private Integer publisherId;

    @Schema(title = "书籍名称")
    private String name;

    @Schema(title = "书籍封面")
    private String icon;

    @Schema(title = "创建时间")
    private Date createTime;

    @Schema(title = "出版日期")
    private Date pushlishTime;

    @Schema(title = "书籍ISBN码")
    private String isbn;

    @Schema(title = "书籍字数")
    private Integer wordCount;

    @Schema(title = "书籍简介")
    private String description;

    @Schema(title = "语言")
    private String language;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getBookCategoryId() {
        return bookCategoryId;
    }

    public void setBookCategoryId(Integer bookCategoryId) {
        this.bookCategoryId = bookCategoryId;
    }

    public Integer getAuthorId() {
        return authorId;
    }

    public void setAuthorId(Integer authorId) {
        this.authorId = authorId;
    }

    public Integer getPublisherId() {
        return publisherId;
    }

    public void setPublisherId(Integer publisherId) {
        this.publisherId = publisherId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getPushlishTime() {
        return pushlishTime;
    }

    public void setPushlishTime(Date pushlishTime) {
        this.pushlishTime = pushlishTime;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public Integer getWordCount() {
        return wordCount;
    }

    public void setWordCount(Integer wordCount) {
        this.wordCount = wordCount;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", bookCategoryId=").append(bookCategoryId);
        sb.append(", authorId=").append(authorId);
        sb.append(", publisherId=").append(publisherId);
        sb.append(", name=").append(name);
        sb.append(", icon=").append(icon);
        sb.append(", createTime=").append(createTime);
        sb.append(", pushlishTime=").append(pushlishTime);
        sb.append(", isbn=").append(isbn);
        sb.append(", wordCount=").append(wordCount);
        sb.append(", description=").append(description);
        sb.append(", language=").append(language);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}