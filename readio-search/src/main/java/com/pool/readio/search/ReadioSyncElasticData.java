package com.pool.readio.search;

import com.pool.readio.mbg.model.BmsBook;
import com.pool.readio.mbg.model.CmsPost;
import com.pool.readio.mbg.mongo.BookContent;
import com.pool.readio.mbg.mongo.BookContentRepository;
import com.pool.readio.mbg.mongo.PostContent;
import com.pool.readio.mbg.mongo.PostContentRepository;
import com.pool.readio.search.es.SearchContentDocument;
import org.springframework.stereotype.Component;

@Component
public class ReadioSyncElasticData {

    /**
     * 将书籍及其内容映射为 Elasticsearch 文档。
     * 目前作为通用工具方法供其他地方需要时调用，增量分页同步逻辑后续再根据实际需求补充。
     */
    public SearchContentDocument mapBookToEs(BmsBook book, BookContent content) {
        SearchContentDocument doc = new SearchContentDocument();
        doc.setId("book:" + book.getId());
        doc.setType("BOOK");
        doc.setBookId(book.getId());
        doc.setTitle(book.getName());
        doc.setPublishTime(book.getPublishTime() != null ? book.getPublishTime().toInstant() : null);

        StringBuilder sb = new StringBuilder();
        if (book.getDescription() != null) {
            sb.append(book.getDescription()).append("\n");
        }
        if (content != null) {
            if (content.getBookName() != null) {
                sb.append(content.getBookName()).append("\n");
            }
            if (content.getAuthors() != null) {
                content.getAuthors().forEach(a -> sb.append(a).append("\n"));
            }
            if (content.getChapters() != null) {
                content.getChapters().forEach(ch -> {
                    if (ch.getTitle() != null) {
                        sb.append(ch.getTitle()).append("\n");
                    }
                    if (ch.getContent() != null) {
                        sb.append(ch.getContent()).append("\n");
                    }
                });
            }
        }
        doc.setContent(sb.toString());
        return doc;
    }

    /**
     * 将帖子及其内容映射为 Elasticsearch 文档。
     */
    public SearchContentDocument mapPostToEs(CmsPost post, PostContent content) {
        SearchContentDocument doc = new SearchContentDocument();
        doc.setId("post:" + post.getId());
        doc.setType("POST");
        doc.setPostId(post.getId());
        doc.setTitle(post.getTitle());
        doc.setPublishTime(post.getPublishTime() != null ? post.getPublishTime().toInstant() : null);
        doc.setContent(content != null ? content.getContent() : "");
        return doc;
    }
}

