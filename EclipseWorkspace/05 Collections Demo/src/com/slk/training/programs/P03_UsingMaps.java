package com.slk.training.programs;

import java.util.HashMap;
import java.util.Map;

import com.slk.training.entity.Book;

public class P03_UsingMaps {
	
	public static void main(String[] args) {
		
		Map<Integer, Book> books;
		books = new HashMap<>();
		
		Book b1;
		
		b1 = new Book(728, "Java Unleashed", 459.0, 300);
		books.put(b1.getId(), b1);
		
		b1 = new Book(12, "Authentic Java", 299, 150);
		books.put(b1.getId(), b1);
		
		b1 = new Book(8976, "Complete Java Guide", 999.0, 500);
		books.put(b1.getId(), b1);
		
		// Notice that the key is same as the first book,
		// will be replacing the first one (unlike the set, where it would have been rejected)
		b1 = new Book(728, "Java Complete Reference", 459.0, 300);
		books.put(b1.getId(), b1);
		
		b1 = new Book(222, "Java whitebook", 289.0, 120);
		books.put(b1.getId(), b1);
		
		System.out.println("Number of books = " + books.size());
		System.out.println("The books are: ");
		for(Book b: books.values()) {
			System.out.println(b);
		}
		
	}

}
