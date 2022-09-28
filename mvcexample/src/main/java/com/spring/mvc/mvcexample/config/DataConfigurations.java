package com.spring.mvc.mvcexample.config;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.spring.mvc.mvcexample.dao.UserDaoImpl;

@Configuration
@ComponentScan(basePackages="com.spring.mvc.mvcexample")
public class DataConfigurations {

	@Bean
	public DataSource getDataSourceObject() {
		// TODO Auto-generated method stub
		DriverManagerDataSource ds = new DriverManagerDataSource();
		ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
		ds.setUrl("jdbc:mysql://localhost:3306/fisglobal");
		ds.setUsername("root");
		ds.setPassword("root");
		return ds;
	}
	
	
	@Bean(name="jdbc")
	public JdbcTemplate getJdbcTemplateObject() {
		
		JdbcTemplate template = 
				new JdbcTemplate(getDataSourceObject());
		
		return template;
	}
	

	@Bean(name="dao")
	public UserDaoImpl getPostDaoImplObject() {
		UserDaoImpl dao = new UserDaoImpl();
		dao.setTemplate(getJdbcTemplateObject());
		return dao;
	}
	


}
