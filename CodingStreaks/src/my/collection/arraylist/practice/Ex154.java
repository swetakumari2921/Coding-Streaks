package my.collection.arraylist.practice;

import java.util.ArrayList;

public class Ex154 {

	public static int minSwaps(ArrayList<Integer> list, int k) {

		int n = list.size();

		// Count elements <= k
		int good = 0;

		for (int i = 0; i < n; i++) {
			if (list.get(i) <= k) {
				good++;
			}
		}

		// Count bad elements in first window
		int bad = 0;

		for (int i = 0; i < good; i++) {
			if (list.get(i) > k) {
				bad++;
			}
		}

		int minSwaps = bad;

		// Sliding window
		int left = 0;
		int right = good;

		while (right < n) {

			// Remove left element
			if (list.get(left) > k) {
				bad--;
			}

			// Add right element
			if (list.get(right) > k) {
				bad++;
			}

			minSwaps = Math.min(minSwaps, bad);

			left++;
			right++;
		}

		return minSwaps;
	}

	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<>();

		list.add(2);
		list.add(1);
		list.add(5);
		list.add(6);
		list.add(3);

		int k = 3;

		int result = minSwaps(list, k);

		System.out.println("Minimum swaps required = " + result);
	}
}
