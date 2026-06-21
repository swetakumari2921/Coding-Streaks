package my.collection.arraylist.practice;

import java.util.ArrayList;

public class Ex183 {

	public static int findRotationCount(ArrayList<Integer> arr) {
		int low = 0;
		int high = arr.size() - 1;

		while (low <= high) {

			// Array is already sorted
			if (arr.get(low) <= arr.get(high))
				return low;

			int mid = low + (high - low) / 2;
			int next = (mid + 1) % arr.size();
			int prev = (mid + arr.size() - 1) % arr.size();

			// Minimum element found
			if (arr.get(mid) <= arr.get(next) && arr.get(mid) <= arr.get(prev))
				return mid;

			if (arr.get(mid) >= arr.get(low))
				low = mid + 1;
			else
				high = mid - 1;
		}

		return 0;
	}

	public static void main(String[] args) {
		ArrayList<Integer> arr = new ArrayList<>();

		arr.add(15);
		arr.add(18);
		arr.add(2);
		arr.add(3);
		arr.add(6);
		arr.add(12);

		System.out.println("Rotation Count: " + findRotationCount(arr));
	}
}
