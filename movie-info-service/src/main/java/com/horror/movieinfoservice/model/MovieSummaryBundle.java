package com.horror.movieinfoservice.model;

import java.util.List;

public class MovieSummaryBundle {

    private List<MovieSummary> results;

    public List<MovieSummary> getResults() {
        return results;
    }

    public void setResults(List<MovieSummary> results) {
        this.results = results;
    }
}
