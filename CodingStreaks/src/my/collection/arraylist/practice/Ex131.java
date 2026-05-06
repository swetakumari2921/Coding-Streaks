package my.collection.arraylist.practice;

import java.util.ArrayList;

public class Ex131 {

	public static void main(String[] args) {
		int[] arr = { 10, 9, 2, 5, 3, 7, 101, 18 };

		ArrayList<Integer> list = new ArrayList<>();

		for (int i = 0; i < arr.length; i++) {
			int num = arr[i];

			if (list.size() == 0 || num > list.get(list.size() - 1)) {
				list.add(num);
			} else {
				int idx = binarySearch(list, num);
				list.set(idx, num);
			}
		}

		System.out.println("Length of LIS: " + list.size());
	}

	// Custom binary search (no Collections.binarySearch)
	static int binarySearch(ArrayList<Integer> list, int target) {
		int low = 0, high = list.size() - 1;

		while (low <= high) {
			int mid = (low + high) / 2;

			if (list.get(mid) == target) {
				return mid;
			} else if (list.get(mid) < target) {
				low = mid + 1;
			} else {
				high = mid - 1;
			}
		}

		return low; // position to replace
	}
}
