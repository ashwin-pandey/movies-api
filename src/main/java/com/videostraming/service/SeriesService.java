package com.videostraming.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.videostraming.bean.series.Episode;
import com.videostraming.bean.series.Season;
import com.videostraming.bean.series.Series;
import com.videostraming.repository.series.EpisodeRepository;
import com.videostraming.repository.series.SeasonRepository;
import com.videostraming.repository.series.SeriesRepository;

@Service
public class SeriesService {

	@Autowired
	private SeriesRepository seriesRepository;

	@Autowired
	private SeasonRepository seasonRepository;

	@Autowired
	private EpisodeRepository episodeRepository;

	/*
	 * Series
	 */
	public List<Series> getAllSeries() {
		return seriesRepository.getAllSeries();
	}
	
	public List<Series> getSingleSeries(int id) {
		return seriesRepository.getSingleSeries(id);
	}

	/*
	 * Season
	 */
	public List<Season> getAllSeason(int id) {
		return seasonRepository.getAllSeason(id);
	}

	public List<Season> getSingleSeason(int id, int sid) {
		return seasonRepository.getSingleSeason(id, sid);
	}
	
	/*
	 * Episode
	 */
	public List<Episode> getAllEpisode(int id, int sid) {
		return episodeRepository.getAllEpisode(id, sid);
	}

	public List<Episode> getSingleEpisode(int id, int sid, int eid) {
		return episodeRepository.getSingleEpisode(id, sid, eid);
	}

}
