package my.collection.arraylist.practice;

import java.util.ArrayList;

public class Ex152 {

	public static void main(String[] args) {

		int[] arr = { 9, 8, 7, 10, 6, 5, 4, 2, 3 };

		ArrayList<Integer> current = new ArrayList<>();
		ArrayList<Integer> best = new ArrayList<>();

		current.add(arr[0]);

		for (int i = 1; i < arr.length; i++) {

			if (arr[i] < arr[i - 1]) {
				current.add(arr[i]);
			} else {
				current = new ArrayList<>();
				current.add(arr[i]);
			}

			if (current.size() > best.size()) {
				best = new ArrayList<>(current);
			}
		}

		System.out.println("Longest decreasing contiguous subarray: " + best);
	}
}
