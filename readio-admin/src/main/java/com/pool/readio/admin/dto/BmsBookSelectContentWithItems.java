package com.pool.readio.admin.dto;

import com.pool.readio.mbg.model.BmsBookSelectContentItem;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.Date;
import java.util.List;

/** 选中段落（划线）与明细项，用于新增/更新/查询返回 */
@Schema(description = "选中段落（划线）及明细项")
public class BmsBookSelectContentWithItems {

    @Schema(description = "主键ID，新增时不传")
    private Integer id;
    @Schema(description = "用户ID", requiredMode = Schema.RequiredMode.REQUIRED)
    private Integer memberId;
    @Schema(description = "选中类型：0->标注；1->评论", requiredMode = Schema.RequiredMode.REQUIRED)
    private Integer type;
    @Schema(description = "标注类型：0->荧光笔；1->下划实线等")
    private Integer markType;
    @Schema(description = "标记颜色")
    private String markColor;
    @Schema(description = "创建时间")
    private Date createTime;
    @Schema(description = "选中的段落明细")
    private List<BmsBookSelectContentItem> items;

    public Integer getId() { return id; }
    public void setId(Integer id) { this.id = id; }
    public Integer getMemberId() { return memberId; }
    public void setMemberId(Integer memberId) { this.memberId = memberId; }
    public Integer getType() { return type; }
    public void setType(Integer type) { this.type = type; }
    public Integer getMarkType() { return markType; }
    public void setMarkType(Integer markType) { this.markType = markType; }
    public String getMarkColor() { return markColor; }
    public void setMarkColor(String markColor) { this.markColor = markColor; }
    public Date getCreateTime() { return createTime; }
    public void setCreateTime(Date createTime) { this.createTime = createTime; }
    public List<BmsBookSelectContentItem> getItems() { return items; }
    public void setItems(List<BmsBookSelectContentItem> items) { this.items = items; }
}
