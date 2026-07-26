package my.collection.arraylist.practice;

import java.util.ArrayList;

public class Ex218 {

	// Function to find one subset with the given sum using DP
	public static ArrayList<Integer> findSubset(ArrayList<Integer> arr, int target) {
		int n = arr.size();

		boolean[][] dp = new boolean[n + 1][target + 1];

		// Sum 0 is always possible
		for (int i = 0; i <= n; i++) {
			dp[i][0] = true;
		}

		// Build DP table
		for (int i = 1; i <= n; i++) {
			for (int sum = 1; sum <= target; sum++) {
				dp[i][sum] = dp[i - 1][sum];

				if (sum >= arr.get(i - 1)) {
					dp[i][sum] |= dp[i - 1][sum - arr.get(i - 1)];
				}
			}
		}

		ArrayList<Integer> subset = new ArrayList<>();

		if (!dp[n][target]) {
			return subset; // No subset exists
		}

		// Backtrack to find one valid subset
		int i = n;
		int sum = target;

		while (i > 0 && sum > 0) {
			if (!dp[i - 1][sum]) {
				subset.add(arr.get(i - 1));
				sum -= arr.get(i - 1);
			}
			i--;
		}

		return subset;
	}

	public static void main(String[] args) {
		ArrayList<Integer> arr = new ArrayList<>();
		arr.add(3);
		arr.add(34);
		arr.add(4);
		arr.add(12);
		arr.add(5);
		arr.add(2);

		int target = 9;

		ArrayList<Integer> subset = findSubset(arr, target);

		if (subset.isEmpty()) {
			System.out.println("No subset found.");
		} else {
			System.out.println("Subset with sum " + target + ": " + subset);
		}
	}
}
