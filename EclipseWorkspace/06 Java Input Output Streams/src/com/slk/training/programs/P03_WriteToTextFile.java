package com.slk.training.programs;

import java.io.FileWriter;
import java.io.PrintWriter;

import com.slk.training.utils.KeyboardUtil;

public class P03_WriteToTextFile {

	public static void main(String[] args) throws Exception {
		
		String filename = "names.txt"; // will be created in the Project directory
		FileWriter file = new FileWriter(filename, true);
		// PrintWriter is a decorator class that adds additional functionalities
		// to another Writer or OutputStream object
		PrintWriter out = new PrintWriter(file);
		
		while(true) {
			String input = KeyboardUtil.getString("Enter a name (or blank to stop): ");
			if(input.trim().equals("")) {
				break;
			}
			out.println(input);
		}
		
		out.close();
		file.close();
		
		System.out.println("File " + filename + " is created!");
		
	}
}
