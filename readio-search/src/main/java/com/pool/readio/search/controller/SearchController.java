package com.pool.readio.search.controller;

import com.pool.readio.search.model.SearchItem;
import com.pool.readio.search.service.SearchService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SearchController {

    private final SearchService searchService;

    public SearchController(SearchService searchService) {
        this.searchService = searchService;
    }

    /**
     * 统一搜索接口
     * 示例：GET /search?q=关键字&page=0&size=20
     */
    @GetMapping("/search")
    public ResponseEntity<List<SearchItem>> search(
            @RequestParam("q") String keyword,
            @RequestParam(value = "page", defaultValue = "0") int page,
            @RequestParam(value = "size", defaultValue = "20") int size) {

        List<SearchItem> result = searchService.search(keyword, page, size);
        return ResponseEntity.ok(result);
    }
}

