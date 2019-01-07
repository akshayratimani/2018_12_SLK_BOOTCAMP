package com.slk.training.programs;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.slk.training.cfg.AppConfig5;
import com.slk.training.entity.Product;

public class P04_TestingJdbcTemplate {

	private static JdbcTemplate template;

	static class ProductRowMapper implements RowMapper<Product> {
		@Override
		public Product mapRow(ResultSet rs, int rowNum) throws SQLException {
			Product p = new Product();
			p.setId(rs.getInt("id"));
			p.setName(rs.getString("name"));
			p.setCategory(rs.getString("category"));
			p.setPrice(rs.getDouble("price"));
			return p;
		}
	}

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx;
		ctx = new AnnotationConfigApplicationContext(AppConfig5.class);

		template = ctx.getBean(JdbcTemplate.class);
		printProductCount();
		printProductNameForId(7); // 7 --> id of the product
		printProductDetailsForId(7); // 7 --> id of the product
		increaseProductPriceForId(7, 1000.0); // 7 --> id, 1000.0 --> incr. by
		printAllProductNamesAndPrices();
		getProductForId(7); // 7 --> id
		getAllProducts(); 
		ctx.close();
	}

	static void getAllProducts() {
		List<Product> list = template.query("select * from products", new ProductRowMapper());
		System.out.println("All products:");
		for(Product p: list) {
			System.out.println(p);
		}
		System.out.println();
	}

	static void getProductForId(int id) {
		String sql = "select * from products where id = ?";
		ProductRowMapper prm = new ProductRowMapper();
		// prm knows how to convert a row (ResultSet) into a Product instance
		Product p = template.queryForObject(sql, prm, id);
		System.out.println(p);
		System.out.println();

	}

	static void increaseProductPriceForId(int id, double incr) {
		String sql = "update products set price = price + ? where id = ?";
		int uc = template.update(sql, incr, id);
		System.out.printf("%d row/s updated\n", uc);
		System.out.println();

	}

	static void printAllProductNamesAndPrices() {
		String sql = "select name, price from products";
		// the query produces multiple rows, multiple columns
		// use the queryForList function
		List<Map<String, Object>> list = template.queryForList(sql);
		System.out.println("\nProduct names and prices are: ");
		for (Map<String, Object> row : list) {
			System.out.printf("%-30s %10.2f\n", row.get("name"), row.get("price"));
		}
		System.out.println();

	}

	static void printProductDetailsForId(int id) {
		String sql = "select * from products where id = ?";
		// Use queryForMap when the SQL results in 1 row multiple columns
		Map<String, Object> row = template.queryForMap(sql, id);
		System.out.println("\nProduct detaile for id " + id);
		System.out.println("Name     = " + row.get("name"));
		System.out.println("Category = " + row.get("CATEGORY"));
		System.out.println("Price    = Rs." + row.get("PRIce"));
		System.out.println();

	}

	static void printProductNameForId(int id) {
		// query results in 1 row 1 column
		String sql = "select name from products where id = ?";
		String name = template.queryForObject(sql, String.class, id);
		System.out.printf("Name (id=%d): %s\n", id, name);
		System.out.println();

	}

	static void printProductCount() {
		// use queryForObject when the SQL returns 1 row 1 column exactly
		Integer pc = template.queryForObject("select count(*) from products", Integer.class);
		System.out.println("There are " + pc + " products.");
		System.out.println();

	}
}
