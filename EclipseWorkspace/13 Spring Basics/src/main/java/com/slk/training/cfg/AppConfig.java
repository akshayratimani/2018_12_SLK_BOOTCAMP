package com.slk.training.cfg;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
	int x = 1;
	
	@Bean
	public String fn1() {
		x++;
		return "fn1";
	}
	
	@Bean
	public String fn2() {
		for(int i=1; i<=5; i++) {
			fn1();
		}
		return "fn2: value of x is " + x;
	}
	
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx;
		ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		String str = ctx.getBean("fn2", String.class);
		System.out.println(str);
		ctx.close();
		
	}
	
	
}
