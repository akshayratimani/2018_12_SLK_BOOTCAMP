package com.slk.training.entity;

public class Person {

	private String firstname, lastname, city;

	public Person() {
	}

	public Person(String firstname, String lastname, String city) {
		this.firstname = firstname;
		this.lastname = lastname;
		this.city = city;
	}

	public String getFullname() {
		return firstname + " " + lastname;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

}
