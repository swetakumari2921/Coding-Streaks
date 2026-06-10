package my.collection.arraylist.practice;

import java.util.ArrayList;

public class Ex172 {

	static ArrayList<Integer> longestSubarray(int[] arr, int k) {
		int left = 0;
		long product = 1;

		int maxLen = 0;
		int start = 0;

		for (int right = 0; right < arr.length; right++) {
			product *= arr[right];

			while (left <= right && product > k) {
				product /= arr[left];
				left++;
			}

			if (right - left + 1 > maxLen) {
				maxLen = right - left + 1;
				start = left;
			}
		}

		ArrayList<Integer> result = new ArrayList<>();

		for (int i = start; i < start + maxLen; i++) {
			result.add(arr[i]);
		}

		return result;
	}

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4 };
		int k = 10;

		ArrayList<Integer> ans = longestSubarray(arr, k);

		System.out.println(ans);
	}
}
