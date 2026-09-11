package my11.collection.sortedset.practice;

import java.util.*;

public class Ex14 {
	public static void main(String[] args) {

		SortedSet<Integer> number = new TreeSet<>();

		number.add(-20);
		number.add(10);
		number.add(-5);
		number.add(30);
		number.add(0);

		System.out.println("SortedSet: " + number);
	}
}
