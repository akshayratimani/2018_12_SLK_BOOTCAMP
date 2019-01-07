package com.slk.training.programs;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class P05_UsingLambdas {

	static class LengthComparator implements Comparator<String> {

		@Override
		public int compare(String s1, String s2) {
			return s1.length() - s2.length();
		}

	}

	public static void main(String[] args) {

		List<String> names = Arrays.asList("Vinod", "John Doe", "Anu", "Ravish", "Satyanarayana");
		System.out.println("Before sorting: " + names);
		Collections.sort(names);
		System.out.println("After sorting: " + names);
		Collections.sort(names, new LengthComparator());
		System.out.println("After sorting by length: " + names);

		// using anonymous object
		Comparator<String> cmp1 = new Comparator<String>() {
			public int compare(String s1, String s2) {
				return s1.length() - s2.length();
			}
		};

		Collections.sort(names, cmp1);
		System.out.println("After sorting by length: " + names);

		Collections.sort(names, new Comparator<String>() {
			public int compare(String s1, String s2) {
				return s1.length() - s2.length();
			}
		});
		System.out.println("After sorting by length: " + names);

		Collections.sort(names, (s1, s2) -> s1.length() - s2.length());
		System.out.println("After sorting by length: " + names);

	}

}
