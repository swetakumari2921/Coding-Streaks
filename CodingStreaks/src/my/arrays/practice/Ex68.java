package my.arrays.practice;

import java.util.Scanner;

public class Ex68 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter size:");
		int n = sc.nextInt();

		int[] arr = new int[n];

		System.out.println("Enter elements:");
		for (int i = 0; i < n; i++)
			arr[i] = sc.nextInt();

		int total = 0;
		int maxSum = arr[0];
		int currMax = 0;
		int minSum = arr[0];
		int currMin = 0;

		for (int i = 0; i < n; i++) {

			total += arr[i];

			currMax = Math.max(arr[i], currMax + arr[i]);
			maxSum = Math.max(maxSum, currMax);

			currMin = Math.min(arr[i], currMin + arr[i]);
			minSum = Math.min(minSum, currMin);
		}

		if (maxSum < 0)
			System.out.println("Maximum Circular Subarray Sum: " + maxSum);
		else
			System.out.println("Maximum Circular Subarray Sum: " + Math.max(maxSum, total - minSum));
	}
}
