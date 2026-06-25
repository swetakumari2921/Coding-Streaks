package my.arrays.practice;

public class Ex202 {

	static boolean canPartition(int[] arr) {
		int totalSum = 0;

		for (int num : arr) {
			totalSum += num;
		}

		if (totalSum % 2 != 0) {
			return false;
		}

		int target = totalSum / 2;
		boolean[][] dp = new boolean[arr.length + 1][target + 1];

		for (int i = 0; i <= arr.length; i++) {
			dp[i][0] = true;
		}

		for (int i = 1; i <= arr.length; i++) {
			for (int j = 1; j <= target; j++) {
				dp[i][j] = dp[i - 1][j];

				if (arr[i - 1] <= j) {
					dp[i][j] = dp[i][j] || dp[i - 1][j - arr[i - 1]];
				}
			}
		}

		return dp[arr.length][target];
	}

	public static void main(String[] args) {
		int[] arr = { 1, 5, 11, 5 };

		if (canPartition(arr)) {
			System.out.println("Can be partitioned into two equal sum subsets");
		} else {
			System.out.println("Cannot be partitioned into two equal sum subsets");
		}
	}
}
