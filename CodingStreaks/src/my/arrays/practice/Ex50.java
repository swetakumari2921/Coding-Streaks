package my.arrays.practice;

import java.util.*;

public class Ex50 {
	public static void main(String[] args) {
		int[] arr = { 4, 5, 2, 25 };
		int n = arr.length;
		int[] result = new int[n];

		for (int i = 0; i < n; i++) {
			result[i] = -1; 

			for (int j = i + 1; j < n; j++) {
				if (arr[j] > arr[i]) {
					result[i] = arr[j];
					break;
				}
			}
		}

		System.out.println(Arrays.toString(result));
	}
}
