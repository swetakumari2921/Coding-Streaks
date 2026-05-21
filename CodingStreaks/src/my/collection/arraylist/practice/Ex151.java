package my.collection.arraylist.practice;

import java.util.ArrayList;

public class Ex151 {

	// Function to find longest increasing contiguous subarray
	public static void longestIncreasingSubarray(int[] arr) {

		ArrayList<Integer> result = new ArrayList<>();

		int maxLength = 1;
		int currentLength = 1;

		int start = 0;
		int maxStart = 0;

		for (int i = 1; i < arr.length; i++) {

			if (arr[i] > arr[i - 1]) {
				currentLength++;
			} else {

				if (currentLength > maxLength) {
					maxLength = currentLength;
					maxStart = start;
				}

				start = i;
				currentLength = 1;
			}
		}

		// Final check
		if (currentLength > maxLength) {
			maxLength = currentLength;
			maxStart = start;
		}

		// Store longest subarray in ArrayList
		for (int i = maxStart; i < maxStart + maxLength; i++) {
			result.add(arr[i]);
		}

		System.out.println("Longest Increasing Contiguous Subarray:");
		System.out.println(result);
	}

	public static void main(String[] args) {

		int[] arr = { 2, 4, 6, 1, 3, 5, 7, 0 };

		longestIncreasingSubarray(arr);
	}
}
