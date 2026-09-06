package my11.collection.sortedset.practice;

import java.util.*;

public class Ex09 {
	public static void main(String[] args) {

		SortedSet<Integer> numbers = new TreeSet<>();

		numbers.add(10);
		numbers.add(20);
		numbers.add(30);
		numbers.add(40);
		numbers.add(50);

		System.out.println("Before removing: " + numbers);

		numbers.remove(30);

		System.out.println("After removing: " + numbers);
	}
}
