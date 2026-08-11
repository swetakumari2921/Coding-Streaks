package my.collection.linkedlist.practice;

import java.util.LinkedList;
import java.util.Collections;

public class Ex223 {

	// Find K-th largest sum of contiguous sub-LinkedList segments
	public static int kthLargestSum(LinkedList<Integer> list, int k) {

		LinkedList<Integer> sums = new LinkedList<>();

		// Generate all sub-LinkedList segment sums
		for (int i = 0; i < list.size(); i++) {

			int sum = 0;

			for (int j = i; j < list.size(); j++) {

				sum += list.get(j);
				sums.add(sum);
			}
		}

		// Sort in descending order
		Collections.sort(sums, Collections.reverseOrder());

		// Check valid k
		if (k <= 0 || k > sums.size()) {
			throw new IllegalArgumentException("Invalid value of k");
		}

		return sums.get(k - 1);
	}

	public static void main(String[] args) {

		LinkedList<Integer> list = new LinkedList<>();

		list.add(2);
		list.add(-1);
		list.add(3);
		list.add(4);

		int k = 3;

		int result = kthLargestSum(list, k);

		System.out.println("K-th largest sub-LinkedList sum: " + result);
	}
}
