package com.slk.training.programs;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

import com.slk.training.entity.Employee;

public class P06_DeserializationDemo {

	public static void main(String[] args) throws Exception{
		
		String filename = "emps.data";
		FileInputStream file = new FileInputStream(filename);
		ObjectInputStream in = new ObjectInputStream(file);

		while(true) {
			try {
				Employee emp = (Employee) in.readObject();
				System.out.println(emp);
			}catch(EOFException e) {
				break;
			}
		}
		
		in.close();
		file.close();
		
	}
}
