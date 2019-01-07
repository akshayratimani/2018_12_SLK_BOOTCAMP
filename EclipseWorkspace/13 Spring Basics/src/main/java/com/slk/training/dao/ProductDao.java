package com.slk.training.dao;

import java.util.List;

import com.slk.training.entity.Product;

public interface ProductDao {

	// CRUD operations

	public void addProduct(Product product) throws DaoException;

	public Product getProduct(int id) throws DaoException;

	public void updateProduct(Product product) throws DaoException;

	public void deleteProduct(int id) throws DaoException;

	// QUERIES
	
	public int count() throws DaoException;

	public List<Product> getAllProducts() throws DaoException;

	public List<Product> getProductsByPriceRange(double min, double max) throws DaoException;

	public List<Product> getProductsByCategory(String category) throws DaoException;

}
