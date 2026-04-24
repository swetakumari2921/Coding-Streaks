package my.strings.practice;

public class Ex131 {
	public static boolean isPalindrome(String s, int start, int end) {
		while (start < end) {
			if (s.charAt(start) != s.charAt(end)) {
				return false;
			}
			start++;
			end--;
		}
		return true;
	}

	public static void main(String[] args) {
		String s = "aab";
		int n = s.length();

		int[] dp = new int[n];

		for (int i = 0; i < n; i++) {
			if (isPalindrome(s, 0, i)) {
				dp[i] = 0;
			} else {
				dp[i] = i;
				for (int j = 0; j < i; j++) {
					if (isPalindrome(s, j + 1, i)) {
						dp[i] = Math.min(dp[i], dp[j] + 1);
					}
				}
			}
		}

		System.out.println(dp[n - 1]);
	}
}
