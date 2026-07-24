package my.collection.arraylist.practice;

import java.util.ArrayList;

public class Ex216 {

	public static int minimumDifference(ArrayList<Integer> arr) {
		int totalSum = 0;

		for (int num : arr) {
			totalSum += num;
		}

		int n = arr.size();
		boolean[][] dp = new boolean[n + 1][totalSum + 1];

		for (int i = 0; i <= n; i++) {
			dp[i][0] = true;
		}

		for (int i = 1; i <= n; i++) {
			int current = arr.get(i - 1);

			for (int j = 1; j <= totalSum; j++) {
				if (current <= j) {
					dp[i][j] = dp[i - 1][j] || dp[i - 1][j - current];
				} else {
					dp[i][j] = dp[i - 1][j];
				}
			}
		}

		int minDiff = Integer.MAX_VALUE;

		for (int s1 = 0; s1 <= totalSum / 2; s1++) {
			if (dp[n][s1]) {
				int s2 = totalSum - s1;
				minDiff = Math.min(minDiff, Math.abs(s2 - s1));
			}
		}

		return minDiff;
	}

	public static void main(String[] args) {
		ArrayList<Integer> arr = new ArrayList<>();

		arr.add(1);
		arr.add(6);
		arr.add(11);
		arr.add(5);

		System.out.println("Minimum Difference: " + minimumDifference(arr));
	}
}
