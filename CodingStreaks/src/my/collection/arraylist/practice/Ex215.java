package my.collection.arraylist.practice;

import java.util.ArrayList;

public class Ex215 {

	public static boolean canSplitEqualAverage(ArrayList<Integer> list) {
		int n = list.size();
		if (n < 2)
			return false;

		int totalSum = 0;
		for (int num : list) {
			totalSum += num;
		}

		// Try every possible subset using bitmask
		int totalMasks = 1 << n;

		for (int mask = 1; mask < totalMasks - 1; mask++) {
			int subsetSum = 0;
			int subsetSize = 0;

			for (int i = 0; i < n; i++) {
				if ((mask & (1 << i)) != 0) {
					subsetSum += list.get(i);
					subsetSize++;
				}
			}

			int remainingSum = totalSum - subsetSum;
			int remainingSize = n - subsetSize;

			// Compare averages using cross multiplication
			if (subsetSum * remainingSize == remainingSum * subsetSize) {
				return true;
			}
		}

		return false;
	}

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();

		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(6);

		if (canSplitEqualAverage(list)) {
			System.out.println("Can be split into equal average subsets.");
		} else {
			System.out.println("Cannot be split into equal average subsets.");
		}
	}
}
