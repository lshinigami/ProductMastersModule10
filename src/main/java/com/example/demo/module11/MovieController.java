package com.example.demo.module11;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/movies")
@RequiredArgsConstructor
public class MovieController {

    private final MovieService movieService;
    @GetMapping("/all")
    public List<MovieModel> getAllMovies() {
        return movieService.listMovies();
    }

    @GetMapping("/by-director")
    public List<MovieModel> getMoviesByDirector(@RequestParam String name) {
        return movieService.listMoviesByDirector(name);
    }

    @PostMapping("/add")
    public ResponseEntity<?> addMovie(@RequestBody MovieModel movie) {
        try {
            List<MovieModel> updatedList = movieService.addNewMovie(movie);
            return ResponseEntity.ok(updatedList);
        } catch (RuntimeException e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }
}
