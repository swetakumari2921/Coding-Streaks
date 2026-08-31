package my11.collection.sortedset.practice;

import java.util.SortedSet;
import java.util.TreeSet;

public class Ex03 {
	public static void main(String[] args) {

		SortedSet<Double> numbers = new TreeSet<>();

		numbers.add(10.5);
		numbers.add(20.75);
		numbers.add(30.25);
		numbers.add(40.8);
		numbers.add(50.6);

		System.out.println(numbers);
	}
}
