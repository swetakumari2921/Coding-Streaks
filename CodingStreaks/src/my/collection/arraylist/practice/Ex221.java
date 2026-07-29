package my.collection.arraylist.practice;

import java.util.ArrayList;

public class Ex221 {

	public static int minimumSubsetSumDifference(ArrayList<Integer> nums) {

		int totalSum = 0;
		for (int num : nums) {
			totalSum += num;
		}

		int n = nums.size();

		// dp[i][j] = true if sum j can be formed using first i elements
		boolean[][] dp = new boolean[n + 1][totalSum + 1];

		for (int i = 0; i <= n; i++) {
			dp[i][0] = true;
		}

		for (int i = 1; i <= n; i++) {
			for (int sum = 1; sum <= totalSum; sum++) {

				if (nums.get(i - 1) <= sum) {
					dp[i][sum] = dp[i - 1][sum] || dp[i - 1][sum - nums.get(i - 1)];
				} else {
					dp[i][sum] = dp[i - 1][sum];
				}
			}
		}

		int minDiff = Integer.MAX_VALUE;

		// Check only half of totalSum
		for (int s1 = 0; s1 <= totalSum / 2; s1++) {
			if (dp[n][s1]) {
				int s2 = totalSum - s1;
				minDiff = Math.min(minDiff, Math.abs(s2 - s1));
			}
		}

		return minDiff;
	}

	public static void main(String[] args) {

		ArrayList<Integer> nums = new ArrayList<>();

		nums.add(1);
		nums.add(6);
		nums.add(11);
		nums.add(5);

		System.out.println("Minimum Subset Sum Difference: " + minimumSubsetSumDifference(nums));
	}
}
