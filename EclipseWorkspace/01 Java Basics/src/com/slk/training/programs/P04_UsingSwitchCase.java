package com.slk.training.programs;

public class P04_UsingSwitchCase {

	static int maxDays(int year, int month) {
		int max = 0;

		switch (month) {
		case 2:
			if (year % 400 == 0 || year % 4 == 0 && year % 100 != 0) {
				max = 29;
			} else {
				max = 28;
			}
			break;
		case 4: case 6: case 9: case 11:
			max = 30;
			break;
		default:
			max = 31;
		}
		
		return max;
	}

	public static void main(String[] args) {
		
		int y = 2016, m = 3;
		int md = maxDays(y, m);
		System.out.printf("Days in %d/%d is %d\n", m, y, md);
		

	}

}









