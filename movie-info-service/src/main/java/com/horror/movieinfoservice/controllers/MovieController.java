package com.horror.movieinfoservice.controllers;

import com.horror.movieinfoservice.data.MovieService;
import com.horror.movieinfoservice.model.MovieItem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@RequestMapping("/movies")
public class MovieController {

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private MovieService movieService;

    @GetMapping
    public List<MovieItem> getAllMovies(){
        return movieService.getMovies();
    }

    @GetMapping("/{movieId}")
    public MovieItem getMovieById(@PathVariable("movieId") String movieId){
        return movieService.getMovieItemById(movieId);
    }
}
