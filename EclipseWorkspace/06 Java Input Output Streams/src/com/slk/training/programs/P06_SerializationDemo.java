package com.slk.training.programs;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

import com.slk.training.entity.Employee;

public class P06_SerializationDemo {
	
	public static void main(String[] args) throws Exception{
		
		Employee[] emps = {
			new Employee(7788, "Allen Smith", 23999),
			new Employee(7654, "Robert Miller", 34000),
			new Employee(6789, "John Doe", 34500),
			new Employee(6543, "Jane Doe", 34100)
		};
		
		FileOutputStream file = new FileOutputStream("emps.data");
		ObjectOutputStream out = new ObjectOutputStream(file);
		
		for(Employee e: emps) {
			out.writeObject(e);
			// the writeObject() knows how to get all the bytes corresponding to 
			// the object "e", and also knows how to write the same byte by byte 
			// into the FileOutputStream object. But it cannot do so, unless
			// the author of the class allows to do so. This can be done by
			// the class implementing an interface called java.io.Serializable.
			// This is a marker interface and has no methods in it.
		}
		out.close();
		file.close();
		System.out.println("Employee data saved to emps.data file");
	}

}






