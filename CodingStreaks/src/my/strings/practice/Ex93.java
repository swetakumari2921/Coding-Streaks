package my.strings.practice;

import java.util.*;

public class Ex93 {
	public static void main(String[] args) {
		String s = "leetcode";
		List<String> wordDict = Arrays.asList("leet", "code");

		HashSet<String> set = new HashSet<>(wordDict);
		boolean[] dp = new boolean[s.length() + 1];

		dp[0] = true;

		for (int i = 1; i <= s.length(); i++) {
			for (int j = 0; j < i; j++) {
				if (dp[j] && set.contains(s.substring(j, i))) {
					dp[i] = true;
					break;
				}
			}
		}

		System.out.println(dp[s.length()]);
	}
}
