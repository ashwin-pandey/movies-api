package com.videostraming.repository.series;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.videostraming.bean.series.Series;

@Repository
public interface SeriesRepository extends JpaRepository<Series, Integer> {

	@Query(value = "FROM Series")
	List<Series> getAllSeries();
	
	@Query(value = "FROM Series WHERE id = ?1")
	List<Series> getSingleSeries(int id);

}
