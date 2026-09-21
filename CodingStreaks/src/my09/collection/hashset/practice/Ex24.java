package my09.collection.hashset.practice;

import java.util.HashSet;

public class Ex24 {
	public static void main(String[] args) {
		HashSet<Integer> set = new HashSet<>();

		set.add(10);
		set.add(-5);
		set.add(20);
		set.add(-15);
		set.add(-30);

		int count = 0;

		for (int num : set) {
			if (num < 0) {
				count++;
			}
		}

		System.out.println("HashSet: " + set);
		System.out.println("Count of negative numbers: " + count);
	}
}
