package my.strings.practice;

public class Ex180 {
	public static String smallestPattern(String str) {
		int n = str.length();

		for (int len = 1; len <= n; len++) {
			if (n % len != 0) {
				continue;
			}

			String pattern = str.substring(0, len);
			boolean valid = true;

			for (int i = 0; i < n; i += len) {
				if (!str.substring(i, i + len).equals(pattern)) {
					valid = false;
					break;
				}
			}

			if (valid) {
				return pattern;
			}
		}

		return str;
	}

	public static void main(String[] args) {
		String str = "abcabcabcabc";
		System.out.println(smallestPattern(str));
	}
}
