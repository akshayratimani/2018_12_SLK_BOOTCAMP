package com.slk.training.programs;

import com.slk.training.dao.DaoFactory;
import com.slk.training.dao.ProductDao;

public class P03_TestingDaoFactory {

	public static void main(String[] args) {
		
		ProductDao dao;
		
		// dao = new ProductDaoFileImpl(); 
		// tight coupling: 
		
		// The application depends on a specific implementation
		// In a large application, the above statement (or the likes of it) may be
		// used in hundreds of places. And if the implementation changes, we have to
		// update in all those places. This is the biggest drawback.
		
		// To avoid this, use a factory method pattern.
		// A factory method is a.k.a virtual constructor, since it returns a newly
		// constructed object (instead of we creating one).
		
		
		dao = DaoFactory.newProductDao("array"); // "jdbc" or "file"
		dao.addProduct();
		dao.getProduct();
		dao.updateProduct();
		dao.deleteProduct();
		
	}
}















