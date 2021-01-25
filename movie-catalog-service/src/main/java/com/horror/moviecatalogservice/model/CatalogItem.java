package com.horror.moviecatalogservice.model;

public class CatalogItem {

    public CatalogItem(String title, String description, int avScariness) {
        this.title = title;
        this.description = description;
        this.avScariness = avScariness;
    }

    public CatalogItem() {
    }

    private String title;
    private String description;
    private int avScariness;
    private int avBloodRating;
    private int avGhostRating;
    private int avPossessionRating;

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

    public int getAvScariness() {
        return avScariness;
    }

    public void setAvScariness(byte avScariness) {
        this.avScariness = avScariness;
    }

    public void setScariness(int scariness) {
        this.avScariness = scariness;
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
