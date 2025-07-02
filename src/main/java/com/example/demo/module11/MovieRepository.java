package com.example.demo.module11;

import java.util.List;

public interface MovieRepository {
    List<MovieModel> getAllMovies();
    List<MovieModel> findByDirector(String director);
    void saveMovie(MovieModel movie);
}
