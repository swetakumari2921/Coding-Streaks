package my.strings.practice;

public class Ex86 {

	public static String longestRepeatedSubstring(String str) {

		int n = str.length();
		String[] suffix = new String[n];

		for (int i = 0; i < n; i++) {
			suffix[i] = str.substring(i);
		}

		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - i - 1; j++) {
				if (suffix[j].compareTo(suffix[j + 1]) > 0) {
					String temp = suffix[j];
					suffix[j] = suffix[j + 1];
					suffix[j + 1] = temp;
				}
			}
		}

		String result = "";

		for (int i = 0; i < n - 1; i++) {
			String s1 = suffix[i];
			String s2 = suffix[i + 1];

			int len = Math.min(s1.length(), s2.length());
			int k = 0;

			while (k < len && s1.charAt(k) == s2.charAt(k)) {
				k++;
			}

			if (k > result.length()) {
				result = s1.substring(0, k);
			}
		}

		return result;
	}

	public static void main(String[] args) {
		String str = "banana";
		System.out.println("Longest Repeated Substring: " + longestRepeatedSubstring(str));
	}
}