package com.pool.readio.search.es;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

public interface SearchContentEsRepository extends ElasticsearchRepository<SearchContentDocument, String> {
}

