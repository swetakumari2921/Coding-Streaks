package my.strings.practice;

public class Ex94 {
	public static int lcs(String A, String B) {
		int m = A.length();
		int n = B.length();
		int[][] dp = new int[m + 1][n + 1];

		for (int i = 0; i <= m; i++) {
			for (int j = 0; j <= n; j++) {
				if (i == 0 || j == 0)
					dp[i][j] = 0;
				else if (A.charAt(i - 1) == B.charAt(j - 1))
					dp[i][j] = 1 + dp[i - 1][j - 1];
				else
					dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
			}
		}
		return dp[m][n];
	}

	public static void main(String[] args) {
		String A = "heap";
		String B = "pea";

		int lcsLen = lcs(A, B);

		int deletions = A.length() - lcsLen;
		int insertions = B.length() - lcsLen;

		System.out.println("Minimum Deletions: " + deletions);
		System.out.println("Minimum Insertions: " + insertions);
	}
}
