package my10.collection.linkedhashset.practice;

import java.util.LinkedHashSet;

public class Ex09 {
	public static void main(String[] args) {

		LinkedHashSet<Integer> numbers = new LinkedHashSet<>();

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
