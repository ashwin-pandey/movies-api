package com.videostraming.repository.series;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.videostraming.bean.series.Episode;

@Repository
public interface EpisodeRepository extends JpaRepository<Episode, Integer> {

	@Query(value = "FROM Episode WHERE seriesId = ?1 AND seasonId = ?2")
	List<Episode> getAllEpisode(int id, int sid);
	
	@Query(value = "FROM Episode WHERE seriesId = ?1 AND seasonId = ?2 AND id = ?3")
	List<Episode> getSingleEpisode(int id, int sid, int eid);

}
