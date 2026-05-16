package my.arrays.practice;

import java.util.Scanner;

public class Ex159 {

	public static int minSwaps(int[] arr) {

		int n = arr.length;

		// Count negative numbers
		int negativeCount = 0;

		for (int i = 0; i < n; i++) {
			if (arr[i] < 0) {
				negativeCount++;
			}
		}

		// If no negatives or all negatives
		if (negativeCount == 0 || negativeCount == n) {
			return 0;
		}

		// Count non-negative numbers in first window
		int bad = 0;

		for (int i = 0; i < negativeCount; i++) {
			if (arr[i] >= 0) {
				bad++;
			}
		}

		int minSwaps = bad;

		// Sliding window
		for (int i = 0, j = negativeCount; j < n; i++, j++) {

			// Remove left element
			if (arr[i] >= 0) {
				bad--;
			}

			// Add right element
			if (arr[j] >= 0) {
				bad++;
			}

			minSwaps = Math.min(minSwaps, bad);
		}

		return minSwaps;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		System.out.println(minSwaps(arr));

		sc.close();
	}
}
