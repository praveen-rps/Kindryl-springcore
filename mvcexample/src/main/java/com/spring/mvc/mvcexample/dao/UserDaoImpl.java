package com.spring.mvc.mvcexample.dao;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.spring.mvc.mvcexample.entity.User;
import com.spring.mvc.mvcexample.entity.UserRowMapper;

@Component
public class UserDaoImpl implements UserDao {

	public JdbcTemplate template;

	public JdbcTemplate getTemplate() {
		return template;
	}

	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}

	@Override
	public List<User> getAllUsers() {
		// TODO Auto-generated method stub
		
		String sql = "select * from User";
		List<User> users = template.query(sql, new UserRowMapper());
		return users;
	}

}
