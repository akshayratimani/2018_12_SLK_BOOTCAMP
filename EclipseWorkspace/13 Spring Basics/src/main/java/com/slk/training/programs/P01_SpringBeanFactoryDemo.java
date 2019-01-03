package com.slk.training.programs;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.slk.training.dao.DaoException;
import com.slk.training.dao.ProductDao;

public class P01_SpringBeanFactoryDemo {

	public static void main(String[] args) throws DaoException {
		
		// a variable representing the spring container
		ClassPathXmlApplicationContext ctx; // bean factory
		
		// an object representing the spring container
		ctx = new ClassPathXmlApplicationContext("context2.xml");
		
		ProductDao dao = ctx.getBean("jdbc", ProductDao.class);
		int pc = dao.count();
		System.out.println("There are " + pc + " products.");
		
		ctx.close();
	}
}
