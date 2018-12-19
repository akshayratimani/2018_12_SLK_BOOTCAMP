package com.slk.training.programs;

import com.slk.training.entity.Employee;

public class P01_TestingInheritance {

	public static void main(String[] args) {
		Employee e1 = new Employee();
		e1.setName("Scott");
		e1.setEmail("scott@example.com");
		
		System.out.println(e1);
		
		Employee e2 = new Employee(1122, "John Doe", "johndoe@example.com", 33000.0);
		System.out.println(e2);
		
	}
}
