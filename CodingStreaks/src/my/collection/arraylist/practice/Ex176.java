package my.collection.arraylist.practice;

import java.util.ArrayList;

public class Ex176 {

	public static ArrayList<Integer> maxAbsoluteSubarray(int[] arr) {

		int n = arr.length;

		// Max sum Kadane
		int maxSum = arr[0];
		int currMax = arr[0];
		int maxStart = 0, maxEnd = 0, tempStart = 0;

		// Min sum Kadane
		int minSum = arr[0];
		int currMin = arr[0];
		int minStart = 0, minEnd = 0;

		for (int i = 1; i < n; i++) {

			// Max subarray
			if (arr[i] > currMax + arr[i]) {
				currMax = arr[i];
				tempStart = i;
			} else {
				currMax += arr[i];
			}

			if (currMax > maxSum) {
				maxSum = currMax;
				maxStart = tempStart;
				maxEnd = i;
			}

			// Min subarray
			if (arr[i] < currMin + arr[i]) {
				currMin = arr[i];
				minStart = i;
			} else {
				currMin += arr[i];
			}

			if (currMin < minSum) {
				minSum = currMin;
				minEnd = i;
			}
		}

		// Decide which is better (absolute value)
		int useStart, useEnd;

		if (Math.abs(maxSum) >= Math.abs(minSum)) {
			useStart = maxStart;
			useEnd = maxEnd;
		} else {
			useStart = minStart;
			useEnd = minEnd;
		}

		// Build result using ArrayList
		ArrayList<Integer> result = new ArrayList<>();

		for (int i = useStart; i <= useEnd; i++) {
			result.add(arr[i]);
		}

		return result;
	}

	public static void main(String[] args) {
		int[] arr = { 1, -3, 2, 3, -4, 5, -6 };

		ArrayList<Integer> ans = maxAbsoluteSubarray(arr);

		System.out.print("Max absolute sum subarray: ");
		for (int i = 0; i < ans.size(); i++) {
			System.out.print(ans.get(i) + " ");
		}
	}
}
