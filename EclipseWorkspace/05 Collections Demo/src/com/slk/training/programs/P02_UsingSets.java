package com.slk.training.programs;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

import com.slk.training.entity.Book;

public class P02_UsingSets {

	public static void main(String[] args) {
		Set<Book> books = new TreeSet<Book>();
		Book b1 = new Book(1, "Let us C", 299, 125);
		Book b2 = new Book(1, "Let us C", 299, 125);
		
		System.out.println("b1.hashCode() = " + b1.hashCode());
		System.out.println("b2.hashCode() = " + b2.hashCode());
		System.out.println("b1.equals(b2) = " + b1.equals(b2));
		
		
		books.add(b1);
		books.add(new Book(2, "C Pearls", 399, 175));
		books.add(b2);
		books.add(new Book(2, "C Pearls", 399, 175));
		books.add(new Book(3, "Java Complete Reference", 899, 500));
		
		System.out.println("books.size()  = " + books.size());
		
		for(Book b: books) {
			System.out.println(b);
		}
	}
	
	
	public static void test1(String[] args) {
		
		Set<Integer> nums = new TreeSet<Integer>();
		nums.add(123);
		nums.add(12);
		nums.add(222);
		nums.add(123);
		nums.add(99);
		nums.add(222);
		nums.add(123);
		nums.add(12);
		nums.add(789);
		System.out.println(nums);

		// for HashSet --> [99, 789, 123, 12, 222]
		// for LinkedHashSet --> [123, 12, 222, 99, 789]
		// for TreeSet --> [12, 99, 123, 222, 789]
		
		// get data using enhanced for loop (for-each loop, introduced in JDK 1.5)
		System.out.println("Numbers using enhanced for loop: ");
		for(Integer n: nums) {
			System.out.println(n);
		}
		
		// prior to JDK 1.5, this was the only way of accessing elements from a Set
		System.out.println("Numbers using iterator: ");
		Iterator<Integer> itr = nums.iterator();
		while(itr.hasNext()) {
			int n = itr.next();
			System.out.println(n);
		}
	}
}










