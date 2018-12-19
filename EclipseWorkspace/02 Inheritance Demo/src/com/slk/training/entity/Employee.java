package com.slk.training.entity;

public class Employee extends Person {

	private int id;
	private double salary;

	public Employee() {
	}

	public Employee(int id, String name, String email, double salary) {
		super(name, email);
		// call to the super(..) must be the first statement
		// and you can call the super class constructor only from a constructor
		// in the subclass
		this.id = id;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [" + super.toString() + ", id=" + id + ", salary=" + salary + "]";
	}

	public String getGrade() {
		if (salary < 10000) {
			return "D";
		} else if (salary < 20000) {
			return "C";
		} else if (salary < 40000) {
			return "B";
		} else {
			return "A";
		}
	}

}








