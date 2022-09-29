package com.microservices.postservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.microservices.postservice.dao.PostDao;
import com.microservices.postservice.model.CommentsDto;
import com.microservices.postservice.model.Post;
import com.microservices.postservice.model.PostDto;
import com.microservices.postservice.utils.PostUtilties;


@Service
public class PostServiceImpl implements PostService{
	
	@Autowired
	RestTemplate template;
	
	
	@Autowired
	PostDao dao;

	@Override
	public List<Post> getAllPosts() {
		// TODO Auto-generated method stub
		return dao.findAll();
	}

	@Override
	public Post createPost(PostDto post) {
		// TODO Auto-generated method stub
		// any kind of validations on postdto is performed
		// convert into entity object and then pass to dao layer
		return dao.save(PostUtilties.convertPostDto2Post(post));
	}

	@Override
	public void deletePost(int pid) {
		// TODO Auto-generated method stub
		dao.deleteById(pid);;
		
	}

	@Override
	public List<Post> searchPostByTitle(String title) {
		// TODO Auto-generated method stub
		return dao.getPostsByTitle(title);
	}

	@Override
	public List<Post> searchPostByAuthor(String author) {
		// TODO Auto-generated method stub
		return dao.getPostsByAuthor(author);
	}

	@Override
	public List<Post> searchPostByPid(Iterable<Integer> pid) {
		// TODO Auto-generated method stub
		return dao.findAllById(pid);
	}

	@Override
	public Post updatePost(Post post) {
		// TODO Auto-generated method stub
		return dao.save(post);
	}

	@Override
	public List<CommentsDto> getCommentsByPostId(int pid) {
		// TODO Auto-generated method stub
		return template.getForObject("http://COMMENT-SERVICE/comments/findCommentsByPid/"+pid, List.class);
	}

}
