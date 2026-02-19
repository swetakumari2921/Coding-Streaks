package my.arrays.practice;

import java.util.Scanner;

public class Ex66 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter size of array:");
		int n = sc.nextInt();
		int[] arr = new int[n];

		System.out.println("Enter array elements:");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		System.out.println("Enter subarray size k:");
		int k = sc.nextInt();

		int maxSum = 0;
		for (int i = 0; i < k; i++) {
			maxSum += arr[i];
		}

		int windowSum = maxSum;
		for (int i = k; i < n; i++) {
			windowSum = windowSum + arr[i] - arr[i - k];
			if (windowSum > maxSum) {
				maxSum = windowSum;
			}
		}

		System.out.println("Maximum sum of subarray of size " + k + " is: " + maxSum);
	}
}
