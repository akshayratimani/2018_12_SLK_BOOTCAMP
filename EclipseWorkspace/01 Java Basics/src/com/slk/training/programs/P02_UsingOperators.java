package com.slk.training.programs;

public class P02_UsingOperators {
	
	// mark all functions today as static 
	static boolean isLeap(int year) {
		return (year % 400 == 0) || (year % 4 == 0) && (year % 100 != 0);
	}
	
	public static void main(String[] args) {
		int year = 2100;

		System.out.printf("Year %d is %s year", year, 
				isLeap(year) ? "a leap": "not a leap");
	}
}









