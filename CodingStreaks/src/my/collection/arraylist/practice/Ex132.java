package my.collection.arraylist.practice;

import java.util.ArrayList;

public class Ex132 {

	public static int firstOccurrence(ArrayList<Integer> arr, int target) {

		for (int i = 0; i < arr.size(); i++) {

			if (arr.get(i) == target) {
				return i; // first match
			}
		}

		return -1; // not found
	}

	public static void main(String[] args) {

		ArrayList<Integer> arr = new ArrayList<>();

		arr.add(5);
		arr.add(2);
		arr.add(8);
		arr.add(2);
		arr.add(10);

		int target = 2;

		System.out.println(firstOccurrence(arr, target)); // Output: 1
	}
}
