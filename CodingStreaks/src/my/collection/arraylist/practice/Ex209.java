package my.collection.arraylist.practice;

import java.util.ArrayList;

public class Ex209 {

	public static int minimumSubarraySumAtLeastK(ArrayList<Integer> arr, int k) {
		int n = arr.size();

		if (n < k)
			return -1;

		int[] minEndingHere = new int[n];

		minEndingHere[0] = arr.get(0);

		for (int i = 1; i < n; i++) {
			minEndingHere[i] = Math.min(arr.get(i), minEndingHere[i - 1] + arr.get(i));
		}

		int windowSum = 0;

		for (int i = 0; i < k; i++)
			windowSum += arr.get(i);

		int answer = windowSum;

		for (int i = k; i < n; i++) {
			windowSum += arr.get(i) - arr.get(i - k);

			answer = Math.min(answer, windowSum);

			answer = Math.min(answer, windowSum + minEndingHere[i - k]);
		}

		return answer;
	}

	public static void main(String[] args) {
		ArrayList<Integer> arr = new ArrayList<>();

		arr.add(3);
		arr.add(-4);
		arr.add(2);
		arr.add(-3);
		arr.add(-1);
		arr.add(7);
		arr.add(-5);

		int k = 2;

		System.out.println("Minimum subarray sum = " + minimumSubarraySumAtLeastK(arr, k));
	}
}
