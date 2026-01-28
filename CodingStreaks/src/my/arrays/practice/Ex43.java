package my.arrays.practice;

import java.util.*;

public class Ex43 {
	public static int[] findSubarray(int[] arr, int targetSum) {
		Map<Integer, Integer> map = new HashMap<>();
		int currSum = 0;

		for (int i = 0; i < arr.length; i++) {
			currSum += arr[i];

			if (currSum == targetSum) {
				return new int[] { 0, i };
			}

			if (map.containsKey(currSum - targetSum)) {
				return new int[] { map.get(currSum - targetSum) + 1, i };
			}

			map.putIfAbsent(currSum, i);
		}

		return null;
	}

	public static void main(String[] args) {
		int[] arr = { 10, 2, -2, -20, 10 };
		int targetSum = -10;

		int[] result = findSubarray(arr, targetSum);

		if (result != null) {
			System.out.println("Subarray found from index " + result[0] + " to " + result[1]);
		} else {
			System.out.println("No subarray with given sum exists.");
		}
	}
}
