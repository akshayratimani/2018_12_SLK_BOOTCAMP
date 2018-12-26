package com.slk.training.programs;

import java.io.FileWriter;
import java.io.PrintWriter;

import com.slk.training.utils.KeyboardUtil;

public class P05_AppendToTsvFile {
	
	public static void main(String[] args) {
		
		String filename = "people.csv"; // contains tab separated values
		
		try(
			FileWriter writer = new FileWriter(filename, true); // true --> append mode
			PrintWriter out = new PrintWriter(writer);
		) {
			int id = KeyboardUtil.getInt("Enter id: ");
			String name = KeyboardUtil.getString("Enter name: ");
			String email = KeyboardUtil.getString("Enter email id: ");
			String city = KeyboardUtil.getString("Enter city: ");
			
			out.printf("\n%d\t%s\t%s\t%s", id, name, email, city);
		}
		catch(Exception ex) {
		}
		
		System.out.println("Data appended to the file.");
	}

}







