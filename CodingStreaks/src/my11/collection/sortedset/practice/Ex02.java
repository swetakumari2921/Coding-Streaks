package my11.collection.sortedset.practice;

import java.util.SortedSet;
import java.util.TreeSet;

public class Ex02 {

	public static void main(String[] args) {

		SortedSet<String> name = new TreeSet<>();

		name.add("Aakash");
		name.add("Lucky");
		name.add("Divya");
		name.add("Kunal");
		name.add("Iman");

		System.out.println(name);
	}
}
