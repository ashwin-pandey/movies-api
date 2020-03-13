package com.videostraming.service;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.videostraming.bean.Movie;
import com.videostraming.repository.MovieRepository;

@Service
public class MovieService {

	@Autowired
	MovieRepository movieRepository;
	
	public List<Movie> getAllMovies() {
		return movieRepository.getAllMovies();
	}
	
	public List<Movie> getSingleMovie(int id) {
		return movieRepository.getSingleMovie(id);
	}

	public ResponseEntity<Object> createMovie(Movie movie) {
		Movie savedMovie = movieRepository.save(movie);
		URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(savedMovie.getId())
				.toUri();
		return ResponseEntity.created(location).build();
	}
	
}
