package com.horror.ratingsdataservice.controller;

import com.horror.ratingsdataservice.model.RatingItem;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/ratings")
public class RatingsController {

    List<RatingItem> ratings = Arrays.asList(
            new RatingItem("1","1",1)
    );

    @GetMapping("/{movieId}")
    public RatingItem getRating(@PathVariable("movieId") String movieId){
        return new RatingItem(movieId,"4",5);
    }

    @GetMapping("/{userId}")
    public List<RatingItem> getUserRatings(@PathVariable("userId") String userId){
        return ratings;
    }
}
