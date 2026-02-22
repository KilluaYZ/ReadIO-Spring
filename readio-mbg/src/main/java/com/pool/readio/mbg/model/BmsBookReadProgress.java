package com.pool.readio.mbg.model;

import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;
import java.util.Date;

public class BmsBookReadProgress implements Serializable {
    private Integer id;

    private Integer memberId;

    private Integer bookId;

    @Schema(title = "上一次阅读到的block位置")
    private Integer lastBlockId;

    @Schema(title = "更新时间")
    private Date updateTime;

    @Schema(title = "是否已经完成了该书籍的阅读")
    private Boolean isFinished;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getMemberId() {
        return memberId;
    }

    public void setMemberId(Integer memberId) {
        this.memberId = memberId;
    }

    public Integer getBookId() {
        return bookId;
    }

    public void setBookId(Integer bookId) {
        this.bookId = bookId;
    }

    public Integer getLastBlockId() {
        return lastBlockId;
    }

    public void setLastBlockId(Integer lastBlockId) {
        this.lastBlockId = lastBlockId;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Boolean getIsFinished() {
        return isFinished;
    }

    public void setIsFinished(Boolean isFinished) {
        this.isFinished = isFinished;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", memberId=").append(memberId);
        sb.append(", bookId=").append(bookId);
        sb.append(", lastBlockId=").append(lastBlockId);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", isFinished=").append(isFinished);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}