package my.collection.linkedlist.practice;

import java.util.LinkedList;

public class Ex224 {

	// Find maximum sliding window sum
	public static int maxSlidingWindowSum(LinkedList<Integer> list, int k) {

		if (list.isEmpty() || k <= 0 || k > list.size()) {
			throw new IllegalArgumentException("Invalid window size");
		}

		int windowSum = 0;

		// Calculate first window sum
		for (int i = 0; i < k; i++) {
			windowSum += list.get(i);
		}

		int maxSum = windowSum;

		// Slide the window
		for (int i = k; i < list.size(); i++) {

			windowSum = windowSum - list.get(i - k) + list.get(i);

			maxSum = Math.max(maxSum, windowSum);
		}

		return maxSum;
	}

	public static void main(String[] args) {

		LinkedList<Integer> list = new LinkedList<>();

		list.add(2);
		list.add(1);
		list.add(5);
		list.add(1);
		list.add(3);
		list.add(2);

		int k = 3;

		int result = maxSlidingWindowSum(list, k);

		System.out.println("Maximum sliding window sum: " + result);
	}
}
