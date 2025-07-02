package com.example.demo.module11;

import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public class MovieRepositoryImpl implements MovieRepository {
    private List<MovieModel> allMovies = List.of(
            new MovieModel("Mean Girls", "Mark Waters", 2004),
            new MovieModel("Karate Kid: Legends", "Jonathan Entwistle", 2025),
            new MovieModel("Spider-Man: Across the Spider-Verse", "Joaquim Dos Santos", 2023)
    );

    @Override
    public List<MovieModel> getAllMovies() {
        return allMovies;
    }

    @Override
    public List<MovieModel> findByDirector(String director) {
        return allMovies.stream()
                .filter(movieModel -> movieModel.getDirector().equals(director))
                .toList();
    }

    @Override
    public void saveMovie(MovieModel movie) {
        allMovies.add(movie);
    }
}
