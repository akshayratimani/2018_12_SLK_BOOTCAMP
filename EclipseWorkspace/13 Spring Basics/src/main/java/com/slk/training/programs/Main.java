package com.slk.training.programs;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.slk.training.cfg.AppConfig5;
import com.slk.training.dao.DaoException;
import com.slk.training.dao.ProductDao;
import com.slk.training.entity.Product;
import com.slk.training.utils.KeyboardUtil;

public class Main {

	ProductDao dao;
	AnnotationConfigApplicationContext ctx;

	public Main() {
		ctx = new AnnotationConfigApplicationContext(AppConfig5.class);
		dao = ctx.getBean("productDaoJdbcTemplateImpl", ProductDao.class);
	}

	public void start() {
		int choice;

		while ((choice = menu()) != 0) {
			switch (choice) {
			case 1:
				listAllProducts();
				break;
			case 2:
				listProductsByCategory();
				break;
			case 3:
				listProductsByPriceRange();
				break;
			case 4:
				displayProductById();
				break;
			case 5:
				addNewProduct();
				break;
			case 6:
				updateProduct();
				break;
			case 7:
				searchAndDeleteProduct();
			default:
				System.out.println("Please enter a number between 1 and 7 or 0 to quit!");
			}
		}
		ctx.close();
	}

	private void searchAndDeleteProduct() {
		System.out.println("----------------------------------------------------------------------------");
		try {
			int id = KeyboardUtil.getInt("Enter id to search: ");
			Product p = dao.getProduct(id);
			if (p == null) {
				System.out.println("No product found for id " + id);
				System.out.println("----------------------------------------------------------------------------");
				return;
			}
			System.out.println("Name     : " + p.getName());
			System.out.println("Category : " + p.getName());
			System.out.println("Price    : Rs." + p.getName());
			System.out.println("----------------------------------------------------------------------------");

			String confirm = KeyboardUtil.getString("Are you sure you want to delete this? (yes/no) : (no) ");
			if (confirm.equalsIgnoreCase("yes")) {
				dao.deleteProduct(id);
				System.out.println("Product deleted successfully!");
			}

		} catch (DaoException e) {
			System.out.println("There was an error: " + e);
		}
	}

	private void updateProduct() {
		System.out.println("----------------------------------------------------------------------------");
		try {
			int id = KeyboardUtil.getInt("Enter id to search: ");
			Product p = dao.getProduct(id);
			if (p == null) {
				System.out.println("No product found for id " + id);
				System.out.println("----------------------------------------------------------------------------");
				return;
			}

			String input;
			input = KeyboardUtil.getString("Name      : [" + p.getName() + "] ");
			if (input.trim().length() != 0) {
				p.setName(input);
			}

			input = KeyboardUtil.getString("Category  : [" + p.getCategory() + "] ");
			if (input.trim().length() != 0) {
				p.setCategory(input);
			}

			input = KeyboardUtil.getString("Price     : [" + p.getPrice() + "] ");
			if (input.trim().length() != 0) {
				p.setPrice(Double.parseDouble(input));
			}

			dao.updateProduct(p);
			System.out.println("Product details updated successfully!");
		} catch (DaoException e) {
			System.out.println("There was an error: " + e);
		}
	}

	private void addNewProduct() {
		System.out.println("----------------------------------------------------------------------------");
		try {
			int id = KeyboardUtil.getInt("Id        : ");
			String name = KeyboardUtil.getString("Name      : ");
			String category = KeyboardUtil.getString("Category  : ");
			double price = KeyboardUtil.getDouble("Price     : ");
			Product p = new Product(id, name, category, price);
			dao.addProduct(p);
			System.out.println("Product details added successfull!");
		} catch (DaoException e) {
			System.out.println("There was an error: " + e);
		}
		System.out.println("----------------------------------------------------------------------------");
	}

	private void displayProductById() {
		System.out.println("----------------------------------------------------------------------------");
		try {
			int id = KeyboardUtil.getInt("Enter id to search: ");
			Product p = dao.getProduct(id);
			if (p == null) {
				System.out.println("No product found for id " + id);
				System.out.println("----------------------------------------------------------------------------");
				return;
			}
			System.out.println("Name     : " + p.getName());
			System.out.println("Category : " + p.getCategory());
			System.out.println("Price    : Rs." + p.getPrice());
			System.out.println("----------------------------------------------------------------------------");

		} catch (DaoException e) {
			System.out.println("There was an error: " + e);
		}
	}

	private void listProductsByPriceRange() {
		try {
			double min = KeyboardUtil.getDouble("Enter min price: ");
			double max = KeyboardUtil.getDouble("Enter max price: ");
			List<Product> list = dao.getProductsByPriceRange(min, max);
			displayProductList(list);
		} catch (DaoException e) {
			System.out.println("There was an error: " + e);
		}
	}

	private void listProductsByCategory() {
		try {
			String category = KeyboardUtil.getString("Enter a category: ");
			List<Product> list = dao.getProductsByCategory(category);
			displayProductList(list);
		} catch (DaoException e) {
			System.out.println("There was an error: " + e);
		}
	}

	private void listAllProducts() {
		try {
			List<Product> list = dao.getAllProducts();
			displayProductList(list);
		} catch (DaoException e) {
			System.out.println("There was an error: " + e);
		}
	}

	private void displayProductList(List<Product> list) {
		System.out.println("----------------------------------------------------------------------------");
		if (list.size() == 0) {
			System.out.println("No products to display!");
			System.out.println("----------------------------------------------------------------------------");
			return;
		}
		System.out.printf("%-3s %-30s %-30s %10s\n", "Id", "Name", "Category", "Price");
		System.out.println("----------------------------------------------------------------------------");
		for (Product p : list) {
			System.out.printf("%-3d %-30s %-30s %10.2f\n", p.getId(), p.getName(), p.getCategory(), p.getPrice());
		}
		System.out.println("----------------------------------------------------------------------------");
	}

	private int menu() {
		System.out.println("1. List all products");
		System.out.println("2. List products by category");
		System.out.println("3. List products by price range");
		System.out.println("4. Display product by id");
		System.out.println("5. Add a new product");
		System.out.println("6. Update a product");
		System.out.println("7. Search and delete a product");

		try {
			return KeyboardUtil.getInt("Enter your choice (0 to exit): ");
		} catch (Exception e) {
			System.out.println("Invalid choice. Please enter a number!");
		}
		return -1;
	}

	public static void main(String[] args) {
		new Main().start();
	}
}
