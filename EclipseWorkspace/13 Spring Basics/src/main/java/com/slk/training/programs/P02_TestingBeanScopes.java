package com.slk.training.programs;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.slk.training.dao.ProductDao;

public class P02_TestingBeanScopes {

	public static void main(String[] args) {

		System.out.println("Creating a new spring container...");
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("context3.xml");
		System.out.println("Spring container created successfully!");

		System.out.println("Getting a bean of type ProductDao from spring container...");
		ProductDao dao1 = ctx.getBean(ProductDao.class);
		ProductDao dao2 = ctx.getBean(ProductDao.class);

		System.out.println("dao1 == dao2 is " + (dao1 == dao2));

		ctx.close();
	}
}
