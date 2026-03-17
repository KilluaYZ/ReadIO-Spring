package com.pool.readio.search.model;

public class SearchItem {

    private SearchItemType type;
    private String id;
    private String title;
    private String contentSnippet;
    private Double score;

    public SearchItem() {
    }

    public SearchItem(SearchItemType type, String id, String title, String contentSnippet, Double score) {
        this.type = type;
        this.id = id;
        this.title = title;
        this.contentSnippet = contentSnippet;
        this.score = score;
    }

    public SearchItemType getType() {
        return type;
    }

    public void setType(SearchItemType type) {
        this.type = type;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContentSnippet() {
        return contentSnippet;
    }

    public void setContentSnippet(String contentSnippet) {
        this.contentSnippet = contentSnippet;
    }

    public Double getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
    }
}

