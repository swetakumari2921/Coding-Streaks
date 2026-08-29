package my10.collection.linkedhashset.practice;

import java.util.LinkedHashSet;
import java.util.Set;

public class Ex01 {

	public static void main(String[] args) {
		Set<Integer> set = new LinkedHashSet<>();

		set.add(10);
		set.add(20);
		set.add(30);
		set.add(40);
		set.add(50);

		System.out.println(set);
	}
}
