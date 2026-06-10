package my.strings.practice;

public class Ex181 {

	static boolean isMatch(String str, String pattern) {
		int n = str.length();
		int m = pattern.length();

		boolean[][] dp = new boolean[n + 1][m + 1];

		dp[0][0] = true;

		for (int j = 1; j <= m; j++) {
			if (pattern.charAt(j - 1) == '*') {
				dp[0][j] = dp[0][j - 1];
			}
		}

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= m; j++) {
				char p = pattern.charAt(j - 1);

				if (p == '*') {
					dp[i][j] = dp[i][j - 1] || dp[i - 1][j];
				} else if (p == '?' || p == str.charAt(i - 1)) {
					dp[i][j] = dp[i - 1][j - 1];
				}
			}
		}

		return dp[n][m];
	}

	public static void main(String[] args) {
		String str = "abcdef";
		String pattern = "a*e?";

		System.out.println(isMatch(str, pattern));
	}
}
