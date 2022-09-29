package com.microservices.commentservice.service;

import java.util.List;

import com.microservices.commentservice.model.Comment;

public interface CommentService {
	
	public List<Comment> findCommentsByPid(int pid);

}
