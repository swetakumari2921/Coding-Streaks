package my.arrays.practice;

import java.util.Scanner;

public class Ex62 {

	public static int findLIS(int[] arr, int n) {
		int[] dp = new int[n];

		for (int i = 0; i < n; i++) {
			dp[i] = 1;
		}

		for (int i = 1; i < n; i++) {
			for (int j = 0; j < i; j++) {
				if (arr[i] > arr[j] && dp[i] < dp[j] + 1) {
					dp[i] = dp[j] + 1;
				}
			}
		}

		int max = 0;
		for (int i = 0; i < n; i++) {
			if (dp[i] > max) {
				max = dp[i];
			}
		}

		return max;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter number of elements: ");
		int n = sc.nextInt();

		int[] arr = new int[n];

		System.out.println("Enter elements:");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		int result = findLIS(arr, n);

		System.out.println("Length of Longest Increasing Subsequence: " + result);
	}
}
