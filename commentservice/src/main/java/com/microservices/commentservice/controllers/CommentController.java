package com.microservices.commentservice.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microservices.commentservice.model.Comment;
import com.microservices.commentservice.service.CommentService;

@RestController
@RequestMapping("/comments")
public class CommentController {
	
	@Autowired
	CommentService service;
	
	
	@GetMapping("/findCommentsByPid/{pid}")
	public ResponseEntity<List<Comment>> 
	getCommentsByPid(@PathVariable("pid") int pid){
		
		return new ResponseEntity(service.findCommentsByPid(pid), HttpStatus.OK);
		
	}

}
