package com.slk.training.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.slk.training.entity.Product;

@Repository
public class ProductDaoJdbcTemplateImpl implements ProductDao {

	@Autowired(required = false)
	private JdbcTemplate template;

	// helper function that converts a ResultSet into a Product
	private Product toProduct(ResultSet rs) throws SQLException {
		Product p = new Product();
		p.setId(rs.getInt("id"));
		p.setName(rs.getString("name"));
		p.setCategory(rs.getString("category"));
		p.setPrice(rs.getDouble("price"));
		return p;
	}

	@Override
	public void addProduct(Product p) throws DaoException {
		try {
			String sql = "insert into products(id, name, price, category) values(?,?,?,?)";
			template.update(sql, p.getId(), p.getName(), p.getPrice(), p.getCategory());
		} catch (DataAccessException e) {
			throw new DaoException(e);
		}
	}

	@Override
	public Product getProduct(int id) throws DaoException {
		try {
			String sql = "select * from products where id=?";
			// second parameter is a lambda expression representing
			// an object of RowMapper<Product> type
			return template.queryForObject(sql, (rs, index) -> toProduct(rs), id);
		} catch (EmptyResultDataAccessException e) {
			return null;
		} catch (DataAccessException e) {
			throw new DaoException(e);
		}
	}

	@Override
	public void updateProduct(Product p) throws DaoException {
		try {
			String sql = "update products set name=?, price=?, category=? where id=?";
			template.update(sql, p.getName(), p.getPrice(), p.getCategory(), p.getId());
		} catch (DataAccessException e) {
			throw new DaoException(e);
		}
	}

	@Override
	public void deleteProduct(int id) throws DaoException {
		try {
			String sql = "delete from products where id=?";
			template.update(sql, id);
		} catch (DataAccessException e) {
			throw new DaoException(e);
		}
	}

	@Override
	public int count() throws DaoException {
		try {
			String sql = "select count(*) from products";
			return template.queryForObject(sql, Integer.class);
		} catch (DataAccessException e) {
			throw new DaoException(e);
		}
	}

	@Override
	public List<Product> getAllProducts() throws DaoException {
		try {
			String sql = "select * from products";
			return template.query(sql, (rs, index) -> toProduct(rs));
		} catch (DataAccessException e) {
			throw new DaoException(e);
		}
	}

	@Override
	public List<Product> getProductsByPriceRange(double min, double max) throws DaoException {
		try {
			String sql = "select * from products where price between ? and ?";
			return template.query(sql, (rs, index) -> toProduct(rs), min, max);
		} catch (DataAccessException e) {
			throw new DaoException(e);
		}
	}

	@Override
	public List<Product> getProductsByCategory(String category) throws DaoException {
		try {
			String sql = "select * from products where category=?";
			return template.query(sql, (rs, index) -> toProduct(rs), category);
		} catch (DataAccessException e) {
			throw new DaoException(e);
		}
	}

}
