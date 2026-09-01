package my11.collection.sortedset.practice;

import java.util.SortedSet;
import java.util.TreeSet;

public class Ex04 {
	public static void main(String[] args) {

		SortedSet<Integer> numbers = new TreeSet<>();

		numbers.add(50);
		numbers.add(20);
		numbers.add(40);
		numbers.add(10);
		numbers.add(30);

		for (Integer number : numbers) {
			System.out.println(number);
		}
	}
}
