package com.videostraming.repository.series;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.videostraming.bean.series.Season;

@Repository
public interface SeasonRepository extends JpaRepository<Season, Integer> {

	@Query(value = "FROM Season WHERE seriesId = ?1")
	List<Season> getAllSeason(int id);
	
	@Query(value = "FROM Season WHERE seriesId = ?1 AND id = ?2")
	List<Season> getSingleSeason(int id, int sid);

}
