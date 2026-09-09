package my09.collection.hashset.practice;

import java.util.HashSet;

public class Ex12 {
	public static void main(String[] args) {

		HashSet<String> names = new HashSet<>();

		names.add("Aakash");
		names.add("Lucky");
		names.add("Divya");
		names.add("Aakash");
		names.add("Lucky");

		System.out.println(names);
	}
}
