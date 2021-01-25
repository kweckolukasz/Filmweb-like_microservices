package com.horror.moviecatalogservice.controllers;

import com.horror.moviecatalogservice.model.CatalogItem;
import com.horror.moviecatalogservice.model.MovieItem;
import com.horror.moviecatalogservice.model.RatingItem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/catalog")
public class MovieCatalogResource {

    @Autowired
    private RestTemplate restTemplate;


    @GetMapping
    public List<MovieItem> getAllMovies(){

    }


    @GetMapping("/{userId}")
    public List<CatalogItem> getCatalogForUserId(@PathVariable("userId") String userId){

        //For this person
        //get all movieIds rated by this person -> rates
        //When you have Id's get movie info
        //connect them all in one collection
    }
}
