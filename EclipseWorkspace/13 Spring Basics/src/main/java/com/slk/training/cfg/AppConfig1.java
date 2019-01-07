package com.slk.training.cfg;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.slk.training.dao.ProductDaoJdbcImpl;

// This class is equivalent of <beans ...> </beans> of context.xml
@Configuration
public class AppConfig1 {

	public AppConfig1() {
		System.out.println("AppConfig1 instantiated!");
	}

	// A bean is defined by returning an object of a class from a function.
	// And the function must be annotated with @Bean(..)
	@Bean(name = { "jdbc", "test" })
	public ProductDaoJdbcImpl test() {
		ProductDaoJdbcImpl dao = new ProductDaoJdbcImpl();
		dao.setDriver("org.h2.Driver");
		dao.setUrl("jdbc:h2:tcp://localhost/~/slk_training_2018_12");
		dao.setUser("sa");
		dao.setPassword("");
		return dao;
	}

}
