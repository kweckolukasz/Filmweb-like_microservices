package com.horror.movieinfoservice.data;

import com.horror.movieinfoservice.model.MovieItem;

import java.util.ArrayList;
import java.util.List;

public class MovieService {

    private List<MovieItem> movies = new ArrayList<>();

    public MovieService() {
        MovieItem first = new MovieItem("Lśnienie!", "Shining");
        first.setId("1");
        MovieItem second = new MovieItem("Uciekaj!", "Get out!");
        second.setId("2");
        MovieItem third = new MovieItem("Dziedzictwo", "Hereditary");
        third.setId("3");
    }

    public List<MovieItem> getMovies(){
        return movies;
    }
}
