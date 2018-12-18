package com.slk.assignment05.programs;

import static com.slk.assignment03.programs.Main.isPrimeNumber;

public class Main {

	public static int sumOfPrimes(int from, int to) {
		int sum = 0;
		
		for(int i=from; i<=to; i++) {
			sum += isPrimeNumber(i) ? i : 0;
		}

		return sum;
	}

	public static void main(String[] args) {
		System.out.printf("Sum of all primes between %d and %d is %d\n", 1, 50, sumOfPrimes(1, 50));
		System.out.printf("Sum of all primes between %d and %d is %d\n", 50, 100, sumOfPrimes(50, 100));
		System.out.printf("Sum of all primes between %d and %d is %d\n", 100, 1000, sumOfPrimes(100, 1000));
	}
}
