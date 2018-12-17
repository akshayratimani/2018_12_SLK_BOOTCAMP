package com.slk.training.programs;

public class P03_UsingIfElse {

	static void example1() {
		// check if the number is even or odd!
		int num = 23;
		if (num % 2 == 0) {
			System.out.println(num + " is an even number!");
		} else {
			System.out.println(num + " is an odd number!");
		}
	}

	static void example2() {
		// find the number of days in the given month
		int month = 12;

		if (month < 1 || month > 12) {
			System.out.println("Invalid month number. Must be between 1 and 12!");
		} else {
			if(month==2) {
				System.out.println("28 or 29 days!");
			}
			else if(month==4 || month==6 || month==9 || month==11) {
				System.out.println("30 days!");
			}
			else {
				System.out.println("31 days!");
			}
		}
	}

	public static void main(String[] args) {
		example2();
	}
}





