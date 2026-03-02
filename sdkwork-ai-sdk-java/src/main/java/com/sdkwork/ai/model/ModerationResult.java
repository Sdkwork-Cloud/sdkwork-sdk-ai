package com.sdkwork.ai.model;

public class ModerationResult {
    private Boolean flagged;
    private Categories categories;
    private CategoryScores categoryScores;

    public Boolean getFlagged() {
        return this.flagged;
    }
    
    public void setFlagged(Boolean flagged) {
        this.flagged = flagged;
    }

    public Categories getCategories() {
        return this.categories;
    }
    
    public void setCategories(Categories categories) {
        this.categories = categories;
    }

    public CategoryScores getCategoryScores() {
        return this.categoryScores;
    }
    
    public void setCategoryScores(CategoryScores categoryScores) {
        this.categoryScores = categoryScores;
    }
}
