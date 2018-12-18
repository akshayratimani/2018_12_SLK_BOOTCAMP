package com.slk.training.programs;

import com.slk.training.entity.Person;

public class P07_WorkingWithPersonObjects {

	public static void main(String[] args) {
		Person p1;
		p1 = new Person();
		
		p1.setName("Vinod");
		p1.setAge(45);
		p1.setHeight(5.8);
		
		System.out.println("p1 is " + p1);
	}
}
