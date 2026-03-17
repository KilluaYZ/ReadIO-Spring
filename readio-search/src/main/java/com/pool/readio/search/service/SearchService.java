package com.pool.readio.search.service;

import com.pool.readio.search.model.SearchItem;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.Collections;
import java.util.List;

@Service
public class SearchService {

    /**
     * 目前先返回空结果，保证服务可以正常启动和提供接口。
     * 后续可以在此处接入 Elasticsearch 查询逻辑。
     */
    public List<SearchItem> search(String keyword, int page, int size) {
        if (!StringUtils.hasText(keyword)) {
            return Collections.emptyList();
        }
        return Collections.emptyList();
    }
}

