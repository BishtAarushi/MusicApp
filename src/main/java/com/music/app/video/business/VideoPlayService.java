package com.music.app.video.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.music.app.video.entity.Video;
import com.music.app.video.repository.VideoRepository;

@Service
public class VideoPlayService {
	@Autowired
	private VideoRepository videoRepository;
	
	
	public VideoPlayService(VideoRepository videoRespository) {
		this.videoRepository = videoRespository;
	}
	public void addVideo(Video video){
			if(!exists(video.getLink())){
				videoRepository.save(video);
			}
	}
	public Iterable<Video> getAllVideos(){
		return videoRepository.findAll();
	}
	public void deleteVideo(Long id){
		videoRepository.delete(id);
	}
	public boolean exists(String link){
		Video video = videoRepository.findByLink(link);
		if(video != null){
			return true;
		}
		return false;
	}
}
