package com.microservices.postservice.service;
import java.util.List;

import com.microservices.postservice.model.CommentsDto;
import com.microservices.postservice.model.Post;
import com.microservices.postservice.model.PostDto;



public interface PostService {
	
	public List<Post> getAllPosts();
	public Post createPost(PostDto post);
	public void deletePost(int pid);
	public List<Post> searchPostByTitle(String title);
	public List<Post> searchPostByAuthor(String title);
	public List<Post> searchPostByPid(Iterable<Integer> pid);
	public Post updatePost(Post post);
	
	public List<CommentsDto> getCommentsByPostId(int pid);
}
