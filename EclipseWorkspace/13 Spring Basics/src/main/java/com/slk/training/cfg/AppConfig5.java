package com.slk.training.cfg;

import javax.sql.DataSource;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;

@Configuration
@ComponentScan(basePackages = { "com.slk.training.dao" })
public class AppConfig5 {

	@Bean
	public DataSource dbcp() {
		BasicDataSource bds = new BasicDataSource();
		bds.setDriverClassName("org.h2.Driver"); // com.mysql.jdbc.Driver
		bds.setUrl("jdbc:h2:tcp://localhost/~/slk_training_2018_12");
		// jdbc:mysql://localhost/slk_training_2018_12
		bds.setUsername("sa");
		bds.setPassword("");

		bds.setInitialSize(10);
		bds.setMaxTotal(100);
		bds.setMaxIdle(50);
		bds.setMinIdle(5);
		bds.setMaxWaitMillis(50000);

		return bds;
	}

	@Bean
	public JdbcTemplate template(DataSource ds) { // Dependency Injection
		JdbcTemplate tpl = new JdbcTemplate(ds); // Manual wiring via constructor
		return tpl;
	}
}
