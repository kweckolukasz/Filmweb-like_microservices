package com.horror.moviecatalogservice.model;

public class MovieItem {

    public MovieItem(String title, String description) {
        Title = title;
        Description = description;
    }

    public MovieItem() {
    }

    private String Id;
    private String Title;
    private String Description;
    private int avScarinessScore;
    private int avBloodRating;
    private int avGhostRating;
    private int avPossessionRating;

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public int getAvScarinessScore() {
        return avScarinessScore;
    }

    public void setAvScarinessScore(int avScarinessScore) {
        this.avScarinessScore = avScarinessScore;
    }

    public int getAvBloodRating() {
        return avBloodRating;
    }

    public void setAvBloodRating(int avBloodRating) {
        this.avBloodRating = avBloodRating;
    }

    public int getAvGhostRating() {
        return avGhostRating;
    }

    public void setAvGhostRating(int avGhostRating) {
        this.avGhostRating = avGhostRating;
    }

    public int getAvPossessionRating() {
        return avPossessionRating;
    }

    public void setAvPossessionRating(int avPossessionRating) {
        this.avPossessionRating = avPossessionRating;
    }
}
