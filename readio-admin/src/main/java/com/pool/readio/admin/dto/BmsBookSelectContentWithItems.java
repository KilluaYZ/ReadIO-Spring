package com.pool.readio.admin.dto;

import io.swagger.v3.oas.annotations.media.Schema;

import java.util.Date;

/** 选中段落（划线），用于新增/更新/查询返回。明细表 bms_book_select_content_item 已废弃，不再包含 items。 */
@Schema(description = "选中段落（划线）")
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
}
