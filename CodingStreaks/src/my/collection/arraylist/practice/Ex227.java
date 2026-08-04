package my.collection.arraylist.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Ex227 {

	public static void previousPermutation(ArrayList<Integer> list) {

		int n = list.size();

		// Step 1: Find first decreasing element from right
		int i = n - 2;
		while (i >= 0 && list.get(i) <= list.get(i + 1)) {
			i--;
		}

		// If already smallest permutation
		if (i == -1) {
			Collections.reverse(list);
			return;
		}

		// Step 2: Find element just smaller than list[i]
		int j = n - 1;
		while (list.get(j) >= list.get(i)) {
			j--;
		}

		// Step 3: Swap
		Collections.swap(list, i, j);

		// Step 4: Reverse remaining suffix
		reverse(list, i + 1, n - 1);
	}

	private static void reverse(ArrayList<Integer> list, int left, int right) {
		while (left < right) {
			Collections.swap(list, left, right);
			left++;
			right--;
		}
	}

	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<>(Arrays.asList(3, 2, 1));

		System.out.println("Original: " + list);

		previousPermutation(list);

		System.out.println("Previous Permutation: " + list);
	}
}
