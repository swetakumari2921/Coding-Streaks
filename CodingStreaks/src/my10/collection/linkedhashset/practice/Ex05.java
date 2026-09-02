package my10.collection.linkedhashset.practice;

import java.util.*;

public class Ex05 {
	public static void main(String[] args) {

		LinkedHashSet<Integer> numbers = new LinkedHashSet<>();

		numbers.add(10);
		numbers.add(20);
		numbers.add(30);
		numbers.add(40);
		numbers.add(50);

		Iterator<Integer> itr = numbers.iterator();

		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
