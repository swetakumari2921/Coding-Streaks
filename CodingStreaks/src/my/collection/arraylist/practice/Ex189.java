package my.collection.arraylist.practice;

import java.util.ArrayList;

public class Ex189 {

	// First occurrence using Binary Search
	public static int firstOccurrence(ArrayList<Integer> arr, int key) {
		int low = 0, high = arr.size() - 1;
		int first = -1;

		while (low <= high) {
			int mid = (low + high) / 2;

			if (arr.get(mid) == key) {
				first = mid;
				high = mid - 1;
			} else if (arr.get(mid) < key) {
				low = mid + 1;
			} else {
				high = mid - 1;
			}
		}

		return first;
	}

	// Last occurrence using Binary Search
	public static int lastOccurrence(ArrayList<Integer> arr, int key) {
		int low = 0, high = arr.size() - 1;
		int last = -1;

		while (low <= high) {
			int mid = (low + high) / 2;

			if (arr.get(mid) == key) {
				last = mid;
				low = mid + 1;
			} else if (arr.get(mid) < key) {
				low = mid + 1;
			} else {
				high = mid - 1;
			}
		}

		return last;
	}

	public static void main(String[] args) {
		ArrayList<Integer> arr = new ArrayList<>();

		arr.add(1);
		arr.add(2);
		arr.add(2);
		arr.add(2);
		arr.add(3);
		arr.add(4);
		arr.add(4);
		arr.add(5);

		int key = 2;

		int first = firstOccurrence(arr, key);
		int last = lastOccurrence(arr, key);

		if (first == -1) {
			System.out.println("Element not found");
		} else {
			int frequency = last - first + 1;
			System.out.println("Frequency of " + key + " = " + frequency);
		}
	}
}
