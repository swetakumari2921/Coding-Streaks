package my.collection.arraylist.practice;

import java.util.ArrayList;

public class Ex173 {

	public static ArrayList<Integer> maxAlternatingSignSubarray(int[] arr) {
		int maxLen = 1, currLen = 1;
		int start = 0, maxStart = 0;

		for (int i = 1; i < arr.length; i++) {
			if ((arr[i] > 0 && arr[i - 1] < 0) || (arr[i] < 0 && arr[i - 1] > 0)) {
				currLen++;
			} else {
				currLen = 1;
				start = i;
			}

			if (currLen > maxLen) {
				maxLen = currLen;
				maxStart = start;
			}
		}

		ArrayList<Integer> result = new ArrayList<>();

		for (int i = maxStart; i < maxStart + maxLen; i++) {
			result.add(arr[i]);
		}

		return result;
	}

	public static void main(String[] args) {
		int[] arr = { 1, -2, 3, -4, 5, 6, -7, 8 };

		ArrayList<Integer> result = maxAlternatingSignSubarray(arr);

		System.out.println("Longest Alternating Sign Subarray: " + result);
	}
}
