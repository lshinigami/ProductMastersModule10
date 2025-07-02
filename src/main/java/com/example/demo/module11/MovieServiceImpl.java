package com.example.demo.module11;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MovieServiceImpl implements MovieService {
    private final MovieRepository movieRepository;

    @Override
    public List<MovieModel> listMovies() {
        return movieRepository.getAllMovies();
    }

    @Override
    public List<MovieModel> listMoviesByDirector(String director) {
        return movieRepository.findByDirector(director);
    }

    @Override
    public List<MovieModel> addNewMovie(MovieModel movie) {
        if (movie.getYear() >= 1900 && !movie.getTitle().isEmpty() && !movie.getDirector().isEmpty()) {
            movieRepository.saveMovie(movie);
        }
        else {
            throw new RuntimeException("Invalid movie data");
        }

        return listMovies();
    }

}
