package com.horror.ratingsdataservice.controller;

import com.horror.ratingsdataservice.model.RatingItem;
import com.horror.ratingsdataservice.model.UserRatingsBundle;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/ratings")
public class RatingsController {



    @GetMapping("/{movieId}")
    public RatingItem getRating(@PathVariable("movieId") String movieId){
        return new RatingItem(movieId,"4",5);
    }

    @GetMapping("/users/{userId}")
    public UserRatingsBundle getUserRatings(@PathVariable("userId") String userId){
        List<RatingItem> ratings = Arrays.asList(
                new RatingItem("1",userId,1),
                new RatingItem("2",userId,2),
                new RatingItem("3",userId,3)
        );
        UserRatingsBundle bundle = new UserRatingsBundle();
        bundle.setRatings(ratings);
        return bundle;
    }
}
