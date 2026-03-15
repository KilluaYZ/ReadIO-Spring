package com.pool.readio.mbg.mongo;

import org.springframework.data.mongodb.core.mapping.Field;

import java.util.ArrayList;
import java.util.List;

/**
 * 书籍章节内容项，对应 readio_json_out 中 chapters 数组的单个元素。
 */
public class ChapterItem {

    /** 章节序号，从 0 开始 */
    private int index;

    /** 章节标题 */
    private String title;

    /** 章节正文内容 */
    private String content;

    /** 章节内图片 URL 或标识列表 */
    @Field("images")
    private List<String> images = new ArrayList<>();

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public List<String> getImages() {
        return images;
    }

    public void setImages(List<String> images) {
        this.images = images != null ? images : new ArrayList<>();
    }
}
