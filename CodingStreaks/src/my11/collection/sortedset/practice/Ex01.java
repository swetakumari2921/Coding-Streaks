package my11.collection.sortedset.practice;

import java.util.Set;
import java.util.TreeSet;

public class Ex01 {

	public static void main(String[] args) {
		Set<Integer> set = new TreeSet<>();

		set.add(50);
		set.add(20);
		set.add(40);
		set.add(10);
		set.add(30);

		System.out.println(set);
	}
}
