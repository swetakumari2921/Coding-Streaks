package my10.collection.linkedhashset.practice;

import java.util.LinkedHashSet;

public class Ex03 {
	public static void main(String[] args) {

		LinkedHashSet<Double> numbers = new LinkedHashSet<>();

		numbers.add(10.5);
		numbers.add(20.75);
		numbers.add(30.25);
		numbers.add(40.8);
		numbers.add(50.6);

		System.out.println(numbers);
	}
}
