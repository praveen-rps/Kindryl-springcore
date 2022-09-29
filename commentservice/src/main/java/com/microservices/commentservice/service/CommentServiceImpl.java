package com.microservices.commentservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.microservices.commentservice.dao.CommentsDao;
import com.microservices.commentservice.model.Comment;

@Service
public class CommentServiceImpl implements CommentService {
	
	@Autowired
	CommentsDao dao;

	@Override
	public List<Comment> findCommentsByPid(int pid) {
		// TODO Auto-generated method stub
		return dao.getCommentsByPid(pid);
	}

}
