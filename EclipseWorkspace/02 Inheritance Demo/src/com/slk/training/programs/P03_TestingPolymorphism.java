package com.slk.training.programs;

import com.slk.training.entity.Employee;
import com.slk.training.entity.Person;
import com.slk.training.entity.Student;

public class P03_TestingPolymorphism {

	public static void main(String[] args) {
		
		Person[] people = {
				new Employee(12, "Harish", "harish@example.com", 25000.0),
				new Employee(29, "James", "james@example.com", 35000.0),
				new Student("Ajay", "ajay@xmpl.com", "Science", 87.90),
				new Employee(22, "Rakesh", "rakesh@example.com", 56000.0),
				new Student("Michael", "mike@xmpl.com", "Maths", 56.9)
		};
		
		for(Person p: people) {
			System.out.printf("Grade of %s is %s\n", p.getName(), p.getGrade());
		}
		
	}
}









