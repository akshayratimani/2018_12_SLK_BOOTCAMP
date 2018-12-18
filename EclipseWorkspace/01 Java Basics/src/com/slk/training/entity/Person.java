package com.slk.training.entity;

public class Person {

	private String name;
	private int age;
	private double height;

	// no argument constructor
	// (automatically added by the compiler, if there is no other constructors)
	public Person() {
		// adding a no-arg constructor is a good practice
	}

	public Person(String name) {
		this.name = name;
	}

	public Person(String name, int age) {
		this.name = name;
		setAge(age);
	}

	public Person(String name, int age, double height) {
		this.name = name;
		setAge(age);
		this.height = height;
	}

	// getter property; a.k.a accessor
	public String getName() {
		return name;
	}

	// setter property; a.k.a mutator
	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if (age < 1 || age > 130) {
			throw new RuntimeException("Invalid value for age. Must be between 1 to 130");
		}
		this.age = age;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", height=" + height + "]";
	}

}
