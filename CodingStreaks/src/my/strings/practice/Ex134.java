package my.strings.practice;

public class Ex134 {
	static int shortestUnSub(String s, String t) {
		int m = s.length();
		int n = t.length();

		int[][] dp = new int[m + 1][n + 1];
		int INF = 1005;

		for (int i = 0; i <= m; i++) {
			dp[i][0] = 1;
		}

		for (int j = 1; j <= n; j++) {
			dp[0][j] = INF;
		}

		for (int i = 1; i <= m; i++) {
			for (int j = 1; j <= n; j++) {
				char ch = s.charAt(i - 1);
				int k;
				for (k = j - 1; k >= 0; k--) {
					if (t.charAt(k) == ch) {
						break;
					}
				}

				if (k == -1) {
					dp[i][j] = 1;
				} else {
					int exclude = dp[i - 1][j];
					int include = dp[i - 1][k] + 1;
					dp[i][j] = Math.min(exclude, include);
				}
			}
		}

		int ans = dp[m][n];
		if (ans >= INF) {
			return -1;
		}
		return ans;
	}

	public static void main(String[] args) {
		String s = "babab";
		String t = "babba";
		System.out.println(shortestUnSub(s, t));
	}
}
