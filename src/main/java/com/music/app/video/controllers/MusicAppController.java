package com.music.app.video.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.music.app.video.business.VideoPlayService;
import com.music.app.video.entity.Video;

@RestController

public class MusicAppController {
	private VideoPlayService videoPlayService;
	
	@Autowired
	public MusicAppController(VideoPlayService videoPlayService){
		this.videoPlayService = videoPlayService;
	}

	@RequestMapping(value="/videos",method=RequestMethod.GET)
	public  Iterable<Video> getVideoLinks(){
		return videoPlayService.getAllVideos();
	}
	
	@RequestMapping(value="/video/{id}",method=RequestMethod.DELETE)
	public void deleteVideoLinks(@PathVariable("id") Long id){
		videoPlayService.deleteVideo(id);
	}
	@RequestMapping(value="/video/{link}",method=RequestMethod.POST)
	public String insertVideoLinks(@PathVariable("link") String link){
		Video video = new Video();
		video.setLink(link);
		videoPlayService.addVideo(video);
		return link;
	}
	
	
}
