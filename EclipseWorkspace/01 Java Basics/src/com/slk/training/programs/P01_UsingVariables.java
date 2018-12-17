package com.slk.training.programs;

public class P01_UsingVariables {
	
	public static void main(String[] args) {
		
		byte b1; // variable declaration
		b1 = -75; // variable definition
		
		System.out.println("Value of b1 is " + b1);
		
		float f = 3.1415f;
		System.out.println("This is a float: " + f);
		double d = f;
		System.out.println("This is a double: " + d);
		
		boolean isWorkingDay = true;
		System.out.println("Today is a working day: " + isWorkingDay);
		
		int a=10, b;
		b = ++a; // pre-increment; a is incremented first, and then b = a takes placee
		
		System.out.printf("a = %d, b=%d\n", a, b);
		
		a = 10;
		b = a++; // post increment; b=a happens first, and then a++ takes place
		System.out.printf("a = %d, b=%d\n", a, b);

	}

}







