package my.strings.practice;

import java.util.Scanner;

public class Ex178 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter first string: ");
		String s1 = sc.nextLine();

		System.out.print("Enter second string: ");
		String s2 = sc.nextLine();

		int m = s1.length();
		int n = s2.length();

		int[][] dp = new int[m + 1][n + 1];

		// Build DP table
		for (int i = 1; i <= m; i++) {
			for (int j = 1; j <= n; j++) {

				if (s1.charAt(i - 1) == s2.charAt(j - 1))
					dp[i][j] = dp[i - 1][j - 1] + 1;
				else
					dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
			}
		}

		// Reconstruct LCS
		int len = dp[m][n];
		char[] lcs = new char[len];

		int i = m, j = n, index = len - 1;

		while (i > 0 && j > 0) {

			if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
				lcs[index--] = s1.charAt(i - 1);
				i--;
				j--;
			} else if (dp[i - 1][j] > dp[i][j - 1]) {
				i--;
			} else {
				j--;
			}
		}

		System.out.println("Longest Common Subsequence = " + new String(lcs));
		System.out.println("Length = " + len);
	}
}
