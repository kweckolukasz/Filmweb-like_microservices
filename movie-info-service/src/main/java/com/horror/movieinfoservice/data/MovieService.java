package com.horror.movieinfoservice.data;

import com.horror.movieinfoservice.model.MovieItem;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class MovieService {

    private List<MovieItem> movies;

    public MovieService() {
        movies = new ArrayList<>();
        MovieItem first = new MovieItem("Lśnienie!", "Shining");
        first.setId("1");
        MovieItem second = new MovieItem("Uciekaj!", "Get out!");
        second.setId("2");
        MovieItem third = new MovieItem("Dziedzictwo", "Hereditary");
        third.setId("3");
        movies.add(first);
        movies.add(second);
        movies.add(third);
    }

    public List<MovieItem> getMovies(){
        return movies;
    }

    public MovieItem getMovieItemById(String movieId){

        return movies.stream()
                .filter(movieItem -> movieItem.getId().equals(movieId))
                .findFirst()
                .get();
    }
}
