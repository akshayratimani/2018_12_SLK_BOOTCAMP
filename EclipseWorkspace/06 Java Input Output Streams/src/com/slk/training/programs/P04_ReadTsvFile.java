package com.slk.training.programs;

import java.io.BufferedReader;
import java.io.FileReader;

public class P04_ReadTsvFile {

	public static void main(String[] args) {
		String filename = "people.csv"; // contains tab separated values
		
		try(
			FileReader reader = new FileReader(filename);
			BufferedReader in = new BufferedReader(reader);
		) {
			String line;
			in.readLine(); // skip the header line
			while((line=in.readLine())!=null) {
				String[] ar = line.split("\t");
				System.out.println("Id       : " + ar[0]);
				System.out.println("Name     : " + ar[1]);
				System.out.println("Email    : " + ar[2]);
				System.out.println("City     : " + ar[3]);
				System.out.println();
			}
		}
		catch(Exception ex) {
		}
		
		
	}
}







