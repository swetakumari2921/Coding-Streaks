package my.collection.arraylist.practice;

import java.util.ArrayList;

public class Ex147 {

	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<>();

		list.add(-3);
		list.add(4);
		list.add(7);
		list.add(-2);
		list.add(5);

		// Replace positive numbers with their square
		for (int i = 0; i < list.size(); i++) {

			int value = list.get(i);

			if (value > 0) {
				list.set(i, value * value);
			}
		}

		System.out.println("Updated ArrayList:");
		System.out.println(list);
	}
}
