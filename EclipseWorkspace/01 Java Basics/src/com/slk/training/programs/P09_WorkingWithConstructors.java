package com.slk.training.programs;

import com.slk.training.entity.Person;

public class P09_WorkingWithConstructors {

	public static void main(String[] args) {

		Person p1, p2, p3, p4;
		p1 = new Person();
		p2 = new Person("John Doe");
		p3 = new Person("Jane Doe", 33);
		p4 = new Person("Martin King", 45, 5.9);

		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
		System.out.println(p4);
	}
}
