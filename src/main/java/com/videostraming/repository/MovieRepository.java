package com.videostraming.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.videostraming.bean.Movie;

@Repository
public interface MovieRepository extends JpaRepository<Movie, Integer> {

	@Query(value = "from Movie")
	List<Movie> getAllMovies();

	@Query(value = "from Movie WHERE id = ?1")
	List<Movie> getSingleMovie(int id);
	
}
