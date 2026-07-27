package my.collection.arraylist.practice;

import java.util.ArrayList;

public class Ex219 {

	public static int countSubsets(ArrayList<Integer> arr, int k) {
		int n = arr.size();
		int[][] dp = new int[n + 1][k + 1];

		// Base case: One subset (empty subset) has sum 0
		for (int i = 0; i <= n; i++) {
			dp[i][0] = 1;
		}

		for (int i = 1; i <= n; i++) {
			int current = arr.get(i - 1);
			for (int sum = 0; sum <= k; sum++) {
				// Exclude current element
				dp[i][sum] = dp[i - 1][sum];

				// Include current element if possible
				if (current <= sum) {
					dp[i][sum] += dp[i - 1][sum - current];
				}
			}
		}

		return dp[n][k];
	}

	public static void main(String[] args) {
		ArrayList<Integer> arr = new ArrayList<>();
		arr.add(2);
		arr.add(3);
		arr.add(5);
		arr.add(6);
		arr.add(8);
		arr.add(10);

		int k = 10;

		System.out.println("Count of subsets with sum " + k + " = " + countSubsets(arr, k));
	}
}
