package my.collection.arraylist.practice;

import java.util.ArrayList;

public class Ex70 {

	public static int kadane(ArrayList<Integer> arr) {
		int maxEnding = arr.get(0);
		int maxSoFar = arr.get(0);

		for (int i = 1; i < arr.size(); i++) {
			maxEnding = Math.max(arr.get(i), maxEnding + arr.get(i));
			maxSoFar = Math.max(maxSoFar, maxEnding);
		}
		return maxSoFar;
	}

	public static int maxCircularSum(ArrayList<Integer> arr) {
		int maxKadane = kadane(arr);
		int total = 0;

		ArrayList<Integer> inverted = new ArrayList<>();
		for (int val : arr) {
			total += val;
			inverted.add(-val);
		}

		int maxInverted = kadane(inverted);
		int circularSum = total + maxInverted;

		if (circularSum == 0)
			return maxKadane;

		return Math.max(maxKadane, circularSum);
	}

	public static void main(String[] args) {
		ArrayList<Integer> arr = new ArrayList<>();
		int[] input = { 8, -1, 3, 4 };
		for (int val : input)
			arr.add(val);

		int result = maxCircularSum(arr);
		System.out.println("Maximum circular subarray sum: " + result);
	}
}
