package com.slk.training.programs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class P01_ReadFromKeyboard {

	public static void main(String[] args) throws IOException {
		// InputStreamReader converts an InputStream into a Reader object
		InputStreamReader reader = new InputStreamReader(System.in);
		// BufferedReader has additional functions to read line by line
		BufferedReader in = new BufferedReader(reader);
		
		System.out.println("Enter your name: ");
		String name = in.readLine();
		System.out.println("Hello, " + name);
		
	}
	
	public static void ex03(String[] args) throws IOException {
		byte[] bytes = new byte[20];
		System.out.println("Before reading from keyboard: " + Arrays.toString(bytes));

		System.out.println("Enter your name");
		System.in.read(bytes);
		System.out.println("After reading from keyboard: " + Arrays.toString(bytes));
		String name = new String(bytes).trim();

		System.out.println("Hello, " + name);

	}

	public static void ex02(String[] args) throws IOException {
		int ch;
		String name = "";
		System.out.println("Enter your name: ");
		while ((ch = System.in.read()) != '\n') {
			name += (char) ch;
		}

		System.out.println("Hello, " + name);

	}

	public static void ex01(String[] args) throws IOException {
		int ch;

		System.out.println("Enter something: ");
		while (true) {
			ch = System.in.read();
			if (ch == '\n') {
				break;
			}
			System.out.print((char) ch);
		}
		System.out.println();
	}
}
