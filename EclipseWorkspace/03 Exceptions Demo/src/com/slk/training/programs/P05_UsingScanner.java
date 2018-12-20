package com.slk.training.programs;

import java.util.Scanner;

public class P05_UsingScanner {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); // able to read from keyboard buffer
			
		System.out.println("Enter id of the product: ");
		int id = sc.nextInt(); 
		
		System.out.println("Enter name of the product: ");
		String name = sc.nextLine();
		
		System.out.println("Enter price of the product: ");
		double price = sc.nextDouble();
		
		System.out.println("Name = " + name);
		System.out.println("Price = Rs." + price);
		System.out.println("Id = " + id);
	}
}





