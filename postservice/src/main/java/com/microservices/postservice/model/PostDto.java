package com.microservices.postservice.model;

import javax.persistence.Column;
import javax.persistence.Id;

import org.springframework.lang.NonNull;

public class PostDto {

	
	int pid;

	@Column
	
	@NonNull
	
	String author;
	String title;
	String description;
	public PostDto() {
	}
		
	public PostDto(int pid, String author, String title, String description) {
		super();
		this.pid = pid;
		this.author = author;
		this.title = title;
		this.description = description;
	}


	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	@Override
	public String toString() {
		return "Post [pid=" + pid + ", author=" + author + ", title=" + title + ", description=" + description + "]";
	}

}
