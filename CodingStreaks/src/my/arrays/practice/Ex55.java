package my.arrays.practice;

// Minimum of all subarrays of size k (Sliding Window).

import java.util.Scanner;

public class Ex55 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter number of elements: ");
		int n = sc.nextInt();
		int[] arr = new int[n];

		System.out.println("Enter array elements:");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		System.out.print("Enter window size k: ");
		int k = sc.nextInt();

		System.out.println("Minimum of each subarray of size " + k + ":");

		for (int i = 0; i <= n - k; i++) {
			int min = arr[i];

			for (int j = i; j < i + k; j++) {
				if (arr[j] < min) {
					min = arr[j];
				}
			}

			System.out.print(min + " ");
		}
	}
}
