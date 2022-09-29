package com.microservices.postservice.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.microservices.postservice.model.Post;


@Repository
public interface PostDao extends JpaRepository<Post,Integer>{
	
	
	@Query("select p from Post p where p.author=?1")
	public List<Post> getPostsByAuthor(String author);
	
	@Query("select p from Post p where p.title=?1")
	public List<Post> getPostsByTitle(String title);

}
