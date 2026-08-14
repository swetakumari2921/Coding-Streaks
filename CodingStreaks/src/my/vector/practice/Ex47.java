package my.vector.practice;

import java.util.Vector;

public class Ex47 {

	public static int longestIncreasingSubsequence(Vector<Integer> vector) {

		int n = vector.size();

		if (n == 0) {
			return 0;
		}

		// dp[i] = length of LIS ending at index i
		Vector<Integer> dp = new Vector<>();

		for (int i = 0; i < n; i++) {
			dp.add(1);
		}

		int maxLength = 1;

		for (int i = 1; i < n; i++) {

			for (int j = 0; j < i; j++) {

				if (vector.get(j) < vector.get(i)) {
					dp.set(i, Math.max(dp.get(i), dp.get(j) + 1));
				}
			}

			maxLength = Math.max(maxLength, dp.get(i));
		}

		return maxLength;
	}

	public static void main(String[] args) {

		Vector<Integer> vector = new Vector<>();

		vector.add(10);
		vector.add(22);
		vector.add(9);
		vector.add(33);
		vector.add(21);
		vector.add(50);
		vector.add(41);
		vector.add(60);

		int result = longestIncreasingSubsequence(vector);

		System.out.println("Vector: " + vector);
		System.out.println("Longest Increasing Subsequence Length: " + result);
	}
}
