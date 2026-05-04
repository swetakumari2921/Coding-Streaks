package my.collection.arraylist.practice;

import java.util.ArrayList;

public class Ex128 {

	static boolean canSplit(ArrayList<Integer> arr, int k, int maxSum) {
		int count = 1;
		int sum = 0;

		for (int i = 0; i < arr.size(); i++) {
			if (sum + arr.get(i) > maxSum) {
				count++;
				sum = arr.get(i);
				if (count > k)
					return false;
			} else {
				sum += arr.get(i);
			}
		}
		return true;
	}

	public static void main(String[] args) {
		ArrayList<Integer> arr = new ArrayList<>();
		arr.add(7);
		arr.add(2);
		arr.add(5);
		arr.add(10);
		arr.add(8);

		int k = 2;

		int low = 0, high = 0;

		for (int i = 0; i < arr.size(); i++) {
			low = Math.max(low, arr.get(i));
			high += arr.get(i);
		}

		int ans = high;

		while (low <= high) {
			int mid = (low + high) / 2;

			if (canSplit(arr, k, mid)) {
				ans = mid;
				high = mid - 1;
			} else {
				low = mid + 1;
			}
		}

		System.out.println(ans);
	}
}
