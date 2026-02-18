package my.arrays.practice;

import java.util.Scanner;

public class Ex65 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of elements:");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter array elements:");
		for (int i = 0; i < n; i++)
			arr[i] = sc.nextInt();

		long[] dp = new long[n];
		long total = 0;

		for (int i = 0; i < n; i++) {
			dp[i] = 1;
			for (int j = 0; j < i; j++) {
				if (arr[j] < arr[i])
					dp[i] += dp[j];
			}
			total += dp[i];
		}

		System.out.println("Total increasing subsequences: " + total);
	}
}
