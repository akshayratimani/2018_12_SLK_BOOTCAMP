package com.slk.training.programs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class P01_UsingLists {
	
	public static void main(String[] args) {
		List<String> names = new LinkedList<String>();
		names.add("Vinod");
		names.add("Arun");
		names.add("Aditya");
		names.add("Shyam");
		names.add("Vinod");
		names.add("Shyam");
		
		System.out.println("Inital values: " + names);
		
		names.remove("Arun");
		System.out.println("After removing Arun: " + names);
		names.remove(1); // remove Aditya
		System.out.println("After removing value at index 1: " + names);
		names.add(0, "Arun");
		System.out.println("After inserting at index 0: " + names);
		names.set(1, "Kumar"); // replaces "Vinod" with "Kumar"
		
		System.out.println("After setting value at index 1: " + names);
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void test1(String[] args) {
		
		// This is a List of heterogeneous values
		// Prior to JDK 1.5, all collections were like this.
		List objects = new ArrayList();
		objects.add(123);
		objects.add("vinod");
		objects.add(12.45);
		
		System.out.println(objects);
		for(Object obj: objects) {
			System.out.println(obj + " is of type " + obj.getClass());
		}
		
	}
}







