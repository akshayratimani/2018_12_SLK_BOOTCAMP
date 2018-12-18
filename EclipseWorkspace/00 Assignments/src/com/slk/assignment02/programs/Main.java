package com.slk.assignment02.programs;

public class Main {

	static boolean isValidDate(int year, int month, int day) {
		if (year < 0) {
			return false;
		}

		if (month < 1 || month > 12) {
			return false;
		}

		int maxDays = 31;
		switch (month) {
		case 2:
			maxDays = (year % 400 == 0 || year % 4 == 0 && year % 100 != 0) ? 29 : 28;
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			maxDays = 30;
		}

		if (day < 1 || day > maxDays) {
			return false;
		}

		return true;
	}

	public static void main(String[] args) {
		boolean valid;

		int year = 2018, month = 13, day = 1;
		valid = isValidDate(year, month, day);
		System.out.println("year=2018, month=13, day=1 isValid = " + valid);

		year = 2018;
		month = 2;
		day = 29;
		valid = isValidDate(year, month, day);
		System.out.println("year=2018, month=2, day=29  isValid = " + valid);

		year = 2016;
		month = 2;
		day = 29;
		valid = isValidDate(year, month, day);
		System.out.println("year=2016, month=2, day=29  isValid = " + valid);

	}

}









