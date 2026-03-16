package com.pool.readio.mbg.mongo;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * 书籍内容文档，与 readio_json_out 导出的 JSON 结构对应，用于 MongoDB 存储与 ORM 映射。
 * <p>
 * 对应 JSON 字段：book_name, file_path, authors, publisher, publish_date, chapters。
 */
@Document(collection = "book_content")
public class BookContent {

    @Id
    private String id;

    @Field("book_name")
    @Indexed(unique = false)
    private String bookName;

    @Field("file_path")
    private String filePath;

    /** 关联的书籍元数据 ID（PostgreSQL bms_book.id） */
    @Field("book_id")
    private Integer bookId;

    @Field("authors")
    private List<String> authors = new ArrayList<>();

    @Field("publisher")
    private String publisher;

    @Field("publish_date")
    private Date publishDate;

    @Field("chapters")
    private List<ChapterItem> chapters = new ArrayList<>();

    /**
     * 当内容存于 GridFS 时，此处为 GridFS 文件 ObjectId（十六进制字符串）。
     * 非空时表示 chapters 在 GridFS，本文档的 chapters 为空；为空时表示旧数据，chapters 内联。
     */
    @Field("content_file_id")
    private String contentFileId;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public Integer getBookId() {
        return bookId;
    }

    public void setBookId(Integer bookId) {
        this.bookId = bookId;
    }

    public List<String> getAuthors() {
        return authors;
    }

    public void setAuthors(List<String> authors) {
        this.authors = authors != null ? authors : new ArrayList<>();
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public Date getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(Date publishDate) {
        this.publishDate = publishDate;
    }

    public List<ChapterItem> getChapters() {
        return chapters;
    }

    public void setChapters(List<ChapterItem> chapters) {
        this.chapters = chapters != null ? chapters : new ArrayList<>();
    }

    public String getContentFileId() {
        return contentFileId;
    }

    public void setContentFileId(String contentFileId) {
        this.contentFileId = contentFileId;
    }
}
