package com.slk.training.entity;

public class Triangle implements Shape {

	double base, height;

	public Triangle(double base, double height) {
		this.base = base;
		this.height = height;
	}

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public void printArea() {
		double area = 0.5 * base * height;
		System.out.printf("Area of traingle with base %.2f, height %.2f is %.2f\n", base, height, area);
	}

}
