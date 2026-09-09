package my11.collection.sortedset.practice;

import java.util.*;

public class Ex12 {
	public static void main(String[] args) {

		SortedSet<String> names = new TreeSet<>();

		names.add("Aakash");
		names.add("Lucky");
		names.add("Divya");
		names.add("Aakash");
		names.add("Lucky");

		System.out.println(names);
	}
}
