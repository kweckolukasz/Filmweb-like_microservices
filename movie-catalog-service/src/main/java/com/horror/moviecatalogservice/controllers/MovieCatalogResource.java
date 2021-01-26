package com.horror.moviecatalogservice.controllers;

import com.horror.moviecatalogservice.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/catalog")
public class MovieCatalogResource {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/{userId}")
    public CatalogItemsBundle getCatalogForUserId(@PathVariable("userId") String userId){

        //For this person
        //get all movieIds rated by this person -> rates
        UserRatingsBundle bundle = restTemplate.getForObject("http://localhost:8083/ratings/"+userId, UserRatingsBundle.class);
        //When you have Id's get movie info
        //TODO W tym wypadku MovieItem ma ocenę straszności wystawioną przez userId, sama klasa MovieItem jest przeznaczona do przechowywania średniej oceny wszystkich użytkowników, zastanów się jak zaimplementować mechanizm uśredniania ocen, gdzie ma być to pole?
        List<CatalogItem> catalogItems = bundle.getRatings().stream().map(ratingItem -> {
            MovieItem movieItem = restTemplate.getForObject("http://localhost:8082/movies/"+ratingItem.getMovieId(), MovieItem.class);
            return new CatalogItem(movieItem.getTitle(), movieItem.getDescription(), movieItem.getAvScarinessScore());
        }).collect(Collectors.toList());
        CatalogItemsBundle catalogItemsBundle = new CatalogItemsBundle();
        catalogItemsBundle.setCatalogItems(catalogItems);
        return catalogItemsBundle;
    }
}
