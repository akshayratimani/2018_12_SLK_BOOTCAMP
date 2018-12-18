package com.slk.training.programs;

import java.util.Arrays;

public class P10_WorkingWithArrays {

	public static void main(String[] args) {

		// nums is a reference and occupies 8 bytes in the stack
		int[] nums;
		int size = 5;

		nums = new int[size]; // allocates 20 bytes in the heap at the runtime
		nums[0] = 12;
		nums[1] = 22;

		// System.out.printf("value at index %d is %d\n", 0, nums[0]);
		// System.out.printf("value at index %d is %d\n", 1, nums[1]);
		// System.out.printf("value at index %d is %d\n", 2, nums[2]);
		// System.out.printf("value at index %d is %d\n", 3, nums[3]);
		// System.out.printf("value at index %d is %d\n", 4, nums[4]);

		for (int i = 0; i < nums.length; i++) {
			System.out.printf("value at index %d is %d\n", i, nums[i]);
		}

		int sum = 0;
		for (int n : nums) { // read as: FOR EACH N IN NUMS
			sum += n;
		}
		System.out.println("sum of all nums = " + sum);

		// re-initilize the array by recreating it
		nums = new int[] { 100, 29, 48, 37, 58, 219, 489, 58 };
		// the old array will now be considered for garbage collection
		System.out.println("Values in nums = " + Arrays.toString(nums));
		
	}
}












