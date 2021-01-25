package com.horror.movieinfoservice.controllers;

import com.horror.movieinfoservice.model.MovieItem;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/movies")
public class MovieController {

    @GetMapping("/{movieId}")
    public MovieItem getMovies(@PathVariable("movieId") String movieId){
        return new MovieItem(movieId, "testMovie");
    }
}
