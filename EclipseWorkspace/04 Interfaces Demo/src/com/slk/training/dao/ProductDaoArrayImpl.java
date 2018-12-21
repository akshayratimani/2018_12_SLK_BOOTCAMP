package com.slk.training.dao;

public class ProductDaoArrayImpl implements ProductDao {

	@Override
	public void addProduct() {
		System.out.println("Adding product into an array...");
	}

	@Override
	public void getProduct() {
		System.out.println("getting a product details from the array...");
	}

	@Override
	public void updateProduct() {
		System.out.println("Updating product details in the array...");
	}

	@Override
	public void deleteProduct() {
		System.out.println("Deleting a product in an array...");
	}

}
