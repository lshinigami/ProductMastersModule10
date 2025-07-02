package com.example.demo.module11;

import java.util.List;

public interface MovieService {
    List<MovieModel> listMovies();
    List<MovieModel> listMoviesByDirector(String director);
    List<MovieModel> addNewMovie(MovieModel movie);


}
