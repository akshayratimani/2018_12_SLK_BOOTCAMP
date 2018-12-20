package com.slk.training.programs;

import com.slk.training.utils.KeyboardUtil;

public class P06_UsingKeyboardUtil {

	public static void main(String[] args) {
		String name = KeyboardUtil.getString("Enter your name: ");
		int age = KeyboardUtil.getInt("Enter your age: ");
		double height = KeyboardUtil.getDouble("Enter your height: ");
		
		System.out.println("Name    = " + name);
		System.out.println("Age     = " + age + " years.");
		System.out.println("Height  = " + height + " ft.");
		
	}

}
