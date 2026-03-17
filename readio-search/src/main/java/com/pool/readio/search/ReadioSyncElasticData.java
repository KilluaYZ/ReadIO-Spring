package com.pool.readio.search;

import com.pool.readio.mbg.model.BmsBook;
import com.pool.readio.mbg.model.CmsPost;
import com.pool.readio.mbg.mongo.BookContent;
import com.pool.readio.mbg.mongo.BookContentRepository;
import com.pool.readio.mbg.mongo.PostContent;
import com.pool.readio.mbg.mongo.PostContentRepository;
import com.pool.readio.search.es.SearchContentDocument;
import com.pool.readio.search.es.SearchContentEsRepository;
import com.pool.readio.search.sync.SyncState;
import com.pool.readio.search.sync.SyncStateRepository;
import jakarta.transaction.Transactional;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Component;

import java.time.Instant;
import java.time.ZoneId;
import java.util.List;
import java.util.Optional;

@Component
public class ReadioSyncElasticData {

    private static final String SYNC_STATE_ID = "default";

    private final BmsBookMapper bmsBookMapper;
    private final CmsPostMapper cmsPostMapper;
    private final BookContentRepository bookContentRepository;
    private final PostContentRepository postContentRepository;
    private final SearchContentEsRepository searchContentEsRepository;
    private final SyncStateRepository syncStateRepository;

    public ReadioSyncElasticData(BmsBookMapper bmsBookMapper,
                                 CmsPostMapper cmsPostMapper,
                                 BookContentRepository bookContentRepository,
                                 PostContentRepository postContentRepository,
                                 SearchContentEsRepository searchContentEsRepository,
                                 SyncStateRepository syncStateRepository) {
        this.bmsBookMapper = bmsBookMapper;
        this.cmsPostMapper = cmsPostMapper;
        this.bookContentRepository = bookContentRepository;
        this.postContentRepository = postContentRepository;
        this.searchContentEsRepository = searchContentEsRepository;
        this.syncStateRepository = syncStateRepository;
    }

    @Transactional
    public void syncIncremental() {
        Instant lastSyncTime = getLastSyncTime();
        Instant newLastSyncTime = lastSyncTime;

        newLastSyncTime = syncBooksSince(lastSyncTime, newLastSyncTime);
        newLastSyncTime = syncPostsSince(lastSyncTime, newLastSyncTime);

        saveLastSyncTime(newLastSyncTime);
    }

    private Instant getLastSyncTime() {
        Optional<SyncState> stateOpt = syncStateRepository.findById(SYNC_STATE_ID);
        return stateOpt.map(SyncState::getLastSyncTime).orElse(Instant.EPOCH);
    }

    private void saveLastSyncTime(Instant instant) {
        SyncState state = new SyncState(SYNC_STATE_ID, instant);
        syncStateRepository.save(state);
    }

    private Instant syncBooksSince(Instant since, Instant currentMax) {
        int page = 0;
        int size = 500;

        while (true) {
            Page<BmsBook> booksPage = bmsBookMapper.findByPublishTimeAfter(
                    since.atZone(ZoneId.systemDefault()).toLocalDateTime(),
                    PageRequest.of(page, size)
            );

            if (booksPage.isEmpty()) {
                break;
            }

            for (BmsBook book : booksPage.getContent()) {
                BookContent content = bookContentRepository
                        .findByBookId(book.getId())
                        .orElse(null);
                SearchContentDocument doc = mapBookToEs(book, content);
                searchContentEsRepository.save(doc);

                if (book.getPublishTime() != null) {
                    Instant publishInstant = book.getPublishTime().toInstant();
                    if (publishInstant.isAfter(currentMax)) {
                        currentMax = publishInstant;
                    }
                }
            }

            if (!booksPage.hasNext()) {
                break;
            }
            page++;
        }

        return currentMax;
    }

    private Instant syncPostsSince(Instant since, Instant currentMax) {
        int page = 0;
        int size = 500;

        while (true) {
            Page<CmsPost> postsPage = cmsPostMapper.findByUpdateTimeAfter(
                    since.atZone(ZoneId.systemDefault()).toLocalDateTime(),
                    PageRequest.of(page, size)
            );

            if (postsPage.isEmpty()) {
                break;
            }

            for (CmsPost post : postsPage.getContent()) {
                PostContent content = postContentRepository
                        .findByPostId(post.getId())
                        .orElse(null);
                SearchContentDocument doc = mapPostToEs(post, content);
                searchContentEsRepository.save(doc);

                if (post.getUpdateTime() != null) {
                    Instant updateInstant = post.getUpdateTime().toInstant();
                    if (updateInstant.isAfter(currentMax)) {
                        currentMax = updateInstant;
                    }
                }
            }

            if (!postsPage.hasNext()) {
                break;
            }
            page++;
        }

        return currentMax;
    }

    private SearchContentDocument mapBookToEs(BmsBook book, BookContent content) {
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

    private SearchContentDocument mapPostToEs(CmsPost post, PostContent content) {
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

