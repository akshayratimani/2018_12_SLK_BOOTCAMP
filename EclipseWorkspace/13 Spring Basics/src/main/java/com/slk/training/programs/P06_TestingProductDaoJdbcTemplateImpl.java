package com.slk.training.programs;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.slk.training.cfg.AppConfig5;
import com.slk.training.dao.DaoException;
import com.slk.training.dao.ProductDao;
import com.slk.training.entity.Product;

public class P06_TestingProductDaoJdbcTemplateImpl {
	
	static ProductDao dao;

	public static void main(String[] args) throws DaoException {
		AnnotationConfigApplicationContext ctx;
		ctx = new AnnotationConfigApplicationContext(AppConfig5.class);
		dao = ctx.getBean("productDaoJdbcTemplateImpl", ProductDao.class);
		
		testGetProduct();
		
		ctx.close();
	}

	static void testGetProduct() throws DaoException {
		Product p = dao.getProduct(7);
		System.out.println(p);
	}
}
