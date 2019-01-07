package com.slk.training.cfg;

import java.util.HashMap;
import java.util.Map;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.slk.training.dao.ProductDaoJdbcImpl;

// This class is equivalent of <beans ...> </beans> of context.xml
@Configuration
public class AppConfig2 {

	@Bean
	public Map<String, String> jdbcMap() {
		Map<String, String> map = new HashMap<>();
		map.put("jdbc.driver", "org.h2.Driver");
		map.put("jdbc.url", "jdbc:h2:tcp://localhost/~/slk_training_2018_12");
		map.put("jdbc.user", "sa");
		map.put("jdbc.password", "");

		return map;
	}

	@Bean(name = { "jdbc" })
	public ProductDaoJdbcImpl test(Map<String, String> map) { // dependency injection
		ProductDaoJdbcImpl dao = new ProductDaoJdbcImpl();
		// dao.setJdbcMap(this.jdbcMap()); // manual wiring
		dao.setJdbcMap(map); // manual wiring
		return dao;
	}

}
