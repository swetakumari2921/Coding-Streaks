package my11.collection.sortedset.practice;

import java.util.*;

public class Ex23 {
	public static void main(String[] args) {
		SortedSet<Integer> set = new TreeSet<>();

		set.add(50);
		set.add(20);
		set.add(10);
		set.add(40);
		set.add(30);

		int count = 0;

		for (int num : set) {
			count++;

			if (count == 2) {
				System.out.println("Second smallest element: " + num);
				break;
			}
		}
	}
}
