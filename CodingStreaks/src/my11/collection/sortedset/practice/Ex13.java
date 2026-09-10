package my11.collection.sortedset.practice;

import java.util.*;

public class Ex13 {
	public static void main(String[] args) {

		SortedSet<Integer> set = new TreeSet<>();

		set.add(50);
		set.add(10);
		set.add(40);
		set.add(20);
		set.add(30);

		System.out.println("Sorted Set: " + set);
	}
}
