package com.microservices.commentservice.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.microservices.commentservice.model.Comment;


@Repository
public interface CommentsDao extends JpaRepository<Comment,Integer>{

	@Query("select c from Comment c where c.pid=?1")
	public List<Comment> getCommentsByPid(int pid);
}
