package com.music.app.video.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="VIDEO")
public class Video {
	@Id
	@Column(name="VIDEO_ID")
    @GeneratedValue(strategy= GenerationType.AUTO)
	private long id;
	
	@Column(name="VIDEO_LINK")
	private String link;
	
	public long getId() {
		return id;
	}
	
	public String getLink() {
		return link;
	}


	public void setLink(String link) {
		this.link = link;
	}



	
	
}
