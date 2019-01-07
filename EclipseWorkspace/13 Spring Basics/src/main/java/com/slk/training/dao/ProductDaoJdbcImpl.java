package com.slk.training.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.slk.training.entity.Product;

@Repository("jdbc")
public class ProductDaoJdbcImpl implements ProductDao {

	private String driver;
	private String url;
	private String user;
	private String password;

	@Autowired(required = false)
	private DataSource dataSource;

	// spring calls this constructor by default
	public ProductDaoJdbcImpl() {
		System.out.println("An object of ProductDaoJdbcImpl is created using default constructor");
	}

	// spring can call this constructor via constructor-injection
	public ProductDaoJdbcImpl(String driver, String url, String user, String password) {
		System.out.println("An object of ProductDaoJdbcImpl is created using overloaded constructor with string args");

		this.driver = driver;
		this.url = url;
		this.user = user;
		this.password = password;
	}

	// parameterized constructor for dependency injection
	public ProductDaoJdbcImpl(DataSource dataSource) {
		System.out.println("An object of ProductDaoJdbcImpl is created using overloaded constructor with DataSource");
		this.dataSource = dataSource;
	}

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}

	// spring can call any setter via property-injection (setter injection)
	// a setter is also known as a writable property or a mutator
	// if name of the setter is "setDriver", the name of the property is "driver"
	public void setDriver(String driver) {
		this.driver = driver;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	// setter property called "jdbcInfo"
	public void setJdbcInfo(String[] info) {
		driver = info[0];
		url = info[1];
		user = info[2];
		password = info[3];
	}

	// writable property "jdbcMap"
	public void setJdbcMap(Map<String, String> map) {
		driver = map.get("jdbc.driver");
		url = map.get("jdbc.url");
		user = map.get("jdbc.user");
		password = map.get("jdbc.password");
	}

	private Connection openConnection() throws ClassNotFoundException, SQLException {

		if (dataSource != null) {
			return dataSource.getConnection();
		}

		Class.forName(driver);
		return DriverManager.getConnection(url, user, password);
	}

	@Override
	public int count() throws DaoException {
		String sql = "select count(*) from products";
		try (Connection conn = openConnection();
				PreparedStatement stmt = conn.prepareStatement(sql);
				ResultSet rs = stmt.executeQuery();) {
			rs.next();
			return rs.getInt(1);
		} catch (Exception ex) {
			throw new DaoException(ex);
		}
	}

	@Override
	public void addProduct(Product product) throws DaoException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Product getProduct(int id) throws DaoException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateProduct(Product product) throws DaoException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteProduct(int id) throws DaoException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Product> getAllProducts() throws DaoException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Product> getProductsByPriceRange(double min, double max) throws DaoException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Product> getProductsByCategory(String category) throws DaoException {
		// TODO Auto-generated method stub
		return null;
	}

}
