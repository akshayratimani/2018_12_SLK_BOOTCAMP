package com.slk.dao;

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import com.slk.entity.Products;

public class DaoFactory {

	List<Products> p;
	List<Products> cart;

	public DaoFactory() {
		p = new ArrayList<>();
		cart = new ArrayList<>();
		p.add(new Products(1, "MINote4", 12000, 4.3f));
		p.add(new Products(2, "MotoG4", 13000, 3.3f));
		p.add(new Products(3, "Iphone6s", 56000, 4.5f));
		p.add(new Products(4, "Skmei 115", 2000, 4.1f));
		p.add(new Products(5, "Samsung A4", 10000, 3.2f));
		p.add(new Products(6, "Boat 255s", 500, 3.6f));
		p.add(new Products(7, "Skulcandy s3", 800, 3.0f));
		p.add(new Products(8, "Nvidia GeForce", 120000, 4.6f));
		p.add(new Products(9, "MRF tyres", 2000, 4.0f));
		p.add(new Products(10, "Nokia 1100", 2600, 5.0f));
		p.add(new Products(11, "AMD Raedon", 180000, 4.9f));
		p.add(new Products(12, "Vivo A1", 11000, 3.7f));

	}

	public List<Products> getProducts() {
		return p;
	}

	public List<Products> getCartProducts() {
		
		return cart;
	}

	public void AddToCart(Products pr) {
		cart.add(pr);
	}

	public void RemoveFromCart(Products p2) {
		int i=-1;
		int a = 0;
		try {
			for(Products p : cart)
			{
				i++;
				if(p.getId()==p2.getId())
				{
					a = i;
				}
			}
			System.out.println("index:"+a);
			cart.remove(a);
			
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("No matching product found");
		}
	}

}
