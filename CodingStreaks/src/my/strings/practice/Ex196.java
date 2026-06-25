package my.strings.practice;

public class Ex196 {

	static int minInsertions(String str) {

		int n = str.length();

		int[][] dp = new int[n][n];

		for (int len = 2; len <= n; len++) {

			for (int i = 0; i <= n - len; i++) {

				int j = i + len - 1;

				if (str.charAt(i) == str.charAt(j)) {

					dp[i][j] = dp[i + 1][j - 1];

				} else {

					dp[i][j] = 1 + Math.min(dp[i + 1][j], dp[i][j - 1]);

				}

			}

		}

		return dp[0][n - 1];

	}

	public static void main(String[] args) {

		String str = "abcda";

		System.out.println("Minimum Insertions = " + minInsertions(str));

	}

}
