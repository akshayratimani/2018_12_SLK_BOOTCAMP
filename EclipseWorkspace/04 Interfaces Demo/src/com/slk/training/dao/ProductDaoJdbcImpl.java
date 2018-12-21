package com.slk.training.dao;

public class ProductDaoJdbcImpl implements ProductDao {

	@Override
	public void addProduct() {
		System.out.println("Adding product into a database table...");
	}

	@Override
	public void getProduct() {
		System.out.println("getting a product details from the database table...");
	}

	@Override
	public void updateProduct() {
		System.out.println("Updating product details in the database table...");
	}

	@Override
	public void deleteProduct() {
		System.out.println("Deleting a product in a database table...");
	}

}
