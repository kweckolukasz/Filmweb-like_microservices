package com.horror.movieinfoservice.data;

import com.horror.movieinfoservice.model.MovieSummary;
import com.horror.movieinfoservice.model.MovieSummaryBundle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class MovieServiceExternal {

    @Autowired
    @Qualifier("external")
    RestTemplate extRestTemplate;

    @Value("${TMDB.api.key}")
    private String apiKey;

    public MovieSummary getMovieTMDB(){
        return extRestTemplate.getForObject("https://api.themoviedb.org/3/movie/120?api_key=5f43d8c9b52d547e125b08b410805023", MovieSummary.class);
    }

    public MovieSummaryBundle getMoviesTMDB() {
        return extRestTemplate.getForObject("https://api.themoviedb.org/3/discover/movie?with_genres=27&sort_by=vote_average.desc&api_key=5f43d8c9b52d547e125b08b410805023"
        , MovieSummaryBundle.class);
    }
}
