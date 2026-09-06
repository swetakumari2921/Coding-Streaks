package my09.collection.hashset.practice;

import java.util.HashSet;

public class Ex09 {
	public static void main(String[] args) {

		HashSet<Integer> numbers = new HashSet<>();

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
