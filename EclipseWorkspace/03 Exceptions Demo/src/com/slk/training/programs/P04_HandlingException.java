package com.slk.training.programs;

import com.slk.training.entity.InvalidIdException;
import com.slk.training.entity.InvalidNameException;
import com.slk.training.entity.InvalidPriceException;
import com.slk.training.entity.Product;

public class P04_HandlingException {

	public static void main(String[] args) {

		Product p = new Product();
		try {
			p.setId(-12);
		} catch (InvalidIdException e) {

		}

		try {
			p.setName("Acer Travelmate Laptop");
		} catch (InvalidNameException e) {

		}

		try {
			p.setPrice(-35000.0);
		} catch (InvalidPriceException e) {

		}

		System.out.println(p);

	}
}
