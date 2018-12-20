package com.slk.training.programs;

public class P03_ExceptionDemo {

	public static void main(String[] args) {
		try {
			String input1 = args[0];
			String input2 = args[1];

			int n = Integer.parseInt(input1);
			int d = Integer.parseInt(input2);

			int q = n / d, r = n % d;

			System.out.printf("quotient of %d/%d is %d and remainder is %d\n", n, d, q, r);
		} catch (NumberFormatException e) {
			System.out.println("Only integers are allowed");
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Hey! two numbers were expected!");
			// return;
			// System.exit(0);
		} catch(ArithmeticException e) {
			System.out.println("Sorry, cannot divide by zero!");
		} finally {
			System.out.println("From within the finally block!");
		}

		System.out.println("End of main!");
	}

}




