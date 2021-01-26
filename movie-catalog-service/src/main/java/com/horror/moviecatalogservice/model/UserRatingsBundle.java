package com.horror.moviecatalogservice.model;

import java.util.List;

public class UserRatingsBundle {

    private List<RatingItem> ratings;

    public List<RatingItem> getRatings() {
        return ratings;
    }

    public void setRatings(List<RatingItem> ratings) {
        this.ratings = ratings;
    }
}
