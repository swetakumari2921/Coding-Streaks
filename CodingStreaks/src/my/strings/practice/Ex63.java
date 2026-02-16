package my.strings.practice;

import java.util.Scanner;

public class Ex63 {

	public static boolean canSegment(String s, String[] dict, int n) {
		int len = s.length();
		boolean[] dp = new boolean[len + 1];
		dp[0] = true;

		for (int i = 1; i <= len; i++) {
			for (int j = 0; j < n; j++) {
				int wlen = dict[j].length();
				if (wlen <= i && dp[i - wlen]) {
					if (s.substring(i - wlen, i).equals(dict[j])) {
						dp[i] = true;
						break;
					}
				}
			}
		}
		return dp[len];
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter string:");
		String s = sc.nextLine();

		System.out.println("Enter number of dictionary words:");
		int n = sc.nextInt();
		sc.nextLine();

		String[] dict = new String[n];
		System.out.println("Enter dictionary words:");
		for (int i = 0; i < n; i++) {
			dict[i] = sc.nextLine();
		}

		boolean result = canSegment(s, dict, n);
		System.out.println(result);
	}
}
