package com.slk.training.dao;

public final class DaoFactory {
	
	// do not instantiate this class
	private DaoFactory() {
	}
	
	// This is a factory method.
	// Returns a newly constructed ProductDao instance.
	// Generally a factory method accepts a discriminator as argument,
	// using which the method decides the type of object to be created.
	public static ProductDao newProductDao(String type) {

		switch (type.toLowerCase()) {
		case "jdbc":
			return new ProductDaoJdbcImpl();
		case "file":
			return new ProductDaoFileImpl();
		case "array":
			return new ProductDaoArrayImpl();
		default:
			throw new RuntimeException("Invalid discriminator value: " + type);
		}
	}
	
	public static ProductDao newProductDao() {
		return newProductDao("jdbc");
	}

}










