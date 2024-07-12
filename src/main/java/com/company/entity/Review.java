package com.company.entity;


public class Review {

    private String title;
    private String description;
    private String rating;
    private String companyId;

    public Review() {
    }

    public Review(String title, String description, String rating, String companyId) {
        this.title = title;
        this.description = description;
        this.rating = rating;
        this.companyId = companyId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getCompanyId() {
        return companyId;
    }

    public void setCompanyId(String companyId) {
        this.companyId = companyId;
    }
}
