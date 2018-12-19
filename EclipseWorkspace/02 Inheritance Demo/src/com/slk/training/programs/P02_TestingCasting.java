package com.slk.training.programs;

import com.slk.training.entity.Employee;
import com.slk.training.entity.Person;
import com.slk.training.entity.Student;

public class P02_TestingCasting {

	public static void main(String[] args) {

		Employee e1 = new Employee(1122, "Smith", "smith@example.com", 22000.0);
		Person p1 = e1; // not an error; e1 refers to an Employee object, which IS-A Person object

		Employee e2 = (Employee) p1; // down-casting; must be explicit
		System.out.println(e2);

		p1 = new Student("Ramesh", "ramesh@example.com", "Maths", 89.8);
		if (p1 instanceof Employee) {
			Employee e3 = (Employee) p1; // explicit cast must be done conditionally 
			// to avoid ClassCastException
			System.out.println(e3);
		}

	}
}








