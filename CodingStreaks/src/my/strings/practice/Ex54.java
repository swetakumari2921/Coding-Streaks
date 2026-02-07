package my.strings.practice;

import java.util.Scanner;

public class Ex54 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter first string: ");
		String s1 = sc.nextLine();

		System.out.print("Enter second string: ");
		String s2 = sc.nextLine();

		int m = s1.length();
		int n = s2.length();
		int[][] dp = new int[m + 1][n + 1];

		int maxLen = 0;
		int endIndex = 0;

		for (int i = 1; i <= m; i++) {
			for (int j = 1; j <= n; j++) {
				if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
					dp[i][j] = dp[i - 1][j - 1] + 1;
					if (dp[i][j] > maxLen) {
						maxLen = dp[i][j];
						endIndex = i;
					}
				}
			}
		}

		if (maxLen > 0) {
			System.out.println("Longest Common Substring: " + s1.substring(endIndex - maxLen, endIndex));
		} else {
			System.out.println("No Common Substring");
		}
	}
}
