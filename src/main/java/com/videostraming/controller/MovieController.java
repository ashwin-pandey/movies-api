package com.videostraming.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.videostraming.bean.Movie;
import com.videostraming.service.MovieService;

@RestController
public class MovieController {

	@Autowired
	MovieService movieService;
	
	@CrossOrigin(origins = "http://localhost:4200")
	@GetMapping(path = "/api/movies/all")
	public List<Movie> getAllMovies() {
		return movieService.getAllMovies();
	}
	
	@CrossOrigin(origins = "http://localhost:4200")
	@GetMapping(path = "/api/movies/{id}")
	public List<Movie> getSingleMovie(@PathVariable int id) {
		return movieService.getSingleMovie(id);
	}
	
}
