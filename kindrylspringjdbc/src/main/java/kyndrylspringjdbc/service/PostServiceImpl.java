package kyndrylspringjdbc.service;

import java.util.List;

import kyndrylspringjdbc.dao.PostDaoImpl;
import kyndrylspringjdbc.model.Post;

public class PostServiceImpl implements PostService {
	
	public PostDaoImpl dao;
	
	

	public PostDaoImpl getDao() {
		return dao;
	}



	public void setDao(PostDaoImpl dao) {
		this.dao = dao;
	}



	public List<Post> getAllPosts() {
		// TODO Auto-generated method stub
		return dao.getPostsFromDatabase();
	}



	@Override
	public String insertPost(Post post) {
		// TODO Auto-generated method stub
		return dao.insertPost(post);
	}



	@Override
	public String deletePost(int pid) {
		// TODO Auto-generated method stub
		return dao.deletePost(pid);
	}

}
