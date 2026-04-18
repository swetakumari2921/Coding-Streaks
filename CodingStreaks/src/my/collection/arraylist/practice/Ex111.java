package my.collection.arraylist.practice;

import java.util.ArrayList;

public class Ex111 {

	public static int longestSubarray(int[] arr, int k) {
		int left = 0, maxLen = 0;
		ArrayList<Integer> list = new ArrayList<>();

		for (int right = 0; right < arr.length; right++) {

			if (!list.contains(arr[right])) {
				list.add(arr[right]);
			}

			while (list.size() > k) {
				int val = arr[left];
				left++;

				if (!containsInWindow(arr, left, right, val)) {
					list.remove((Integer) val);
				}
			}

			maxLen = Math.max(maxLen, right - left + 1);
		}

		return maxLen;
	}

	static boolean containsInWindow(int[] arr, int l, int r, int val) {
		for (int i = l; i <= r; i++) {
			if (arr[i] == val)
				return true;
		}
		return false;
	}

	public static void main(String[] args) {
		int[] arr = { 1, 2, 1, 2, 3 };
		int k = 2;
		System.out.println(longestSubarray(arr, k));
	}
}
