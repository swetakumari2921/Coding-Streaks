package my.collection.arraylist.practice;

import java.util.ArrayList;

public class Ex207 {

	public static int maxSubarraySumWithKDeletions(ArrayList<Integer> arr, int k) {
		int n = arr.size();

		if (n == 0)
			return 0;

		int[][] dp = new int[n][k + 1];
		int ans = Integer.MIN_VALUE;

		// Base case (0 deletions)
		dp[0][0] = arr.get(0);
		ans = dp[0][0];

		for (int j = 1; j <= k; j++)
			dp[0][j] = 0; // Delete first element

		ans = Math.max(ans, 0);

		for (int i = 1; i < n; i++) {

			// No deletion
			dp[i][0] = Math.max(arr.get(i), dp[i - 1][0] + arr.get(i));
			ans = Math.max(ans, dp[i][0]);

			for (int j = 1; j <= k; j++) {

				// Keep current element
				int keep = Math.max(arr.get(i), dp[i - 1][j] + arr.get(i));

				// Delete current element
				int delete = dp[i - 1][j - 1];

				dp[i][j] = Math.max(keep, delete);

				ans = Math.max(ans, dp[i][j]);
			}
		}

		return ans;
	}

	public static void main(String[] args) {

		ArrayList<Integer> arr = new ArrayList<>();

		arr.add(1);
		arr.add(-2);
		arr.add(0);
		arr.add(3);

		int k = 1;

		System.out.println("Maximum Subarray Sum = " + maxSubarraySumWithKDeletions(arr, k));
	}
}
