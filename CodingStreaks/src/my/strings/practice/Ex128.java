package my.strings.practice;

public class Ex128 {
	public static void main(String[] args) {
		String s = "aba";
		int n = s.length();

		int[] dp = new int[n + 1];
		int[] last = new int[256];

		for (int i = 0; i < 256; i++)
			last[i] = -1;

		dp[0] = 1;

		for (int i = 1; i <= n; i++) {
			char c = s.charAt(i - 1);
			dp[i] = 2 * dp[i - 1];

			if (last[c] != -1) {
				dp[i] = dp[i] - dp[last[c]];
			}

			last[c] = i - 1;
		}

		System.out.println(dp[n]);
	}
}
