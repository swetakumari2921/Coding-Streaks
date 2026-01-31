package my.arrays.practice;

import java.util.*;

public class Ex47 {

	public static void findPairs(int[] arr, int k) {
		Set<Integer> set = new HashSet<>();

		for (int num : arr) {
			set.add(num);
		}

		for (int num : arr) {
			if (set.contains(num + k)) {
				System.out.println("(" + num + ", " + (num + k) + ")");
			}
		}
	}

	public static void main(String[] args) {
		int[] arr = { 1, 5, 3, 4, 2 };
		int k = 2;

		findPairs(arr, k);
	}
}
