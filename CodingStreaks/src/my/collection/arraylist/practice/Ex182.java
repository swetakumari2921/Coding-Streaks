package my.collection.arraylist.practice;

import java.util.ArrayList;

public class Ex182 {

	static int search(ArrayList<Integer> arr, int target) {
		int low = 0;
		int high = arr.size() - 1;

		while (low <= high) {
			int mid = low + (high - low) / 2;

			if (arr.get(mid) == target) {
				return mid;
			}

			// Left half is sorted
			if (arr.get(low) <= arr.get(mid)) {

				if (target >= arr.get(low) && target < arr.get(mid)) {
					high = mid - 1;
				} else {
					low = mid + 1;
				}

			}
			// Right half is sorted
			else {

				if (target > arr.get(mid) && target <= arr.get(high)) {
					low = mid + 1;
				} else {
					high = mid - 1;
				}
			}
		}

		return -1;
	}

	public static void main(String[] args) {

		ArrayList<Integer> arr = new ArrayList<>();
		arr.add(4);
		arr.add(5);
		arr.add(6);
		arr.add(7);
		arr.add(0);
		arr.add(1);
		arr.add(2);

		int target = 0;

		System.out.println(search(arr, target));
	}
}
