package my.arrays.practice;

import java.util.Scanner;

public class Ex63 {

	public static int lds(int arr[], int n) {
		int dp[] = new int[n];

		for (int i = 0; i < n; i++)
			dp[i] = 1;

		int max = 1;

		for (int i = 1; i < n; i++) {
			for (int j = 0; j < i; j++) {
				if (arr[j] > arr[i] && dp[i] < dp[j] + 1) {
					dp[i] = dp[j] + 1;
				}
			}
			if (dp[i] > max)
				max = dp[i];
		}
		return max;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter size of array:");
		int n = sc.nextInt();

		int arr[] = new int[n];
		System.out.println("Enter elements:");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		int result = lds(arr, n);
		System.out.println(result);
	}
}
