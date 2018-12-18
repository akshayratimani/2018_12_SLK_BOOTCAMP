package com.slk.assignment03.programs;

public class Main {

	public static boolean isPrimeNumber(int num) {
		if (num == 1) {
			return false;
		}

		int limit = num / 2;
		for (int d = 2; d <= limit; d++) {
			if (num % d == 0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		// for (int i = 1; i <= 50; i++) {
		// System.out.printf("%d is %s\n", i,
		// isPrimeNumber(i) ? "is a prime number" : "is not a prime number");
		// }

		System.out.println("List of prime numbers from 1 to 50");
		for (int i = 1; i <= 50; i++) {
			if (isPrimeNumber(i)) {
				System.out.println(i);
			}
		}

	}

}
