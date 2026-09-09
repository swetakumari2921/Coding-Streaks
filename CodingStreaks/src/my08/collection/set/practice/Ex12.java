package my08.collection.set.practice;

import java.util.*;

public class Ex12 {
	public static void main(String[] args) {

		Set<String> names = new HashSet<>();

		names.add("Aakash");
		names.add("Lucky");
		names.add("Divya");
		names.add("Aakash");
		names.add("Lucky");

		System.out.println(names);
	}
}
