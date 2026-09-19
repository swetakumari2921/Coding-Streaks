package my11.collection.sortedset.practice;

import java.util.*;

public class Ex22 {
	public static void main(String[] args) {

		SortedSet<Integer> set = new TreeSet<>();

		set.add(50);
		set.add(20);
		set.add(80);
		set.add(10);
		set.add(40);

		int max = set.last();

		System.out.println("SortedSet: " + set);
		System.out.println("Maximum element: " + max);
	}
}
