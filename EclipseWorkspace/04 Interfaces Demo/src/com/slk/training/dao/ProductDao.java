package com.slk.training.dao;

public interface ProductDao {
	// A DAO interface generally contains CRUD and Query operations
	// This is such an example interface, without proper arguments
	// and return types.
	
	public void addProduct(); // generally takes a Product instance as argument
	public void getProduct(); // generally takes ID as argument and returns a Product
	public void updateProduct(); // generally takes a Product instance as argument
	public void deleteProduct(); // generally takes ID as argument.
	
	// generally all functions here "throws" a user defined exception (ex, DaoException)
	
}
