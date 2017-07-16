package com.music.app.video.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.music.app.video.entity.Video;

@Repository
public interface VideoRepository extends CrudRepository<Video,Long> {
	Video findByLink(String link);
	}
