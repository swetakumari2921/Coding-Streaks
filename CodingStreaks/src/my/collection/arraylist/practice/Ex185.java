package my.collection.arraylist.practice;

import java.util.ArrayList;

public class Ex185 {

	public static int search(ArrayList<Integer> list, int target) {

		int low = 0;
		int high = 1;

		while (high < list.size() && list.get(high) < target) {
			low = high;
			high = high * 2;
		}

		if (high >= list.size()) {
			high = list.size() - 1;
		}

		while (low <= high) {
			int mid = low + (high - low) / 2;

			if (list.get(mid) == target) {
				return mid;
			} else if (list.get(mid) < target) {
				low = mid + 1;
			} else {
				high = mid - 1;
			}
		}

		return -1;
	}

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();

		int[] arr = { 2, 4, 6, 8, 10, 12, 14, 16, 18, 20 };
		for (int num : arr) {
			list.add(num);
		}

		int target = 14;

		int index = search(list, target);

		if (index != -1) {
			System.out.println("Element found at index: " + index);
		} else {
			System.out.println("Element not found");
		}
	}
}
