package com.slk.training.programs;

public class P02_ExceptionDemo {

	public static void main(String[] args) {
		try {
			String input1 = args[0];
			String input2 = args[1];

			int n = Integer.parseInt(input1);
			int d = Integer.parseInt(input2);

			int q = n / d, r = n % d;

			System.out.printf("quotient of %d/%d is %d and remainder is %d\n", n, d, q, r);
		} catch (Exception e) {
			System.out.println("OOPS! There was a problem! - " + e.getMessage());
		}

		System.out.println("End of main!");
	}

}




