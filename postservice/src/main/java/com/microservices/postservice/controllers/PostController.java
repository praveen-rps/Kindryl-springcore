package com.microservices.postservice.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microservices.postservice.model.CommentsDto;
import com.microservices.postservice.model.Post;
import com.microservices.postservice.model.PostDto;
import com.microservices.postservice.service.PostService;

@RestController
@RequestMapping("/posts")
public class PostController {
	
	@Autowired
	PostService service;
	
	
	@GetMapping("/all")
	public ResponseEntity<List<Post>> getAll(){
		
		return new ResponseEntity(service.getAllPosts(), HttpStatus.OK);
	}
	
	@PostMapping("/save")
	public ResponseEntity<PostDto> insertPost(@RequestBody PostDto post) {
		
		return new ResponseEntity(service.createPost(post), HttpStatus.ACCEPTED);
	}
	
	@DeleteMapping("/delete/{pid}")
	public ResponseEntity<String> deletePost(@PathVariable("pid")int pid){
		
		service.deletePost(pid);
		return new ResponseEntity<>("Post deleted",HttpStatus.OK);
	
	}
	
	@GetMapping("/search/{author}")
	public ResponseEntity<List<Post>> getPostByAuthor(@PathVariable("author") String author)
	{
		return new ResponseEntity<>(service.searchPostByAuthor(author), HttpStatus.OK);
			
	}
	
	@PutMapping("/update")
	public ResponseEntity<Post> updatePost(@RequestBody Post post) {
		
		return new ResponseEntity(service.updatePost(post), HttpStatus.ACCEPTED);
	}
	
	@GetMapping("/search/comments/{pid}")
	public ResponseEntity<List<CommentsDto>> findComments(@PathVariable("pid")int pid){
		return new ResponseEntity<>(service.getCommentsByPostId(pid), HttpStatus.OK);
	}
	

}
