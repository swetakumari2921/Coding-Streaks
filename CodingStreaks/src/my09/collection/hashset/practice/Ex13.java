package my09.collection.hashset.practice;

import java.util.*;

public class Ex13 {
	public static void main(String[] args) {

		Set<Integer> set = new HashSet<>();

		set.add(null);
		set.add(null);
		set.add(null);
		set.add(null);
		set.add(null);

		System.out.println("Set: " + set);
		System.out.println("Size: " + set.size());
	}
}
