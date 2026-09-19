package my10.collection.linkedhashset.practice;

import java.util.*;

public class Ex22 {
	public static void main(String[] args) {

		LinkedHashSet<Integer> set = new LinkedHashSet<>();

		set.add(50);
		set.add(20);
		set.add(80);
		set.add(10);
		set.add(40);

		int min = Collections.min(set);

		System.out.println("LinkedHashSet: " + set);
		System.out.println("Minimum element: " + min);
	}
}
