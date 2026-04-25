package my.strings.practice;

public class Ex132 {
	public static int countDecoding(String str) {
		int n = str.length();

		if (n == 0 || str.charAt(0) == '0') {
			return 0;
		}

		int[] dp = new int[n + 1];
		dp[0] = 1;
		dp[1] = 1;

		for (int i = 2; i <= n; i++) {
			if (str.charAt(i - 1) > '0') {
				dp[i] = dp[i - 1];
			}

			int twoDigit = (str.charAt(i - 2) - '0') * 10 + (str.charAt(i - 1) - '0');

			if (twoDigit >= 10 && twoDigit <= 26) {
				dp[i] += dp[i - 2];
			}
		}

		return dp[n];
	}

	public static void main(String[] args) {
		String str = "123";
		System.out.println(countDecoding(str));
	}
}
