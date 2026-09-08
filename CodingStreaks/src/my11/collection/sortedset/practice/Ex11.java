package my11.collection.sortedset.practice;

import java.util.*;

public class Ex11 {
	public static void main(String[] args) {

		SortedSet<Integer> numbers = new TreeSet<>();

		numbers.add(30);
		numbers.add(10);
		numbers.add(20);
		numbers.add(10);
		numbers.add(30);
		numbers.add(20);

		System.out.println(numbers);
	}
}
