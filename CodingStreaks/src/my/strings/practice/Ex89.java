package my.strings.practice;

public class Ex89 {
	public static void longestCommonSubstring(String s1, String s2) {

		int n = s1.length();
		int m = s2.length();

		int[] prev = new int[m + 1];
		int[] curr = new int[m + 1];

		int maxLen = 0;
		int endIndex = 0;

		for (int i = 1; i <= n; i++) {

			for (int j = 1; j <= m; j++) {

				if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
					curr[j] = prev[j - 1] + 1;

					if (curr[j] > maxLen) {
						maxLen = curr[j];
						endIndex = i;
					}
				} else {
					curr[j] = 0;
				}
			}

			for (int j = 0; j <= m; j++) {
				prev[j] = curr[j];
				curr[j] = 0;
			}
		}

		String result = s1.substring(endIndex - maxLen, endIndex);

		System.out.println("Longest Common Substring: " + result);
		System.out.println("Length: " + maxLen);
	}

	public static void main(String[] args) {

		String s1 = "abcdef";
		String s2 = "zcdemf";

		longestCommonSubstring(s1, s2);
	}
}
