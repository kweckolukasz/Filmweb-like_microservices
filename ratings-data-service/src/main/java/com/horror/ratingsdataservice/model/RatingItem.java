package com.horror.ratingsdataservice.model;

public class RatingItem {

    public RatingItem(String movieId, String userId, int scarinessScore) {
        this.movieId = movieId;
        this.scarinessScore = scarinessScore;
        this.userId = userId;
    }

    private String movieId;
    private String userId;
    private int scarinessScore;
    private int bloodRating;
    private int ghostRating;
    private int possessionRating;

    public String getMovieId() {
        return movieId;
    }

    public void setMovieId(String movieId) {
        this.movieId = movieId;
    }

    public int getScarinessScore() {
        return scarinessScore;
    }

    public void setScarinessScore(int scarinessScore) {
        this.scarinessScore = scarinessScore;
    }

    public int getBloodRating() {
        return bloodRating;
    }

    public void setBloodRating(int bloodRating) {
        this.bloodRating = bloodRating;
    }

    public int getGhostRating() {
        return ghostRating;
    }

    public void setGhostRating(int ghostRating) {
        this.ghostRating = ghostRating;
    }

    public int getPossessionRating() {
        return possessionRating;
    }

    public void setPossessionRating(int possessionRating) {
        this.possessionRating = possessionRating;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
}
