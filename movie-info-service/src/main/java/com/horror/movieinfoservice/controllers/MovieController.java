package com.horror.movieinfoservice.controllers;

import com.horror.movieinfoservice.data.MovieService;
import com.horror.movieinfoservice.data.MovieServiceExternal;
import com.horror.movieinfoservice.model.MovieItem;
import com.horror.movieinfoservice.model.MovieSummary;
import com.horror.movieinfoservice.model.MovieSummaryBundle;
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

    @Autowired
    private MovieServiceExternal movieServiceExternal;

    @GetMapping
    public List<MovieItem> getAllMovies(){
        return movieService.getMovies();
    }

    @GetMapping("/movie/{movieId}")
    public MovieItem getMovieById(@PathVariable("movieId") String movieId){
        return movieService.getMovieItemById(movieId);
    }


    @GetMapping("/tmdb")
    public MovieSummary getMovieTMDB(){
        return movieServiceExternal.getMovieTMDB();
    }

    @GetMapping("/tmdball")
    public MovieSummaryBundle getMoviesTMDB(){
        return movieServiceExternal.getMoviesTMDB();
    }
}
