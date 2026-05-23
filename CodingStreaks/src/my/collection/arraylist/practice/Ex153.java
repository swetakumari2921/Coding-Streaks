package my.collection.arraylist.practice;

import java.util.ArrayList;

public class Ex153 {

	// Function to find shortest unsorted subarray
	static void findSubarray(ArrayList<Integer> list) {

		int n = list.size();

		int start = -1;
		int end = -1;

		// Find first element out of order from left
		for (int i = 0; i < n - 1; i++) {
			if (list.get(i) > list.get(i + 1)) {
				start = i;
				break;
			}
		}

		// Array already sorted
		if (start == -1) {
			System.out.println("Array is already sorted");
			return;
		}

		// Find first element out of order from right
		for (int i = n - 1; i > 0; i--) {
			if (list.get(i) < list.get(i - 1)) {
				end = i;
				break;
			}
		}

		// Find minimum and maximum in unsorted part
		int min = list.get(start);
		int max = list.get(start);

		for (int i = start; i <= end; i++) {
			if (list.get(i) < min) {
				min = list.get(i);
			}

			if (list.get(i) > max) {
				max = list.get(i);
			}
		}

		// Extend start to left
		for (int i = 0; i < start; i++) {
			if (list.get(i) > min) {
				start = i;
				break;
			}
		}

		// Extend end to right
		for (int i = n - 1; i > end; i--) {
			if (list.get(i) < max) {
				end = i;
				break;
			}
		}

		System.out.println("Shortest Unsorted Subarray:");
		System.out.println("Start Index = " + start);
		System.out.println("End Index = " + end);
	}

	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<>();

		list.add(1);
		list.add(2);
		list.add(6);
		list.add(4);
		list.add(5);
		list.add(7);
		list.add(8);

		findSubarray(list);
	}
}
