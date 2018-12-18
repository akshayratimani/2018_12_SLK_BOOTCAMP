package com.slk.assignment06.programs;

public class Main {

	public static int fibonacci(int index) {
		int a, b, c = -1;

		a = -1;
		b = 1;

		for (int i = 0; i <= index; i++) {
			c = a + b;
			a = b;
			b = c;
		}

		return c;
	}

	public static void main(String[] args) {
		System.out.printf("Fibonacci value at index %d is %d\n", 3, fibonacci(3));
		System.out.printf("Fibonacci value at index %d is %d\n", 10, fibonacci(10));
		System.out.printf("Fibonacci value at index %d is %d\n", 12, fibonacci(12));

	}
}
