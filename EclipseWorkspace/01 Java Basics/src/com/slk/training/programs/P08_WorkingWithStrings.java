package com.slk.training.programs;

import com.slk.training.entity.Person;

public class P08_WorkingWithStrings {

	public static void main(String[] args) {
		String s1 = "vinod"; // creates a new String object and stores in a cache
		String s2 = "vinod"; // re-used from the cache

		System.out.println("s1==s2 is: " + (s1 == s2)); // checks references
		System.out.println("s1.equals(s2) is: " + s1.equals(s2)); // value check
		System.out.println();
		
		s1 = new String("kumar");
		s2 = new String("kumar");
		System.out.println("s1==s2 is: " + (s1 == s2)); // checks references
		System.out.println("s1.equals(s2) is: " + s1.equals(s2)); // value check
		System.out.println();
		
		Person p1, p2;
		p1 = new Person();
		p2 = new Person();
		p1.setName("vinod");
		p2.setName("vinod");
		System.out.println("p1==p2 is: " + (p1==p2));
		System.out.println("p1.name==p2.name is: " + (p1.getName()==p2.getName()));
		
		String text = "My name is Vinod and I live in Bangalore";
		System.out.println("Length of text is " + text.length());
		System.out.println(text.toUpperCase());
		System.out.println(text.substring(0, 14));
		System.out.println(text);
		System.out.println("char at index 12 is: " + text.charAt(12));
		System.out.println("index of letter V is: " + text.indexOf("V"));
		System.out.println("index of word Bangalore is: " + text.indexOf("Bangalore"));
		System.out.println("index of word Mysore is: " + text.indexOf("Mysore"));
		
		
	}

}






