package com.videostraming.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.videostraming.bean.series.Season;
import com.videostraming.bean.series.Series;
import com.videostraming.service.SeriesService;

@RestController
public class SeriesController {
	
	private SeriesService seriesService;

	@GetMapping(path = "/api/series/all")
	public List<Series> getAllSeries() {
		return seriesService.getAllSeries();
	}
	
	@GetMapping(path = "/api/series/{id}")
	public List<Series> getSingleSeries(@PathVariable("id") int id) {
		return seriesService.getSingleSeries(id);
	}
	
	@GetMapping(path = "/api/series/{id}/season/all")
	public List<Season> getAllSeason(@PathVariable("id") int id) {
		return seriesService.getAllSeason(id);
	}
	
	@GetMapping(path = "/api/series/{id}/season/{sid}")
	public List<Season> getSingleSeason(@PathVariable("id") int id, @PathVariable("sid") int sid) {
		return seriesService.getSingleSeason(id, sid);
	}
	
}
