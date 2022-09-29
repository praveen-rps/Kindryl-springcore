package com.microservices.postservice.utils;

import com.microservices.postservice.model.Post;
import com.microservices.postservice.model.PostDto;

public class PostUtilties {
	
	public static Post convertPostDto2Post(PostDto post) {
		return new Post(post.getPid(), post.getAuthor(), post.getTitle(), post.getDescription());
	}
	
	public static PostDto convertPost2PostDto(Post post) {
		return new PostDto(post.getPid(), post.getAuthor(), post.getTitle(), post.getDescription());
	}

}
