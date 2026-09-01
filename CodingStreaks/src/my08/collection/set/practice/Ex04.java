package my08.collection.set.practice;

import java.util.HashSet;
import java.util.Set;

public class Ex04 {
	public static void main(String[] args) {

		Set<Integer> numbers = new HashSet<>();

		numbers.add(10);
		numbers.add(20);
		numbers.add(30);
		numbers.add(40);
		numbers.add(50);

		for (Integer number : numbers) {
			System.out.println(number);
		}
	}
}
