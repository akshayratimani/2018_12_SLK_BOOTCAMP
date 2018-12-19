package com.slk.training.entity;

public abstract class Person {
	private String name;
	private String email;
	
	public Person() {
	}

	public Person(String name, String email) {
		this.name = name;
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", email=" + email + "]";
	}

	// abstract functions do not have body, and the body is supposed to be found
	// in a subclass (forces inheritance). This is added here so that p.getGrade()
	// does not result in compilation error (where p is a Person reference)
	public abstract String getGrade();
	
}










