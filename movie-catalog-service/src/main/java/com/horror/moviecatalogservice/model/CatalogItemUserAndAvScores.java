package com.horror.moviecatalogservice.model;

public class CatalogItemUserAndAvScores {

    public CatalogItemUserAndAvScores(String title, String description, int avScariness) {
        this.title = title;
        this.description = description;
        this.avScariness = avScariness;
    }

    public CatalogItemUserAndAvScores() {
    }

    private String title;
    private String description;
    private int usScariness;
    private int avScariness;
    private int usBloodRating;
    private int avBloodRating;
    private int usGhostRating;
    private int avGhostRating;
    private int usPossessionRating;
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

    public int getUsScariness() {
        return usScariness;
    }

    public void setUsScariness(int usScariness) {
        this.usScariness = usScariness;
    }

    public void setAvScariness(int avScariness) {
        this.avScariness = avScariness;
    }

    public int getUsBloodRating() {
        return usBloodRating;
    }

    public void setUsBloodRating(int usBloodRating) {
        this.usBloodRating = usBloodRating;
    }

    public int getUsGhostRating() {
        return usGhostRating;
    }

    public void setUsGhostRating(int usGhostRating) {
        this.usGhostRating = usGhostRating;
    }

    public int getUsPossessionRating() {
        return usPossessionRating;
    }

    public void setUsPossessionRating(int usPossessionRating) {
        this.usPossessionRating = usPossessionRating;
    }
}
