package my.collection.arraylist.practice;

import java.util.ArrayList;
import java.util.Arrays;

public class Ex226 {

	public static void nextPermutation(ArrayList<Integer> list) {
		int n = list.size();

		// Step 1: Find the first decreasing element
		int i = n - 2;
		while (i >= 0 && list.get(i) >= list.get(i + 1)) {
			i--;
		}

		// Step 2: Find the next greater element and swap
		if (i >= 0) {
			int j = n - 1;
			while (list.get(j) <= list.get(i)) {
				j--;
			}
			swap(list, i, j);
		}

		// Step 3: Reverse the remaining elements
		reverse(list, i + 1, n - 1);
	}

	private static void swap(ArrayList<Integer> list, int i, int j) {
		int temp = list.get(i);
		list.set(i, list.get(j));
		list.set(j, temp);
	}

	private static void reverse(ArrayList<Integer> list, int left, int right) {
		while (left < right) {
			swap(list, left, right);
			left++;
			right--;
		}
	}

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3));

		System.out.println("Original: " + list);

		nextPermutation(list);

		System.out.println("Next Permutation: " + list);
	}
}
