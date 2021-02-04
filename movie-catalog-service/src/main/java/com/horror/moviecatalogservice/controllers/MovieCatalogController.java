package com.horror.moviecatalogservice.controllers;

import com.horror.moviecatalogservice.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/catalog")
public class MovieCatalogController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/{userId}")
    public CatalogItemsBundle getAllMoviesWithAvScoresAndUserScores(@PathVariable("userId") String userId){

        //For this person
        //get all movieIds rated by this person -> rates
        UserRatingsBundle bundle = restTemplate.getForObject("http://ratings-data-service/ratings/users/"+userId, UserRatingsBundle.class);
        //When you have Id's get movie info
        //TODO It does not have userScores for now, implement this!
        List<CatalogItemUserAndAvScores> catalogItems = bundle.getRatings().stream().map(ratingItem -> {
            MovieItem movieItem = restTemplate.getForObject("http://movie-info-service/movies/"+ratingItem.getMovieId(), MovieItem.class);
            return new CatalogItemUserAndAvScores(movieItem.getTitle(), movieItem.getDescription(), ratingItem.getScarinessScore());
        }).collect(Collectors.toList());
        CatalogItemsBundle catalogItemsBundle = new CatalogItemsBundle();
        catalogItemsBundle.setCatalogItems(catalogItems);
        return catalogItemsBundle;
    }
}
