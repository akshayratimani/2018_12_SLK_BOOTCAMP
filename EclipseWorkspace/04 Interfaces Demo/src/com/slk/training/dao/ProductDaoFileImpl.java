package com.slk.training.dao;

public class ProductDaoFileImpl implements ProductDao {

	@Override
	public void addProduct() {
		System.out.println("Adding product into a file...");
	}

	@Override
	public void getProduct() {
		System.out.println("getting a product details from the file...");
	}

	@Override
	public void updateProduct() {
		System.out.println("Updating product details in the file...");
	}

	@Override
	public void deleteProduct() {
		System.out.println("Deleting a product in a file...");
	}

}
