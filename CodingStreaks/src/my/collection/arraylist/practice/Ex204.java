package my.collection.arraylist.practice;

import java.util.ArrayList;

public class Ex204 {

	// Range update: Add 'value' to all elements from left to right
	static void rangeUpdate(ArrayList<Integer> list, int left, int right, int value) {
		if (left < 0 || right >= list.size() || left > right) {
			System.out.println("Invalid range!");
			return;
		}

		for (int i = left; i <= right; i++) {
			list.set(i, list.get(i) + value);
		}
	}

	// Range query: Find sum of elements from left to right
	static int rangeQuery(ArrayList<Integer> list, int left, int right) {
		if (left < 0 || right >= list.size() || left > right) {
			System.out.println("Invalid range!");
			return 0;
		}

		int sum = 0;
		for (int i = left; i <= right; i++) {
			sum += list.get(i);
		}

		return sum;
	}

	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<>();

		list.add(2);
		list.add(4);
		list.add(6);
		list.add(8);
		list.add(10);

		System.out.println("Original ArrayList: " + list);

		// Update indices 1 to 3 by adding 5
		rangeUpdate(list, 1, 3, 5);

		System.out.println("After Range Update: " + list);

		// Query sum from index 1 to 4
		int sum = rangeQuery(list, 1, 4);

		System.out.println("Range Sum (1 to 4): " + sum);
	}
}
