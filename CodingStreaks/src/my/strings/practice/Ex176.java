package my.strings.practice;

import java.util.Scanner;

public class Ex176 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a string: ");
		String str = sc.nextLine();

		int n = str.length();

		int[][] dp = new int[n + 1][n + 1];

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {

				if (str.charAt(i - 1) == str.charAt(j - 1) && i != j) {
					dp[i][j] = dp[i - 1][j - 1] + 1;
				} else {
					dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
				}
			}
		}

		int len = dp[n][n];
		char[] result = new char[len];

		int i = n, j = n, index = len - 1;

		while (i > 0 && j > 0) {

			if (str.charAt(i - 1) == str.charAt(j - 1) && i != j) {
				result[index--] = str.charAt(i - 1);
				i--;
				j--;
			} else if (dp[i - 1][j] > dp[i][j - 1]) {
				i--;
			} else {
				j--;
			}
		}

		System.out.println("Length of Longest Repeating Subsequence = " + len);
		System.out.println("Longest Repeating Subsequence = " + new String(result));
	}
}
