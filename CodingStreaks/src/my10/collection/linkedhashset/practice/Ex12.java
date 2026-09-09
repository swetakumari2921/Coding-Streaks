package my10.collection.linkedhashset.practice;

import java.util.LinkedHashSet;

public class Ex12 {
	
	public static void main(String[] args) {

		LinkedHashSet<String> names = new LinkedHashSet<>();

		names.add("Aakash");
		names.add("Lucky");
		names.add("Divya");
		names.add("Aakash");
		names.add("Lucky");

		System.out.println(names);
	}
}
