package com.slk.training.cfg;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = { "com.slk.training.dao" })
public class AppConfig4 {

	@Bean(name = { "dbcp", "dataSource" })
	public BasicDataSource dbcp() {
		BasicDataSource bds = new BasicDataSource();
		bds.setDriverClassName("org.h2.Driver");
		bds.setUrl("jdbc:h2:tcp://localhost/~/slk_training_2018_12");
		bds.setUsername("sa");
		bds.setPassword("");
		bds.setInitialSize(10);
		bds.setMaxTotal(100);
		bds.setMinIdle(5);
		bds.setMaxIdle(50);
		bds.setMaxWaitMillis(5000);
		return bds;
	}

}
