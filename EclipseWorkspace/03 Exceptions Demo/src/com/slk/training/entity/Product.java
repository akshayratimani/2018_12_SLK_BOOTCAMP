package com.slk.training.entity;

public class Product {
	private int id;			// id cannot be negative
	private String name;		// name must not be blank; must be between 3 and 50 letters
	private double price;	// price cannot be negative
	
	public Product() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) throws InvalidIdException {
		if(id<0) {
			throw new InvalidIdException("Invalid id; cannot be negative");
		}
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) throws InvalidNameException {
		if(name==null || name.length()<3 ||name.length()>50) {
			throw new InvalidNameException("Name cannot be blank and must be between 3 - 50 letters");
		}
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) throws InvalidPriceException{
		if(price<0) {
			throw new InvalidPriceException("Invalid price; cannot be negative");
		}
		this.price = price;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + "]";
	}

	
}




