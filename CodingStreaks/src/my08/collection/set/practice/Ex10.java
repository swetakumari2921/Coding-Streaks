package my08.collection.set.practice;

import java.util.*;

public class Ex10 {
	public static void main(String[] args) {

		Set<Integer> numbers = new HashSet<>();

		numbers.add(10);
		numbers.add(20);
		numbers.add(30);
		numbers.add(40);
		numbers.add(50);

		System.out.println("Before removing: " + numbers);

		numbers.clear();

		System.out.println("After removing: " + numbers);
	}
}
