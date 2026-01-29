package my.arrays.practice;

// Count number of subarrays with sum = 0

import java.util.*;

public class Ex45 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the size of the array: ");
		int n = sc.nextInt();

		int[] arr = new int[n];
		System.out.println("Enter " + n + " elements of the array:");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		int count = 0;

		for (int i = 0; i < n; i++) {
			int sum = 0;
			for (int j = i; j < n; j++) {
				sum += arr[j];
				if (sum == 0) {
					count++;
					System.out.println("Subarray with sum 0 found from index " + i + " to " + j);
				}
			}
		}

		System.out.println("Total number of subarrays with sum 0: " + count);
		sc.close();
	}
}
