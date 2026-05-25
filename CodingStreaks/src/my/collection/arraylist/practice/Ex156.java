package my.collection.arraylist.practice;

import java.util.*;

public class Ex156 {

	static int minSwaps(ArrayList<Integer> arr) {
		int n = arr.size();

		// step 1: count total 1s
		int k = 0;
		for (int i = 0; i < n; i++) {
			if (arr.get(i) == 1) {
				k++;
			}
		}

		// if no 1 or all 1
		if (k == 0 || k == n)
			return 0;

		// step 2: count 1s in first window
		int currOnes = 0;
		for (int i = 0; i < k; i++) {
			if (arr.get(i) == 1)
				currOnes++;
		}

		int maxOnes = currOnes;

		// step 3: sliding window
		for (int i = k; i < n; i++) {
			if (arr.get(i - k) == 1)
				currOnes--;
			if (arr.get(i) == 1)
				currOnes++;

			if (currOnes > maxOnes) {
				maxOnes = currOnes;
			}
		}

		// step 4: result
		return k - maxOnes;
	}

	public static void main(String[] args) {

		ArrayList<Integer> arr = new ArrayList<>();
		arr.add(1);
		arr.add(0);
		arr.add(1);
		arr.add(0);
		arr.add(1);

		System.out.println("Minimum swaps: " + minSwaps(arr));
	}
}
