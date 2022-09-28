package com.spring.mvc.mvcexample.dao;

import java.util.List;

import com.spring.mvc.mvcexample.entity.User;

public interface UserDao {
	public List<User> getAllUsers();
}
