package my11.collection.sortedset.practice;

import java.util.*;

public class Ex24 {
	public static void main(String[] args) {
		SortedSet<Integer> set = new TreeSet<>();

		set.add(10);
		set.add(50);
		set.add(20);
		set.add(40);
		set.add(30);

		int secondLargest = 0;
		int count = 0;

		for (int num : set) {
			count++;

			if (count == set.size() - 1) {
				secondLargest = num;
			}
		}

		System.out.println("SortedSet: " + set);
		System.out.println("Second largest element: " + secondLargest);
	}
}
