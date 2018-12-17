package com.slk.training.programs;

public class P05_UsingLoops {

	static void forLoopExample() {
		// prints a multiplication table for a number
		int num = 67;
		// for(initializer; loop_condition; loop_controller) statement;
		for (int i = 1; i <= 10; i--) {
			System.out.printf("%d X %d = %d\n", num, i, num * i);
		}
	}
	
	static void whileLoopExample() {
		// check if the given number is prime or not
		int num = 791;
		int d = 2, limit = num/2, rem;
		while(d <= limit) { // infinite loop
			rem = num %d;
			if(rem==0) {
				System.out.println(num + " is not a prime number!");
				break;
			}
			d++;
		}
		if(d>limit) {
			System.out.println(num + " is a prime number!");
		}
	}
	
	public static void main(String[] args) {
		// forLoopExample();
		whileLoopExample();
	}

}




