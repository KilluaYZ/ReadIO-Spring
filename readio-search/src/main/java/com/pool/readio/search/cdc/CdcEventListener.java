package com.pool.readio.search.cdc;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.pool.readio.mbg.mongo.BookContent;
import com.pool.readio.mbg.mongo.BookContentRepository;
import com.pool.readio.mbg.mongo.PostContent;
import com.pool.readio.mbg.mongo.PostContentRepository;
import com.pool.readio.search.es.SearchContentDocument;
import com.pool.readio.search.es.SearchContentEsRepository;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.time.Instant;

@Component
public class CdcEventListener {

    private final ObjectMapper objectMapper = new ObjectMapper();
    private final SearchContentEsRepository searchContentEsRepository;
    private final BookContentRepository bookContentRepository;
    private final PostContentRepository postContentRepository;

    public CdcEventListener(SearchContentEsRepository searchContentEsRepository,
                            BookContentRepository bookContentRepository,
                            PostContentRepository postContentRepository) {
        this.searchContentEsRepository = searchContentEsRepository;
        this.bookContentRepository = bookContentRepository;
        this.postContentRepository = postContentRepository;
    }

    @RabbitListener(queues = CdcRabbitConfig.QUEUE)
    public void onMessage(String messageJson) throws IOException {
        JsonNode root = objectMapper.readTree(messageJson);
        JsonNode payload = root.path("payload");
        if (payload.isMissingNode()) {
            return;
        }

        String op = payload.path("op").asText();
        String table = payload.path("source").path("table").asText();

        if ("d".equals(op)) {
            handleDelete(table, payload.path("before"));
        } else if ("c".equals(op) || "u".equals(op)) {
            handleUpsert(table, payload.path("after"));
        }
    }

    private void handleDelete(String table, JsonNode before) {
        if (before == null || before.isMissingNode()) {
            return;
        }
        int id = before.path("id").asInt(-1);
        if (id <= 0) {
            return;
        }
        String esId = buildEsId(table, id);
        if (esId != null) {
            searchContentEsRepository.deleteById(esId);
        }
    }

    private void handleUpsert(String table, JsonNode after) {
        if (after == null || after.isMissingNode()) {
            return;
        }
        int id = after.path("id").asInt(-1);
        if (id <= 0) {
            return;
        }
        String esId = buildEsId(table, id);
        if (esId == null) {
            return;
        }

        SearchContentDocument doc = new SearchContentDocument();
        doc.setId(esId);

        if ("bms_book".equals(table)) {
            doc.setType("BOOK");
            doc.setBookId(id);
            doc.setTitle(after.path("name").asText(""));
            if (after.hasNonNull("publish_time")) {
                String publishTimeStr = after.path("publish_time").asText();
                try {
                    doc.setPublishTime(Instant.parse(publishTimeStr));
                } catch (Exception ignored) {
                }
            }

            StringBuilder contentBuilder = new StringBuilder();
            String description = after.path("description").asText("");
            if (!description.isEmpty()) {
                contentBuilder.append(description).append("\n");
            }
            bookContentRepository.findByBookId(id).ifPresent(bookContent -> {
                if (bookContent.getBookName() != null) {
                    contentBuilder.append(bookContent.getBookName()).append("\n");
                }
                if (bookContent.getAuthors() != null) {
                    bookContent.getAuthors().forEach(a -> contentBuilder.append(a).append("\n"));
                }
                if (bookContent.getChapters() != null) {
                    bookContent.getChapters().forEach(ch -> {
                        if (ch.getTitle() != null) {
                            contentBuilder.append(ch.getTitle()).append("\n");
                        }
                        if (ch.getContent() != null) {
                            contentBuilder.append(ch.getContent()).append("\n");
                        }
                    });
                }
            });
            doc.setContent(contentBuilder.toString());
        } else if ("cms_post".equals(table)) {
            doc.setType("POST");
            doc.setPostId(id);
            doc.setTitle(after.path("title").asText(""));
            if (after.hasNonNull("publish_time")) {
                String publishTimeStr = after.path("publish_time").asText();
                try {
                    doc.setPublishTime(Instant.parse(publishTimeStr));
                } catch (Exception ignored) {
                }
            }
            String content = postContentRepository.findByPostId(id)
                    .map(PostContent::getContent)
                    .orElse("");
            doc.setContent(content);
        } else {
            return;
        }

        searchContentEsRepository.save(doc);
    }

    private String buildEsId(String table, int id) {
        return switch (table) {
            case "bms_book" -> "book:" + id;
            case "cms_post" -> "post:" + id;
            default -> null;
        };
    }
}

