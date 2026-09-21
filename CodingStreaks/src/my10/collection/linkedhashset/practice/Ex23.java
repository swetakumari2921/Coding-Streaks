package my10.collection.linkedhashset.practice;

import java.util.LinkedHashSet;

public class Ex23 {
	public static void main(String[] args) {
		LinkedHashSet<Integer> set = new LinkedHashSet<>();

		set.add(10);
		set.add(-5);
		set.add(20);
		set.add(-15);
		set.add(30);

		int count = 0;

		for (int num : set) {
			if (num > 0) {
				count++;
			}
		}

		System.out.println("LinkedHashSet: " + set);
		System.out.println("Count of positive numbers: " + count);
	}
}
