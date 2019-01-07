package com.slk.training.dao;

import java.util.List;

import com.slk.training.entity.Product;

public class ProductDaoCsvImpl implements ProductDao {

	public ProductDaoCsvImpl() {
	}

	@Override
	public int count() throws DaoException {
		throw new DaoException("Method not implemented yet!");
	}

	@Override
	public void addProduct(Product product) throws DaoException {
		throw new DaoException("Method not implemented yet!");
	}

	@Override
	public Product getProduct(int id) throws DaoException {
		throw new DaoException("Method not implemented yet!");
	}

	@Override
	public void updateProduct(Product product) throws DaoException {
		throw new DaoException("Method not implemented yet!");
	}

	@Override
	public void deleteProduct(int id) throws DaoException {
		throw new DaoException("Method not implemented yet!");
	}

	@Override
	public List<Product> getAllProducts() throws DaoException {
		throw new DaoException("Method not implemented yet!");
	}

	@Override
	public List<Product> getProductsByPriceRange(double min, double max) throws DaoException {
		throw new DaoException("Method not implemented yet!");
	}

	@Override
	public List<Product> getProductsByCategory(String category) throws DaoException {
		throw new DaoException("Method not implemented yet!");
	}

}
