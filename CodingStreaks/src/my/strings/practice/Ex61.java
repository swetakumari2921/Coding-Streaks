package my.strings.practice;

import java.util.Scanner;

public class Ex61 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter number of elements:");
		int n = sc.nextInt();

		int[] arr = new int[n];
		System.out.println("Enter elements:");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		int[] dp = new int[n];

		for (int i = 0; i < n; i++) {
			dp[i] = arr[i];
		}

		for (int i = 1; i < n; i++) {
			for (int j = 0; j < i; j++) {
				if (arr[i] > arr[j] && dp[i] < dp[j] + arr[i]) {
					dp[i] = dp[j] + arr[i];
				}
			}
		}

		int max = dp[0];
		for (int i = 1; i < n; i++) {
			if (dp[i] > max) {
				max = dp[i];
			}
		}

		System.out.println("Maximum sum increasing subsequence: " + max);
	}
}
