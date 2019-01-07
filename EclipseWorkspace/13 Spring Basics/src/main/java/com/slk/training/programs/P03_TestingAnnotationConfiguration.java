package com.slk.training.programs;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.slk.training.cfg.AppConfig4;
import com.slk.training.dao.DaoException;
import com.slk.training.dao.ProductDao;

public class P03_TestingAnnotationConfiguration {

	public static void main(String[] args) throws DaoException {

		AnnotationConfigApplicationContext ctx;
		ctx = new AnnotationConfigApplicationContext(AppConfig4.class);

		ProductDao dao = ctx.getBean("jdbc", ProductDao.class);
		int pc = dao.count();

		System.out.println("There are " + pc + " products.");
		ctx.close();
	}

}
