package com.slk.training.entity;

public class Student extends Person {

	private String subject;
	private double averageMarks;

	public Student() {
	}

	public Student(String name, String email, String subject, double averageMarks) {
		super(name, email);
		this.subject = subject;
		this.averageMarks = averageMarks;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public double getAverageMarks() {
		return averageMarks;
	}

	public void setAverageMarks(double averageMarks) {
		this.averageMarks = averageMarks;
	}

	@Override
	public String toString() {
		return "Student [" + super.toString() + ", subject=" + subject + ", averageMarks=" + averageMarks + "]";
	}

	public String getGrade() {
		if (averageMarks < 40) {
			return "D";
		} else if (averageMarks < 60) {
			return "C";
		} else if (averageMarks < 80) {
			return "B";
		} else {
			return "A";
		}
	}

}
