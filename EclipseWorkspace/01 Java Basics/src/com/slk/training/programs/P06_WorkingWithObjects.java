package com.slk.training.programs;

class Point {
	// static block in class is executed when the class is loaded by the ClassLoader
	// in JVM
	static {
		System.out.println("class Point loaded");
	}

	int x;
	int y;
	int z;

	// toString() is a special function of an object which is called automatically
	// whenever this object is treated as a String
	public String toString() {
		return "Point [x=" + x + ", y=" + y + ", z=" + z + "]";
	}
}

public class P06_WorkingWithObjects {
	static {
		System.out.println("class P06_WorkingWithObjects loaded");
	}

	public static void main(String[] args) {

		System.out.println("creating a variable of type Point...");
		// The class Point is not loaded yet
		Point p1; // p1 is a reference; and will be given 8 bytes in a 64bit Java env.

		System.out.println("creating an object of type Point...");
		p1 = new Point(); // class Point is loaded now.
		p1.x = 12;
		p1.y = 22;
		p1.z = 0;

		System.out.println("p1 is: " + p1);
		System.out.println("End of main!");
	}

}
