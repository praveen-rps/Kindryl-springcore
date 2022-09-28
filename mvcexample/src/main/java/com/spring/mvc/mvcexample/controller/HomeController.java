package com.spring.mvc.mvcexample.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.spring.mvc.mvcexample.config.DataConfigurations;
import com.spring.mvc.mvcexample.dao.UserDaoImpl;
import com.spring.mvc.mvcexample.entity.User;

@Controller
public class HomeController {
	
	
	@RequestMapping(value="/")
	public ModelAndView test(HttpServletResponse response) 
			throws IOException{
		return new ModelAndView("home","name","praveen");
	}
	
	@RequestMapping(value="/login")
	public String login() {
		return "login";
	}
	@RequestMapping(value="/validate")
	public ModelAndView validateUser(HttpServletRequest request) {
		
		AnnotationConfigApplicationContext context
		= new AnnotationConfigApplicationContext(DataConfigurations.class);
		
		
		UserDaoImpl dao = (UserDaoImpl) context.getBean("dao");
	  String username=request.getParameter("lid");
		String passwd=request.getParameter("pwd");
		List<User> users = dao.getAllUsers();
		boolean isValid=false;
		for (User user : users) {

			if (username.equals(user.getUsername()) && passwd.equals(user.getPassword())) {
				isValid = true;
				break;
			}
		}
		if(isValid)
			return new ModelAndView("pass", "username",username );
		else
			return new ModelAndView("fail");
	}
	
}
